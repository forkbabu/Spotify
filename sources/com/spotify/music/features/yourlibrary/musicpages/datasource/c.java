package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.yourlibrary.musicpages.datasource.y3;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;

/* access modifiers changed from: package-private */
public abstract class c extends y3 {
    private final boolean c;
    private final int f;
    private final int n;
    private final ImmutableList<MusicItem> o;
    private final MusicItem p;
    private final x3 q;
    private final y3 r;

    /* access modifiers changed from: package-private */
    public static class b extends y3.a {
        private Boolean a;
        private Integer b;
        private Integer c;
        private ImmutableList<MusicItem> d;
        private MusicItem e;
        private x3 f;
        private y3 g;

        b() {
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.y3.a
        public y3 a() {
            String str = this.a == null ? " isLoading" : "";
            if (this.b == null) {
                str = je.x0(str, " dataSourceCount");
            }
            if (this.c == null) {
                str = je.x0(str, " dataSourceOffset");
            }
            if (this.d == null) {
                str = je.x0(str, " items");
            }
            if (this.e == null) {
                str = je.x0(str, " placeholder");
            }
            if (str.isEmpty()) {
                return new v3(this.a.booleanValue(), this.b.intValue(), this.c.intValue(), this.d, this.e, this.f, this.g);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.y3.a
        public y3.a b(x3 x3Var) {
            this.f = x3Var;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.y3.a
        public y3.a c(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.y3.a
        public y3.a d(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.y3.a
        public y3.a e(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.y3.a
        public y3.a f(ImmutableList<MusicItem> immutableList) {
            if (immutableList != null) {
                this.d = immutableList;
                return this;
            }
            throw new NullPointerException("Null items");
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.y3.a
        public y3.a g(y3 y3Var) {
            this.g = y3Var;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.y3.a
        public y3.a h(MusicItem musicItem) {
            if (musicItem != null) {
                this.e = musicItem;
                return this;
            }
            throw new NullPointerException("Null placeholder");
        }

        b(y3 y3Var, a aVar) {
            this.a = Boolean.valueOf(y3Var.h());
            this.b = Integer.valueOf(y3Var.b());
            this.c = Integer.valueOf(y3Var.c());
            this.d = y3Var.i();
            this.e = y3Var.k();
            this.f = y3Var.a();
            this.g = y3Var.j();
        }
    }

    c(boolean z, int i, int i2, ImmutableList<MusicItem> immutableList, MusicItem musicItem, x3 x3Var, y3 y3Var) {
        this.c = z;
        this.f = i;
        this.n = i2;
        if (immutableList != null) {
            this.o = immutableList;
            if (musicItem != null) {
                this.p = musicItem;
                this.q = x3Var;
                this.r = y3Var;
                return;
            }
            throw new NullPointerException("Null placeholder");
        }
        throw new NullPointerException("Null items");
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.y3
    public x3 a() {
        return this.q;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.y3
    public int b() {
        return this.f;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.y3
    public int c() {
        return this.n;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        x3 x3Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj;
        if (this.c == y3Var.h() && this.f == y3Var.b() && this.n == y3Var.c() && this.o.equals(y3Var.i()) && this.p.equals(y3Var.k()) && ((x3Var = this.q) != null ? x3Var.equals(y3Var.a()) : y3Var.a() == null)) {
            y3 y3Var2 = this.r;
            if (y3Var2 == null) {
                if (y3Var.j() == null) {
                    return true;
                }
            } else if (y3Var2.equals(y3Var.j())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.y3
    public boolean h() {
        return this.c;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = ((((((((((this.c ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.f) * 1000003) ^ this.n) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003;
        x3 x3Var = this.q;
        int i = 0;
        int hashCode2 = (hashCode ^ (x3Var == null ? 0 : x3Var.hashCode())) * 1000003;
        y3 y3Var = this.r;
        if (y3Var != null) {
            i = y3Var.hashCode();
        }
        return hashCode2 ^ i;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.y3
    public ImmutableList<MusicItem> i() {
        return this.o;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.y3
    public y3 j() {
        return this.r;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.y3
    public MusicItem k() {
        return this.p;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.y3
    public y3.a l() {
        return new b(this, null);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("DataSourceViewport{isLoading=");
        V0.append(this.c);
        V0.append(", dataSourceCount=");
        V0.append(this.f);
        V0.append(", dataSourceOffset=");
        V0.append(this.n);
        V0.append(", items=");
        V0.append(this.o);
        V0.append(", placeholder=");
        V0.append(this.p);
        V0.append(", dataSourceConfiguration=");
        V0.append(this.q);
        V0.append(", next=");
        V0.append(this.r);
        V0.append("}");
        return V0.toString();
    }
}
