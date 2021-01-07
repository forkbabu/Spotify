package org.threeten.bp.format;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.Period;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.chrono.d;
import org.threeten.bp.chrono.e;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;
import org.threeten.bp.temporal.h;

/* access modifiers changed from: package-private */
public final class a extends cqf implements b, Cloneable {
    final Map<f, Long> a = new HashMap();
    e b;
    ZoneId c;
    org.threeten.bp.chrono.a f;
    LocalTime n;
    boolean o;
    Period p;

    private void A(ResolverStyle resolverStyle) {
        if (this.b instanceof IsoChronology) {
            x(IsoChronology.c.A(this.a, resolverStyle));
            return;
        }
        Map<f, Long> map = this.a;
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        if (map.containsKey(chronoField)) {
            x(LocalDate.o0(this.a.remove(chronoField).longValue()));
        }
    }

    private void B() {
        if (this.a.containsKey(ChronoField.INSTANT_SECONDS)) {
            ZoneId zoneId = this.c;
            if (zoneId != null) {
                C(zoneId);
                return;
            }
            Long l = this.a.get(ChronoField.OFFSET_SECONDS);
            if (l != null) {
                C(ZoneOffset.G(l.intValue()));
            }
        }
    }

    private void C(ZoneId zoneId) {
        Map<f, Long> map = this.a;
        ChronoField chronoField = ChronoField.INSTANT_SECONDS;
        d<?> w = this.b.w(Instant.F(map.remove(chronoField).longValue()), zoneId);
        if (this.f == null) {
            this.f = w.D();
        } else {
            I(chronoField, w.D());
        }
        w(ChronoField.SECOND_OF_DAY, (long) w.G().W());
    }

    private void D(ResolverStyle resolverStyle) {
        ResolverStyle resolverStyle2 = ResolverStyle.SMART;
        ResolverStyle resolverStyle3 = ResolverStyle.LENIENT;
        Map<f, Long> map = this.a;
        ChronoField chronoField = ChronoField.CLOCK_HOUR_OF_DAY;
        long j = 0;
        if (map.containsKey(chronoField)) {
            long longValue = this.a.remove(chronoField).longValue();
            if (!(resolverStyle == resolverStyle3 || (resolverStyle == resolverStyle2 && longValue == 0))) {
                chronoField.q(longValue);
            }
            ChronoField chronoField2 = ChronoField.HOUR_OF_DAY;
            if (longValue == 24) {
                longValue = 0;
            }
            w(chronoField2, longValue);
        }
        Map<f, Long> map2 = this.a;
        ChronoField chronoField3 = ChronoField.CLOCK_HOUR_OF_AMPM;
        if (map2.containsKey(chronoField3)) {
            long longValue2 = this.a.remove(chronoField3).longValue();
            if (!(resolverStyle == resolverStyle3 || (resolverStyle == resolverStyle2 && longValue2 == 0))) {
                chronoField3.q(longValue2);
            }
            ChronoField chronoField4 = ChronoField.HOUR_OF_AMPM;
            if (longValue2 != 12) {
                j = longValue2;
            }
            w(chronoField4, j);
        }
        if (resolverStyle != resolverStyle3) {
            Map<f, Long> map3 = this.a;
            ChronoField chronoField5 = ChronoField.AMPM_OF_DAY;
            if (map3.containsKey(chronoField5)) {
                chronoField5.q(this.a.get(chronoField5).longValue());
            }
            Map<f, Long> map4 = this.a;
            ChronoField chronoField6 = ChronoField.HOUR_OF_AMPM;
            if (map4.containsKey(chronoField6)) {
                chronoField6.q(this.a.get(chronoField6).longValue());
            }
        }
        Map<f, Long> map5 = this.a;
        ChronoField chronoField7 = ChronoField.AMPM_OF_DAY;
        if (map5.containsKey(chronoField7)) {
            Map<f, Long> map6 = this.a;
            ChronoField chronoField8 = ChronoField.HOUR_OF_AMPM;
            if (map6.containsKey(chronoField8)) {
                w(ChronoField.HOUR_OF_DAY, (this.a.remove(chronoField7).longValue() * 12) + this.a.remove(chronoField8).longValue());
            }
        }
        Map<f, Long> map7 = this.a;
        ChronoField chronoField9 = ChronoField.NANO_OF_DAY;
        if (map7.containsKey(chronoField9)) {
            long longValue3 = this.a.remove(chronoField9).longValue();
            if (resolverStyle != resolverStyle3) {
                chronoField9.q(longValue3);
            }
            w(ChronoField.SECOND_OF_DAY, longValue3 / 1000000000);
            w(ChronoField.NANO_OF_SECOND, longValue3 % 1000000000);
        }
        Map<f, Long> map8 = this.a;
        ChronoField chronoField10 = ChronoField.MICRO_OF_DAY;
        if (map8.containsKey(chronoField10)) {
            long longValue4 = this.a.remove(chronoField10).longValue();
            if (resolverStyle != resolverStyle3) {
                chronoField10.q(longValue4);
            }
            w(ChronoField.SECOND_OF_DAY, longValue4 / 1000000);
            w(ChronoField.MICRO_OF_SECOND, longValue4 % 1000000);
        }
        Map<f, Long> map9 = this.a;
        ChronoField chronoField11 = ChronoField.MILLI_OF_DAY;
        if (map9.containsKey(chronoField11)) {
            long longValue5 = this.a.remove(chronoField11).longValue();
            if (resolverStyle != resolverStyle3) {
                chronoField11.q(longValue5);
            }
            w(ChronoField.SECOND_OF_DAY, longValue5 / 1000);
            w(ChronoField.MILLI_OF_SECOND, longValue5 % 1000);
        }
        Map<f, Long> map10 = this.a;
        ChronoField chronoField12 = ChronoField.SECOND_OF_DAY;
        if (map10.containsKey(chronoField12)) {
            long longValue6 = this.a.remove(chronoField12).longValue();
            if (resolverStyle != resolverStyle3) {
                chronoField12.q(longValue6);
            }
            w(ChronoField.HOUR_OF_DAY, longValue6 / 3600);
            w(ChronoField.MINUTE_OF_HOUR, (longValue6 / 60) % 60);
            w(ChronoField.SECOND_OF_MINUTE, longValue6 % 60);
        }
        Map<f, Long> map11 = this.a;
        ChronoField chronoField13 = ChronoField.MINUTE_OF_DAY;
        if (map11.containsKey(chronoField13)) {
            long longValue7 = this.a.remove(chronoField13).longValue();
            if (resolverStyle != resolverStyle3) {
                chronoField13.q(longValue7);
            }
            w(ChronoField.HOUR_OF_DAY, longValue7 / 60);
            w(ChronoField.MINUTE_OF_HOUR, longValue7 % 60);
        }
        if (resolverStyle != resolverStyle3) {
            Map<f, Long> map12 = this.a;
            ChronoField chronoField14 = ChronoField.MILLI_OF_SECOND;
            if (map12.containsKey(chronoField14)) {
                chronoField14.q(this.a.get(chronoField14).longValue());
            }
            Map<f, Long> map13 = this.a;
            ChronoField chronoField15 = ChronoField.MICRO_OF_SECOND;
            if (map13.containsKey(chronoField15)) {
                chronoField15.q(this.a.get(chronoField15).longValue());
            }
        }
        Map<f, Long> map14 = this.a;
        ChronoField chronoField16 = ChronoField.MILLI_OF_SECOND;
        if (map14.containsKey(chronoField16)) {
            Map<f, Long> map15 = this.a;
            ChronoField chronoField17 = ChronoField.MICRO_OF_SECOND;
            if (map15.containsKey(chronoField17)) {
                w(chronoField17, (this.a.get(chronoField17).longValue() % 1000) + (this.a.remove(chronoField16).longValue() * 1000));
            }
        }
        Map<f, Long> map16 = this.a;
        ChronoField chronoField18 = ChronoField.MICRO_OF_SECOND;
        if (map16.containsKey(chronoField18)) {
            Map<f, Long> map17 = this.a;
            ChronoField chronoField19 = ChronoField.NANO_OF_SECOND;
            if (map17.containsKey(chronoField19)) {
                w(chronoField18, this.a.get(chronoField19).longValue() / 1000);
                this.a.remove(chronoField18);
            }
        }
        if (this.a.containsKey(chronoField16)) {
            Map<f, Long> map18 = this.a;
            ChronoField chronoField20 = ChronoField.NANO_OF_SECOND;
            if (map18.containsKey(chronoField20)) {
                w(chronoField16, this.a.get(chronoField20).longValue() / 1000000);
                this.a.remove(chronoField16);
            }
        }
        if (this.a.containsKey(chronoField18)) {
            w(ChronoField.NANO_OF_SECOND, this.a.remove(chronoField18).longValue() * 1000);
        } else if (this.a.containsKey(chronoField16)) {
            w(ChronoField.NANO_OF_SECOND, this.a.remove(chronoField16).longValue() * 1000000);
        }
    }

    private void G(f fVar, LocalTime localTime) {
        long U = localTime.U();
        Long put = this.a.put(ChronoField.NANO_OF_DAY, Long.valueOf(U));
        if (put != null && put.longValue() != U) {
            StringBuilder V0 = je.V0("Conflict found: ");
            V0.append(LocalTime.J(put.longValue()));
            V0.append(" differs from ");
            V0.append(localTime);
            V0.append(" while resolving  ");
            V0.append(fVar);
            throw new DateTimeException(V0.toString());
        }
    }

    private void I(f fVar, org.threeten.bp.chrono.a aVar) {
        if (this.b.equals(aVar.z())) {
            long F = aVar.F();
            Long put = this.a.put(ChronoField.EPOCH_DAY, Long.valueOf(F));
            if (put != null && put.longValue() != F) {
                StringBuilder V0 = je.V0("Conflict found: ");
                V0.append(LocalDate.o0(put.longValue()));
                V0.append(" differs from ");
                V0.append(LocalDate.o0(F));
                V0.append(" while resolving  ");
                V0.append(fVar);
                throw new DateTimeException(V0.toString());
            }
            return;
        }
        StringBuilder V02 = je.V0("ChronoLocalDate must use the effective parsed chronology: ");
        V02.append(this.b);
        throw new DateTimeException(V02.toString());
    }

    private void x(LocalDate localDate) {
        if (localDate != null) {
            this.f = localDate;
            for (f fVar : this.a.keySet()) {
                if ((fVar instanceof ChronoField) && fVar.d()) {
                    try {
                        long u = localDate.u(fVar);
                        Long l = this.a.get(fVar);
                        if (u != l.longValue()) {
                            throw new DateTimeException("Conflict found: Field " + fVar + " " + u + " differs from " + fVar + " " + l + " derived from " + localDate);
                        }
                    } catch (DateTimeException unused) {
                        continue;
                    }
                }
            }
        }
    }

    private void z(b bVar) {
        Iterator<Map.Entry<f, Long>> it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<f, Long> next = it.next();
            f key = next.getKey();
            long longValue = next.getValue().longValue();
            if (bVar.n(key)) {
                try {
                    long u = bVar.u(key);
                    if (u == longValue) {
                        it.remove();
                    } else {
                        throw new DateTimeException("Cross check failed: " + key + " " + u + " vs " + key + " " + longValue);
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    public a F(ResolverStyle resolverStyle, Set<f> set) {
        LocalTime localTime;
        org.threeten.bp.chrono.a aVar;
        LocalTime localTime2;
        if (set != null) {
            this.a.keySet().retainAll(set);
        }
        B();
        A(resolverStyle);
        D(resolverStyle);
        boolean z = false;
        int i = 0;
        loop0:
        while (i < 100) {
            for (Map.Entry<f, Long> entry : this.a.entrySet()) {
                f key = entry.getKey();
                b n2 = key.n(this.a, this, resolverStyle);
                if (n2 != null) {
                    if (n2 instanceof d) {
                        d dVar = (d) n2;
                        ZoneId zoneId = this.c;
                        if (zoneId == null) {
                            this.c = dVar.z();
                        } else if (!zoneId.equals(dVar.z())) {
                            StringBuilder V0 = je.V0("ChronoZonedDateTime must use the effective parsed zone: ");
                            V0.append(this.c);
                            throw new DateTimeException(V0.toString());
                        }
                        n2 = dVar.F();
                    }
                    if (n2 instanceof org.threeten.bp.chrono.a) {
                        I(key, (org.threeten.bp.chrono.a) n2);
                    } else if (n2 instanceof LocalTime) {
                        G(key, (LocalTime) n2);
                    } else if (n2 instanceof org.threeten.bp.chrono.b) {
                        org.threeten.bp.chrono.b bVar = (org.threeten.bp.chrono.b) n2;
                        I(key, bVar.F());
                        G(key, bVar.G());
                    } else {
                        throw new DateTimeException(je.Q0(n2, je.V0("Unknown type: ")));
                    }
                } else if (!this.a.containsKey(key)) {
                }
                i++;
            }
        }
        if (i != 100) {
            if (i > 0) {
                B();
                A(resolverStyle);
                D(resolverStyle);
            }
            Map<f, Long> map = this.a;
            ChronoField chronoField = ChronoField.HOUR_OF_DAY;
            Long l = map.get(chronoField);
            Map<f, Long> map2 = this.a;
            ChronoField chronoField2 = ChronoField.MINUTE_OF_HOUR;
            Long l2 = map2.get(chronoField2);
            Map<f, Long> map3 = this.a;
            ChronoField chronoField3 = ChronoField.SECOND_OF_MINUTE;
            Long l3 = map3.get(chronoField3);
            Map<f, Long> map4 = this.a;
            ChronoField chronoField4 = ChronoField.NANO_OF_SECOND;
            Long l4 = map4.get(chronoField4);
            if (l != null && ((l2 != null || (l3 == null && l4 == null)) && (l2 == null || l3 != null || l4 == null))) {
                if (resolverStyle != ResolverStyle.LENIENT) {
                    if (resolverStyle == ResolverStyle.SMART && l.longValue() == 24 && ((l2 == null || l2.longValue() == 0) && ((l3 == null || l3.longValue() == 0) && (l4 == null || l4.longValue() == 0)))) {
                        l = 0L;
                        this.p = Period.b(1);
                    }
                    int p2 = chronoField.p(l.longValue());
                    if (l2 != null) {
                        int p3 = chronoField2.p(l2.longValue());
                        if (l3 != null) {
                            int p4 = chronoField3.p(l3.longValue());
                            if (l4 != null) {
                                this.n = LocalTime.I(p2, p3, p4, chronoField4.p(l4.longValue()));
                            } else {
                                this.n = LocalTime.G(p2, p3, p4);
                            }
                        } else if (l4 == null) {
                            this.n = LocalTime.F(p2, p3);
                        }
                    } else if (l3 == null && l4 == null) {
                        this.n = LocalTime.F(p2, 0);
                    }
                } else {
                    long longValue = l.longValue();
                    if (l2 != null) {
                        if (l3 != null) {
                            if (l4 == null) {
                                l4 = 0L;
                            }
                            long O = yif.O(yif.O(yif.O(yif.Q(longValue, 3600000000000L), yif.Q(l2.longValue(), 60000000000L)), yif.Q(l3.longValue(), 1000000000)), l4.longValue());
                            this.n = LocalTime.J(yif.r(O, 86400000000000L));
                            this.p = Period.b((int) yif.o(O, 86400000000000L));
                        } else {
                            long O2 = yif.O(yif.Q(longValue, 3600), yif.Q(l2.longValue(), 60));
                            this.n = LocalTime.L(yif.r(O2, 86400));
                            this.p = Period.b((int) yif.o(O2, 86400));
                        }
                        z = false;
                    } else {
                        int T = yif.T(yif.o(longValue, 24));
                        z = false;
                        this.n = LocalTime.F((int) ((long) yif.q(longValue, 24)), 0);
                        this.p = Period.b(T);
                    }
                }
                this.a.remove(chronoField);
                this.a.remove(chronoField2);
                this.a.remove(chronoField3);
                this.a.remove(chronoField4);
            }
            if (this.a.size() > 0) {
                org.threeten.bp.chrono.a aVar2 = this.f;
                if (aVar2 != null && (localTime2 = this.n) != null) {
                    z(aVar2.w(localTime2));
                } else if (aVar2 != null) {
                    z(aVar2);
                } else {
                    b bVar2 = this.n;
                    if (bVar2 != null) {
                        z(bVar2);
                    }
                }
            }
            Period period = this.p;
            if (period != null) {
                period.getClass();
                Period period2 = Period.a;
                if (period == period2) {
                    z = true;
                }
                if (!(z || (aVar = this.f) == null || this.n == null)) {
                    this.f = aVar.D(this.p);
                    this.p = period2;
                }
            }
            if (this.n == null && (this.a.containsKey(ChronoField.INSTANT_SECONDS) || this.a.containsKey(ChronoField.SECOND_OF_DAY) || this.a.containsKey(chronoField3))) {
                if (this.a.containsKey(chronoField4)) {
                    long longValue2 = this.a.get(chronoField4).longValue();
                    this.a.put(ChronoField.MICRO_OF_SECOND, Long.valueOf(longValue2 / 1000));
                    this.a.put(ChronoField.MILLI_OF_SECOND, Long.valueOf(longValue2 / 1000000));
                } else {
                    this.a.put(chronoField4, 0L);
                    this.a.put(ChronoField.MICRO_OF_SECOND, 0L);
                    this.a.put(ChronoField.MILLI_OF_SECOND, 0L);
                }
            }
            org.threeten.bp.chrono.a aVar3 = this.f;
            if (!(aVar3 == null || (localTime = this.n) == null)) {
                if (this.c != null) {
                    d<?> w = aVar3.w(localTime).w(this.c);
                    ChronoField chronoField5 = ChronoField.INSTANT_SECONDS;
                    this.a.put(chronoField5, Long.valueOf(w.u(chronoField5)));
                } else {
                    Long l5 = this.a.get(ChronoField.OFFSET_SECONDS);
                    if (l5 != null) {
                        d<?> w2 = this.f.w(this.n).w(ZoneOffset.G(l5.intValue()));
                        ChronoField chronoField6 = ChronoField.INSTANT_SECONDS;
                        this.a.put(chronoField6, Long.valueOf(w2.u(chronoField6)));
                    }
                }
            }
            return this;
        }
        throw new DateTimeException("Badly written field");
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public <R> R m(h<R> hVar) {
        if (hVar == g.g()) {
            return (R) this.c;
        }
        if (hVar == g.a()) {
            return (R) this.b;
        }
        if (hVar == g.b()) {
            org.threeten.bp.chrono.a aVar = this.f;
            if (aVar != null) {
                return (R) LocalDate.N(aVar);
            }
            return null;
        } else if (hVar == g.c()) {
            return (R) this.n;
        } else {
            if (hVar == g.f() || hVar == g.d()) {
                return hVar.a(this);
            }
            if (hVar == g.e()) {
                return null;
            }
            return hVar.a(this);
        }
    }

    @Override // org.threeten.bp.temporal.b
    public boolean n(f fVar) {
        org.threeten.bp.chrono.a aVar;
        LocalTime localTime;
        if (fVar == null) {
            return false;
        }
        return this.a.containsKey(fVar) || ((aVar = this.f) != null && aVar.n(fVar)) || ((localTime = this.n) != null && localTime.n(fVar));
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder T0 = je.T0(128, "DateTimeBuilder[");
        if (this.a.size() > 0) {
            T0.append("fields=");
            T0.append(this.a);
        }
        T0.append(", ");
        T0.append(this.b);
        T0.append(", ");
        T0.append(this.c);
        T0.append(", ");
        T0.append(this.f);
        T0.append(", ");
        T0.append(this.n);
        T0.append(']');
        return T0.toString();
    }

    @Override // org.threeten.bp.temporal.b
    public long u(f fVar) {
        yif.J(fVar, "field");
        Long l = this.a.get(fVar);
        if (l != null) {
            return l.longValue();
        }
        org.threeten.bp.chrono.a aVar = this.f;
        if (aVar != null && aVar.n(fVar)) {
            return this.f.u(fVar);
        }
        LocalTime localTime = this.n;
        if (localTime != null && localTime.n(fVar)) {
            return this.n.u(fVar);
        }
        throw new DateTimeException(je.z0("Field not found: ", fVar));
    }

    /* access modifiers changed from: package-private */
    public a w(f fVar, long j) {
        yif.J(fVar, "field");
        Long l = this.a.get(fVar);
        if (l == null || l.longValue() == j) {
            this.a.put(fVar, Long.valueOf(j));
            return this;
        }
        throw new DateTimeException("Conflict found: " + fVar + " " + l + " differs from " + fVar + " " + j + ": " + this);
    }
}
