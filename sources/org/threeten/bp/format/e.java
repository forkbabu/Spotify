package org.threeten.bp.format;

import java.util.Locale;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.Instant;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.chrono.a;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;
import org.threeten.bp.temporal.h;
import org.threeten.bp.zone.ZoneRules;
import org.threeten.bp.zone.ZoneRulesException;

/* access modifiers changed from: package-private */
public final class e {
    private b a;
    private Locale b;
    private g c;
    private int d;

    e(b bVar, b bVar2) {
        ZoneOffset zoneOffset;
        org.threeten.bp.chrono.e b2 = bVar2.b();
        ZoneId e = bVar2.e();
        if (!(b2 == null && e == null)) {
            org.threeten.bp.chrono.e eVar = (org.threeten.bp.chrono.e) bVar.m(g.a());
            ZoneId zoneId = (ZoneId) bVar.m(g.g());
            a aVar = null;
            b2 = yif.n(eVar, b2) ? null : b2;
            e = yif.n(zoneId, e) ? null : e;
            if (!(b2 == null && e == null)) {
                org.threeten.bp.chrono.e eVar2 = b2 != null ? b2 : eVar;
                zoneId = e != null ? e : zoneId;
                if (e != null) {
                    if (bVar.n(ChronoField.INSTANT_SECONDS)) {
                        bVar = (eVar2 == null ? IsoChronology.c : eVar2).w(Instant.z(bVar), e);
                    } else {
                        try {
                            ZoneRules l = e.l();
                            if (l.e()) {
                                zoneOffset = l.a(Instant.a);
                                ZoneOffset zoneOffset2 = (ZoneOffset) bVar.m(g.d());
                                if ((zoneOffset instanceof ZoneOffset) && zoneOffset2 != null && !zoneOffset.equals(zoneOffset2)) {
                                    throw new DateTimeException("Invalid override zone for temporal: " + e + " " + bVar);
                                }
                            }
                        } catch (ZoneRulesException unused) {
                        }
                        zoneOffset = e;
                        ZoneOffset zoneOffset22 = (ZoneOffset) bVar.m(g.d());
                        throw new DateTimeException("Invalid override zone for temporal: " + e + " " + bVar);
                    }
                }
                if (b2 != null) {
                    if (bVar.n(ChronoField.EPOCH_DAY)) {
                        aVar = eVar2.h(bVar);
                    } else if (!(b2 == IsoChronology.c && eVar == null)) {
                        ChronoField[] values = ChronoField.values();
                        for (int i = 0; i < 30; i++) {
                            ChronoField chronoField = values[i];
                            if (chronoField.d() && bVar.n(chronoField)) {
                                throw new DateTimeException("Invalid override chronology for temporal: " + b2 + " " + bVar);
                            }
                        }
                    }
                }
                bVar = new d(aVar, bVar, eVar2, zoneId);
            }
        }
        this.a = bVar;
        this.b = bVar2.d();
        this.c = bVar2.c();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.d--;
    }

    /* access modifiers changed from: package-private */
    public Locale b() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public g c() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public b d() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public Long e(f fVar) {
        try {
            return Long.valueOf(this.a.u(fVar));
        } catch (DateTimeException e) {
            if (this.d > 0) {
                return null;
            }
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    public <R> R f(h<R> hVar) {
        R r = (R) this.a.m(hVar);
        if (r != null || this.d != 0) {
            return r;
        }
        StringBuilder V0 = je.V0("Unable to extract value: ");
        V0.append(this.a.getClass());
        throw new DateTimeException(V0.toString());
    }

    /* access modifiers changed from: package-private */
    public void g() {
        this.d++;
    }

    public String toString() {
        return this.a.toString();
    }
}
