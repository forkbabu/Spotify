package com.spotify.music.features.yourlibrary.musicpages.datasource;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import com.spotify.music.features.yourlibrary.musicpages.datasource.x3;
import java.util.Map;

final class t3 extends a {
    public static final Parcelable.Creator<t3> CREATOR = new a();
    private static final x3.d s = new x3.d();

    static class a implements Parcelable.Creator<t3> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public t3 createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            x3.b bVar = (x3.b) parcel.readParcelable(x3.class.getClassLoader());
            x3.d unused = t3.s;
            int readInt3 = parcel.readInt();
            ImmutableMap.Builder builder = ImmutableMap.builder();
            for (int i = 0; i < readInt3; i++) {
                String readString = parcel.readString();
                readString.getClass();
                String readString2 = parcel.readString();
                readString2.getClass();
                builder.mo51put(readString, readString2);
            }
            return new t3(readInt, readInt2, bVar, builder.build(), parcel.readInt() == 0 ? Boolean.valueOf(parcel.readInt() == 1) : null, parcel.readInt() == 1, parcel.readInt() == 1);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public t3[] newArray(int i) {
            return new t3[i];
        }
    }

    t3(int i, int i2, x3.b bVar, ImmutableMap<String, String> immutableMap, Boolean bool, boolean z, boolean z2) {
        super(i, i2, bVar, immutableMap, bool, z, z2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(k());
        parcel.writeInt(j());
        parcel.writeParcelable(c(), i);
        ImmutableMap<String, String> h = h();
        parcel.writeInt(h.size());
        UnmodifiableIterator<Map.Entry<String, String>> it = h.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            parcel.writeString(next.getKey());
            parcel.writeString(next.getValue());
        }
        if (f() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(f().booleanValue() ? 1 : 0);
        }
        parcel.writeInt(a() ? 1 : 0);
        parcel.writeInt(g() ? 1 : 0);
    }
}
