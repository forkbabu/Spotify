package com.spotify.music.yourlibrary.interfaces;

import android.os.Parcel;
import android.os.Parcelable;

final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new a();

    static class a implements Parcelable.Creator<b> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            boolean z = false;
            boolean z2 = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            return new b(z2, z, parcel.readInt(), parcel.readInt());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    b(boolean z, boolean z2, int i, int i2) {
        super(z, z2, i, i2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(c() ? 1 : 0);
        parcel.writeInt(b() ? 1 : 0);
        parcel.writeInt(a());
        parcel.writeInt(e());
    }
}
