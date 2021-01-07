package com.spotify.localization;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Locale;

/* access modifiers changed from: package-private */
public final class a {
    private static final ImmutableMap<String, String> a;
    private static final ImmutableList<String> b;

    static {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put("cz", "cs");
        builder.mo51put("es", "es-ES");
        builder.mo51put("br", "pt-BR");
        builder.mo51put("in", "id");
        builder.mo51put("se", "sv");
        builder.mo51put("th", "th-TH");
        builder.mo51put("vn", "vi-VN");
        builder.mo51put("vn-vi", "vi-VN");
        builder.mo51put("tw", "zh-TW");
        builder.mo51put("hk-zh", "zh-TW");
        a = builder.build();
        int i = ImmutableList.a;
        ImmutableList.Builder builder2 = new ImmutableList.Builder();
        builder2.mo53add((ImmutableList.Builder) "ar");
        builder2.mo53add((ImmutableList.Builder) "cs");
        builder2.mo53add((ImmutableList.Builder) "de");
        builder2.mo53add((ImmutableList.Builder) "el");
        builder2.mo53add((ImmutableList.Builder) "en");
        builder2.mo53add((ImmutableList.Builder) "es");
        builder2.mo53add((ImmutableList.Builder) "es-ES");
        builder2.mo53add((ImmutableList.Builder) "fi");
        builder2.mo53add((ImmutableList.Builder) "fr");
        builder2.mo53add((ImmutableList.Builder) "hu");
        builder2.mo53add((ImmutableList.Builder) "id");
        builder2.mo53add((ImmutableList.Builder) "it");
        builder2.mo53add((ImmutableList.Builder) "ja");
        builder2.mo53add((ImmutableList.Builder) "ms");
        builder2.mo53add((ImmutableList.Builder) "nl");
        builder2.mo53add((ImmutableList.Builder) "pl");
        builder2.mo53add((ImmutableList.Builder) "pt-BR");
        builder2.mo53add((ImmutableList.Builder) "sv");
        builder2.mo53add((ImmutableList.Builder) "th-TH");
        builder2.mo53add((ImmutableList.Builder) "tr");
        builder2.mo53add((ImmutableList.Builder) "vi-VN");
        builder2.mo53add((ImmutableList.Builder) "zh-TW");
        b = builder2.build();
    }

    static String a(Locale locale) {
        if (locale == null) {
            return "";
        }
        String language = locale.getLanguage();
        String str = a.get(language);
        if (str != null) {
            language = str;
        }
        if (b.contains(language)) {
            return language;
        }
        return "";
    }
}
