package com.spotify.music.features.eventshub.model;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class AutoValue_ConcertPartner extends C$AutoValue_ConcertPartner {
    public static final Parcelable.Creator<AutoValue_ConcertPartner> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_ConcertPartner> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ConcertPartner createFromParcel(Parcel parcel) {
            return new AutoValue_ConcertPartner(parcel.readString(), parcel.readString());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ConcertPartner[] newArray(int i) {
            return new AutoValue_ConcertPartner[i];
        }
    }

    AutoValue_ConcertPartner(String str, String str2) {
        super(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getPartnerId());
        parcel.writeString(getConcertId());
    }
}
