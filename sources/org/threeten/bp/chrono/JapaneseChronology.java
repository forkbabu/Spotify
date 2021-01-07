package org.threeten.bp.chrono;

import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.ZoneId;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.b;

public final class JapaneseChronology extends e implements Serializable {
    static final Locale c = new Locale("ja", "JP", "JP");
    public static final JapaneseChronology f = new JapaneseChronology();
    private static final Map<String, String[]> n;
    private static final Map<String, String[]> o;
    private static final Map<String, String[]> p;
    private static final long serialVersionUID = 459996390165777884L;

    static {
        HashMap hashMap = new HashMap();
        n = hashMap;
        HashMap hashMap2 = new HashMap();
        o = hashMap2;
        HashMap hashMap3 = new HashMap();
        p = hashMap3;
        hashMap.put("en", new String[]{"Unknown", "K", "M", "T", "S", "H"});
        hashMap.put("ja", new String[]{"Unknown", "K", "M", "T", "S", "H"});
        hashMap2.put("en", new String[]{"Unknown", "K", "M", "T", "S", "H"});
        hashMap2.put("ja", new String[]{"Unknown", "慶", "明", "大", "昭", "平"});
        hashMap3.put("en", new String[]{"Unknown", "Keio", "Meiji", "Taisho", "Showa", "Heisei"});
        hashMap3.put("ja", new String[]{"Unknown", "慶応", "明治", "大正", "昭和", "平成"});
    }

    private JapaneseChronology() {
    }

    private Object readResolve() {
        return f;
    }

    @Override // org.threeten.bp.chrono.e
    public a g(int i, int i2, int i3) {
        return new JapaneseDate(LocalDate.k0(i, i2, i3));
    }

    @Override // org.threeten.bp.chrono.e
    public a h(b bVar) {
        if (bVar instanceof JapaneseDate) {
            return (JapaneseDate) bVar;
        }
        return new JapaneseDate(LocalDate.N(bVar));
    }

    @Override // org.threeten.bp.chrono.e
    public f m(int i) {
        return JapaneseEra.A(i);
    }

    @Override // org.threeten.bp.chrono.e
    public String p() {
        return "japanese";
    }

    @Override // org.threeten.bp.chrono.e
    public String q() {
        return "Japanese";
    }

    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: org.threeten.bp.chrono.b<?>, org.threeten.bp.chrono.b<org.threeten.bp.chrono.JapaneseDate> */
    @Override // org.threeten.bp.chrono.e
    public b<JapaneseDate> r(b bVar) {
        return super.r(bVar);
    }

    @Override // org.threeten.bp.chrono.e
    public d<JapaneseDate> w(Instant instant, ZoneId zoneId) {
        return ChronoZonedDateTimeImpl.O(this, instant, zoneId);
    }

    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: org.threeten.bp.chrono.d<?>, org.threeten.bp.chrono.d<org.threeten.bp.chrono.JapaneseDate> */
    @Override // org.threeten.bp.chrono.e
    public d<JapaneseDate> x(b bVar) {
        return super.x(bVar);
    }

    public ValueRange z(ChronoField chronoField) {
        int ordinal = chronoField.ordinal();
        if (!(ordinal == 15 || ordinal == 18 || ordinal == 20 || ordinal == 24)) {
            switch (ordinal) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    Calendar instance = Calendar.getInstance(c);
                    int ordinal2 = chronoField.ordinal();
                    int i = 0;
                    if (ordinal2 == 19) {
                        JapaneseEra[] C = JapaneseEra.C();
                        int i2 = 366;
                        while (i < C.length) {
                            i2 = Math.min(i2, ((C[i].B().c0() ? 366 : 365) - C[i].B().S()) + 1);
                            i++;
                        }
                        return ValueRange.h(1, (long) i2, 366);
                    } else if (ordinal2 == 23) {
                        return ValueRange.i((long) (instance.getMinimum(2) + 1), (long) (instance.getGreatestMinimum(2) + 1), (long) (instance.getLeastMaximum(2) + 1), (long) (instance.getMaximum(2) + 1));
                    } else {
                        switch (ordinal2) {
                            case 25:
                                JapaneseEra[] C2 = JapaneseEra.C();
                                int W = (C2[C2.length - 1].w().W() - C2[C2.length - 1].B().W()) + 1;
                                int i3 = Integer.MAX_VALUE;
                                while (i < C2.length) {
                                    i3 = Math.min(i3, (C2[i].w().W() - C2[i].B().W()) + 1);
                                    i++;
                                }
                                return ValueRange.i(1, 6, (long) i3, (long) W);
                            case 26:
                                JapaneseEra[] C3 = JapaneseEra.C();
                                return ValueRange.g((long) JapaneseDate.c.W(), (long) C3[C3.length - 1].w().W());
                            case 27:
                                JapaneseEra[] C4 = JapaneseEra.C();
                                return ValueRange.g((long) C4[0].z(), (long) C4[C4.length - 1].z());
                            default:
                                throw new UnsupportedOperationException("Unimplementable field: " + chronoField);
                        }
                    }
            }
        }
        return chronoField.k();
    }
}
