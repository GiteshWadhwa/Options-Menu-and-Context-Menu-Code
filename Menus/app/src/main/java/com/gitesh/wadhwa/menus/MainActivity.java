package com.gitesh.wadhwa.menus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

          EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText)findViewById(R.id.edit1);
        e2=(EditText)findViewById(R.id.edit2);
        registerForContextMenu(e1);
        registerForContextMenu(e2);
    }
    /*first option_menu*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.option_menu,menu);
                return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        switch (item.getItemId()){
            case R.id.m1:
                Toast.makeText(this,"You clicked Settings",Toast.LENGTH_SHORT).show();
                break;
            case R.id.m2:
                Toast.makeText(this,"You clicked Settings",Toast.LENGTH_SHORT).show();
                break;
            case R.id.m3:
                Toast.makeText(this,"You clicked Status",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,ContextMenu.ContextMenuInfo menuInfo) {
        switch (v.getId()) {
            case R.id.edit1:
                getMenuInflater().inflate(R.menu.edit1_menu, menu);
                break;
            case R.id.edit2:
                getMenuInflater().inflate(R.menu.edit2_menu, menu);
                break;
        }
    }
       @Override
               public boolean onContextItemSelected(MenuItem item){
             switch(item.getItemId()){
                 case R.id.i1:
                     Toast.makeText(this,"Clicked Item1",Toast.LENGTH_SHORT).show();
                     break;
                 case R.id.i2:
                     Toast.makeText(this,"Clicked Item2",Toast.LENGTH_SHORT).show();
                     break;
                 case R.id.s1:
                     Toast.makeText(this,"Clicked One",Toast.LENGTH_SHORT).show();
                     break;
                 case R.id.s2:
                     Toast.makeText(this,"Clicked Two",Toast.LENGTH_SHORT).show();
                     break;
             }
           return true;
        }
    }