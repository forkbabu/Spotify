package com.spotify.music.nowplaying.common.view.contextmenu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.common.collect.ImmutableList;
import com.spotify.android.glue.patterns.contextmenu.model.c;
import com.spotify.player.model.PlayerState;
import com.spotify.player.options.d;
import com.spotify.rxjava2.q;
import io.reactivex.a;
import io.reactivex.g;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.z;

public class u {
    private final Context a;
    private final g<PlayerState> b;
    private final d c;
    private final nqd d;
    private final q e;

    public u(Context context, g<PlayerState> gVar, d dVar, nqd nqd, q qVar) {
        this.a = context;
        this.b = gVar;
        this.c = dVar;
        this.d = nqd;
        this.e = qVar;
    }

    public static a b(u uVar, PlayerState playerState) {
        uVar.getClass();
        boolean shufflingContext = playerState.options().shufflingContext();
        uVar.d.u(shufflingContext);
        z<zwd> a2 = uVar.c.a(!shufflingContext);
        a2.getClass();
        return new i(a2);
    }

    public ImmutableList<Drawable> a(PlayerState playerState) {
        if (playerState.options().shufflingContext()) {
            return ImmutableList.of(gqd.y(this.a), gqd.z(this.a));
        }
        return ImmutableList.of(gqd.z(this.a), gqd.y(this.a));
    }

    public void c(c cVar) {
        this.e.a(this.b.E().t(new f(this)).subscribe());
    }
}
