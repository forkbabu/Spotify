package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import org.threeten.bp.chrono.b;
import org.threeten.bp.chrono.d;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.c;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;
import org.threeten.bp.temporal.h;
import org.threeten.bp.temporal.i;

public final class LocalDateTime extends b<LocalDate> implements org.threeten.bp.temporal.a, c, Serializable {
    public static final LocalDateTime a = c0(LocalDate.a, LocalTime.a);
    public static final LocalDateTime b = c0(LocalDate.b, LocalTime.b);
    public static final h<LocalDateTime> c = new a();
    private static final long serialVersionUID = 6207766400415563566L;
    private final LocalDate date;
    private final LocalTime time;

    static class a implements h<LocalDateTime> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // org.threeten.bp.temporal.h
        public LocalDateTime a(org.threeten.bp.temporal.b bVar) {
            return LocalDateTime.M(bVar);
        }
    }

    private LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.date = localDate;
        this.time = localTime;
    }

    private int L(LocalDateTime localDateTime) {
        int J = this.date.J(localDateTime.date);
        return J == 0 ? this.time.compareTo(localDateTime.time) : J;
    }

    public static LocalDateTime M(org.threeten.bp.temporal.b bVar) {
        if (bVar instanceof LocalDateTime) {
            return (LocalDateTime) bVar;
        }
        if (bVar instanceof ZonedDateTime) {
            return ((ZonedDateTime) bVar).f0();
        }
        try {
            return new LocalDateTime(LocalDate.N(bVar), LocalTime.z(bVar));
        } catch (DateTimeException unused) {
            throw new DateTimeException(je.Q0(bVar, je.b1("Unable to obtain LocalDateTime from TemporalAccessor: ", bVar, ", type ")));
        }
    }

    public static LocalDateTime W(Clock clock) {
        yif.J(clock, "clock");
        Instant b2 = clock.b();
        return f0(b2.A(), b2.B(), clock.a().l().a(b2));
    }

    public static LocalDateTime b0(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new LocalDateTime(LocalDate.k0(i, i2, i3), LocalTime.I(i4, i5, i6, i7));
    }

    public static LocalDateTime c0(LocalDate localDate, LocalTime localTime) {
        yif.J(localDate, "date");
        yif.J(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }

    public static LocalDateTime f0(long j, int i, ZoneOffset zoneOffset) {
        yif.J(zoneOffset, "offset");
        long C = j + ((long) zoneOffset.C());
        return new LocalDateTime(LocalDate.o0(yif.o(C, 86400)), LocalTime.M((long) yif.q(C, 86400), i));
    }

    private LocalDateTime o0(LocalDate localDate, long j, long j2, long j3, long j4, int i) {
        if ((j | j2 | j3 | j4) == 0) {
            return s0(localDate, this.time);
        }
        long j5 = j / 24;
        long j6 = j5 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long j7 = (long) i;
        long j8 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long U = this.time.U();
        long j9 = (j8 * j7) + U;
        long o = yif.o(j9, 86400000000000L) + (j6 * j7);
        long r = yif.r(j9, 86400000000000L);
        return s0(localDate.s0(o), r == U ? this.time : LocalTime.J(r));
    }

    static LocalDateTime q0(DataInput dataInput) {
        LocalDate localDate = LocalDate.a;
        return c0(LocalDate.k0(dataInput.readInt(), dataInput.readByte(), dataInput.readByte()), LocalTime.T(dataInput));
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private LocalDateTime s0(LocalDate localDate, LocalTime localTime) {
        if (this.date == localDate && this.time == localTime) {
            return this;
        }
        return new LocalDateTime(localDate, localTime);
    }

    private Object writeReplace() {
        return new Ser((byte) 4, this);
    }

    /* Return type fixed from 'org.threeten.bp.chrono.a' to match base method */
    @Override // org.threeten.bp.chrono.b
    public LocalDate F() {
        return this.date;
    }

    @Override // org.threeten.bp.chrono.b
    public LocalTime G() {
        return this.time;
    }

    public int N() {
        return this.time.C();
    }

    public int O() {
        return this.time.D();
    }

    public int P() {
        return this.date.W();
    }

    public boolean Q(b<?> bVar) {
        if (!(bVar instanceof LocalDateTime)) {
            long F = F().F();
            long F2 = bVar.F().F();
            if (F > F2 || (F == F2 && G().U() > bVar.G().U())) {
                return true;
            }
            return false;
        } else if (L((LocalDateTime) bVar) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean S(b<?> bVar) {
        if (!(bVar instanceof LocalDateTime)) {
            long F = F().F();
            long F2 = bVar.F().F();
            if (F < F2 || (F == F2 && G().U() < bVar.G().U())) {
                return true;
            }
            return false;
        } else if (L((LocalDateTime) bVar) < 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: T */
    public LocalDateTime p(long j, i iVar) {
        return j == Long.MIN_VALUE ? v(Long.MAX_VALUE, iVar).v(1, iVar) : v(-j, iVar);
    }

    public LocalDateTime U(long j) {
        return o0(this.date, j, 0, 0, 0, -1);
    }

    @Override // org.threeten.bp.chrono.b, java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDateTime)) {
            return false;
        }
        LocalDateTime localDateTime = (LocalDateTime) obj;
        if (!this.date.equals(localDateTime.date) || !this.time.equals(localDateTime.time)) {
            return false;
        }
        return true;
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.temporal.c
    public org.threeten.bp.temporal.a g(org.threeten.bp.temporal.a aVar) {
        return super.g(aVar);
    }

    /* renamed from: h0 */
    public LocalDateTime v(long j, i iVar) {
        if (!(iVar instanceof ChronoUnit)) {
            return (LocalDateTime) iVar.h(this, j);
        }
        switch (((ChronoUnit) iVar).ordinal()) {
            case 0:
                return k0(j);
            case 1:
                return j0(j / 86400000000L).k0((j % 86400000000L) * 1000);
            case 2:
                return j0(j / 86400000).k0((j % 86400000) * 1000000);
            case 3:
                return m0(j);
            case 4:
                return o0(this.date, 0, j, 0, 0, 1);
            case 5:
                return o0(this.date, j, 0, 0, 0, 1);
            case 6:
                LocalDateTime j0 = j0(j / 256);
                return j0.o0(j0.date, (j % 256) * 12, 0, 0, 0, 1);
            default:
                return s0(this.date.v(j, iVar), this.time);
        }
    }

    @Override // org.threeten.bp.chrono.b, java.lang.Object
    public int hashCode() {
        return this.date.hashCode() ^ this.time.hashCode();
    }

    public LocalDateTime j0(long j) {
        return s0(this.date.s0(j), this.time);
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public ValueRange k(f fVar) {
        if (fVar instanceof ChronoField) {
            return fVar.m() ? this.time.k(fVar) : this.date.k(fVar);
        }
        return fVar.i(this);
    }

    public LocalDateTime k0(long j) {
        return o0(this.date, 0, 0, 0, j, 1);
    }

    @Override // org.threeten.bp.chrono.b, defpackage.cqf, org.threeten.bp.temporal.b
    public <R> R m(h<R> hVar) {
        return hVar == g.b() ? (R) this.date : (R) super.m(hVar);
    }

    public LocalDateTime m0(long j) {
        return o0(this.date, 0, 0, j, 0, 1);
    }

    @Override // org.threeten.bp.temporal.b
    public boolean n(f fVar) {
        if (fVar instanceof ChronoField) {
            if (fVar.d() || fVar.m()) {
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
    public long q(org.threeten.bp.temporal.a aVar, i iVar) {
        LocalDateTime M = M(aVar);
        if (!(iVar instanceof ChronoUnit)) {
            return iVar.g(this, M);
        }
        ChronoUnit chronoUnit = (ChronoUnit) iVar;
        boolean z = false;
        if (chronoUnit.compareTo(ChronoUnit.DAYS) < 0) {
            long M2 = this.date.M(M.date);
            long U = M.time.U() - this.time.U();
            if (M2 > 0 && U < 0) {
                M2--;
                U += 86400000000000L;
            } else if (M2 < 0 && U > 0) {
                M2++;
                U -= 86400000000000L;
            }
            switch (chronoUnit.ordinal()) {
                case 0:
                    return yif.O(yif.Q(M2, 86400000000000L), U);
                case 1:
                    return yif.O(yif.Q(M2, 86400000000L), U / 1000);
                case 2:
                    return yif.O(yif.Q(M2, 86400000), U / 1000000);
                case 3:
                    return yif.O(yif.P(M2, 86400), U / 1000000000);
                case 4:
                    return yif.O(yif.P(M2, 1440), U / 60000000000L);
                case 5:
                    return yif.O(yif.P(M2, 24), U / 3600000000000L);
                case 6:
                    return yif.O(yif.P(M2, 2), U / 43200000000000L);
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + iVar);
            }
        } else {
            LocalDate localDate = M.date;
            LocalDate localDate2 = this.date;
            localDate.getClass();
            if (!(localDate2 instanceof LocalDate) ? localDate.F() > localDate2.F() : localDate.J(localDate2) > 0) {
                if (M.time.compareTo(this.time) < 0) {
                    localDate = localDate.h0(1);
                    return this.date.q(localDate, iVar);
                }
            }
            if (localDate.b0(this.date)) {
                if (M.time.compareTo(this.time) > 0) {
                    z = true;
                }
                if (z) {
                    localDate = localDate.s0(1);
                }
            }
            return this.date.q(localDate, iVar);
        }
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public int r(f fVar) {
        if (fVar instanceof ChronoField) {
            return fVar.m() ? this.time.r(fVar) : this.date.r(fVar);
        }
        return super.r(fVar);
    }

    public LocalDate r0() {
        return this.date;
    }

    /* renamed from: t0 */
    public LocalDateTime s(c cVar) {
        if (cVar instanceof LocalDate) {
            return s0((LocalDate) cVar, this.time);
        }
        if (cVar instanceof LocalTime) {
            return s0(this.date, (LocalTime) cVar);
        }
        if (cVar instanceof LocalDateTime) {
            return (LocalDateTime) cVar;
        }
        return (LocalDateTime) cVar.g(this);
    }

    @Override // org.threeten.bp.chrono.b, java.lang.Object
    public String toString() {
        return this.date.toString() + 'T' + this.time.toString();
    }

    @Override // org.threeten.bp.temporal.b
    public long u(f fVar) {
        if (fVar instanceof ChronoField) {
            return fVar.m() ? this.time.u(fVar) : this.date.u(fVar);
        }
        return fVar.l(this);
    }

    /* renamed from: u0 */
    public LocalDateTime d(f fVar, long j) {
        if (!(fVar instanceof ChronoField)) {
            return (LocalDateTime) fVar.g(this, j);
        }
        if (fVar.m()) {
            return s0(this.date, this.time.d(fVar, j));
        }
        return s0(this.date.d(fVar, j), this.time);
    }

    /* access modifiers changed from: package-private */
    public void v0(DataOutput dataOutput) {
        this.date.E0(dataOutput);
        this.time.h0(dataOutput);
    }

    /* Return type fixed from 'org.threeten.bp.chrono.d' to match base method */
    @Override // org.threeten.bp.chrono.b
    public d<LocalDate> w(ZoneId zoneId) {
        return ZonedDateTime.S(this, zoneId, null);
    }

    @Override // org.threeten.bp.chrono.b
    /* renamed from: x */
    public int compareTo(b<?> bVar) {
        if (bVar instanceof LocalDateTime) {
            return L((LocalDateTime) bVar);
        }
        return super.compareTo(bVar);
    }
}
