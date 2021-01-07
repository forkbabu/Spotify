package defpackage;

import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import io.reactivex.s;

/* renamed from: hl5  reason: default package */
public class hl5 {
    protected final li5 a;
    protected final pf5 b;
    protected final s<RecentlyPlayedItems> c;

    public hl5(pf5 pf5, s<RecentlyPlayedItems> sVar, li5 li5) {
        this.b = pf5;
        this.c = sVar;
        this.a = li5;
    }

    public s<b91> a() {
        return s.n(this.b.b(), this.c, this.a).N(al5.a);
    }

    public s<b91> b() {
        return s.n(this.b.a(), this.c, this.a).N(al5.a);
    }
}
