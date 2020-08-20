package com.e.colddrinkdispenser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView currentDrink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currentDrink = findViewById(R.id.textCurrentDrink);
    }
    public void onClickCoke(View view){
        currentDrink.setText("COKE SELECTED!");
    }
    public void onClickPepsi(View view){
        currentDrink.setText("PEPSI SELECTED!");
    }
    public void onClickFizz(View view){
        currentDrink.setText("APPY FIZZ SELECTED!");
    }
}