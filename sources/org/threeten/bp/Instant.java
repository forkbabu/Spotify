package org.threeten.bp;

import com.adjust.sdk.Constants;
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

public final class Instant extends cqf implements a, c, Comparable<Instant>, Serializable {
    public static final Instant a = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;
    private final int nanos;
    private final long seconds;

    static {
        G(-31557014167219200L, 0);
        G(31556889864403199L, 999999999);
    }

    private Instant(long j, int i) {
        this.seconds = j;
        this.nanos = i;
    }

    private long C(Instant instant) {
        return yif.O(yif.P(yif.S(instant.seconds, this.seconds), 1000000000), (long) (instant.nanos - this.nanos));
    }

    public static Instant D(long j) {
        return x(yif.o(j, 1000), yif.q(j, Constants.ONE_SECOND) * 1000000);
    }

    public static Instant F(long j) {
        return x(j, 0);
    }

    public static Instant G(long j, long j2) {
        return x(yif.O(j, yif.o(j2, 1000000000)), yif.q(j2, 1000000000));
    }

    private Instant I(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return G(yif.O(yif.O(this.seconds, j), j2 / 1000000000), ((long) this.nanos) + (j2 % 1000000000));
    }

    private long M(Instant instant) {
        long S = yif.S(instant.seconds, this.seconds);
        long j = (long) (instant.nanos - this.nanos);
        if (S <= 0 || j >= 0) {
            return (S >= 0 || j <= 0) ? S : S + 1;
        }
        return S - 1;
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 2, this);
    }

    private static Instant x(long j, int i) {
        if ((((long) i) | j) == 0) {
            return a;
        }
        if (j >= -31557014167219200L && j <= 31556889864403199L) {
            return new Instant(j, i);
        }
        throw new DateTimeException("Instant exceeds minimum or maximum instant");
    }

    public static Instant z(b bVar) {
        try {
            return G(bVar.u(ChronoField.INSTANT_SECONDS), (long) bVar.r(ChronoField.NANO_OF_SECOND));
        } catch (DateTimeException e) {
            throw new DateTimeException(je.Q0(bVar, je.b1("Unable to obtain Instant from TemporalAccessor: ", bVar, ", type ")), e);
        }
    }

    public long A() {
        return this.seconds;
    }

    public int B() {
        return this.nanos;
    }

    /* renamed from: J */
    public Instant v(long j, i iVar) {
        if (!(iVar instanceof ChronoUnit)) {
            return (Instant) iVar.h(this, j);
        }
        switch (((ChronoUnit) iVar).ordinal()) {
            case 0:
                return I(0, j);
            case 1:
                return I(j / 1000000, (j % 1000000) * 1000);
            case 2:
                return I(j / 1000, (j % 1000) * 1000000);
            case 3:
                return I(j, 0);
            case 4:
                return L(yif.P(j, 60));
            case 5:
                return L(yif.P(j, 3600));
            case 6:
                return L(yif.P(j, 43200));
            case 7:
                return L(yif.P(j, 86400));
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + iVar);
        }
    }

    public Instant L(long j) {
        return I(j, 0);
    }

    public long N() {
        long j = this.seconds;
        if (j >= 0) {
            return yif.O(yif.Q(j, 1000), (long) (this.nanos / 1000000));
        }
        return yif.S(yif.Q(j + 1, 1000), 1000 - ((long) (this.nanos / 1000000)));
    }

    /* access modifiers changed from: package-private */
    public void O(DataOutput dataOutput) {
        dataOutput.writeLong(this.seconds);
        dataOutput.writeInt(this.nanos);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public int compareTo(Instant instant) {
        Instant instant2 = instant;
        int l = yif.l(this.seconds, instant2.seconds);
        return l != 0 ? l : this.nanos - instant2.nanos;
    }

    @Override // org.threeten.bp.temporal.a
    public a d(f fVar, long j) {
        if (!(fVar instanceof ChronoField)) {
            return (Instant) fVar.g(this, j);
        }
        ChronoField chronoField = (ChronoField) fVar;
        chronoField.q(j);
        int ordinal = chronoField.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                int i = ((int) j) * Constants.ONE_SECOND;
                if (i != this.nanos) {
                    return x(this.seconds, i);
                }
            } else if (ordinal == 4) {
                int i2 = ((int) j) * 1000000;
                if (i2 != this.nanos) {
                    return x(this.seconds, i2);
                }
            } else if (ordinal != 28) {
                throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
            } else if (j != this.seconds) {
                return x(j, this.nanos);
            }
        } else if (j != ((long) this.nanos)) {
            return x(this.seconds, (int) j);
        }
        return this;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        if (this.seconds == instant.seconds && this.nanos == instant.nanos) {
            return true;
        }
        return false;
    }

    @Override // org.threeten.bp.temporal.c
    public a g(a aVar) {
        return aVar.d(ChronoField.INSTANT_SECONDS, this.seconds).d(ChronoField.NANO_OF_SECOND, (long) this.nanos);
    }

    @Override // java.lang.Object
    public int hashCode() {
        long j = this.seconds;
        return (this.nanos * 51) + ((int) (j ^ (j >>> 32)));
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public ValueRange k(f fVar) {
        return super.k(fVar);
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public <R> R m(h<R> hVar) {
        if (hVar == g.e()) {
            return (R) ChronoUnit.NANOS;
        }
        if (hVar == g.b() || hVar == g.c() || hVar == g.a() || hVar == g.g() || hVar == g.f() || hVar == g.d()) {
            return null;
        }
        return hVar.a(this);
    }

    @Override // org.threeten.bp.temporal.b
    public boolean n(f fVar) {
        if (fVar instanceof ChronoField) {
            if (fVar == ChronoField.INSTANT_SECONDS || fVar == ChronoField.NANO_OF_SECOND || fVar == ChronoField.MICRO_OF_SECOND || fVar == ChronoField.MILLI_OF_SECOND) {
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
        Instant z = z(aVar);
        if (!(iVar instanceof ChronoUnit)) {
            return iVar.g(this, z);
        }
        switch (((ChronoUnit) iVar).ordinal()) {
            case 0:
                return C(z);
            case 1:
                return C(z) / 1000;
            case 2:
                return yif.S(z.N(), N());
            case 3:
                return M(z);
            case 4:
                return M(z) / 60;
            case 5:
                return M(z) / 3600;
            case 6:
                return M(z) / 43200;
            case 7:
                return M(z) / 86400;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + iVar);
        }
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public int r(f fVar) {
        if (!(fVar instanceof ChronoField)) {
            return k(fVar).a(fVar.l(this), fVar);
        }
        int ordinal = ((ChronoField) fVar).ordinal();
        if (ordinal == 0) {
            return this.nanos;
        }
        if (ordinal == 2) {
            return this.nanos / Constants.ONE_SECOND;
        }
        if (ordinal == 4) {
            return this.nanos / 1000000;
        }
        throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
    }

    @Override // org.threeten.bp.temporal.a
    public a s(c cVar) {
        return (Instant) cVar.g(this);
    }

    @Override // java.lang.Object
    public String toString() {
        return org.threeten.bp.format.b.l.a(this);
    }

    @Override // org.threeten.bp.temporal.b
    public long u(f fVar) {
        int i;
        if (!(fVar instanceof ChronoField)) {
            return fVar.l(this);
        }
        int ordinal = ((ChronoField) fVar).ordinal();
        if (ordinal == 0) {
            i = this.nanos;
        } else if (ordinal == 2) {
            i = this.nanos / Constants.ONE_SECOND;
        } else if (ordinal == 4) {
            i = this.nanos / 1000000;
        } else if (ordinal == 28) {
            return this.seconds;
        } else {
            throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
        }
        return (long) i;
    }

    public int w(Instant instant) {
        int l = yif.l(this.seconds, instant.seconds);
        if (l != 0) {
            return l;
        }
        return this.nanos - instant.nanos;
    }
}
