package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public abstract class h implements Parcelable {
    private final String a;

    public static abstract class a<M extends h, B extends a> {
        private String a;

        public B b(String str) {
            this.a = str;
            return this;
        }
    }

    protected h(a aVar) {
        this.a = aVar.a;
    }

    public String a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }

    h(Parcel parcel) {
        this.a = parcel.readString();
    }
}
