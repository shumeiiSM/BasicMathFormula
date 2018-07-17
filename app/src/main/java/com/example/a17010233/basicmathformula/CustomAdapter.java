package com.example.a17010233.basicmathformula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 17010233 on 17/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<FormulaName> formulaList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<FormulaName> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        formulaList = objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvDate = rowView.findViewById(R.id.textViewFor);
        TextView tvArea = rowView.findViewById(R.id.textViewArea);

        FormulaName currentItem = formulaList.get(position);

        String name = currentItem.getName();
        String date = currentItem.getForumla();
        String area = currentItem.getArea();
        tvName.setText(name);
        tvDate.setText(date);
        tvArea.setText(area);

        return rowView;
    }


}
