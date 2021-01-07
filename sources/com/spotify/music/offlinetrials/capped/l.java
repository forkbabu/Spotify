package com.spotify.music.offlinetrials.capped;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import java.util.Calendar;

public class l {
    private static final SpSharedPreferences.b<Object, Long> c = SpSharedPreferences.b.e("offline_daily_cap_intro:has_been_exposed");
    public static final /* synthetic */ int d = 0;
    private final SpSharedPreferences<Object> a;
    private final cqe b;

    public l(SpSharedPreferences<Object> spSharedPreferences, cqe cqe) {
        this.a = spSharedPreferences;
        this.b = cqe;
    }

    public boolean a() {
        long j = this.a.j(c, 0);
        Calendar e = this.b.e();
        e.setTimeInMillis(j);
        Calendar e2 = this.b.e();
        if (e2.get(0) == e.get(0) && e2.get(1) == e.get(1) && e2.get(6) == e.get(6)) {
            return true;
        }
        return false;
    }

    public void b() {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.e(c, this.b.d());
        b2.i();
    }
}
