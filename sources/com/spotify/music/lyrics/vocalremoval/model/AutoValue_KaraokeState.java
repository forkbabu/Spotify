package com.spotify.music.lyrics.vocalremoval.model;

import android.os.Parcel;
import android.os.Parcelable;

final class AutoValue_KaraokeState extends C$AutoValue_KaraokeState {
    public static final Parcelable.Creator<AutoValue_KaraokeState> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_KaraokeState> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_KaraokeState createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer num = null;
            String readString3 = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new AutoValue_KaraokeState(readString, readString2, readString3, num);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_KaraokeState[] newArray(int i) {
            return new AutoValue_KaraokeState[i];
        }
    }

    AutoValue_KaraokeState(String str, String str2, String str3, Integer num) {
        super(str, str2, str3, num);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(trackUri());
        parcel.writeString(eventId());
        if (errorMessage() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(errorMessage());
        }
        if (errorCode() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeInt(errorCode().intValue());
    }
}
