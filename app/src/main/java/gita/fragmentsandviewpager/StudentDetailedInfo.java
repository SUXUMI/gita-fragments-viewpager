package gita.fragmentsandviewpager;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by alex on 10/27/2016.
 */

public class StudentDetailedInfo implements Parcelable {
    private String defineStudent;


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.defineStudent);
    }

    public StudentDetailedInfo() {
    }

    protected StudentDetailedInfo(Parcel in) {
        this.defineStudent = in.readString();
    }

    public static final Parcelable.Creator<StudentDetailedInfo> CREATOR = new Parcelable.Creator<StudentDetailedInfo>() {
        @Override
        public StudentDetailedInfo createFromParcel(Parcel source) {
            return new StudentDetailedInfo(source);
        }

        @Override
        public StudentDetailedInfo[] newArray(int size) {
            return new StudentDetailedInfo[size];
        }
    };
}
