package org.threeten.bp;

import com.adjust.sdk.Constants;
import com.spotify.music.features.ads.model.Ad;
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

public final class LocalTime extends cqf implements a, c, Comparable<LocalTime>, Serializable {
    public static final LocalTime a;
    public static final LocalTime b = new LocalTime(23, 59, 59, 999999999);
    public static final LocalTime c;
    private static final LocalTime[] f = new LocalTime[24];
    private static final long serialVersionUID = 6414437269572265201L;
    private final byte hour;
    private final byte minute;
    private final int nano;
    private final byte second;

    static {
        int i = 0;
        while (true) {
            LocalTime[] localTimeArr = f;
            if (i < localTimeArr.length) {
                localTimeArr[i] = new LocalTime(i, 0, 0, 0);
                i++;
            } else {
                c = localTimeArr[0];
                LocalTime localTime = localTimeArr[12];
                a = localTimeArr[0];
                return;
            }
        }
    }

    private LocalTime(int i, int i2, int i3, int i4) {
        this.hour = (byte) i;
        this.minute = (byte) i2;
        this.second = (byte) i3;
        this.nano = i4;
    }

    private int A(f fVar) {
        switch (((ChronoField) fVar).ordinal()) {
            case 0:
                return this.nano;
            case 1:
                throw new DateTimeException(je.z0("Field too large for an int: ", fVar));
            case 2:
                return this.nano / Constants.ONE_SECOND;
            case 3:
                throw new DateTimeException(je.z0("Field too large for an int: ", fVar));
            case 4:
                return this.nano / 1000000;
            case 5:
                return (int) (U() / 1000000);
            case 6:
                return this.second;
            case 7:
                return W();
            case 8:
                return this.minute;
            case 9:
                return (this.hour * 60) + this.minute;
            case 10:
                return this.hour % 12;
            case 11:
                int i = this.hour % 12;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case 12:
                return this.hour;
            case 13:
                byte b2 = this.hour;
                if (b2 == 0) {
                    return 24;
                }
                return b2;
            case 14:
                return this.hour / 12;
            default:
                throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
        }
    }

    public static LocalTime F(int i, int i2) {
        ChronoField.HOUR_OF_DAY.q((long) i);
        if (i2 == 0) {
            return f[i];
        }
        ChronoField.MINUTE_OF_HOUR.q((long) i2);
        return new LocalTime(i, i2, 0, 0);
    }

    public static LocalTime G(int i, int i2, int i3) {
        ChronoField.HOUR_OF_DAY.q((long) i);
        if ((i2 | i3) == 0) {
            return f[i];
        }
        ChronoField.MINUTE_OF_HOUR.q((long) i2);
        ChronoField.SECOND_OF_MINUTE.q((long) i3);
        return new LocalTime(i, i2, i3, 0);
    }

    public static LocalTime I(int i, int i2, int i3, int i4) {
        ChronoField.HOUR_OF_DAY.q((long) i);
        ChronoField.MINUTE_OF_HOUR.q((long) i2);
        ChronoField.SECOND_OF_MINUTE.q((long) i3);
        ChronoField.NANO_OF_SECOND.q((long) i4);
        return x(i, i2, i3, i4);
    }

    public static LocalTime J(long j) {
        ChronoField.NANO_OF_DAY.q(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (((long) i) * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (((long) i2) * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return x(i, i2, i3, (int) (j3 - (((long) i3) * 1000000000)));
    }

    public static LocalTime L(long j) {
        ChronoField.SECOND_OF_DAY.q(j);
        int i = (int) (j / 3600);
        long j2 = j - ((long) (i * 3600));
        int i2 = (int) (j2 / 60);
        return x(i, i2, (int) (j2 - ((long) (i2 * 60))), 0);
    }

    static LocalTime M(long j, int i) {
        ChronoField.SECOND_OF_DAY.q(j);
        ChronoField.NANO_OF_SECOND.q((long) i);
        int i2 = (int) (j / 3600);
        long j2 = j - ((long) (i2 * 3600));
        int i3 = (int) (j2 / 60);
        return x(i2, i3, (int) (j2 - ((long) (i3 * 60))), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static org.threeten.bp.LocalTime T(java.io.DataInput r5) {
        /*
            byte r0 = r5.readByte()
            r1 = 0
            if (r0 >= 0) goto L_0x000c
            r0 = r0 ^ -1
            r5 = 0
        L_0x000a:
            r2 = 0
            goto L_0x002a
        L_0x000c:
            byte r2 = r5.readByte()
            if (r2 >= 0) goto L_0x0018
            r5 = r2 ^ -1
            r2 = 0
            r1 = r5
            r5 = 0
            goto L_0x002a
        L_0x0018:
            byte r3 = r5.readByte()
            if (r3 >= 0) goto L_0x0022
            r5 = r3 ^ -1
            r1 = r2
            goto L_0x000a
        L_0x0022:
            int r1 = r5.readInt()
            r5 = r3
            r4 = r2
            r2 = r1
            r1 = r4
        L_0x002a:
            org.threeten.bp.LocalTime r5 = I(r0, r1, r5, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.LocalTime.T(java.io.DataInput):org.threeten.bp.LocalTime");
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 5, this);
    }

    private static LocalTime x(int i, int i2, int i3, int i4) {
        if ((i2 | i3 | i4) == 0) {
            return f[i];
        }
        return new LocalTime(i, i2, i3, i4);
    }

    public static LocalTime z(b bVar) {
        LocalTime localTime = (LocalTime) bVar.m(g.c());
        if (localTime != null) {
            return localTime;
        }
        throw new DateTimeException(je.Q0(bVar, je.b1("Unable to obtain LocalTime from TemporalAccessor: ", bVar, ", type ")));
    }

    public int B() {
        return this.hour;
    }

    public int C() {
        return this.nano;
    }

    public int D() {
        return this.second;
    }

    /* renamed from: N */
    public LocalTime v(long j, i iVar) {
        if (!(iVar instanceof ChronoUnit)) {
            return (LocalTime) iVar.h(this, j);
        }
        switch (((ChronoUnit) iVar).ordinal()) {
            case 0:
                return Q(j);
            case 1:
                return Q((j % 86400000000L) * 1000);
            case 2:
                return Q((j % 86400000) * 1000000);
            case 3:
                return S(j);
            case 4:
                return P(j);
            case 5:
                return O(j);
            case 6:
                return O((j % 2) * 12);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + iVar);
        }
    }

    public LocalTime O(long j) {
        if (j == 0) {
            return this;
        }
        return x(((((int) (j % 24)) + this.hour) + 24) % 24, this.minute, this.second, this.nano);
    }

    public LocalTime P(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.hour * 60) + this.minute;
        int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
        if (i == i2) {
            return this;
        }
        return x(i2 / 60, i2 % 60, this.second, this.nano);
    }

    public LocalTime Q(long j) {
        if (j == 0) {
            return this;
        }
        long U = U();
        long j2 = (((j % 86400000000000L) + U) + 86400000000000L) % 86400000000000L;
        if (U == j2) {
            return this;
        }
        return x((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
    }

    public LocalTime S(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.minute * 60) + (this.hour * 3600) + this.second;
        int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
        if (i == i2) {
            return this;
        }
        return x(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.nano);
    }

    public long U() {
        return (((long) this.second) * 1000000000) + (((long) this.minute) * 60000000000L) + (((long) this.hour) * 3600000000000L) + ((long) this.nano);
    }

    public int W() {
        return (this.minute * 60) + (this.hour * 3600) + this.second;
    }

    /* renamed from: b0 */
    public LocalTime d(f fVar, long j) {
        if (!(fVar instanceof ChronoField)) {
            return (LocalTime) fVar.g(this, j);
        }
        ChronoField chronoField = (ChronoField) fVar;
        chronoField.q(j);
        switch (chronoField.ordinal()) {
            case 0:
                return f0((int) j);
            case 1:
                return J(j);
            case 2:
                return f0(((int) j) * Constants.ONE_SECOND);
            case 3:
                return J(j * 1000);
            case 4:
                return f0(((int) j) * 1000000);
            case 5:
                return J(j * 1000000);
            case 6:
                int i = (int) j;
                if (this.second == i) {
                    return this;
                }
                ChronoField.SECOND_OF_MINUTE.q((long) i);
                return x(this.hour, this.minute, i, this.nano);
            case 7:
                return S(j - ((long) W()));
            case 8:
                int i2 = (int) j;
                if (this.minute == i2) {
                    return this;
                }
                ChronoField.MINUTE_OF_HOUR.q((long) i2);
                return x(this.hour, i2, this.second, this.nano);
            case 9:
                return P(j - ((long) ((this.hour * 60) + this.minute)));
            case 10:
                return O(j - ((long) (this.hour % 12)));
            case 11:
                if (j == 12) {
                    j = 0;
                }
                return O(j - ((long) (this.hour % 12)));
            case 12:
                return c0((int) j);
            case 13:
                if (j == 24) {
                    j = 0;
                }
                return c0((int) j);
            case 14:
                return O((j - ((long) (this.hour / 12))) * 12);
            default:
                throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
        }
    }

    public LocalTime c0(int i) {
        if (this.hour == i) {
            return this;
        }
        ChronoField.HOUR_OF_DAY.q((long) i);
        return x(i, this.minute, this.second, this.nano);
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalTime)) {
            return false;
        }
        LocalTime localTime = (LocalTime) obj;
        if (this.hour == localTime.hour && this.minute == localTime.minute && this.second == localTime.second && this.nano == localTime.nano) {
            return true;
        }
        return false;
    }

    public LocalTime f0(int i) {
        if (this.nano == i) {
            return this;
        }
        ChronoField.NANO_OF_SECOND.q((long) i);
        return x(this.hour, this.minute, this.second, i);
    }

    @Override // org.threeten.bp.temporal.c
    public a g(a aVar) {
        return aVar.d(ChronoField.NANO_OF_DAY, U());
    }

    /* access modifiers changed from: package-private */
    public void h0(DataOutput dataOutput) {
        if (this.nano != 0) {
            dataOutput.writeByte(this.hour);
            dataOutput.writeByte(this.minute);
            dataOutput.writeByte(this.second);
            dataOutput.writeInt(this.nano);
        } else if (this.second != 0) {
            dataOutput.writeByte(this.hour);
            dataOutput.writeByte(this.minute);
            dataOutput.writeByte(this.second ^ -1);
        } else if (this.minute == 0) {
            dataOutput.writeByte(this.hour ^ -1);
        } else {
            dataOutput.writeByte(this.hour);
            dataOutput.writeByte(this.minute ^ -1);
        }
    }

    @Override // java.lang.Object
    public int hashCode() {
        long U = U();
        return (int) (U ^ (U >>> 32));
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public ValueRange k(f fVar) {
        return super.k(fVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: org.threeten.bp.LocalTime */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public <R> R m(h<R> hVar) {
        if (hVar == g.e()) {
            return (R) ChronoUnit.NANOS;
        }
        if (hVar == g.c()) {
            return this;
        }
        if (hVar == g.a() || hVar == g.g() || hVar == g.f() || hVar == g.d() || hVar == g.b()) {
            return null;
        }
        return hVar.a(this);
    }

    @Override // org.threeten.bp.temporal.b
    public boolean n(f fVar) {
        if (fVar instanceof ChronoField) {
            return fVar.m();
        }
        return fVar != null && fVar.h(this);
    }

    @Override // org.threeten.bp.temporal.a
    public a p(long j, i iVar) {
        return j == Long.MIN_VALUE ? v(Long.MAX_VALUE, iVar).v(1, iVar) : v(-j, iVar);
    }

    @Override // org.threeten.bp.temporal.a
    public long q(a aVar, i iVar) {
        LocalTime z = z(aVar);
        if (!(iVar instanceof ChronoUnit)) {
            return iVar.g(this, z);
        }
        long U = z.U() - U();
        switch (((ChronoUnit) iVar).ordinal()) {
            case 0:
                return U;
            case 1:
                return U / 1000;
            case 2:
                return U / 1000000;
            case 3:
                return U / 1000000000;
            case 4:
                return U / 60000000000L;
            case 5:
                return U / 3600000000000L;
            case 6:
                return U / 43200000000000L;
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + iVar);
        }
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public int r(f fVar) {
        if (fVar instanceof ChronoField) {
            return A(fVar);
        }
        return super.r(fVar);
    }

    @Override // org.threeten.bp.temporal.a
    public a s(c cVar) {
        if (cVar instanceof LocalTime) {
            return (LocalTime) cVar;
        }
        return (LocalTime) cVar.g(this);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b2 = this.hour;
        byte b3 = this.minute;
        byte b4 = this.second;
        int i = this.nano;
        sb.append(b2 < 10 ? Ad.DEFAULT_SKIPPABLE_AD_DELAY : "");
        sb.append((int) b2);
        String str = ":0";
        sb.append(b3 < 10 ? str : ":");
        sb.append((int) b3);
        if (b4 > 0 || i > 0) {
            if (b4 >= 10) {
                str = ":";
            }
            sb.append(str);
            sb.append((int) b4);
            if (i > 0) {
                sb.append('.');
                if (i % 1000000 == 0) {
                    sb.append(Integer.toString((i / 1000000) + Constants.ONE_SECOND).substring(1));
                } else if (i % Constants.ONE_SECOND == 0) {
                    sb.append(Integer.toString((i / Constants.ONE_SECOND) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    @Override // org.threeten.bp.temporal.b
    public long u(f fVar) {
        if (!(fVar instanceof ChronoField)) {
            return fVar.l(this);
        }
        if (fVar == ChronoField.NANO_OF_DAY) {
            return U();
        }
        if (fVar == ChronoField.MICRO_OF_DAY) {
            return U() / 1000;
        }
        return (long) A(fVar);
    }

    /* renamed from: w */
    public int compareTo(LocalTime localTime) {
        int k = yif.k(this.hour, localTime.hour);
        if (k != 0) {
            return k;
        }
        int k2 = yif.k(this.minute, localTime.minute);
        if (k2 != 0) {
            return k2;
        }
        int k3 = yif.k(this.second, localTime.second);
        return k3 == 0 ? yif.k(this.nano, localTime.nano) : k3;
    }
}
