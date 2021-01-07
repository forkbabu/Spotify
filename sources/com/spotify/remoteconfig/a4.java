package com.spotify.remoteconfig;

import com.spotify.remoteconfig.se;

public final /* synthetic */ class a4 implements o0e {
    public static final /* synthetic */ a4 a = new a4();

    private /* synthetic */ a4() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-lib-follow-feed", "enable_follow_feed", false);
        int c = p0e.c("android-lib-follow-feed", "follow_feed_outer_badge_cache_ttl_secs", 0, 86400, 900);
        se.b bVar = new se.b();
        bVar.b(false);
        bVar.c(900);
        bVar.b(a2);
        bVar.c(c);
        i7 a3 = bVar.a();
        if (a3.b() >= 0 && a3.b() <= 86400) {
            return a3;
        }
        throw new IllegalArgumentException("Value for followFeedOuterBadgeCacheTtlSecs() out of bounds");
    }
}
