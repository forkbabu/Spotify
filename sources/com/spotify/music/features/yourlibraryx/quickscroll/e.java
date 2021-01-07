package com.spotify.music.features.yourlibraryx.quickscroll;

import com.spotify.localization.SpotifyLocale;
import com.spotify.music.yourlibrary.quickscroll.a0;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.text.Regex;

public final class e implements a0 {
    private static final a c = new a();
    public static final b f = new b(null);
    private final DateFormat a;
    private final ajf<f> b;

    public static final class a extends ThreadLocal<DateFormat> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.lang.ThreadLocal
        public DateFormat initialValue() {
            return new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
        }
    }

    public static final class b {
        public b(f fVar) {
        }
    }

    public e(ajf<f> ajf) {
        Locale locale;
        h.e(ajf, "rawLabelProvider");
        this.b = ajf;
        String c2 = SpotifyLocale.c();
        h.d(c2, "SpotifyLocale.getDefault()");
        String d = SpotifyLocale.Separator.UNDERSCORE.d();
        h.d(d, "SpotifyLocale.Separator.UNDERSCORE.value");
        Object[] array = new Regex(d).c(c2, 0).toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            if (strArr.length > 1) {
                locale = new Locale(strArr[0], strArr[1]);
            } else {
                locale = new Locale(strArr[0]);
            }
            this.a = new SimpleDateFormat("MMM yyyy", locale);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override // com.spotify.music.yourlibrary.quickscroll.a0
    public String a(int i) {
        String q = this.b.get().q(i);
        if (q != null) {
            String str = null;
            if (q.length() >= 2) {
                String substring = q.substring(0, 2);
                h.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                int hashCode = substring.hashCode();
                if (hashCode != 2166) {
                    if (hashCode == 2631 && substring.equals("S:")) {
                        str = q.substring(2);
                        h.d(str, "(this as java.lang.String).substring(startIndex)");
                    }
                } else if (substring.equals("D:")) {
                    String substring2 = q.substring(2);
                    h.d(substring2, "(this as java.lang.String).substring(startIndex)");
                    DateFormat dateFormat = (DateFormat) c.get();
                    Date parse = dateFormat != null ? dateFormat.parse(substring2) : null;
                    if (parse != null) {
                        str = this.a.format(parse);
                    }
                }
            }
            if (str != null) {
                return str;
            }
        }
        return "";
    }
}
