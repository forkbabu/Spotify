package androidx.work;

import android.os.Build;

public final class b {
    public static final b i = new a().a();
    private NetworkType a = NetworkType.NOT_REQUIRED;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private long f = -1;
    private long g = -1;
    private c h = new c();

    public static final class a {
        boolean a = false;
        NetworkType b = NetworkType.NOT_REQUIRED;
        c c = new c();

        public b a() {
            return new b(this);
        }

        public a b(NetworkType networkType) {
            this.b = networkType;
            return this;
        }

        public a c(boolean z) {
            this.a = z;
            return this;
        }
    }

    public b() {
    }

    public c a() {
        return this.h;
    }

    public NetworkType b() {
        return this.a;
    }

    public long c() {
        return this.f;
    }

    public long d() {
        return this.g;
    }

    public boolean e() {
        return this.h.c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && this.a == bVar.a) {
            return this.h.equals(bVar.h);
        }
        return false;
    }

    public boolean f() {
        return this.d;
    }

    public boolean g() {
        return this.b;
    }

    public boolean h() {
        return this.c;
    }

    public int hashCode() {
        long j = this.f;
        long j2 = this.g;
        return this.h.hashCode() + (((((((((((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public boolean i() {
        return this.e;
    }

    public void j(c cVar) {
        this.h = cVar;
    }

    public void k(NetworkType networkType) {
        this.a = networkType;
    }

    public void l(boolean z) {
        this.d = z;
    }

    public void m(boolean z) {
        this.b = z;
    }

    public void n(boolean z) {
        this.c = z;
    }

    public void o(boolean z) {
        this.e = z;
    }

    public void p(long j) {
        this.f = j;
    }

    public void q(long j) {
        this.g = j;
    }

    b(a aVar) {
        this.b = aVar.a;
        int i2 = Build.VERSION.SDK_INT;
        this.c = false;
        this.a = aVar.b;
        this.d = false;
        this.e = false;
        if (i2 >= 24) {
            this.h = aVar.c;
            this.f = -1;
            this.g = -1;
        }
    }

    public b(b bVar) {
        this.b = bVar.b;
        this.c = bVar.c;
        this.a = bVar.a;
        this.d = bVar.d;
        this.e = bVar.e;
        this.h = bVar.h;
    }
}
