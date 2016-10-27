package gita.fragmentsandviewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by alex on 10/27/16.
 */

public class FragmentReplaceActivity extends AppCompatActivity {

    private FragmentManager fm;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        overridePendingTransition(R.anim.activity_open_translate, R.anim.activity_close_scale);

        setContentView(R.layout.activity_fragment_replace);
        fm = getSupportFragmentManager();

        addFragment(new RandomColorFragment(), false, false);
    }

    public void addFragment(Fragment fragment, boolean addToStack, boolean animate) {
        FragmentTransaction ft = fm.beginTransaction();
        if (animate)
            ft.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
        ft.replace(R.id.fragment_container, fragment);
        if (addToStack)
            ft.addToBackStack("");
        ft.commit();
    }

    int count = 0;

    public void addNewFragment(View view) {
        RandomColorFragment randomColorFragment = new RandomColorFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("count", ++count);

        Student student = new Student();
        student.setAge(18);
        student.setName("Akaki");
        student.setSurname("Gociridze");
        student.setSchool("51 Schrool");
        student.setHighSchrool(true);
        bundle.putParcelable("student", student);

        randomColorFragment.setArguments(bundle);
        addFragment(randomColorFragment, true, true);
    }

    @Override
    protected void onPause() {
        super.onPause();
        overridePendingTransition(R.anim.activity_open_scale, R.anim.activity_close_translate);
    }
}
