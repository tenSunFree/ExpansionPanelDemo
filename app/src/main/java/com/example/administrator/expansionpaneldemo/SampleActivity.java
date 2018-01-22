package com.example.administrator.expansionpaneldemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

import com.github.florent37.expansionpanel.ExpansionHeader;
import com.github.florent37.expansionpanel.ExpansionLayout;

public class SampleActivity extends AppCompatActivity {

    ExpansionHeader dynamicLayoutExpansionHeader2;
    ExpansionHeader dynamicLayoutExpansionHeader3;
    ExpansionHeader dynamicLayoutExpansionHeader4;
    ExpansionHeader dynamicLayoutExpansionHeader5;
    ExpansionHeader dynamicLayoutExpansionHeader6;
    ExpansionHeader dynamicLayoutExpansionHeader7;
    ExpansionHeader dynamicLayoutExpansionHeader8;

    RelativeLayout expansionLayoutRelativeLayout;
    RelativeLayout expansionLayoutRelativeLayout2;
    RelativeLayout expansionLayoutRelativeLayout3;

    ExpansionLayout expansionLayout;
    ExpansionLayout expansionLayout2;
    ExpansionLayout expansionLayout3;
    ExpansionLayout expansionLayout4;
    ExpansionLayout expansionLayout5;
    ExpansionLayout expansionLayout6;
    ExpansionLayout expansionLayout7;
    ExpansionLayout expansionLayout8;
    ExpansionLayout expansionLayout9;
    ExpansionLayout expansionLayout10;

    boolean isClick = false;
    boolean isClick2 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_main);

        dynamicLayoutExpansionHeader2 = findViewById(R.id.dynamicLayoutExpansionHeader2);
        dynamicLayoutExpansionHeader3 = findViewById(R.id.dynamicLayoutExpansionHeader3);
        expansionLayout = findViewById(R.id.expansionLayout);
        expansionLayout2 = findViewById(R.id.expansionLayout2);
        expansionLayout3 = findViewById(R.id.expansionLayout3);
        expansionLayoutRelativeLayout = findViewById(R.id.expansionLayoutRelativeLayout);
        expansionLayoutRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isClick == false) {
                    dynamicLayoutExpansionHeader2.setVisibility(View.VISIBLE);
                    dynamicLayoutExpansionHeader3.setVisibility(View.VISIBLE);
                    expansionLayout.expand(true);
                    isClick = true;
                } else {
                    dynamicLayoutExpansionHeader2.setVisibility(View.GONE);
                    dynamicLayoutExpansionHeader3.setVisibility(View.GONE);
                    expansionLayout.collapse(false);
                    expansionLayout2.collapse(false);
                    expansionLayout3.collapse(false);
                    isClick = false;
                }
            }
        });

        dynamicLayoutExpansionHeader4 = findViewById(R.id.dynamicLayoutExpansionHeader4);
        dynamicLayoutExpansionHeader5 = findViewById(R.id.dynamicLayoutExpansionHeader5);
        dynamicLayoutExpansionHeader6 = findViewById(R.id.dynamicLayoutExpansionHeader6);
        expansionLayout4 = findViewById(R.id.expansionLayout4);
        expansionLayout5 = findViewById(R.id.expansionLayout5);
        expansionLayout6 = findViewById(R.id.expansionLayout6);
        expansionLayout7 = findViewById(R.id.expansionLayout7);
        expansionLayoutRelativeLayout2 = findViewById(R.id.expansionLayoutRelativeLayout2);
        expansionLayoutRelativeLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isClick2 == false) {
                    dynamicLayoutExpansionHeader4.setVisibility(View.VISIBLE);
                    dynamicLayoutExpansionHeader5.setVisibility(View.VISIBLE);
                    dynamicLayoutExpansionHeader6.setVisibility(View.VISIBLE);
                    expansionLayout4.expand(true);
                    isClick2 = true;
                } else {
                    dynamicLayoutExpansionHeader4.setVisibility(View.GONE);
                    dynamicLayoutExpansionHeader5.setVisibility(View.GONE);
                    dynamicLayoutExpansionHeader6.setVisibility(View.GONE);
                    expansionLayout4.collapse(false);
                    expansionLayout5.collapse(false);
                    expansionLayout6.collapse(false);
                    expansionLayout7.collapse(false);
                    isClick2 = false;
                }
            }
        });

        dynamicLayoutExpansionHeader7 = findViewById(R.id.dynamicLayoutExpansionHeader7);
        dynamicLayoutExpansionHeader8 = findViewById(R.id.dynamicLayoutExpansionHeader8);
        expansionLayout8 = findViewById(R.id.expansionLayout8);
        expansionLayout9 = findViewById(R.id.expansionLayout9);
        expansionLayout10 = findViewById(R.id.expansionLayout10);
        expansionLayoutRelativeLayout3 = findViewById(R.id.expansionLayoutRelativeLayout3);
        expansionLayoutRelativeLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isClick == false) {
                    dynamicLayoutExpansionHeader7.setVisibility(View.VISIBLE);
                    dynamicLayoutExpansionHeader8.setVisibility(View.VISIBLE);
                    expansionLayout10.expand(true);
                    isClick = true;
                } else {
                    dynamicLayoutExpansionHeader7.setVisibility(View.GONE);
                    dynamicLayoutExpansionHeader8.setVisibility(View.GONE);
                    expansionLayout8.collapse(false);
                    expansionLayout9.collapse(false);
                    expansionLayout10.collapse(false);
                    isClick = false;
                }
            }
        });
    }
}