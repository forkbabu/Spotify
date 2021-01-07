package org.threeten.bp.zone;

import java.io.DataOutput;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.threeten.bp.Duration;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneOffset;

public final class ZoneOffsetTransition implements Comparable<ZoneOffsetTransition>, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;
    private final ZoneOffset offsetAfter;
    private final ZoneOffset offsetBefore;
    private final LocalDateTime transition;

    ZoneOffsetTransition(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.transition = localDateTime;
        this.offsetBefore = zoneOffset;
        this.offsetAfter = zoneOffset2;
    }

    private Object writeReplace() {
        return new Ser((byte) 2, this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public int compareTo(ZoneOffsetTransition zoneOffsetTransition) {
        ZoneOffsetTransition zoneOffsetTransition2 = zoneOffsetTransition;
        return this.transition.D(this.offsetBefore).w(zoneOffsetTransition2.transition.D(zoneOffsetTransition2.offsetBefore));
    }

    public LocalDateTime d() {
        return this.transition.m0((long) (this.offsetAfter.C() - this.offsetBefore.C()));
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ZoneOffsetTransition)) {
            return false;
        }
        ZoneOffsetTransition zoneOffsetTransition = (ZoneOffsetTransition) obj;
        if (!this.transition.equals(zoneOffsetTransition.transition) || !this.offsetBefore.equals(zoneOffsetTransition.offsetBefore) || !this.offsetAfter.equals(zoneOffsetTransition.offsetAfter)) {
            return false;
        }
        return true;
    }

    public LocalDateTime g() {
        return this.transition;
    }

    public Duration h() {
        return Duration.i((long) (this.offsetAfter.C() - this.offsetBefore.C()));
    }

    @Override // java.lang.Object
    public int hashCode() {
        return (this.transition.hashCode() ^ this.offsetBefore.hashCode()) ^ Integer.rotateLeft(this.offsetAfter.hashCode(), 16);
    }

    public ZoneOffset i() {
        return this.offsetAfter;
    }

    public ZoneOffset k() {
        return this.offsetBefore;
    }

    /* access modifiers changed from: package-private */
    public List<ZoneOffset> l() {
        if (m()) {
            return Collections.emptyList();
        }
        return Arrays.asList(this.offsetBefore, this.offsetAfter);
    }

    public boolean m() {
        return this.offsetAfter.C() > this.offsetBefore.C();
    }

    public long n() {
        return this.transition.C(this.offsetBefore);
    }

    /* access modifiers changed from: package-private */
    public void p(DataOutput dataOutput) {
        Ser.e(this.transition.C(this.offsetBefore), dataOutput);
        Ser.f(this.offsetBefore, dataOutput);
        Ser.f(this.offsetAfter, dataOutput);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Transition[");
        V0.append(m() ? "Gap" : "Overlap");
        V0.append(" at ");
        V0.append(this.transition);
        V0.append(this.offsetBefore);
        V0.append(" to ");
        V0.append(this.offsetAfter);
        V0.append(']');
        return V0.toString();
    }

    ZoneOffsetTransition(long j, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.transition = LocalDateTime.f0(j, 0, zoneOffset);
        this.offsetBefore = zoneOffset;
        this.offsetAfter = zoneOffset2;
    }
}
