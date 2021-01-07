package org.threeten.bp.chrono;

import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.Period;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.c;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;
import org.threeten.bp.temporal.h;
import org.threeten.bp.temporal.i;

public abstract class a extends bqf implements org.threeten.bp.temporal.a, c, Comparable<a> {
    public f A() {
        return z().m(r(ChronoField.ERA));
    }

    /* renamed from: B */
    public a p(long j, i iVar) {
        return z().i(super.p(j, iVar));
    }

    /* renamed from: C */
    public abstract a v(long j, i iVar);

    public a D(e eVar) {
        return z().i(((Period) eVar).a(this));
    }

    public long F() {
        return u(ChronoField.EPOCH_DAY);
    }

    /* renamed from: G */
    public a s(c cVar) {
        return z().i(cVar.g(this));
    }

    /* renamed from: I */
    public abstract a d(f fVar, long j);

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a) || compareTo((a) obj) != 0) {
            return false;
        }
        return true;
    }

    @Override // org.threeten.bp.temporal.c
    public org.threeten.bp.temporal.a g(org.threeten.bp.temporal.a aVar) {
        return aVar.d(ChronoField.EPOCH_DAY, F());
    }

    @Override // java.lang.Object
    public int hashCode() {
        long F = F();
        return z().hashCode() ^ ((int) (F ^ (F >>> 32)));
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public <R> R m(h<R> hVar) {
        if (hVar == g.a()) {
            return (R) z();
        }
        if (hVar == g.e()) {
            return (R) ChronoUnit.DAYS;
        }
        if (hVar == g.b()) {
            return (R) LocalDate.o0(F());
        }
        if (hVar == g.c() || hVar == g.f() || hVar == g.g() || hVar == g.d()) {
            return null;
        }
        return (R) super.m(hVar);
    }

    @Override // org.threeten.bp.temporal.b
    public boolean n(f fVar) {
        if (fVar instanceof ChronoField) {
            return fVar.d();
        }
        return fVar != null && fVar.h(this);
    }

    @Override // java.lang.Object
    public String toString() {
        long u = u(ChronoField.YEAR_OF_ERA);
        long u2 = u(ChronoField.MONTH_OF_YEAR);
        long u3 = u(ChronoField.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(z().toString());
        sb.append(" ");
        sb.append(A());
        sb.append(" ");
        sb.append(u);
        String str = "-0";
        sb.append(u2 < 10 ? str : "-");
        sb.append(u2);
        if (u3 >= 10) {
            str = "-";
        }
        sb.append(str);
        sb.append(u3);
        return sb.toString();
    }

    public b<?> w(LocalTime localTime) {
        return ChronoLocalDateTimeImpl.L(this, localTime);
    }

    /* renamed from: x */
    public int compareTo(a aVar) {
        int l = yif.l(F(), aVar.F());
        return l == 0 ? z().compareTo(aVar.z()) : l;
    }

    public abstract e z();
}
