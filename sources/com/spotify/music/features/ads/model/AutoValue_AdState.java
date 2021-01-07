package com.spotify.music.features.ads.model;

import android.os.Parcel;
import android.os.Parcelable;

final class AutoValue_AdState extends C$AutoValue_AdState {
    public static final Parcelable.Creator<AutoValue_AdState> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_AdState> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_AdState createFromParcel(Parcel parcel) {
            return new AutoValue_AdState((State) parcel.readParcelable(AdState.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_AdState[] newArray(int i) {
            return new AutoValue_AdState[i];
        }
    }

    AutoValue_AdState(State state) {
        super(state);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getState(), i);
    }
}
