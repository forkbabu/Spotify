package com.spotify.music.features.eventshub.model;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class AutoValue_Artist extends C$AutoValue_Artist {
    public static final Parcelable.Creator<AutoValue_Artist> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_Artist> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Artist createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString3 = parcel.readInt() == 0 ? parcel.readString() : null;
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new AutoValue_Artist(readString, readString2, readString3, z, parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Artist[] newArray(int i) {
            return new AutoValue_Artist[i];
        }
    }

    AutoValue_Artist(String str, String str2, String str3, boolean z, Integer num) {
        super(str, str2, str3, z, num);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getUri());
        if (getName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getName());
        }
        if (getImageUri() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getImageUri());
        }
        parcel.writeInt(hasAffinity() ? 1 : 0);
        if (getMonthlyListener() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeInt(getMonthlyListener().intValue());
    }
}
