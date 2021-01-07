package com.spotify.music.features.yourlibraryx.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryResponseEntity;
import java.util.ArrayList;
import java.util.List;

public final class h implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final List<YourLibraryResponseProto$YourLibraryResponseEntity> a;
    private final jnf b;
    private final int c;
    private final List<b> f;
    private final boolean n;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.h.e(parcel, "in");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                kotlin.jvm.internal.h.e(parcel, "parcel");
                YourLibraryResponseProto$YourLibraryResponseEntity q = YourLibraryResponseProto$YourLibraryResponseEntity.q(parcel.createByteArray());
                kotlin.jvm.internal.h.d(q, "YourLibraryResponseEntit…parcel.createByteArray())");
                arrayList.add(q);
                readInt--;
            }
            kotlin.jvm.internal.h.e(parcel, "parcel");
            jnf jnf = new jnf(parcel.readInt(), parcel.readInt());
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            while (readInt3 != 0) {
                arrayList2.add((b) parcel.readParcelable(h.class.getClassLoader()));
                readInt3--;
            }
            return new h(arrayList, jnf, readInt2, arrayList2, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new h[i];
        }
    }

    public h() {
        this(null, null, 0, null, false, 31);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.spotify.music.features.yourlibraryx.domain.b> */
    /* JADX WARN: Multi-variable type inference failed */
    public h(List<YourLibraryResponseProto$YourLibraryResponseEntity> list, jnf jnf, int i, List<? extends b> list2, boolean z) {
        kotlin.jvm.internal.h.e(list, "items");
        kotlin.jvm.internal.h.e(jnf, "range");
        kotlin.jvm.internal.h.e(list2, "contentFilters");
        this.a = list;
        this.b = jnf;
        this.c = i;
        this.f = list2;
        this.n = z;
    }

    public static h a(h hVar, List list, jnf jnf, int i, List list2, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            list = hVar.a;
        }
        if ((i2 & 2) != 0) {
            jnf = hVar.b;
        }
        if ((i2 & 4) != 0) {
            i = hVar.c;
        }
        List<b> list3 = (i2 & 8) != 0 ? hVar.f : null;
        if ((i2 & 16) != 0) {
            z = hVar.n;
        }
        kotlin.jvm.internal.h.e(list, "items");
        kotlin.jvm.internal.h.e(jnf, "range");
        kotlin.jvm.internal.h.e(list3, "contentFilters");
        return new h(list, jnf, i, list3, z);
    }

    public final List<b> b() {
        return this.f;
    }

    public final List<YourLibraryResponseProto$YourLibraryResponseEntity> c() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.n;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.h.a(this.a, hVar.a) && kotlin.jvm.internal.h.a(this.b, hVar.b) && this.c == hVar.c && kotlin.jvm.internal.h.a(this.f, hVar.f) && this.n == hVar.n;
    }

    public final jnf f() {
        return this.b;
    }

    public final int g() {
        return this.c;
    }

    @Override // java.lang.Object
    public int hashCode() {
        List<YourLibraryResponseProto$YourLibraryResponseEntity> list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        jnf jnf = this.b;
        int hashCode2 = (((hashCode + (jnf != null ? jnf.hashCode() : 0)) * 31) + this.c) * 31;
        List<b> list2 = this.f;
        if (list2 != null) {
            i = list2.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.n;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("YourLibraryXRangeData(items=");
        V0.append(this.a);
        V0.append(", range=");
        V0.append(this.b);
        V0.append(", totalCount=");
        V0.append(this.c);
        V0.append(", contentFilters=");
        V0.append(this.f);
        V0.append(", loaded=");
        return je.P0(V0, this.n, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        kotlin.jvm.internal.h.e(parcel, "parcel");
        List<YourLibraryResponseProto$YourLibraryResponseEntity> list = this.a;
        parcel.writeInt(list.size());
        for (YourLibraryResponseProto$YourLibraryResponseEntity yourLibraryResponseProto$YourLibraryResponseEntity : list) {
            kotlin.jvm.internal.h.e(yourLibraryResponseProto$YourLibraryResponseEntity, "$this$write");
            kotlin.jvm.internal.h.e(parcel, "parcel");
            parcel.writeByteArray(yourLibraryResponseProto$YourLibraryResponseEntity.toByteArray());
        }
        jnf jnf = this.b;
        kotlin.jvm.internal.h.e(jnf, "$this$write");
        kotlin.jvm.internal.h.e(parcel, "parcel");
        parcel.writeInt(jnf.d());
        parcel.writeInt(jnf.e());
        parcel.writeInt(this.c);
        List<b> list2 = this.f;
        parcel.writeInt(list2.size());
        for (b bVar : list2) {
            parcel.writeParcelable(bVar, i);
        }
        parcel.writeInt(this.n ? 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(java.util.List r5, defpackage.jnf r6, int r7, java.util.List r8, boolean r9, int r10) {
        /*
            r4 = this;
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.a
            r1 = r10 & 1
            if (r1 == 0) goto L_0x0008
            r1 = r0
            goto L_0x0009
        L_0x0008:
            r1 = r5
        L_0x0009:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x0013
            jnf r5 = defpackage.jnf.n
            jnf r6 = defpackage.jnf.h()
        L_0x0013:
            r2 = r6
            r5 = r10 & 4
            if (r5 == 0) goto L_0x001b
            r7 = 0
            r3 = 0
            goto L_0x001c
        L_0x001b:
            r3 = r7
        L_0x001c:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r0 = r8
        L_0x0022:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0029
            r9 = 1
            r10 = 1
            goto L_0x002a
        L_0x0029:
            r10 = r9
        L_0x002a:
            r5 = r4
            r6 = r1
            r7 = r2
            r8 = r3
            r9 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.yourlibraryx.domain.h.<init>(java.util.List, jnf, int, java.util.List, boolean, int):void");
    }
}
