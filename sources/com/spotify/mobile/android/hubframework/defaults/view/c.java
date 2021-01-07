package com.spotify.mobile.android.hubframework.defaults.view;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.e61;

class c extends e61.a {
    public static final Parcelable.Creator<c> CREATOR = new a();
    public final Parcelable c;
    public final boolean f;

    static class a implements Parcelable.Creator<c> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public c createFromParcel(Parcel parcel) {
            e61.a createFromParcel = e61.a.CREATOR.createFromParcel(parcel);
            return new c(createFromParcel.a, createFromParcel.b, parcel.readParcelable(c.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public c[] newArray(int i) {
            return new c[i];
        }
    }

    public c(Parcelable parcelable, Parcelable parcelable2, Parcelable parcelable3, boolean z) {
        super(parcelable, parcelable2);
        this.c = parcelable3;
        this.f = z;
    }

    @Override // defpackage.e61.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
