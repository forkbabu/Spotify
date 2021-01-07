package com.spotify.voice.results.model;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class d extends b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    static class a implements Parcelable.Creator<d> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public d createFromParcel(Parcel parcel) {
            return new d(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 1, parcel.readString(), parcel.readInt() == 1, parcel.readInt() == 1);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public d[] newArray(int i) {
            return new d[i];
        }
    }

    d(String str, String str2, String str3, String str4, boolean z, String str5, boolean z2, boolean z3) {
        super(str, str2, str3, str4, z, str5, z2, z3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(j());
        parcel.writeString(e());
        parcel.writeString(h());
        parcel.writeString(g());
        parcel.writeInt(a() ? 1 : 0);
        parcel.writeString(i());
        parcel.writeInt(c() ? 1 : 0);
        parcel.writeInt(f() ? 1 : 0);
    }
}
