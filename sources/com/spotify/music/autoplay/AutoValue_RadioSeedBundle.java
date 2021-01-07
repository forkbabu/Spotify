package com.spotify.music.autoplay;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;

/* access modifiers changed from: package-private */
public final class AutoValue_RadioSeedBundle extends C$AutoValue_RadioSeedBundle {
    public static final Parcelable.Creator<AutoValue_RadioSeedBundle> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_RadioSeedBundle> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_RadioSeedBundle createFromParcel(Parcel parcel) {
            return new AutoValue_RadioSeedBundle(parcel.readString(), parcel.readString(), (PlayOrigin) parcel.readParcelable(RadioSeedBundle.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_RadioSeedBundle[] newArray(int i) {
            return new AutoValue_RadioSeedBundle[i];
        }
    }

    AutoValue_RadioSeedBundle(String str, String str2, PlayOrigin playOrigin) {
        super(str, str2, playOrigin);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getRadioSeed());
        parcel.writeString(getPlaybackId());
        parcel.writeParcelable(getPlayOrigin(), i);
    }
}
