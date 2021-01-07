package com.spotify.music.features.home.common.viewbinder;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.e61;

public class m extends e61.a {
    public static final Parcelable.Creator<m> CREATOR = new a();
    public final Parcelable c;
    public final boolean f;

    static class a implements Parcelable.Creator<m> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public m createFromParcel(Parcel parcel) {
            e61.a createFromParcel = e61.a.CREATOR.createFromParcel(parcel);
            return new m(createFromParcel.a, createFromParcel.b, parcel.readParcelable(m.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public m[] newArray(int i) {
            return new m[i];
        }
    }

    public m(Parcelable parcelable, Parcelable parcelable2, Parcelable parcelable3, boolean z) {
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
