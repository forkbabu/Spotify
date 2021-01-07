package com.spotify.music.features.podcast.entity;

import java.util.regex.Pattern;
import kotlin.jvm.internal.h;
import kotlin.text.e;

public final class n {
    private final Pattern a = Pattern.compile("spotify:show:[a-zA-Z0-9]{22}:episode:[a-zA-Z0-9]{22}");

    public String a(String str) {
        h.e(str, "jointUri");
        if (this.a.matcher(str).matches()) {
            StringBuilder V0 = je.V0("spotify:episode:");
            V0.append(e.z(str, "episode:", null, 2, null));
            return V0.toString();
        }
        throw new IllegalArgumentException(je.x0("Invalid uri passed: ", str));
    }

    public String b(String str) {
        h.e(str, "jointUri");
        if (this.a.matcher(str).matches()) {
            je.x(str, "$this$substringBefore", ":episode", "delimiter", str, "missingDelimiterValue");
            int l = e.l(str, ":episode", 0, false, 6, null);
            if (l == -1) {
                return str;
            }
            String substring = str.substring(0, l);
            h.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(je.x0("Invalid uri passed: ", str));
    }
}
