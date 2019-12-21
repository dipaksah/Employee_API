package com.dipak.employeeapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EmployeeActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnEmployee,btnRegister,btnSearch,btnUpdatedelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);

        btnEmployee=findViewById(R.id.btnemployee);
        btnRegister=findViewById(R.id.btnregister);
        btnSearch=findViewById(R.id.btnsearch);
        btnUpdatedelete=findViewById(R.id.btnupdtdel);

        btnEmployee.setOnClickListener(this);
        btnSearch.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
        btnUpdatedelete.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnemployee:{
                Intent intent=new Intent(EmployeeActivity.this,EmployeeDisplayActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btnsearch:{
                Intent intent=new Intent(EmployeeActivity.this,SearchEmployeeActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btnregister:{
                Intent intent=new Intent(EmployeeActivity.this,EmployeeRegisterActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btnupdtdel:{
                Intent intent=new Intent(EmployeeActivity.this,UpdateDeleteEmployeeActivity.class);
                startActivity(intent);
                break;
            }
        }

    }
}
