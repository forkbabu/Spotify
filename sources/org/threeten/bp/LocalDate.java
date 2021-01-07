package org.threeten.bp;

import com.adjust.sdk.Constants;
import com.spotify.core.http.HttpConnection;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.chrono.a;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.c;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;
import org.threeten.bp.temporal.h;
import org.threeten.bp.temporal.i;

public final class LocalDate extends a implements org.threeten.bp.temporal.a, c, Serializable {
    public static final LocalDate a = k0(-999999999, 1, 1);
    public static final LocalDate b = k0(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;
    private final short day;
    private final short month;
    private final int year;

    private LocalDate(int i, int i2, int i3) {
        this.year = i;
        this.month = (short) i2;
        this.day = (short) i3;
    }

    private static LocalDate L(int i, Month month2, int i2) {
        if (i2 <= 28 || i2 <= month2.l(IsoChronology.c.z((long) i))) {
            return new LocalDate(i, month2.i(), i2);
        }
        if (i2 == 29) {
            throw new DateTimeException(je.q0("Invalid date 'February 29' as '", i, "' is not a leap year"));
        }
        StringBuilder V0 = je.V0("Invalid date '");
        V0.append(month2.name());
        V0.append(" ");
        V0.append(i2);
        V0.append("'");
        throw new DateTimeException(V0.toString());
    }

    public static LocalDate N(b bVar) {
        LocalDate localDate = (LocalDate) bVar.m(g.b());
        if (localDate != null) {
            return localDate;
        }
        throw new DateTimeException(je.Q0(bVar, je.b1("Unable to obtain LocalDate from TemporalAccessor: ", bVar, ", type ")));
    }

    private int O(f fVar) {
        switch (((ChronoField) fVar).ordinal()) {
            case 15:
                return Q().h();
            case 16:
                return ((this.day - 1) % 7) + 1;
            case 17:
                return ((S() - 1) % 7) + 1;
            case 18:
                return this.day;
            case 19:
                return S();
            case 20:
                throw new DateTimeException(je.z0("Field too large for an int: ", fVar));
            case 21:
                return ((this.day - 1) / 7) + 1;
            case 22:
                return ((S() - 1) / 7) + 1;
            case 23:
                return this.month;
            case 24:
                throw new DateTimeException(je.z0("Field too large for an int: ", fVar));
            case 25:
                int i = this.year;
                return i >= 1 ? i : 1 - i;
            case 26:
                return this.year;
            case 27:
                if (this.year >= 1) {
                    return 1;
                }
                return 0;
            default:
                throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
        }
    }

    private long U() {
        return (((long) this.year) * 12) + ((long) (this.month - 1));
    }

    private long j0(LocalDate localDate) {
        return (((localDate.U() * 32) + ((long) localDate.day)) - ((U() * 32) + ((long) this.day))) / 32;
    }

    public static LocalDate k0(int i, int i2, int i3) {
        ChronoField.YEAR.q((long) i);
        ChronoField.MONTH_OF_YEAR.q((long) i2);
        ChronoField.DAY_OF_MONTH.q((long) i3);
        return L(i, Month.x(i2), i3);
    }

    public static LocalDate m0(int i, Month month2, int i2) {
        ChronoField.YEAR.q((long) i);
        yif.J(month2, "month");
        ChronoField.DAY_OF_MONTH.q((long) i2);
        return L(i, month2, i2);
    }

    public static LocalDate o0(long j) {
        long j2;
        ChronoField.EPOCH_DAY.q(j);
        long j3 = (j + 719528) - 60;
        if (j3 < 0) {
            long j4 = ((j3 + 1) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        return new LocalDate(ChronoField.YEAR.p(j5 + j2 + ((long) (i2 / 10))), ((i2 + 2) % 12) + 1, (i - (((i2 * HttpConnection.kErrorHttpTooManyRedirects) + 5) / 10)) + 1);
    }

    public static LocalDate q0(int i, int i2) {
        long j = (long) i;
        ChronoField.YEAR.q(j);
        ChronoField.DAY_OF_YEAR.q((long) i2);
        boolean z = IsoChronology.c.z(j);
        if (i2 != 366 || z) {
            Month x = Month.x(((i2 - 1) / 31) + 1);
            if (i2 > (x.l(z) + x.h(z)) - 1) {
                x = x.z(1);
            }
            return L(i, x, (i2 - x.h(z)) + 1);
        }
        throw new DateTimeException(je.q0("Invalid date 'DayOfYear 366' as '", i, "' is not a leap year"));
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 3, this);
    }

    private static LocalDate x0(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = Math.min(i3, IsoChronology.c.z((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return k0(i, i2, i3);
    }

    @Override // org.threeten.bp.chrono.a
    public org.threeten.bp.chrono.f A() {
        return super.A();
    }

    /* renamed from: A0 */
    public LocalDate d(f fVar, long j) {
        if (!(fVar instanceof ChronoField)) {
            return (LocalDate) fVar.g(this, j);
        }
        ChronoField chronoField = (ChronoField) fVar;
        chronoField.q(j);
        switch (chronoField.ordinal()) {
            case 15:
                return s0(j - ((long) Q().h()));
            case 16:
                return s0(j - u(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 17:
                return s0(j - u(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 18:
                int i = (int) j;
                return this.day == i ? this : k0(this.year, this.month, i);
            case 19:
                int i2 = (int) j;
                return S() == i2 ? this : q0(this.year, i2);
            case 20:
                return o0(j);
            case 21:
                return u0(j - u(ChronoField.ALIGNED_WEEK_OF_MONTH));
            case 22:
                return u0(j - u(ChronoField.ALIGNED_WEEK_OF_YEAR));
            case 23:
                int i3 = (int) j;
                if (this.month == i3) {
                    return this;
                }
                ChronoField.MONTH_OF_YEAR.q((long) i3);
                return x0(this.year, i3, this.day);
            case 24:
                return t0(j - u(ChronoField.PROLEPTIC_MONTH));
            case 25:
                if (this.year < 1) {
                    j = 1 - j;
                }
                return D0((int) j);
            case 26:
                return D0((int) j);
            case 27:
                return u(ChronoField.ERA) == j ? this : D0(1 - this.year);
            default:
                throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
        }
    }

    public LocalDate C0(int i) {
        if (S() == i) {
            return this;
        }
        return q0(this.year, i);
    }

    @Override // org.threeten.bp.chrono.a
    public a D(e eVar) {
        return (LocalDate) ((Period) eVar).a(this);
    }

    public LocalDate D0(int i) {
        if (this.year == i) {
            return this;
        }
        ChronoField.YEAR.q((long) i);
        return x0(i, this.month, this.day);
    }

    /* access modifiers changed from: package-private */
    public void E0(DataOutput dataOutput) {
        dataOutput.writeInt(this.year);
        dataOutput.writeByte(this.month);
        dataOutput.writeByte(this.day);
    }

    @Override // org.threeten.bp.chrono.a
    public long F() {
        long j;
        long j2 = (long) this.year;
        long j3 = (long) this.month;
        long j4 = (365 * j2) + 0;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / -400) + ((j2 / -4) - (j2 / -100)));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + ((long) (this.day - 1));
        if (j3 > 2) {
            j5--;
            if (!c0()) {
                j5--;
            }
        }
        return j5 - 719528;
    }

    /* access modifiers changed from: package-private */
    public int J(LocalDate localDate) {
        int i = this.year - localDate.year;
        if (i != 0) {
            return i;
        }
        int i2 = this.month - localDate.month;
        return i2 == 0 ? this.day - localDate.day : i2;
    }

    /* access modifiers changed from: package-private */
    public long M(LocalDate localDate) {
        return localDate.F() - F();
    }

    public int P() {
        return this.day;
    }

    public DayOfWeek Q() {
        return DayOfWeek.i(yif.q(F() + 3, 7) + 1);
    }

    public int S() {
        return (Month.x(this.month).h(c0()) + this.day) - 1;
    }

    public int T() {
        return this.month;
    }

    public int W() {
        return this.year;
    }

    public boolean b0(a aVar) {
        if (aVar instanceof LocalDate) {
            if (J((LocalDate) aVar) < 0) {
                return true;
            }
            return false;
        } else if (F() < aVar.F()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean c0() {
        return IsoChronology.c.z((long) this.year);
    }

    @Override // org.threeten.bp.chrono.a, java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDate) || J((LocalDate) obj) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: f0 */
    public LocalDate p(long j, i iVar) {
        return j == Long.MIN_VALUE ? v(Long.MAX_VALUE, iVar).v(1, iVar) : v(-j, iVar);
    }

    @Override // org.threeten.bp.chrono.a, org.threeten.bp.temporal.c
    public org.threeten.bp.temporal.a g(org.threeten.bp.temporal.a aVar) {
        return super.g(aVar);
    }

    public LocalDate h0(long j) {
        return j == Long.MIN_VALUE ? s0(Long.MAX_VALUE).s0(1) : s0(-j);
    }

    @Override // org.threeten.bp.chrono.a, java.lang.Object
    public int hashCode() {
        int i = this.year;
        return (((i << 11) + (this.month << 6)) + this.day) ^ (i & -2048);
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public ValueRange k(f fVar) {
        int i;
        if (!(fVar instanceof ChronoField)) {
            return fVar.i(this);
        }
        ChronoField chronoField = (ChronoField) fVar;
        if (chronoField.d()) {
            int ordinal = chronoField.ordinal();
            if (ordinal == 18) {
                short s = this.month;
                if (s != 2) {
                    i = (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31;
                } else {
                    i = c0() ? 29 : 28;
                }
                return ValueRange.g(1, (long) i);
            } else if (ordinal == 19) {
                return ValueRange.g(1, (long) (c0() ? 366 : 365));
            } else if (ordinal == 21) {
                return ValueRange.g(1, (Month.x(this.month) != Month.FEBRUARY || c0()) ? 5 : 4);
            } else if (ordinal != 25) {
                return fVar.k();
            } else {
                return ValueRange.g(1, this.year <= 0 ? 1000000000 : 999999999);
            }
        } else {
            throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: org.threeten.bp.LocalDate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.threeten.bp.chrono.a, defpackage.cqf, org.threeten.bp.temporal.b
    public <R> R m(h<R> hVar) {
        return hVar == g.b() ? this : (R) super.m(hVar);
    }

    @Override // org.threeten.bp.chrono.a, org.threeten.bp.temporal.b
    public boolean n(f fVar) {
        return super.n(fVar);
    }

    @Override // org.threeten.bp.temporal.a
    public long q(org.threeten.bp.temporal.a aVar, i iVar) {
        LocalDate N = N(aVar);
        if (!(iVar instanceof ChronoUnit)) {
            return iVar.g(this, N);
        }
        switch (((ChronoUnit) iVar).ordinal()) {
            case 7:
                return M(N);
            case 8:
                return M(N) / 7;
            case 9:
                return j0(N);
            case 10:
                return j0(N) / 12;
            case 11:
                return j0(N) / 120;
            case 12:
                return j0(N) / 1200;
            case 13:
                return j0(N) / 12000;
            case 14:
                ChronoField chronoField = ChronoField.ERA;
                return N.u(chronoField) - u(chronoField);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + iVar);
        }
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public int r(f fVar) {
        if (fVar instanceof ChronoField) {
            return O(fVar);
        }
        return k(fVar).a(u(fVar), fVar);
    }

    /* renamed from: r0 */
    public LocalDate v(long j, i iVar) {
        if (!(iVar instanceof ChronoUnit)) {
            return (LocalDate) iVar.h(this, j);
        }
        switch (((ChronoUnit) iVar).ordinal()) {
            case 7:
                return s0(j);
            case 8:
                return u0(j);
            case 9:
                return t0(j);
            case 10:
                return v0(j);
            case 11:
                return v0(yif.P(j, 10));
            case 12:
                return v0(yif.P(j, 100));
            case 13:
                return v0(yif.P(j, Constants.ONE_SECOND));
            case 14:
                ChronoField chronoField = ChronoField.ERA;
                return d(chronoField, yif.O(u(chronoField), j));
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + iVar);
        }
    }

    public LocalDate s0(long j) {
        if (j == 0) {
            return this;
        }
        return o0(yif.O(F(), j));
    }

    public LocalDate t0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.year) * 12) + ((long) (this.month - 1)) + j;
        return x0(ChronoField.YEAR.p(yif.o(j2, 12)), yif.q(j2, 12) + 1, this.day);
    }

    @Override // org.threeten.bp.chrono.a, java.lang.Object
    public String toString() {
        int i = this.year;
        short s = this.month;
        short s2 = this.day;
        int abs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (abs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        String str = "-0";
        sb.append(s < 10 ? str : "-");
        sb.append((int) s);
        if (s2 >= 10) {
            str = "-";
        }
        sb.append(str);
        sb.append((int) s2);
        return sb.toString();
    }

    @Override // org.threeten.bp.temporal.b
    public long u(f fVar) {
        if (!(fVar instanceof ChronoField)) {
            return fVar.l(this);
        }
        if (fVar == ChronoField.EPOCH_DAY) {
            return F();
        }
        if (fVar == ChronoField.PROLEPTIC_MONTH) {
            return U();
        }
        return (long) O(fVar);
    }

    public LocalDate u0(long j) {
        return s0(yif.P(j, 7));
    }

    public LocalDate v0(long j) {
        if (j == 0) {
            return this;
        }
        return x0(ChronoField.YEAR.p(((long) this.year) + j), this.month, this.day);
    }

    @Override // org.threeten.bp.chrono.a
    public org.threeten.bp.chrono.b w(LocalTime localTime) {
        return LocalDateTime.c0(this, localTime);
    }

    @Override // org.threeten.bp.chrono.a
    /* renamed from: x */
    public int compareTo(a aVar) {
        if (aVar instanceof LocalDate) {
            return J((LocalDate) aVar);
        }
        return super.compareTo(aVar);
    }

    @Override // org.threeten.bp.chrono.a
    public org.threeten.bp.chrono.e z() {
        return IsoChronology.c;
    }

    /* renamed from: z0 */
    public LocalDate s(c cVar) {
        if (cVar instanceof LocalDate) {
            return (LocalDate) cVar;
        }
        return (LocalDate) cVar.g(this);
    }
}
