package com.google.android.gms.internal.wearable;

import android.os.Parcel;
import android.os.Parcelable;

public class b {
    static {
        b.class.getClassLoader();
    }

    private b() {
    }

    public static <T extends Parcelable> T a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }
}
