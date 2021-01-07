package com.spotify.music.features.profile.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.features.profile.model.ProfileListItem;

final class d extends b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    static class a implements Parcelable.Creator<d> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public d createFromParcel(Parcel parcel) {
            return new d((ProfileListItem.Type) Enum.valueOf(ProfileListItem.Type.class, parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, (ct7) parcel.readParcelable(ProfileListItem.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public d[] newArray(int i) {
            return new d[i];
        }
    }

    d(ProfileListItem.Type type, String str, String str2, String str3, String str4, ct7 ct7) {
        super(type, str, str2, str3, str4, ct7);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(h().name());
        parcel.writeString(i());
        parcel.writeString(f());
        parcel.writeString(e());
        if (c() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(c());
        }
        parcel.writeParcelable(b(), i);
    }
}
