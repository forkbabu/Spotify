package org.threeten.bp.zone;

import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.music.features.ads.sponsorship.model.Sponsorships;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Serializable;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.LocalTime;
import org.threeten.bp.Month;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.temporal.d;

public final class ZoneOffsetTransitionRule implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    private final byte dom;
    private final DayOfWeek dow;
    private final Month month;
    private final ZoneOffset offsetAfter;
    private final ZoneOffset offsetBefore;
    private final ZoneOffset standardOffset;
    private final LocalTime time;
    private final TimeDefinition timeDefinition;
    private final boolean timeEndOfDay;

    public enum TimeDefinition {
        UTC,
        WALL,
        STANDARD
    }

    ZoneOffsetTransitionRule(Month month2, int i, DayOfWeek dayOfWeek, LocalTime localTime, boolean z, TimeDefinition timeDefinition2, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.month = month2;
        this.dom = (byte) i;
        this.dow = dayOfWeek;
        this.time = localTime;
        this.timeEndOfDay = z;
        this.timeDefinition = timeDefinition2;
        this.standardOffset = zoneOffset;
        this.offsetBefore = zoneOffset2;
        this.offsetAfter = zoneOffset3;
    }

    static ZoneOffsetTransitionRule b(DataInput dataInput) {
        DayOfWeek dayOfWeek;
        int readInt = dataInput.readInt();
        Month x = Month.x(readInt >>> 28);
        int i = ((264241152 & readInt) >>> 22) - 32;
        int i2 = (3670016 & readInt) >>> 19;
        if (i2 == 0) {
            dayOfWeek = null;
        } else {
            dayOfWeek = DayOfWeek.i(i2);
        }
        int i3 = (507904 & readInt) >>> 14;
        TimeDefinition timeDefinition2 = TimeDefinition.values()[(readInt & 12288) >>> 12];
        int i4 = (readInt & 4080) >>> 4;
        int i5 = (readInt & 12) >>> 2;
        int i6 = readInt & 3;
        LocalTime L = i3 == 31 ? LocalTime.L((long) dataInput.readInt()) : LocalTime.F(i3 % 24, 0);
        ZoneOffset G = ZoneOffset.G(i4 == 255 ? dataInput.readInt() : (i4 - 128) * 900);
        ZoneOffset G2 = i5 == 3 ? ZoneOffset.G(dataInput.readInt()) : ZoneOffset.G((i5 * Sponsorships.DEFAULT_TTL_SECONDS) + G.C());
        ZoneOffset G3 = i6 == 3 ? ZoneOffset.G(dataInput.readInt()) : ZoneOffset.G((i6 * Sponsorships.DEFAULT_TTL_SECONDS) + G.C());
        boolean z = i3 == 24;
        yif.J(x, "month");
        yif.J(L, "time");
        yif.J(timeDefinition2, "timeDefnition");
        yif.J(G, "standardOffset");
        yif.J(G2, "offsetBefore");
        yif.J(G3, "offsetAfter");
        if (i < -28 || i > 31 || i == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        } else if (!z || L.equals(LocalTime.c)) {
            return new ZoneOffsetTransitionRule(x, i, dayOfWeek, L, z, timeDefinition2, G, G2, G3);
        } else {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
    }

    private Object writeReplace() {
        return new Ser((byte) 3, this);
    }

    public ZoneOffsetTransition a(int i) {
        LocalDate localDate;
        byte b = this.dom;
        if (b < 0) {
            Month month2 = this.month;
            localDate = LocalDate.m0(i, month2, month2.l(IsoChronology.c.z((long) i)) + 1 + this.dom);
            DayOfWeek dayOfWeek = this.dow;
            if (dayOfWeek != null) {
                localDate = localDate.s(d.b(dayOfWeek));
            }
        } else {
            localDate = LocalDate.m0(i, this.month, b);
            DayOfWeek dayOfWeek2 = this.dow;
            if (dayOfWeek2 != null) {
                localDate = localDate.s(d.a(dayOfWeek2));
            }
        }
        if (this.timeEndOfDay) {
            localDate = localDate.s0(1);
        }
        LocalDateTime c0 = LocalDateTime.c0(localDate, this.time);
        TimeDefinition timeDefinition2 = this.timeDefinition;
        ZoneOffset zoneOffset = this.standardOffset;
        ZoneOffset zoneOffset2 = this.offsetBefore;
        int ordinal = timeDefinition2.ordinal();
        if (ordinal == 0) {
            c0 = c0.m0((long) (zoneOffset2.C() - ZoneOffset.n.C()));
        } else if (ordinal == 2) {
            c0 = c0.m0((long) (zoneOffset2.C() - zoneOffset.C()));
        }
        return new ZoneOffsetTransition(c0, this.offsetBefore, this.offsetAfter);
    }

    /* access modifiers changed from: package-private */
    public void c(DataOutput dataOutput) {
        int i;
        int i2;
        int W = this.timeEndOfDay ? 86400 : this.time.W();
        int C = this.standardOffset.C();
        int C2 = this.offsetBefore.C() - C;
        int C3 = this.offsetAfter.C() - C;
        int B = W % 3600 == 0 ? this.timeEndOfDay ? 24 : this.time.B() : 31;
        int i3 = C % 900 == 0 ? (C / 900) + 128 : BitmapRenderer.ALPHA_VISIBLE;
        if (C2 == 0 || C2 == 1800 || C2 == 3600) {
            i = C2 / Sponsorships.DEFAULT_TTL_SECONDS;
        } else {
            i = 3;
        }
        if (C3 == 0 || C3 == 1800 || C3 == 3600) {
            i2 = C3 / Sponsorships.DEFAULT_TTL_SECONDS;
        } else {
            i2 = 3;
        }
        DayOfWeek dayOfWeek = this.dow;
        dataOutput.writeInt((this.month.i() << 28) + ((this.dom + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.h()) << 19) + (B << 14) + (this.timeDefinition.ordinal() << 12) + (i3 << 4) + (i << 2) + i2);
        if (B == 31) {
            dataOutput.writeInt(W);
        }
        if (i3 == 255) {
            dataOutput.writeInt(C);
        }
        if (i == 3) {
            dataOutput.writeInt(this.offsetBefore.C());
        }
        if (i2 == 3) {
            dataOutput.writeInt(this.offsetAfter.C());
        }
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ZoneOffsetTransitionRule)) {
            return false;
        }
        ZoneOffsetTransitionRule zoneOffsetTransitionRule = (ZoneOffsetTransitionRule) obj;
        if (this.month == zoneOffsetTransitionRule.month && this.dom == zoneOffsetTransitionRule.dom && this.dow == zoneOffsetTransitionRule.dow && this.timeDefinition == zoneOffsetTransitionRule.timeDefinition && this.time.equals(zoneOffsetTransitionRule.time) && this.timeEndOfDay == zoneOffsetTransitionRule.timeEndOfDay && this.standardOffset.equals(zoneOffsetTransitionRule.standardOffset) && this.offsetBefore.equals(zoneOffsetTransitionRule.offsetBefore) && this.offsetAfter.equals(zoneOffsetTransitionRule.offsetAfter)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int W = ((this.time.W() + (this.timeEndOfDay ? 1 : 0)) << 15) + (this.month.ordinal() << 11) + ((this.dom + 32) << 5);
        DayOfWeek dayOfWeek = this.dow;
        return ((this.standardOffset.hashCode() ^ (this.timeDefinition.ordinal() + (W + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)))) ^ this.offsetBefore.hashCode()) ^ this.offsetAfter.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("TransitionRule[");
        V0.append(this.offsetBefore.A(this.offsetAfter) > 0 ? "Gap " : "Overlap ");
        V0.append(this.offsetBefore);
        V0.append(" to ");
        V0.append(this.offsetAfter);
        V0.append(", ");
        DayOfWeek dayOfWeek = this.dow;
        if (dayOfWeek != null) {
            byte b = this.dom;
            if (b == -1) {
                V0.append(dayOfWeek.name());
                V0.append(" on or before last day of ");
                V0.append(this.month.name());
            } else if (b < 0) {
                V0.append(dayOfWeek.name());
                V0.append(" on or before last day minus ");
                V0.append((-this.dom) - 1);
                V0.append(" of ");
                V0.append(this.month.name());
            } else {
                V0.append(dayOfWeek.name());
                V0.append(" on or after ");
                V0.append(this.month.name());
                V0.append(' ');
                V0.append((int) this.dom);
            }
        } else {
            V0.append(this.month.name());
            V0.append(' ');
            V0.append((int) this.dom);
        }
        V0.append(" at ");
        V0.append(this.timeEndOfDay ? "24:00" : this.time.toString());
        V0.append(" ");
        V0.append(this.timeDefinition);
        V0.append(", standard offset ");
        V0.append(this.standardOffset);
        V0.append(']');
        return V0.toString();
    }
}
