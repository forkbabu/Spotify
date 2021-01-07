package com.spotify.voice.results.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.voice.results.model.e;
import java.util.List;

/* access modifiers changed from: package-private */
public final class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new a();

    static class a implements Parcelable.Creator<c> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public c createFromParcel(Parcel parcel) {
            return new c(parcel.readString(), parcel.readArrayList(e.class.getClassLoader()), parcel.readString());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public c[] newArray(int i) {
            return new c[i];
        }
    }

    c(String str, List<e.a> list, String str2) {
        super(str, list, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(f());
        parcel.writeList(c());
        parcel.writeString(e());
    }
}
