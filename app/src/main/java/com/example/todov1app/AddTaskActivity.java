package com.example.todov1app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.todov1app.databinding.ActivityAddTaskBinding;

public class AddTaskActivity extends AppCompatActivity {

    ActivityAddTaskBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddTaskBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.addNewButton.setOnClickListener(view -> {
            String name = binding.taskNameEditText.getText().toString();
            String desc = binding.taskDescEditText.getText().toString();
            int selected_prio = binding.prioGroup.getCheckedRadioButtonId();
            int prioH_id = binding.priorityHigh.getId();
            int prioM_id = binding.priorityMedium.getId();
            int prioL_id = binding.priorityLow.getId();
            Integer prio = -1;
            if(selected_prio == prioH_id){
                prio = 2;
            } else if (selected_prio == prioM_id){
                prio = 1;
            } else if (selected_prio == prioL_id){
                prio = 0;
            }
            Task task = new Task(name, desc, prio);
            Intent i = new Intent();
            i.putExtra("taskAdded", task);
            setResult(RESULT_OK, i);
            AddTaskActivity.this.finish();
        });
    }
}