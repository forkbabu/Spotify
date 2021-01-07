package com.spotify.music.features.yourlibrary.musicpages.datasource;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import com.spotify.music.features.yourlibrary.musicpages.datasource.x3;
import java.util.Map;

final class u3 extends b {
    public static final Parcelable.Creator<u3> CREATOR = new a();
    private static final x3.c o = new x3.c();

    static class a implements Parcelable.Creator<u3> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public u3 createFromParcel(Parcel parcel) {
            boolean z = parcel.readInt() == 1;
            String readString = parcel.readString();
            ane ane = (ane) parcel.readParcelable(x3.b.class.getClassLoader());
            x3.c unused = u3.o;
            int readInt = parcel.readInt();
            ImmutableMap.Builder builder = ImmutableMap.builder();
            for (int i = 0; i < readInt; i++) {
                String readString2 = parcel.readString();
                readString2.getClass();
                builder.mo51put(readString2, Boolean.valueOf(parcel.readInt() != 0));
            }
            return new u3(z, readString, ane, builder.build());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public u3[] newArray(int i) {
            return new u3[i];
        }
    }

    u3(boolean z, String str, ane ane, ImmutableMap<String, Boolean> immutableMap) {
        super(z, str, ane, immutableMap);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(f() ? 1 : 0);
        parcel.writeString(e());
        parcel.writeParcelable(c(), i);
        ImmutableMap<String, Boolean> b = b();
        parcel.writeInt(b.size());
        UnmodifiableIterator<Map.Entry<String, Boolean>> it = b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Boolean> next = it.next();
            parcel.writeString(next.getKey());
            parcel.writeInt(next.getValue().booleanValue() ? 1 : 0);
        }
    }
}
