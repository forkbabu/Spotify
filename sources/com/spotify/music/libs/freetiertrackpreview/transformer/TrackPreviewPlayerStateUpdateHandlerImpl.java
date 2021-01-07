package com.spotify.music.libs.freetiertrackpreview.transformer;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.google.common.base.Optional;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.music.preview.v;
import com.spotify.music.preview.z;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.remoteconfig.f8;
import com.spotify.rxjava2.q;
import io.reactivex.functions.g;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;

public final class TrackPreviewPlayerStateUpdateHandlerImpl implements g {
    private final q a;
    private String b = "";
    private String c = "";
    private b91 d;
    private final com.spotify.music.libs.freetiertrackpreview.logging.a e;
    private final nfa f;

    static final class a<T> implements g<z> {
        final /* synthetic */ TrackPreviewPlayerStateUpdateHandlerImpl a;

        a(TrackPreviewPlayerStateUpdateHandlerImpl trackPreviewPlayerStateUpdateHandlerImpl) {
            this.a = trackPreviewPlayerStateUpdateHandlerImpl;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(z zVar) {
            z zVar2 = zVar;
            TrackPreviewPlayerStateUpdateHandlerImpl trackPreviewPlayerStateUpdateHandlerImpl = this.a;
            h.d(zVar2, "previewPlayerState");
            TrackPreviewPlayerStateUpdateHandlerImpl.e(trackPreviewPlayerStateUpdateHandlerImpl, zVar2);
        }
    }

    static final class b<T> implements g<PlayerState> {
        final /* synthetic */ TrackPreviewPlayerStateUpdateHandlerImpl a;

        b(TrackPreviewPlayerStateUpdateHandlerImpl trackPreviewPlayerStateUpdateHandlerImpl) {
            this.a = trackPreviewPlayerStateUpdateHandlerImpl;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(PlayerState playerState) {
            PlayerState playerState2 = playerState;
            TrackPreviewPlayerStateUpdateHandlerImpl trackPreviewPlayerStateUpdateHandlerImpl = this.a;
            h.d(playerState2, "playerState");
            TrackPreviewPlayerStateUpdateHandlerImpl.b(trackPreviewPlayerStateUpdateHandlerImpl, playerState2);
        }
    }

    public TrackPreviewPlayerStateUpdateHandlerImpl(com.spotify.music.libs.freetiertrackpreview.logging.a aVar, nfa nfa, f8 f8Var, v vVar, io.reactivex.g<PlayerState> gVar, n nVar) {
        h.e(aVar, "trackPreviewEventLogger");
        h.e(nfa, "trackPreviewAutoPlayHelper");
        h.e(f8Var, "trackPreviewProperties");
        h.e(vVar, "previewPlayer");
        h.e(gVar, "playerStateFlowable");
        h.e(nVar, "lifecycleOwner");
        this.e = aVar;
        this.f = nfa;
        q qVar = new q();
        this.a = qVar;
        if (f8Var.b()) {
            qVar.a(vVar.g().C0(1).E().subscribe(new a(this)));
            qVar.a(new io.reactivex.internal.operators.observable.v(gVar).E().subscribe(new b(this)));
        }
        nVar.A().a(new m(this) {
            /* class com.spotify.music.libs.freetiertrackpreview.transformer.TrackPreviewPlayerStateUpdateHandlerImpl.AnonymousClass3 */
            final /* synthetic */ TrackPreviewPlayerStateUpdateHandlerImpl a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.a = r1;
            }

            @w(Lifecycle.Event.ON_DESTROY)
            public final void onStop() {
                this.a.a.c();
                this.a.f.clear();
            }
        });
    }

    public static final void b(TrackPreviewPlayerStateUpdateHandlerImpl trackPreviewPlayerStateUpdateHandlerImpl, PlayerState playerState) {
        trackPreviewPlayerStateUpdateHandlerImpl.getClass();
        Optional<ContextTrack> track = playerState.track();
        h.d(track, "playerState.track()");
        if (track.isPresent()) {
            String uri = playerState.track().get().uri();
            h.d(uri, "track.uri()");
            trackPreviewPlayerStateUpdateHandlerImpl.b = uri;
        }
    }

    public static final void e(TrackPreviewPlayerStateUpdateHandlerImpl trackPreviewPlayerStateUpdateHandlerImpl, z zVar) {
        T t;
        String str;
        p81 metadata;
        T t2;
        List<? extends s81> children;
        T t3;
        trackPreviewPlayerStateUpdateHandlerImpl.getClass();
        if (zVar.e() && !zVar.d()) {
            String g = zVar.g();
            h.d(g, "previewPlayerState.previewId()");
            trackPreviewPlayerStateUpdateHandlerImpl.c = g;
            trackPreviewPlayerStateUpdateHandlerImpl.e.d(g);
        } else if (h.a(zVar, z.a)) {
            trackPreviewPlayerStateUpdateHandlerImpl.e.a(trackPreviewPlayerStateUpdateHandlerImpl.c);
        } else if (!zVar.b()) {
        } else {
            if (!trackPreviewPlayerStateUpdateHandlerImpl.f.a().isPlaying() || trackPreviewPlayerStateUpdateHandlerImpl.f.a().isPaused()) {
                b91 b91 = trackPreviewPlayerStateUpdateHandlerImpl.d;
                if (b91 != null) {
                    String id = HubsGlueComponent.SHUFFLE_BUTTON.id();
                    h.d(id, "HubsGlueComponent.SHUFFLE_BUTTON.id()");
                    s81 header = b91.header();
                    if (header == null || (children = header.children()) == null) {
                        t = null;
                    } else {
                        Iterator<T> it = children.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t3 = null;
                                break;
                            }
                            t3 = it.next();
                            if (je.C(t3, id)) {
                                break;
                            }
                        }
                        t = t3;
                    }
                    if (t == null) {
                        Iterator<T> it2 = ((s81) b91.body().get(0)).children().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                t2 = null;
                                break;
                            }
                            t2 = it2.next();
                            if (je.C(t2, id)) {
                                break;
                            }
                        }
                        t = t2;
                    }
                    if (t != null) {
                        trackPreviewPlayerStateUpdateHandlerImpl.f.d(t);
                    }
                    com.spotify.music.libs.freetiertrackpreview.logging.a aVar = trackPreviewPlayerStateUpdateHandlerImpl.e;
                    b91 b912 = trackPreviewPlayerStateUpdateHandlerImpl.d;
                    if (b912 != null) {
                        s81 header2 = b912.header();
                        if (header2 == null || (metadata = header2.metadata()) == null || (str = metadata.string("uri")) == null) {
                            str = "";
                        }
                        if (str.length() == 0) {
                            str = ((s81) b912.body().get(0)).metadata().string("uri", "");
                        }
                        aVar.c(str);
                        return;
                    }
                    h.k("viewHubsViewModel");
                    throw null;
                }
                return;
            }
            trackPreviewPlayerStateUpdateHandlerImpl.f.b();
            trackPreviewPlayerStateUpdateHandlerImpl.e.b(trackPreviewPlayerStateUpdateHandlerImpl.b);
        }
    }

    @Override // com.spotify.music.libs.freetiertrackpreview.transformer.g
    public void a(b91 b91) {
        h.e(b91, "hubsViewModel");
        this.d = b91;
    }
}
