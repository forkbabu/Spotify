package org.threeten.bp.chrono;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import org.threeten.bp.DateTimeException;
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

public final class JapaneseDate extends ChronoDateImpl<JapaneseDate> implements Serializable {
    static final LocalDate c = LocalDate.k0(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    private transient JapaneseEra a;
    private transient int b;
    private final LocalDate isoDate;

    JapaneseDate(LocalDate localDate) {
        if (!localDate.b0(c)) {
            JapaneseEra x = JapaneseEra.x(localDate);
            this.a = x;
            this.b = localDate.W() - (x.B().W() - 1);
            this.isoDate = localDate;
            return;
        }
        throw new DateTimeException("Minimum supported date is January 1st Meiji 6");
    }

    private ValueRange O(int i) {
        Calendar instance = Calendar.getInstance(JapaneseChronology.c);
        instance.set(0, this.a.z() + 2);
        instance.set(this.b, this.isoDate.T() - 1, this.isoDate.P());
        return ValueRange.g((long) instance.getActualMinimum(i), (long) instance.getActualMaximum(i));
    }

    private long P() {
        int S;
        if (this.b == 1) {
            S = (this.isoDate.S() - this.a.B().S()) + 1;
        } else {
            S = this.isoDate.S();
        }
        return (long) S;
    }

    private JapaneseDate Q(LocalDate localDate) {
        return localDate.equals(this.isoDate) ? this : new JapaneseDate(localDate);
    }

    private JapaneseDate T(JapaneseEra japaneseEra, int i) {
        JapaneseChronology.f.getClass();
        if (japaneseEra instanceof JapaneseEra) {
            ValueRange.g(1, (long) ((japaneseEra.w().W() - japaneseEra.B().W()) + 1)).b((long) i, ChronoField.YEAR_OF_ERA);
            return Q(this.isoDate.D0((japaneseEra.B().W() + i) - 1));
        }
        throw new ClassCastException("Era must be JapaneseEra");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        JapaneseEra x = JapaneseEra.x(this.isoDate);
        this.a = x;
        this.b = this.isoDate.W() - (x.B().W() - 1);
    }

    private Object writeReplace() {
        return new Ser((byte) 1, this);
    }

    @Override // org.threeten.bp.chrono.a
    public f A() {
        return this.a;
    }

    @Override // org.threeten.bp.chrono.a
    public a B(long j, i iVar) {
        return (JapaneseDate) super.p(j, iVar);
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl, org.threeten.bp.chrono.a
    public a C(long j, i iVar) {
        return (JapaneseDate) super.v(j, iVar);
    }

    @Override // org.threeten.bp.chrono.a
    public a D(e eVar) {
        return (JapaneseDate) JapaneseChronology.f.i(((Period) eVar).a(this));
    }

    @Override // org.threeten.bp.chrono.a
    public long F() {
        return this.isoDate.F();
    }

    @Override // org.threeten.bp.chrono.a
    public a G(c cVar) {
        return (JapaneseDate) JapaneseChronology.f.i(cVar.g(this));
    }

    /* Return type fixed from 'org.threeten.bp.chrono.ChronoDateImpl' to match base method */
    @Override // org.threeten.bp.chrono.ChronoDateImpl
    public ChronoDateImpl<JapaneseDate> J(long j, i iVar) {
        return (JapaneseDate) super.v(j, iVar);
    }

    /* Return type fixed from 'org.threeten.bp.chrono.ChronoDateImpl' to match base method */
    /* access modifiers changed from: package-private */
    @Override // org.threeten.bp.chrono.ChronoDateImpl
    public ChronoDateImpl<JapaneseDate> L(long j) {
        return Q(this.isoDate.s0(j));
    }

    /* Return type fixed from 'org.threeten.bp.chrono.ChronoDateImpl' to match base method */
    /* access modifiers changed from: package-private */
    @Override // org.threeten.bp.chrono.ChronoDateImpl
    public ChronoDateImpl<JapaneseDate> M(long j) {
        return Q(this.isoDate.t0(j));
    }

    /* Return type fixed from 'org.threeten.bp.chrono.ChronoDateImpl' to match base method */
    /* access modifiers changed from: package-private */
    @Override // org.threeten.bp.chrono.ChronoDateImpl
    public ChronoDateImpl<JapaneseDate> N(long j) {
        return Q(this.isoDate.v0(j));
    }

    /* renamed from: S */
    public JapaneseDate d(f fVar, long j) {
        if (!(fVar instanceof ChronoField)) {
            return (JapaneseDate) fVar.g(this, j);
        }
        ChronoField chronoField = (ChronoField) fVar;
        if (u(chronoField) == j) {
            return this;
        }
        int ordinal = chronoField.ordinal();
        if (ordinal == 19 || ordinal == 25 || ordinal == 27) {
            int a2 = JapaneseChronology.f.z(chronoField).a(j, chronoField);
            int ordinal2 = chronoField.ordinal();
            if (ordinal2 == 19) {
                return Q(this.isoDate.s0(((long) a2) - P()));
            }
            if (ordinal2 == 25) {
                return T(this.a, a2);
            }
            if (ordinal2 == 27) {
                return T(JapaneseEra.A(a2), this.b);
            }
        }
        return Q(this.isoDate.d(fVar, j));
    }

    @Override // org.threeten.bp.chrono.a, java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof JapaneseDate) {
            return this.isoDate.equals(((JapaneseDate) obj).isoDate);
        }
        return false;
    }

    @Override // org.threeten.bp.chrono.a, java.lang.Object
    public int hashCode() {
        JapaneseChronology.f.getClass();
        return -688086063 ^ this.isoDate.hashCode();
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public ValueRange k(f fVar) {
        if (!(fVar instanceof ChronoField)) {
            return fVar.i(this);
        }
        if (n(fVar)) {
            ChronoField chronoField = (ChronoField) fVar;
            int ordinal = chronoField.ordinal();
            if (ordinal == 19) {
                return O(6);
            }
            if (ordinal != 25) {
                return JapaneseChronology.f.z(chronoField);
            }
            return O(1);
        }
        throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
    }

    @Override // org.threeten.bp.chrono.a, org.threeten.bp.temporal.b
    public boolean n(f fVar) {
        if (fVar == ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH || fVar == ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR || fVar == ChronoField.ALIGNED_WEEK_OF_MONTH || fVar == ChronoField.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return super.n(fVar);
    }

    @Override // org.threeten.bp.chrono.a, defpackage.bqf, org.threeten.bp.temporal.a
    public a p(long j, i iVar) {
        return (JapaneseDate) super.p(j, iVar);
    }

    @Override // org.threeten.bp.chrono.a, org.threeten.bp.temporal.a
    public a s(c cVar) {
        return (JapaneseDate) JapaneseChronology.f.i(cVar.g(this));
    }

    @Override // org.threeten.bp.temporal.b
    public long u(f fVar) {
        if (!(fVar instanceof ChronoField)) {
            return fVar.l(this);
        }
        int ordinal = ((ChronoField) fVar).ordinal();
        if (!(ordinal == 16 || ordinal == 17)) {
            if (ordinal == 19) {
                return P();
            }
            if (ordinal == 25) {
                return (long) this.b;
            }
            if (ordinal == 27) {
                return (long) this.a.z();
            }
            if (!(ordinal == 21 || ordinal == 22)) {
                return this.isoDate.u(fVar);
            }
        }
        throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl, org.threeten.bp.chrono.a, org.threeten.bp.temporal.a
    public a v(long j, i iVar) {
        return (JapaneseDate) super.v(j, iVar);
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl, org.threeten.bp.chrono.a
    public final b<JapaneseDate> w(LocalTime localTime) {
        return ChronoLocalDateTimeImpl.L(this, localTime);
    }

    @Override // org.threeten.bp.chrono.a
    public e z() {
        return JapaneseChronology.f;
    }
}
