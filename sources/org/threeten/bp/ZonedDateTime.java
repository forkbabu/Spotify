package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.List;
import org.threeten.bp.chrono.d;
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
import org.threeten.bp.zone.ZoneOffsetTransition;
import org.threeten.bp.zone.ZoneRules;

public final class ZonedDateTime extends d<LocalDate> implements a, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    private final LocalDateTime dateTime;
    private final ZoneOffset offset;
    private final ZoneId zone;

    private ZonedDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneId zoneId) {
        this.dateTime = localDateTime;
        this.offset = zoneOffset;
        this.zone = zoneId;
    }

    private static ZonedDateTime N(long j, int i, ZoneId zoneId) {
        ZoneOffset a = zoneId.l().a(Instant.G(j, (long) i));
        return new ZonedDateTime(LocalDateTime.f0(j, i, a), a, zoneId);
    }

    public static ZonedDateTime O(b bVar) {
        if (bVar instanceof ZonedDateTime) {
            return (ZonedDateTime) bVar;
        }
        try {
            ZoneId h = ZoneId.h(bVar);
            ChronoField chronoField = ChronoField.INSTANT_SECONDS;
            if (bVar.n(chronoField)) {
                try {
                    return N(bVar.u(chronoField), bVar.r(ChronoField.NANO_OF_SECOND), h);
                } catch (DateTimeException unused) {
                }
            }
            return S(LocalDateTime.M(bVar), h, null);
        } catch (DateTimeException unused2) {
            throw new DateTimeException(je.Q0(bVar, je.b1("Unable to obtain ZonedDateTime from TemporalAccessor: ", bVar, ", type ")));
        }
    }

    public static ZonedDateTime Q(Instant instant, ZoneId zoneId) {
        yif.J(instant, "instant");
        yif.J(zoneId, "zone");
        return N(instant.A(), instant.B(), zoneId);
    }

    public static ZonedDateTime S(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        yif.J(localDateTime, "localDateTime");
        yif.J(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, (ZoneOffset) zoneId, zoneId);
        }
        ZoneRules l = zoneId.l();
        List<ZoneOffset> c = l.c(localDateTime);
        if (c.size() == 1) {
            zoneOffset = c.get(0);
        } else if (c.size() == 0) {
            ZoneOffsetTransition b = l.b(localDateTime);
            localDateTime = localDateTime.m0(b.h().g());
            zoneOffset = b.i();
        } else if (zoneOffset == null || !c.contains(zoneOffset)) {
            ZoneOffset zoneOffset2 = c.get(0);
            yif.J(zoneOffset2, "offset");
            zoneOffset = zoneOffset2;
        }
        return new ZonedDateTime(localDateTime, zoneOffset, zoneId);
    }

    static ZonedDateTime U(DataInput dataInput) {
        LocalDateTime q0 = LocalDateTime.q0(dataInput);
        ZoneOffset J = ZoneOffset.J(dataInput);
        ZoneId zoneId = (ZoneId) Ser.a(dataInput);
        yif.J(q0, "localDateTime");
        yif.J(J, "offset");
        yif.J(zoneId, "zone");
        if (!(zoneId instanceof ZoneOffset) || J.equals(zoneId)) {
            return new ZonedDateTime(q0, J, zoneId);
        }
        throw new IllegalArgumentException("ZoneId must match ZoneOffset");
    }

    private ZonedDateTime W(LocalDateTime localDateTime) {
        return S(localDateTime, this.zone, this.offset);
    }

    private ZonedDateTime b0(ZoneOffset zoneOffset) {
        return (zoneOffset.equals(this.offset) || !this.zone.l().f(this.dateTime, zoneOffset)) ? this : new ZonedDateTime(this.dateTime, zoneOffset, this.zone);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 6, this);
    }

    /* Return type fixed from 'org.threeten.bp.chrono.b' to match base method */
    @Override // org.threeten.bp.chrono.d
    public org.threeten.bp.chrono.b<LocalDate> F() {
        return this.dateTime;
    }

    @Override // org.threeten.bp.chrono.d
    public LocalTime G() {
        return this.dateTime.G();
    }

    /* Return type fixed from 'org.threeten.bp.chrono.d' to match base method */
    @Override // org.threeten.bp.chrono.d
    public d<LocalDate> M(ZoneId zoneId) {
        yif.J(zoneId, "zone");
        return this.zone.equals(zoneId) ? this : S(this.dateTime, zoneId, this.offset);
    }

    /* renamed from: P */
    public ZonedDateTime p(long j, i iVar) {
        return j == Long.MIN_VALUE ? v(Long.MAX_VALUE, iVar).v(1, iVar) : v(-j, iVar);
    }

    /* renamed from: T */
    public ZonedDateTime v(long j, i iVar) {
        if (!(iVar instanceof ChronoUnit)) {
            return (ZonedDateTime) iVar.h(this, j);
        }
        if (iVar.d()) {
            return W(this.dateTime.v(j, iVar));
        }
        LocalDateTime h0 = this.dateTime.v(j, iVar);
        ZoneOffset zoneOffset = this.offset;
        ZoneId zoneId = this.zone;
        yif.J(h0, "localDateTime");
        yif.J(zoneOffset, "offset");
        yif.J(zoneId, "zone");
        return N(h0.C(zoneOffset), h0.N(), zoneId);
    }

    /* renamed from: c0 */
    public LocalDate D() {
        return this.dateTime.r0();
    }

    @Override // org.threeten.bp.chrono.d, java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedDateTime)) {
            return false;
        }
        ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
        if (!this.dateTime.equals(zonedDateTime.dateTime) || !this.offset.equals(zonedDateTime.offset) || !this.zone.equals(zonedDateTime.zone)) {
            return false;
        }
        return true;
    }

    public LocalDateTime f0() {
        return this.dateTime;
    }

    /* renamed from: h0 */
    public ZonedDateTime s(c cVar) {
        if (cVar instanceof LocalDate) {
            return S(LocalDateTime.c0((LocalDate) cVar, this.dateTime.G()), this.zone, this.offset);
        }
        if (cVar instanceof LocalTime) {
            return S(LocalDateTime.c0(this.dateTime.r0(), (LocalTime) cVar), this.zone, this.offset);
        }
        if (cVar instanceof LocalDateTime) {
            return W((LocalDateTime) cVar);
        }
        if (cVar instanceof Instant) {
            Instant instant = (Instant) cVar;
            return N(instant.A(), instant.B(), this.zone);
        } else if (cVar instanceof ZoneOffset) {
            return b0((ZoneOffset) cVar);
        } else {
            return (ZonedDateTime) cVar.g(this);
        }
    }

    @Override // org.threeten.bp.chrono.d, java.lang.Object
    public int hashCode() {
        return (this.dateTime.hashCode() ^ this.offset.hashCode()) ^ Integer.rotateLeft(this.zone.hashCode(), 3);
    }

    /* renamed from: j0 */
    public ZonedDateTime d(f fVar, long j) {
        if (!(fVar instanceof ChronoField)) {
            return (ZonedDateTime) fVar.g(this, j);
        }
        ChronoField chronoField = (ChronoField) fVar;
        int ordinal = chronoField.ordinal();
        if (ordinal == 28) {
            return N(j, this.dateTime.N(), this.zone);
        }
        if (ordinal != 29) {
            return W(this.dateTime.d(fVar, j));
        }
        return b0(ZoneOffset.G(chronoField.p(j)));
    }

    @Override // org.threeten.bp.chrono.d, defpackage.cqf, org.threeten.bp.temporal.b
    public ValueRange k(f fVar) {
        if (!(fVar instanceof ChronoField)) {
            return fVar.i(this);
        }
        if (fVar == ChronoField.INSTANT_SECONDS || fVar == ChronoField.OFFSET_SECONDS) {
            return fVar.k();
        }
        return this.dateTime.k(fVar);
    }

    /* renamed from: k0 */
    public ZonedDateTime L(ZoneId zoneId) {
        yif.J(zoneId, "zone");
        return this.zone.equals(zoneId) ? this : N(this.dateTime.C(this.offset), this.dateTime.N(), zoneId);
    }

    @Override // org.threeten.bp.chrono.d, defpackage.cqf, org.threeten.bp.temporal.b
    public <R> R m(h<R> hVar) {
        return hVar == g.b() ? (R) D() : (R) super.m(hVar);
    }

    /* access modifiers changed from: package-private */
    public void m0(DataOutput dataOutput) {
        this.dateTime.v0(dataOutput);
        this.offset.L(dataOutput);
        this.zone.z(dataOutput);
    }

    @Override // org.threeten.bp.temporal.b
    public boolean n(f fVar) {
        return (fVar instanceof ChronoField) || (fVar != null && fVar.h(this));
    }

    @Override // org.threeten.bp.temporal.a
    public long q(a aVar, i iVar) {
        ZonedDateTime O = O(aVar);
        if (!(iVar instanceof ChronoUnit)) {
            return iVar.g(this, O);
        }
        ZonedDateTime k0 = O.L(this.zone);
        if (iVar.d()) {
            return this.dateTime.q(k0.dateTime, iVar);
        }
        return OffsetDateTime.z(this.dateTime, this.offset).q(OffsetDateTime.z(k0.dateTime, k0.offset), iVar);
    }

    @Override // org.threeten.bp.chrono.d, defpackage.cqf, org.threeten.bp.temporal.b
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

    @Override // org.threeten.bp.chrono.d, java.lang.Object
    public String toString() {
        String str = this.dateTime.toString() + this.offset.toString();
        if (this.offset == this.zone) {
            return str;
        }
        return str + '[' + this.zone.toString() + ']';
    }

    @Override // org.threeten.bp.chrono.d, org.threeten.bp.temporal.b
    public long u(f fVar) {
        if (!(fVar instanceof ChronoField)) {
            return fVar.l(this);
        }
        int ordinal = ((ChronoField) fVar).ordinal();
        if (ordinal == 28) {
            return C();
        }
        if (ordinal != 29) {
            return this.dateTime.u(fVar);
        }
        return (long) this.offset.C();
    }

    @Override // org.threeten.bp.chrono.d
    public ZoneOffset x() {
        return this.offset;
    }

    @Override // org.threeten.bp.chrono.d
    public ZoneId z() {
        return this.zone;
    }
}
