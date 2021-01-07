package com.spotify.localization;

import android.content.Context;
import com.spotify.mobile.android.util.d0;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class SpotifyLocale {

    public enum Separator {
        UNDERSCORE("_"),
        DASH("-");
        
        private final String mSeparator;

        private Separator(String str) {
            this.mSeparator = str;
        }

        public String d() {
            return this.mSeparator;
        }
    }

    public static String a(Context context) {
        ArrayList arrayList = new ArrayList(2);
        Locale r = z42.r(context.getResources().getConfiguration());
        if (r != null) {
            arrayList.add(r);
        }
        Locale locale = Locale.US;
        if (!locale.equals(r)) {
            arrayList.add(locale);
        }
        List<Locale> subList = arrayList.subList(0, Math.min(arrayList.size(), Integer.MAX_VALUE));
        ArrayList arrayList2 = new ArrayList(3);
        StringBuilder sb = new StringBuilder(32);
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(locale);
        decimalFormat.applyPattern("#.##");
        double d = 1.0d;
        for (Locale locale2 : subList) {
            String a = b.a(locale2, Separator.DASH.d());
            sb.delete(0, sb.length());
            sb.append(a);
            if (subList.size() > 1) {
                sb.append(";q=");
                sb.append(decimalFormat.format(d));
            }
            arrayList2.add(sb.toString());
            double size = (double) subList.size();
            Double.isNaN(size);
            Double.isNaN(size);
            d -= d / size;
        }
        StringBuilder sb2 = new StringBuilder(32);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (sb2.length() != 0) {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        return d0.d(sb2.toString());
    }

    public static String b() {
        return a.a(Locale.getDefault());
    }

    public static String c() {
        return b.a(Locale.getDefault(), Separator.UNDERSCORE.d());
    }

    public static String d(Context context) {
        context.getClass();
        return b.a(z42.r(context.getResources().getConfiguration()), Separator.UNDERSCORE.d());
    }

    public static String e() {
        return b.b(Locale.getDefault());
    }

    public static String f(Context context) {
        context.getClass();
        return b.b(z42.r(context.getResources().getConfiguration()));
    }
}
