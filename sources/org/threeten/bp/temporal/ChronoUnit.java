package org.threeten.bp.temporal;

import org.threeten.bp.Duration;

public enum ChronoUnit implements i {
    NANOS("Nanos", Duration.h(1)),
    MICROS("Micros", Duration.h(1000)),
    MILLIS("Millis", Duration.h(1000000)),
    SECONDS("Seconds", Duration.i(1)),
    MINUTES("Minutes", Duration.i(60)),
    HOURS("Hours", Duration.i(3600)),
    HALF_DAYS("HalfDays", Duration.i(43200)),
    DAYS("Days", Duration.i(86400)),
    WEEKS("Weeks", Duration.i(604800)),
    MONTHS("Months", Duration.i(2629746)),
    YEARS("Years", Duration.i(31556952)),
    DECADES("Decades", Duration.i(315569520)),
    CENTURIES("Centuries", Duration.i(3155695200L)),
    MILLENNIA("Millennia", Duration.i(31556952000L)),
    ERAS("Eras", Duration.i(31556952000000000L)),
    FOREVER("Forever", Duration.k(Long.MAX_VALUE, 999999999));
    
    private final Duration duration;
    private final String name;

    private ChronoUnit(String str, Duration duration2) {
        this.name = str;
        this.duration = duration2;
    }

    @Override // org.threeten.bp.temporal.i
    public boolean d() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    @Override // org.threeten.bp.temporal.i
    public long g(a aVar, a aVar2) {
        return aVar.q(aVar2, this);
    }

    @Override // org.threeten.bp.temporal.i
    public <R extends a> R h(R r, long j) {
        return (R) r.v(j, this);
    }

    public Duration i() {
        return this.duration;
    }

    @Override // java.lang.Enum, java.lang.Object
    public String toString() {
        return this.name;
    }
}
