package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class AutoValue_PlayerOptionsOverrides extends C$AutoValue_PlayerOptionsOverrides {
    public static final Parcelable.Creator<AutoValue_PlayerOptionsOverrides> CREATOR = new Parcelable.Creator<AutoValue_PlayerOptionsOverrides>() {
        /* class com.spotify.mobile.android.cosmos.player.v2.AutoValue_PlayerOptionsOverrides.AnonymousClass1 */

        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerOptionsOverrides createFromParcel(Parcel parcel) {
            Boolean bool;
            Boolean bool2;
            boolean z = false;
            Boolean bool3 = null;
            if (parcel.readInt() == 0) {
                bool = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool = null;
            }
            if (parcel.readInt() == 0) {
                bool2 = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool2 = null;
            }
            if (parcel.readInt() == 0) {
                if (parcel.readInt() == 1) {
                    z = true;
                }
                bool3 = Boolean.valueOf(z);
            }
            return new AutoValue_PlayerOptionsOverrides(bool, bool2, bool3);
        }

        @Override // android.os.Parcelable.Creator
        public AutoValue_PlayerOptionsOverrides[] newArray(int i) {
            return new AutoValue_PlayerOptionsOverrides[i];
        }
    };

    AutoValue_PlayerOptionsOverrides(Boolean bool, Boolean bool2, Boolean bool3) {
        super(bool, bool2, bool3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (shufflingContext() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(shufflingContext().booleanValue() ? 1 : 0);
        }
        if (repeatingContext() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(repeatingContext().booleanValue() ? 1 : 0);
        }
        if (repeatingTrack() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeInt(repeatingTrack().booleanValue() ? 1 : 0);
    }
}
