package sg.edu.rp.c346.id20045524.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView tvModuleCode, tvModuleName, tvAcademicYear, tvSemester, tvModuleCredit, tvVenue;
    Button btnBack;
    ImageView imgDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvModuleCode = findViewById(R.id.tvModuleCode);
        tvModuleName = findViewById(R.id.tvModuleName);
        tvAcademicYear = findViewById(R.id.tvAcademicYear);
        tvSemester = findViewById(R.id.tvSemester);
        tvModuleCredit = findViewById(R.id.tvModuleCredit);
        tvVenue = findViewById(R.id.tvVenue);

        btnBack = findViewById(R.id.btnBack);

        imgDisplay = findViewById(R.id.imgDisplay);


        Intent intentReceived = getIntent();

        String moduleCode = intentReceived.getStringExtra("ModuleCode");
        String moduleName = intentReceived.getStringExtra("ModuleName");
        int academicYear = intentReceived.getIntExtra("AcademicYear", 0);
        int semester = intentReceived.getIntExtra("Semester", 0);
        int moduleCredit = intentReceived.getIntExtra("ModuleCredit", 0);
        String venue = intentReceived.getStringExtra("Venue");

        tvModuleCode.setText("Module Code: " + moduleCode);
        tvModuleName.setText("Module Name: " + moduleName);
        tvAcademicYear.setText("Academic Year: " + academicYear);
        tvSemester.setText("Semester: " + semester);
        tvModuleCredit.setText("Module Credit: " + moduleCredit);
        tvVenue.setText("Venue: " + venue);

        if (moduleCode.equals("C322")){
            imgDisplay.setImageResource(R.drawable.p05_database);
        } else if (moduleCode.equals("C346")) {
            imgDisplay.setImageResource(R.drawable.p05_android);
        } else if (moduleCode.equals("C382")) {
            imgDisplay.setImageResource(R.drawable.p05_servicedelivery);
        }

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}