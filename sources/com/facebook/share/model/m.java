package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

public final class m extends n<m, Object> {
    public static final Parcelable.Creator<m> CREATOR = new a();

    static class a implements Parcelable.Creator<m> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public m[] newArray(int i) {
            return new m[i];
        }
    }

    m(Parcel parcel) {
        super(parcel);
    }
}
