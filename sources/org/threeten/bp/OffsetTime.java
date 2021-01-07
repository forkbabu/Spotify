package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
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

public final class OffsetTime extends cqf implements a, c, Comparable<OffsetTime>, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;
    private final ZoneOffset offset;
    private final LocalTime time;

    static {
        LocalTime localTime = LocalTime.a;
        ZoneOffset zoneOffset = ZoneOffset.p;
        localTime.getClass();
        new OffsetTime(localTime, zoneOffset);
        LocalTime localTime2 = LocalTime.b;
        ZoneOffset zoneOffset2 = ZoneOffset.o;
        localTime2.getClass();
        new OffsetTime(localTime2, zoneOffset2);
    }

    private OffsetTime(LocalTime localTime, ZoneOffset zoneOffset) {
        yif.J(localTime, "time");
        this.time = localTime;
        yif.J(zoneOffset, "offset");
        this.offset = zoneOffset;
    }

    private long A() {
        return this.time.U() - (((long) this.offset.C()) * 1000000000);
    }

    private OffsetTime B(LocalTime localTime, ZoneOffset zoneOffset) {
        if (this.time != localTime || !this.offset.equals(zoneOffset)) {
            return new OffsetTime(localTime, zoneOffset);
        }
        return this;
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static OffsetTime w(b bVar) {
        if (bVar instanceof OffsetTime) {
            return (OffsetTime) bVar;
        }
        try {
            return new OffsetTime(LocalTime.z(bVar), ZoneOffset.B(bVar));
        } catch (DateTimeException unused) {
            throw new DateTimeException(je.Q0(bVar, je.b1("Unable to obtain OffsetTime from TemporalAccessor: ", bVar, ", type ")));
        }
    }

    private Object writeReplace() {
        return new Ser((byte) 66, this);
    }

    static OffsetTime z(DataInput dataInput) {
        return new OffsetTime(LocalTime.T(dataInput), ZoneOffset.J(dataInput));
    }

    /* access modifiers changed from: package-private */
    public void C(DataOutput dataOutput) {
        this.time.h0(dataOutput);
        this.offset.L(dataOutput);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public int compareTo(OffsetTime offsetTime) {
        OffsetTime offsetTime2 = offsetTime;
        if (this.offset.equals(offsetTime2.offset)) {
            return this.time.compareTo(offsetTime2.time);
        }
        int l = yif.l(A(), offsetTime2.A());
        return l == 0 ? this.time.compareTo(offsetTime2.time) : l;
    }

    @Override // org.threeten.bp.temporal.a
    public a d(f fVar, long j) {
        if (!(fVar instanceof ChronoField)) {
            return (OffsetTime) fVar.g(this, j);
        }
        if (fVar == ChronoField.OFFSET_SECONDS) {
            return B(this.time, ZoneOffset.G(((ChronoField) fVar).p(j)));
        }
        return B(this.time.d(fVar, j), this.offset);
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetTime)) {
            return false;
        }
        OffsetTime offsetTime = (OffsetTime) obj;
        if (!this.time.equals(offsetTime.time) || !this.offset.equals(offsetTime.offset)) {
            return false;
        }
        return true;
    }

    @Override // org.threeten.bp.temporal.c
    public a g(a aVar) {
        return aVar.d(ChronoField.NANO_OF_DAY, this.time.U()).d(ChronoField.OFFSET_SECONDS, (long) this.offset.C());
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.time.hashCode() ^ this.offset.hashCode();
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public ValueRange k(f fVar) {
        if (!(fVar instanceof ChronoField)) {
            return fVar.i(this);
        }
        if (fVar == ChronoField.OFFSET_SECONDS) {
            return fVar.k();
        }
        return this.time.k(fVar);
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public <R> R m(h<R> hVar) {
        if (hVar == g.e()) {
            return (R) ChronoUnit.NANOS;
        }
        if (hVar == g.d() || hVar == g.f()) {
            return (R) this.offset;
        }
        if (hVar == g.c()) {
            return (R) this.time;
        }
        if (hVar == g.a() || hVar == g.b() || hVar == g.g()) {
            return null;
        }
        return (R) super.m(hVar);
    }

    @Override // org.threeten.bp.temporal.b
    public boolean n(f fVar) {
        if (fVar instanceof ChronoField) {
            if (fVar.m() || fVar == ChronoField.OFFSET_SECONDS) {
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
        OffsetTime w = w(aVar);
        if (!(iVar instanceof ChronoUnit)) {
            return iVar.g(this, w);
        }
        long A = w.A() - A();
        switch (((ChronoUnit) iVar).ordinal()) {
            case 0:
                return A;
            case 1:
                return A / 1000;
            case 2:
                return A / 1000000;
            case 3:
                return A / 1000000000;
            case 4:
                return A / 60000000000L;
            case 5:
                return A / 3600000000000L;
            case 6:
                return A / 43200000000000L;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + iVar);
        }
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public int r(f fVar) {
        return super.r(fVar);
    }

    @Override // org.threeten.bp.temporal.a
    public a s(c cVar) {
        if (cVar instanceof LocalTime) {
            return B((LocalTime) cVar, this.offset);
        }
        if (cVar instanceof ZoneOffset) {
            return B(this.time, (ZoneOffset) cVar);
        }
        if (cVar instanceof OffsetTime) {
            return (OffsetTime) cVar;
        }
        return (OffsetTime) cVar.g(this);
    }

    @Override // java.lang.Object
    public String toString() {
        return this.time.toString() + this.offset.toString();
    }

    @Override // org.threeten.bp.temporal.b
    public long u(f fVar) {
        if (!(fVar instanceof ChronoField)) {
            return fVar.l(this);
        }
        if (fVar == ChronoField.OFFSET_SECONDS) {
            return (long) this.offset.C();
        }
        return this.time.u(fVar);
    }

    /* renamed from: x */
    public OffsetTime v(long j, i iVar) {
        if (iVar instanceof ChronoUnit) {
            return B(this.time.v(j, iVar), this.offset);
        }
        return (OffsetTime) iVar.h(this, j);
    }
}
