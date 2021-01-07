package defpackage;

import org.threeten.bp.chrono.JapaneseEra;
import org.threeten.bp.chrono.f;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.g;
import org.threeten.bp.temporal.h;

/* renamed from: aqf  reason: default package */
public abstract class aqf extends cqf implements f {
    @Override // org.threeten.bp.temporal.c
    public a g(a aVar) {
        return aVar.d(ChronoField.ERA, (long) ((JapaneseEra) this).z());
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
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
    public boolean n(org.threeten.bp.temporal.f fVar) {
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

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public int r(org.threeten.bp.temporal.f fVar) {
        if (fVar == ChronoField.ERA) {
            return ((JapaneseEra) this).z();
        }
        return k(fVar).a(u(fVar), fVar);
    }

    @Override // org.threeten.bp.temporal.b
    public long u(org.threeten.bp.temporal.f fVar) {
        if (fVar == ChronoField.ERA) {
            return (long) ((JapaneseEra) this).z();
        }
        if (!(fVar instanceof ChronoField)) {
            return fVar.l(this);
        }
        throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
    }
}
