package com.facebook.internal;

import com.facebook.k;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public final class d0 {
    public static final Collection<String> a = Collections.unmodifiableCollection(Arrays.asList("service_disabled", "AndroidAuthKillSwitchException"));
    public static final Collection<String> b = Collections.unmodifiableCollection(Arrays.asList("access_denied", "OAuthAccessDeniedException"));

    public static final String a() {
        return String.format("m.%s", k.m());
    }

    public static final String b() {
        return String.format("https://graph.%s", k.o());
    }
}
