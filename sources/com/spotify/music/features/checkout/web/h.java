package com.spotify.music.features.checkout.web;

import android.net.Uri;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

public final class h {
    private final String a = Locale.getDefault().toString();
    private final Map<String, String> b;

    public h() {
        HashMap hashMap = new HashMap(67);
        this.b = hashMap;
        hashMap.put("bg_BG", "bg");
        hashMap.put("ca_AD", "ad");
        hashMap.put("cs_CZ", "cz");
        hashMap.put("da_DK", "dk");
        hashMap.put("de_AT", "at");
        hashMap.put("de_CH", "ch");
        hashMap.put("de_DE", "de");
        hashMap.put("de_LI", "li");
        hashMap.put("de_LU", "lu-de");
        hashMap.put("el_GR", "gr");
        hashMap.put("en_AU", "au");
        hashMap.put("en_CA", "ca-en");
        hashMap.put("en_CY", "cy");
        hashMap.put("en_GB", "gb");
        hashMap.put("en_HK", "hk-en");
        hashMap.put("en_IE", "ie");
        hashMap.put("en_IN", "in");
        hashMap.put("en_MT", "mt");
        hashMap.put("en_MY", "my-ms");
        hashMap.put("en_NZ", "nz");
        hashMap.put("en_PH", "ph");
        hashMap.put("en_SG", "sg-eg");
        hashMap.put("en_TH", "th");
        hashMap.put("en_US", "us");
        hashMap.put("es_AR", "ar");
        hashMap.put("es_BO", "bo");
        hashMap.put("es_CL", "cl");
        hashMap.put("es_CO", "co");
        hashMap.put("es_CR", "cr");
        hashMap.put("es_DO", "do");
        hashMap.put("es_EC", "ec");
        hashMap.put("es_ES", "es");
        hashMap.put("es_GT", "gt");
        hashMap.put("es_HN", "hn");
        hashMap.put("es_MX", "mx");
        hashMap.put("es_NI", "ni");
        hashMap.put("es_PA", "pa");
        hashMap.put("es_PE", "pe");
        hashMap.put("es_PY", "py");
        hashMap.put("es_SV", "sv");
        hashMap.put("es_US", "es");
        hashMap.put("es_UY", "uy");
        hashMap.put("et_EE", "ee");
        hashMap.put("fi_FI", "fi");
        hashMap.put("fr_BE", "be-fr");
        hashMap.put("fr_CA", "ca-fr");
        hashMap.put("fr_FR", "fr");
        hashMap.put("fr_LU", "lu-fr");
        hashMap.put("fr_MC", "mc");
        hashMap.put("hu_HU", "hu");
        hashMap.put("in_ID", "id");
        hashMap.put("is_IS", "is");
        hashMap.put("it_IT", "it");
        hashMap.put("ja_JP", "jp");
        hashMap.put("lt_LT", "lt");
        hashMap.put("lv_LV", "lv");
        hashMap.put("my_MY", "my-ms");
        hashMap.put("nb_NO", "no");
        hashMap.put("nl_BE", "be-nl");
        hashMap.put("nl_NL", "nl");
        hashMap.put("nn_NO", "no");
        hashMap.put("pl_PL", "pl");
        hashMap.put("pt_BR", "br");
        hashMap.put("pt_PT", "pt");
        hashMap.put("sk_SK", "sk");
        hashMap.put("th_TH", "th");
        hashMap.put("sv_SE", "se");
        hashMap.put("tr_TR", "tr");
        hashMap.put("zh_HK", "hk-zh");
        hashMap.put("zh_TW", "tw");
    }

    public Uri a(Uri uri) {
        boolean z = false;
        if (uri.getHost().endsWith("spotify.com")) {
            Collection<String> values = this.b.values();
            Iterator<String> it = uri.getPathSegments().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (values.contains(it.next())) {
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
        }
        if (!z) {
            return uri;
        }
        String path = uri.getPath();
        String str = this.b.get(this.a);
        if (str == null) {
            str = "";
        }
        return uri.buildUpon().path(je.x0(str, path)).build();
    }
}
