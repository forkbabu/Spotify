package org.threeten.bp.chrono;

import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;
import org.threeten.bp.temporal.h;

public enum IsoEra implements f {
    BCE,
    CE;

    @Override // org.threeten.bp.temporal.c
    public a g(a aVar) {
        return aVar.d(ChronoField.ERA, (long) ordinal());
    }

    @Override // org.threeten.bp.temporal.b
    public ValueRange k(f fVar) {
        if (fVar == ChronoField.ERA) {
            return fVar.k();
        }
        if (!(fVar instanceof ChronoField)) {
            return fVar.i(this);
        }
        throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
    }

    @Override // org.threeten.bp.temporal.b
    public <R> R m(h<R> hVar) {
        if (hVar == g.e()) {
            return (R) ChronoUnit.ERAS;
        }
        if (hVar == g.a() || hVar == g.f() || hVar == g.g() || hVar == g.d() || hVar == g.b() || hVar == g.c()) {
            return null;
        }
        return hVar.a(this);
    }

    @Override // org.threeten.bp.temporal.b
    public boolean n(f fVar) {
        if (fVar instanceof ChronoField) {
            if (fVar == ChronoField.ERA) {
                return true;
            }
            return false;
        } else if (fVar == null || !fVar.h(this)) {
            return false;
        } else {
            return true;
        }
    }

    @Override // org.threeten.bp.temporal.b
    public int r(f fVar) {
        if (fVar == ChronoField.ERA) {
            return ordinal();
        }
        return k(fVar).a(u(fVar), fVar);
    }

    @Override // org.threeten.bp.temporal.b
    public long u(f fVar) {
        if (fVar == ChronoField.ERA) {
            return (long) ordinal();
        }
        if (!(fVar instanceof ChronoField)) {
            return fVar.l(this);
        }
        throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
    }
}
