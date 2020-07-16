package sg.edu.rp.c346.id19020844.employeeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployee;
    ArrayList<EmployeeList> empList;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployee = findViewById(R.id.employeeList);

        empList = new ArrayList<>();

        empList.add(new EmployeeList("John", "Software Technical Leader", 3400.0));
        empList.add(new EmployeeList("Mary", "Programmer", 2200.0));

        adapter = new CustomAdapter(this, R.layout.row, empList);

        lvEmployee.setAdapter(adapter);
    }
}
