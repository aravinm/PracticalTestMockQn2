package com.example.aravin.practicaltestmockqn2;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import static android.R.attr.duration;

public class MainActivity extends AppCompatActivity {
    ArrayAdapter<CharSequence> ad;
    Spinner sp;
    boolean y = true;
    Menu a = null;
    String [] strMode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sp = (Spinner) findViewById(R.id.spinner);
        ad = ArrayAdapter.createFromResource
                (this, R.array.contact, android.R.layout.simple_spinner_dropdown_item);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(ad);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
          if(y != true)
                Toast.makeText(getApplicationContext(), sp.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();

                y = false;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
        this.a = menu;
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
//    public boolean onOptionsItemSelected(MenuItem item){
//
//        if(item.getItemId() == R.id.Login){
//            Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
//        }else if(item.getItemId() == R.id.Register){
//            Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
//        }
//        else if(item.getItemId() == R.id.Hide){
//            this.a.setGroupVisible(R.id.hide, false);
//
//        }
//        else if(item.getItemId() == R.id.Show){
//            this.a.setGroupVisible(R.id.hide, true);
//
//        }
//        else if(item.getItemId() == R.id.ManagePIN){
//            Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
//        }
//        else if(item.getItemId() == R.id.ChangePIN){
//            Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
//        }
//        else if(item.getItemId() == R.id.ForgotPIN){
//            Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
//        }
//        else if(item.getItemId() == R.id.About){
//            Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
//        }
//        else if(item.getItemId() == R.id.Quit){
//            finish();
//            Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
//        }
//        return true;
//    }

}
