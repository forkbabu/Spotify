package com.spotify.libs.callingcode.json;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new a();

    static class a implements Parcelable.Creator<c> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public c createFromParcel(Parcel parcel) {
            return new c(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public c[] newArray(int i) {
            return new c[i];
        }
    }

    c(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(b());
        parcel.writeString(a());
        parcel.writeString(c());
    }
}
