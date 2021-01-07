package com.spotify.share.sharedata;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class l extends e {
    public static final Parcelable.Creator<l> CREATOR = new a();

    static class a implements Parcelable.Creator<l> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public l createFromParcel(Parcel parcel) {
            return new l(parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (v) parcel.readParcelable(s.class.getClassLoader()), parcel.readHashMap(s.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public l[] newArray(int i) {
            return new l[i];
        }
    }

    l(String str, String str2, String str3, String str4, v vVar, Map<String, String> map) {
        super(str, str2, str3, str4, vVar, map);
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
        if (k() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(k());
        }
        if (e() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(e());
        }
        parcel.writeParcelable(c(), i);
        parcel.writeMap(f());
    }
}
