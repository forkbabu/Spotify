package com.spotify.mobile.android.hubframework.defaults.components.glue;

public final class t {
    private static final p81 a = z81.a().b("hubs:glue:muted", true).d();
    private static final p81 b = z81.a().b("hubs:glue:muted", false).d();
    public static final /* synthetic */ int c = 0;

    public static p81 a(boolean z) {
        return z ? a : b;
    }

    public static boolean b(s81 s81) {
        return s81.custom().boolValue("hubs:glue:muted", false);
    }
}
