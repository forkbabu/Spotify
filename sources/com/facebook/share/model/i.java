package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();
    private final String a;
    private final String b;
    private final Uri c;
    private final h f;
    private final h n;

    static class a implements Parcelable.Creator<i> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public i[] newArray(int i) {
            return new i[i];
        }
    }

    i(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f = (h) parcel.readParcelable(h.class.getClassLoader());
        this.n = (h) parcel.readParcelable(h.class.getClassLoader());
    }

    public h a() {
        return this.n;
    }

    public h b() {
        return this.f;
    }

    public Uri c() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.b;
    }

    public String f() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeParcelable(this.n, i);
    }
}
