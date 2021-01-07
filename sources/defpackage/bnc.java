package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.player.controls.d;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.Suppressions;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import com.spotify.player.play.f;
import defpackage.enc;
import defpackage.jnc;
import defpackage.zwd;
import io.reactivex.d0;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.j;

/* renamed from: bnc  reason: default package */
public final class bnc implements fnc {
    private final f a;
    private final lxd b;
    private final d c;
    private final bre d;
    private final g<Boolean> e;
    private final g<Optional<String>> f;
    private final g<String> g;

    /* renamed from: bnc$a */
    static final class a<T1, T2, R> implements io.reactivex.functions.c<String, Boolean, Boolean> {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // io.reactivex.functions.c
        public Boolean a(String str, Boolean bool) {
            String str2 = str;
            Boolean bool2 = bool;
            h.e(str2, "currentEpisode");
            h.e(bool2, "isResumed");
            return Boolean.valueOf(h.a(str2, this.a) && bool2.booleanValue());
        }
    }

    /* renamed from: bnc$b */
    static final class b<T, R> implements l<zwd, jnc> {
        final /* synthetic */ bnc a;

        b(bnc bnc) {
            this.a = bnc;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public jnc apply(zwd zwd) {
            zwd zwd2 = zwd;
            h.e(zwd2, "it");
            return bnc.e(this.a, zwd2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bnc$c */
    public static final class c<T, R> implements l<Boolean, d0<? extends jnc>> {
        final /* synthetic */ bnc a;
        final /* synthetic */ String b;
        final /* synthetic */ Context c;
        final /* synthetic */ String f;

        c(bnc bnc, String str, Context context, String str2) {
            this.a = bnc;
            this.b = str;
            this.c = context;
            this.f = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends jnc> apply(Boolean bool) {
            Boolean bool2 = bool;
            h.e(bool2, "it");
            return bnc.d(this.a, bool2.booleanValue(), this.b, this.c, this.f);
        }
    }

    public bnc(f fVar, lxd lxd, d dVar, bre bre, g<Boolean> gVar, g<Optional<String>> gVar2, g<String> gVar3) {
        h.e(fVar, "player");
        h.e(lxd, "playCommandFactory");
        h.e(dVar, "playerControls");
        h.e(bre, "pageInstanceIdentifierProvider");
        h.e(gVar, "isResumedFlowable");
        h.e(gVar2, "currentTrackUriFlowable");
        h.e(gVar3, "contextUriFlowable");
        this.a = fVar;
        this.b = lxd;
        this.c = dVar;
        this.d = bre;
        this.e = gVar;
        this.f = gVar2;
        this.g = gVar3;
    }

    public static final z d(bnc bnc, boolean z, String str, Context context, String str2) {
        bnc.getClass();
        if (z) {
            h.e(str2, "interactionId");
            z<R> A = bnc.c.a(com.spotify.player.controls.c.f(ResumeCommand.builder().loggingParams(bnc.f(str2)).build())).A(new cnc(bnc));
            h.d(A, "playerControls.execute(\n…toPodcastPlayerResult() }");
            return A;
        }
        SkipToTrack build = SkipToTrack.builder().trackUri(str).build();
        PlayerOptionOverrides.Builder builder = PlayerOptionOverrides.builder();
        Boolean bool = Boolean.FALSE;
        z<R> A2 = bnc.a.a(bnc.b.a(context).loggingParams(bnc.f(str2)).options(PreparePlayOptions.builder().skipTo(build).suppressions(Suppressions.create(kotlin.collections.d.G("mft"))).playerOptionsOverride(builder.shufflingContext(bool).repeatingContext(bool).repeatingTrack(bool).build()).build()).build()).A(new zmc(bnc));
        h.d(A2, "player.play(playCommand)…toPodcastPlayerResult() }");
        return A2;
    }

    public static final jnc e(bnc bnc, zwd zwd) {
        bnc.getClass();
        if (zwd instanceof zwd.b) {
            return jnc.b.a;
        }
        if (zwd instanceof zwd.a) {
            String c2 = ((zwd.a) zwd).c();
            h.d(c2, "this.reasons()");
            return new jnc.a(c2);
        }
        StringBuilder V0 = je.V0("Unknown handling for ");
        V0.append(j.b(zwd.getClass()));
        return new jnc.a(V0.toString());
    }

    private final LoggingParams f(String str) {
        LoggingParams build = LoggingParams.builder().interactionId(str).pageInstanceId(this.d.get()).build();
        h.d(build, "LoggingParams.builder()\n…t())\n            .build()");
        return build;
    }

    private final z<jnc> g(String str, Context context, String str2) {
        String uri = context.uri();
        h.d(uri, "context.uri()");
        g<R> O = this.f.O(ymc.a);
        h.d(O, "currentTrackUriFlowable.map { it.or(\"\") }");
        g i = g.i(O, this.g, new anc(str, uri));
        h.d(i, "Flowable.combineLatest(\n…i\n            }\n        )");
        z<jnc> s = i.D(Boolean.FALSE).s(new c(this, str, context, str2));
        h.d(s, "isCurrentActiveEpisode(e…          )\n            }");
        return s;
    }

    @Override // defpackage.fnc
    public g<Boolean> a(String str) {
        h.e(str, "episodeUri");
        g<R> O = this.f.O(ymc.a);
        h.d(O, "currentTrackUriFlowable.map { it.or(\"\") }");
        g<Boolean> i = g.i(O, this.e, new a(str));
        h.d(i, "Flowable.combineLatest(\n…d\n            }\n        )");
        return i;
    }

    @Override // defpackage.fnc
    public z<jnc> b(String str) {
        h.e(str, "interactionId");
        z<R> A = this.c.a(com.spotify.player.controls.c.d(PauseCommand.builder().loggingParams(f(str)).build())).A(new b(this));
        h.d(A, "playerControls.execute(\n…toPodcastPlayerResult() }");
        return A;
    }

    @Override // defpackage.fnc
    public z<jnc> c(enc enc) {
        h.e(enc, "request");
        enc.b bVar = (enc.b) enc;
        String b2 = bVar.b();
        String a2 = bVar.a();
        List<enc.a> d2 = bVar.d();
        Context.Builder builder = Context.builder(a2);
        ContextPage.Builder builder2 = ContextPage.builder();
        ArrayList arrayList = new ArrayList(kotlin.collections.d.e(d2, 10));
        for (T t : d2) {
            arrayList.add(ContextTrack.builder(t.b()).metadata(ImmutableMap.of(ContextTrack.Metadata.KEY_SUBTITLE, t.a())).build());
        }
        Context build = builder.pages(ImmutableList.of(builder2.tracks(arrayList).build())).build();
        h.d(build, "Context.builder(contextU…       )\n        .build()");
        return g(b2, build, bVar.c());
    }
}
