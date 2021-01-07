package org.threeten.bp.temporal;

import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZoneOffset;

public final class g {
    static final h<ZoneId> a = new a();
    static final h<org.threeten.bp.chrono.e> b = new b();
    static final h<i> c = new c();
    static final h<ZoneId> d = new d();
    static final h<ZoneOffset> e = new e();
    static final h<LocalDate> f = new f();
    static final h<LocalTime> g = new C0666g();

    static class a implements h<ZoneId> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // org.threeten.bp.temporal.h
        public ZoneId a(b bVar) {
            return (ZoneId) bVar.m(this);
        }
    }

    static class b implements h<org.threeten.bp.chrono.e> {
        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // org.threeten.bp.temporal.h
        public org.threeten.bp.chrono.e a(b bVar) {
            return (org.threeten.bp.chrono.e) bVar.m(this);
        }
    }

    static class c implements h<i> {
        c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // org.threeten.bp.temporal.h
        public i a(b bVar) {
            return (i) bVar.m(this);
        }
    }

    static class d implements h<ZoneId> {
        d() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // org.threeten.bp.temporal.h
        public ZoneId a(b bVar) {
            ZoneId zoneId = (ZoneId) bVar.m(g.a);
            return zoneId != null ? zoneId : (ZoneId) bVar.m(g.e);
        }
    }

    static class e implements h<ZoneOffset> {
        e() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // org.threeten.bp.temporal.h
        public ZoneOffset a(b bVar) {
            ChronoField chronoField = ChronoField.OFFSET_SECONDS;
            if (bVar.n(chronoField)) {
                return ZoneOffset.G(bVar.r(chronoField));
            }
            return null;
        }
    }

    static class f implements h<LocalDate> {
        f() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // org.threeten.bp.temporal.h
        public LocalDate a(b bVar) {
            ChronoField chronoField = ChronoField.EPOCH_DAY;
            if (bVar.n(chronoField)) {
                return LocalDate.o0(bVar.u(chronoField));
            }
            return null;
        }
    }

    /* renamed from: org.threeten.bp.temporal.g$g  reason: collision with other inner class name */
    static class C0666g implements h<LocalTime> {
        C0666g() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // org.threeten.bp.temporal.h
        public LocalTime a(b bVar) {
            ChronoField chronoField = ChronoField.NANO_OF_DAY;
            if (bVar.n(chronoField)) {
                return LocalTime.J(bVar.u(chronoField));
            }
            return null;
        }
    }

    public static final h<org.threeten.bp.chrono.e> a() {
        return b;
    }

    public static final h<LocalDate> b() {
        return f;
    }

    public static final h<LocalTime> c() {
        return g;
    }

    public static final h<ZoneOffset> d() {
        return e;
    }

    public static final h<i> e() {
        return c;
    }

    public static final h<ZoneId> f() {
        return d;
    }

    public static final h<ZoneId> g() {
        return a;
    }
}
