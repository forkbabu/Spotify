package com.spotify.share.sharedata;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class j extends c {
    public static final Parcelable.Creator<j> CREATOR = new a();

    static class a implements Parcelable.Creator<j> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public j createFromParcel(Parcel parcel) {
            return new j(parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (l8e) parcel.readParcelable(q.class.getClassLoader()), (l8e) parcel.readParcelable(q.class.getClassLoader()), (v) parcel.readParcelable(q.class.getClassLoader()), parcel.readHashMap(q.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public j[] newArray(int i) {
            return new j[i];
        }
    }

    j(String str, String str2, String str3, l8e l8e, l8e l8e2, v vVar, Map<String, String> map) {
        super(str, str2, str3, l8e, l8e2, vVar, map);
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
