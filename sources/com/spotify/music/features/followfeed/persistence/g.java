package com.spotify.music.features.followfeed.persistence;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

public final class g implements m {
    private static final SpSharedPreferences.b<Object, Boolean> d;
    private static final SpSharedPreferences.b<Object, Long> e;
    private static final SpSharedPreferences.b<Object, String> f;
    private final long a;
    private final SpSharedPreferences<Object> b;
    private final cqe c;

    static {
        SpSharedPreferences.b<Object, Boolean> e2 = SpSharedPreferences.b.e("ff_has_new_items_key");
        h.d(e2, "PrefsKey.makeUserKey(\"ff_has_new_items_key\")");
        d = e2;
        SpSharedPreferences.b<Object, Long> e3 = SpSharedPreferences.b.e("ff_has_new_items_last_cached_key");
        h.d(e3, "PrefsKey.makeUserKey(\"ff…w_items_last_cached_key\")");
        e = e3;
        SpSharedPreferences.b<Object, String> e4 = SpSharedPreferences.b.e("ff_newest_item_viewed_id_key");
        h.d(e4, "PrefsKey.makeUserKey(\"ff…west_item_viewed_id_key\")");
        f = e4;
    }

    public g(SpSharedPreferences<Object> spSharedPreferences, cqe cqe, int i) {
        h.e(spSharedPreferences, "sharedPreferences");
        h.e(cqe, "clock");
        this.b = spSharedPreferences;
        this.c = cqe;
        this.a = TimeUnit.SECONDS.toMillis((long) i);
    }

    @Override // com.spotify.music.features.followfeed.persistence.m
    public String a() {
        return this.b.m(f, null);
    }

    @Override // com.spotify.music.features.followfeed.persistence.m
    public Boolean b() {
        if (this.c.d() - this.b.j(e, 0) > this.a) {
            return null;
        }
        return Boolean.valueOf(this.b.d(d, false));
    }

    @Override // com.spotify.music.features.followfeed.persistence.m
    public void c(String str) {
        h.e(str, "newestItemViewedId");
        SpSharedPreferences.a<Object> b2 = this.b.b();
        b2.f(f, str);
        b2.i();
    }

    @Override // com.spotify.music.features.followfeed.persistence.m
    public void d(boolean z) {
        SpSharedPreferences.a<Object> b2 = this.b.b();
        b2.a(d, z);
        b2.e(e, this.c.d());
        b2.i();
    }
}
