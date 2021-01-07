package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class AutoValue_PlayerOptions extends C$AutoValue_PlayerOptions {
    public static final Parcelable.Creator<AutoValue_PlayerOptions> CREATOR = new Parcelable.Creator<AutoValue_PlayerOptions>() {
        /* class com.spotify.mobile.android.cosmos.player.v2.AutoValue_PlayerOptions.AnonymousClass1 */

        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerOptions createFromParcel(Parcel parcel) {
            boolean z = false;
            boolean z2 = parcel.readInt() == 1;
            boolean z3 = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            return new AutoValue_PlayerOptions(z2, z3, z);
        }

        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerOptions[] newArray(int i) {
            return new AutoValue_PlayerOptions[i];
        }
    };

    AutoValue_PlayerOptions(boolean z, boolean z2, boolean z3) {
        super(z, z2, z3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(shufflingContext() ? 1 : 0);
        parcel.writeInt(repeatingContext() ? 1 : 0);
        parcel.writeInt(repeatingTrack() ? 1 : 0);
    }
}
