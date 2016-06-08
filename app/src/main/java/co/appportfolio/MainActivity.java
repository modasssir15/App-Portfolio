package co.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by modassirpc on 08-06-2016.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button popularMovies;
    Button stockHawk;
    Button buildBigger;
    Button appMaterial;
    Button goUbiquitious;
    Button capstone;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        popularMovies = (Button) findViewById(R.id.buttonMovies);
        stockHawk = (Button) findViewById(R.id.buttonStock);
        buildBigger = (Button) findViewById(R.id.buttonBigger);
        appMaterial = (Button) findViewById(R.id.buttonMaterial);
        goUbiquitious = (Button) findViewById(R.id.buttonUbiquitious);
        capstone = (Button) findViewById(R.id.buttonCapstone);
        getSupportActionBar().setTitle("My App Portfolio");
        popularMovies.setOnClickListener(this);
        stockHawk.setOnClickListener(this);
        buildBigger.setOnClickListener(this);
        appMaterial.setOnClickListener(this);
        goUbiquitious.setOnClickListener(this);
        capstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonMovies:

                Toast.makeText(getApplicationContext(),"This Button will launch my Popular Movies App",Toast.LENGTH_SHORT).show();
                return;
            case R.id.buttonStock:
                Toast.makeText(getApplicationContext(),"This Button will launch my Stock Hawk App",Toast.LENGTH_SHORT).show();
                return;
            case R.id.buttonBigger:
                Toast.makeText(getApplicationContext(), "This Button will launch my Build It Bigger App", Toast.LENGTH_SHORT).show();
                return;
            case R.id.buttonMaterial:
                Toast.makeText(getApplicationContext(), "This Button will launch my Make App Material App", Toast.LENGTH_SHORT).show();
                return;
            case R.id.buttonUbiquitious:
                Toast.makeText(getApplicationContext(), "This Button will launch my Go Ubiquitous App", Toast.LENGTH_SHORT).show();
                return;
            case R.id.buttonCapstone:
                Toast.makeText(getApplicationContext(), "This Button will launch my Capstone App", Toast.LENGTH_SHORT).show();
                return;




        }
    }
}
