package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.player.controls.d;
import com.spotify.player.extras.transformers.PlayerStateTransformers;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import com.spotify.player.play.f;
import io.reactivex.functions.c;
import io.reactivex.g;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* renamed from: a45  reason: default package */
public final class a45 implements x35 {
    private final d a;
    private final g<PlayerState> b;
    private final f c;

    /* renamed from: a45$a */
    static final class a<T1, T2, R> implements c<Boolean, ContextTrack, c35> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // io.reactivex.functions.c
        public c35 a(Boolean bool, ContextTrack contextTrack) {
            boolean booleanValue = bool.booleanValue();
            ContextTrack contextTrack2 = contextTrack;
            h.e(contextTrack2, "contextTrack");
            return new c35(contextTrack2.uri(), contextTrack2.metadata().get("album_uri"), booleanValue);
        }
    }

    /* renamed from: a45$b */
    static final class b<T1, T2> implements io.reactivex.functions.d<c35, c35> {
        public static final b a = new b();

        b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // io.reactivex.functions.d
        public boolean a(c35 c35, c35 c352) {
            c35 c353 = c35;
            c35 c354 = c352;
            h.e(c353, "oldState");
            h.e(c354, "newState");
            return h.a(c353, c354);
        }
    }

    public a45(d dVar, g<PlayerState> gVar, f fVar) {
        h.e(dVar, "playerControls");
        h.e(gVar, "playerState");
        h.e(fVar, "player");
        this.a = dVar;
        this.b = gVar;
        this.c = fVar;
    }

    @Override // defpackage.x35
    public io.reactivex.a a() {
        z<zwd> a2 = this.a.a(com.spotify.player.controls.c.c());
        a2.getClass();
        i iVar = new i(a2);
        h.d(iVar, "playerControls.execute(P….pause()).ignoreElement()");
        return iVar;
    }

    @Override // defpackage.x35
    public io.reactivex.a b() {
        z<zwd> a2 = this.a.a(com.spotify.player.controls.c.e());
        a2.getClass();
        i iVar = new i(a2);
        h.d(iVar, "playerControls.execute(P…resume()).ignoreElement()");
        return iVar;
    }

    @Override // defpackage.x35
    public s<c35> c() {
        g<R> l = this.b.l(PlayerStateTransformers.e());
        g<R> O = this.b.l(PlayerStateTransformers.b()).C(y35.a).O(z35.a);
        h.d(O, "playerState\n            …        .map { it.get() }");
        v vVar = new v(g.i(l, O, a.a).t(b.a));
        h.d(vVar, "Flowable.combineLatest(\n…          .toObservable()");
        return vVar;
    }

    @Override // defpackage.x35
    public io.reactivex.a d(String str, String str2) {
        h.e(str, "entityUri");
        h.e(str2, "trackUri");
        Context fromUri = Context.fromUri(str);
        PreparePlayOptions build = PreparePlayOptions.builder().skipTo(SkipToTrack.fromUri(str2)).build();
        ifd ifd = kfd.d0;
        h.d(ifd, "FeatureIdentifiers.FOLLOW_FEED");
        z<zwd> a2 = this.c.a(PlayCommand.builder(fromUri, PlayOrigin.builder(ifd.getName()).referrerIdentifier("followfeed").viewUri(ViewUris.e.toString()).build()).options(build).build());
        a2.getClass();
        i iVar = new i(a2);
        h.d(iVar, "player.play(playerCommand).ignoreElement()");
        return iVar;
    }
}
