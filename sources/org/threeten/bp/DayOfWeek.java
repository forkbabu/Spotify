package org.threeten.bp;

import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.c;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;
import org.threeten.bp.temporal.h;

public enum DayOfWeek implements b, c {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    
    private static final DayOfWeek[] q = values();

    public static DayOfWeek i(int i) {
        if (i >= 1 && i <= 7) {
            return q[i - 1];
        }
        throw new DateTimeException(je.p0("Invalid value for DayOfWeek: ", i));
    }

    @Override // org.threeten.bp.temporal.c
    public a g(a aVar) {
        return aVar.d(ChronoField.DAY_OF_WEEK, (long) h());
    }

    public int h() {
        return ordinal() + 1;
    }

    @Override // org.threeten.bp.temporal.b
    public ValueRange k(f fVar) {
        if (fVar == ChronoField.DAY_OF_WEEK) {
            return fVar.k();
        }
        if (!(fVar instanceof ChronoField)) {
            return fVar.i(this);
        }
        throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
    }

    public DayOfWeek l(long j) {
        return q[((((int) (j % 7)) + 7) + ordinal()) % 7];
    }

    @Override // org.threeten.bp.temporal.b
    public <R> R m(h<R> hVar) {
        if (hVar == g.e()) {
            return (R) ChronoUnit.DAYS;
        }
        if (hVar == g.b() || hVar == g.c() || hVar == g.a() || hVar == g.f() || hVar == g.g() || hVar == g.d()) {
            return null;
        }
        return hVar.a(this);
    }

    @Override // org.threeten.bp.temporal.b
    public boolean n(f fVar) {
        if (fVar instanceof ChronoField) {
            if (fVar == ChronoField.DAY_OF_WEEK) {
                return true;
            }
            return false;
        } else if (fVar == null || !fVar.h(this)) {
            return false;
        } else {
            return true;
        }
    }

    @Override // org.threeten.bp.temporal.b
    public int r(f fVar) {
        if (fVar == ChronoField.DAY_OF_WEEK) {
            return h();
        }
        return k(fVar).a(u(fVar), fVar);
    }

    @Override // org.threeten.bp.temporal.b
    public long u(f fVar) {
        if (fVar == ChronoField.DAY_OF_WEEK) {
            return (long) h();
        }
        if (!(fVar instanceof ChronoField)) {
            return fVar.l(this);
        }
        throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
    }
}
