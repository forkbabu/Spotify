package org.threeten.bp;

import com.adjust.sdk.Constants;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.chrono.e;
import org.threeten.bp.format.DateTimeFormatterBuilder;
import org.threeten.bp.format.SignStyle;
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
import org.threeten.bp.temporal.i;

public final class YearMonth extends cqf implements a, c, Comparable<YearMonth>, Serializable {
    private static final long serialVersionUID = 4183400860270640070L;
    private final int month;
    private final int year;

    static {
        DateTimeFormatterBuilder p = new DateTimeFormatterBuilder().p(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD);
        p.e('-');
        p.o(ChronoField.MONTH_OF_YEAR, 2);
        p.w();
    }

    private YearMonth(int i, int i2) {
        this.year = i;
        this.month = i2;
    }

    static YearMonth C(DataInput dataInput) {
        int readInt = dataInput.readInt();
        byte readByte = dataInput.readByte();
        ChronoField.YEAR.q((long) readInt);
        ChronoField.MONTH_OF_YEAR.q((long) readByte);
        return new YearMonth(readInt, readByte);
    }

    private YearMonth D(int i, int i2) {
        if (this.year == i && this.month == i2) {
            return this;
        }
        return new YearMonth(i, i2);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static YearMonth w(b bVar) {
        if (bVar instanceof YearMonth) {
            return (YearMonth) bVar;
        }
        try {
            if (!IsoChronology.c.equals(e.n(bVar))) {
                bVar = LocalDate.N(bVar);
            }
            ChronoField chronoField = ChronoField.YEAR;
            int r = bVar.r(chronoField);
            ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
            int r2 = bVar.r(chronoField2);
            chronoField.q((long) r);
            chronoField2.q((long) r2);
            return new YearMonth(r, r2);
        } catch (DateTimeException unused) {
            throw new DateTimeException(je.Q0(bVar, je.b1("Unable to obtain YearMonth from TemporalAccessor: ", bVar, ", type ")));
        }
    }

    private Object writeReplace() {
        return new Ser((byte) 68, this);
    }

    private long x() {
        return (((long) this.year) * 12) + ((long) (this.month - 1));
    }

    public YearMonth A(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.year) * 12) + ((long) (this.month - 1)) + j;
        return D(ChronoField.YEAR.p(yif.o(j2, 12)), yif.q(j2, 12) + 1);
    }

    public YearMonth B(long j) {
        if (j == 0) {
            return this;
        }
        return D(ChronoField.YEAR.p(((long) this.year) + j), this.month);
    }

    /* renamed from: F */
    public YearMonth d(f fVar, long j) {
        if (!(fVar instanceof ChronoField)) {
            return (YearMonth) fVar.g(this, j);
        }
        ChronoField chronoField = (ChronoField) fVar;
        chronoField.q(j);
        switch (chronoField.ordinal()) {
            case 23:
                int i = (int) j;
                ChronoField.MONTH_OF_YEAR.q((long) i);
                return D(this.year, i);
            case 24:
                return A(j - u(ChronoField.PROLEPTIC_MONTH));
            case 25:
                if (this.year < 1) {
                    j = 1 - j;
                }
                return G((int) j);
            case 26:
                return G((int) j);
            case 27:
                return u(ChronoField.ERA) == j ? this : G(1 - this.year);
            default:
                throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
        }
    }

    public YearMonth G(int i) {
        ChronoField.YEAR.q((long) i);
        return D(i, this.month);
    }

    /* access modifiers changed from: package-private */
    public void I(DataOutput dataOutput) {
        dataOutput.writeInt(this.year);
        dataOutput.writeByte(this.month);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public int compareTo(YearMonth yearMonth) {
        YearMonth yearMonth2 = yearMonth;
        int i = this.year - yearMonth2.year;
        return i == 0 ? this.month - yearMonth2.month : i;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YearMonth)) {
            return false;
        }
        YearMonth yearMonth = (YearMonth) obj;
        if (this.year == yearMonth.year && this.month == yearMonth.month) {
            return true;
        }
        return false;
    }

    @Override // org.threeten.bp.temporal.c
    public a g(a aVar) {
        if (e.n(aVar).equals(IsoChronology.c)) {
            return aVar.d(ChronoField.PROLEPTIC_MONTH, x());
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.year ^ (this.month << 27);
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public ValueRange k(f fVar) {
        if (fVar != ChronoField.YEAR_OF_ERA) {
            return super.k(fVar);
        }
        return ValueRange.g(1, this.year <= 0 ? 1000000000 : 999999999);
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
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
        return (R) super.m(hVar);
    }

    @Override // org.threeten.bp.temporal.b
    public boolean n(f fVar) {
        if (fVar instanceof ChronoField) {
            if (fVar == ChronoField.YEAR || fVar == ChronoField.MONTH_OF_YEAR || fVar == ChronoField.PROLEPTIC_MONTH || fVar == ChronoField.YEAR_OF_ERA || fVar == ChronoField.ERA) {
                return true;
            }
            return false;
        } else if (fVar == null || !fVar.h(this)) {
            return false;
        } else {
            return true;
        }
    }

    @Override // org.threeten.bp.temporal.a
    public a p(long j, i iVar) {
        return j == Long.MIN_VALUE ? v(Long.MAX_VALUE, iVar).v(1, iVar) : v(-j, iVar);
    }

    @Override // org.threeten.bp.temporal.a
    public long q(a aVar, i iVar) {
        YearMonth w = w(aVar);
        if (!(iVar instanceof ChronoUnit)) {
            return iVar.g(this, w);
        }
        long x = w.x() - x();
        switch (((ChronoUnit) iVar).ordinal()) {
            case 9:
                return x;
            case 10:
                return x / 12;
            case 11:
                return x / 120;
            case 12:
                return x / 1200;
            case 13:
                return x / 12000;
            case 14:
                ChronoField chronoField = ChronoField.ERA;
                return w.u(chronoField) - u(chronoField);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + iVar);
        }
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public int r(f fVar) {
        return k(fVar).a(u(fVar), fVar);
    }

    @Override // org.threeten.bp.temporal.a
    public a s(c cVar) {
        return (YearMonth) cVar.g(this);
    }

    @Override // java.lang.Object
    public String toString() {
        int abs = Math.abs(this.year);
        StringBuilder sb = new StringBuilder(9);
        if (abs < 1000) {
            int i = this.year;
            if (i < 0) {
                sb.append(i - 10000);
                sb.deleteCharAt(1);
            } else {
                sb.append(i + 10000);
                sb.deleteCharAt(0);
            }
        } else {
            sb.append(this.year);
        }
        sb.append(this.month < 10 ? "-0" : "-");
        sb.append(this.month);
        return sb.toString();
    }

    @Override // org.threeten.bp.temporal.b
    public long u(f fVar) {
        int i;
        if (!(fVar instanceof ChronoField)) {
            return fVar.l(this);
        }
        int i2 = 1;
        switch (((ChronoField) fVar).ordinal()) {
            case 23:
                i = this.month;
                break;
            case 24:
                return x();
            case 25:
                int i3 = this.year;
                if (i3 < 1) {
                    i3 = 1 - i3;
                }
                return (long) i3;
            case 26:
                i = this.year;
                break;
            case 27:
                if (this.year < 1) {
                    i2 = 0;
                }
                return (long) i2;
            default:
                throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
        }
        return (long) i;
    }

    /* renamed from: z */
    public YearMonth v(long j, i iVar) {
        if (!(iVar instanceof ChronoUnit)) {
            return (YearMonth) iVar.h(this, j);
        }
        switch (((ChronoUnit) iVar).ordinal()) {
            case 9:
                return A(j);
            case 10:
                return B(j);
            case 11:
                return B(yif.P(j, 10));
            case 12:
                return B(yif.P(j, 100));
            case 13:
                return B(yif.P(j, Constants.ONE_SECOND));
            case 14:
                ChronoField chronoField = ChronoField.ERA;
                return d(chronoField, yif.O(u(chronoField), j));
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + iVar);
        }
    }
}
