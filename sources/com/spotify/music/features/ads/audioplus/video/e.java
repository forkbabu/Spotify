package com.spotify.music.features.ads.audioplus.video;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new a();

    static class a implements Parcelable.Creator<e> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public e createFromParcel(Parcel parcel) {
            return new e(parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public e[] newArray(int i) {
            return new e[i];
        }
    }

    e(String str, String str2, int i) {
        super(str, str2, i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(c());
        parcel.writeString(b());
        parcel.writeInt(e());
    }
}
