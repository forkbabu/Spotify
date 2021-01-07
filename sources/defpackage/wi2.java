package defpackage;

import android.content.Context;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import io.reactivex.g;

/* renamed from: wi2  reason: default package */
public final class wi2 implements fjf<g<cj2>> {
    private final wlf<Context> a;
    private final wlf<g<RecentlyPlayedItems>> b;

    public wi2(wlf<Context> wlf, wlf<g<RecentlyPlayedItems>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.b.get().O(new ji2(this.a.get())).s().I(hi2.a);
    }
}
