package org.threeten.bp.chrono;

import java.io.Serializable;
import java.util.HashMap;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.Instant;
import org.threeten.bp.ZoneId;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.b;

public final class HijrahChronology extends e implements Serializable {
    public static final HijrahChronology c = new HijrahChronology();
    private static final HashMap<String, String[]> f;
    private static final HashMap<String, String[]> n;
    private static final HashMap<String, String[]> o;
    private static final long serialVersionUID = 3127340209035924785L;

    static {
        HashMap<String, String[]> hashMap = new HashMap<>();
        f = hashMap;
        HashMap<String, String[]> hashMap2 = new HashMap<>();
        n = hashMap2;
        HashMap<String, String[]> hashMap3 = new HashMap<>();
        o = hashMap3;
        hashMap.put("en", new String[]{"BH", "HE"});
        hashMap2.put("en", new String[]{"B.H.", "H.E."});
        hashMap3.put("en", new String[]{"Before Hijrah", "Hijrah Era"});
    }

    private HijrahChronology() {
    }

    private Object readResolve() {
        return c;
    }

    @Override // org.threeten.bp.chrono.e
    public a g(int i, int i2, int i3) {
        return HijrahDate.f0(i, i2, i3);
    }

    @Override // org.threeten.bp.chrono.e
    public a h(b bVar) {
        if (bVar instanceof HijrahDate) {
            return (HijrahDate) bVar;
        }
        return HijrahDate.j0(bVar.u(ChronoField.EPOCH_DAY));
    }

    @Override // org.threeten.bp.chrono.e
    public f m(int i) {
        if (i == 0) {
            return HijrahEra.BEFORE_AH;
        }
        if (i == 1) {
            return HijrahEra.AH;
        }
        throw new DateTimeException("invalid Hijrah era");
    }

    @Override // org.threeten.bp.chrono.e
    public String p() {
        return "islamic-umalqura";
    }

    @Override // org.threeten.bp.chrono.e
    public String q() {
        return "Hijrah-umalqura";
    }

    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: org.threeten.bp.chrono.b<?>, org.threeten.bp.chrono.b<org.threeten.bp.chrono.HijrahDate> */
    @Override // org.threeten.bp.chrono.e
    public b<HijrahDate> r(b bVar) {
        return super.r(bVar);
    }

    @Override // org.threeten.bp.chrono.e
    public d<HijrahDate> w(Instant instant, ZoneId zoneId) {
        return ChronoZonedDateTimeImpl.O(this, instant, zoneId);
    }

    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: org.threeten.bp.chrono.d<?>, org.threeten.bp.chrono.d<org.threeten.bp.chrono.HijrahDate> */
    @Override // org.threeten.bp.chrono.e
    public d<HijrahDate> x(b bVar) {
        return super.x(bVar);
    }
}
