package com.jazibkhan.equalizer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class AboutActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Element license = new Element();
        license.setTitle("Open Source Licenses");

        license.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LicensesDialogFragment dialog = LicensesDialogFragment.newInstance();
                dialog.show(getSupportFragmentManager(), "LicensesDialog");

            }
        });

        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setImage(R.mipmap.ic_launcher_round).setDescription("An open source, light weight Equalizer for all devices.").
                addGroup("Connect with us")
                .addEmail("jazib27@hotmail.com")
                .addPlayStore("com.jazibkhan.equalizer")
                .addGitHub("JazibOfficial/Equalizer")
                .addItem(license)
                .create();

        setContentView(aboutPage);
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
