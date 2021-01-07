package org.threeten.bp;

import com.comscore.streaming.AdvertisementType;
import com.spotify.core.http.HttpConnection;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.chrono.e;
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

public enum Month implements b, c {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    
    private static final Month[] v = values();

    public static Month x(int i) {
        if (i >= 1 && i <= 12) {
            return v[i - 1];
        }
        throw new DateTimeException(je.p0("Invalid value for MonthOfYear: ", i));
    }

    @Override // org.threeten.bp.temporal.c
    public a g(a aVar) {
        if (e.n(aVar).equals(IsoChronology.c)) {
            return aVar.d(ChronoField.MONTH_OF_YEAR, (long) i());
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    public int h(boolean z) {
        switch (ordinal()) {
            case 0:
                return 1;
            case 1:
                return 32;
            case 2:
                return z + 60;
            case 3:
                return (z ? 1 : 0) + 91;
            case 4:
                return z + 121;
            case 5:
                return z + 152;
            case 6:
                return z + 182;
            case 7:
                return z + AdvertisementType.ON_DEMAND_POST_ROLL;
            case 8:
                return z + 244;
            case 9:
                return z + 274;
            case 10:
                return z + HttpConnection.kErrorHttpBadRange;
            default:
                return z + 335;
        }
    }

    public int i() {
        return ordinal() + 1;
    }

    @Override // org.threeten.bp.temporal.b
    public ValueRange k(f fVar) {
        if (fVar == ChronoField.MONTH_OF_YEAR) {
            return fVar.k();
        }
        if (!(fVar instanceof ChronoField)) {
            return fVar.i(this);
        }
        throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
    }

    public int l(boolean z) {
        int ordinal = ordinal();
        return ordinal != 1 ? (ordinal == 3 || ordinal == 5 || ordinal == 8 || ordinal == 10) ? 30 : 31 : z ? 29 : 28;
    }

    @Override // org.threeten.bp.temporal.b
    public <R> R m(h<R> hVar) {
        if (hVar == g.a()) {
            return (R) IsoChronology.c;
        }
        if (hVar == g.e()) {
            return (R) ChronoUnit.MONTHS;
        }
        if (hVar == g.b() || hVar == g.c() || hVar == g.f() || hVar == g.g() || hVar == g.d()) {
            return null;
        }
        return hVar.a(this);
    }

    @Override // org.threeten.bp.temporal.b
    public boolean n(f fVar) {
        if (fVar instanceof ChronoField) {
            if (fVar == ChronoField.MONTH_OF_YEAR) {
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
        if (fVar == ChronoField.MONTH_OF_YEAR) {
            return i();
        }
        return k(fVar).a(u(fVar), fVar);
    }

    @Override // org.threeten.bp.temporal.b
    public long u(f fVar) {
        if (fVar == ChronoField.MONTH_OF_YEAR) {
            return (long) i();
        }
        if (!(fVar instanceof ChronoField)) {
            return fVar.l(this);
        }
        throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
    }

    public int w() {
        int ordinal = ordinal();
        if (ordinal != 1) {
            return (ordinal == 3 || ordinal == 5 || ordinal == 8 || ordinal == 10) ? 30 : 31;
        }
        return 29;
    }

    public Month z(long j) {
        return v[((((int) (j % 12)) + 12) + ordinal()) % 12];
    }
}
