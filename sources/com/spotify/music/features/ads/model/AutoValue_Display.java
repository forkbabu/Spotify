package com.spotify.music.features.ads.model;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class AutoValue_Display extends C$AutoValue_Display {
    public static final Parcelable.Creator<AutoValue_Display> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_Display> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Display createFromParcel(Parcel parcel) {
            return new AutoValue_Display(parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Display[] newArray(int i) {
            return new AutoValue_Display[i];
        }
    }

    AutoValue_Display(int i, int i2, String str) {
        super(i, i2, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(getWidth());
        parcel.writeInt(getHeight());
        if (displayMedia() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(displayMedia());
    }
}
