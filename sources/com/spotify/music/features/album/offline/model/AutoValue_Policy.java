package com.spotify.music.features.album.offline.model;

import android.os.Parcel;
import android.os.Parcelable;

final class AutoValue_Policy extends C$AutoValue_Policy {
    public static final Parcelable.Creator<AutoValue_Policy> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_Policy> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Policy createFromParcel(Parcel parcel) {
            return new AutoValue_Policy((DecorationPolicy) parcel.readParcelable(Policy.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Policy[] newArray(int i) {
            return new AutoValue_Policy[i];
        }
    }

    AutoValue_Policy(DecorationPolicy decorationPolicy) {
        super(decorationPolicy);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(policy(), i);
    }
}
