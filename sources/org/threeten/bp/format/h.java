package org.threeten.bp.format;

import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.IsoFields;
import org.threeten.bp.temporal.f;

final class h extends f {
    private static final Comparator<Map.Entry<String, Long>> d = new a();
    public static final /* synthetic */ int e = 0;
    private final ConcurrentMap<Map.Entry<f, Locale>, Object> c = new ConcurrentHashMap(16, 0.75f, 2);

    static class a implements Comparator<Map.Entry<String, Long>> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
            return entry2.getKey().length() - entry.getKey().length();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b {
        private final Map<TextStyle, Map<Long, String>> a;
        private final Map<TextStyle, List<Map.Entry<String, Long>>> b;

        b(Map<TextStyle, Map<Long, String>> map) {
            this.a = map;
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (TextStyle textStyle : map.keySet()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry<Long, String> entry : map.get(textStyle).entrySet()) {
                    String value = entry.getValue();
                    String value2 = entry.getValue();
                    Long key = entry.getKey();
                    int i = h.e;
                    hashMap2.put(value, new AbstractMap.SimpleImmutableEntry(value2, key));
                }
                ArrayList arrayList2 = new ArrayList(hashMap2.values());
                Collections.sort(arrayList2, h.d);
                hashMap.put(textStyle, arrayList2);
                arrayList.addAll(arrayList2);
                hashMap.put(null, arrayList);
            }
            Collections.sort(arrayList, h.d);
            this.b = hashMap;
        }

        /* access modifiers changed from: package-private */
        public String a(long j, TextStyle textStyle) {
            Map<Long, String> map = this.a.get(textStyle);
            if (map != null) {
                return map.get(Long.valueOf(j));
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public Iterator<Map.Entry<String, Long>> b(TextStyle textStyle) {
            List<Map.Entry<String, Long>> list = this.b.get(textStyle);
            if (list != null) {
                return list.iterator();
            }
            return null;
        }
    }

    h() {
    }

    private static b e(Map<TextStyle, Map<Long, String>> map) {
        map.put(TextStyle.FULL_STANDALONE, map.get(TextStyle.FULL));
        map.put(TextStyle.SHORT_STANDALONE, map.get(TextStyle.SHORT));
        TextStyle textStyle = TextStyle.NARROW;
        if (map.containsKey(textStyle)) {
            TextStyle textStyle2 = TextStyle.NARROW_STANDALONE;
            if (!map.containsKey(textStyle2)) {
                map.put(textStyle2, map.get(textStyle));
            }
        }
        return new b(map);
    }

    private Object f(f fVar, Locale locale) {
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry;
        Object obj;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry(fVar, locale);
        Object obj2 = this.c.get(simpleImmutableEntry2);
        if (obj2 != null) {
            return obj2;
        }
        TextStyle textStyle = TextStyle.NARROW;
        TextStyle textStyle2 = TextStyle.SHORT;
        TextStyle textStyle3 = TextStyle.FULL;
        if (fVar == ChronoField.MONTH_OF_YEAR) {
            DateFormatSymbols instance = DateFormatSymbols.getInstance(locale);
            HashMap hashMap = new HashMap();
            simpleImmutableEntry = simpleImmutableEntry2;
            String[] months = instance.getMonths();
            HashMap hashMap2 = new HashMap();
            hashMap2.put(1L, months[0]);
            hashMap2.put(2L, months[1]);
            hashMap2.put(3L, months[2]);
            hashMap2.put(4L, months[3]);
            hashMap2.put(5L, months[4]);
            hashMap2.put(6L, months[5]);
            hashMap2.put(7L, months[6]);
            hashMap2.put(8L, months[7]);
            hashMap2.put(9L, months[8]);
            hashMap2.put(10L, months[9]);
            hashMap2.put(11L, months[10]);
            hashMap2.put(12L, months[11]);
            hashMap.put(textStyle3, hashMap2);
            HashMap hashMap3 = new HashMap();
            hashMap3.put(1L, months[0].substring(0, 1));
            hashMap3.put(2L, months[1].substring(0, 1));
            hashMap3.put(3L, months[2].substring(0, 1));
            hashMap3.put(4L, months[3].substring(0, 1));
            hashMap3.put(5L, months[4].substring(0, 1));
            hashMap3.put(6L, months[5].substring(0, 1));
            hashMap3.put(7L, months[6].substring(0, 1));
            hashMap3.put(8L, months[7].substring(0, 1));
            hashMap3.put(9L, months[8].substring(0, 1));
            hashMap3.put(10L, months[9].substring(0, 1));
            hashMap3.put(11L, months[10].substring(0, 1));
            hashMap3.put(12L, months[11].substring(0, 1));
            hashMap.put(textStyle, hashMap3);
            String[] shortMonths = instance.getShortMonths();
            HashMap hashMap4 = new HashMap();
            hashMap4.put(1L, shortMonths[0]);
            hashMap4.put(2L, shortMonths[1]);
            hashMap4.put(3L, shortMonths[2]);
            hashMap4.put(4L, shortMonths[3]);
            hashMap4.put(5L, shortMonths[4]);
            hashMap4.put(6L, shortMonths[5]);
            hashMap4.put(7L, shortMonths[6]);
            hashMap4.put(8L, shortMonths[7]);
            hashMap4.put(9L, shortMonths[8]);
            hashMap4.put(10L, shortMonths[9]);
            hashMap4.put(11L, shortMonths[10]);
            hashMap4.put(12L, shortMonths[11]);
            hashMap.put(textStyle2, hashMap4);
            obj = e(hashMap);
        } else {
            simpleImmutableEntry = simpleImmutableEntry2;
            if (fVar == ChronoField.DAY_OF_WEEK) {
                DateFormatSymbols instance2 = DateFormatSymbols.getInstance(locale);
                HashMap hashMap5 = new HashMap();
                String[] weekdays = instance2.getWeekdays();
                HashMap hashMap6 = new HashMap();
                hashMap6.put(1L, weekdays[2]);
                hashMap6.put(2L, weekdays[3]);
                hashMap6.put(3L, weekdays[4]);
                hashMap6.put(4L, weekdays[5]);
                hashMap6.put(5L, weekdays[6]);
                hashMap6.put(6L, weekdays[7]);
                hashMap6.put(7L, weekdays[1]);
                hashMap5.put(textStyle3, hashMap6);
                HashMap hashMap7 = new HashMap();
                hashMap7.put(1L, weekdays[2].substring(0, 1));
                hashMap7.put(2L, weekdays[3].substring(0, 1));
                hashMap7.put(3L, weekdays[4].substring(0, 1));
                hashMap7.put(4L, weekdays[5].substring(0, 1));
                hashMap7.put(5L, weekdays[6].substring(0, 1));
                hashMap7.put(6L, weekdays[7].substring(0, 1));
                hashMap7.put(7L, weekdays[1].substring(0, 1));
                hashMap5.put(textStyle, hashMap7);
                String[] shortWeekdays = instance2.getShortWeekdays();
                HashMap hashMap8 = new HashMap();
                hashMap8.put(1L, shortWeekdays[2]);
                hashMap8.put(2L, shortWeekdays[3]);
                hashMap8.put(3L, shortWeekdays[4]);
                hashMap8.put(4L, shortWeekdays[5]);
                hashMap8.put(5L, shortWeekdays[6]);
                hashMap8.put(6L, shortWeekdays[7]);
                hashMap8.put(7L, shortWeekdays[1]);
                hashMap5.put(textStyle2, hashMap8);
                obj = e(hashMap5);
            } else if (fVar == ChronoField.AMPM_OF_DAY) {
                DateFormatSymbols instance3 = DateFormatSymbols.getInstance(locale);
                HashMap hashMap9 = new HashMap();
                String[] amPmStrings = instance3.getAmPmStrings();
                HashMap hashMap10 = new HashMap();
                hashMap10.put(0L, amPmStrings[0]);
                hashMap10.put(1L, amPmStrings[1]);
                hashMap9.put(textStyle3, hashMap10);
                hashMap9.put(textStyle2, hashMap10);
                obj = e(hashMap9);
            } else if (fVar == ChronoField.ERA) {
                DateFormatSymbols instance4 = DateFormatSymbols.getInstance(locale);
                HashMap hashMap11 = new HashMap();
                String[] eras = instance4.getEras();
                HashMap hashMap12 = new HashMap();
                hashMap12.put(0L, eras[0]);
                hashMap12.put(1L, eras[1]);
                hashMap11.put(textStyle2, hashMap12);
                if (locale.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
                    HashMap hashMap13 = new HashMap();
                    hashMap13.put(0L, "Before Christ");
                    hashMap13.put(1L, "Anno Domini");
                    hashMap11.put(textStyle3, hashMap13);
                } else {
                    hashMap11.put(textStyle3, hashMap12);
                }
                HashMap hashMap14 = new HashMap();
                hashMap14.put(0L, eras[0].substring(0, 1));
                hashMap14.put(1L, eras[1].substring(0, 1));
                hashMap11.put(textStyle, hashMap14);
                obj = e(hashMap11);
            } else if (fVar == IsoFields.a) {
                HashMap hashMap15 = new HashMap();
                HashMap hashMap16 = new HashMap();
                hashMap16.put(1L, "Q1");
                hashMap16.put(2L, "Q2");
                hashMap16.put(3L, "Q3");
                hashMap16.put(4L, "Q4");
                hashMap15.put(textStyle2, hashMap16);
                HashMap hashMap17 = new HashMap();
                hashMap17.put(1L, "1st quarter");
                hashMap17.put(2L, "2nd quarter");
                hashMap17.put(3L, "3rd quarter");
                hashMap17.put(4L, "4th quarter");
                hashMap15.put(textStyle3, hashMap17);
                obj = e(hashMap15);
            } else {
                obj = "";
            }
        }
        this.c.putIfAbsent(simpleImmutableEntry, obj);
        return this.c.get(simpleImmutableEntry);
    }

    @Override // org.threeten.bp.format.f
    public String b(f fVar, long j, TextStyle textStyle, Locale locale) {
        Object f = f(fVar, locale);
        if (f instanceof b) {
            return ((b) f).a(j, textStyle);
        }
        return null;
    }

    @Override // org.threeten.bp.format.f
    public Iterator<Map.Entry<String, Long>> c(f fVar, TextStyle textStyle, Locale locale) {
        Object f = f(fVar, locale);
        if (f instanceof b) {
            return ((b) f).b(textStyle);
        }
        return null;
    }
}
