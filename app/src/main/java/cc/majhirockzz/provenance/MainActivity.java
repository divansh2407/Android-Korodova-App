package cc.majhirockzz.provenance;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);

        bottomNavigationView = findViewById(R.id.bottomNavigation_id);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);

        // Ensure correct menu item is selected (where the magic happens)
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);

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
                return true;

            case R.id.events_id:
                Intent event = new Intent(MainActivity.this, Events.class);
                startActivity(event);
                return true;

            case R.id.sponsorship_id:
                Intent sponsorship = new Intent(MainActivity.this, Sponsorship.class);
                startActivity(sponsorship);
                return true;

            case R.id.team_id:
                Intent team = new Intent(MainActivity.this, Team.class);
                startActivity(team);
                return true;

            case R.id.profile_id:
                Intent profile = new Intent(MainActivity.this, Profile.class);
                startActivity(profile);
                return true;
        }

        return false;

    }


}