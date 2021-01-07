package com.spotify.music.features.yourlibrary.musicpages.datasource;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.yourlibrary.musicpages.datasource.y3;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import java.util.ArrayList;
import java.util.Collection;

final class v3 extends c {
    public static final Parcelable.Creator<v3> CREATOR = new a();
    private static final y3.b s = new y3.b();

    static class a implements Parcelable.Creator<v3> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public v3 createFromParcel(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            y3.b unused = v3.s;
            ArrayList arrayList = new ArrayList();
            parcel.readTypedList(arrayList, MusicItem.f());
            return new v3(z, readInt, readInt2, ImmutableList.copyOf((Collection) arrayList), (MusicItem) parcel.readParcelable(y3.class.getClassLoader()), (x3) parcel.readParcelable(y3.class.getClassLoader()), (y3) parcel.readParcelable(y3.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public v3[] newArray(int i) {
            return new v3[i];
        }
    }

    v3(boolean z, int i, int i2, ImmutableList<MusicItem> immutableList, MusicItem musicItem, x3 x3Var, y3 y3Var) {
        super(z, i, i2, immutableList, musicItem, x3Var, y3Var);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(h() ? 1 : 0);
        parcel.writeInt(b());
        parcel.writeInt(c());
        parcel.writeTypedList(i());
        parcel.writeParcelable(k(), i);
        parcel.writeParcelable(a(), i);
        parcel.writeParcelable(j(), i);
    }
}
