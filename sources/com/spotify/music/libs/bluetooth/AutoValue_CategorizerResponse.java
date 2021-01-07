package com.spotify.music.libs.bluetooth;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class AutoValue_CategorizerResponse extends C$AutoValue_CategorizerResponse {
    public static final Parcelable.Creator<AutoValue_CategorizerResponse> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_CategorizerResponse> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_CategorizerResponse createFromParcel(Parcel parcel) {
            return new AutoValue_CategorizerResponse(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 1);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_CategorizerResponse[] newArray(int i) {
            return new AutoValue_CategorizerResponse[i];
        }
    }

    AutoValue_CategorizerResponse(String str, String str2, String str3, String str4, boolean z) {
        super(str, str2, str3, str4, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (category() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(category());
        }
        if (company() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(company());
        }
        if (model() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(model());
        }
        if (version() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(version());
        }
        parcel.writeInt(isInterapp() ? 1 : 0);
    }
}
