package org.threeten.bp.chrono;

import java.io.Serializable;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.ZoneId;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.b;

public final class MinguoChronology extends e implements Serializable {
    public static final MinguoChronology c = new MinguoChronology();
    private static final long serialVersionUID = 1039765215346859963L;

    private MinguoChronology() {
    }

    private Object readResolve() {
        return c;
    }

    @Override // org.threeten.bp.chrono.e
    public a g(int i, int i2, int i3) {
        return new MinguoDate(LocalDate.k0(i + 1911, i2, i3));
    }

    @Override // org.threeten.bp.chrono.e
    public a h(b bVar) {
        if (bVar instanceof MinguoDate) {
            return (MinguoDate) bVar;
        }
        return new MinguoDate(LocalDate.N(bVar));
    }

    @Override // org.threeten.bp.chrono.e
    public f m(int i) {
        return MinguoEra.h(i);
    }

    @Override // org.threeten.bp.chrono.e
    public String p() {
        return "roc";
    }

    @Override // org.threeten.bp.chrono.e
    public String q() {
        return "Minguo";
    }

    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: org.threeten.bp.chrono.b<?>, org.threeten.bp.chrono.b<org.threeten.bp.chrono.MinguoDate> */
    @Override // org.threeten.bp.chrono.e
    public b<MinguoDate> r(b bVar) {
        return super.r(bVar);
    }

    @Override // org.threeten.bp.chrono.e
    public d<MinguoDate> w(Instant instant, ZoneId zoneId) {
        return ChronoZonedDateTimeImpl.O(this, instant, zoneId);
    }

    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: org.threeten.bp.chrono.d<?>, org.threeten.bp.chrono.d<org.threeten.bp.chrono.MinguoDate> */
    @Override // org.threeten.bp.chrono.e
    public d<MinguoDate> x(b bVar) {
        return super.x(bVar);
    }

    public ValueRange z(ChronoField chronoField) {
        switch (chronoField.ordinal()) {
            case 24:
                ValueRange k = ChronoField.PROLEPTIC_MONTH.k();
                return ValueRange.g(k.d() - 22932, k.c() - 22932);
            case 25:
                ValueRange k2 = ChronoField.YEAR.k();
                return ValueRange.h(1, k2.c() - 1911, (-k2.d()) + 1 + 1911);
            case 26:
                ValueRange k3 = ChronoField.YEAR.k();
                return ValueRange.g(k3.d() - 1911, k3.c() - 1911);
            default:
                return chronoField.k();
        }
    }
}
