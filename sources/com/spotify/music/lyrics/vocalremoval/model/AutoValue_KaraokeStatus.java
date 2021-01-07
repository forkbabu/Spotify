package com.spotify.music.lyrics.vocalremoval.model;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class AutoValue_KaraokeStatus extends C$AutoValue_KaraokeStatus {
    public static final Parcelable.Creator<AutoValue_KaraokeStatus> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_KaraokeStatus> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_KaraokeStatus createFromParcel(Parcel parcel) {
            return new AutoValue_KaraokeStatus(parcel.readString());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_KaraokeStatus[] newArray(int i) {
            return new AutoValue_KaraokeStatus[i];
        }
    }

    AutoValue_KaraokeStatus(String str) {
        super(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(status());
    }
}
