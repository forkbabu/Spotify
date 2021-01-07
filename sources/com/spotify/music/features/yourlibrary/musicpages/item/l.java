package com.spotify.music.features.yourlibrary.musicpages.item;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.playlist.models.PlayabilityRestriction;

/* access modifiers changed from: package-private */
public final class l extends d {
    public static final Parcelable.Creator<l> CREATOR = new a();

    static class a implements Parcelable.Creator<l> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public l createFromParcel(Parcel parcel) {
            return new l(parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, (PlayabilityRestriction) Enum.valueOf(PlayabilityRestriction.class, parcel.readString()), parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readString());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public l[] newArray(int i) {
            return new l[i];
        }
    }

    l(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, PlayabilityRestriction playabilityRestriction, boolean z7, boolean z8, boolean z9, String str, String str2) {
        super(z, z2, z3, z4, z5, z6, playabilityRestriction, z7, z8, z9, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(h() ? 1 : 0);
        parcel.writeInt(a() ? 1 : 0);
        parcel.writeInt(c() ? 1 : 0);
        parcel.writeInt(b() ? 1 : 0);
        parcel.writeInt(g() ? 1 : 0);
        parcel.writeInt(i() ? 1 : 0);
        parcel.writeString(k().name());
        parcel.writeInt(f() ? 1 : 0);
        parcel.writeInt(m() ? 1 : 0);
        parcel.writeInt(j() ? 1 : 0);
        if (l() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(l());
        }
        parcel.writeString(e());
    }
}
