package com.spotify.mobile.android.util;

import com.google.common.base.Charsets;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.Normalizer;
import java.util.Locale;

public final class d0 {
    private static final char[] a = {' ', 'K', 'M', 'B'};

    public static String a(String str, Locale locale) {
        if (str.length() <= 1) {
            return str.toUpperCase(locale);
        }
        return str.substring(0, 1).toUpperCase(locale) + str.substring(1);
    }

    public static String b(String str, Locale locale) {
        StringBuilder sb = new StringBuilder(str.toLowerCase(locale));
        int length = sb.length();
        boolean z = true;
        for (int i = 0; i < length; i++) {
            char charAt = sb.charAt(i);
            if (charAt == ' ') {
                z = true;
            } else if (z) {
                sb.replace(i, i + 1, String.valueOf(charAt).toUpperCase(locale));
                z = false;
            }
        }
        return sb.toString();
    }

    public static String c(String str, String str2) {
        int i = 0;
        Integer num = 0;
        Integer valueOf = Integer.valueOf(str.length() % 2);
        if (num == null) {
            if (valueOf != null) {
                Assertion.p("The two objects(null, " + valueOf + ") are not equal.");
            }
        } else if (!num.equals(valueOf)) {
            Assertion.p("The two objects(" + num + ", " + valueOf + ") are not equal.");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (i < str.length()) {
            int i2 = i + 2;
            byteArrayOutputStream.write(Integer.parseInt(str2.substring(i, i2), 16) ^ Integer.parseInt(str.substring(i, i2), 16));
            i = i2;
        }
        return new String(byteArrayOutputStream.toByteArray(), Charsets.UTF_16);
    }

    public static String d(String str) {
        try {
            return Normalizer.normalize(str, Normalizer.Form.NFKD).replaceAll("[^\\x20-\\x7E]", "");
        } catch (AssertionError e) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException unused) {
            }
            try {
                String normalize = Normalizer.normalize(str, Normalizer.Form.NFKD);
                Assertion.g("normalize worked after sleeping");
                return normalize.replaceAll("[^\\x20-\\x7E]", "");
            } catch (AssertionError unused2) {
                Class<?> cls = Class.forName("libcore.icu.NativeNormalizer$1");
                Field declaredField = cls.getDeclaredField("$SwitchMap$java$text$Normalizer$Form");
                declaredField.setAccessible(true);
                int[] iArr = (int[]) declaredField.get(cls);
                throw new RuntimeException(String.format("switchmap overwritten? 0x%08x,0x%08x,0x%08x,0x%08x", Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]), Integer.valueOf(iArr[2]), Integer.valueOf(iArr[3])), e);
            } catch (ClassNotFoundException e2) {
                throw new AssertionError(e2);
            } catch (NoSuchFieldException e3) {
                throw new AssertionError(e3);
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            }
        }
    }

    public static String e(int i, Locale locale) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(locale);
        if (i < 10000) {
            return new DecimalFormat("#,###", decimalFormatSymbols).format((long) i);
        }
        double d = (double) i;
        int floor = (int) Math.floor(Math.log10(d));
        int i2 = floor / 3;
        if (floor >= 3) {
            char[] cArr = a;
            if (i2 < cArr.length) {
                StringBuilder sb = new StringBuilder();
                DecimalFormat decimalFormat = new DecimalFormat("##.#", decimalFormatSymbols);
                double pow = Math.pow(10.0d, (double) (i2 * 3));
                Double.isNaN(d);
                sb.append(decimalFormat.format(d / pow));
                sb.append(cArr[i2]);
                return sb.toString();
            }
        }
        return new DecimalFormat("#,###", decimalFormatSymbols).format((long) i);
    }
}
