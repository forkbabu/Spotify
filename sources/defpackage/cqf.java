package defpackage;

import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;
import org.threeten.bp.temporal.h;

/* renamed from: cqf  reason: default package */
public abstract class cqf implements b {
    @Override // org.threeten.bp.temporal.b
    public ValueRange k(f fVar) {
        if (!(fVar instanceof ChronoField)) {
            return fVar.i(this);
        }
        if (n(fVar)) {
            return fVar.k();
        }
        throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
    }

    @Override // org.threeten.bp.temporal.b
    public <R> R m(h<R> hVar) {
        if (hVar == g.g() || hVar == g.a() || hVar == g.e()) {
            return null;
        }
        return hVar.a(this);
    }

    @Override // org.threeten.bp.temporal.b
    public int r(f fVar) {
        return k(fVar).a(u(fVar), fVar);
    }
}
