package com.spotify.music.features.creatorartist.model;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class AutoValue_ImageModel extends C$AutoValue_ImageModel {
    public static final Parcelable.Creator<AutoValue_ImageModel> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_ImageModel> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ImageModel createFromParcel(Parcel parcel) {
            return new AutoValue_ImageModel(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ImageModel[] newArray(int i) {
            return new AutoValue_ImageModel[i];
        }
    }

    AutoValue_ImageModel(String str, int i, int i2, String str2) {
        super(str, i, i2, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getUri());
        parcel.writeInt(getWidth());
        parcel.writeInt(getHeight());
        if (getModerationUri() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(getModerationUri());
    }
}
