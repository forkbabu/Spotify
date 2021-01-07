package org.threeten.bp.format;

import org.threeten.bp.ZoneId;
import org.threeten.bp.chrono.a;
import org.threeten.bp.chrono.e;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;
import org.threeten.bp.temporal.h;

/* access modifiers changed from: package-private */
public final class d extends cqf {
    final /* synthetic */ a a;
    final /* synthetic */ b b;
    final /* synthetic */ e c;
    final /* synthetic */ ZoneId f;

    d(a aVar, b bVar, e eVar, ZoneId zoneId) {
        this.a = aVar;
        this.b = bVar;
        this.c = eVar;
        this.f = zoneId;
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public ValueRange k(f fVar) {
        if (this.a == null || !fVar.d()) {
            return this.b.k(fVar);
        }
        return this.a.k(fVar);
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public <R> R m(h<R> hVar) {
        return hVar == g.a() ? (R) this.c : hVar == g.g() ? (R) this.f : hVar == g.e() ? (R) this.b.m(hVar) : hVar.a(this);
    }

    @Override // org.threeten.bp.temporal.b
    public boolean n(f fVar) {
        if (this.a == null || !fVar.d()) {
            return this.b.n(fVar);
        }
        return this.a.n(fVar);
    }

    @Override // org.threeten.bp.temporal.b
    public long u(f fVar) {
        if (this.a == null || !fVar.d()) {
            return this.b.u(fVar);
        }
        return this.a.u(fVar);
    }
}
