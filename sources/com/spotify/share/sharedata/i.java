package com.spotify.share.sharedata;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class i extends b {
    public static final Parcelable.Creator<i> CREATOR = new a();

    static class a implements Parcelable.Creator<i> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public i createFromParcel(Parcel parcel) {
            return new i(parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (Bitmap) parcel.readParcelable(p.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, (v) parcel.readParcelable(p.class.getClassLoader()), parcel.readHashMap(p.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public i[] newArray(int i) {
            return new i[i];
        }
    }

    i(String str, String str2, String str3, Bitmap bitmap, String str4, v vVar, Map<String, String> map) {
        super(str, str2, str3, bitmap, str4, vVar, map);
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
        parcel.writeParcelable(h(), i);
        if (k() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(k());
        }
        parcel.writeParcelable(c(), i);
        parcel.writeMap(f());
    }
}
