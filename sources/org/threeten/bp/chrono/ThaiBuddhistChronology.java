package org.threeten.bp.chrono;

import java.io.Serializable;
import java.util.HashMap;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.ZoneId;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.b;

public final class ThaiBuddhistChronology extends e implements Serializable {
    public static final ThaiBuddhistChronology c = new ThaiBuddhistChronology();
    private static final HashMap<String, String[]> f;
    private static final HashMap<String, String[]> n;
    private static final HashMap<String, String[]> o;
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap<String, String[]> hashMap = new HashMap<>();
        f = hashMap;
        HashMap<String, String[]> hashMap2 = new HashMap<>();
        n = hashMap2;
        HashMap<String, String[]> hashMap3 = new HashMap<>();
        o = hashMap3;
        hashMap.put("en", new String[]{"BB", "BE"});
        hashMap.put("th", new String[]{"BB", "BE"});
        hashMap2.put("en", new String[]{"B.B.", "B.E."});
        hashMap2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        hashMap3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        hashMap3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private ThaiBuddhistChronology() {
    }

    private Object readResolve() {
        return c;
    }

    @Override // org.threeten.bp.chrono.e
    public a g(int i, int i2, int i3) {
        return new ThaiBuddhistDate(LocalDate.k0(i - 543, i2, i3));
    }

    @Override // org.threeten.bp.chrono.e
    public a h(b bVar) {
        if (bVar instanceof ThaiBuddhistDate) {
            return (ThaiBuddhistDate) bVar;
        }
        return new ThaiBuddhistDate(LocalDate.N(bVar));
    }

    @Override // org.threeten.bp.chrono.e
    public f m(int i) {
        return ThaiBuddhistEra.h(i);
    }

    @Override // org.threeten.bp.chrono.e
    public String p() {
        return "buddhist";
    }

    @Override // org.threeten.bp.chrono.e
    public String q() {
        return "ThaiBuddhist";
    }

    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: org.threeten.bp.chrono.b<?>, org.threeten.bp.chrono.b<org.threeten.bp.chrono.ThaiBuddhistDate> */
    @Override // org.threeten.bp.chrono.e
    public b<ThaiBuddhistDate> r(b bVar) {
        return super.r(bVar);
    }

    @Override // org.threeten.bp.chrono.e
    public d<ThaiBuddhistDate> w(Instant instant, ZoneId zoneId) {
        return ChronoZonedDateTimeImpl.O(this, instant, zoneId);
    }

    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: org.threeten.bp.chrono.d<?>, org.threeten.bp.chrono.d<org.threeten.bp.chrono.ThaiBuddhistDate> */
    @Override // org.threeten.bp.chrono.e
    public d<ThaiBuddhistDate> x(b bVar) {
        return super.x(bVar);
    }

    public ValueRange z(ChronoField chronoField) {
        switch (chronoField.ordinal()) {
            case 24:
                ValueRange k = ChronoField.PROLEPTIC_MONTH.k();
                return ValueRange.g(k.d() + 6516, k.c() + 6516);
            case 25:
                ValueRange k2 = ChronoField.YEAR.k();
                return ValueRange.h(1, (-(k2.d() + 543)) + 1, k2.c() + 543);
            case 26:
                ValueRange k3 = ChronoField.YEAR.k();
                return ValueRange.g(k3.d() + 543, k3.c() + 543);
            default:
                return chronoField.k();
        }
    }
}
