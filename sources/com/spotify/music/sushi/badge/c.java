package com.spotify.music.sushi.badge;

import com.google.common.base.Optional;
import com.spotify.player.model.PlaybackQuality;
import io.reactivex.functions.g;
import kotlin.Pair;
import kotlin.jvm.internal.h;

final class c<T> implements g<Pair<? extends Optional<PlaybackQuality>, ? extends String>> {
    final /* synthetic */ SushiBadgePresenter a;

    c(SushiBadgePresenter sushiBadgePresenter) {
        this.a = sushiBadgePresenter;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Pair<? extends Optional<PlaybackQuality>, ? extends String> pair) {
        Pair<? extends Optional<PlaybackQuality>, ? extends String> pair2 = pair;
        Object c = pair2.c();
        h.d(c, "it.first");
        Optional optional = (Optional) c;
        Object d = pair2.d();
        h.d(d, "it.second");
        String str = (String) d;
        SushiBadgePresenter.d(this.a, (PlaybackQuality) optional.orNull());
        a b = SushiBadgePresenter.b(this.a);
        if (b != null) {
            b.render(SushiBadgePresenter.a(this.a, optional, str));
        }
    }
}
