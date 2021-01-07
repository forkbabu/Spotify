package org.threeten.bp.chrono;

import java.io.Serializable;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.Period;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.c;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.i;

public final class MinguoDate extends ChronoDateImpl<MinguoDate> implements Serializable {
    private static final long serialVersionUID = 1300372329181994526L;
    private final LocalDate isoDate;

    MinguoDate(LocalDate localDate) {
        yif.J(localDate, "date");
        this.isoDate = localDate;
    }

    private long O() {
        return ((((long) P()) * 12) + ((long) this.isoDate.T())) - 1;
    }

    private int P() {
        return this.isoDate.W() - 1911;
    }

    private MinguoDate Q(LocalDate localDate) {
        return localDate.equals(this.isoDate) ? this : new MinguoDate(localDate);
    }

    private Object writeReplace() {
        return new Ser((byte) 5, this);
    }

    @Override // org.threeten.bp.chrono.a
    public f A() {
        return (MinguoEra) super.A();
    }

    @Override // org.threeten.bp.chrono.a
    public a B(long j, i iVar) {
        return (MinguoDate) super.p(j, iVar);
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl, org.threeten.bp.chrono.a
    public a C(long j, i iVar) {
        return (MinguoDate) super.v(j, iVar);
    }

    @Override // org.threeten.bp.chrono.a
    public a D(e eVar) {
        return (MinguoDate) MinguoChronology.c.i(((Period) eVar).a(this));
    }

    @Override // org.threeten.bp.chrono.a
    public long F() {
        return this.isoDate.F();
    }

    @Override // org.threeten.bp.chrono.a
    public a G(c cVar) {
        return (MinguoDate) MinguoChronology.c.i(cVar.g(this));
    }

    /* Return type fixed from 'org.threeten.bp.chrono.ChronoDateImpl' to match base method */
    @Override // org.threeten.bp.chrono.ChronoDateImpl
    public ChronoDateImpl<MinguoDate> J(long j, i iVar) {
        return (MinguoDate) super.v(j, iVar);
    }

    /* Return type fixed from 'org.threeten.bp.chrono.ChronoDateImpl' to match base method */
    /* access modifiers changed from: package-private */
    @Override // org.threeten.bp.chrono.ChronoDateImpl
    public ChronoDateImpl<MinguoDate> L(long j) {
        return Q(this.isoDate.s0(j));
    }

    /* Return type fixed from 'org.threeten.bp.chrono.ChronoDateImpl' to match base method */
    /* access modifiers changed from: package-private */
    @Override // org.threeten.bp.chrono.ChronoDateImpl
    public ChronoDateImpl<MinguoDate> M(long j) {
        return Q(this.isoDate.t0(j));
    }

    /* Return type fixed from 'org.threeten.bp.chrono.ChronoDateImpl' to match base method */
    /* access modifiers changed from: package-private */
    @Override // org.threeten.bp.chrono.ChronoDateImpl
    public ChronoDateImpl<MinguoDate> N(long j) {
        return Q(this.isoDate.v0(j));
    }

    /* renamed from: S */
    public MinguoDate d(f fVar, long j) {
        if (!(fVar instanceof ChronoField)) {
            return (MinguoDate) fVar.g(this, j);
        }
        ChronoField chronoField = (ChronoField) fVar;
        if (u(chronoField) == j) {
            return this;
        }
        switch (chronoField.ordinal()) {
            case 24:
                MinguoChronology.c.z(chronoField).b(j, chronoField);
                return Q(this.isoDate.t0(j - O()));
            case 25:
            case 26:
            case 27:
                int a = MinguoChronology.c.z(chronoField).a(j, chronoField);
                switch (chronoField.ordinal()) {
                    case 25:
                        return Q(this.isoDate.D0(P() >= 1 ? a + 1911 : (1 - a) + 1911));
                    case 26:
                        return Q(this.isoDate.D0(a + 1911));
                    case 27:
                        return Q(this.isoDate.D0((1 - P()) + 1911));
                }
        }
        return Q(this.isoDate.d(fVar, j));
    }

    @Override // org.threeten.bp.chrono.a, java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MinguoDate) {
            return this.isoDate.equals(((MinguoDate) obj).isoDate);
        }
        return false;
    }

    @Override // org.threeten.bp.chrono.a, java.lang.Object
    public int hashCode() {
        MinguoChronology minguoChronology = MinguoChronology.c;
        return -1990173233 ^ this.isoDate.hashCode();
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public ValueRange k(f fVar) {
        if (!(fVar instanceof ChronoField)) {
            return fVar.i(this);
        }
        if (n(fVar)) {
            ChronoField chronoField = (ChronoField) fVar;
            int ordinal = chronoField.ordinal();
            if (ordinal == 18 || ordinal == 19 || ordinal == 21) {
                return this.isoDate.k(fVar);
            }
            if (ordinal != 25) {
                return MinguoChronology.c.z(chronoField);
            }
            ValueRange k = ChronoField.YEAR.k();
            return ValueRange.g(1, P() <= 0 ? (-k.d()) + 1 + 1911 : k.c() - 1911);
        }
        throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
    }

    @Override // org.threeten.bp.chrono.a, defpackage.bqf, org.threeten.bp.temporal.a
    public a p(long j, i iVar) {
        return (MinguoDate) super.p(j, iVar);
    }

    @Override // org.threeten.bp.chrono.a, org.threeten.bp.temporal.a
    public a s(c cVar) {
        return (MinguoDate) MinguoChronology.c.i(cVar.g(this));
    }

    @Override // org.threeten.bp.temporal.b
    public long u(f fVar) {
        if (!(fVar instanceof ChronoField)) {
            return fVar.l(this);
        }
        int i = 1;
        switch (((ChronoField) fVar).ordinal()) {
            case 24:
                return O();
            case 25:
                int P = P();
                if (P < 1) {
                    P = 1 - P;
                }
                return (long) P;
            case 26:
                return (long) P();
            case 27:
                if (P() < 1) {
                    i = 0;
                }
                return (long) i;
            default:
                return this.isoDate.u(fVar);
        }
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl, org.threeten.bp.chrono.a, org.threeten.bp.temporal.a
    public a v(long j, i iVar) {
        return (MinguoDate) super.v(j, iVar);
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl, org.threeten.bp.chrono.a
    public final b<MinguoDate> w(LocalTime localTime) {
        return ChronoLocalDateTimeImpl.L(this, localTime);
    }

    @Override // org.threeten.bp.chrono.a
    public e z() {
        return MinguoChronology.c;
    }
}
