package com.spotify.music.features.album.offline.model;

import android.os.Parcel;
import android.os.Parcelable;

final class AutoValue_DecorationPolicy extends C$AutoValue_DecorationPolicy {
    public static final Parcelable.Creator<AutoValue_DecorationPolicy> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_DecorationPolicy> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_DecorationPolicy createFromParcel(Parcel parcel) {
            return new AutoValue_DecorationPolicy((ListPolicy) parcel.readParcelable(DecorationPolicy.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_DecorationPolicy[] newArray(int i) {
            return new AutoValue_DecorationPolicy[i];
        }
    }

    AutoValue_DecorationPolicy(ListPolicy listPolicy) {
        super(listPolicy);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(list(), i);
    }
}
