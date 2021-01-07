package org.threeten.bp.temporal;

import java.util.Map;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.Duration;
import org.threeten.bp.LocalDate;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.chrono.e;
import org.threeten.bp.format.ResolverStyle;

public final class IsoFields {
    public static final f a = Field.QUARTER_OF_YEAR;
    public static final f b = Field.WEEK_OF_WEEK_BASED_YEAR;
    public static final f c = Field.WEEK_BASED_YEAR;
    public static final i d = Unit.WEEK_BASED_YEARS;

    /* access modifiers changed from: private */
    public enum Field implements f {
        DAY_OF_QUARTER {
            @Override // org.threeten.bp.temporal.f
            public <R extends a> R g(R r, long j) {
                long l = l(r);
                k().b(j, this);
                ChronoField chronoField = ChronoField.DAY_OF_YEAR;
                return (R) r.d(chronoField, (j - l) + r.u(chronoField));
            }

            @Override // org.threeten.bp.temporal.f
            public boolean h(b bVar) {
                return bVar.n(ChronoField.DAY_OF_YEAR) && bVar.n(ChronoField.MONTH_OF_YEAR) && bVar.n(ChronoField.YEAR) && Field.p(bVar);
            }

            @Override // org.threeten.bp.temporal.f
            public ValueRange i(b bVar) {
                if (bVar.n(this)) {
                    long u = bVar.u(Field.QUARTER_OF_YEAR);
                    if (u == 1) {
                        return IsoChronology.c.z(bVar.u(ChronoField.YEAR)) ? ValueRange.g(1, 91) : ValueRange.g(1, 90);
                    } else if (u == 2) {
                        return ValueRange.g(1, 91);
                    } else {
                        if (u == 3 || u == 4) {
                            return ValueRange.g(1, 92);
                        }
                        return k();
                    }
                } else {
                    throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
                }
            }

            @Override // org.threeten.bp.temporal.f
            public ValueRange k() {
                return ValueRange.h(1, 90, 92);
            }

            @Override // org.threeten.bp.temporal.f
            public long l(b bVar) {
                if (bVar.n(this)) {
                    return (long) (bVar.r(ChronoField.DAY_OF_YEAR) - Field.n[((bVar.r(ChronoField.MONTH_OF_YEAR) - 1) / 3) + (IsoChronology.c.z(bVar.u(ChronoField.YEAR)) ? 4 : 0)]);
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0076, code lost:
                if (r2 == 2) goto L_0x0078;
             */
            @Override // org.threeten.bp.temporal.IsoFields.Field, org.threeten.bp.temporal.f
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public org.threeten.bp.temporal.b n(java.util.Map<org.threeten.bp.temporal.f, java.lang.Long> r13, org.threeten.bp.temporal.b r14, org.threeten.bp.format.ResolverStyle r15) {
                /*
                    r12 = this;
                    org.threeten.bp.temporal.ChronoField r14 = org.threeten.bp.temporal.ChronoField.YEAR
                    java.lang.Object r0 = r13.get(r14)
                    java.lang.Long r0 = (java.lang.Long) r0
                    org.threeten.bp.temporal.IsoFields$Field r1 = org.threeten.bp.temporal.IsoFields.Field.QUARTER_OF_YEAR
                    java.lang.Object r2 = r13.get(r1)
                    java.lang.Long r2 = (java.lang.Long) r2
                    if (r0 == 0) goto L_0x00a1
                    if (r2 != 0) goto L_0x0016
                    goto L_0x00a1
                L_0x0016:
                    long r3 = r0.longValue()
                    int r0 = r14.p(r3)
                    org.threeten.bp.temporal.IsoFields$Field r3 = org.threeten.bp.temporal.IsoFields.Field.DAY_OF_QUARTER
                    java.lang.Object r3 = r13.get(r3)
                    java.lang.Long r3 = (java.lang.Long) r3
                    long r3 = r3.longValue()
                    org.threeten.bp.format.ResolverStyle r5 = org.threeten.bp.format.ResolverStyle.LENIENT
                    r6 = 3
                    r7 = 1
                    r9 = 1
                    if (r15 != r5) goto L_0x004f
                    long r10 = r2.longValue()
                    org.threeten.bp.LocalDate r15 = org.threeten.bp.LocalDate.k0(r0, r9, r9)
                    long r9 = defpackage.yif.S(r10, r7)
                    long r5 = defpackage.yif.P(r9, r6)
                    org.threeten.bp.LocalDate r15 = r15.t0(r5)
                    long r2 = defpackage.yif.S(r3, r7)
                    org.threeten.bp.LocalDate r15 = r15.s0(r2)
                    goto L_0x0097
                L_0x004f:
                    r5 = r1
                    org.threeten.bp.temporal.IsoFields$Field$2 r5 = (org.threeten.bp.temporal.IsoFields.Field.AnonymousClass2) r5
                    org.threeten.bp.temporal.ValueRange r5 = r5.k()
                    long r10 = r2.longValue()
                    int r2 = r5.a(r10, r1)
                    org.threeten.bp.format.ResolverStyle r5 = org.threeten.bp.format.ResolverStyle.STRICT
                    if (r15 != r5) goto L_0x0083
                    r15 = 92
                    r5 = 91
                    if (r2 != r9) goto L_0x0075
                    org.threeten.bp.chrono.IsoChronology r15 = org.threeten.bp.chrono.IsoChronology.c
                    long r10 = (long) r0
                    boolean r15 = r15.z(r10)
                    if (r15 == 0) goto L_0x0072
                    goto L_0x0078
                L_0x0072:
                    r15 = 90
                    goto L_0x007a
                L_0x0075:
                    r10 = 2
                    if (r2 != r10) goto L_0x007a
                L_0x0078:
                    r15 = 91
                L_0x007a:
                    long r10 = (long) r15
                    org.threeten.bp.temporal.ValueRange r15 = org.threeten.bp.temporal.ValueRange.g(r7, r10)
                    r15.b(r3, r12)
                    goto L_0x008a
                L_0x0083:
                    org.threeten.bp.temporal.ValueRange r15 = r12.k()
                    r15.b(r3, r12)
                L_0x008a:
                    int r2 = r2 - r9
                    int r2 = r2 * 3
                    int r2 = r2 + r9
                    org.threeten.bp.LocalDate r15 = org.threeten.bp.LocalDate.k0(r0, r2, r9)
                    long r3 = r3 - r7
                    org.threeten.bp.LocalDate r15 = r15.s0(r3)
                L_0x0097:
                    r13.remove(r12)
                    r13.remove(r14)
                    r13.remove(r1)
                    return r15
                L_0x00a1:
                    r13 = 0
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.temporal.IsoFields.Field.AnonymousClass1.n(java.util.Map, org.threeten.bp.temporal.b, org.threeten.bp.format.ResolverStyle):org.threeten.bp.temporal.b");
            }

            @Override // java.lang.Enum, java.lang.Object
            public String toString() {
                return "DayOfQuarter";
            }
        },
        QUARTER_OF_YEAR {
            @Override // org.threeten.bp.temporal.f
            public <R extends a> R g(R r, long j) {
                long l = l(r);
                k().b(j, this);
                ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
                return (R) r.d(chronoField, ((j - l) * 3) + r.u(chronoField));
            }

            @Override // org.threeten.bp.temporal.f
            public boolean h(b bVar) {
                return bVar.n(ChronoField.MONTH_OF_YEAR) && Field.p(bVar);
            }

            @Override // org.threeten.bp.temporal.f
            public ValueRange i(b bVar) {
                return k();
            }

            @Override // org.threeten.bp.temporal.f
            public ValueRange k() {
                return ValueRange.g(1, 4);
            }

            @Override // org.threeten.bp.temporal.f
            public long l(b bVar) {
                if (bVar.n(this)) {
                    return (bVar.u(ChronoField.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: QuarterOfYear");
            }

            @Override // java.lang.Enum, java.lang.Object
            public String toString() {
                return "QuarterOfYear";
            }
        },
        WEEK_OF_WEEK_BASED_YEAR {
            @Override // org.threeten.bp.temporal.f
            public <R extends a> R g(R r, long j) {
                k().b(j, this);
                return (R) r.v(yif.S(j, l(r)), ChronoUnit.WEEKS);
            }

            @Override // org.threeten.bp.temporal.f
            public boolean h(b bVar) {
                return bVar.n(ChronoField.EPOCH_DAY) && Field.p(bVar);
            }

            @Override // org.threeten.bp.temporal.f
            public ValueRange i(b bVar) {
                if (bVar.n(this)) {
                    return Field.r(LocalDate.N(bVar));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // org.threeten.bp.temporal.f
            public ValueRange k() {
                return ValueRange.h(1, 52, 53);
            }

            @Override // org.threeten.bp.temporal.f
            public long l(b bVar) {
                if (bVar.n(this)) {
                    return (long) Field.s(LocalDate.N(bVar));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // org.threeten.bp.temporal.IsoFields.Field, org.threeten.bp.temporal.f
            public b n(Map<f, Long> map, b bVar, ResolverStyle resolverStyle) {
                Field field;
                LocalDate localDate;
                Field field2 = Field.WEEK_BASED_YEAR;
                Long l = map.get(field2);
                ChronoField chronoField = ChronoField.DAY_OF_WEEK;
                Long l2 = map.get(chronoField);
                if (l == null || l2 == null) {
                    return null;
                }
                int a = ((AnonymousClass4) field2).k().a(l.longValue(), field2);
                long longValue = map.get(Field.WEEK_OF_WEEK_BASED_YEAR).longValue();
                if (resolverStyle == ResolverStyle.LENIENT) {
                    long longValue2 = l2.longValue();
                    long j = 0;
                    if (longValue2 > 7) {
                        long j2 = longValue2 - 1;
                        j = j2 / 7;
                        longValue2 = (j2 % 7) + 1;
                    } else if (longValue2 < 1) {
                        j = (longValue2 / 7) - 1;
                        longValue2 = (longValue2 % 7) + 7;
                    }
                    field = field2;
                    localDate = LocalDate.k0(a, 1, 4).u0(longValue - 1).u0(j).d(chronoField, longValue2);
                } else {
                    field = field2;
                    int p = chronoField.p(l2.longValue());
                    if (resolverStyle == ResolverStyle.STRICT) {
                        Field.r(LocalDate.k0(a, 1, 4)).b(longValue, this);
                    } else {
                        k().b(longValue, this);
                    }
                    localDate = LocalDate.k0(a, 1, 4).u0(longValue - 1).d(chronoField, (long) p);
                }
                map.remove(this);
                map.remove(field);
                map.remove(chronoField);
                return localDate;
            }

            @Override // java.lang.Enum, java.lang.Object
            public String toString() {
                return "WeekOfWeekBasedYear";
            }
        },
        WEEK_BASED_YEAR {
            @Override // org.threeten.bp.temporal.f
            public <R extends a> R g(R r, long j) {
                if (h(r)) {
                    int a = k().a(j, Field.WEEK_BASED_YEAR);
                    LocalDate N = LocalDate.N(r);
                    ChronoField chronoField = ChronoField.DAY_OF_WEEK;
                    int r2 = N.r(chronoField);
                    int s = Field.s(N);
                    if (s == 53 && Field.x(a) == 52) {
                        s = 52;
                    }
                    LocalDate k0 = LocalDate.k0(a, 1, 4);
                    return (R) r.s(k0.s0((long) (((s - 1) * 7) + (r2 - k0.r(chronoField)))));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
            }

            @Override // org.threeten.bp.temporal.f
            public boolean h(b bVar) {
                return bVar.n(ChronoField.EPOCH_DAY) && Field.p(bVar);
            }

            @Override // org.threeten.bp.temporal.f
            public ValueRange i(b bVar) {
                return ChronoField.YEAR.k();
            }

            @Override // org.threeten.bp.temporal.f
            public ValueRange k() {
                return ChronoField.YEAR.k();
            }

            @Override // org.threeten.bp.temporal.f
            public long l(b bVar) {
                if (bVar.n(this)) {
                    return (long) Field.w(LocalDate.N(bVar));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
            }

            @Override // java.lang.Enum, java.lang.Object
            public String toString() {
                return "WeekBasedYear";
            }
        };
        
        private static final int[] n = {0, 90, 181, 273, 0, 91, 182, 274};

        Field(a aVar) {
        }

        static boolean p(b bVar) {
            return e.n(bVar).equals(IsoChronology.c);
        }

        static ValueRange r(LocalDate localDate) {
            return ValueRange.g(1, (long) x(w(localDate)));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
            if ((r0 == -3 || (r0 == -2 && r5.c0())) == false) goto L_0x005a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static int s(org.threeten.bp.LocalDate r5) {
            /*
                org.threeten.bp.DayOfWeek r0 = r5.Q()
                int r0 = r0.ordinal()
                int r1 = r5.S()
                r2 = 1
                int r1 = r1 - r2
                int r0 = 3 - r0
                int r0 = r0 + r1
                int r3 = r0 / 7
                int r3 = r3 * 7
                int r0 = r0 - r3
                r3 = -3
                int r0 = r0 + r3
                if (r0 >= r3) goto L_0x001c
                int r0 = r0 + 7
            L_0x001c:
                if (r1 >= r0) goto L_0x003f
                r0 = 180(0xb4, float:2.52E-43)
                org.threeten.bp.LocalDate r5 = r5.C0(r0)
                r0 = -1
                org.threeten.bp.LocalDate r5 = r5.v0(r0)
                int r5 = w(r5)
                int r5 = x(r5)
                long r0 = (long) r5
                r2 = 1
                org.threeten.bp.temporal.ValueRange r5 = org.threeten.bp.temporal.ValueRange.g(r2, r0)
                long r0 = r5.c()
                int r5 = (int) r0
                goto L_0x005b
            L_0x003f:
                int r1 = r1 - r0
                int r1 = r1 / 7
                int r1 = r1 + r2
                r4 = 53
                if (r1 != r4) goto L_0x0059
                if (r0 == r3) goto L_0x0055
                r3 = -2
                if (r0 != r3) goto L_0x0053
                boolean r5 = r5.c0()
                if (r5 == 0) goto L_0x0053
                goto L_0x0055
            L_0x0053:
                r5 = 0
                goto L_0x0056
            L_0x0055:
                r5 = 1
            L_0x0056:
                if (r5 != 0) goto L_0x0059
                goto L_0x005a
            L_0x0059:
                r2 = r1
            L_0x005a:
                r5 = r2
            L_0x005b:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.temporal.IsoFields.Field.s(org.threeten.bp.LocalDate):int");
        }

        /* access modifiers changed from: private */
        public static int w(LocalDate localDate) {
            int W = localDate.W();
            int S = localDate.S();
            if (S <= 3) {
                if (S - localDate.Q().ordinal() < -2) {
                    return W - 1;
                }
                return W;
            } else if (S < 363) {
                return W;
            } else {
                return ((S - 363) - (localDate.c0() ? 1 : 0)) - localDate.Q().ordinal() >= 0 ? W + 1 : W;
            }
        }

        /* access modifiers changed from: private */
        public static int x(int i) {
            LocalDate k0 = LocalDate.k0(i, 1, 1);
            if (k0.Q() != DayOfWeek.THURSDAY) {
                return (k0.Q() != DayOfWeek.WEDNESDAY || !k0.c0()) ? 52 : 53;
            }
            return 53;
        }

        @Override // org.threeten.bp.temporal.f
        public boolean d() {
            return true;
        }

        @Override // org.threeten.bp.temporal.f
        public boolean m() {
            return false;
        }

        @Override // org.threeten.bp.temporal.f
        public b n(Map<f, Long> map, b bVar, ResolverStyle resolverStyle) {
            return null;
        }
    }

    private enum Unit implements i {
        WEEK_BASED_YEARS("WeekBasedYears", Duration.i(31556952)),
        QUARTER_YEARS("QuarterYears", Duration.i(7889238));
        
        private final Duration duration;
        private final String name;

        private Unit(String str, Duration duration2) {
            this.name = str;
            this.duration = duration2;
        }

        @Override // org.threeten.bp.temporal.i
        public boolean d() {
            return true;
        }

        @Override // org.threeten.bp.temporal.i
        public long g(a aVar, a aVar2) {
            int ordinal = ordinal();
            if (ordinal == 0) {
                f fVar = IsoFields.a;
                Field field = Field.WEEK_BASED_YEAR;
                return yif.S(aVar2.u(field), aVar.u(field));
            } else if (ordinal == 1) {
                return aVar.q(aVar2, ChronoUnit.MONTHS) / 3;
            } else {
                throw new IllegalStateException("Unreachable");
            }
        }

        @Override // org.threeten.bp.temporal.i
        public <R extends a> R h(R r, long j) {
            int ordinal = ordinal();
            if (ordinal == 0) {
                f fVar = IsoFields.a;
                Field field = Field.WEEK_BASED_YEAR;
                return (R) r.d(field, yif.O((long) r.r(field), j));
            } else if (ordinal == 1) {
                return (R) r.v(j / 256, ChronoUnit.YEARS).v((j % 256) * 3, ChronoUnit.MONTHS);
            } else {
                throw new IllegalStateException("Unreachable");
            }
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.name;
        }
    }

    static {
        Unit unit = Unit.QUARTER_YEARS;
    }
}
