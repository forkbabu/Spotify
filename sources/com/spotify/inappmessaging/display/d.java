package com.spotify.inappmessaging.display;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new a();

    static class a implements Parcelable.Creator<d> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public d createFromParcel(Parcel parcel) {
            return new d(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public d[] newArray(int i) {
            return new d[i];
        }
    }

    d(float f, float f2, float f3, float f4) {
        super(f, f2, f3, f4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(c());
        parcel.writeFloat(e());
        parcel.writeFloat(a());
        parcel.writeFloat(b());
    }
}
