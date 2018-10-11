package com.example.shara.anilcalendar;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button editevnt = (Button) findViewById(R.id.event_edit_button);
     /*   Log.v("MainActivity","Add Chocolate ?"+haschocolate);
        EditText edittext = (EditText) findViewById(R.id.edit_text);
        Editable Name =edittext.getText();
        int price=calculatePrice(hasWhippedCream,haschocolate);
        String priceMessage = createOrderSummary(Name,price,hasWhippedCream,haschocolate);*/
        editevnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_SUBJECT, "Events " );
                // intent.putExtra(Intent.EXTRA_TEXT,priceMessage);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }


            }
        });

    }
}

