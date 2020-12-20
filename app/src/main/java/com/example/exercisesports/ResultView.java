package com.example.exercisesports;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ResultView extends ArrayAdapter<ResultGame> {

    private LayoutInflater mInflater;

    private List<ResultGame> resultGames;
    private int resource;


    public ResultView(@NonNull Context context, int resource, List<ResultGame> resultGames) {
        super(context, resource, resultGames);

        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        this.resource = resource;
        this.resultGames = resultGames;

    }

    @Override
    public int getCount() {
        return resultGames.size();
    }

    @Override
    public ResultGame getItem(int position) {
        return resultGames.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = mInflater.inflate(resource, null);

        ImageView time1 = (ImageView) convertView.findViewById(R.id.time1_image);
        time1.setImageDrawable(resultGames.get(position).getTime1_image());

        TextView text = (TextView) convertView.findViewById(R.id.text_view);
        text.setText(resultGames.get(position).getGoalsTime1() + " X " + resultGames.get(position).getGetGoalsTime2());

        ImageView time2 = (ImageView) convertView.findViewById(R.id.time2_image);
        time2.setImageDrawable(resultGames.get(position).getTime2_image());

        return convertView;
    }
}
