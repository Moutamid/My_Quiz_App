package com.moutamid.my_quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Starting_Activity extends AppCompatActivity {

    Button btn_start;
    TextView privacy_policy;
    Button thumbs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);

        btn_start = findViewById(R.id.btn_start);
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Starting_Activity.this , MainActivity.class);
                startActivity(intent);
            }
        });

        privacy_policy = findViewById(R.id.privacy_policy);
        thumbs = findViewById(R.id.btn_thumbs);

        privacy_policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://app.getterms.io/view/SPfNE/privacy/en-us"));
                startActivity(browserIntent);
            }
        });

        thumbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Starting_Activity.this , DonateActivity.class);
                startActivity(intent);
            }
        });
    }
}