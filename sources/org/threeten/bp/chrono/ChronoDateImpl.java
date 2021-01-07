package org.threeten.bp.chrono;

import com.adjust.sdk.Constants;
import java.io.Serializable;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.chrono.a;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.c;
import org.threeten.bp.temporal.i;

abstract class ChronoDateImpl<D extends a> extends a implements org.threeten.bp.temporal.a, c, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    ChronoDateImpl() {
    }

    /* renamed from: J */
    public ChronoDateImpl<D> v(long j, i iVar) {
        if (!(iVar instanceof ChronoUnit)) {
            return (ChronoDateImpl) z().i(iVar.h(this, j));
        }
        switch (((ChronoUnit) iVar).ordinal()) {
            case 7:
                return L(j);
            case 8:
                return L(yif.P(j, 7));
            case 9:
                return M(j);
            case 10:
                return N(j);
            case 11:
                return N(yif.P(j, 10));
            case 12:
                return N(yif.P(j, 100));
            case 13:
                return N(yif.P(j, Constants.ONE_SECOND));
            default:
                throw new DateTimeException(iVar + " not valid for chronology " + z().q());
        }
    }

    /* access modifiers changed from: package-private */
    public abstract ChronoDateImpl<D> L(long j);

    /* access modifiers changed from: package-private */
    public abstract ChronoDateImpl<D> M(long j);

    /* access modifiers changed from: package-private */
    public abstract ChronoDateImpl<D> N(long j);

    @Override // org.threeten.bp.temporal.a
    public long q(org.threeten.bp.temporal.a aVar, i iVar) {
        a h = z().h(aVar);
        if (iVar instanceof ChronoUnit) {
            return LocalDate.N(this).q(h, iVar);
        }
        return iVar.g(this, h);
    }

    @Override // org.threeten.bp.chrono.a
    public b<?> w(LocalTime localTime) {
        return ChronoLocalDateTimeImpl.L(this, localTime);
    }
}
