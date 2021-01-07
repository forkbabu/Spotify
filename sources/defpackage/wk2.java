package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.behindthelyrics.model.business.TracksAndResources;
import io.reactivex.a;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;

/* renamed from: wk2  reason: default package */
public class wk2 implements vk2 {
    private static final SpSharedPreferences.b<Object, Long> d = SpSharedPreferences.b.e("btl_last_cached_key");
    private static final long e = TimeUnit.HOURS.toMillis(8);
    private final yk2 a;
    private final SpSharedPreferences<Object> b;
    private final cqe c;

    public wk2(yk2 yk2, SpSharedPreferences<Object> spSharedPreferences, cqe cqe) {
        this.a = yk2;
        this.b = spSharedPreferences;
        this.c = cqe;
    }

    @Override // defpackage.yk2
    public boolean a(String str) {
        return this.a.a(str);
    }

    @Override // defpackage.yk2
    public a b(TracksAndResources tracksAndResources) {
        return this.a.b(tracksAndResources).d(a.u(new tk2(this)));
    }

    @Override // defpackage.vk2
    public boolean c() {
        long j = this.b.j(d, -1);
        if (j >= 0 && this.c.d() - j < e) {
            return false;
        }
        return true;
    }

    public /* synthetic */ void d() {
        SpSharedPreferences.a<Object> b2 = this.b.b();
        b2.e(d, this.c.d());
        b2.i();
    }

    @Override // defpackage.yk2
    public z<TracksAndResources> read() {
        return this.a.read();
    }
}
