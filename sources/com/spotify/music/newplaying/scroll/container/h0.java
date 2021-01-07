package com.spotify.music.newplaying.scroll.container;

import com.google.common.collect.ImmutableList;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import com.spotify.music.newplaying.scroll.a;
import com.spotify.player.model.PlayerState;
import io.reactivex.d0;
import io.reactivex.g;
import io.reactivex.internal.operators.flowable.FlowableFromIterable;
import io.reactivex.internal.operators.flowable.FlowableLimit;
import io.reactivex.internal.operators.flowable.b;
import io.reactivex.z;
import java.util.List;
import java.util.Map;

public class h0 {
    private final g<PlayerState> a;
    private final wlb b;
    private final g<com.spotify.music.connection.g> c;
    private final Map<NowPlayingWidget.Type, a> d;
    private final Map<NowPlayingWidget.Type, NowPlayingWidget> e;

    public h0(g<PlayerState> gVar, wlb wlb, g<com.spotify.music.connection.g> gVar2, Map<NowPlayingWidget.Type, a> map, Map<NowPlayingWidget.Type, NowPlayingWidget> map2) {
        this.a = gVar;
        this.b = wlb;
        this.c = gVar2;
        this.d = map;
        this.e = map2;
    }

    public static boolean a(h0 h0Var, NowPlayingWidget.Type type) {
        return h0Var.d.containsKey(type) && h0Var.e.containsKey(type);
    }

    public static g d(h0 h0Var, PlayerState playerState) {
        return h0Var.c.i0(c.a).O(f.a).g0(new u(h0Var, playerState));
    }

    public /* synthetic */ boolean b(PlayerState playerState, NowPlayingWidget.Type type) {
        return this.d.get(type).a(playerState);
    }

    public d0 c(PlayerState playerState, Boolean bool) {
        if (!bool.booleanValue()) {
            return z.z(ImmutableList.of());
        }
        List<NowPlayingWidget.Type> a2 = this.b.a();
        int i = g.b;
        if (a2 != null) {
            FlowableLimit flowableLimit = new FlowableLimit(new FlowableFromIterable(a2).C(new t(this)).C(new w(this, playerState)), 3);
            Map<NowPlayingWidget.Type, NowPlayingWidget> map = this.e;
            map.getClass();
            return new b(flowableLimit.O(new b(map)), d.a, e.a).A(a.a);
        }
        throw new NullPointerException("source is null");
    }

    public g<ImmutableList<NowPlayingWidget>> e() {
        return this.a.C(y.a).u(x.a).f0(new v(this));
    }
}
