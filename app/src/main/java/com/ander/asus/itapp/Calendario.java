package com.ander.asus.itapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;
import android.widget.TextView;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import com.github.sundeepk.compactcalendarview.domain.Event;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Calendario extends AppCompatActivity {
    private TextView tvMes;
    private SimpleDateFormat dateFormatForMonth = new SimpleDateFormat("MMM - yyyy", Locale.getDefault());
    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);


        final CompactCalendarView compactCalendarView= findViewById(R.id.compactcalendar_view_id);
        tvMes= findViewById(R.id.tv_mes_id);
        // metodo para  píntar el primer dia del año
        compactCalendarView.setFirstDayOfWeek(Calendar.MONDAY);

        Event ev1 = new Event(Color.GREEN, 1583790618000L, "Dia del niño.");
        compactCalendarView.addEvent(ev1);

        Event ev2 = new Event(Color.BLUE, 1583617818000L, "Dia de la democrasia.");
        compactCalendarView.addEvent(ev2);

        Event ev3 = new Event(Color. RED, 1583704218000L, "Eleccion del personero.");
        compactCalendarView.addEvent(ev3);

        List<Event> events = compactCalendarView.getEvents(1433701251000L); // can also take a Date object

        // events has size 2 with the 2 events inserted previously
        Log.d(TAG, "MIS NOMBRE  DE MES: " + dateFormatForMonth.format(compactCalendarView.getFirstDayOfCurrentMonth()));
        tvMes.setText(dateFormatForMonth.format(compactCalendarView.getFirstDayOfCurrentMonth()));

        compactCalendarView.setListener(new CompactCalendarView.CompactCalendarViewListener() {
            @Override
            public void onDayClick(Date dateClicked) {
                List<Event> events = compactCalendarView.getEvents(dateClicked);
                Log.d(TAG, "FECHA SELECIONADA: " + dateClicked + " CON EL EVENT0 " + events);
            }

            @Override
            public void onMonthScroll(Date firstDayOfNewMonth) {
                Log.d(TAG, "Month was scrolled to: " + firstDayOfNewMonth);
            }


        });





    }
}
