package org.threeten.bp.temporal;

import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.Year;
import org.threeten.bp.chrono.e;
import org.threeten.bp.format.ResolverStyle;

public final class WeekFields implements Serializable {
    private static final ConcurrentMap<String, WeekFields> n = new ConcurrentHashMap(4, 0.75f, 2);
    private static final long serialVersionUID = -1177360819670808121L;
    private final transient f a = a.e(this);
    private final transient f b = a.j(this);
    private final transient f c;
    private final transient f f;
    private final DayOfWeek firstDayOfWeek;
    private final int minimalDays;

    static class a implements f {
        private static final ValueRange o = ValueRange.g(1, 7);
        private static final ValueRange p = ValueRange.i(0, 1, 4, 6);
        private static final ValueRange q = ValueRange.i(0, 1, 52, 54);
        private static final ValueRange r = ValueRange.h(1, 52, 53);
        private static final ValueRange s = ChronoField.YEAR.k();
        private final String a;
        private final WeekFields b;
        private final i c;
        private final i f;
        private final ValueRange n;

        private a(String str, WeekFields weekFields, i iVar, i iVar2, ValueRange valueRange) {
            this.a = str;
            this.b = weekFields;
            this.c = iVar;
            this.f = iVar2;
            this.n = valueRange;
        }

        private int a(int i, int i2) {
            return ((i2 - 1) + (i + 7)) / 7;
        }

        private int b(b bVar, int i) {
            return yif.p(bVar.r(ChronoField.DAY_OF_WEEK) - i, 7) + 1;
        }

        private long c(b bVar, int i) {
            int r2 = bVar.r(ChronoField.DAY_OF_YEAR);
            return (long) a(r(r2, i), r2);
        }

        static a e(WeekFields weekFields) {
            return new a("DayOfWeek", weekFields, ChronoUnit.DAYS, ChronoUnit.WEEKS, o);
        }

        static a f(WeekFields weekFields) {
            return new a("WeekBasedYear", weekFields, IsoFields.d, ChronoUnit.FOREVER, s);
        }

        static a j(WeekFields weekFields) {
            return new a("WeekOfMonth", weekFields, ChronoUnit.WEEKS, ChronoUnit.MONTHS, p);
        }

        static a o(WeekFields weekFields) {
            return new a("WeekOfWeekBasedYear", weekFields, ChronoUnit.WEEKS, IsoFields.d, r);
        }

        static a p(WeekFields weekFields) {
            return new a("WeekOfYear", weekFields, ChronoUnit.WEEKS, ChronoUnit.YEARS, q);
        }

        private ValueRange q(b bVar) {
            int p2 = yif.p(bVar.r(ChronoField.DAY_OF_WEEK) - this.b.c().h(), 7) + 1;
            long c2 = c(bVar, p2);
            if (c2 == 0) {
                return q(e.n(bVar).h(bVar).p(2, ChronoUnit.WEEKS));
            }
            int a2 = a(r(bVar.r(ChronoField.DAY_OF_YEAR), p2), this.b.d() + (Year.x((long) bVar.r(ChronoField.YEAR)) ? 366 : 365));
            if (c2 >= ((long) a2)) {
                return q(e.n(bVar).h(bVar).v(2, ChronoUnit.WEEKS));
            }
            return ValueRange.g(1, (long) (a2 - 1));
        }

        private int r(int i, int i2) {
            int p2 = yif.p(i - i2, 7);
            return p2 + 1 > this.b.d() ? 7 - p2 : -p2;
        }

        @Override // org.threeten.bp.temporal.f
        public boolean d() {
            return true;
        }

        @Override // org.threeten.bp.temporal.f
        public <R extends a> R g(R r2, long j) {
            int a2 = this.n.a(j, this);
            int r3 = r2.r(this);
            if (a2 == r3) {
                return r2;
            }
            if (this.f != ChronoUnit.FOREVER) {
                return (R) r2.v((long) (a2 - r3), this.c);
            }
            int r4 = r2.r(this.b.c);
            double d = (double) (j - ((long) r3));
            Double.isNaN(d);
            Double.isNaN(d);
            ChronoUnit chronoUnit = ChronoUnit.WEEKS;
            a v = r2.v((long) (d * 52.1775d), chronoUnit);
            if (v.r(this) > a2) {
                return (R) v.p((long) v.r(this.b.c), chronoUnit);
            }
            if (v.r(this) < a2) {
                v = v.v(2, chronoUnit);
            }
            R r5 = (R) v.v((long) (r4 - v.r(this.b.c)), chronoUnit);
            return r5.r(this) > a2 ? (R) r5.p(1, chronoUnit) : r5;
        }

        @Override // org.threeten.bp.temporal.f
        public boolean h(b bVar) {
            if (!bVar.n(ChronoField.DAY_OF_WEEK)) {
                return false;
            }
            i iVar = this.f;
            if (iVar == ChronoUnit.WEEKS) {
                return true;
            }
            if (iVar == ChronoUnit.MONTHS) {
                return bVar.n(ChronoField.DAY_OF_MONTH);
            }
            if (iVar == ChronoUnit.YEARS) {
                return bVar.n(ChronoField.DAY_OF_YEAR);
            }
            if (iVar == IsoFields.d) {
                return bVar.n(ChronoField.EPOCH_DAY);
            }
            if (iVar == ChronoUnit.FOREVER) {
                return bVar.n(ChronoField.EPOCH_DAY);
            }
            return false;
        }

        @Override // org.threeten.bp.temporal.f
        public ValueRange i(b bVar) {
            ChronoField chronoField;
            i iVar = this.f;
            if (iVar == ChronoUnit.WEEKS) {
                return this.n;
            }
            if (iVar == ChronoUnit.MONTHS) {
                chronoField = ChronoField.DAY_OF_MONTH;
            } else if (iVar == ChronoUnit.YEARS) {
                chronoField = ChronoField.DAY_OF_YEAR;
            } else if (iVar == IsoFields.d) {
                return q(bVar);
            } else {
                if (iVar == ChronoUnit.FOREVER) {
                    return bVar.k(ChronoField.YEAR);
                }
                throw new IllegalStateException("unreachable");
            }
            int h = this.b.c().h();
            int r2 = r(bVar.r(chronoField), yif.p(bVar.r(ChronoField.DAY_OF_WEEK) - h, 7) + 1);
            ValueRange k = bVar.k(chronoField);
            return ValueRange.g((long) a(r2, (int) k.d()), (long) a(r2, (int) k.c()));
        }

        @Override // org.threeten.bp.temporal.f
        public ValueRange k() {
            return this.n;
        }

        @Override // org.threeten.bp.temporal.f
        public long l(b bVar) {
            int i;
            int i2;
            int h = this.b.c().h();
            ChronoField chronoField = ChronoField.DAY_OF_WEEK;
            int p2 = yif.p(bVar.r(chronoField) - h, 7) + 1;
            i iVar = this.f;
            ChronoUnit chronoUnit = ChronoUnit.WEEKS;
            if (iVar == chronoUnit) {
                return (long) p2;
            }
            if (iVar == ChronoUnit.MONTHS) {
                int r2 = bVar.r(ChronoField.DAY_OF_MONTH);
                i = a(r(r2, p2), r2);
            } else if (iVar == ChronoUnit.YEARS) {
                int r3 = bVar.r(ChronoField.DAY_OF_YEAR);
                i = a(r(r3, p2), r3);
            } else {
                int i3 = 366;
                if (iVar == IsoFields.d) {
                    int p3 = yif.p(bVar.r(chronoField) - this.b.c().h(), 7) + 1;
                    long c2 = c(bVar, p3);
                    if (c2 == 0) {
                        i2 = ((int) c(e.n(bVar).h(bVar).p(1, chronoUnit), p3)) + 1;
                    } else {
                        if (c2 >= 53) {
                            int r4 = r(bVar.r(ChronoField.DAY_OF_YEAR), p3);
                            if (!Year.x((long) bVar.r(ChronoField.YEAR))) {
                                i3 = 365;
                            }
                            int a2 = a(r4, this.b.d() + i3);
                            if (c2 >= ((long) a2)) {
                                c2 -= (long) (a2 - 1);
                            }
                        }
                        i2 = (int) c2;
                    }
                    return (long) i2;
                } else if (iVar == ChronoUnit.FOREVER) {
                    int p4 = yif.p(bVar.r(chronoField) - this.b.c().h(), 7) + 1;
                    int r5 = bVar.r(ChronoField.YEAR);
                    long c3 = c(bVar, p4);
                    if (c3 == 0) {
                        r5--;
                    } else if (c3 >= 53) {
                        int r6 = r(bVar.r(ChronoField.DAY_OF_YEAR), p4);
                        if (!Year.x((long) r5)) {
                            i3 = 365;
                        }
                        if (c3 >= ((long) a(r6, this.b.d() + i3))) {
                            r5++;
                        }
                    }
                    return (long) r5;
                } else {
                    throw new IllegalStateException("unreachable");
                }
            }
            return (long) i;
        }

        @Override // org.threeten.bp.temporal.f
        public boolean m() {
            return false;
        }

        @Override // org.threeten.bp.temporal.f
        public b n(Map<f, Long> map, b bVar, ResolverStyle resolverStyle) {
            long j;
            int i;
            int i2;
            int i3;
            org.threeten.bp.chrono.a aVar;
            long j2;
            long j3;
            int i4;
            org.threeten.bp.chrono.a aVar2;
            ResolverStyle resolverStyle2 = ResolverStyle.STRICT;
            ResolverStyle resolverStyle3 = ResolverStyle.LENIENT;
            int h = this.b.c().h();
            if (this.f == ChronoUnit.WEEKS) {
                map.put(ChronoField.DAY_OF_WEEK, Long.valueOf((long) (yif.p((this.n.a(map.remove(this).longValue(), this) - 1) + (h - 1), 7) + 1)));
                return null;
            }
            ChronoField chronoField = ChronoField.DAY_OF_WEEK;
            if (!map.containsKey(chronoField)) {
                return null;
            }
            if (this.f != ChronoUnit.FOREVER) {
                ChronoField chronoField2 = ChronoField.YEAR;
                if (!map.containsKey(chronoField2)) {
                    return null;
                }
                int p2 = yif.p(chronoField.p(map.get(chronoField).longValue()) - h, 7) + 1;
                int p3 = chronoField2.p(map.get(chronoField2).longValue());
                e n2 = e.n(bVar);
                i iVar = this.f;
                ChronoUnit chronoUnit = ChronoUnit.MONTHS;
                if (iVar == chronoUnit) {
                    ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
                    if (!map.containsKey(chronoField3)) {
                        return null;
                    }
                    long longValue = map.remove(this).longValue();
                    if (resolverStyle == resolverStyle3) {
                        aVar = n2.g(p3, 1, 1).v(map.get(chronoField3).longValue() - 1, chronoUnit);
                        i3 = b(aVar, h);
                        int r2 = aVar.r(ChronoField.DAY_OF_MONTH);
                        i2 = a(r(r2, i3), r2);
                    } else {
                        aVar = n2.g(p3, chronoField3.p(map.get(chronoField3).longValue()), 8);
                        i3 = b(aVar, h);
                        longValue = (long) this.n.a(longValue, this);
                        int r3 = aVar.r(ChronoField.DAY_OF_MONTH);
                        i2 = a(r(r3, i3), r3);
                    }
                    org.threeten.bp.chrono.a C = aVar.v(((longValue - ((long) i2)) * 7) + ((long) (p2 - i3)), ChronoUnit.DAYS);
                    if (resolverStyle != resolverStyle2 || C.u(chronoField3) == map.get(chronoField3).longValue()) {
                        map.remove(this);
                        map.remove(chronoField2);
                        map.remove(chronoField3);
                        map.remove(chronoField);
                        return C;
                    }
                    throw new DateTimeException("Strict mode rejected date parsed to a different month");
                } else if (iVar == ChronoUnit.YEARS) {
                    long longValue2 = map.remove(this).longValue();
                    org.threeten.bp.chrono.a g = n2.g(p3, 1, 1);
                    if (resolverStyle == resolverStyle3) {
                        i = b(g, h);
                        j = c(g, i);
                    } else {
                        i = b(g, h);
                        longValue2 = (long) this.n.a(longValue2, this);
                        j = c(g, i);
                    }
                    org.threeten.bp.chrono.a C2 = g.v(((longValue2 - j) * 7) + ((long) (p2 - i)), ChronoUnit.DAYS);
                    if (resolverStyle != resolverStyle2 || C2.u(chronoField2) == map.get(chronoField2).longValue()) {
                        map.remove(this);
                        map.remove(chronoField2);
                        map.remove(chronoField);
                        return C2;
                    }
                    throw new DateTimeException("Strict mode rejected date parsed to a different year");
                } else {
                    throw new IllegalStateException("unreachable");
                }
            } else if (!map.containsKey(this.b.c)) {
                return null;
            } else {
                e n3 = e.n(bVar);
                int p4 = yif.p(chronoField.p(map.get(chronoField).longValue()) - h, 7) + 1;
                int a2 = this.n.a(map.get(this).longValue(), this);
                if (resolverStyle == resolverStyle3) {
                    aVar2 = n3.g(a2, 1, this.b.d());
                    j3 = map.get(this.b.c).longValue();
                    i4 = b(aVar2, h);
                    j2 = c(aVar2, i4);
                } else {
                    aVar2 = n3.g(a2, 1, this.b.d());
                    j3 = (long) this.b.c.k().a(map.get(this.b.c).longValue(), this.b.c);
                    i4 = b(aVar2, h);
                    j2 = c(aVar2, i4);
                }
                org.threeten.bp.chrono.a C3 = aVar2.v(((j3 - j2) * 7) + ((long) (p4 - i4)), ChronoUnit.DAYS);
                if (resolverStyle != resolverStyle2 || C3.u(this) == map.get(this).longValue()) {
                    map.remove(this);
                    map.remove(this.b.c);
                    map.remove(chronoField);
                    return C3;
                }
                throw new DateTimeException("Strict mode rejected date parsed to a different year");
            }
        }

        public String toString() {
            return this.a + "[" + this.b.toString() + "]";
        }
    }

    static {
        new WeekFields(DayOfWeek.MONDAY, 4);
        f(DayOfWeek.SUNDAY, 1);
    }

    private WeekFields(DayOfWeek dayOfWeek, int i) {
        a.p(this);
        this.c = a.o(this);
        this.f = a.f(this);
        yif.J(dayOfWeek, "firstDayOfWeek");
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.firstDayOfWeek = dayOfWeek;
        this.minimalDays = i;
    }

    public static WeekFields e(Locale locale) {
        yif.J(locale, "locale");
        GregorianCalendar gregorianCalendar = new GregorianCalendar(new Locale(locale.getLanguage(), locale.getCountry()));
        return f(DayOfWeek.SUNDAY.l((long) (gregorianCalendar.getFirstDayOfWeek() - 1)), gregorianCalendar.getMinimalDaysInFirstWeek());
    }

    public static WeekFields f(DayOfWeek dayOfWeek, int i) {
        String str = dayOfWeek.toString() + i;
        ConcurrentMap<String, WeekFields> concurrentMap = n;
        WeekFields weekFields = concurrentMap.get(str);
        if (weekFields != null) {
            return weekFields;
        }
        concurrentMap.putIfAbsent(str, new WeekFields(dayOfWeek, i));
        return concurrentMap.get(str);
    }

    private Object readResolve() {
        try {
            return f(this.firstDayOfWeek, this.minimalDays);
        } catch (IllegalArgumentException e) {
            StringBuilder V0 = je.V0("Invalid WeekFields");
            V0.append(e.getMessage());
            throw new InvalidObjectException(V0.toString());
        }
    }

    public f b() {
        return this.a;
    }

    public DayOfWeek c() {
        return this.firstDayOfWeek;
    }

    public int d() {
        return this.minimalDays;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WeekFields) || hashCode() != obj.hashCode()) {
            return false;
        }
        return true;
    }

    public f g() {
        return this.f;
    }

    public f h() {
        return this.b;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return (this.firstDayOfWeek.ordinal() * 7) + this.minimalDays;
    }

    public f i() {
        return this.c;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("WeekFields[");
        V0.append(this.firstDayOfWeek);
        V0.append(',');
        return je.A0(V0, this.minimalDays, ']');
    }
}
