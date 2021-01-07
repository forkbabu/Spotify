package defpackage;

import defpackage.a61;
import defpackage.u51;
import defpackage.v51;

/* renamed from: w51  reason: default package */
public final class w51 {
    private final p61 a;
    private final d81 b;
    private final o61 c;
    private final u51 d;
    private final v51 e;
    private final v51 f;
    private final a61 g;
    private final v51 h;
    private final s51<?> i;
    private final l61 j;

    /* renamed from: w51$b */
    public static class b {
        private p61 a = g61.b;
        private d81 b;
        private a61 c;
        private v51 d;
        private u51 e;
        private v51 f;
        private s51<?> g;
        private l61 h;

        public b() {
            int i = p61.a;
            int i2 = d81.a;
            this.b = c81.b;
            int i3 = a61.a.a;
            this.c = o51.a;
            int i4 = v51.a.a;
            k51 k51 = k51.a;
            this.d = k51;
            int i5 = u51.b.a;
            this.e = i51.a;
            this.f = k51;
            this.h = l61.a;
        }

        public w51 a() {
            s51<?> s51 = this.g;
            if (s51 != null) {
                return new w51(this.a, this.b, this.e, this.d, this.f, this.c, s51, this.h, null);
            }
            throw new IllegalStateException("No fallback binder set!");
        }

        public b b(p61 p61) {
            p61.getClass();
            this.a = p61;
            return this;
        }

        public b c(v51 v51) {
            v51.getClass();
            this.d = v51;
            return this;
        }

        public b d(s51<?> s51) {
            s51.getClass();
            this.g = s51;
            return this;
        }

        public b e(v51 v51) {
            v51.getClass();
            this.f = v51;
            return this;
        }

        @Deprecated
        public b f(d81 d81) {
            d81.getClass();
            this.b = d81;
            return this;
        }

        public b g(u51... u51Arr) {
            this.e = u51.b.a(u51Arr);
            return this;
        }

        public b h(l61 l61) {
            l61.getClass();
            this.h = l61;
            return this;
        }

        public b i(a61 a61) {
            a61.getClass();
            this.c = a61;
            return this;
        }

        public b j(int i, String str, s51<?> s51) {
            int i2 = u51.b.a;
            l(new u51.b.C0687b(i, s51, null));
            int i3 = v51.a.a;
            str.getClass();
            m(new j51(str, i));
            return this;
        }

        public b k(a61 a61) {
            a61 a612 = this.c;
            int i = a61.a.a;
            a612.getClass();
            a61.getClass();
            o51 o51 = o51.a;
            if (a612 != o51) {
                if (a61 == o51) {
                    a61 = a612;
                } else {
                    a61 = new n51(a612, a61);
                }
            }
            this.c = a61;
            return this;
        }

        public b l(u51... u51Arr) {
            g(this.e, u51.b.a(u51Arr));
            return this;
        }

        public b m(v51 v51) {
            v51.getClass();
            this.d = v51.a.a(v51, this.d);
            return this;
        }
    }

    w51(p61 p61, d81 d81, u51 u51, v51 v51, v51 v512, a61 a61, s51 s51, l61 l61, a aVar) {
        p61.getClass();
        this.a = p61;
        this.c = o61.b(p61);
        d81.getClass();
        this.b = d81;
        u51.getClass();
        this.d = u51;
        v512.getClass();
        this.f = v512;
        v51.getClass();
        this.e = v51;
        a61.getClass();
        this.g = a61;
        s51.getClass();
        this.i = s51;
        this.h = v51.a.a(v51, v512);
        l61.getClass();
        this.j = l61;
    }

    public l61 a() {
        return this.j;
    }

    public o61 b() {
        return this.c;
    }

    public v51 c() {
        return this.h;
    }

    public s51<?> d() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public d81 e() {
        return this.b;
    }

    public a61 f() {
        return this.g;
    }

    public u51 g() {
        return this.d;
    }

    public b h() {
        b bVar = new b();
        bVar.b(this.a);
        bVar.f(this.b);
        bVar.g(this.d);
        bVar.c(this.e);
        bVar.e(this.f);
        bVar.i(this.g);
        bVar.d(this.i);
        bVar.h(this.j);
        return bVar;
    }
}
