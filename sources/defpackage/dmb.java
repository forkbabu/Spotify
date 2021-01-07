package defpackage;

import android.content.res.Resources;
import com.google.common.collect.ImmutableList;
import com.spotify.music.C0707R;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import io.reactivex.g;

/* renamed from: dmb  reason: default package */
public final class dmb {
    private final g<ImmutableList<NowPlayingWidget>> a;
    private final eqd b = new eqd(0, 0);
    private final eqd c;

    public dmb(g<ImmutableList<NowPlayingWidget>> gVar, Resources resources) {
        this.a = gVar;
        this.c = new eqd(0, resources.getDimensionPixelSize(C0707R.dimen.peek_height));
    }

    public g<eqd> a() {
        return this.a.O(new cmb(this));
    }

    public /* synthetic */ eqd b(ImmutableList immutableList) {
        return immutableList.isEmpty() ? this.b : this.c;
    }
}
