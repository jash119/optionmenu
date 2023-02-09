package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycle);
        myadapter myadapter = new myadapter(this);
        recyclerView.setAdapter(myadapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);

        if(menu instanceof MenuBuilder){
            MenuBuilder m = (MenuBuilder) menu;
            //noinspection RestrictedApi
            m.setOptionalIconsVisible(true);
        }

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.lh){
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        if(item.getItemId()==R.id.lv){
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        if(item.getItemId()==R.id.gh){
            GridLayoutManager linearLayoutManager = new GridLayoutManager(this,2,RecyclerView.HORIZONTAL,false);
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        if(item.getItemId()==R.id.gv){
            GridLayoutManager linearLayoutManager = new GridLayoutManager(this,2,RecyclerView.VERTICAL,false);
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        if(item.getItemId()==R.id.sh){
            StaggeredGridLayoutManager linearLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.HORIZONTAL);
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        if(item.getItemId()==R.id.sv){
            StaggeredGridLayoutManager linearLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        return super.onOptionsItemSelected(item);
    }
}