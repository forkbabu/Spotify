package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.c;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;
import org.threeten.bp.temporal.h;
import org.threeten.bp.temporal.i;
import org.threeten.bp.zone.ZoneRules;

public final class OffsetDateTime extends bqf implements a, c, Comparable<OffsetDateTime>, Serializable {
    private static final long serialVersionUID = 2287754244819255394L;
    private final LocalDateTime dateTime;
    private final ZoneOffset offset;

    static {
        LocalDateTime localDateTime = LocalDateTime.a;
        ZoneOffset zoneOffset = ZoneOffset.p;
        localDateTime.getClass();
        new OffsetDateTime(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.b;
        ZoneOffset zoneOffset2 = ZoneOffset.o;
        localDateTime2.getClass();
        new OffsetDateTime(localDateTime2, zoneOffset2);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        yif.J(localDateTime, "dateTime");
        this.dateTime = localDateTime;
        yif.J(zoneOffset, "offset");
        this.offset = zoneOffset;
    }

    public static OffsetDateTime A(Instant instant, ZoneId zoneId) {
        yif.J(instant, "instant");
        yif.J(zoneId, "zone");
        ZoneOffset a = ZoneRules.g((ZoneOffset) zoneId).a(instant);
        return new OffsetDateTime(LocalDateTime.f0(instant.A(), instant.B(), a), a);
    }

    static OffsetDateTime C(DataInput dataInput) {
        return new OffsetDateTime(LocalDateTime.q0(dataInput), ZoneOffset.J(dataInput));
    }

    private OffsetDateTime G(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        if (this.dateTime != localDateTime || !this.offset.equals(zoneOffset)) {
            return new OffsetDateTime(localDateTime, zoneOffset);
        }
        return this;
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static OffsetDateTime w(b bVar) {
        if (bVar instanceof OffsetDateTime) {
            return (OffsetDateTime) bVar;
        }
        try {
            ZoneOffset B = ZoneOffset.B(bVar);
            try {
                return new OffsetDateTime(LocalDateTime.M(bVar), B);
            } catch (DateTimeException unused) {
                return A(Instant.z(bVar), B);
            }
        } catch (DateTimeException unused2) {
            throw new DateTimeException(je.Q0(bVar, je.b1("Unable to obtain OffsetDateTime from TemporalAccessor: ", bVar, ", type ")));
        }
    }

    private Object writeReplace() {
        return new Ser((byte) 69, this);
    }

    public static OffsetDateTime z(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    /* renamed from: B */
    public OffsetDateTime v(long j, i iVar) {
        if (iVar instanceof ChronoUnit) {
            return G(this.dateTime.v(j, iVar), this.offset);
        }
        return (OffsetDateTime) iVar.h(this, j);
    }

    public long D() {
        return this.dateTime.C(this.offset);
    }

    public LocalTime F() {
        return this.dateTime.G();
    }

    /* access modifiers changed from: package-private */
    public void I(DataOutput dataOutput) {
        this.dateTime.v0(dataOutput);
        this.offset.L(dataOutput);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public int compareTo(OffsetDateTime offsetDateTime) {
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        if (this.offset.equals(offsetDateTime2.offset)) {
            return this.dateTime.compareTo(offsetDateTime2.dateTime);
        }
        int l = yif.l(D(), offsetDateTime2.D());
        return (l == 0 && (l = F().C() - offsetDateTime2.F().C()) == 0) ? this.dateTime.compareTo(offsetDateTime2.dateTime) : l;
    }

    @Override // org.threeten.bp.temporal.a
    public a d(f fVar, long j) {
        if (!(fVar instanceof ChronoField)) {
            return (OffsetDateTime) fVar.g(this, j);
        }
        ChronoField chronoField = (ChronoField) fVar;
        int ordinal = chronoField.ordinal();
        if (ordinal == 28) {
            return A(Instant.G(j, (long) x()), this.offset);
        }
        if (ordinal != 29) {
            return G(this.dateTime.d(fVar, j), this.offset);
        }
        return G(this.dateTime, ZoneOffset.G(chronoField.p(j)));
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetDateTime)) {
            return false;
        }
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        if (!this.dateTime.equals(offsetDateTime.dateTime) || !this.offset.equals(offsetDateTime.offset)) {
            return false;
        }
        return true;
    }

    @Override // org.threeten.bp.temporal.c
    public a g(a aVar) {
        return aVar.d(ChronoField.EPOCH_DAY, this.dateTime.r0().F()).d(ChronoField.NANO_OF_DAY, F().U()).d(ChronoField.OFFSET_SECONDS, (long) this.offset.C());
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.dateTime.hashCode() ^ this.offset.hashCode();
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public ValueRange k(f fVar) {
        if (!(fVar instanceof ChronoField)) {
            return fVar.i(this);
        }
        if (fVar == ChronoField.INSTANT_SECONDS || fVar == ChronoField.OFFSET_SECONDS) {
            return fVar.k();
        }
        return this.dateTime.k(fVar);
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public <R> R m(h<R> hVar) {
        if (hVar == g.a()) {
            return (R) IsoChronology.c;
        }
        if (hVar == g.e()) {
            return (R) ChronoUnit.NANOS;
        }
        if (hVar == g.d() || hVar == g.f()) {
            return (R) this.offset;
        }
        if (hVar == g.b()) {
            return (R) this.dateTime.r0();
        }
        if (hVar == g.c()) {
            return (R) F();
        }
        if (hVar == g.g()) {
            return null;
        }
        return (R) super.m(hVar);
    }

    @Override // org.threeten.bp.temporal.b
    public boolean n(f fVar) {
        return (fVar instanceof ChronoField) || (fVar != null && fVar.h(this));
    }

    @Override // defpackage.bqf, org.threeten.bp.temporal.a
    public a p(long j, i iVar) {
        return j == Long.MIN_VALUE ? v(Long.MAX_VALUE, iVar).v(1, iVar) : v(-j, iVar);
    }

    @Override // org.threeten.bp.temporal.a
    public long q(a aVar, i iVar) {
        OffsetDateTime w = w(aVar);
        if (!(iVar instanceof ChronoUnit)) {
            return iVar.g(this, w);
        }
        ZoneOffset zoneOffset = this.offset;
        if (!zoneOffset.equals(w.offset)) {
            w = new OffsetDateTime(w.dateTime.m0((long) (zoneOffset.C() - w.offset.C())), zoneOffset);
        }
        return this.dateTime.q(w.dateTime, iVar);
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public int r(f fVar) {
        if (!(fVar instanceof ChronoField)) {
            return super.r(fVar);
        }
        int ordinal = ((ChronoField) fVar).ordinal();
        if (ordinal == 28) {
            throw new DateTimeException(je.z0("Field too large for an int: ", fVar));
        } else if (ordinal != 29) {
            return this.dateTime.r(fVar);
        } else {
            return this.offset.C();
        }
    }

    @Override // org.threeten.bp.temporal.a
    public a s(c cVar) {
        if ((cVar instanceof LocalDate) || (cVar instanceof LocalTime) || (cVar instanceof LocalDateTime)) {
            return G(this.dateTime.s(cVar), this.offset);
        }
        if (cVar instanceof Instant) {
            return A((Instant) cVar, this.offset);
        }
        if (cVar instanceof ZoneOffset) {
            return G(this.dateTime, (ZoneOffset) cVar);
        }
        if (cVar instanceof OffsetDateTime) {
            return (OffsetDateTime) cVar;
        }
        return (OffsetDateTime) cVar.g(this);
    }

    @Override // java.lang.Object
    public String toString() {
        return this.dateTime.toString() + this.offset.toString();
    }

    @Override // org.threeten.bp.temporal.b
    public long u(f fVar) {
        if (!(fVar instanceof ChronoField)) {
            return fVar.l(this);
        }
        int ordinal = ((ChronoField) fVar).ordinal();
        if (ordinal == 28) {
            return D();
        }
        if (ordinal != 29) {
            return this.dateTime.u(fVar);
        }
        return (long) this.offset.C();
    }

    public int x() {
        return this.dateTime.N();
    }
}
