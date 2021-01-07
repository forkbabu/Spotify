package com.spotify.music.features.ads.sponsorship.model;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class AutoValue_Sponsorship extends C$AutoValue_Sponsorship {
    public static final Parcelable.Creator<AutoValue_Sponsorship> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_Sponsorship> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Sponsorship createFromParcel(Parcel parcel) {
            return new AutoValue_Sponsorship(Long.valueOf(parcel.readLong()), Long.valueOf(parcel.readLong()), parcel.readString());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Sponsorship[] newArray(int i) {
            return new AutoValue_Sponsorship[i];
        }
    }

    AutoValue_Sponsorship(Long l, Long l2, String str) {
        super(l, l2, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(startTime().longValue());
        parcel.writeLong(endTime().longValue());
        parcel.writeString(uri());
    }
}
