package com.spotify.music.slate.model;

import android.os.Parcel;
import android.os.Parcelable;

public class BackgroundColor implements Parcelable {
    public static final Parcelable.Creator<BackgroundColor> CREATOR = new a();
    private static final Type[] c = Type.values();
    private final int a;
    private final Type b;

    public enum Type {
        HEX,
        DERIVED
    }

    static class a implements Parcelable.Creator<BackgroundColor> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public BackgroundColor createFromParcel(Parcel parcel) {
            return new BackgroundColor(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public BackgroundColor[] newArray(int i) {
            return new BackgroundColor[i];
        }
    }

    public BackgroundColor(int i, Type type) {
        this.a = i;
        this.b = type;
    }

    public int a() {
        return this.a;
    }

    public Type b() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        Type type = this.b;
        parcel.writeInt(type == null ? -1 : type.ordinal());
    }

    protected BackgroundColor(Parcel parcel) {
        Type type;
        this.a = parcel.readInt();
        int readInt = parcel.readInt();
        if (readInt == -1) {
            type = null;
        } else {
            type = c[readInt];
        }
        this.b = type;
    }
}
