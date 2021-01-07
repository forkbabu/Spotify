package org.threeten.bp.chrono;

import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.chrono.a;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.c;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;
import org.threeten.bp.temporal.h;
import org.threeten.bp.temporal.i;

public abstract class b<D extends a> extends bqf implements org.threeten.bp.temporal.a, c, Comparable<b<?>> {
    /* renamed from: A */
    public b<D> p(long j, i iVar) {
        return F().z().k(super.p(j, iVar));
    }

    /* renamed from: B */
    public abstract b<D> v(long j, i iVar);

    public long C(ZoneOffset zoneOffset) {
        yif.J(zoneOffset, "offset");
        return ((F().F() * 86400) + ((long) G().W())) - ((long) zoneOffset.C());
    }

    public Instant D(ZoneOffset zoneOffset) {
        return Instant.G(C(zoneOffset), (long) G().C());
    }

    public abstract D F();

    public abstract LocalTime G();

    /* renamed from: I */
    public b<D> s(c cVar) {
        return F().z().k(cVar.g(this));
    }

    /* renamed from: J */
    public abstract b<D> d(f fVar, long j);

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b) || compareTo((b) obj) != 0) {
            return false;
        }
        return true;
    }

    @Override // org.threeten.bp.temporal.c
    public org.threeten.bp.temporal.a g(org.threeten.bp.temporal.a aVar) {
        return aVar.d(ChronoField.EPOCH_DAY, F().F()).d(ChronoField.NANO_OF_DAY, G().U());
    }

    @Override // java.lang.Object
    public int hashCode() {
        return F().hashCode() ^ G().hashCode();
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public <R> R m(h<R> hVar) {
        if (hVar == g.a()) {
            return (R) z();
        }
        if (hVar == g.e()) {
            return (R) ChronoUnit.NANOS;
        }
        if (hVar == g.b()) {
            return (R) LocalDate.o0(F().F());
        }
        if (hVar == g.c()) {
            return (R) G();
        }
        if (hVar == g.f() || hVar == g.g() || hVar == g.d()) {
            return null;
        }
        return (R) super.m(hVar);
    }

    @Override // java.lang.Object
    public String toString() {
        return F().toString() + 'T' + G().toString();
    }

    public abstract d<D> w(ZoneId zoneId);

    /* renamed from: x */
    public int compareTo(b<?> bVar) {
        int x = F().compareTo(bVar.F());
        if (x != 0) {
            return x;
        }
        int w = G().compareTo(bVar.G());
        return w == 0 ? z().compareTo(bVar.z()) : w;
    }

    public e z() {
        return F().z();
    }
}
