package com.spotify.music.slate.model;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class k extends e {
    public static final Parcelable.Creator<k> CREATOR = new a();

    static class a implements Parcelable.Creator<k> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public k createFromParcel(Parcel parcel) {
            return new k((i3d) parcel.readParcelable(t.class.getClassLoader()), (u) parcel.readParcelable(t.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public k[] newArray(int i) {
            return new k[i];
        }
    }

    k(i3d i3d, u uVar) {
        super(i3d, uVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(a(), i);
        parcel.writeParcelable(c(), i);
    }
}
