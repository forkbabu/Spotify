package com.spotify.music.features.ads.model;

import android.os.Parcel;
import android.os.Parcelable;

final class AutoValue_AdSlotEvent extends C$AutoValue_AdSlotEvent {
    public static final Parcelable.Creator<AutoValue_AdSlotEvent> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_AdSlotEvent> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_AdSlotEvent createFromParcel(Parcel parcel) {
            return new AutoValue_AdSlotEvent(parcel.readString(), parcel.readString(), (Ad) parcel.readParcelable(AdSlotEvent.class.getClassLoader()), parcel.readString());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_AdSlotEvent[] newArray(int i) {
            return new AutoValue_AdSlotEvent[i];
        }
    }

    AutoValue_AdSlotEvent(String str, String str2, Ad ad, String str3) {
        super(str, str2, ad, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getEventString());
        parcel.writeString(getFormatString());
        parcel.writeParcelable(getAd(), i);
        parcel.writeString(getSlot());
    }
}
