package defpackage;

import com.spotify.mobile.android.recentlyplayed.a;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;

/* renamed from: xi2  reason: default package */
public final class xi2 implements fjf<g<RecentlyPlayedItems>> {
    private final wlf<a> a;

    public xi2(wlf<a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().b().Y0(BackpressureStrategy.LATEST);
    }
}
