package com.spotify.music.features.churnlockedstate;

import android.os.Parcel;
import android.os.Parcelable;

final class p extends a {
    public static final Parcelable.Creator<p> CREATOR = new a();

    static class a implements Parcelable.Creator<p> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public p createFromParcel(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new p(z);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public p[] newArray(int i) {
            return new p[i];
        }
    }

    p(boolean z) {
        super(z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(a() ? 1 : 0);
    }
}
