package com.example.exercisesports;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.FileUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.fragment.app.FragmentActivity;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.ListRowPresenter;
import androidx.leanback.widget.Presenter;

import com.google.gson.Gson;

import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
 * Main Activity class that loads {@link MainFragment}.
 */
public class MainActivity extends FragmentActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GenerateResults();
    }

    private void GenerateResults() {
        final ListView listview = (ListView) findViewById(R.id.list_view);

        String jsonData = "[\n" +
                "  {\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"Atlético GO\",\n" +
                "    \"strength\": 5,\n" +
                "    \"hash_name\": 0,\n" +
                "    \"image_path\": \"atl_go_45x45\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 2,\n" +
                "    \"name\": \"Atlético MG\",\n" +
                "    \"strength\": 7,\n" +
                "    \"hash_name\": 0,\n" +
                "    \"image_path\": \"atl_mg_45x45\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 3,\n" +
                "    \"name\": \"Bahia\",\n" +
                "    \"strength\": 3,\n" +
                "    \"hash_name\": 0,\n" +
                "    \"image_path\": \"bahia_45x45\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 4,\n" +
                "    \"name\": \"Bahia\",\n" +
                "    \"strength\": 1,\n" +
                "    \"hash_name\": 0,\n" +
                "    \"image_path\": \"botafogo_45x45\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 5,\n" +
                "    \"name\": \"Corinthians\",\n" +
                "    \"strength\": 5,\n" +
                "    \"hash_name\": 0,\n" +
                "    \"image_path\": \"corinthians_45x45\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 6,\n" +
                "    \"name\": \"Curitiba\",\n" +
                "    \"strength\": 2,\n" +
                "    \"hash_name\": 0,\n" +
                "    \"image_path\": \"coritiba_45x45\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 7,\n" +
                "    \"name\": \"Cruzeiro\",\n" +
                "    \"strength\": 8,\n" +
                "    \"hash_name\": 0,\n" +
                "    \"image_path\": \"cruzeiro_45x45\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 8,\n" +
                "    \"name\": \"Figueirense\",\n" +
                "    \"strength\": 6,\n" +
                "    \"hash_name\": 0,\n" +
                "    \"image_path\": \"figueirense_45x45\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 9,\n" +
                "    \"name\": \"Flamengo\",\n" +
                "    \"strength\": 4,\n" +
                "    \"hash_name\": 0,\n" +
                "    \"image_path\": \"flamengo_45x45\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 10,\n" +
                "    \"name\": \"Fluminense\",\n" +
                "    \"strength\": 2,\n" +
                "    \"hash_name\": 0,\n" +
                "    \"image_path\": \"fluminense_45\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 11,\n" +
                "    \"name\": \"Grêmio\",\n" +
                "    \"strength\": 1,\n" +
                "    \"hash_name\": 0,\n" +
                "    \"image_path\": \"gremio_45x45\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 12,\n" +
                "    \"name\": \"Internacional\",\n" +
                "    \"strength\": 6,\n" +
                "    \"hash_name\": 0,\n" +
                "    \"image_path\": \"internacional_45x45\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 13,\n" +
                "    \"name\": \"Náutico\",\n" +
                "    \"strength\": 2,\n" +
                "    \"hash_name\": 0,\n" +
                "    \"image_path\": \"nautico_45\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 14,\n" +
                "    \"name\": \"Palmeiras\",\n" +
                "    \"strength\": 8,\n" +
                "    \"hash_name\": 0,\n" +
                "    \"image_path\": \"palmeiras_45x45\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 15,\n" +
                "    \"name\": \"Ponte Preta\",\n" +
                "    \"strength\": 3,\n" +
                "    \"hash_name\": 0,\n" +
                "    \"image_path\": \"ponte_preta_45\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 16,\n" +
                "    \"name\": \"Portuguesa\",\n" +
                "    \"strength\": 6,\n" +
                "    \"hash_name\": 0,\n" +
                "    \"image_path\": \"portuguesa_sp45\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 17,\n" +
                "    \"name\": \"Santos\",\n" +
                "    \"strength\": 7,\n" +
                "    \"hash_name\": 0,\n" +
                "    \"image_path\": \"santos_45x45\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 18,\n" +
                "    \"name\": \"São Paulo\",\n" +
                "    \"strength\": 3,\n" +
                "    \"hash_name\": 0,\n" +
                "    \"image_path\": \"sao_paulo_45x45\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 19,\n" +
                "    \"name\": \"Sport\",\n" +
                "    \"strength\": 8,\n" +
                "    \"hash_name\": 0,\n" +
                "    \"image_path\": \"sport_45\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 20,\n" +
                "    \"name\": \"Vasco\",\n" +
                "    \"strength\": 2,\n" +
                "    \"hash_name\": 0,\n" +
                "    \"image_path\": \"vasco_45x45\"\n" +
                "  }\n" +
                "]\n";

        Time[] data = new Gson().fromJson(jsonData, Time[].class);
        List<Time> listData = Arrays.asList(data);

        Collections.shuffle(listData);

        Random rand = new Random();
        List<ResultGame> resultGames = new ArrayList<>();

        for (int i = 0; i < listData.size(); i = i + 2) {
            listData.get(i).calculateHashName();
            listData.get(i+1).calculateHashName();

            Drawable time1_image = getResources().getDrawable(getResources()
                    .getIdentifier(listData.get(i).getImage_path(), "drawable", getPackageName()));

            Drawable time2_image = getResources().getDrawable(getResources()
                    .getIdentifier(listData.get(i+1).getImage_path(), "drawable", getPackageName()));

            rand.setSeed(listData.get(i).getStrength() * listData.get(i).getHash_name());
            int time1Goals = rand.nextInt(5);

            rand.setSeed(listData.get(i+1).getStrength() * listData.get(i+1).getHash_name());
            int time2Goals = rand.nextInt(5);

            ResultGame result = new ResultGame(listData.get(i), listData.get(i+1), time1_image, time2_image, time1Goals, time2Goals);

            resultGames.add(result);
        }

        listview.setAdapter(new ResultView(this, R.layout.list_item, resultGames));
    }

    public void GenerateNewResults(View view) {
        GenerateResults();
    }

    public void ExitApp(View view) {
        finishAndRemoveTask();
    }
}