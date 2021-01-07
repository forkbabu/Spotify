package com.spotify.localization;

import com.google.common.collect.ImmutableMap;
import java.util.Locale;

/* access modifiers changed from: package-private */
public final class b {
    private static final ImmutableMap<String, String> a;
    private static final ImmutableMap<String, String> b;
    private static final ImmutableMap<String, String> c;

    static {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put("es_ES", "es");
        builder.mo51put("fr_CA", "fr-ca");
        builder.mo51put("pt_PT", "pt-pt");
        a = builder.build();
        ImmutableMap.Builder builder2 = ImmutableMap.builder();
        builder2.mo51put("es", "es-419");
        builder2.mo51put("pt", "pt-br");
        builder2.mo51put("zh", "zh-tw");
        b = builder2.build();
        ImmutableMap.Builder builder3 = ImmutableMap.builder();
        builder3.mo51put("in", "id");
        builder3.mo51put("ji", "yi");
        builder3.mo51put("iw", "he");
        c = builder3.build();
    }

    static String a(Locale locale, String str) {
        boolean z;
        String str2 = "en";
        if (c(locale != null ? locale.getLanguage() : str2)) {
            z = true;
        } else {
            str2 = b(locale);
            z = false;
        }
        if (a.containsValue(str2) || b.containsValue(str2) || locale == null || z || locale.getCountry().isEmpty()) {
            return str2;
        }
        StringBuilder V0 = je.V0(str2);
        if (str.isEmpty()) {
            str = "_";
        }
        V0.append(str);
        V0.append(locale.getCountry());
        return V0.toString();
    }

    static String b(Locale locale) {
        if (locale == null) {
            return "en";
        }
        String locale2 = locale.toString();
        if (locale2.length() < 2) {
            return "en";
        }
        String str = a.get(locale2);
        if (str != null) {
            return str;
        }
        String language = locale.getLanguage();
        if (c(language)) {
            return "en";
        }
        String str2 = b.get(language);
        if (str2 != null) {
            return str2;
        }
        String str3 = c.get(language);
        return str3 != null ? str3 : language;
    }

    private static boolean c(String str) {
        if (str.length() < 2 || str.charAt(0) < 'a' || str.charAt(0) > 'z' || str.charAt(1) < 'a' || str.charAt(1) > 'z') {
            return true;
        }
        return false;
    }
}
