package com.spotify.music.libs.assistedcuration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;

/* access modifiers changed from: package-private */
public final class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new a();

    static class a implements Parcelable.Creator<e> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public e createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new e(readInt, readInt2, readInt3, z, (SpotifyIconV2) Enum.valueOf(SpotifyIconV2.class, parcel.readString()), (Optional) parcel.readSerializable());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public e[] newArray(int i) {
            return new e[i];
        }
    }

    e(int i, int i2, int i3, boolean z, SpotifyIconV2 spotifyIconV2, Optional<String> optional) {
        super(i, i2, i3, z, spotifyIconV2, optional);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(e());
        parcel.writeInt(f());
        parcel.writeInt(g());
        parcel.writeInt(c() ? 1 : 0);
        parcel.writeString(i().name());
        parcel.writeSerializable(b());
    }
}
