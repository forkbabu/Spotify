package defpackage;

import com.google.common.collect.ImmutableMap;
import java.util.Locale;

/* renamed from: dhf  reason: default package */
public final class dhf {
    private static final ImmutableMap<String, String> a = ImmutableMap.of("US", "https://www.spotify.com/us/legal/voice-controls", "MX", "https://www.spotify.com/mx/legal/voice-controls");

    public static String a(String str) {
        return a.getOrDefault(str.toUpperCase(Locale.US), "https://www.spotify.com/us/legal/voice-controls");
    }
}
