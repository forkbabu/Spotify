package com.spotify.music.features.ads.model;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class AutoValue_Image extends C$AutoValue_Image {
    public static final Parcelable.Creator<AutoValue_Image> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_Image> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Image createFromParcel(Parcel parcel) {
            return new AutoValue_Image(parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Image[] newArray(int i) {
            return new AutoValue_Image[i];
        }
    }

    AutoValue_Image(String str) {
        super(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (getUrl() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(getUrl());
    }
}
