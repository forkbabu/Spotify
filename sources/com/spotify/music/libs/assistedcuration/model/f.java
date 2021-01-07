package com.spotify.music.libs.assistedcuration.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.playlist.models.PlayabilityRestriction;
import java.util.List;

/* access modifiers changed from: package-private */
public final class f extends a {
    public static final Parcelable.Creator<f> CREATOR = new a();

    static class a implements Parcelable.Creator<f> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public f createFromParcel(Parcel parcel) {
            return new f(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, (PlayabilityRestriction) Enum.valueOf(PlayabilityRestriction.class, parcel.readString()), parcel.readString(), parcel.readString(), parcel.readArrayList(e.class.getClassLoader()), parcel.readString());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public f[] newArray(int i) {
            return new f[i];
        }
    }

    f(String str, String str2, String str3, boolean z, boolean z2, boolean z3, PlayabilityRestriction playabilityRestriction, String str4, String str5, List<String> list, String str6) {
        super(str, str2, str3, z, z2, z3, playabilityRestriction, str4, str5, list, str6);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getUri());
        parcel.writeString(getName());
        if (getPreviewId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getPreviewId());
        }
        parcel.writeInt(isExplicit() ? 1 : 0);
        parcel.writeInt(h() ? 1 : 0);
        parcel.writeInt(i() ? 1 : 0);
        parcel.writeString(j().name());
        parcel.writeString(f());
        parcel.writeString(g());
        parcel.writeList(x1());
        parcel.writeString(getImageUri());
    }
}
