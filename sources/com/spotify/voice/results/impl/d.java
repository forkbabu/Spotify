package com.spotify.voice.results.impl;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.play.f;
import com.spotify.rxjava2.q;
import com.spotify.voice.results.impl.h;
import com.spotify.voice.results.model.e;
import io.reactivex.d0;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.y;
import io.reactivex.z;
import java.util.List;

public final class d implements h.a {
    private final g<i> a;
    private final q b = new q();
    private final g<ugf> c;
    private final qg0<String> d;
    private final com.spotify.voice.results.model.g e;
    private final f f;
    private final y g;
    private final y h;
    private final h i;

    static final class a<T, R> implements l<Throwable, zwd> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public zwd apply(Throwable th) {
            Throwable th2 = th;
            kotlin.jvm.internal.h.e(th2, AppProtocol.LogMessage.SEVERITY_ERROR);
            return zwd.a("Playback Error " + th2.getLocalizedMessage());
        }
    }

    static final class b<T> implements io.reactivex.functions.g<zwd> {
        final /* synthetic */ d a;
        final /* synthetic */ e.a b;

        b(d dVar, e.a aVar) {
            this.a = dVar;
            this.b = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: qg0 */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.g
        public void accept(zwd zwd) {
            this.a.d.accept(this.b.g());
        }
    }

    static final class c<T> implements io.reactivex.functions.g<i> {
        final /* synthetic */ d a;

        c(d dVar) {
            this.a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(i iVar) {
            i iVar2 = iVar;
            h hVar = this.a.i;
            kotlin.jvm.internal.h.d(iVar2, "it");
            hVar.a(iVar2);
        }
    }

    /* renamed from: com.spotify.voice.results.impl.d$d  reason: collision with other inner class name */
    static final class C0578d<T, R> implements l<ugf, d0<? extends List<? extends e.a>>> {
        final /* synthetic */ com.spotify.voice.results.model.e a;

        C0578d(com.spotify.voice.results.model.e eVar) {
            this.a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends List<? extends e.a>> apply(ugf ugf) {
            ugf ugf2 = ugf;
            kotlin.jvm.internal.h.e(ugf2, "playbackStatus");
            return z.y(new e(this, ugf2));
        }
    }

    static final class e<T, R> implements l<List<? extends e.a>, i> {
        final /* synthetic */ com.spotify.voice.results.model.e a;

        e(com.spotify.voice.results.model.e eVar) {
            this.a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public i apply(List<? extends e.a> list) {
            List<? extends e.a> list2 = list;
            kotlin.jvm.internal.h.e(list2, "results");
            String f = this.a.f();
            kotlin.jvm.internal.h.d(f, "resultsPageModel.title()");
            return new i(f, list2);
        }
    }

    public d(g<ugf> gVar, qg0<String> qg0, com.spotify.voice.results.model.g gVar2, f fVar, y yVar, y yVar2, com.spotify.voice.results.model.e eVar, h hVar) {
        kotlin.jvm.internal.h.e(gVar, "playbackStatus");
        kotlin.jvm.internal.h.e(qg0, "navigationFunction");
        kotlin.jvm.internal.h.e(gVar2, "voiceResultsLogger");
        kotlin.jvm.internal.h.e(fVar, "player");
        kotlin.jvm.internal.h.e(yVar, "mainScheduler");
        kotlin.jvm.internal.h.e(yVar2, "workScheduler");
        kotlin.jvm.internal.h.e(eVar, "resultsPageModel");
        kotlin.jvm.internal.h.e(hVar, "viewBinder");
        this.c = gVar;
        this.d = qg0;
        this.e = gVar2;
        this.f = fVar;
        this.g = yVar;
        this.h = yVar2;
        this.i = hVar;
        hVar.b(this);
        g<R> O = gVar.g0(new C0578d(eVar)).s().O(new e(eVar));
        kotlin.jvm.internal.h.d(O, "playbackStatus\n         …Model.title(), results) }");
        this.a = O;
    }

    @Override // com.spotify.voice.results.impl.h.a
    public void a(e.a aVar, int i2) {
        kotlin.jvm.internal.h.e(aVar, "result");
        if (!aVar.a()) {
            this.e.a(com.spotify.voice.results.model.f.a(i2, aVar.g()));
            Context fromUri = Context.fromUri(aVar.h());
            ifd ifd = kfd.C1;
            kotlin.jvm.internal.h.d(ifd, "FeatureIdentifiers.VOICE_RESULTS");
            this.b.a(this.f.a(PlayCommand.create(fromUri, PlayOrigin.create(ifd.getName()))).E(a.a).B(this.g).subscribe(new b(this, aVar)));
        }
    }

    @Override // com.spotify.voice.results.impl.h.a
    public void b() {
        this.e.a(com.spotify.voice.results.model.f.c());
    }

    public final void e() {
        this.b.a(this.a.e0(this.h).Q(this.g).subscribe(new c(this)));
    }

    public final void f() {
        this.b.c();
    }
}
