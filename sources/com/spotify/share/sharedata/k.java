package com.spotify.share.sharedata;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

final class k extends d {
    public static final Parcelable.Creator<k> CREATOR = new a();

    static class a implements Parcelable.Creator<k> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public k createFromParcel(Parcel parcel) {
            return new k(parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readHashMap(r.class.getClassLoader()), (v) parcel.readParcelable(r.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public k[] newArray(int i) {
            return new k[i];
        }
    }

    k(String str, String str2, String str3, Map<String, String> map, v vVar) {
        super(str, str2, str3, map, vVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(g());
        if (a() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(a());
        }
        if (e() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(e());
        }
        parcel.writeMap(f());
        parcel.writeParcelable(c(), i);
    }
}
