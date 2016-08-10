package com.myapplicationcollections;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String mMessage = " message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToastPopularMovie(View view) {
        showToast(makeMessage(getString(R.string.popular_movies)));
    }

    public void showToastStockHawk(View view) {
        showToast(makeMessage(getString(R.string.stock_hawk)));
    }

    public void showToastBuildBigger(View view) {
        showToast(makeMessage(getString(R.string.build_bigger)));
    }

    public void showToastMakeMaterial(View view) {
        showToast(makeMessage(getString(R.string.make_material)));
    }

    public void showToastGoUbiquitous(View view) {
        showToast(makeMessage(getString(R.string.go_ubiquitous)));
    }

    public void showToastCapstone(View view) {
        showToast(makeMessage(getString(R.string.capstone)));
    }

    public String makeMessage(String message) {
        return message + mMessage;
    }

    public void showToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
