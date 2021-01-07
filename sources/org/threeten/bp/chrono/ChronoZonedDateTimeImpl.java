package org.threeten.bp.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.chrono.a;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.i;
import org.threeten.bp.zone.ZoneOffsetTransition;
import org.threeten.bp.zone.ZoneRules;

/* access modifiers changed from: package-private */
public final class ChronoZonedDateTimeImpl<D extends a> extends d<D> implements Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    private final ChronoLocalDateTimeImpl<D> dateTime;
    private final ZoneOffset offset;
    private final ZoneId zone;

    private ChronoZonedDateTimeImpl(ChronoLocalDateTimeImpl<D> chronoLocalDateTimeImpl, ZoneOffset zoneOffset, ZoneId zoneId) {
        yif.J(chronoLocalDateTimeImpl, "dateTime");
        this.dateTime = chronoLocalDateTimeImpl;
        yif.J(zoneOffset, "offset");
        this.offset = zoneOffset;
        yif.J(zoneId, "zone");
        this.zone = zoneId;
    }

    static <R extends a> d<R> N(ChronoLocalDateTimeImpl<R> chronoLocalDateTimeImpl, ZoneId zoneId, ZoneOffset zoneOffset) {
        yif.J(chronoLocalDateTimeImpl, "localDateTime");
        yif.J(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ChronoZonedDateTimeImpl(chronoLocalDateTimeImpl, (ZoneOffset) zoneId, zoneId);
        }
        ZoneRules l = zoneId.l();
        LocalDateTime M = LocalDateTime.M(chronoLocalDateTimeImpl);
        List<ZoneOffset> c = l.c(M);
        if (c.size() == 1) {
            zoneOffset = c.get(0);
        } else if (c.size() == 0) {
            ZoneOffsetTransition b = l.b(M);
            chronoLocalDateTimeImpl = chronoLocalDateTimeImpl.P(b.h().g());
            zoneOffset = b.i();
        } else if (zoneOffset == null || !c.contains(zoneOffset)) {
            zoneOffset = c.get(0);
        }
        yif.J(zoneOffset, "offset");
        return new ChronoZonedDateTimeImpl(chronoLocalDateTimeImpl, zoneOffset, zoneId);
    }

    static <R extends a> ChronoZonedDateTimeImpl<R> O(e eVar, Instant instant, ZoneId zoneId) {
        ZoneOffset a = zoneId.l().a(instant);
        yif.J(a, "offset");
        return new ChronoZonedDateTimeImpl<>((ChronoLocalDateTimeImpl) eVar.r(LocalDateTime.f0(instant.A(), instant.B(), a)), a, zoneId);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 13, this);
    }

    @Override // org.threeten.bp.chrono.d
    /* renamed from: B */
    public d<D> v(long j, i iVar) {
        if (!(iVar instanceof ChronoUnit)) {
            return D().z().l(iVar.h(this, j));
        }
        return D().z().l(this.dateTime.v(j, iVar).g(this));
    }

    @Override // org.threeten.bp.chrono.d
    public b<D> F() {
        return this.dateTime;
    }

    @Override // org.threeten.bp.chrono.d
    /* renamed from: J */
    public d<D> d(f fVar, long j) {
        if (!(fVar instanceof ChronoField)) {
            return D().z().l(fVar.g(this, j));
        }
        ChronoField chronoField = (ChronoField) fVar;
        int ordinal = chronoField.ordinal();
        if (ordinal == 28) {
            return v(j - C(), ChronoUnit.SECONDS);
        }
        if (ordinal != 29) {
            return N(this.dateTime.d(fVar, j), this.zone, this.offset);
        }
        return O(D().z(), this.dateTime.D(ZoneOffset.G(chronoField.p(j))), this.zone);
    }

    @Override // org.threeten.bp.chrono.d
    public d<D> L(ZoneId zoneId) {
        yif.J(zoneId, "zone");
        if (this.zone.equals(zoneId)) {
            return this;
        }
        return O(D().z(), this.dateTime.D(this.offset), zoneId);
    }

    @Override // org.threeten.bp.chrono.d
    public d<D> M(ZoneId zoneId) {
        return N(this.dateTime, zoneId, this.offset);
    }

    @Override // org.threeten.bp.chrono.d, java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d) || compareTo((d) obj) != 0) {
            return false;
        }
        return true;
    }

    @Override // org.threeten.bp.chrono.d, java.lang.Object
    public int hashCode() {
        return (this.dateTime.hashCode() ^ this.offset.hashCode()) ^ Integer.rotateLeft(this.zone.hashCode(), 3);
    }

    @Override // org.threeten.bp.temporal.b
    public boolean n(f fVar) {
        return (fVar instanceof ChronoField) || (fVar != null && fVar.h(this));
    }

    @Override // org.threeten.bp.temporal.a
    public long q(org.threeten.bp.temporal.a aVar, i iVar) {
        d<?> x = D().z().x(aVar);
        if (!(iVar instanceof ChronoUnit)) {
            return iVar.g(this, x);
        }
        return this.dateTime.q(x.L(this.offset).F(), iVar);
    }

    @Override // org.threeten.bp.chrono.d, java.lang.Object
    public String toString() {
        String str = this.dateTime.toString() + this.offset.toString();
        if (this.offset == this.zone) {
            return str;
        }
        return str + '[' + this.zone.toString() + ']';
    }

    /* access modifiers changed from: package-private */
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.dateTime);
        objectOutput.writeObject(this.offset);
        objectOutput.writeObject(this.zone);
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
