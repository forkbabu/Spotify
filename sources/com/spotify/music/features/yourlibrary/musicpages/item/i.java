package com.spotify.music.features.yourlibrary.musicpages.item;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.playlist.models.offline.c;
import java.util.Date;
import java.util.List;

/* access modifiers changed from: package-private */
public final class i extends a {
    public static final Parcelable.Creator<i> CREATOR = new a();
    private static final c E = new c();
    private static final MusicItem.d F = new MusicItem.d();

    static class a implements Parcelable.Creator<i> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public i createFromParcel(Parcel parcel) {
            Boolean bool;
            MusicItem.c cVar;
            MusicItem.c cVar2;
            long readLong = parcel.readLong();
            MusicItem.Type type = (MusicItem.Type) Enum.valueOf(MusicItem.Type.class, parcel.readString());
            boolean z = parcel.readInt() == 1;
            boolean z2 = parcel.readInt() == 1;
            boolean z3 = parcel.readInt() == 1;
            boolean z4 = parcel.readInt() == 1;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            if (parcel.readInt() == 0) {
                bool = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                bool = null;
            }
            com.spotify.playlist.models.offline.a a = parcel.readInt() == 0 ? i.E.a(parcel) : null;
            if (parcel.readInt() == 0) {
                MusicItem.d unused = i.F;
                String readString6 = parcel.readString();
                if (rw.equal(readString6, l.class.getCanonicalName())) {
                    cVar2 = (MusicItem.c) gf0.n(parcel, l.CREATOR);
                } else if (rw.equal(readString6, k.class.getCanonicalName())) {
                    cVar2 = (MusicItem.c) gf0.n(parcel, k.CREATOR);
                } else if (rw.equal(readString6, j.class.getCanonicalName())) {
                    cVar2 = (MusicItem.c) gf0.n(parcel, j.CREATOR);
                } else {
                    throw new IllegalStateException("Bad MusicItem extras");
                }
                cVar = cVar2;
            } else {
                cVar = null;
            }
            return new i(readLong, type, z, z2, z3, z4, readString, readString2, readString3, readString4, readString5, readInt, readInt2, bool, a, cVar, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? (Date) parcel.readSerializable() : null, parcel.readArrayList(MusicItem.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public i[] newArray(int i) {
            return new i[i];
        }
    }

    i(long j, MusicItem.Type type, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, String str4, String str5, int i, int i2, Boolean bool, com.spotify.playlist.models.offline.a aVar, MusicItem.c cVar, String str6, Date date, List<fb9> list) {
        super(j, type, z, z2, z3, z4, str, str2, str3, str4, str5, i, i2, bool, aVar, cVar, str6, date, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(a());
        parcel.writeString(z().name());
        parcel.writeInt(l() ? 1 : 0);
        parcel.writeInt(i() ? 1 : 0);
        parcel.writeInt(t() ? 1 : 0);
        parcel.writeInt(m() ? 1 : 0);
        parcel.writeString(w());
        parcel.writeString(u());
        parcel.writeString(A());
        parcel.writeString(v());
        parcel.writeString(j());
        parcel.writeInt(b());
        parcel.writeInt(k());
        if (n() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(n().booleanValue() ? 1 : 0);
        }
        if (p() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            E.b(p(), parcel);
        }
        if (g() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            MusicItem.c g = g();
            parcel.writeString(g.getClass().getCanonicalName());
            gf0.v(parcel, g, 0);
        }
        if (r() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(r());
        }
        if (q() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(q());
        }
        parcel.writeList(h());
    }
}
