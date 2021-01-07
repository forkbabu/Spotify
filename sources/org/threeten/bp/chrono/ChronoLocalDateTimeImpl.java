package org.threeten.bp.chrono;

import java.io.ObjectOutput;
import java.io.Serializable;
import org.threeten.bp.LocalTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.chrono.a;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.c;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.i;

/* access modifiers changed from: package-private */
public final class ChronoLocalDateTimeImpl<D extends a> extends b<D> implements org.threeten.bp.temporal.a, c, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    private final D date;
    private final LocalTime time;

    private ChronoLocalDateTimeImpl(D d, LocalTime localTime) {
        yif.J(d, "date");
        yif.J(localTime, "time");
        this.date = d;
        this.time = localTime;
    }

    static <R extends a> ChronoLocalDateTimeImpl<R> L(R r, LocalTime localTime) {
        return new ChronoLocalDateTimeImpl<>(r, localTime);
    }

    private ChronoLocalDateTimeImpl<D> N(long j) {
        return S(this.date.v(j, ChronoUnit.DAYS), this.time);
    }

    private ChronoLocalDateTimeImpl<D> O(long j) {
        return Q(this.date, 0, 0, 0, j);
    }

    private ChronoLocalDateTimeImpl<D> Q(D d, long j, long j2, long j3, long j4) {
        if ((j | j2 | j3 | j4) == 0) {
            return S(d, this.time);
        }
        long j5 = j / 24;
        long j6 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long U = this.time.U();
        long j7 = j6 + U;
        long o = yif.o(j7, 86400000000000L) + j5 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long r = yif.r(j7, 86400000000000L);
        return S(d.v(o, ChronoUnit.DAYS), r == U ? this.time : LocalTime.J(r));
    }

    private ChronoLocalDateTimeImpl<D> S(org.threeten.bp.temporal.a aVar, LocalTime localTime) {
        D d = this.date;
        if (d == aVar && this.time == localTime) {
            return this;
        }
        return new ChronoLocalDateTimeImpl<>(d.z().i(aVar), localTime);
    }

    private Object writeReplace() {
        return new Ser((byte) 12, this);
    }

    @Override // org.threeten.bp.chrono.b
    public D F() {
        return this.date;
    }

    @Override // org.threeten.bp.chrono.b
    public LocalTime G() {
        return this.time;
    }

    /* renamed from: M */
    public ChronoLocalDateTimeImpl<D> v(long j, i iVar) {
        if (!(iVar instanceof ChronoUnit)) {
            return this.date.z().k(iVar.h(this, j));
        }
        switch (((ChronoUnit) iVar).ordinal()) {
            case 0:
                return O(j);
            case 1:
                return N(j / 86400000000L).O((j % 86400000000L) * 1000);
            case 2:
                return N(j / 86400000).O((j % 86400000) * 1000000);
            case 3:
                return Q(this.date, 0, 0, j, 0);
            case 4:
                return Q(this.date, 0, j, 0, 0);
            case 5:
                return Q(this.date, j, 0, 0, 0);
            case 6:
                ChronoLocalDateTimeImpl<D> N = N(j / 256);
                return N.Q(N.date, (j % 256) * 12, 0, 0, 0);
            default:
                return S(this.date.v(j, iVar), this.time);
        }
    }

    /* access modifiers changed from: package-private */
    public ChronoLocalDateTimeImpl<D> P(long j) {
        return Q(this.date, 0, 0, j, 0);
    }

    /* renamed from: T */
    public ChronoLocalDateTimeImpl<D> s(c cVar) {
        if (cVar instanceof a) {
            return S((a) cVar, this.time);
        }
        if (cVar instanceof LocalTime) {
            return S(this.date, (LocalTime) cVar);
        }
        if (cVar instanceof ChronoLocalDateTimeImpl) {
            return this.date.z().k((ChronoLocalDateTimeImpl) cVar);
        }
        return this.date.z().k((ChronoLocalDateTimeImpl) cVar.g(this));
    }

    /* renamed from: U */
    public ChronoLocalDateTimeImpl<D> d(f fVar, long j) {
        if (!(fVar instanceof ChronoField)) {
            return this.date.z().k(fVar.g(this, j));
        }
        if (fVar.m()) {
            return S(this.date, this.time.d(fVar, j));
        }
        return S(this.date.d(fVar, j), this.time);
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public ValueRange k(f fVar) {
        if (fVar instanceof ChronoField) {
            return fVar.m() ? this.time.k(fVar) : this.date.k(fVar);
        }
        return fVar.i(this);
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
        b<?> r = this.date.z().r(aVar);
        if (!(iVar instanceof ChronoUnit)) {
            return iVar.g(this, r);
        }
        ChronoUnit chronoUnit = (ChronoUnit) iVar;
        ChronoUnit chronoUnit2 = ChronoUnit.DAYS;
        boolean z = false;
        if (chronoUnit.compareTo(chronoUnit2) < 0) {
            ChronoField chronoField = ChronoField.EPOCH_DAY;
            long u = r.u(chronoField) - this.date.u(chronoField);
            switch (chronoUnit.ordinal()) {
                case 0:
                    u = yif.Q(u, 86400000000000L);
                    break;
                case 1:
                    u = yif.Q(u, 86400000000L);
                    break;
                case 2:
                    u = yif.Q(u, 86400000);
                    break;
                case 3:
                    u = yif.P(u, 86400);
                    break;
                case 4:
                    u = yif.P(u, 1440);
                    break;
                case 5:
                    u = yif.P(u, 24);
                    break;
                case 6:
                    u = yif.P(u, 2);
                    break;
            }
            return yif.O(u, this.time.q(r.G(), iVar));
        }
        a F = r.F();
        if (r.G().compareTo(this.time) < 0) {
            z = true;
        }
        if (z) {
            F = F.p(1, chronoUnit2);
        }
        return this.date.q(F, iVar);
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public int r(f fVar) {
        if (fVar instanceof ChronoField) {
            return fVar.m() ? this.time.r(fVar) : this.date.r(fVar);
        }
        return k(fVar).a(u(fVar), fVar);
    }

    @Override // org.threeten.bp.temporal.b
    public long u(f fVar) {
        if (fVar instanceof ChronoField) {
            return fVar.m() ? this.time.u(fVar) : this.date.u(fVar);
        }
        return fVar.l(this);
    }

    @Override // org.threeten.bp.chrono.b
    public d<D> w(ZoneId zoneId) {
        return ChronoZonedDateTimeImpl.N(this, zoneId, null);
    }

    /* access modifiers changed from: package-private */
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.date);
        objectOutput.writeObject(this.time);
    }
}
