package com.spotify.music.features.album.offline.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;

/* access modifiers changed from: package-private */
public final class AutoValue_ListPolicy extends C$AutoValue_ListPolicy {
    public static final Parcelable.Creator<AutoValue_ListPolicy> CREATOR = new a();
    private static final a IMMUTABLE_MAP_TYPE_ADAPTER = new a();

    static class a implements Parcelable.Creator<AutoValue_ListPolicy> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ListPolicy createFromParcel(Parcel parcel) {
            AutoValue_ListPolicy.IMMUTABLE_MAP_TYPE_ADAPTER.getClass();
            return new AutoValue_ListPolicy((ImmutableMap) parcel.readSerializable());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ListPolicy[] newArray(int i) {
            return new AutoValue_ListPolicy[i];
        }
    }

    AutoValue_ListPolicy(ImmutableMap<String, Boolean> immutableMap) {
        super(immutableMap);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        a aVar = IMMUTABLE_MAP_TYPE_ADAPTER;
        ImmutableMap<String, Boolean> attributes = attributes();
        aVar.getClass();
        parcel.writeSerializable(attributes);
    }
}
