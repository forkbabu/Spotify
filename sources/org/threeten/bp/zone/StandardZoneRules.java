package org.threeten.bp.zone;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.zone.ZoneRules;

final class StandardZoneRules extends ZoneRules implements Serializable {
    private static final long serialVersionUID = 3044319355680032515L;
    private final ZoneOffsetTransitionRule[] lastRules;
    private final ConcurrentMap<Integer, ZoneOffsetTransition[]> lastRulesCache = new ConcurrentHashMap();
    private final long[] savingsInstantTransitions;
    private final LocalDateTime[] savingsLocalTransitions;
    private final ZoneOffset[] standardOffsets;
    private final long[] standardTransitions;
    private final ZoneOffset[] wallOffsets;

    private StandardZoneRules(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArr) {
        this.standardTransitions = jArr;
        this.standardOffsets = zoneOffsetArr;
        this.savingsInstantTransitions = jArr2;
        this.wallOffsets = zoneOffsetArr2;
        this.lastRules = zoneOffsetTransitionRuleArr;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < jArr2.length) {
            int i2 = i + 1;
            ZoneOffsetTransition zoneOffsetTransition = new ZoneOffsetTransition(jArr2[i], zoneOffsetArr2[i], zoneOffsetArr2[i2]);
            if (zoneOffsetTransition.m()) {
                arrayList.add(zoneOffsetTransition.g());
                arrayList.add(zoneOffsetTransition.d());
            } else {
                arrayList.add(zoneOffsetTransition.d());
                arrayList.add(zoneOffsetTransition.g());
            }
            i = i2;
        }
        this.savingsLocalTransitions = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
    }

    private ZoneOffsetTransition[] h(int i) {
        Integer valueOf = Integer.valueOf(i);
        ZoneOffsetTransition[] zoneOffsetTransitionArr = this.lastRulesCache.get(valueOf);
        if (zoneOffsetTransitionArr != null) {
            return zoneOffsetTransitionArr;
        }
        ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArr = this.lastRules;
        ZoneOffsetTransition[] zoneOffsetTransitionArr2 = new ZoneOffsetTransition[zoneOffsetTransitionRuleArr.length];
        for (int i2 = 0; i2 < zoneOffsetTransitionRuleArr.length; i2++) {
            zoneOffsetTransitionArr2[i2] = zoneOffsetTransitionRuleArr[i2].a(i);
        }
        if (i < 2100) {
            this.lastRulesCache.putIfAbsent(valueOf, zoneOffsetTransitionArr2);
        }
        return zoneOffsetTransitionArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0074 A[ADDED_TO_REGION, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object i(org.threeten.bp.LocalDateTime r7) {
        /*
            r6 = this;
            org.threeten.bp.zone.ZoneOffsetTransitionRule[] r0 = r6.lastRules
            int r0 = r0.length
            r1 = 0
            if (r0 <= 0) goto L_0x0076
            org.threeten.bp.LocalDateTime[] r0 = r6.savingsLocalTransitions
            int r2 = r0.length
            int r2 = r2 + -1
            r0 = r0[r2]
            boolean r0 = r7.Q(r0)
            if (r0 == 0) goto L_0x0076
            int r0 = r7.P()
            org.threeten.bp.zone.ZoneOffsetTransition[] r0 = r6.h(r0)
            r2 = 0
            int r3 = r0.length
        L_0x001d:
            if (r1 >= r3) goto L_0x0075
            r2 = r0[r1]
            org.threeten.bp.LocalDateTime r4 = r2.g()
            boolean r5 = r2.m()
            if (r5 == 0) goto L_0x0046
            boolean r4 = r7.S(r4)
            if (r4 == 0) goto L_0x0036
            org.threeten.bp.ZoneOffset r4 = r2.k()
            goto L_0x0061
        L_0x0036:
            org.threeten.bp.LocalDateTime r4 = r2.d()
            boolean r4 = r7.S(r4)
            if (r4 == 0) goto L_0x0041
            goto L_0x0060
        L_0x0041:
            org.threeten.bp.ZoneOffset r4 = r2.i()
            goto L_0x0061
        L_0x0046:
            boolean r4 = r7.S(r4)
            if (r4 != 0) goto L_0x0051
            org.threeten.bp.ZoneOffset r4 = r2.i()
            goto L_0x0061
        L_0x0051:
            org.threeten.bp.LocalDateTime r4 = r2.d()
            boolean r4 = r7.S(r4)
            if (r4 == 0) goto L_0x0060
            org.threeten.bp.ZoneOffset r4 = r2.k()
            goto L_0x0061
        L_0x0060:
            r4 = r2
        L_0x0061:
            boolean r5 = r4 instanceof org.threeten.bp.zone.ZoneOffsetTransition
            if (r5 != 0) goto L_0x0074
            org.threeten.bp.ZoneOffset r2 = r2.k()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0070
            goto L_0x0074
        L_0x0070:
            int r1 = r1 + 1
            r2 = r4
            goto L_0x001d
        L_0x0074:
            return r4
        L_0x0075:
            return r2
        L_0x0076:
            org.threeten.bp.LocalDateTime[] r0 = r6.savingsLocalTransitions
            int r7 = java.util.Arrays.binarySearch(r0, r7)
            r0 = -1
            if (r7 != r0) goto L_0x0084
            org.threeten.bp.ZoneOffset[] r7 = r6.wallOffsets
            r7 = r7[r1]
            return r7
        L_0x0084:
            if (r7 >= 0) goto L_0x008a
            int r7 = -r7
            int r7 = r7 + -2
            goto L_0x009e
        L_0x008a:
            org.threeten.bp.LocalDateTime[] r0 = r6.savingsLocalTransitions
            int r1 = r0.length
            int r1 = r1 + -1
            if (r7 >= r1) goto L_0x009e
            r1 = r0[r7]
            int r2 = r7 + 1
            r0 = r0[r2]
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x009e
            r7 = r2
        L_0x009e:
            r0 = r7 & 1
            if (r0 != 0) goto L_0x00ca
            org.threeten.bp.LocalDateTime[] r0 = r6.savingsLocalTransitions
            r1 = r0[r7]
            int r2 = r7 + 1
            r0 = r0[r2]
            org.threeten.bp.ZoneOffset[] r2 = r6.wallOffsets
            int r7 = r7 / 2
            r3 = r2[r7]
            int r7 = r7 + 1
            r7 = r2[r7]
            int r2 = r7.C()
            int r4 = r3.C()
            if (r2 <= r4) goto L_0x00c4
            org.threeten.bp.zone.ZoneOffsetTransition r0 = new org.threeten.bp.zone.ZoneOffsetTransition
            r0.<init>(r1, r3, r7)
            return r0
        L_0x00c4:
            org.threeten.bp.zone.ZoneOffsetTransition r1 = new org.threeten.bp.zone.ZoneOffsetTransition
            r1.<init>(r0, r3, r7)
            return r1
        L_0x00ca:
            org.threeten.bp.ZoneOffset[] r0 = r6.wallOffsets
            int r7 = r7 / 2
            int r7 = r7 + 1
            r7 = r0[r7]
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.zone.StandardZoneRules.i(org.threeten.bp.LocalDateTime):java.lang.Object");
    }

    static StandardZoneRules j(DataInput dataInput) {
        int readInt = dataInput.readInt();
        long[] jArr = new long[readInt];
        for (int i = 0; i < readInt; i++) {
            jArr[i] = Ser.b(dataInput);
        }
        int i2 = readInt + 1;
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            zoneOffsetArr[i3] = Ser.d(dataInput);
        }
        int readInt2 = dataInput.readInt();
        long[] jArr2 = new long[readInt2];
        for (int i4 = 0; i4 < readInt2; i4++) {
            jArr2[i4] = Ser.b(dataInput);
        }
        int i5 = readInt2 + 1;
        ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            zoneOffsetArr2[i6] = Ser.d(dataInput);
        }
        int readByte = dataInput.readByte();
        ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArr = new ZoneOffsetTransitionRule[readByte];
        for (int i7 = 0; i7 < readByte; i7++) {
            zoneOffsetTransitionRuleArr[i7] = ZoneOffsetTransitionRule.b(dataInput);
        }
        return new StandardZoneRules(jArr, zoneOffsetArr, jArr2, zoneOffsetArr2, zoneOffsetTransitionRuleArr);
    }

    private Object writeReplace() {
        return new Ser((byte) 1, this);
    }

    @Override // org.threeten.bp.zone.ZoneRules
    public ZoneOffset a(Instant instant) {
        long A = instant.A();
        if (this.lastRules.length > 0) {
            long[] jArr = this.savingsInstantTransitions;
            if (A > jArr[jArr.length - 1]) {
                ZoneOffset[] zoneOffsetArr = this.wallOffsets;
                ZoneOffsetTransition[] h = h(LocalDate.o0(yif.o(((long) zoneOffsetArr[zoneOffsetArr.length - 1].C()) + A, 86400)).W());
                ZoneOffsetTransition zoneOffsetTransition = null;
                for (int i = 0; i < h.length; i++) {
                    zoneOffsetTransition = h[i];
                    if (A < zoneOffsetTransition.n()) {
                        return zoneOffsetTransition.k();
                    }
                }
                return zoneOffsetTransition.i();
            }
        }
        int binarySearch = Arrays.binarySearch(this.savingsInstantTransitions, A);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.wallOffsets[binarySearch + 1];
    }

    @Override // org.threeten.bp.zone.ZoneRules
    public ZoneOffsetTransition b(LocalDateTime localDateTime) {
        Object i = i(localDateTime);
        if (i instanceof ZoneOffsetTransition) {
            return (ZoneOffsetTransition) i;
        }
        return null;
    }

    @Override // org.threeten.bp.zone.ZoneRules
    public List<ZoneOffset> c(LocalDateTime localDateTime) {
        Object i = i(localDateTime);
        if (i instanceof ZoneOffsetTransition) {
            return ((ZoneOffsetTransition) i).l();
        }
        return Collections.singletonList((ZoneOffset) i);
    }

    @Override // org.threeten.bp.zone.ZoneRules
    public boolean d(Instant instant) {
        int binarySearch = Arrays.binarySearch(this.standardTransitions, instant.A());
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return !this.standardOffsets[binarySearch + 1].equals(a(instant));
    }

    @Override // org.threeten.bp.zone.ZoneRules
    public boolean e() {
        return this.savingsInstantTransitions.length == 0;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StandardZoneRules) {
            StandardZoneRules standardZoneRules = (StandardZoneRules) obj;
            if (!Arrays.equals(this.standardTransitions, standardZoneRules.standardTransitions) || !Arrays.equals(this.standardOffsets, standardZoneRules.standardOffsets) || !Arrays.equals(this.savingsInstantTransitions, standardZoneRules.savingsInstantTransitions) || !Arrays.equals(this.wallOffsets, standardZoneRules.wallOffsets) || !Arrays.equals(this.lastRules, standardZoneRules.lastRules)) {
                return false;
            }
            return true;
        }
        if ((obj instanceof ZoneRules.Fixed) && e()) {
            Instant instant = Instant.a;
            if (a(instant).equals(((ZoneRules.Fixed) obj).a(instant))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.threeten.bp.zone.ZoneRules
    public boolean f(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return c(localDateTime).contains(zoneOffset);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return (((Arrays.hashCode(this.standardTransitions) ^ Arrays.hashCode(this.standardOffsets)) ^ Arrays.hashCode(this.savingsInstantTransitions)) ^ Arrays.hashCode(this.wallOffsets)) ^ Arrays.hashCode(this.lastRules);
    }

    /* access modifiers changed from: package-private */
    public void k(DataOutput dataOutput) {
        dataOutput.writeInt(this.standardTransitions.length);
        for (long j : this.standardTransitions) {
            Ser.e(j, dataOutput);
        }
        for (ZoneOffset zoneOffset : this.standardOffsets) {
            Ser.f(zoneOffset, dataOutput);
        }
        dataOutput.writeInt(this.savingsInstantTransitions.length);
        for (long j2 : this.savingsInstantTransitions) {
            Ser.e(j2, dataOutput);
        }
        for (ZoneOffset zoneOffset2 : this.wallOffsets) {
            Ser.f(zoneOffset2, dataOutput);
        }
        dataOutput.writeByte(this.lastRules.length);
        for (ZoneOffsetTransitionRule zoneOffsetTransitionRule : this.lastRules) {
            zoneOffsetTransitionRule.c(dataOutput);
        }
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("StandardZoneRules[currentStandardOffset=");
        ZoneOffset[] zoneOffsetArr = this.standardOffsets;
        V0.append(zoneOffsetArr[zoneOffsetArr.length - 1]);
        V0.append("]");
        return V0.toString();
    }
}
