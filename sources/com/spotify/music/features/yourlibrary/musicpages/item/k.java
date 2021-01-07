package com.spotify.music.features.yourlibrary.musicpages.item;

import android.os.Parcel;
import android.os.Parcelable;

final class k extends c {
    public static final Parcelable.Creator<k> CREATOR = new a();

    static class a implements Parcelable.Creator<k> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public k createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            boolean z = true;
            boolean z2 = parcel.readInt() == 1;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new k(readString, readString2, readString3, readString4, z2, z, parcel.readString());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public k[] newArray(int i) {
            return new k[i];
        }
    }

    k(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5) {
        super(str, str2, str3, str4, z, z2, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(b());
        parcel.writeString(i());
        parcel.writeString(h());
        parcel.writeString(g());
        parcel.writeInt(c() ? 1 : 0);
        parcel.writeInt(f() ? 1 : 0);
        parcel.writeString(e());
    }
}
