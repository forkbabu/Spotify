package com.spotify.music.features.languagepicker.model;

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
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new d(readString, readString2, readString3, z);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public d[] newArray(int i) {
            return new d[i];
        }
    }

    d(String str, String str2, String str3, boolean z) {
        super(str, str2, str3, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(e());
        parcel.writeString(c());
        parcel.writeString(a());
        parcel.writeInt(f() ? 1 : 0);
    }
}
