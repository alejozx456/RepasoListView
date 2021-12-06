package com.example.repasolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView seleccionar;
    private ListView lista1;
    private String nombres[]={"Samuel","Valentina","Pablo"};
    private String edades[]={"18","25","23"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seleccionar=findViewById(R.id.idTextViewA);
        lista1=findViewById(R.id.idListViewA);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                nombres);
        lista1.setAdapter(adapter);
        lista1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                seleccionar.setText("La edad de "+ lista1.getItemAtPosition(i)+"es "+edades[i]+" anos");
            }
        });

    }

}