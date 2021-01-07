package com.spotify.music.features.ads.model;

import android.os.Parcel;
import android.os.Parcelable;

final class AutoValue_State extends C$AutoValue_State {
    public static final Parcelable.Creator<AutoValue_State> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_State> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_State createFromParcel(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new AutoValue_State(z, parcel.readInt() == 0 ? parcel.readString() : null, (AdBreakState) Enum.valueOf(AdBreakState.class, parcel.readString()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (i) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_State[] newArray(int i) {
            return new AutoValue_State[i];
        }
    }

    AutoValue_State(boolean z, String str, AdBreakState adBreakState, String str2, String str3, i iVar, String str4) {
        super(z, str, adBreakState, str2, str3, iVar, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(isAdsEnabled() ? 1 : 0);
        if (getAppStartupId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getAppStartupId());
        }
        parcel.writeString(getAdBreakState().name());
        if (getAdSlotId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getAdSlotId());
        }
        if (getAdId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getAdId());
        }
        parcel.writeParcelable(getPendingAds(), i);
        if (getStreamTimeInMs() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(getStreamTimeInMs());
    }
}
