package com.spotify.share.sharedata;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class n extends g {
    public static final Parcelable.Creator<n> CREATOR = new a();

    static class a implements Parcelable.Creator<n> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public n createFromParcel(Parcel parcel) {
            return new n(parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (l8e) parcel.readParcelable(w.class.getClassLoader()), (n8e) parcel.readParcelable(w.class.getClassLoader()), (v) parcel.readParcelable(w.class.getClassLoader()), parcel.readHashMap(w.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public n[] newArray(int i) {
            return new n[i];
        }
    }

    n(String str, String str2, String str3, l8e l8e, n8e n8e, v vVar, Map<String, String> map) {
        super(str, str2, str3, l8e, n8e, vVar, map);
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
        parcel.writeParcelable(b(), i);
        parcel.writeParcelable(h(), i);
        parcel.writeParcelable(c(), i);
        parcel.writeMap(f());
    }
}
