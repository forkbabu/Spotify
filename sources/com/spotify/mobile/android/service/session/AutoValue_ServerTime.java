package com.spotify.mobile.android.service.session;

import android.os.Parcel;
import android.os.Parcelable;

final class AutoValue_ServerTime extends C$AutoValue_ServerTime {
    public static final Parcelable.Creator<AutoValue_ServerTime> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_ServerTime> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ServerTime createFromParcel(Parcel parcel) {
            return new AutoValue_ServerTime(parcel.readLong(), parcel.readLong());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ServerTime[] newArray(int i) {
            return new AutoValue_ServerTime[i];
        }
    }

    AutoValue_ServerTime(long j, long j2) {
        super(j, j2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(currentTimeMillis());
        parcel.writeLong(currentServerTime());
    }
}
