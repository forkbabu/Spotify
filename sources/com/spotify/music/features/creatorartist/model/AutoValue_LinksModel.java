package com.spotify.music.features.creatorartist.model;

import android.os.Parcel;
import android.os.Parcelable;

final class AutoValue_LinksModel extends C$AutoValue_LinksModel {
    public static final Parcelable.Creator<AutoValue_LinksModel> CREATOR = new a();

    static class a implements Parcelable.Creator<AutoValue_LinksModel> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_LinksModel createFromParcel(Parcel parcel) {
            String str = null;
            String readString = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString2 = parcel.readInt() == 0 ? parcel.readString() : null;
            String readString3 = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 0) {
                str = parcel.readString();
            }
            return new AutoValue_LinksModel(readString, readString2, readString3, str);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public AutoValue_LinksModel[] newArray(int i) {
            return new AutoValue_LinksModel[i];
        }
    }

    AutoValue_LinksModel(String str, String str2, String str3, String str4) {
        super(str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (getTwitterLink() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getTwitterLink());
        }
        if (getInstagramLink() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getInstagramLink());
        }
        if (getWikipediaLink() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getWikipediaLink());
        }
        if (getFacebookLink() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(getFacebookLink());
    }
}
