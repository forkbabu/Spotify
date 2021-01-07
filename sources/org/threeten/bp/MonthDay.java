package org.threeten.bp;

import com.spotify.music.features.ads.model.Ad;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.chrono.e;
import org.threeten.bp.format.DateTimeFormatterBuilder;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.c;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;
import org.threeten.bp.temporal.h;

public final class MonthDay extends cqf implements b, c, Comparable<MonthDay>, Serializable {
    public static final /* synthetic */ int a = 0;
    private static final long serialVersionUID = -939150713474957432L;
    private final int day;
    private final int month;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.f("--");
        dateTimeFormatterBuilder.o(ChronoField.MONTH_OF_YEAR, 2);
        dateTimeFormatterBuilder.e('-');
        dateTimeFormatterBuilder.o(ChronoField.DAY_OF_MONTH, 2);
        dateTimeFormatterBuilder.w();
    }

    private MonthDay(int i, int i2) {
        this.month = i;
        this.day = i2;
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static MonthDay w(int i, int i2) {
        Month x = Month.x(i);
        yif.J(x, "month");
        ChronoField.DAY_OF_MONTH.q((long) i2);
        if (i2 <= x.w()) {
            return new MonthDay(x.i(), i2);
        }
        StringBuilder W0 = je.W0("Illegal value for DayOfMonth field, value ", i2, " is not valid for month ");
        W0.append(x.name());
        throw new DateTimeException(W0.toString());
    }

    private Object writeReplace() {
        return new Ser((byte) 64, this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public int compareTo(MonthDay monthDay) {
        MonthDay monthDay2 = monthDay;
        int i = this.month - monthDay2.month;
        return i == 0 ? this.day - monthDay2.day : i;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MonthDay)) {
            return false;
        }
        MonthDay monthDay = (MonthDay) obj;
        if (this.month == monthDay.month && this.day == monthDay.day) {
            return true;
        }
        return false;
    }

    @Override // org.threeten.bp.temporal.c
    public a g(a aVar) {
        if (e.n(aVar).equals(IsoChronology.c)) {
            a d = aVar.d(ChronoField.MONTH_OF_YEAR, (long) this.month);
            ChronoField chronoField = ChronoField.DAY_OF_MONTH;
            return d.d(chronoField, Math.min(d.k(chronoField).c(), (long) this.day));
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    @Override // java.lang.Object
    public int hashCode() {
        return (this.month << 6) + this.day;
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public ValueRange k(f fVar) {
        if (fVar == ChronoField.MONTH_OF_YEAR) {
            return fVar.k();
        }
        if (fVar != ChronoField.DAY_OF_MONTH) {
            return super.k(fVar);
        }
        int ordinal = Month.x(this.month).ordinal();
        return ValueRange.h(1, (long) (ordinal != 1 ? (ordinal == 3 || ordinal == 5 || ordinal == 8 || ordinal == 10) ? 30 : 31 : 28), (long) Month.x(this.month).w());
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public <R> R m(h<R> hVar) {
        return hVar == g.a() ? (R) IsoChronology.c : (R) super.m(hVar);
    }

    @Override // org.threeten.bp.temporal.b
    public boolean n(f fVar) {
        if (fVar instanceof ChronoField) {
            if (fVar == ChronoField.MONTH_OF_YEAR || fVar == ChronoField.DAY_OF_MONTH) {
                return true;
            }
            return false;
        } else if (fVar == null || !fVar.h(this)) {
            return false;
        } else {
            return true;
        }
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public int r(f fVar) {
        return k(fVar).a(u(fVar), fVar);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder T0 = je.T0(10, "--");
        T0.append(this.month < 10 ? Ad.DEFAULT_SKIPPABLE_AD_DELAY : "");
        T0.append(this.month);
        T0.append(this.day < 10 ? "-0" : "-");
        T0.append(this.day);
        return T0.toString();
    }

    @Override // org.threeten.bp.temporal.b
    public long u(f fVar) {
        int i;
        if (!(fVar instanceof ChronoField)) {
            return fVar.l(this);
        }
        int ordinal = ((ChronoField) fVar).ordinal();
        if (ordinal == 18) {
            i = this.day;
        } else if (ordinal == 23) {
            i = this.month;
        } else {
            throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
        }
        return (long) i;
    }

    /* access modifiers changed from: package-private */
    public void x(DataOutput dataOutput) {
        dataOutput.writeByte(this.month);
        dataOutput.writeByte(this.day);
    }
}
