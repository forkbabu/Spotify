package com.spotify.music.libs.branchintegration.network;

import com.google.common.base.Optional;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.s;
import io.reactivex.subjects.a;
import io.reactivex.z;

public class d implements m3a {
    private static final SpSharedPreferences.b<Object, String> f = SpSharedPreferences.b.c("branch_feature_flag_cache_key");
    private static final SpSharedPreferences.b<Object, String> g = SpSharedPreferences.b.c("branch_feature_flag_cache_time_key");
    private final c a;
    private Optional<Boolean> b;
    private final SpSharedPreferences<Object> c;
    private final aqe d;
    private final a<Boolean> e = a.h1();

    public d(c cVar, SpSharedPreferences<Object> spSharedPreferences, aqe aqe) {
        this.a = cVar;
        this.b = Optional.absent();
        this.c = spSharedPreferences;
        this.d = aqe;
    }

    public static void b(d dVar, Boolean bool) {
        dVar.e.onNext(bool);
    }

    @Override // defpackage.m3a
    public s a() {
        return this.e;
    }

    public Boolean c(BranchFlag branchFlag) {
        this.b = Optional.of(branchFlag.branchEnabledAndroid());
        this.c.b().f(f, this.b.get().toString());
        SpSharedPreferences.a<Object> b2 = this.c.b();
        SpSharedPreferences.b<Object, String> bVar = g;
        this.d.getClass();
        b2.f(bVar, Long.toString(System.currentTimeMillis()));
        return this.b.get();
    }

    @Override // defpackage.m3a
    public z<Boolean> isEnabled() {
        String m = this.c.m(f, "true");
        String m2 = this.c.m(g, null);
        this.d.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (m2 != null && currentTimeMillis - Long.getLong(m2).longValue() <= 300000) {
            return z.z(Boolean.valueOf(Boolean.getBoolean(m)));
        }
        if (this.b.isPresent()) {
            return z.z(this.b.get());
        }
        return this.a.a().A(new a(this)).j(new b(this)).F((R) Boolean.valueOf(Boolean.getBoolean("true")));
    }
}
