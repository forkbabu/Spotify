package org.threeten.bp.temporal;

import java.util.Map;
import org.threeten.bp.format.ResolverStyle;

/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* JADX WARN: Init of enum c can be incorrect */
/* JADX WARN: Init of enum f can be incorrect */
/* JADX WARN: Init of enum n can be incorrect */
/* JADX WARN: Init of enum o can be incorrect */
/* JADX WARN: Init of enum p can be incorrect */
/* JADX WARN: Init of enum q can be incorrect */
/* JADX WARN: Init of enum r can be incorrect */
/* JADX WARN: Init of enum s can be incorrect */
/* JADX WARN: Init of enum t can be incorrect */
/* JADX WARN: Init of enum u can be incorrect */
/* JADX WARN: Init of enum v can be incorrect */
/* JADX WARN: Init of enum w can be incorrect */
/* JADX WARN: Init of enum x can be incorrect */
/* JADX WARN: Init of enum y can be incorrect */
/* JADX WARN: Init of enum z can be incorrect */
/* JADX WARN: Init of enum A can be incorrect */
/* JADX WARN: Init of enum B can be incorrect */
/* JADX WARN: Init of enum C can be incorrect */
/* JADX WARN: Init of enum D can be incorrect */
/* JADX WARN: Init of enum E can be incorrect */
/* JADX WARN: Init of enum F can be incorrect */
/* JADX WARN: Init of enum G can be incorrect */
/* JADX WARN: Init of enum H can be incorrect */
/* JADX WARN: Init of enum I can be incorrect */
/* JADX WARN: Init of enum J can be incorrect */
/* JADX WARN: Init of enum K can be incorrect */
/* JADX WARN: Init of enum L can be incorrect */
/* JADX WARN: Init of enum M can be incorrect */
public enum ChronoField implements f {
    NANO_OF_SECOND("NanoOfSecond", r8, r9, ValueRange.g(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", r8, r15, ValueRange.g(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", r16, r9, ValueRange.g(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", r16, r15, ValueRange.g(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", r18, r9, ValueRange.g(0, 999)),
    MILLI_OF_DAY("MilliOfDay", r18, r15, ValueRange.g(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", r9, r20, ValueRange.g(0, 59)),
    SECOND_OF_DAY("SecondOfDay", r9, r15, ValueRange.g(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", r20, r25, ValueRange.g(0, 59)),
    MINUTE_OF_DAY("MinuteOfDay", r20, r15, ValueRange.g(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", r25, r20, ValueRange.g(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", r25, r20, ValueRange.g(1, 12)),
    HOUR_OF_DAY("HourOfDay", r25, r15, ValueRange.g(0, 23)),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", r25, r15, ValueRange.g(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", r20, r15, ValueRange.g(0, 1)),
    DAY_OF_WEEK("DayOfWeek", r15, r31, ValueRange.g(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", r15, r31, ValueRange.g(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", r15, r31, ValueRange.g(1, 7)),
    DAY_OF_MONTH("DayOfMonth", r15, r11, ValueRange.h(1, 28, 31)),
    DAY_OF_YEAR("DayOfYear", r15, r36, ValueRange.h(1, 365, 366)),
    EPOCH_DAY("EpochDay", r15, r38, ValueRange.g(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", r31, r11, ValueRange.h(1, 4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", r31, r36, ValueRange.g(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", r11, r36, ValueRange.g(1, 12)),
    PROLEPTIC_MONTH("ProlepticMonth", r11, r38, ValueRange.g(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", r36, r38, ValueRange.h(1, 999999999, 1000000000)),
    YEAR("Year", r36, r38, ValueRange.g(-999999999, 999999999)),
    ERA("Era", ChronoUnit.ERAS, r38, ValueRange.g(0, 1)),
    INSTANT_SECONDS("InstantSeconds", r9, r38, ValueRange.g(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", r9, r38, ValueRange.g(-64800, 64800));
    
    private final i baseUnit;
    private final String name;
    private final ValueRange range;
    private final i rangeUnit;

    static {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
        ChronoUnit chronoUnit2 = ChronoUnit.SECONDS;
        ChronoUnit chronoUnit3 = ChronoUnit.DAYS;
        ChronoUnit chronoUnit4 = ChronoUnit.MICROS;
        ChronoUnit chronoUnit5 = ChronoUnit.MILLIS;
        ChronoUnit chronoUnit6 = ChronoUnit.MINUTES;
        ChronoUnit chronoUnit7 = ChronoUnit.HOURS;
        ChronoUnit chronoUnit8 = ChronoUnit.HALF_DAYS;
        ChronoUnit chronoUnit9 = ChronoUnit.WEEKS;
        ChronoUnit chronoUnit10 = ChronoUnit.MONTHS;
        ChronoUnit chronoUnit11 = ChronoUnit.YEARS;
        ChronoUnit chronoUnit12 = ChronoUnit.FOREVER;
    }

    private ChronoField(String str, i iVar, i iVar2, ValueRange valueRange) {
        this.name = str;
        this.baseUnit = iVar;
        this.rangeUnit = iVar2;
        this.range = valueRange;
    }

    @Override // org.threeten.bp.temporal.f
    public boolean d() {
        return ordinal() >= 15 && ordinal() <= 27;
    }

    @Override // org.threeten.bp.temporal.f
    public <R extends a> R g(R r, long j) {
        return (R) r.d(this, j);
    }

    @Override // org.threeten.bp.temporal.f
    public boolean h(b bVar) {
        return bVar.n(this);
    }

    @Override // org.threeten.bp.temporal.f
    public ValueRange i(b bVar) {
        return bVar.k(this);
    }

    @Override // org.threeten.bp.temporal.f
    public ValueRange k() {
        return this.range;
    }

    @Override // org.threeten.bp.temporal.f
    public long l(b bVar) {
        return bVar.u(this);
    }

    @Override // org.threeten.bp.temporal.f
    public boolean m() {
        return ordinal() < 15;
    }

    @Override // org.threeten.bp.temporal.f
    public b n(Map<f, Long> map, b bVar, ResolverStyle resolverStyle) {
        return null;
    }

    public int p(long j) {
        return this.range.a(j, this);
    }

    public long q(long j) {
        this.range.b(j, this);
        return j;
    }

    @Override // java.lang.Enum, java.lang.Object
    public String toString() {
        return this.name;
    }
}
