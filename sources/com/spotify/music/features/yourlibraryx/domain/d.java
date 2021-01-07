package com.spotify.music.features.yourlibraryx.domain;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;

public final class d implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final List<b> a;
    private final List<b> b;
    private final String c;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((b) parcel.readParcelable(d.class.getClassLoader()));
                readInt--;
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList2.add((b) parcel.readParcelable(d.class.getClassLoader()));
                readInt2--;
            }
            return new d(arrayList, arrayList2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new d[i];
        }
    }

    public d() {
        this(null, null, null, 7);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.spotify.music.features.yourlibraryx.domain.b> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.spotify.music.features.yourlibraryx.domain.b> */
    /* JADX WARN: Multi-variable type inference failed */
    public d(List<? extends b> list, List<? extends b> list2, String str) {
        h.e(list, "selectedContentFilters");
        h.e(list2, "contentFilters");
        this.a = list;
        this.b = list2;
        this.c = str;
    }

    public static d a(d dVar, List list, List list2, String str, int i) {
        if ((i & 1) != 0) {
            list = dVar.a;
        }
        if ((i & 2) != 0) {
            list2 = dVar.b;
        }
        if ((i & 4) != 0) {
            str = dVar.c;
        }
        dVar.getClass();
        h.e(list, "selectedContentFilters");
        h.e(list2, "contentFilters");
        return new d(list, list2, str);
    }

    public final List<b> b() {
        return this.b;
    }

    public final List<b> c() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.c;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return h.a(this.a, dVar.a) && h.a(this.b, dVar.b) && h.a(this.c, dVar.c);
    }

    @Override // java.lang.Object
    public int hashCode() {
        List<b> list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<b> list2 = this.b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("YourLibraryXFilters(selectedContentFilters=");
        V0.append(this.a);
        V0.append(", contentFilters=");
        V0.append(this.b);
        V0.append(", textFilter=");
        return je.I0(V0, this.c, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        List<b> list = this.a;
        parcel.writeInt(list.size());
        for (b bVar : list) {
            parcel.writeParcelable(bVar, i);
        }
        List<b> list2 = this.b;
        parcel.writeInt(list2.size());
        for (b bVar2 : list2) {
            parcel.writeParcelable(bVar2, i);
        }
        parcel.writeString(this.c);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ d(java.util.List r1, java.util.List r2, java.lang.String r3, int r4) {
        /*
            r0 = this;
            r1 = r4 & 1
            r2 = 0
            if (r1 == 0) goto L_0x000c
            com.spotify.music.features.yourlibraryx.domain.b$d r1 = com.spotify.music.features.yourlibraryx.domain.b.d.a
            java.util.List r1 = kotlin.collections.d.t(r1)
            goto L_0x000d
        L_0x000c:
            r1 = r2
        L_0x000d:
            r3 = r4 & 2
            if (r3 == 0) goto L_0x0014
            kotlin.collections.EmptyList r3 = kotlin.collections.EmptyList.a
            goto L_0x0015
        L_0x0014:
            r3 = r2
        L_0x0015:
            r4 = r4 & 4
            r0.<init>(r1, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.yourlibraryx.domain.d.<init>(java.util.List, java.util.List, java.lang.String, int):void");
    }
}
