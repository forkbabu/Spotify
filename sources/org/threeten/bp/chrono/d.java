package org.threeten.bp.chrono;

import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.chrono.a;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.c;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;
import org.threeten.bp.temporal.h;
import org.threeten.bp.temporal.i;

public abstract class d<D extends a> extends bqf implements org.threeten.bp.temporal.a, Comparable<d<?>> {
    /* renamed from: A */
    public d<D> p(long j, i iVar) {
        return D().z().l(super.p(j, iVar));
    }

    /* renamed from: B */
    public abstract d<D> v(long j, i iVar);

    public long C() {
        return ((D().F() * 86400) + ((long) G().W())) - ((long) x().C());
    }

    public D D() {
        return F().F();
    }

    public abstract b<D> F();

    public LocalTime G() {
        return F().G();
    }

    /* renamed from: I */
    public d<D> s(c cVar) {
        return D().z().l(cVar.g(this));
    }

    /* renamed from: J */
    public abstract d<D> d(f fVar, long j);

    public abstract d<D> L(ZoneId zoneId);

    public abstract d<D> M(ZoneId zoneId);

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d) || compareTo((d) obj) != 0) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return (F().hashCode() ^ x().hashCode()) ^ Integer.rotateLeft(z().hashCode(), 3);
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public ValueRange k(f fVar) {
        if (!(fVar instanceof ChronoField)) {
            return fVar.i(this);
        }
        if (fVar == ChronoField.INSTANT_SECONDS || fVar == ChronoField.OFFSET_SECONDS) {
            return fVar.k();
        }
        return F().k(fVar);
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public <R> R m(h<R> hVar) {
        return (hVar == g.g() || hVar == g.f()) ? (R) z() : hVar == g.a() ? (R) D().z() : hVar == g.e() ? (R) ChronoUnit.NANOS : hVar == g.d() ? (R) x() : hVar == g.b() ? (R) LocalDate.o0(D().F()) : hVar == g.c() ? (R) G() : (R) super.m(hVar);
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public int r(f fVar) {
        if (!(fVar instanceof ChronoField)) {
            return super.r(fVar);
        }
        int ordinal = ((ChronoField) fVar).ordinal();
        if (ordinal == 28) {
            throw new UnsupportedTemporalTypeException(je.z0("Field too large for an int: ", fVar));
        } else if (ordinal != 29) {
            return F().r(fVar);
        } else {
            return x().C();
        }
    }

    @Override // java.lang.Object
    public String toString() {
        String str = F().toString() + x().toString();
        if (x() == z()) {
            return str;
        }
        return str + '[' + z().toString() + ']';
    }

    @Override // org.threeten.bp.temporal.b
    public long u(f fVar) {
        if (!(fVar instanceof ChronoField)) {
            return fVar.l(this);
        }
        int ordinal = ((ChronoField) fVar).ordinal();
        if (ordinal == 28) {
            return C();
        }
        if (ordinal != 29) {
            return F().u(fVar);
        }
        return (long) x().C();
    }

    /* renamed from: w */
    public int compareTo(d<?> dVar) {
        int l = yif.l(C(), dVar.C());
        if (l != 0) {
            return l;
        }
        int C = G().C() - dVar.G().C();
        if (C != 0) {
            return C;
        }
        int x = F().compareTo(dVar.F());
        if (x != 0) {
            return x;
        }
        int compareTo = z().i().compareTo(dVar.z().i());
        return compareTo == 0 ? D().z().compareTo(dVar.D().z()) : compareTo;
    }

    public abstract ZoneOffset x();

    public abstract ZoneId z();
}
