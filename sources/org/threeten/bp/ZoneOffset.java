package org.threeten.bp;

import com.spotify.music.features.ads.model.Ad;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.c;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;
import org.threeten.bp.temporal.h;
import org.threeten.bp.zone.ZoneRules;

public final class ZoneOffset extends ZoneId implements b, c, Comparable<ZoneOffset>, Serializable {
    private static final ConcurrentMap<Integer, ZoneOffset> c = new ConcurrentHashMap(16, 0.75f, 4);
    private static final ConcurrentMap<String, ZoneOffset> f = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset n = G(0);
    public static final ZoneOffset o = G(-64800);
    public static final ZoneOffset p = G(64800);
    private static final long serialVersionUID = 2357656521762053153L;
    private final transient String b;
    private final int totalSeconds;

    private ZoneOffset(int i) {
        String str;
        this.totalSeconds = i;
        if (i == 0) {
            str = "Z";
        } else {
            int abs = Math.abs(i);
            StringBuilder sb = new StringBuilder();
            int i2 = abs / 3600;
            int i3 = (abs / 60) % 60;
            sb.append(i < 0 ? "-" : "+");
            sb.append(i2 < 10 ? Ad.DEFAULT_SKIPPABLE_AD_DELAY : "");
            sb.append(i2);
            String str2 = ":0";
            sb.append(i3 < 10 ? str2 : ":");
            sb.append(i3);
            int i4 = abs % 60;
            if (i4 != 0) {
                sb.append(i4 >= 10 ? ":" : str2);
                sb.append(i4);
            }
            str = sb.toString();
        }
        this.b = str;
    }

    public static ZoneOffset B(b bVar) {
        ZoneOffset zoneOffset = (ZoneOffset) bVar.m(g.d());
        if (zoneOffset != null) {
            return zoneOffset;
        }
        throw new DateTimeException(je.Q0(bVar, je.b1("Unable to obtain ZoneOffset from TemporalAccessor: ", bVar, ", type ")));
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.threeten.bp.ZoneOffset D(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            defpackage.yif.J(r7, r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, org.threeten.bp.ZoneOffset> r0 = org.threeten.bp.ZoneOffset.f
            java.lang.Object r0 = r0.get(r7)
            org.threeten.bp.ZoneOffset r0 = (org.threeten.bp.ZoneOffset) r0
            if (r0 == 0) goto L_0x0010
            return r0
        L_0x0010:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x0062
            r1 = 3
            if (r0 == r1) goto L_0x007e
            r4 = 5
            if (r0 == r4) goto L_0x0059
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L_0x0050
            r5 = 7
            if (r0 == r5) goto L_0x0043
            r1 = 9
            if (r0 != r1) goto L_0x0037
            int r0 = I(r7, r2, r3)
            int r1 = I(r7, r6, r2)
            int r2 = I(r7, r5, r2)
            goto L_0x0084
        L_0x0037:
            org.threeten.bp.DateTimeException r0 = new org.threeten.bp.DateTimeException
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            java.lang.String r7 = defpackage.je.x0(r1, r7)
            r0.<init>(r7)
            throw r0
        L_0x0043:
            int r0 = I(r7, r2, r3)
            int r1 = I(r7, r1, r3)
            int r2 = I(r7, r4, r3)
            goto L_0x0084
        L_0x0050:
            int r0 = I(r7, r2, r3)
            int r1 = I(r7, r6, r2)
            goto L_0x0083
        L_0x0059:
            int r0 = I(r7, r2, r3)
            int r1 = I(r7, r1, r3)
            goto L_0x0083
        L_0x0062:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = r7.charAt(r3)
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            char r7 = r7.charAt(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
        L_0x007e:
            int r0 = I(r7, r2, r3)
            r1 = 0
        L_0x0083:
            r2 = 0
        L_0x0084:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L_0x009d
            if (r3 != r5) goto L_0x0091
            goto L_0x009d
        L_0x0091:
            org.threeten.bp.DateTimeException r0 = new org.threeten.bp.DateTimeException
            java.lang.String r1 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            java.lang.String r7 = defpackage.je.x0(r1, r7)
            r0.<init>(r7)
            throw r0
        L_0x009d:
            if (r3 != r5) goto L_0x00a7
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            org.threeten.bp.ZoneOffset r7 = F(r7, r0, r1)
            return r7
        L_0x00a7:
            org.threeten.bp.ZoneOffset r7 = F(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.ZoneOffset.D(java.lang.String):org.threeten.bp.ZoneOffset");
    }

    public static ZoneOffset F(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            throw new DateTimeException(je.q0("Zone offset hours not in valid range: value ", i, " is not in the range -18 to 18"));
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new DateTimeException("Zone offset minutes and seconds must have the same sign");
        }
        if (Math.abs(i2) > 59) {
            StringBuilder V0 = je.V0("Zone offset minutes not in valid range: abs(value) ");
            V0.append(Math.abs(i2));
            V0.append(" is not in the range 0 to 59");
            throw new DateTimeException(V0.toString());
        } else if (Math.abs(i3) > 59) {
            StringBuilder V02 = je.V0("Zone offset seconds not in valid range: abs(value) ");
            V02.append(Math.abs(i3));
            V02.append(" is not in the range 0 to 59");
            throw new DateTimeException(V02.toString());
        } else if (Math.abs(i) != 18 || (Math.abs(i2) <= 0 && Math.abs(i3) <= 0)) {
            return G((i2 * 60) + (i * 3600) + i3);
        } else {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
    }

    public static ZoneOffset G(int i) {
        if (Math.abs(i) > 64800) {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        } else if (i % 900 != 0) {
            return new ZoneOffset(i);
        } else {
            Integer valueOf = Integer.valueOf(i);
            ConcurrentMap<Integer, ZoneOffset> concurrentMap = c;
            ZoneOffset zoneOffset = concurrentMap.get(valueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            concurrentMap.putIfAbsent(valueOf, new ZoneOffset(i));
            ZoneOffset zoneOffset2 = concurrentMap.get(valueOf);
            f.putIfAbsent(zoneOffset2.b, zoneOffset2);
            return zoneOffset2;
        }
    }

    private static int I(CharSequence charSequence, int i, boolean z) {
        if (!z || charSequence.charAt(i - 1) == ':') {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence.charAt(i + 1);
            if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9') {
                throw new DateTimeException("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) charSequence));
            }
            return (charAt2 - '0') + ((charAt - '0') * 10);
        }
        throw new DateTimeException("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) charSequence));
    }

    static ZoneOffset J(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? G(dataInput.readInt()) : G(readByte * 900);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new Ser((byte) 8, this);
    }

    public int A(ZoneOffset zoneOffset) {
        return zoneOffset.totalSeconds - this.totalSeconds;
    }

    public int C() {
        return this.totalSeconds;
    }

    /* access modifiers changed from: package-private */
    public void L(DataOutput dataOutput) {
        int i = this.totalSeconds;
        int i2 = i % 900 == 0 ? i / 900 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.totalSeconds - this.totalSeconds;
    }

    @Override // org.threeten.bp.ZoneId, java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneOffset) || this.totalSeconds != ((ZoneOffset) obj).totalSeconds) {
            return false;
        }
        return true;
    }

    @Override // org.threeten.bp.temporal.c
    public a g(a aVar) {
        return aVar.d(ChronoField.OFFSET_SECONDS, (long) this.totalSeconds);
    }

    @Override // org.threeten.bp.ZoneId, java.lang.Object
    public int hashCode() {
        return this.totalSeconds;
    }

    @Override // org.threeten.bp.ZoneId
    public String i() {
        return this.b;
    }

    @Override // org.threeten.bp.temporal.b
    public ValueRange k(f fVar) {
        if (fVar == ChronoField.OFFSET_SECONDS) {
            return fVar.k();
        }
        if (!(fVar instanceof ChronoField)) {
            return fVar.i(this);
        }
        throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
    }

    @Override // org.threeten.bp.ZoneId
    public ZoneRules l() {
        return ZoneRules.g(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: org.threeten.bp.ZoneOffset */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.threeten.bp.temporal.b
    public <R> R m(h<R> hVar) {
        if (hVar == g.d() || hVar == g.f()) {
            return this;
        }
        if (hVar == g.b() || hVar == g.c() || hVar == g.e() || hVar == g.a() || hVar == g.g()) {
            return null;
        }
        return hVar.a(this);
    }

    @Override // org.threeten.bp.temporal.b
    public boolean n(f fVar) {
        if (fVar instanceof ChronoField) {
            if (fVar == ChronoField.OFFSET_SECONDS) {
                return true;
            }
            return false;
        } else if (fVar == null || !fVar.h(this)) {
            return false;
        } else {
            return true;
        }
    }

    @Override // org.threeten.bp.temporal.b
    public int r(f fVar) {
        if (fVar == ChronoField.OFFSET_SECONDS) {
            return this.totalSeconds;
        }
        if (!(fVar instanceof ChronoField)) {
            return k(fVar).a(u(fVar), fVar);
        }
        throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
    }

    @Override // org.threeten.bp.ZoneId, java.lang.Object
    public String toString() {
        return this.b;
    }

    @Override // org.threeten.bp.temporal.b
    public long u(f fVar) {
        if (fVar == ChronoField.OFFSET_SECONDS) {
            return (long) this.totalSeconds;
        }
        if (!(fVar instanceof ChronoField)) {
            return fVar.l(this);
        }
        throw new DateTimeException(je.z0("Unsupported field: ", fVar));
    }

    /* access modifiers changed from: package-private */
    @Override // org.threeten.bp.ZoneId
    public void z(DataOutput dataOutput) {
        dataOutput.writeByte(8);
        L(dataOutput);
    }
}
