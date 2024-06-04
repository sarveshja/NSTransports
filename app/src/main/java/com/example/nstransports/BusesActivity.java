package com.example.nstransports;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.function.ToDoubleBiFunction;

public class BusesActivity extends AppCompatActivity {

    String[][] req_buses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buses);
        TextView sd1 = (TextView) findViewById(R.id.sd1);
        TextView sd2 = (TextView) findViewById(R.id.sd2);
        TextView sd3 = (TextView) findViewById(R.id.sd3);
        TextView sd4 = (TextView) findViewById(R.id.sd4);
        TextView sd5 = (TextView) findViewById(R.id.sd5);

        TextView time1 = (TextView) findViewById(R.id.time1);
        TextView time2 = (TextView) findViewById(R.id.time2);
        TextView time3 = (TextView) findViewById(R.id.time3);
        TextView time4 = (TextView) findViewById(R.id.time4);
        TextView time5 = (TextView) findViewById(R.id.time5);

        TextView type1 = (TextView) findViewById(R.id.type1);
        TextView type2 = (TextView) findViewById(R.id.type2);
        TextView type3 = (TextView) findViewById(R.id.type3);
        TextView type4 = (TextView) findViewById(R.id.type4);
        TextView type5 = (TextView) findViewById(R.id.type5);

        TextView price1 = (TextView) findViewById(R.id.price1);
        TextView price2 = (TextView) findViewById(R.id.price2);
        TextView price3 = (TextView) findViewById(R.id.price3);
        TextView price4 = (TextView) findViewById(R.id.price4);
        TextView price5 = (TextView) findViewById(R.id.price5);

        TextView seat1 = (TextView) findViewById(R.id.seat1);
        TextView seat2 = (TextView) findViewById(R.id.seat2);
        TextView seat3 = (TextView) findViewById(R.id.seat3);
        TextView seat4 = (TextView) findViewById(R.id.seat4);
        TextView seat5 = (TextView) findViewById(R.id.seat5);
        req_buses = new String[5][8];
        String source = DBConnection.getValue(this,"source");
        String destination = DBConnection.getValue(this,"destination");
        int index = 0;
        for(int i = 0;i< BusDetails.buses.length;i++){
            if((source.equals(BusDetails.buses[i][0]))&& (destination.equals(BusDetails.buses[i][1]))){
                req_buses[index][0] = BusDetails.buses[i][0];
                req_buses[index][1] = BusDetails.buses[i][1];
                req_buses[index][2] = BusDetails.buses[i][2];
                req_buses[index][3] = BusDetails.buses[i][3];
                req_buses[index][4] = BusDetails.buses[i][4];
                req_buses[index][5] = BusDetails.buses[i][5];
                req_buses[index][6] = BusDetails.buses[i][6];
                req_buses[index][7] = BusDetails.buses[i][7];
                index++;
            }
        }

        sd1.setText(req_buses[0][0]+" - "+req_buses[0][1]);
        sd2.setText(req_buses[1][0]+" - "+req_buses[1][1]);
        sd3.setText(req_buses[2][0]+" - "+req_buses[2][1]);
        sd4.setText(req_buses[3][0]+" - "+req_buses[3][1]);
        sd5.setText(req_buses[4][0]+" - "+req_buses[4][1]);

        time1.setText(req_buses[0][6]);
        time2.setText(req_buses[1][6]);
        time3.setText(req_buses[2][6]);
        time4.setText(req_buses[3][6]);
        time5.setText(req_buses[4][6]);

        type1.setText(req_buses[0][3]+" "+req_buses[0][4]);
        type2.setText(req_buses[1][3]+" "+req_buses[1][4]);
        type3.setText(req_buses[2][3]+" "+req_buses[2][4]);
        type4.setText(req_buses[3][3]+" "+req_buses[3][4]);
        type5.setText(req_buses[4][3]+" "+req_buses[4][4]);

        price1.setText("Rs."+req_buses[0][7]);
        price2.setText("Rs."+req_buses[1][7]);
        price3.setText("Rs."+req_buses[2][7]);
        price4.setText("Rs."+req_buses[3][7]);
        price5.setText("Rs."+req_buses[4][7]);

        seat1.setText(req_buses[0][5]);
        seat2.setText(req_buses[1][5]);
        seat3.setText(req_buses[2][5]);
        seat4.setText(req_buses[3][5]);
        seat5.setText(req_buses[4][5]);




    }

    public void book1(View v){
        for(int i = 0;i<BusDetails.buses.length;i++){
            if(req_buses[0][2].equals(BusDetails.buses[i][2])){
                int seat = Integer.parseInt(BusDetails.buses[i][5]);
                seat -= 1;
                BusDetails.buses[i][5] = Integer.toString(seat);
                Toast.makeText(this, "Ticket has been booked", Toast.LENGTH_SHORT).show();
                Toast.makeText(this, "Ticket Booked", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void book2(View v){
        for(int i = 0;i<BusDetails.buses.length;i++){
            if(req_buses[2][2].equals(BusDetails.buses[i][2])){
                int seat = Integer.parseInt(BusDetails.buses[i][5]);
                seat -= 1;
                BusDetails.buses[i][5] = Integer.toString(seat);
                Toast.makeText(this, "Ticket has been booked", Toast.LENGTH_SHORT).show();
                Toast.makeText(this, "Ticket Booked", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void book3(View v){
        for(int i = 0;i<BusDetails.buses.length;i++){
            if(req_buses[3][2].equals(BusDetails.buses[i][2])){
                int seat = Integer.parseInt(BusDetails.buses[i][5]);
                seat -= 1;
                BusDetails.buses[i][5] = Integer.toString(seat);
                Toast.makeText(this, "Ticket has been booked", Toast.LENGTH_SHORT).show();
                Toast.makeText(this, "Ticket Booked", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void book4(View v){
        for(int i = 0;i<BusDetails.buses.length;i++){
            if(req_buses[4][2].equals(BusDetails.buses[i][2])){
                int seat = Integer.parseInt(BusDetails.buses[i][5]);
                seat -= 1;
                BusDetails.buses[i][5] = Integer.toString(seat);
                Toast.makeText(this, "Ticket has been booked", Toast.LENGTH_SHORT).show();
                Toast.makeText(this, "Ticket Booked", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void book5(View v){
        for(int i = 0;i<BusDetails.buses.length;i++){
            if(req_buses[5][2].equals(BusDetails.buses[i][2])){
                int seat = Integer.parseInt(BusDetails.buses[i][5]);
                seat -= 1;
                BusDetails.buses[i][5] = Integer.toString(seat);
                Toast.makeText(this, "Ticket has been booked", Toast.LENGTH_SHORT).show();
                Toast.makeText(this, "Ticket Booked", Toast.LENGTH_SHORT).show();
            }
        }
    }
}