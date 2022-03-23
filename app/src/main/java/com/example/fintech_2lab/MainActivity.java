package com.example.fintech_2lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    TextView tvResult;
    EditText txtMain;
    Spinner SpOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tvResult = findViewById(R.id.tvResult);
        this.txtMain = findViewById(R.id.txtMain);
        this.SpOptions = findViewById(R.id.SpOtions);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.counting_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.SpOptions.setAdapter(adapter);
    }

    public void onBtnCalculateClick(View view) {
        if (!Objects.equals(this.txtMain.getText().toString(), "")) {
            if (this.SpOptions.getSelectedItem().toString().equalsIgnoreCase("words")) {
                int wordsCount;
                wordsCount = counter.getWordsCount(this.txtMain.getText().toString());
                this.tvResult.setText(Integer.toString(wordsCount));
            }
            else if (this.SpOptions.getSelectedItem().toString().equalsIgnoreCase("chars")) {
                int charsNoSpaceCount;
                charsNoSpaceCount = counter.getCharsNoSpaceCount(this.txtMain.getText().toString());
                String charsCountFormatted = String.valueOf(charsNoSpaceCount);
                this.tvResult.setText(charsCountFormatted);
            }
            else if (this.SpOptions.getSelectedItem().toString().equalsIgnoreCase("words and space")) {
                int wordsCount;
                wordsCount = counter.getWordsCount(this.txtMain.getText().toString());
                String wordsCountFormatted = String.valueOf(wordsCount);
                this.tvResult.setText(wordsCountFormatted);
            }
        }
        else{
            Toast.makeText(this, getString(R.string.NoText), Toast.LENGTH_LONG).show();
    }
}