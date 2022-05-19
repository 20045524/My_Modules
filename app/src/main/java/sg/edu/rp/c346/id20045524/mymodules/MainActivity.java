package sg.edu.rp.c346.id20045524.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvC322, tvC346, tvC382;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC322 = findViewById(R.id.tvC322);
        tvC346 = findViewById(R.id.tvC346);
        tvC382 = findViewById(R.id.tvC382);

        tvC322.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C322");
                intent.putExtra("ModuleName", "Data Centre and Cloud Mgmt");
                intent.putExtra("AcademicYear", 2022);
                intent.putExtra("Semester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("Venue", "E61H");
                startActivity(intent);
            }
        });

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C346");
                intent.putExtra("ModuleName", "Mobile App Development");
                intent.putExtra("AcademicYear", 2022);
                intent.putExtra("Semester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("Venue", "E62E");
                startActivity(intent);
            }
        });

        tvC382.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , ModuleDetailActivity.class);
                intent.putExtra("ModuleCode", "C382");
                intent.putExtra("ModuleName", "IT Service Delivery");
                intent.putExtra("AcademicYear", 2022);
                intent.putExtra("Semester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("Venue", "E62B");
                startActivity(intent);
            }
        });

    }
}