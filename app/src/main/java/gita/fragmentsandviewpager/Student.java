package gita.fragmentsandviewpager;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by alex on 10/27/2016.
 */

public class Student implements Parcelable {
    private int age;
    private double point;
    private String name, surname;
    private String school;
    private boolean highSchrool;
    private StudentDetailedInfo studentDetailedInfo;




    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.age);
        dest.writeDouble(this.point);
        dest.writeString(this.name);
        dest.writeString(this.surname);
        dest.writeString(this.school);
        dest.writeByte(this.highSchrool ? (byte) 1 : (byte) 0);
    }

    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public boolean isHighSchrool() {
        return highSchrool;
    }

    public void setHighSchrool(boolean highSchrool) {
        this.highSchrool = highSchrool;
    }

    protected Student(Parcel in) {
        this.age = in.readInt();
        this.point = in.readDouble();
        this.name = in.readString();
        this.surname = in.readString();
        this.school = in.readString();
        this.highSchrool = in.readByte() != 0;
    }

    public static final Parcelable.Creator<Student> CREATOR = new Parcelable.Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel source) {
            return new Student(source);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };
}
