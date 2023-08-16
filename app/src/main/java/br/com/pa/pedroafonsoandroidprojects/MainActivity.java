package br.com.pa.pedroafonsoandroidprojects;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recycler_view_projects);

        Project[] projects = {
                new Project("Getting Started App", "The default 'Hello World' app!", R.drawable.getting_started),
                new Project("iQuote", "Making a simple change to the layout, with my own personal motivational quote for software developers", R.drawable.quote),
                new Project("BMI Calculator", "A BMI Calculator, that calculates the Body Mass Index given the mass, height, age and sex", R.drawable.calculator),
                new Project("Inches Converter", "A basic converter to convert inches in meters", R.drawable.tape),
                new Project("The Hungry Developer", "A menu app for a fictional restaurant, to practice Activities, Classes, Arrays, Intents and ListViews", R.drawable.hungry_developer)
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);

        list.setAdapter(adapter);
    }
}