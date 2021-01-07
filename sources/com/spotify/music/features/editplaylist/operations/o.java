package com.spotify.music.features.editplaylist.operations;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.playlist.models.l;
import java.util.List;

/* access modifiers changed from: package-private */
public final class o extends a {
    public static final Parcelable.Creator<o> CREATOR = new a();

    static class a implements Parcelable.Creator<o> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public o createFromParcel(Parcel parcel) {
            return new o(parcel.readString(), (Uri) parcel.readParcelable(u.class.getClassLoader()), parcel.readString(), parcel.readArrayList(u.class.getClassLoader()), parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public o[] newArray(int i) {
            return new o[i];
        }
    }

    o(String str, Uri uri, String str2, List<l> list, boolean z, boolean z2, boolean z3) {
        super(str, uri, str2, list, z, z2, z3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(i());
        parcel.writeParcelable(c(), i);
        parcel.writeString(b());
        parcel.writeList(h());
        parcel.writeInt(e() ? 1 : 0);
        parcel.writeInt(f() ? 1 : 0);
        parcel.writeInt(g() ? 1 : 0);
    }
}
