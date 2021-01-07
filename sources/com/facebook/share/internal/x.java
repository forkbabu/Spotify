package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.d;

public class x extends d<x, Object> {
    public static final Parcelable.Creator<x> CREATOR = new a();
    private final String p;
    private final String q;
    private final String r;
    private final String s;
    private final String t;
    private final String u;
    private final String v;

    static class a implements Parcelable.Creator<x> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public x createFromParcel(Parcel parcel) {
            return new x(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public x[] newArray(int i) {
            return new x[i];
        }
    }

    x(Parcel parcel) {
        super(parcel);
        this.p = parcel.readString();
        this.q = parcel.readString();
        this.r = parcel.readString();
        this.s = parcel.readString();
        this.t = parcel.readString();
        this.u = parcel.readString();
        this.v = parcel.readString();
    }

    @Override // com.facebook.share.model.d
    public int describeContents() {
        return 0;
    }

    public String h() {
        return this.q;
    }

    public String i() {
        return this.s;
    }

    public String j() {
        return this.t;
    }

    public String k() {
        return this.r;
    }

    public String l() {
        return this.v;
    }

    public String m() {
        return this.u;
    }

    public String n() {
        return this.p;
    }

    @Override // com.facebook.share.model.d
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeString(this.v);
    }
}
