package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Collections;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
@Deprecated
public class PlayerSuppressions implements JacksonModel, Parcelable {
    public static final Parcelable.Creator<PlayerSuppressions> CREATOR = new Parcelable.Creator<PlayerSuppressions>() {
        /* class com.spotify.mobile.android.cosmos.player.v2.PlayerSuppressions.AnonymousClass1 */

        @Override // android.os.Parcelable.Creator
        public PlayerSuppressions createFromParcel(Parcel parcel) {
            return new PlayerSuppressions(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PlayerSuppressions[] newArray(int i) {
            return new PlayerSuppressions[i];
        }
    };
    @JsonProperty("providers")
    private final Set<String> mProviders;

    @JsonCreator
    public PlayerSuppressions(@JsonProperty("providers") Set<String> set) {
        if (set == null || set.isEmpty()) {
            this.mProviders = Collections.unmodifiableSet(Collections.emptySet());
        } else {
            this.mProviders = Collections.unmodifiableSet(set);
        }
    }

    public static PlayerSuppressions empty() {
        return new PlayerSuppressions(Collections.emptySet());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PlayerSuppressions) && this.mProviders.equals(((PlayerSuppressions) obj).mProviders);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.mProviders.hashCode();
    }

    public Set<String> providers() {
        return this.mProviders;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        gf0.u(parcel, this.mProviders);
    }

    protected PlayerSuppressions(Parcel parcel) {
        this.mProviders = gf0.m(parcel);
    }
}
