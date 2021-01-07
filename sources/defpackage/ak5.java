package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import defpackage.o1e;
import io.reactivex.y;

/* renamed from: ak5  reason: default package */
public final class ak5 implements fjf<o1e<RecentlyPlayedItems>> {
    private final wlf<y> a;

    public ak5(wlf<y> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o1e.b(new RecentlyPlayedItems(0, true, ImmutableList.of()), this.a.get()).a();
    }
}
