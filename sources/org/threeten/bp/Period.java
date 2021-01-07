package org.threeten.bp;

import java.io.Serializable;
import java.util.regex.Pattern;
import org.threeten.bp.chrono.c;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.a;

public final class Period extends c implements Serializable {
    public static final Period a = new Period(0, 0, 0);
    private static final long serialVersionUID = -8290556941213247973L;
    private final int days;
    private final int months;
    private final int years;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
    }

    private Period(int i, int i2, int i3) {
        this.years = i;
        this.months = i2;
        this.days = i3;
    }

    public static Period b(int i) {
        if ((0 | i) == 0) {
            return a;
        }
        return new Period(0, 0, i);
    }

    private Object readResolve() {
        return ((this.years | this.months) | this.days) == 0 ? a : this;
    }

    public a a(a aVar) {
        yif.J(aVar, "temporal");
        int i = this.years;
        if (i != 0) {
            int i2 = this.months;
            if (i2 != 0) {
                aVar = aVar.v((((long) i) * 12) + ((long) i2), ChronoUnit.MONTHS);
            } else {
                aVar = aVar.v((long) i, ChronoUnit.YEARS);
            }
        } else {
            int i3 = this.months;
            if (i3 != 0) {
                aVar = aVar.v((long) i3, ChronoUnit.MONTHS);
            }
        }
        int i4 = this.days;
        return i4 != 0 ? aVar.v((long) i4, ChronoUnit.DAYS) : aVar;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Period)) {
            return false;
        }
        Period period = (Period) obj;
        if (this.years == period.years && this.months == period.months && this.days == period.days) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Integer.rotateLeft(this.days, 16) + Integer.rotateLeft(this.months, 8) + this.years;
    }

    @Override // java.lang.Object
    public String toString() {
        if (this == a) {
            return "P0D";
        }
        StringBuilder S0 = je.S0('P');
        int i = this.years;
        if (i != 0) {
            S0.append(i);
            S0.append('Y');
        }
        int i2 = this.months;
        if (i2 != 0) {
            S0.append(i2);
            S0.append('M');
        }
        int i3 = this.days;
        if (i3 != 0) {
            S0.append(i3);
            S0.append('D');
        }
        return S0.toString();
    }
}
