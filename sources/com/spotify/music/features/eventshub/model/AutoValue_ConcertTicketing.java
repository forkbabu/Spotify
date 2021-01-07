package com.spotify.music.features.eventshub.model;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class AutoValue_ConcertTicketing extends C$AutoValue_ConcertTicketing {
    public static final Parcelable.Creator<AutoValue_ConcertTicketing> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_ConcertTicketing> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ConcertTicketing createFromParcel(Parcel parcel) {
            String str = null;
            String readString = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 0) {
                str = parcel.readString();
            }
            return new AutoValue_ConcertTicketing(readString, str);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ConcertTicketing[] newArray(int i) {
            return new AutoValue_ConcertTicketing[i];
        }
    }

    AutoValue_ConcertTicketing(String str, String str2) {
        super(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (getMinPrice() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getMinPrice());
        }
        if (getMaxPrice() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(getMaxPrice());
    }
}
