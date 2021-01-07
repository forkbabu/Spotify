package com.spotify.music.features.eventshub.model;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class AutoValue_ConcertResult extends C$AutoValue_ConcertResult {
    public static final Parcelable.Creator<AutoValue_ConcertResult> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_ConcertResult> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ConcertResult createFromParcel(Parcel parcel) {
            Boolean bool;
            Boolean bool2;
            Concert concert = (Concert) parcel.readParcelable(ConcertResult.class.getClassLoader());
            String readString = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString2 = parcel.readInt() == 0 ? parcel.readString() : null;
            boolean z = false;
            if (parcel.readInt() == 0) {
                bool = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool = null;
            }
            if (parcel.readInt() == 0) {
                if (parcel.readInt() == 1) {
                    z = true;
                }
                bool2 = Boolean.valueOf(z);
            } else {
                bool2 = null;
            }
            return new AutoValue_ConcertResult(concert, readString, readString2, bool, bool2);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ConcertResult[] newArray(int i) {
            return new AutoValue_ConcertResult[i];
        }
    }

    AutoValue_ConcertResult(Concert concert, String str, String str2, Boolean bool, Boolean bool2) {
        super(concert, str, str2, bool, bool2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getConcert(), i);
        if (getClickThroughUrl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getClickThroughUrl());
        }
        if (getSource() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getSource());
        }
        if (getNearUser() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getNearUser().booleanValue() ? 1 : 0);
        }
        if (getDiscovery() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeInt(getDiscovery().booleanValue() ? 1 : 0);
    }
}
