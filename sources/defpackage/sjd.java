package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.storylines.model.StorylinesUris;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.a;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;

/* renamed from: sjd  reason: default package */
public class sjd {
    private static final SpSharedPreferences.b<Object, Long> d = SpSharedPreferences.b.e("storylines_last_cached_key");
    private static final long e = TimeUnit.HOURS.toMillis(4);
    private final rjd a;
    private final SpSharedPreferences<Object> b;
    private final cqe c;

    public sjd(rjd rjd, SpSharedPreferences<Object> spSharedPreferences, cqe cqe) {
        this.a = rjd;
        this.b = spSharedPreferences;
        this.c = cqe;
    }

    public boolean a(String str) {
        return this.a.a(str);
    }

    public z<Optional<StorylinesUris>> b() {
        if (this.c.d() - this.b.j(d, 0) >= e) {
            return z.z(Optional.absent());
        }
        return this.a.read();
    }

    public /* synthetic */ void c() {
        SpSharedPreferences.a<Object> b2 = this.b.b();
        b2.e(d, this.c.d());
        b2.i();
    }

    public a d(StorylinesUris storylinesUris) {
        return this.a.b(storylinesUris).d(a.u(new pjd(this)));
    }
}
