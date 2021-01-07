package com.spotify.music.features.quicksilver.utils;

import com.spotify.http.w;
import com.spotify.libs.instrumentation.performance.ColdStartTracker;
import com.spotify.mobile.android.cosmos.player.v2.Player;

public final class h {
    public static void a(QuicksilverLoggerService quicksilverLoggerService, ColdStartTracker coldStartTracker) {
        quicksilverLoggerService.s = coldStartTracker;
    }

    public static void b(QuicksilverLoggerService quicksilverLoggerService, jz1 jz1) {
        quicksilverLoggerService.r = jz1;
    }

    public static void c(QuicksilverPlaybackService quicksilverPlaybackService, Player player) {
        quicksilverPlaybackService.a = player;
    }

    public static void d(QuicksilverLoggerService quicksilverLoggerService, w wVar) {
        quicksilverLoggerService.q = wVar;
    }
}
