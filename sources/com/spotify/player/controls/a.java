package com.spotify.player.controls;

import com.google.common.base.Optional;
import com.spotify.player.controls.c;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.SeekToCommand;
import com.spotify.player.model.command.SkipToNextTrackCommand;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import com.spotify.player.model.command.StopCommand;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.z;

public final class a implements d {
    private final com.spotify.player.internal.c a;
    private final com.spotify.player.internal.a b;

    /* renamed from: com.spotify.player.controls.a$a  reason: collision with other inner class name */
    static final class C0364a<T, R> implements ti0<c.f, z<zwd>> {
        final /* synthetic */ a a;

        C0364a(a aVar) {
            this.a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.ti0
        public z<zwd> apply(c.f fVar) {
            c.f fVar2 = fVar;
            kotlin.jvm.internal.h.e(fVar2, "it");
            a aVar = this.a;
            SeekToCommand m = fVar2.m();
            kotlin.jvm.internal.h.d(m, "it.command()");
            return aVar.l(m);
        }
    }

    static final class b<T, R> implements ti0<c.k, z<zwd>> {
        final /* synthetic */ a a;

        b(a aVar) {
            this.a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.ti0
        public z<zwd> apply(c.k kVar) {
            kotlin.jvm.internal.h.e(kVar, "it");
            return a.q(this.a, null, 1);
        }
    }

    static final class c<T, R> implements ti0<c.C0365c, z<zwd>> {
        final /* synthetic */ a a;

        c(a aVar) {
            this.a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.ti0
        public z<zwd> apply(c.C0365c cVar) {
            kotlin.jvm.internal.h.e(cVar, "it");
            return a.k(this.a, null, 1);
        }
    }

    static final class d<T, R> implements ti0<c.d, z<zwd>> {
        final /* synthetic */ a a;

        d(a aVar) {
            this.a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.ti0
        public z<zwd> apply(c.d dVar) {
            c.d dVar2 = dVar;
            kotlin.jvm.internal.h.e(dVar2, "it");
            a aVar = this.a;
            ResumeCommand m = dVar2.m();
            kotlin.jvm.internal.h.d(m, "it.command()");
            return aVar.j(m);
        }
    }

    static final class e<T, R> implements ti0<c.a, z<zwd>> {
        final /* synthetic */ a a;

        e(a aVar) {
            this.a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.ti0
        public z<zwd> apply(c.a aVar) {
            kotlin.jvm.internal.h.e(aVar, "it");
            return a.i(this.a, null, 1);
        }
    }

    static final class f<T, R> implements ti0<c.b, z<zwd>> {
        final /* synthetic */ a a;

        f(a aVar) {
            this.a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.ti0
        public z<zwd> apply(c.b bVar) {
            c.b bVar2 = bVar;
            kotlin.jvm.internal.h.e(bVar2, "it");
            a aVar = this.a;
            PauseCommand m = bVar2.m();
            kotlin.jvm.internal.h.d(m, "it.command()");
            return aVar.h(m);
        }
    }

    static final class g<T, R> implements ti0<c.g, z<zwd>> {
        final /* synthetic */ a a;

        g(a aVar) {
            this.a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.ti0
        public z<zwd> apply(c.g gVar) {
            kotlin.jvm.internal.h.e(gVar, "it");
            return a.n(this.a, null, 1);
        }
    }

    static final class h<T, R> implements ti0<c.h, z<zwd>> {
        final /* synthetic */ a a;

        h(a aVar) {
            this.a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.ti0
        public z<zwd> apply(c.h hVar) {
            c.h hVar2 = hVar;
            kotlin.jvm.internal.h.e(hVar2, "it");
            a aVar = this.a;
            SkipToNextTrackCommand m = hVar2.m();
            kotlin.jvm.internal.h.d(m, "it.command()");
            return aVar.m(m);
        }
    }

    static final class i<T, R> implements ti0<c.i, z<zwd>> {
        final /* synthetic */ a a;

        i(a aVar) {
            this.a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.ti0
        public z<zwd> apply(c.i iVar) {
            kotlin.jvm.internal.h.e(iVar, "it");
            return a.p(this.a, null, 1);
        }
    }

    static final class j<T, R> implements ti0<c.j, z<zwd>> {
        final /* synthetic */ a a;

        j(a aVar) {
            this.a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.ti0
        public z<zwd> apply(c.j jVar) {
            c.j jVar2 = jVar;
            kotlin.jvm.internal.h.e(jVar2, "it");
            a aVar = this.a;
            SkipToPrevTrackCommand m = jVar2.m();
            kotlin.jvm.internal.h.d(m, "it.command()");
            return aVar.o(m);
        }
    }

    static final class k<T, R> implements ti0<c.e, z<zwd>> {
        final /* synthetic */ a a;

        k(a aVar) {
            this.a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.ti0
        public z<zwd> apply(c.e eVar) {
            c.e eVar2 = eVar;
            kotlin.jvm.internal.h.e(eVar2, "it");
            return a.d(this.a, eVar2.m());
        }
    }

    public a(com.spotify.player.internal.c cVar, com.spotify.player.internal.a aVar) {
        kotlin.jvm.internal.h.e(cVar, "commandResolver");
        kotlin.jvm.internal.h.e(aVar, "loggingParamsFactory");
        this.a = cVar;
        this.b = aVar;
    }

    public static final z d(a aVar, long j2) {
        aVar.getClass();
        SeekToCommand create = SeekToCommand.create(j2);
        kotlin.jvm.internal.h.d(create, "SeekToCommand.create(ms)");
        return aVar.l(create);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final z<zwd> h(PauseCommand pauseCommand) {
        PauseCommand.Builder builder = pauseCommand.toBuilder();
        com.spotify.player.internal.a aVar = this.b;
        Optional<LoggingParams> loggingParams = pauseCommand.loggingParams();
        kotlin.jvm.internal.h.d(loggingParams, "command.loggingParams()");
        PauseCommand build = builder.loggingParams(aVar.c(loggingParams)).build();
        com.spotify.player.internal.c cVar = this.a;
        kotlin.jvm.internal.h.d(build, "updatedCommand");
        return cVar.b(ContextTrack.TrackAction.PAUSE, build);
    }

    static /* synthetic */ z i(a aVar, PauseCommand pauseCommand, int i2) {
        PauseCommand pauseCommand2;
        if ((i2 & 1) != 0) {
            pauseCommand2 = PauseCommand.create();
            kotlin.jvm.internal.h.d(pauseCommand2, "PauseCommand.create()");
        } else {
            pauseCommand2 = null;
        }
        return aVar.h(pauseCommand2);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final z<zwd> j(ResumeCommand resumeCommand) {
        ResumeCommand.Builder builder = resumeCommand.toBuilder();
        com.spotify.player.internal.a aVar = this.b;
        Optional<LoggingParams> loggingParams = resumeCommand.loggingParams();
        kotlin.jvm.internal.h.d(loggingParams, "command.loggingParams()");
        ResumeCommand build = builder.loggingParams(aVar.c(loggingParams)).build();
        com.spotify.player.internal.c cVar = this.a;
        kotlin.jvm.internal.h.d(build, "updatedCommand");
        return cVar.b(ContextTrack.TrackAction.RESUME, build);
    }

    static /* synthetic */ z k(a aVar, ResumeCommand resumeCommand, int i2) {
        ResumeCommand resumeCommand2;
        if ((i2 & 1) != 0) {
            resumeCommand2 = ResumeCommand.create();
            kotlin.jvm.internal.h.d(resumeCommand2, "ResumeCommand.create()");
        } else {
            resumeCommand2 = null;
        }
        return aVar.j(resumeCommand2);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final z<zwd> l(SeekToCommand seekToCommand) {
        SeekToCommand.Builder builder = seekToCommand.toBuilder();
        com.spotify.player.internal.a aVar = this.b;
        Optional<LoggingParams> loggingParams = seekToCommand.loggingParams();
        kotlin.jvm.internal.h.d(loggingParams, "command.loggingParams()");
        SeekToCommand build = builder.loggingParams(aVar.c(loggingParams)).build();
        com.spotify.player.internal.c cVar = this.a;
        kotlin.jvm.internal.h.d(build, "updatedCommand");
        return cVar.b("seek_to", build);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final z<zwd> m(SkipToNextTrackCommand skipToNextTrackCommand) {
        SkipToNextTrackCommand.Builder builder = skipToNextTrackCommand.toBuilder();
        com.spotify.player.internal.a aVar = this.b;
        Optional<LoggingParams> loggingParams = skipToNextTrackCommand.loggingParams();
        kotlin.jvm.internal.h.d(loggingParams, "command.loggingParams()");
        SkipToNextTrackCommand build = builder.loggingParams(aVar.c(loggingParams)).build();
        com.spotify.player.internal.c cVar = this.a;
        kotlin.jvm.internal.h.d(build, "updatedCommand");
        return cVar.b("skip_next", build);
    }

    static /* synthetic */ z n(a aVar, SkipToNextTrackCommand skipToNextTrackCommand, int i2) {
        SkipToNextTrackCommand skipToNextTrackCommand2;
        if ((i2 & 1) != 0) {
            skipToNextTrackCommand2 = SkipToNextTrackCommand.create();
            kotlin.jvm.internal.h.d(skipToNextTrackCommand2, "SkipToNextTrackCommand.create()");
        } else {
            skipToNextTrackCommand2 = null;
        }
        return aVar.m(skipToNextTrackCommand2);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final z<zwd> o(SkipToPrevTrackCommand skipToPrevTrackCommand) {
        SkipToPrevTrackCommand.Builder builder = skipToPrevTrackCommand.toBuilder();
        com.spotify.player.internal.a aVar = this.b;
        Optional<LoggingParams> loggingParams = skipToPrevTrackCommand.loggingParams();
        kotlin.jvm.internal.h.d(loggingParams, "command.loggingParams()");
        SkipToPrevTrackCommand build = builder.loggingParams(aVar.c(loggingParams)).build();
        com.spotify.player.internal.c cVar = this.a;
        kotlin.jvm.internal.h.d(build, "updatedCommand");
        return cVar.b("skip_prev", build);
    }

    static /* synthetic */ z p(a aVar, SkipToPrevTrackCommand skipToPrevTrackCommand, int i2) {
        SkipToPrevTrackCommand skipToPrevTrackCommand2;
        if ((i2 & 1) != 0) {
            skipToPrevTrackCommand2 = SkipToPrevTrackCommand.create();
            kotlin.jvm.internal.h.d(skipToPrevTrackCommand2, "SkipToPrevTrackCommand.create()");
        } else {
            skipToPrevTrackCommand2 = null;
        }
        return aVar.o(skipToPrevTrackCommand2);
    }

    static z q(a aVar, StopCommand stopCommand, int i2) {
        StopCommand stopCommand2;
        if ((i2 & 1) != 0) {
            stopCommand2 = StopCommand.create();
            kotlin.jvm.internal.h.d(stopCommand2, "StopCommand.create()");
        } else {
            stopCommand2 = null;
        }
        aVar.getClass();
        StopCommand.Builder builder = stopCommand2.toBuilder();
        com.spotify.player.internal.a aVar2 = aVar.b;
        Optional<LoggingParams> loggingParams = stopCommand2.loggingParams();
        kotlin.jvm.internal.h.d(loggingParams, "command.loggingParams()");
        StopCommand build = builder.loggingParams(aVar2.c(loggingParams)).build();
        com.spotify.player.internal.c cVar = aVar.a;
        kotlin.jvm.internal.h.d(build, "updatedCommand");
        return cVar.b(ContextTrack.TrackAction.STOP, build);
    }

    @Override // com.spotify.player.controls.d
    public z<zwd> a(c cVar) {
        kotlin.jvm.internal.h.e(cVar, "playerControlCommand");
        Object a2 = cVar.a(new c(this), new d(this), new e(this), new f(this), new g(this), new h(this), new i(this), new j(this), new k(this), new C0364a(this), new b(this));
        kotlin.jvm.internal.h.d(a2, "playerControlCommand.map…     { stop() }\n        )");
        return (z) a2;
    }
}
