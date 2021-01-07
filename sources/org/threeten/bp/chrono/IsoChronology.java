package org.threeten.bp.chrono;

import java.io.Serializable;
import java.util.Map;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.Month;
import org.threeten.bp.Year;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZonedDateTime;
import org.threeten.bp.format.ResolverStyle;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.d;
import org.threeten.bp.temporal.f;

public final class IsoChronology extends e implements Serializable {
    public static final IsoChronology c = new IsoChronology();
    private static final long serialVersionUID = -1440403870442975015L;

    private IsoChronology() {
    }

    private Object readResolve() {
        return c;
    }

    public LocalDate A(Map<f, Long> map, ResolverStyle resolverStyle) {
        ResolverStyle resolverStyle2 = ResolverStyle.STRICT;
        ResolverStyle resolverStyle3 = ResolverStyle.LENIENT;
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        if (map.containsKey(chronoField)) {
            return LocalDate.o0(map.remove(chronoField).longValue());
        }
        ChronoField chronoField2 = ChronoField.PROLEPTIC_MONTH;
        Long remove = map.remove(chronoField2);
        if (remove != null) {
            if (resolverStyle != resolverStyle3) {
                chronoField2.q(remove.longValue());
            }
            v(map, ChronoField.MONTH_OF_YEAR, (long) (yif.q(remove.longValue(), 12) + 1));
            v(map, ChronoField.YEAR, yif.o(remove.longValue(), 12));
        }
        ChronoField chronoField3 = ChronoField.YEAR_OF_ERA;
        Long remove2 = map.remove(chronoField3);
        if (remove2 != null) {
            if (resolverStyle != resolverStyle3) {
                chronoField3.q(remove2.longValue());
            }
            Long remove3 = map.remove(ChronoField.ERA);
            if (remove3 == null) {
                ChronoField chronoField4 = ChronoField.YEAR;
                Long l = map.get(chronoField4);
                if (resolverStyle != resolverStyle2) {
                    v(map, chronoField4, (l == null || l.longValue() > 0) ? remove2.longValue() : yif.S(1, remove2.longValue()));
                } else if (l != null) {
                    v(map, chronoField4, l.longValue() > 0 ? remove2.longValue() : yif.S(1, remove2.longValue()));
                } else {
                    map.put(chronoField3, remove2);
                }
            } else if (remove3.longValue() == 1) {
                v(map, ChronoField.YEAR, remove2.longValue());
            } else if (remove3.longValue() == 0) {
                v(map, ChronoField.YEAR, yif.S(1, remove2.longValue()));
            } else {
                throw new DateTimeException("Invalid value for era: " + remove3);
            }
        } else {
            ChronoField chronoField5 = ChronoField.ERA;
            if (map.containsKey(chronoField5)) {
                chronoField5.q(map.get(chronoField5).longValue());
            }
        }
        ChronoField chronoField6 = ChronoField.YEAR;
        if (!map.containsKey(chronoField6)) {
            return null;
        }
        ChronoField chronoField7 = ChronoField.MONTH_OF_YEAR;
        if (map.containsKey(chronoField7)) {
            ChronoField chronoField8 = ChronoField.DAY_OF_MONTH;
            if (map.containsKey(chronoField8)) {
                int p = chronoField6.p(map.remove(chronoField6).longValue());
                int T = yif.T(map.remove(chronoField7).longValue());
                int T2 = yif.T(map.remove(chronoField8).longValue());
                if (resolverStyle == resolverStyle3) {
                    return LocalDate.k0(p, 1, 1).t0((long) yif.R(T, 1)).s0((long) yif.R(T2, 1));
                } else if (resolverStyle != ResolverStyle.SMART) {
                    return LocalDate.k0(p, T, T2);
                } else {
                    chronoField8.q((long) T2);
                    if (T == 4 || T == 6 || T == 9 || T == 11) {
                        T2 = Math.min(T2, 30);
                    } else if (T == 2) {
                        T2 = Math.min(T2, Month.FEBRUARY.l(Year.x((long) p)));
                    }
                    return LocalDate.k0(p, T, T2);
                }
            } else {
                ChronoField chronoField9 = ChronoField.ALIGNED_WEEK_OF_MONTH;
                if (map.containsKey(chronoField9)) {
                    ChronoField chronoField10 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                    if (map.containsKey(chronoField10)) {
                        int p2 = chronoField6.p(map.remove(chronoField6).longValue());
                        if (resolverStyle == resolverStyle3) {
                            return LocalDate.k0(p2, 1, 1).t0(yif.S(map.remove(chronoField7).longValue(), 1)).u0(yif.S(map.remove(chronoField9).longValue(), 1)).s0(yif.S(map.remove(chronoField10).longValue(), 1));
                        }
                        int p3 = chronoField7.p(map.remove(chronoField7).longValue());
                        LocalDate s0 = LocalDate.k0(p2, p3, 1).s0((long) ((chronoField10.p(map.remove(chronoField10).longValue()) - 1) + ((chronoField9.p(map.remove(chronoField9).longValue()) - 1) * 7)));
                        if (resolverStyle != resolverStyle2 || s0.r(chronoField7) == p3) {
                            return s0;
                        }
                        throw new DateTimeException("Strict mode rejected date parsed to a different month");
                    }
                    ChronoField chronoField11 = ChronoField.DAY_OF_WEEK;
                    if (map.containsKey(chronoField11)) {
                        int p4 = chronoField6.p(map.remove(chronoField6).longValue());
                        if (resolverStyle == resolverStyle3) {
                            return LocalDate.k0(p4, 1, 1).t0(yif.S(map.remove(chronoField7).longValue(), 1)).u0(yif.S(map.remove(chronoField9).longValue(), 1)).s0(yif.S(map.remove(chronoField11).longValue(), 1));
                        }
                        int p5 = chronoField7.p(map.remove(chronoField7).longValue());
                        LocalDate z0 = LocalDate.k0(p4, p5, 1).u0((long) (chronoField9.p(map.remove(chronoField9).longValue()) - 1)).s(d.a(DayOfWeek.i(chronoField11.p(map.remove(chronoField11).longValue()))));
                        if (resolverStyle != resolverStyle2 || z0.r(chronoField7) == p5) {
                            return z0;
                        }
                        throw new DateTimeException("Strict mode rejected date parsed to a different month");
                    }
                }
            }
        }
        ChronoField chronoField12 = ChronoField.DAY_OF_YEAR;
        if (map.containsKey(chronoField12)) {
            int p6 = chronoField6.p(map.remove(chronoField6).longValue());
            if (resolverStyle != resolverStyle3) {
                return LocalDate.q0(p6, chronoField12.p(map.remove(chronoField12).longValue()));
            }
            return LocalDate.q0(p6, 1).s0(yif.S(map.remove(chronoField12).longValue(), 1));
        }
        ChronoField chronoField13 = ChronoField.ALIGNED_WEEK_OF_YEAR;
        if (!map.containsKey(chronoField13)) {
            return null;
        }
        ChronoField chronoField14 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map.containsKey(chronoField14)) {
            int p7 = chronoField6.p(map.remove(chronoField6).longValue());
            if (resolverStyle == resolverStyle3) {
                return LocalDate.k0(p7, 1, 1).u0(yif.S(map.remove(chronoField13).longValue(), 1)).s0(yif.S(map.remove(chronoField14).longValue(), 1));
            }
            LocalDate s02 = LocalDate.k0(p7, 1, 1).s0((long) ((chronoField14.p(map.remove(chronoField14).longValue()) - 1) + ((chronoField13.p(map.remove(chronoField13).longValue()) - 1) * 7)));
            if (resolverStyle != resolverStyle2 || s02.r(chronoField6) == p7) {
                return s02;
            }
            throw new DateTimeException("Strict mode rejected date parsed to a different year");
        }
        ChronoField chronoField15 = ChronoField.DAY_OF_WEEK;
        if (!map.containsKey(chronoField15)) {
            return null;
        }
        int p8 = chronoField6.p(map.remove(chronoField6).longValue());
        if (resolverStyle == resolverStyle3) {
            return LocalDate.k0(p8, 1, 1).u0(yif.S(map.remove(chronoField13).longValue(), 1)).s0(yif.S(map.remove(chronoField15).longValue(), 1));
        }
        LocalDate z02 = LocalDate.k0(p8, 1, 1).u0((long) (chronoField13.p(map.remove(chronoField13).longValue()) - 1)).s(d.a(DayOfWeek.i(chronoField15.p(map.remove(chronoField15).longValue()))));
        if (resolverStyle != resolverStyle2 || z02.r(chronoField6) == p8) {
            return z02;
        }
        throw new DateTimeException("Strict mode rejected date parsed to a different month");
    }

    @Override // org.threeten.bp.chrono.e
    public a g(int i, int i2, int i3) {
        return LocalDate.k0(i, i2, i3);
    }

    @Override // org.threeten.bp.chrono.e
    public a h(b bVar) {
        return LocalDate.N(bVar);
    }

    @Override // org.threeten.bp.chrono.e
    public f m(int i) {
        if (i == 0) {
            return IsoEra.BCE;
        }
        if (i == 1) {
            return IsoEra.CE;
        }
        throw new DateTimeException(je.p0("Invalid era: ", i));
    }

    @Override // org.threeten.bp.chrono.e
    public String p() {
        return "iso8601";
    }

    @Override // org.threeten.bp.chrono.e
    public String q() {
        return "ISO";
    }

    @Override // org.threeten.bp.chrono.e
    public b r(b bVar) {
        return LocalDateTime.M(bVar);
    }

    @Override // org.threeten.bp.chrono.e
    public d w(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.Q(instant, zoneId);
    }

    @Override // org.threeten.bp.chrono.e
    public d x(b bVar) {
        return ZonedDateTime.O(bVar);
    }

    public boolean z(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }
}
