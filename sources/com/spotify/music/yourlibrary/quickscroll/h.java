package com.spotify.music.yourlibrary.quickscroll;

import com.spotify.music.yourlibrary.quickscroll.k;

/* access modifiers changed from: package-private */
public final class h extends k {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final long d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final boolean m;
    private final boolean n;

    /* access modifiers changed from: package-private */
    public static final class b implements k.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Long d;
        private Integer e;
        private Integer f;
        private Integer g;
        private Integer h;
        private Integer i;
        private Integer j;
        private Integer k;
        private Integer l;
        private Boolean m;
        private Boolean n;

        b() {
        }

        public k.a a(int i2) {
            this.g = Integer.valueOf(i2);
            return this;
        }

        public k b() {
            String str = this.a == null ? " isRTL" : "";
            if (this.b == null) {
                str = je.x0(str, " initiallyVisible");
            }
            if (this.c == null) {
                str = je.x0(str, " withHandler");
            }
            if (this.d == null) {
                str = je.x0(str, " inactivityDuration");
            }
            if (this.e == null) {
                str = je.x0(str, " initialIndicatorPadding");
            }
            if (this.f == null) {
                str = je.x0(str, " offsetIndicatorPadding");
            }
            if (this.g == null) {
                str = je.x0(str, " alphaAnimationDuration");
            }
            if (this.h == null) {
                str = je.x0(str, " paddingAnimationDuration");
            }
            if (this.i == null) {
                str = je.x0(str, " handlerBackgroundColor");
            }
            if (this.j == null) {
                str = je.x0(str, " handlerArrowsColor");
            }
            if (this.k == null) {
                str = je.x0(str, " indicatorBackgroundColor");
            }
            if (this.l == null) {
                str = je.x0(str, " indicatorTextColor");
            }
            if (this.m == null) {
                str = je.x0(str, " shouldDisappearOnTop");
            }
            if (this.n == null) {
                str = je.x0(str, " shouldDisappearOnBottom");
            }
            if (str.isEmpty()) {
                return new h(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.longValue(), this.e.intValue(), this.f.intValue(), this.g.intValue(), this.h.intValue(), this.i.intValue(), this.j.intValue(), this.k.intValue(), this.l.intValue(), this.m.booleanValue(), this.n.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public k.a c(int i2) {
            this.j = Integer.valueOf(i2);
            return this;
        }

        public k.a d(int i2) {
            this.i = Integer.valueOf(i2);
            return this;
        }

        public k.a e(long j2) {
            this.d = Long.valueOf(j2);
            return this;
        }

        public k.a f(int i2) {
            this.k = Integer.valueOf(i2);
            return this;
        }

        public k.a g(int i2) {
            this.l = Integer.valueOf(i2);
            return this;
        }

        public k.a h(int i2) {
            this.e = Integer.valueOf(i2);
            return this;
        }

        public k.a i(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public k.a j(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public k.a k(int i2) {
            this.f = Integer.valueOf(i2);
            return this;
        }

        public k.a l(int i2) {
            this.h = Integer.valueOf(i2);
            return this;
        }

        public k.a m(boolean z) {
            this.n = Boolean.valueOf(z);
            return this;
        }

        public k.a n(boolean z) {
            this.m = Boolean.valueOf(z);
            return this;
        }

        public k.a o(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        b(k kVar, a aVar) {
            this.a = Boolean.valueOf(kVar.i());
            this.b = Boolean.valueOf(kVar.h());
            this.c = Boolean.valueOf(kVar.o());
            this.d = Long.valueOf(kVar.d());
            this.e = Integer.valueOf(kVar.g());
            this.f = Integer.valueOf(kVar.j());
            this.g = Integer.valueOf(kVar.a());
            this.h = Integer.valueOf(kVar.k());
            this.i = Integer.valueOf(kVar.c());
            this.j = Integer.valueOf(kVar.b());
            this.k = Integer.valueOf(kVar.e());
            this.l = Integer.valueOf(kVar.f());
            this.m = Boolean.valueOf(kVar.m());
            this.n = Boolean.valueOf(kVar.l());
        }
    }

    h(boolean z, boolean z2, boolean z3, long j2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z4, boolean z5, a aVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = j2;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = i6;
        this.j = i7;
        this.k = i8;
        this.l = i9;
        this.m = z4;
        this.n = z5;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.yourlibrary.quickscroll.k
    public int a() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.yourlibrary.quickscroll.k
    public int b() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.yourlibrary.quickscroll.k
    public int c() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.yourlibrary.quickscroll.k
    public long d() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.yourlibrary.quickscroll.k
    public int e() {
        return this.k;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.a == kVar.i() && this.b == kVar.h() && this.c == kVar.o() && this.d == kVar.d() && this.e == kVar.g() && this.f == kVar.j() && this.g == kVar.a() && this.h == kVar.k() && this.i == kVar.c() && this.j == kVar.b() && this.k == kVar.e() && this.l == kVar.f() && this.m == kVar.m() && this.n == kVar.l()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.yourlibrary.quickscroll.k
    public int f() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.yourlibrary.quickscroll.k
    public int g() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.yourlibrary.quickscroll.k
    public boolean h() {
        return this.b;
    }

    public int hashCode() {
        int i2 = 1231;
        int i3 = ((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003;
        int i4 = this.c ? 1231 : 1237;
        long j2 = this.d;
        int i5 = (((((((((((((((((((((i3 ^ i4) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003) ^ this.k) * 1000003) ^ this.l) * 1000003) ^ (this.m ? 1231 : 1237)) * 1000003;
        if (!this.n) {
            i2 = 1237;
        }
        return i5 ^ i2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.yourlibrary.quickscroll.k
    public boolean i() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.yourlibrary.quickscroll.k
    public int j() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.yourlibrary.quickscroll.k
    public int k() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.yourlibrary.quickscroll.k
    public boolean l() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.yourlibrary.quickscroll.k
    public boolean m() {
        return this.m;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.yourlibrary.quickscroll.k
    public k.a n() {
        return new b(this, null);
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.yourlibrary.quickscroll.k
    public boolean o() {
        return this.c;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Config{isRTL=");
        V0.append(this.a);
        V0.append(", initiallyVisible=");
        V0.append(this.b);
        V0.append(", withHandler=");
        V0.append(this.c);
        V0.append(", inactivityDuration=");
        V0.append(this.d);
        V0.append(", initialIndicatorPadding=");
        V0.append(this.e);
        V0.append(", offsetIndicatorPadding=");
        V0.append(this.f);
        V0.append(", alphaAnimationDuration=");
        V0.append(this.g);
        V0.append(", paddingAnimationDuration=");
        V0.append(this.h);
        V0.append(", handlerBackgroundColor=");
        V0.append(this.i);
        V0.append(", handlerArrowsColor=");
        V0.append(this.j);
        V0.append(", indicatorBackgroundColor=");
        V0.append(this.k);
        V0.append(", indicatorTextColor=");
        V0.append(this.l);
        V0.append(", shouldDisappearOnTop=");
        V0.append(this.m);
        V0.append(", shouldDisappearOnBottom=");
        return je.P0(V0, this.n, "}");
    }
}
