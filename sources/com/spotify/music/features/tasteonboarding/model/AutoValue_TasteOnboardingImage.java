package com.spotify.music.features.tasteonboarding.model;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class AutoValue_TasteOnboardingImage extends C$AutoValue_TasteOnboardingImage {
    public static final Parcelable.Creator<AutoValue_TasteOnboardingImage> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_TasteOnboardingImage> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TasteOnboardingImage createFromParcel(Parcel parcel) {
            return new AutoValue_TasteOnboardingImage(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TasteOnboardingImage[] newArray(int i) {
            return new AutoValue_TasteOnboardingImage[i];
        }
    }

    AutoValue_TasteOnboardingImage(String str, int i, int i2) {
        super(str, i, i2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(uri());
        parcel.writeInt(height());
        parcel.writeInt(width());
    }
}
