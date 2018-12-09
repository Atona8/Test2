package com.example.libo.mytest2.recyclerview;

import android.app.Activity;
import android.os.Bundle;

import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.libo.mytest2.R;

/**
 * Created by libo on 2017/7/20.
 */

public class RecyclerViewActivity extends Activity implements View.OnClickListener {

    private Button btn_add;
    private Button btn_remove;
    private Button btn_list;
    private Button btn_grid;
    private Button btn_flow;
    private RecyclerView recyclerview;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        btn_add = (Button) findViewById(R.id.btn_add);
        btn_remove = (Button) findViewById(R.id.btn_remove);
        btn_list = (Button) findViewById(R.id.btn_list);
        btn_grid = (Button) findViewById(R.id.btn_grid);
        btn_flow = (Button) findViewById(R.id.btn_flow);
        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
    /**
     * 点击事件
     */
        btn_add.setOnClickListener(this);
        btn_remove.setOnClickListener(this);
        btn_list.setOnClickListener(this);
        btn_grid.setOnClickListener(this);
        btn_flow.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_add:
                break;
            case R.id.btn_remove:
                break;
            case R.id.btn_list:
                break;
            case R.id.btn_grid:
                break;
            case R.id.btn_flow:
                break;
        }
    }
}
