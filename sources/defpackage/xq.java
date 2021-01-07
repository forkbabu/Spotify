package defpackage;

import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.media.h;
import com.google.android.gms.cast.internal.a;
import com.google.android.gms.cast.j;
import com.google.android.gms.cast.m;
import com.google.android.gms.cast.o;

/* renamed from: xq  reason: default package */
public final class xq {
    h a;

    private xq() {
    }

    private final j b() {
        MediaInfo h;
        h hVar = this.a;
        if (hVar == null || !hVar.m() || (h = this.a.h()) == null) {
            return null;
        }
        return h.Q1();
    }

    public static xq c() {
        return new xq();
    }

    private final Long i() {
        h hVar = this.a;
        if (hVar != null && hVar.m() && this.a.o()) {
            MediaInfo h = this.a.h();
            j b = b();
            if (h != null && b != null && b.I1("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA") && (b.I1("com.google.android.gms.cast.metadata.SECTION_DURATION") || this.a.t())) {
                return Long.valueOf(b.r2("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA"));
            }
        }
        return null;
    }

    private final Long j() {
        o i;
        h hVar = this.a;
        if (hVar == null || !hVar.m() || !this.a.o() || !this.a.t() || (i = this.a.i()) == null || i.r2() == null) {
            return null;
        }
        return Long.valueOf(this.a.e());
    }

    private final Long k() {
        o i;
        h hVar = this.a;
        if (hVar == null || !hVar.m() || !this.a.o() || !this.a.t() || (i = this.a.i()) == null || i.r2() == null) {
            return null;
        }
        return Long.valueOf(this.a.d());
    }

    public final int a() {
        j b;
        Long i;
        MediaInfo o2;
        h hVar = this.a;
        long j = 1;
        if (hVar != null && hVar.m()) {
            if (this.a.o()) {
                h hVar2 = this.a;
                Long l = null;
                if (hVar2 != null && hVar2.m() && this.a.o() && (b = b()) != null && b.I1("com.google.android.gms.cast.metadata.SECTION_DURATION") && (i = i()) != null) {
                    l = Long.valueOf(b.r2("com.google.android.gms.cast.metadata.SECTION_DURATION") + i.longValue());
                }
                if (l != null) {
                    j = l.longValue();
                } else {
                    Long k = k();
                    j = k != null ? k.longValue() : Math.max(this.a.f(), 1L);
                }
            } else if (this.a.p()) {
                m g = this.a.g();
                if (!(g == null || (o2 = g.o2()) == null)) {
                    j = Math.max(o2.o2(), 1L);
                }
            } else {
                j = Math.max(this.a.l(), 1L);
            }
        }
        return Math.max((int) (j - h()), 1);
    }

    public final int d() {
        h hVar = this.a;
        if (hVar == null || !hVar.m()) {
            return 0;
        }
        if (!this.a.o() && this.a.p()) {
            return 0;
        }
        int f = (int) (this.a.f() - h());
        if (this.a.t()) {
            f = a.f(f, f(), g());
        }
        return a.f(f, 0, a());
    }

    public final boolean e() {
        long h = h() + ((long) d());
        h hVar = this.a;
        if (hVar == null || !hVar.m() || !this.a.t()) {
            return false;
        }
        if ((h() + ((long) g())) - h < 10000) {
            return true;
        }
        return false;
    }

    public final int f() {
        h hVar = this.a;
        if (hVar == null || !hVar.m() || !this.a.o() || !this.a.t()) {
            return 0;
        }
        return a.f((int) (j().longValue() - h()), 0, a());
    }

    public final int g() {
        h hVar = this.a;
        if (hVar == null || !hVar.m() || !this.a.o()) {
            return a();
        }
        if (!this.a.t()) {
            return 0;
        }
        return a.f((int) (k().longValue() - h()), 0, a());
    }

    public final long h() {
        h hVar = this.a;
        if (hVar == null || !hVar.m() || !this.a.o()) {
            return 0;
        }
        Long i = i();
        if (i != null) {
            return i.longValue();
        }
        Long j = j();
        if (j != null) {
            return j.longValue();
        }
        return this.a.f();
    }
}
