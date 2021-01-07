package com.spotify.music.features.yourlibraryx.domain;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class f implements Parcelable {
    public static final Parcelable.Creator CREATOR = new b();
    public static final a y = new a(null);
    private final YourLibraryXAppMode a;
    private final YourLibraryXViewMode b;
    private final YourLibraryXSortOption c;
    private final List<YourLibraryXSortOption> f;
    private final d n;
    private final g o;
    private final int p;
    private final int q;
    private final h r;
    private final a s;
    private final jnf t;
    private final jnf u;
    private final boolean v;
    private final String w;
    private final List<String> x;

    public static final class a {
        public a(kotlin.jvm.internal.f fVar) {
        }

        public static f b(a aVar, YourLibraryXSortOption yourLibraryXSortOption, List list, YourLibraryXViewMode yourLibraryXViewMode, int i, int i2, d dVar, int i3) {
            YourLibraryXSortOption yourLibraryXSortOption2 = (i3 & 1) != 0 ? YourLibraryXSortOption.RECENTLY_PLAYED : yourLibraryXSortOption;
            List R = (i3 & 2) != 0 ? d.R(YourLibraryXSortOption.values()) : null;
            YourLibraryXViewMode yourLibraryXViewMode2 = (i3 & 4) != 0 ? YourLibraryXViewMode.a : yourLibraryXViewMode;
            int i4 = (i3 & 8) != 0 ? 200 : i;
            int i5 = (i3 & 16) != 0 ? 40 : i2;
            d dVar2 = (i3 & 32) != 0 ? new d(null, null, null, 7) : dVar;
            h.e(yourLibraryXSortOption2, "sortOption");
            h.e(R, "availableSortOptions");
            h.e(yourLibraryXViewMode2, "viewDensity");
            h.e(dVar2, "filters");
            YourLibraryXAppMode yourLibraryXAppMode = YourLibraryXAppMode.DEFAULT_MODE;
            g gVar = new g("", "", "", false);
            EmptyList emptyList = EmptyList.a;
            jnf jnf = jnf.n;
            return new f(yourLibraryXAppMode, yourLibraryXViewMode2, yourLibraryXSortOption2, R, dVar2, gVar, i4, i5, new h(emptyList, jnf.f, 0, emptyList, false), new a(0, null, false, false, 14), jnf.f, jnf.f, false, "", emptyList);
        }

        public final f a(f fVar) {
            h hVar;
            h.e(fVar, "model");
            h f = fVar.f();
            jnf p = fVar.p();
            h.e(f, "data");
            h.e(p, "range");
            if (p.isEmpty() || f.f().d() > p.d() || f.f().e() < p.e()) {
                EmptyList emptyList = EmptyList.a;
                jnf jnf = jnf.n;
                hVar = h.a(f, emptyList, jnf.f, 0, null, false, 28);
            } else {
                hVar = h.a(f, f.c().subList(p.d() - f.f().d(), (p.e() - f.f().d()) + 1), p, 0, null, false, 28);
            }
            return f.a(fVar, null, null, null, null, null, null, 0, 0, hVar, null, null, null, false, null, null, 32511);
        }
    }

    public static class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            YourLibraryXAppMode yourLibraryXAppMode = (YourLibraryXAppMode) Enum.valueOf(YourLibraryXAppMode.class, parcel.readString());
            YourLibraryXViewMode yourLibraryXViewMode = (YourLibraryXViewMode) Enum.valueOf(YourLibraryXViewMode.class, parcel.readString());
            YourLibraryXSortOption yourLibraryXSortOption = (YourLibraryXSortOption) Enum.valueOf(YourLibraryXSortOption.class, parcel.readString());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((YourLibraryXSortOption) Enum.valueOf(YourLibraryXSortOption.class, parcel.readString()));
                readInt--;
            }
            d dVar = (d) d.CREATOR.createFromParcel(parcel);
            g gVar = (g) g.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            h hVar = (h) h.CREATOR.createFromParcel(parcel);
            a aVar = (a) a.CREATOR.createFromParcel(parcel);
            h.e(parcel, "parcel");
            jnf jnf = new jnf(parcel.readInt(), parcel.readInt());
            h.e(parcel, "parcel");
            return new f(yourLibraryXAppMode, yourLibraryXViewMode, yourLibraryXSortOption, arrayList, dVar, gVar, readInt2, readInt3, hVar, aVar, jnf, new jnf(parcel.readInt(), parcel.readInt()), parcel.readInt() != 0, parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new f[i];
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r18v0, resolved type: java.util.List<? extends com.spotify.music.features.yourlibraryx.domain.YourLibraryXSortOption> */
    /* JADX WARN: Multi-variable type inference failed */
    public f(YourLibraryXAppMode yourLibraryXAppMode, YourLibraryXViewMode yourLibraryXViewMode, YourLibraryXSortOption yourLibraryXSortOption, List<? extends YourLibraryXSortOption> list, d dVar, g gVar, int i, int i2, h hVar, a aVar, jnf jnf, jnf jnf2, boolean z, String str, List<String> list2) {
        h.e(yourLibraryXAppMode, "appMode");
        h.e(yourLibraryXViewMode, "viewDensity");
        h.e(yourLibraryXSortOption, "sortOption");
        h.e(list, "availableSortOptions");
        h.e(dVar, "filters");
        h.e(gVar, "profileData");
        h.e(hVar, "loadedRange");
        h.e(aVar, "loadedContext");
        h.e(jnf, "nextRange");
        h.e(jnf2, "visibleRange");
        h.e(str, "playingUri");
        h.e(list2, "recentSearchesUris");
        this.a = yourLibraryXAppMode;
        this.b = yourLibraryXViewMode;
        this.c = yourLibraryXSortOption;
        this.f = list;
        this.n = dVar;
        this.o = gVar;
        this.p = i;
        this.q = i2;
        this.r = hVar;
        this.s = aVar;
        this.t = jnf;
        this.u = jnf2;
        this.v = z;
        this.w = str;
        this.x = list2;
    }

    public static f a(f fVar, YourLibraryXAppMode yourLibraryXAppMode, YourLibraryXViewMode yourLibraryXViewMode, YourLibraryXSortOption yourLibraryXSortOption, List list, d dVar, g gVar, int i, int i2, h hVar, a aVar, jnf jnf, jnf jnf2, boolean z, String str, List list2, int i3) {
        YourLibraryXAppMode yourLibraryXAppMode2 = (i3 & 1) != 0 ? fVar.a : null;
        YourLibraryXViewMode yourLibraryXViewMode2 = (i3 & 2) != 0 ? fVar.b : yourLibraryXViewMode;
        YourLibraryXSortOption yourLibraryXSortOption2 = (i3 & 4) != 0 ? fVar.c : yourLibraryXSortOption;
        List list3 = (i3 & 8) != 0 ? fVar.f : list;
        d dVar2 = (i3 & 16) != 0 ? fVar.n : dVar;
        g gVar2 = (i3 & 32) != 0 ? fVar.o : gVar;
        int i4 = (i3 & 64) != 0 ? fVar.p : i;
        int i5 = (i3 & 128) != 0 ? fVar.q : i2;
        h hVar2 = (i3 & 256) != 0 ? fVar.r : hVar;
        a aVar2 = (i3 & 512) != 0 ? fVar.s : aVar;
        jnf jnf3 = (i3 & 1024) != 0 ? fVar.t : jnf;
        jnf jnf4 = (i3 & 2048) != 0 ? fVar.u : jnf2;
        boolean z2 = (i3 & 4096) != 0 ? fVar.v : z;
        String str2 = (i3 & 8192) != 0 ? fVar.w : str;
        List list4 = (i3 & 16384) != 0 ? fVar.x : list2;
        fVar.getClass();
        h.e(yourLibraryXAppMode2, "appMode");
        h.e(yourLibraryXViewMode2, "viewDensity");
        h.e(yourLibraryXSortOption2, "sortOption");
        h.e(list3, "availableSortOptions");
        h.e(dVar2, "filters");
        h.e(gVar2, "profileData");
        h.e(hVar2, "loadedRange");
        h.e(aVar2, "loadedContext");
        h.e(jnf3, "nextRange");
        h.e(jnf4, "visibleRange");
        h.e(str2, "playingUri");
        h.e(list4, "recentSearchesUris");
        return new f(yourLibraryXAppMode2, yourLibraryXViewMode2, yourLibraryXSortOption2, list3, dVar2, gVar2, i4, i5, hVar2, aVar2, jnf3, jnf4, z2, str2, list4);
    }

    public final List<YourLibraryXSortOption> b() {
        return this.f;
    }

    public final d c() {
        return this.n;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final a e() {
        return this.s;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return h.a(this.a, fVar.a) && h.a(this.b, fVar.b) && h.a(this.c, fVar.c) && h.a(this.f, fVar.f) && h.a(this.n, fVar.n) && h.a(this.o, fVar.o) && this.p == fVar.p && this.q == fVar.q && h.a(this.r, fVar.r) && h.a(this.s, fVar.s) && h.a(this.t, fVar.t) && h.a(this.u, fVar.u) && this.v == fVar.v && h.a(this.w, fVar.w) && h.a(this.x, fVar.x);
    }

    public final h f() {
        return this.r;
    }

    public final jnf g() {
        return this.t;
    }

    public final boolean h() {
        return this.v;
    }

    @Override // java.lang.Object
    public int hashCode() {
        YourLibraryXAppMode yourLibraryXAppMode = this.a;
        int i = 0;
        int hashCode = (yourLibraryXAppMode != null ? yourLibraryXAppMode.hashCode() : 0) * 31;
        YourLibraryXViewMode yourLibraryXViewMode = this.b;
        int hashCode2 = (hashCode + (yourLibraryXViewMode != null ? yourLibraryXViewMode.hashCode() : 0)) * 31;
        YourLibraryXSortOption yourLibraryXSortOption = this.c;
        int hashCode3 = (hashCode2 + (yourLibraryXSortOption != null ? yourLibraryXSortOption.hashCode() : 0)) * 31;
        List<YourLibraryXSortOption> list = this.f;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        d dVar = this.n;
        int hashCode5 = (hashCode4 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        g gVar = this.o;
        int hashCode6 = (((((hashCode5 + (gVar != null ? gVar.hashCode() : 0)) * 31) + this.p) * 31) + this.q) * 31;
        h hVar = this.r;
        int hashCode7 = (hashCode6 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        a aVar = this.s;
        int hashCode8 = (hashCode7 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        jnf jnf = this.t;
        int hashCode9 = (hashCode8 + (jnf != null ? jnf.hashCode() : 0)) * 31;
        jnf jnf2 = this.u;
        int hashCode10 = (hashCode9 + (jnf2 != null ? jnf2.hashCode() : 0)) * 31;
        boolean z = this.v;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode10 + i2) * 31;
        String str = this.w;
        int hashCode11 = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        List<String> list2 = this.x;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode11 + i;
    }

    public final int i() {
        return this.p;
    }

    public final int j() {
        return this.q;
    }

    public final String k() {
        return this.w;
    }

    public final g l() {
        return this.o;
    }

    public final List<String> m() {
        return this.x;
    }

    public final YourLibraryXSortOption n() {
        return this.c;
    }

    public final YourLibraryXViewMode o() {
        return this.b;
    }

    public final jnf p() {
        return this.u;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("YourLibraryXModel(appMode=");
        V0.append(this.a);
        V0.append(", viewDensity=");
        V0.append(this.b);
        V0.append(", sortOption=");
        V0.append(this.c);
        V0.append(", availableSortOptions=");
        V0.append(this.f);
        V0.append(", filters=");
        V0.append(this.n);
        V0.append(", profileData=");
        V0.append(this.o);
        V0.append(", pageSize=");
        V0.append(this.p);
        V0.append(", pageThreshold=");
        V0.append(this.q);
        V0.append(", loadedRange=");
        V0.append(this.r);
        V0.append(", loadedContext=");
        V0.append(this.s);
        V0.append(", nextRange=");
        V0.append(this.t);
        V0.append(", visibleRange=");
        V0.append(this.u);
        V0.append(", onDemandEnabled=");
        V0.append(this.v);
        V0.append(", playingUri=");
        V0.append(this.w);
        V0.append(", recentSearchesUris=");
        return je.L0(V0, this.x, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeString(this.a.name());
        parcel.writeString(this.b.name());
        parcel.writeString(this.c.name());
        List<YourLibraryXSortOption> list = this.f;
        parcel.writeInt(list.size());
        for (YourLibraryXSortOption yourLibraryXSortOption : list) {
            parcel.writeString(yourLibraryXSortOption.name());
        }
        this.n.writeToParcel(parcel, 0);
        this.o.writeToParcel(parcel, 0);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        this.r.writeToParcel(parcel, 0);
        this.s.writeToParcel(parcel, 0);
        jnf jnf = this.t;
        h.e(jnf, "$this$write");
        h.e(parcel, "parcel");
        parcel.writeInt(jnf.d());
        parcel.writeInt(jnf.e());
        jnf jnf2 = this.u;
        h.e(jnf2, "$this$write");
        h.e(parcel, "parcel");
        parcel.writeInt(jnf2.d());
        parcel.writeInt(jnf2.e());
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeString(this.w);
        parcel.writeStringList(this.x);
    }
}
