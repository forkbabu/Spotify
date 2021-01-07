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

public final class ThaiBuddhistDate extends ChronoDateImpl<ThaiBuddhistDate> implements Serializable {
    private static final long serialVersionUID = -8722293800195731463L;
    private final LocalDate isoDate;

    ThaiBuddhistDate(LocalDate localDate) {
        yif.J(localDate, "date");
        this.isoDate = localDate;
    }

    private long O() {
        return ((((long) P()) * 12) + ((long) this.isoDate.T())) - 1;
    }

    private int P() {
        return this.isoDate.W() + 543;
    }

    private ThaiBuddhistDate Q(LocalDate localDate) {
        return localDate.equals(this.isoDate) ? this : new ThaiBuddhistDate(localDate);
    }

    private Object writeReplace() {
        return new Ser((byte) 7, this);
    }

    @Override // org.threeten.bp.chrono.a
    public f A() {
        return (ThaiBuddhistEra) super.A();
    }

    @Override // org.threeten.bp.chrono.a
    public a B(long j, i iVar) {
        return (ThaiBuddhistDate) super.p(j, iVar);
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl, org.threeten.bp.chrono.a
    public a C(long j, i iVar) {
        return (ThaiBuddhistDate) super.v(j, iVar);
    }

    @Override // org.threeten.bp.chrono.a
    public a D(e eVar) {
        return (ThaiBuddhistDate) ThaiBuddhistChronology.c.i(((Period) eVar).a(this));
    }

    @Override // org.threeten.bp.chrono.a
    public long F() {
        return this.isoDate.F();
    }

    @Override // org.threeten.bp.chrono.a
    public a G(c cVar) {
        return (ThaiBuddhistDate) ThaiBuddhistChronology.c.i(cVar.g(this));
    }

    /* Return type fixed from 'org.threeten.bp.chrono.ChronoDateImpl' to match base method */
    @Override // org.threeten.bp.chrono.ChronoDateImpl
    public ChronoDateImpl<ThaiBuddhistDate> J(long j, i iVar) {
        return (ThaiBuddhistDate) super.v(j, iVar);
    }

    /* Return type fixed from 'org.threeten.bp.chrono.ChronoDateImpl' to match base method */
    /* access modifiers changed from: package-private */
    @Override // org.threeten.bp.chrono.ChronoDateImpl
    public ChronoDateImpl<ThaiBuddhistDate> L(long j) {
        return Q(this.isoDate.s0(j));
    }

    /* Return type fixed from 'org.threeten.bp.chrono.ChronoDateImpl' to match base method */
    /* access modifiers changed from: package-private */
    @Override // org.threeten.bp.chrono.ChronoDateImpl
    public ChronoDateImpl<ThaiBuddhistDate> M(long j) {
        return Q(this.isoDate.t0(j));
    }

    /* Return type fixed from 'org.threeten.bp.chrono.ChronoDateImpl' to match base method */
    /* access modifiers changed from: package-private */
    @Override // org.threeten.bp.chrono.ChronoDateImpl
    public ChronoDateImpl<ThaiBuddhistDate> N(long j) {
        return Q(this.isoDate.v0(j));
    }

    /* renamed from: S */
    public ThaiBuddhistDate d(f fVar, long j) {
        if (!(fVar instanceof ChronoField)) {
            return (ThaiBuddhistDate) fVar.g(this, j);
        }
        ChronoField chronoField = (ChronoField) fVar;
        if (u(chronoField) == j) {
            return this;
        }
        switch (chronoField.ordinal()) {
            case 24:
                ThaiBuddhistChronology.c.z(chronoField).b(j, chronoField);
                return Q(this.isoDate.t0(j - O()));
            case 25:
            case 26:
            case 27:
                int a = ThaiBuddhistChronology.c.z(chronoField).a(j, chronoField);
                switch (chronoField.ordinal()) {
                    case 25:
                        LocalDate localDate = this.isoDate;
                        if (P() < 1) {
                            a = 1 - a;
                        }
                        return Q(localDate.D0(a - 543));
                    case 26:
                        return Q(this.isoDate.D0(a - 543));
                    case 27:
                        return Q(this.isoDate.D0((1 - P()) - 543));
                }
        }
        return Q(this.isoDate.d(fVar, j));
    }

    @Override // org.threeten.bp.chrono.a, java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ThaiBuddhistDate) {
            return this.isoDate.equals(((ThaiBuddhistDate) obj).isoDate);
        }
        return false;
    }

    @Override // org.threeten.bp.chrono.a, java.lang.Object
    public int hashCode() {
        ThaiBuddhistChronology thaiBuddhistChronology = ThaiBuddhistChronology.c;
        return 146118545 ^ this.isoDate.hashCode();
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
                return ThaiBuddhistChronology.c.z(chronoField);
            }
            ValueRange k = ChronoField.YEAR.k();
            return ValueRange.g(1, P() <= 0 ? (-(k.d() + 543)) + 1 : 543 + k.c());
        }
        throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
    }

    @Override // org.threeten.bp.chrono.a, defpackage.bqf, org.threeten.bp.temporal.a
    public a p(long j, i iVar) {
        return (ThaiBuddhistDate) super.p(j, iVar);
    }

    @Override // org.threeten.bp.chrono.a, org.threeten.bp.temporal.a
    public a s(c cVar) {
        return (ThaiBuddhistDate) ThaiBuddhistChronology.c.i(cVar.g(this));
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
        return (ThaiBuddhistDate) super.v(j, iVar);
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl, org.threeten.bp.chrono.a
    public final b<ThaiBuddhistDate> w(LocalTime localTime) {
        return ChronoLocalDateTimeImpl.L(this, localTime);
    }

    @Override // org.threeten.bp.chrono.a
    public e z() {
        return ThaiBuddhistChronology.c;
    }
}
