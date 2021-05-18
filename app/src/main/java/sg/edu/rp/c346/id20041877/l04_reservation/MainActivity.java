package sg.edu.rp.c346.id20041877.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    EditText edittn;
    EditText editPhone;
    EditText Pax;
    DatePicker dp;
    TimePicker tp;
    Button btnReserve;
    Button btnReset;
    CheckBox checkBoxSmoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittn = findViewById(R.id.editName);
        editPhone = findViewById(R.id.editPhone);
        Pax = findViewById(R.id.editPax);
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnReset = findViewById(R.id.buttonReserve);
        btnReset = findViewById(R.id.buttonReset);
        checkBoxSmoke = findViewById(R.id.checkBoxSmoking);

        dp.updateDate(2021, 5, 21);

        btnReserve.setOnClickListener((v) -> {

                String Name = edittn.getText().toString();
                String EditPhone = editPhone.getText().toString();
                String pax = Pax.getText().toString();

                String smoking = "";
                if (checkBoxSmoke.isChecked()) {
                    smoking = "Smoking Area";
                }
                else {
                    smoking = "Non-Smoking Area";
                }

                String date = dp.getYear() + "/" + (dp.getMonth()+1) + "/" + dp.getDayOfMonth();
                String time = tp.getHour() + ":" + String.format("$02d", tp.getMinute());

                String message = "Hello, " + edittn + ", you have booked for " +
                        pax + " person at a " + smoking + " on " + date + time;
            }
        );


    }
}