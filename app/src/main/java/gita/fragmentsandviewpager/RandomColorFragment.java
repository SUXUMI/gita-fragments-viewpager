package gita.fragmentsandviewpager;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by alex on 10/27/16.
 */

public class RandomColorFragment extends Fragment {

    private TextView studentInfoTV;

    int[] colorIds = {R.color.color1, R.color.color2, R.color.color3, R.color.color4, R.color.color5,
            R.color.color6, R.color.color7, R.color.color8, R.color.color8, R.color.color9,
            R.color.color10, R.color.color11, R.color.color12, R.color.color13, R.color.color14,
            R.color.color15, R.color.color16, R.color.color17, R.color.color18, R.color.color19,
            R.color.color20, R.color.color21, R.color.color22, R.color.color23, R.color.color24,
            R.color.color25, R.color.color26, R.color.color27, R.color.color28, R.color.color29,
            R.color.color30, R.color.color31, R.color.color33};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_random_color, container, false);
        int color = ContextCompat.getColor(getContext(), colorIds[new Random().nextInt(33)]);
        v.findViewById(R.id.background_color).setBackgroundColor(color);

        studentInfoTV = (TextView) v.findViewById(R.id.student_info_text_view);

        return v;
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
    }




    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        if (getArguments() != null) {
            int count = getArguments().getInt("count");
            Toast.makeText(getContext(), "I'm number = " + count, Toast.LENGTH_SHORT).show();

            Student student = getArguments().getParcelable("student");
            String studInfo = student.getAge() + "\n" + student.getPoint() + "\n" + student.getName();

            studentInfoTV.setText(studInfo);
        }
    }
}
