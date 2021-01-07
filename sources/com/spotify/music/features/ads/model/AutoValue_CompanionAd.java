package com.spotify.music.features.ads.model;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class AutoValue_CompanionAd extends C$AutoValue_CompanionAd {
    public static final Parcelable.Creator<AutoValue_CompanionAd> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_CompanionAd> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_CompanionAd createFromParcel(Parcel parcel) {
            String readString = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString2 = parcel.readInt() == 0 ? parcel.readString() : null;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            boolean z = true;
            boolean z2 = parcel.readInt() == 1;
            boolean z3 = parcel.readInt() == 1;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new AutoValue_CompanionAd(readString, readString2, readInt, readInt2, z2, z3, z, parcel.readInt(), parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_CompanionAd[] newArray(int i) {
            return new AutoValue_CompanionAd[i];
        }
    }

    AutoValue_CompanionAd(String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3, int i3, String str3) {
        super(str, str2, i, i2, z, z2, z3, i3, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (getImageHexId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getImageHexId());
        }
        if (getMimeType() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getMimeType());
        }
        parcel.writeInt(getWidth());
        parcel.writeInt(getHeight());
        parcel.writeInt(isScalable() ? 1 : 0);
        parcel.writeInt(isLockedRatio() ? 1 : 0);
        parcel.writeInt(isHasDisplay() ? 1 : 0);
        parcel.writeInt(getBitrate());
        if (getUrl() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(getUrl());
    }
}
