package cc.majhirockzz.provenance;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.TextView;

import cc.majhirockzz.provenance.Adapter.ImageAdapter;
import cc.majhirockzz.provenance.Adapter.TeamAdapter;


public class Team extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    Toolbar toolbar;

    GridView gridView;

    static final String[] TEAM = new String[]{
            "Mukesh",
            "Nafees",
            "Anup",
            "Rohit",
            "Sumit",
            "Sumesh",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);

        toolbar = findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);

        bottomNavigationView = findViewById(R.id.bottomNavigation_id);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);

        // Ensure correct menu item is selected (where the magic happens)
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(3);
        menuItem.setChecked(true);

        gridView = (GridView) findViewById(R.id.gridView1);


        gridView.setAdapter(new TeamAdapter(this, TEAM));

    }

    // Remove inter-activity transition to avoid screen tossing on tapping bottom navigation items
    @Override
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        switch (id) {

            case R.id.home_id:
                Intent team = new Intent(Team.this, MainActivity.class);
                startActivity(team);
                return true;

            case R.id.events_id:
                Intent event = new Intent(Team.this, Events.class);
                startActivity(event);
                return true;

            case R.id.sponsorship_id:
                Intent sponsorship = new Intent(Team.this, Sponsorship.class);
                startActivity(sponsorship);
                return true;

            case R.id.team_id:
                return true;

            case R.id.profile_id:
                Intent profile = new Intent(Team.this, Profile.class);
                startActivity(profile);
                return true;
        }

        return false;

    }


}
