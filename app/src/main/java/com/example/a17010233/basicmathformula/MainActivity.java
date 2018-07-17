package com.example.a17010233.basicmathformula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvFormula;

    ArrayList<FormulaName> alFormulaList;

    CustomAdapter caFormula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvFormula = findViewById(R.id.listViewName);

        alFormulaList = new ArrayList<>();

        FormulaName for1 = new FormulaName("Area of rectangle", "Length x length", "Formula type is: Area");
        FormulaName for2 = new FormulaName("Area of triangle", "(Length of base x Length) / 2", "Formula type is: Area");
        FormulaName for3 = new FormulaName("Volume of cube", "Length x Length x Length", "Formula type is: Volume");

        alFormulaList.add(for1);
        alFormulaList.add(for2);
        alFormulaList.add(for3);

        caFormula = new CustomAdapter(this, R.layout.formula_name, alFormulaList);

        lvFormula.setAdapter(caFormula);



    }
}
