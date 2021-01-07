package com.spotify.share.sharedata;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class h extends a {
    public static final Parcelable.Creator<h> CREATOR = new a();

    static class a implements Parcelable.Creator<h> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public h createFromParcel(Parcel parcel) {
            return new h(parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (l8e) parcel.readParcelable(o.class.getClassLoader()), (k8e) parcel.readParcelable(o.class.getClassLoader()), (v) parcel.readParcelable(o.class.getClassLoader()), parcel.readHashMap(o.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public h[] newArray(int i) {
            return new h[i];
        }
    }

    h(String str, String str2, String str3, l8e l8e, k8e k8e, v vVar, Map<String, String> map) {
        super(str, str2, str3, l8e, k8e, vVar, map);
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
