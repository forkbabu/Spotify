package com.spotify.playlist.models;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

public final class f implements i<j> {
    private final String a;
    private final String b;
    private final int c;
    private final int f;
    private final int n;
    private final int o;
    private final String p;
    private final int q;
    private final String r;
    private final List<j> s;
    private final boolean t;
    private final int u;
    private final int v;

    public static final class a {
        private String a;
        private int b;
        private String c;
        private int d;
        private String e;
        private int f;
        private int g;
        private int h;
        private boolean i;
        private String j;
        private int k;
        private int l;
        private List<j> m;

        public a(String str, int i2, String str2, int i3, String str3, int i4, int i5, int i6, boolean z, String str4, int i7, int i8, List<j> list) {
            h.e(str, "uri");
            h.e(str2, "name");
            h.e(list, "items");
            this.a = str;
            this.b = i2;
            this.c = str2;
            this.d = i3;
            this.e = str3;
            this.f = i4;
            this.g = i5;
            this.h = i6;
            this.i = z;
            this.j = str4;
            this.k = i7;
            this.l = i8;
            this.m = list;
        }

        public final a a(int i2) {
            this.b = i2;
            return this;
        }

        public final f b() {
            String str = this.a;
            String str2 = this.c;
            List<j> list = this.m;
            String str3 = this.e;
            int i2 = this.b;
            boolean z = this.i;
            int i3 = this.d;
            String str4 = this.j;
            int i4 = this.f;
            int i5 = this.g;
            return new f(str2, str, i3, i4, this.k, this.l, str3, i2, str4, list, z, this.h, i5);
        }

        public final a c(String str) {
            this.j = str;
            return this;
        }

        public final a d(List<j> list) {
            h.e(list, "playlists");
            this.m = list;
            return this;
        }

        public final a e(boolean z) {
            this.i = z;
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && this.b == aVar.b && h.a(this.c, aVar.c) && this.d == aVar.d && h.a(this.e, aVar.e) && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && h.a(this.j, aVar.j) && this.k == aVar.k && this.l == aVar.l && h.a(this.m, aVar.m);
        }

        public final a f(String str) {
            h.e(str, "name");
            this.c = str;
            return this;
        }

        public final a g(int i2) {
            this.d = i2;
            return this;
        }

        public final a h(int i2) {
            this.f = i2;
            return this;
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.b) * 31;
            String str2 = this.c;
            int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.d) * 31;
            String str3 = this.e;
            int hashCode3 = (((((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31;
            boolean z = this.i;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = (hashCode3 + i3) * 31;
            String str4 = this.j;
            int hashCode4 = (((((i6 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.k) * 31) + this.l) * 31;
            List<j> list = this.m;
            if (list != null) {
                i2 = list.hashCode();
            }
            return hashCode4 + i2;
        }

        public final a i(int i2) {
            this.k = i2;
            return this;
        }

        public final a j(int i2) {
            this.l = i2;
            return this;
        }

        public final a k(String str) {
            this.e = str;
            return this;
        }

        public final a l(int i2) {
            this.h = i2;
            return this;
        }

        public final a m(int i2) {
            this.g = i2;
            return this;
        }

        public final a n(String str) {
            h.e(str, "uri");
            this.a = str;
            return this;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(uri=");
            V0.append(this.a);
            V0.append(", addTime=");
            V0.append(this.b);
            V0.append(", name=");
            V0.append(this.c);
            V0.append(", numFolders=");
            V0.append(this.d);
            V0.append(", rowId=");
            V0.append(this.e);
            V0.append(", numPlaylists=");
            V0.append(this.f);
            V0.append(", unrangedLength=");
            V0.append(this.g);
            V0.append(", unfilteredLength=");
            V0.append(this.h);
            V0.append(", isLoading=");
            V0.append(this.i);
            V0.append(", groupLabel=");
            V0.append(this.j);
            V0.append(", numRecursiveFolders=");
            V0.append(this.k);
            V0.append(", numRecursivePlaylists=");
            V0.append(this.l);
            V0.append(", items=");
            return je.L0(V0, this.m, ")");
        }

        public a() {
            this("", 0, "", 0, null, 0, 0, 0, false, null, 0, 0, EmptyList.a);
        }
    }

    public f(String str, String str2, int i, int i2, int i3, int i4, String str3, int i5, String str4, List<j> list, boolean z, int i6, int i7) {
        h.e(str, "name");
        h.e(str2, "uri");
        h.e(list, "items");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.f = i2;
        this.n = i3;
        this.o = i4;
        this.p = str3;
        this.q = i5;
        this.r = str4;
        this.s = list;
        this.t = z;
        this.u = i6;
        this.v = i7;
    }

    public final int a() {
        return this.q;
    }

    public final String b() {
        return this.r;
    }

    public final String c() {
        return this.a;
    }

    public final int d() {
        return this.c;
    }

    public final int e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return h.a(this.a, fVar.a) && h.a(this.b, fVar.b) && this.c == fVar.c && this.f == fVar.f && this.n == fVar.n && this.o == fVar.o && h.a(this.p, fVar.p) && this.q == fVar.q && h.a(this.r, fVar.r) && h.a(this.s, fVar.s) && this.t == fVar.t && this.u == fVar.u && this.v == fVar.v;
    }

    public final String f() {
        return this.b;
    }

    @Override // com.spotify.playlist.models.i
    public List<j> getItems() {
        return this.s;
    }

    @Override // com.spotify.playlist.models.i
    public int getUnfilteredLength() {
        return this.u;
    }

    @Override // com.spotify.playlist.models.i
    public int getUnrangedLength() {
        return this.v;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (((((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.c) * 31) + this.f) * 31) + this.n) * 31) + this.o) * 31;
        String str3 = this.p;
        int hashCode3 = (((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.q) * 31;
        String str4 = this.r;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List<j> list = this.s;
        if (list != null) {
            i = list.hashCode();
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z = this.t;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return ((((i2 + i3) * 31) + this.u) * 31) + this.v;
    }

    @Override // com.spotify.playlist.models.i
    public boolean isLoading() {
        return this.t;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Folder(name=");
        V0.append(this.a);
        V0.append(", uri=");
        V0.append(this.b);
        V0.append(", numFolders=");
        V0.append(this.c);
        V0.append(", numPlaylists=");
        V0.append(this.f);
        V0.append(", numRecursiveFolders=");
        V0.append(this.n);
        V0.append(", numRecursivePlaylists=");
        V0.append(this.o);
        V0.append(", rowId=");
        V0.append(this.p);
        V0.append(", addTime=");
        V0.append(this.q);
        V0.append(", groupLabel=");
        V0.append(this.r);
        V0.append(", items=");
        V0.append(this.s);
        V0.append(", isLoading=");
        V0.append(this.t);
        V0.append(", unfilteredLength=");
        V0.append(this.u);
        V0.append(", unrangedLength=");
        return je.B0(V0, this.v, ")");
    }
}
