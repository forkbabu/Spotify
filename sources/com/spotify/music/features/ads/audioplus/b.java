package com.spotify.music.features.ads.audioplus;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new a();

    static class a implements Parcelable.Creator<b> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            boolean z = true;
            boolean z2 = parcel.readInt() == 1;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new b(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, z2, z);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2) {
        super(str, str2, str3, str4, str5, str6, str7, str8, str9, z, z2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(e());
        parcel.writeString(f());
        parcel.writeString(a());
        parcel.writeString(b());
        parcel.writeString(c());
        parcel.writeString(k());
        parcel.writeString(j());
        parcel.writeString(i());
        parcel.writeString(l());
        parcel.writeInt(g() ? 1 : 0);
        parcel.writeInt(h() ? 1 : 0);
    }
}
