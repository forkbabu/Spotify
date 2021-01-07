package com.spotify.music.features.languagepicker.model;

import android.os.Parcel;
import android.os.Parcelable;

final class AutoValue_AvailableLanguage extends C$AutoValue_AvailableLanguage {
    public static final Parcelable.Creator<AutoValue_AvailableLanguage> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_AvailableLanguage> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_AvailableLanguage createFromParcel(Parcel parcel) {
            return new AutoValue_AvailableLanguage(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_AvailableLanguage[] newArray(int i) {
            return new AutoValue_AvailableLanguage[i];
        }
    }

    AutoValue_AvailableLanguage(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
        parcel.writeString(imageUri());
        parcel.writeString(bcp47());
    }
}
