package com.spotify.music.nowplaying.podcast.mixedmedia.ui.contextmenu;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.player.v2.InterruptionUtil;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.nowplaying.common.view.contextmenu.n;
import com.spotify.music.nowplaying.common.view.contextmenu.o;
import com.spotify.music.nowplaying.common.view.contextmenu.p;
import com.spotify.music.nowplaying.common.view.contextmenu.r;
import com.spotify.music.nowplaying.common.view.share.c;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import io.reactivex.g;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class MixedMediaContextMenuButtonPresenter implements n.a {
    public static final a j = new a(null);
    private final q a = new q();
    private o b;
    private PlayerState c;
    private n d;
    private final g<PlayerState> e;
    private final g<o> f;
    private final p g;
    private final c h;
    private final lqd i;

    public static final class a {
        public a(f fVar) {
        }
    }

    public MixedMediaContextMenuButtonPresenter(g<PlayerState> gVar, g<o> gVar2, p pVar, c cVar, lqd lqd) {
        h.e(gVar, "playerStateFlowable");
        h.e(gVar2, "configurationFlowable");
        h.e(pVar, "contextMenuFragmentDelegate");
        h.e(cVar, "contextAwareSharingPredicate");
        h.e(lqd, "contextMenuButtonInteractionLogger");
        this.e = gVar;
        this.f = gVar2;
        this.g = pVar;
        this.h = cVar;
        this.i = lqd;
    }

    public static final void b(MixedMediaContextMenuButtonPresenter mixedMediaContextMenuButtonPresenter, o oVar) {
        mixedMediaContextMenuButtonPresenter.b = oVar;
    }

    public static final void c(MixedMediaContextMenuButtonPresenter mixedMediaContextMenuButtonPresenter, PlayerState playerState) {
        mixedMediaContextMenuButtonPresenter.getClass();
        ContextTrack contextTrack = playerState.track().get();
        n nVar = mixedMediaContextMenuButtonPresenter.d;
        if (nVar != null) {
            boolean z = true;
            nVar.setVisible(!InterruptionUtil.isInterruptionUri(contextTrack.uri()));
            n nVar2 = mixedMediaContextMenuButtonPresenter.d;
            if (nVar2 != null) {
                String uri = contextTrack.uri();
                h.d(uri, "track.uri()");
                l0 z2 = l0.z(uri);
                h.d(z2, "SpotifyLink.of(trackUri)");
                LinkType q = z2.q();
                if (!(q == LinkType.TRACK || q == LinkType.SHOW_EPISODE)) {
                    z = false;
                }
                nVar2.setEnabled(z);
                mixedMediaContextMenuButtonPresenter.c = playerState;
                return;
            }
            h.k("viewBinder");
            throw null;
        }
        h.k("viewBinder");
        throw null;
    }

    @Override // com.spotify.music.nowplaying.common.view.contextmenu.n.a
    public void a() {
        Optional<ContextTrack> track;
        ContextTrack orNull;
        ImmutableMap<String, String> metadata;
        this.i.r();
        PlayerState playerState = this.c;
        if (playerState != null) {
            ContextTrack contextTrack = playerState.track().get();
            PlayerState playerState2 = this.c;
            String str = (playerState2 == null || (track = playerState2.track()) == null || (orNull = track.orNull()) == null || (metadata = orNull.metadata()) == null) ? null : metadata.get(ContextTrack.Metadata.KEY_PARENT_EPISODE_URI);
            if (str == null) {
                str = contextTrack.uri();
            }
            r b2 = r.b(str, playerState.contextUri(), playerState);
            o oVar = this.b;
            if (oVar != null) {
                this.g.b(b2, oVar, this.h.apply(this.c));
            }
        }
    }

    public final void d(n nVar) {
        h.e(nVar, "viewBinder");
        this.d = nVar;
        nVar.setListener(this);
        this.a.a(this.e.subscribe(new a(new MixedMediaContextMenuButtonPresenter$onViewAvailable$1(this))));
        this.a.a(this.f.subscribe(new a(new MixedMediaContextMenuButtonPresenter$onViewAvailable$3(this))));
    }

    public final void e() {
        this.a.c();
    }
}
