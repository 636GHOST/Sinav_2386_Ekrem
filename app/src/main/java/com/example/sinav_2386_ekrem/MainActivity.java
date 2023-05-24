package com.example.sinav_2386_ekrem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createDb();
    }
    private void createDb() {
        database = openOrCreateDatabase("Siparis",MODE_PRIVATE,null);
                    String TABLO = "CREATE TABLE IF NOT EXISTS siparisler("+
                "id INTEGER PRIMARY KEY,"+
                "yemek VARCHAR,"+
                "fiyat DOUBLE,"+
                            "adet INTEGER,";
                    "toplam DOUBLE)";
                    database.exexSQL(TABLO)

    }
    public void  btnSoru1Click (View view) {
        Intent intent = new Intent(MainActivity.this, Soru1Activity.class);
        startActivity(intent);
    }
public void btnSoru2Click (View view){
        Intent intent = new Intent(MainActivity.this,Soru2Activity.class);
startActivity(intent);
    }
}
