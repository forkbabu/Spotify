package com.spotify.music.lyrics.vocalremoval.model;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class AutoValue_KaraokeVocalVolume extends C$AutoValue_KaraokeVocalVolume {
    public static final Parcelable.Creator<AutoValue_KaraokeVocalVolume> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_KaraokeVocalVolume> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_KaraokeVocalVolume createFromParcel(Parcel parcel) {
            return new AutoValue_KaraokeVocalVolume(Double.valueOf(parcel.readDouble()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_KaraokeVocalVolume[] newArray(int i) {
            return new AutoValue_KaraokeVocalVolume[i];
        }
    }

    AutoValue_KaraokeVocalVolume(Double d) {
        super(d);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(vocalVolume().doubleValue());
    }
}
