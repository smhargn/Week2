package msku.ceng.madlab.week2;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {

    final List<Animal> animals = new ArrayList<>(); // Add semicolon here

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_custom_adapter);

        animals.add(new Animal("Dog", R.mipmap.dog)); // Ensure double quotes and correct mipmap
        animals.add(new Animal("Dog", R.mipmap.dog)); // Ensure double quotes and correct mipmap
        animals.add(new Animal("Dog", R.mipmap.dog)); // Ensure double quotes and correct mipmap
        animals.add(new Animal("Dog", R.mipmap.dog)); // Ensure double quotes and correct mipmap


        final ListView listView = (ListView) findViewById(R.id.listview);
        AnimalAdapter adapter = new AnimalAdapter(this, animals);
        listView.setAdapter(adapter);
    }

}
