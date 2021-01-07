package com.spotify.music.features.california.feature;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import defpackage.mqe;
import io.reactivex.functions.l;
import io.reactivex.g;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class CaliforniaPresenter {
    private final q a;
    private m b = new m(false, false, 3);
    private final f c;
    private final g<PlayerState> d;
    private final ere e;
    private final d f;
    private final i g;

    static final class a<T, R> implements l<PlayerState, String> {
        final /* synthetic */ CaliforniaPresenter a;

        a(CaliforniaPresenter californiaPresenter) {
            this.a = californiaPresenter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public String apply(PlayerState playerState) {
            String str;
            PlayerState playerState2 = playerState;
            h.e(playerState2, "state");
            this.a.getClass();
            Optional<ContextTrack> track = playerState2.track();
            h.d(track, "track()");
            if (track.isPresent()) {
                str = playerState2.track().get().metadata().get("title");
            } else {
                str = playerState2.contextUri();
            }
            StringBuilder S0 = je.S0(':');
            S0.append(playerState2.isPlaying());
            S0.append(':');
            S0.append(playerState2.isPaused());
            String sb = S0.toString();
            return str + ((Object) sb);
        }
    }

    static final class b<T> implements io.reactivex.functions.g<PlayerState> {
        final /* synthetic */ CaliforniaPresenter a;

        b(CaliforniaPresenter californiaPresenter) {
            this.a = californiaPresenter;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(PlayerState playerState) {
            PlayerState playerState2 = playerState;
            CaliforniaPresenter californiaPresenter = this.a;
            h.d(playerState2, "it");
            CaliforniaPresenter.d(californiaPresenter, playerState2);
        }
    }

    public CaliforniaPresenter(f fVar, g<PlayerState> gVar, ere ere, d dVar, i iVar, String str) {
        h.e(fVar, "args");
        h.e(gVar, "playerStateFlowable");
        h.e(ere, "userBehaviourEventLogger");
        h.e(dVar, "playerControls");
        h.e(iVar, "viewBinder");
        h.e(str, "employeeFlag");
        this.c = fVar;
        this.d = gVar;
        this.e = ere;
        this.f = dVar;
        this.g = iVar;
        q qVar = new q();
        this.a = qVar;
        mqe.b e2 = mqe.e();
        e2.e(rqe.i);
        ere.a(e2.c());
        iVar.a(fVar.a(), h.a(str, "1"));
        iVar.b(new cmf<f>(this) {
            /* class com.spotify.music.features.california.feature.CaliforniaPresenter.AnonymousClass1 */
            final /* synthetic */ CaliforniaPresenter this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // defpackage.cmf
            public f invoke() {
                c cVar;
                m mVar = this.this$0.b;
                if (mVar.b()) {
                    q qVar = this.this$0.a;
                    d dVar = this.this$0.f;
                    if (mVar.a()) {
                        cVar = c.e();
                    } else {
                        cVar = c.c();
                    }
                    qVar.a(dVar.a(cVar).subscribe());
                }
                return f.a;
            }
        });
        qVar.a(gVar.u(new a(this)).Q(io.reactivex.android.schedulers.a.b()).subscribe(new b(this)));
    }

    public static final void d(CaliforniaPresenter californiaPresenter, PlayerState playerState) {
        String str;
        String str2;
        String str3;
        ContextTrack contextTrack;
        californiaPresenter.getClass();
        Optional<ContextTrack> track = playerState.track();
        h.d(track, "it");
        String str4 = null;
        if (!track.isPresent()) {
            track = null;
        }
        ImmutableMap<String, String> metadata = (track == null || (contextTrack = track.get()) == null) ? null : contextTrack.metadata();
        if (metadata != null && (str3 = metadata.get("title")) != null) {
            str4 = str3;
        } else if (metadata != null) {
            str4 = metadata.get("album_title");
        }
        if (str4 == null) {
            str4 = "No track playing";
        }
        h.d(str4, "metadata?.get(ContextTra…    ?: \"No track playing\"");
        String str5 = "";
        if (metadata == null || (str = metadata.get("artist_name")) == null) {
            str = str5;
        }
        h.d(str, "metadata?.get(ContextTra…T_NAME)\n            ?: \"\"");
        if (!(metadata == null || (str2 = metadata.get("image_url")) == null)) {
            str5 = str2;
        }
        h.d(str5, "metadata?.get(ContextTra…GE_URL)\n            ?: \"\"");
        m mVar = new m(playerState.isPlaying(), playerState.isPaused());
        californiaPresenter.b = mVar;
        californiaPresenter.g.c(str4, str, str5, mVar);
    }

    public final void e() {
        this.a.c();
    }
}
