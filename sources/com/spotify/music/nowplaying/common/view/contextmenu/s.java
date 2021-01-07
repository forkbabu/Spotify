package com.spotify.music.nowplaying.common.view.contextmenu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.common.collect.ImmutableList;
import com.spotify.android.glue.patterns.contextmenu.model.c;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import com.spotify.player.options.RepeatMode;
import com.spotify.player.options.d;
import com.spotify.rxjava2.q;
import io.reactivex.a;
import io.reactivex.g;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.Collection;

public class s {
    private final Context a;
    private final g<PlayerState> b;
    private final d c;
    private final mqd d;
    private final q e;

    public s(Context context, g<PlayerState> gVar, d dVar, mqd mqd, q qVar) {
        this.a = context;
        this.b = gVar;
        this.c = dVar;
        this.d = mqd;
        this.e = qVar;
    }

    public static a b(s sVar, PlayerState playerState) {
        sVar.getClass();
        RepeatMode d2 = bqd.d(bqd.b(playerState), playerState.restrictions());
        sVar.d.i(d2);
        z<zwd> repeatMode = sVar.c.setRepeatMode(d2);
        repeatMode.getClass();
        return new i(repeatMode);
    }

    public ImmutableList<Drawable> a(PlayerState playerState) {
        RepeatMode b2 = bqd.b(playerState);
        if (!bqd.c(playerState.restrictions())) {
            return ImmutableList.of(com.spotify.nowplaying.ui.components.repeat.g.a(this.a, b2));
        }
        Restrictions restrictions = playerState.restrictions();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(com.spotify.nowplaying.ui.components.repeat.g.a(this.a, b2));
        for (RepeatMode d2 = bqd.d(b2, restrictions); d2 != b2; d2 = bqd.d(d2, restrictions)) {
            arrayList.add(com.spotify.nowplaying.ui.components.repeat.g.a(this.a, d2));
        }
        return ImmutableList.copyOf((Collection) arrayList);
    }

    public void c(c cVar) {
        this.e.a(this.b.E().t(new d(this)).subscribe());
    }
}
