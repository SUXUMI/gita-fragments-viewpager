package gita.fragmentsandviewpager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void startFragmentReplaceActivity(View view) {
        startActivity(new Intent(this, FragmentReplaceActivity.class));
    }

    public void startViewPagerActivity(View view) {
        startActivity(new Intent(this, ViewPagerActivity.class));
    }

    public void startScrollViewActivity(View view) {
        startActivity(new Intent(this, ScrollViewActivity.class));
    }
}
