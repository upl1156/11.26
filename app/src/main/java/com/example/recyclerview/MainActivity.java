package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String[] namelist = {"Android studio","Babel","bootstrap","c","cplusplus", "Csharp","Css","Gatsby","Github","Html","intellij"};
    String[] deslist = {"Android studio Description","Babel Description",
        "bootstrap Description","C Description","cplusplus Description", "Csharp Description","css Description", "Gatsby Description",
            "Github Description","Html Description","intellij Description" };

    int[] iconlist = {R.drawable.androidstudio,R.drawable.babel, R.drawable.bootstrap,R.drawable.c,R.drawable.cplusplus,R.drawable.csharp, R.drawable.css, R.drawable.gatsby, R.drawable.github,
    R.drawable.html};

    RecyclerView recyclerView;
    Myadapter myadapter;
    RecyclerView.LayoutManager layoutManeger;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.RV_recyclerView);
        recyclerView.setHasFixedSize(true);

        layoutManeger = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManeger);

        myadapter = new Myadapter(this, namelist,deslist,iconlist);
        recyclerView.setAdapter(myadapter);

    }
}