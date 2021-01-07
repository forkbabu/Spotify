package com.spotify.player.controls;

import com.spotify.player.controls.c;
import com.spotify.player.esperanto.proto.k;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.SeekToCommand;
import com.spotify.player.model.command.SkipToNextTrackCommand;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import io.reactivex.z;

public final class EsperantoPlayerControls implements d {
    private final k.b a;
    private final com.spotify.player.internal.a b;

    static final class a<T, R> implements ti0<c.f, z<zwd>> {
        final /* synthetic */ EsperantoPlayerControls a;

        a(EsperantoPlayerControls esperantoPlayerControls) {
            this.a = esperantoPlayerControls;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.ti0
        public z<zwd> apply(c.f fVar) {
            c.f fVar2 = fVar;
            kotlin.jvm.internal.h.e(fVar2, "it");
            EsperantoPlayerControls esperantoPlayerControls = this.a;
            SeekToCommand m = fVar2.m();
            kotlin.jvm.internal.h.d(m, "it.command()");
            return esperantoPlayerControls.l(m);
        }
    }

    static final class b<T, R> implements ti0<c.k, z<zwd>> {
        final /* synthetic */ EsperantoPlayerControls a;

        b(EsperantoPlayerControls esperantoPlayerControls) {
            this.a = esperantoPlayerControls;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.ti0
        public z<zwd> apply(c.k kVar) {
            kotlin.jvm.internal.h.e(kVar, "it");
            return EsperantoPlayerControls.q(this.a, null, 1);
        }
    }

    static final class c<T, R> implements ti0<c.C0365c, z<zwd>> {
        final /* synthetic */ EsperantoPlayerControls a;

        c(EsperantoPlayerControls esperantoPlayerControls) {
            this.a = esperantoPlayerControls;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.ti0
        public z<zwd> apply(c.C0365c cVar) {
            kotlin.jvm.internal.h.e(cVar, "it");
            return EsperantoPlayerControls.k(this.a, null, 1);
        }
    }

    static final class d<T, R> implements ti0<c.d, z<zwd>> {
        final /* synthetic */ EsperantoPlayerControls a;

        d(EsperantoPlayerControls esperantoPlayerControls) {
            this.a = esperantoPlayerControls;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.ti0
        public z<zwd> apply(c.d dVar) {
            c.d dVar2 = dVar;
            kotlin.jvm.internal.h.e(dVar2, "it");
            EsperantoPlayerControls esperantoPlayerControls = this.a;
            ResumeCommand m = dVar2.m();
            kotlin.jvm.internal.h.d(m, "it.command()");
            return esperantoPlayerControls.j(m);
        }
    }

    static final class e<T, R> implements ti0<c.a, z<zwd>> {
        final /* synthetic */ EsperantoPlayerControls a;

        e(EsperantoPlayerControls esperantoPlayerControls) {
            this.a = esperantoPlayerControls;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.ti0
        public z<zwd> apply(c.a aVar) {
            kotlin.jvm.internal.h.e(aVar, "it");
            return EsperantoPlayerControls.i(this.a, null, 1);
        }
    }

    static final class f<T, R> implements ti0<c.b, z<zwd>> {
        final /* synthetic */ EsperantoPlayerControls a;

        f(EsperantoPlayerControls esperantoPlayerControls) {
            this.a = esperantoPlayerControls;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.ti0
        public z<zwd> apply(c.b bVar) {
            c.b bVar2 = bVar;
            kotlin.jvm.internal.h.e(bVar2, "it");
            EsperantoPlayerControls esperantoPlayerControls = this.a;
            PauseCommand m = bVar2.m();
            kotlin.jvm.internal.h.d(m, "it.command()");
            return esperantoPlayerControls.h(m);
        }
    }

    static final class g<T, R> implements ti0<c.g, z<zwd>> {
        final /* synthetic */ EsperantoPlayerControls a;

        g(EsperantoPlayerControls esperantoPlayerControls) {
            this.a = esperantoPlayerControls;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.ti0
        public z<zwd> apply(c.g gVar) {
            kotlin.jvm.internal.h.e(gVar, "it");
            return EsperantoPlayerControls.n(this.a, null, 1);
        }
    }

    static final class h<T, R> implements ti0<c.h, z<zwd>> {
        final /* synthetic */ EsperantoPlayerControls a;

        h(EsperantoPlayerControls esperantoPlayerControls) {
            this.a = esperantoPlayerControls;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.ti0
        public z<zwd> apply(c.h hVar) {
            c.h hVar2 = hVar;
            kotlin.jvm.internal.h.e(hVar2, "it");
            EsperantoPlayerControls esperantoPlayerControls = this.a;
            SkipToNextTrackCommand m = hVar2.m();
            kotlin.jvm.internal.h.d(m, "it.command()");
            return esperantoPlayerControls.m(m);
        }
    }

    static final class i<T, R> implements ti0<c.i, z<zwd>> {
        final /* synthetic */ EsperantoPlayerControls a;

        i(EsperantoPlayerControls esperantoPlayerControls) {
            this.a = esperantoPlayerControls;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.ti0
        public z<zwd> apply(c.i iVar) {
            kotlin.jvm.internal.h.e(iVar, "it");
            return EsperantoPlayerControls.p(this.a, null, 1);
        }
    }

    static final class j<T, R> implements ti0<c.j, z<zwd>> {
        final /* synthetic */ EsperantoPlayerControls a;

        j(EsperantoPlayerControls esperantoPlayerControls) {
            this.a = esperantoPlayerControls;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.ti0
        public z<zwd> apply(c.j jVar) {
            c.j jVar2 = jVar;
            kotlin.jvm.internal.h.e(jVar2, "it");
            EsperantoPlayerControls esperantoPlayerControls = this.a;
            SkipToPrevTrackCommand m = jVar2.m();
            kotlin.jvm.internal.h.d(m, "it.command()");
            return esperantoPlayerControls.o(m);
        }
    }

    static final class k<T, R> implements ti0<c.e, z<zwd>> {
        final /* synthetic */ EsperantoPlayerControls a;

        k(EsperantoPlayerControls esperantoPlayerControls) {
            this.a = esperantoPlayerControls;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.ti0
        public z<zwd> apply(c.e eVar) {
            c.e eVar2 = eVar;
            kotlin.jvm.internal.h.e(eVar2, "it");
            return EsperantoPlayerControls.d(this.a, eVar2.m());
        }
    }

    public EsperantoPlayerControls(k.b bVar, com.spotify.player.internal.a aVar) {
        kotlin.jvm.internal.h.e(bVar, "playerClient");
        kotlin.jvm.internal.h.e(aVar, "loggingParamsFactory");
        this.a = bVar;
        this.b = aVar;
    }

    public static final z d(EsperantoPlayerControls esperantoPlayerControls, long j2) {
        esperantoPlayerControls.getClass();
        SeekToCommand create = SeekToCommand.create(j2);
        kotlin.jvm.internal.h.d(create, "SeekToCommand.create(ms)");
        return esperantoPlayerControls.l(create);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.spotify.player.controls.b] */
    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final io.reactivex.z<defpackage.zwd> h(com.spotify.player.model.command.PauseCommand r4) {
        /*
            r3 = this;
            com.spotify.player.esperanto.proto.EsPause$PauseRequest$a r0 = com.spotify.player.esperanto.proto.EsPause$PauseRequest.l()
            com.google.common.base.Optional r1 = r4.options()
            java.lang.String r2 = "command.options()"
            kotlin.jvm.internal.h.d(r1, r2)
            boolean r1 = r1.isPresent()
            if (r1 == 0) goto L_0x0029
            com.google.common.base.Optional r1 = r4.options()
            java.lang.Object r1 = r1.get()
            java.lang.String r2 = "command.options().get()"
            kotlin.jvm.internal.h.d(r1, r2)
            com.spotify.player.model.command.options.CommandOptions r1 = (com.spotify.player.model.command.options.CommandOptions) r1
            com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions r1 = com.spotify.paste.widgets.b.a(r1)
            r0.n(r1)
        L_0x0029:
            com.spotify.player.internal.a r1 = r3.b
            com.google.common.base.Optional r4 = r4.loggingParams()
            java.lang.String r2 = "command.loggingParams()"
            kotlin.jvm.internal.h.d(r4, r2)
            com.spotify.player.model.command.options.LoggingParams r4 = r1.c(r4)
            java.lang.String r1 = "loggingParamsFactory.dec…(command.loggingParams())"
            kotlin.jvm.internal.h.d(r4, r1)
            com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams r4 = com.spotify.paste.widgets.b.g(r4)
            r0.m(r4)
            com.spotify.player.esperanto.proto.k$b r4 = r3.a
            com.google.protobuf.GeneratedMessageLite r0 = r0.build()
            com.spotify.player.esperanto.proto.EsPause$PauseRequest r0 = (com.spotify.player.esperanto.proto.EsPause$PauseRequest) r0
            io.reactivex.z r4 = r4.l(r0)
            com.spotify.player.controls.EsperantoPlayerControls$pause$1 r0 = com.spotify.player.controls.EsperantoPlayerControls$pause$1.a
            if (r0 == 0) goto L_0x005a
            com.spotify.player.controls.b r1 = new com.spotify.player.controls.b
            r1.<init>(r0)
            r0 = r1
        L_0x005a:
            io.reactivex.functions.l r0 = (io.reactivex.functions.l) r0
            io.reactivex.z r4 = r4.A(r0)
            java.lang.String r0 = "playerClient.Pause(reque…::commandResultFromProto)"
            kotlin.jvm.internal.h.d(r4, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.player.controls.EsperantoPlayerControls.h(com.spotify.player.model.command.PauseCommand):io.reactivex.z");
    }

    static /* synthetic */ z i(EsperantoPlayerControls esperantoPlayerControls, PauseCommand pauseCommand, int i2) {
        PauseCommand pauseCommand2;
        if ((i2 & 1) != 0) {
            pauseCommand2 = PauseCommand.create();
            kotlin.jvm.internal.h.d(pauseCommand2, "PauseCommand.create()");
        } else {
            pauseCommand2 = null;
        }
        return esperantoPlayerControls.h(pauseCommand2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.spotify.player.controls.b] */
    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final io.reactivex.z<defpackage.zwd> j(com.spotify.player.model.command.ResumeCommand r4) {
        /*
            r3 = this;
            com.spotify.player.esperanto.proto.EsResume$ResumeRequest$a r0 = com.spotify.player.esperanto.proto.EsResume$ResumeRequest.l()
            com.google.common.base.Optional r1 = r4.options()
            java.lang.String r2 = "command.options()"
            kotlin.jvm.internal.h.d(r1, r2)
            boolean r1 = r1.isPresent()
            if (r1 == 0) goto L_0x0029
            com.google.common.base.Optional r1 = r4.options()
            java.lang.Object r1 = r1.get()
            java.lang.String r2 = "command.options().get()"
            kotlin.jvm.internal.h.d(r1, r2)
            com.spotify.player.model.command.options.CommandOptions r1 = (com.spotify.player.model.command.options.CommandOptions) r1
            com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions r1 = com.spotify.paste.widgets.b.a(r1)
            r0.n(r1)
        L_0x0029:
            com.spotify.player.internal.a r1 = r3.b
            com.google.common.base.Optional r4 = r4.loggingParams()
            java.lang.String r2 = "command.loggingParams()"
            kotlin.jvm.internal.h.d(r4, r2)
            com.spotify.player.model.command.options.LoggingParams r4 = r1.c(r4)
            java.lang.String r1 = "loggingParamsFactory.dec…(command.loggingParams())"
            kotlin.jvm.internal.h.d(r4, r1)
            com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams r4 = com.spotify.paste.widgets.b.g(r4)
            r0.m(r4)
            com.spotify.player.esperanto.proto.k$b r4 = r3.a
            com.google.protobuf.GeneratedMessageLite r0 = r0.build()
            com.spotify.player.esperanto.proto.EsResume$ResumeRequest r0 = (com.spotify.player.esperanto.proto.EsResume$ResumeRequest) r0
            io.reactivex.z r4 = r4.h(r0)
            com.spotify.player.controls.EsperantoPlayerControls$resume$1 r0 = com.spotify.player.controls.EsperantoPlayerControls$resume$1.a
            if (r0 == 0) goto L_0x005a
            com.spotify.player.controls.b r1 = new com.spotify.player.controls.b
            r1.<init>(r0)
            r0 = r1
        L_0x005a:
            io.reactivex.functions.l r0 = (io.reactivex.functions.l) r0
            io.reactivex.z r4 = r4.A(r0)
            java.lang.String r0 = "playerClient.Resume(requ…::commandResultFromProto)"
            kotlin.jvm.internal.h.d(r4, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.player.controls.EsperantoPlayerControls.j(com.spotify.player.model.command.ResumeCommand):io.reactivex.z");
    }

    static /* synthetic */ z k(EsperantoPlayerControls esperantoPlayerControls, ResumeCommand resumeCommand, int i2) {
        ResumeCommand resumeCommand2;
        if ((i2 & 1) != 0) {
            resumeCommand2 = ResumeCommand.create();
            kotlin.jvm.internal.h.d(resumeCommand2, "ResumeCommand.create()");
        } else {
            resumeCommand2 = null;
        }
        return esperantoPlayerControls.j(resumeCommand2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.spotify.player.controls.b] */
    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final io.reactivex.z<defpackage.zwd> l(com.spotify.player.model.command.SeekToCommand r5) {
        /*
            r4 = this;
            com.spotify.player.esperanto.proto.EsSeekTo$SeekToRequest$a r0 = com.spotify.player.esperanto.proto.EsSeekTo$SeekToRequest.m()
            com.google.common.base.Optional r1 = r5.options()
            java.lang.String r2 = "command.options()"
            kotlin.jvm.internal.h.d(r1, r2)
            boolean r1 = r1.isPresent()
            if (r1 == 0) goto L_0x0029
            com.google.common.base.Optional r1 = r5.options()
            java.lang.Object r1 = r1.get()
            java.lang.String r2 = "command.options().get()"
            kotlin.jvm.internal.h.d(r1, r2)
            com.spotify.player.model.command.options.CommandOptions r1 = (com.spotify.player.model.command.options.CommandOptions) r1
            com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions r1 = com.spotify.paste.widgets.b.a(r1)
            r0.n(r1)
        L_0x0029:
            com.spotify.player.internal.a r1 = r4.b
            com.google.common.base.Optional r2 = r5.loggingParams()
            java.lang.String r3 = "command.loggingParams()"
            kotlin.jvm.internal.h.d(r2, r3)
            com.spotify.player.model.command.options.LoggingParams r1 = r1.c(r2)
            java.lang.String r2 = "loggingParamsFactory.dec…(command.loggingParams())"
            kotlin.jvm.internal.h.d(r1, r2)
            com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams r1 = com.spotify.paste.widgets.b.g(r1)
            r0.m(r1)
            long r1 = r5.value()
            r0.o(r1)
            com.spotify.player.esperanto.proto.k$b r5 = r4.a
            com.google.protobuf.GeneratedMessageLite r0 = r0.build()
            com.spotify.player.esperanto.proto.EsSeekTo$SeekToRequest r0 = (com.spotify.player.esperanto.proto.EsSeekTo$SeekToRequest) r0
            io.reactivex.z r5 = r5.o(r0)
            com.spotify.player.controls.EsperantoPlayerControls$seekTo$1 r0 = com.spotify.player.controls.EsperantoPlayerControls$seekTo$1.a
            if (r0 == 0) goto L_0x0061
            com.spotify.player.controls.b r1 = new com.spotify.player.controls.b
            r1.<init>(r0)
            r0 = r1
        L_0x0061:
            io.reactivex.functions.l r0 = (io.reactivex.functions.l) r0
            io.reactivex.z r5 = r5.A(r0)
            java.lang.String r0 = "playerClient.SeekTo(requ…::commandResultFromProto)"
            kotlin.jvm.internal.h.d(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.player.controls.EsperantoPlayerControls.l(com.spotify.player.model.command.SeekToCommand):io.reactivex.z");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.spotify.player.controls.b] */
    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final io.reactivex.z<defpackage.zwd> m(com.spotify.player.model.command.SkipToNextTrackCommand r5) {
        /*
            r4 = this;
            com.spotify.player.esperanto.proto.EsSkipNext$SkipNextRequest$a r0 = com.spotify.player.esperanto.proto.EsSkipNext$SkipNextRequest.m()
            com.google.common.base.Optional r1 = r5.options()
            java.lang.String r2 = "command.options()"
            kotlin.jvm.internal.h.d(r1, r2)
            boolean r1 = r1.isPresent()
            if (r1 == 0) goto L_0x0029
            com.google.common.base.Optional r1 = r5.options()
            java.lang.Object r1 = r1.get()
            java.lang.String r2 = "command.options().get()"
            kotlin.jvm.internal.h.d(r1, r2)
            com.spotify.player.model.command.options.CommandOptions r1 = (com.spotify.player.model.command.options.CommandOptions) r1
            com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions r1 = com.spotify.paste.widgets.b.a(r1)
            r0.n(r1)
        L_0x0029:
            com.spotify.player.internal.a r1 = r4.b
            com.google.common.base.Optional r2 = r5.loggingParams()
            java.lang.String r3 = "command.loggingParams()"
            kotlin.jvm.internal.h.d(r2, r3)
            com.spotify.player.model.command.options.LoggingParams r1 = r1.c(r2)
            java.lang.String r2 = "loggingParamsFactory.dec…(command.loggingParams())"
            kotlin.jvm.internal.h.d(r1, r2)
            com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams r1 = com.spotify.paste.widgets.b.g(r1)
            r0.m(r1)
            com.google.common.base.Optional r1 = r5.track()
            java.lang.String r2 = "command.track()"
            kotlin.jvm.internal.h.d(r1, r2)
            boolean r1 = r1.isPresent()
            if (r1 == 0) goto L_0x0069
            com.google.common.base.Optional r5 = r5.track()
            java.lang.Object r5 = r5.get()
            java.lang.String r1 = "command.track().get()"
            kotlin.jvm.internal.h.d(r5, r1)
            com.spotify.player.model.ContextTrack r5 = (com.spotify.player.model.ContextTrack) r5
            com.spotify.player.esperanto.proto.EsContextTrack$ContextTrack r5 = com.spotify.paste.widgets.b.c(r5)
            r0.o(r5)
        L_0x0069:
            com.spotify.player.esperanto.proto.k$b r5 = r4.a
            com.google.protobuf.GeneratedMessageLite r0 = r0.build()
            com.spotify.player.esperanto.proto.EsSkipNext$SkipNextRequest r0 = (com.spotify.player.esperanto.proto.EsSkipNext$SkipNextRequest) r0
            io.reactivex.z r5 = r5.i(r0)
            com.spotify.player.controls.EsperantoPlayerControls$skipNext$1 r0 = com.spotify.player.controls.EsperantoPlayerControls$skipNext$1.a
            if (r0 == 0) goto L_0x007f
            com.spotify.player.controls.b r1 = new com.spotify.player.controls.b
            r1.<init>(r0)
            r0 = r1
        L_0x007f:
            io.reactivex.functions.l r0 = (io.reactivex.functions.l) r0
            io.reactivex.z r5 = r5.A(r0)
            java.lang.String r0 = "playerClient.SkipNext(re…::commandResultFromProto)"
            kotlin.jvm.internal.h.d(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.player.controls.EsperantoPlayerControls.m(com.spotify.player.model.command.SkipToNextTrackCommand):io.reactivex.z");
    }

    static /* synthetic */ z n(EsperantoPlayerControls esperantoPlayerControls, SkipToNextTrackCommand skipToNextTrackCommand, int i2) {
        SkipToNextTrackCommand skipToNextTrackCommand2;
        if ((i2 & 1) != 0) {
            skipToNextTrackCommand2 = SkipToNextTrackCommand.create();
            kotlin.jvm.internal.h.d(skipToNextTrackCommand2, "SkipToNextTrackCommand.create()");
        } else {
            skipToNextTrackCommand2 = null;
        }
        return esperantoPlayerControls.m(skipToNextTrackCommand2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.spotify.player.controls.b] */
    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final io.reactivex.z<defpackage.zwd> o(com.spotify.player.model.command.SkipToPrevTrackCommand r5) {
        /*
            r4 = this;
            com.spotify.player.esperanto.proto.EsSkipPrev$SkipPrevRequest$a r0 = com.spotify.player.esperanto.proto.EsSkipPrev$SkipPrevRequest.n()
            com.google.common.base.Optional r1 = r5.options()
            java.lang.String r2 = "command.options()"
            kotlin.jvm.internal.h.d(r1, r2)
            boolean r1 = r1.isPresent()
            if (r1 == 0) goto L_0x0076
            com.google.common.base.Optional r1 = r5.options()
            java.lang.Object r1 = r1.get()
            com.spotify.player.model.command.options.SkipToPrevTrackOptions r1 = (com.spotify.player.model.command.options.SkipToPrevTrackOptions) r1
            com.spotify.player.model.command.options.CommandOptions r1 = r1.commandOptions()
            if (r1 == 0) goto L_0x003d
            com.google.common.base.Optional r1 = r5.options()
            java.lang.Object r1 = r1.get()
            com.spotify.player.model.command.options.SkipToPrevTrackOptions r1 = (com.spotify.player.model.command.options.SkipToPrevTrackOptions) r1
            com.spotify.player.model.command.options.CommandOptions r1 = r1.commandOptions()
            java.lang.String r2 = "command.options().get().commandOptions()"
            kotlin.jvm.internal.h.d(r1, r2)
            com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions r1 = com.spotify.paste.widgets.b.a(r1)
            r0.o(r1)
        L_0x003d:
            com.google.common.base.Optional r1 = r5.options()
            java.lang.Object r1 = r1.get()
            com.spotify.player.model.command.options.SkipToPrevTrackOptions r1 = (com.spotify.player.model.command.options.SkipToPrevTrackOptions) r1
            com.google.common.base.Optional r1 = r1.allowSeeking()
            java.lang.String r2 = "command.options().get().allowSeeking()"
            kotlin.jvm.internal.h.d(r1, r2)
            boolean r1 = r1.isPresent()
            if (r1 == 0) goto L_0x0076
            com.google.common.base.Optional r1 = r5.options()
            java.lang.Object r1 = r1.get()
            com.spotify.player.model.command.options.SkipToPrevTrackOptions r1 = (com.spotify.player.model.command.options.SkipToPrevTrackOptions) r1
            com.google.common.base.Optional r1 = r1.allowSeeking()
            java.lang.Object r1 = r1.get()
            java.lang.String r2 = "command.options().get().allowSeeking().get()"
            kotlin.jvm.internal.h.d(r1, r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.m(r1)
        L_0x0076:
            com.spotify.player.internal.a r1 = r4.b
            com.google.common.base.Optional r2 = r5.loggingParams()
            java.lang.String r3 = "command.loggingParams()"
            kotlin.jvm.internal.h.d(r2, r3)
            com.spotify.player.model.command.options.LoggingParams r1 = r1.c(r2)
            java.lang.String r2 = "loggingParamsFactory.dec…(command.loggingParams())"
            kotlin.jvm.internal.h.d(r1, r2)
            com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams r1 = com.spotify.paste.widgets.b.g(r1)
            r0.n(r1)
            com.google.common.base.Optional r1 = r5.track()
            java.lang.String r2 = "command.track()"
            kotlin.jvm.internal.h.d(r1, r2)
            boolean r1 = r1.isPresent()
            if (r1 == 0) goto L_0x00b6
            com.google.common.base.Optional r5 = r5.track()
            java.lang.Object r5 = r5.get()
            java.lang.String r1 = "command.track().get()"
            kotlin.jvm.internal.h.d(r5, r1)
            com.spotify.player.model.ContextTrack r5 = (com.spotify.player.model.ContextTrack) r5
            com.spotify.player.esperanto.proto.EsContextTrack$ContextTrack r5 = com.spotify.paste.widgets.b.c(r5)
            r0.p(r5)
        L_0x00b6:
            com.spotify.player.esperanto.proto.k$b r5 = r4.a
            com.google.protobuf.GeneratedMessageLite r0 = r0.build()
            com.spotify.player.esperanto.proto.EsSkipPrev$SkipPrevRequest r0 = (com.spotify.player.esperanto.proto.EsSkipPrev$SkipPrevRequest) r0
            io.reactivex.z r5 = r5.p(r0)
            com.spotify.player.controls.EsperantoPlayerControls$skipPrev$1 r0 = com.spotify.player.controls.EsperantoPlayerControls$skipPrev$1.a
            if (r0 == 0) goto L_0x00cc
            com.spotify.player.controls.b r1 = new com.spotify.player.controls.b
            r1.<init>(r0)
            r0 = r1
        L_0x00cc:
            io.reactivex.functions.l r0 = (io.reactivex.functions.l) r0
            io.reactivex.z r5 = r5.A(r0)
            java.lang.String r0 = "playerClient.SkipPrev(re…::commandResultFromProto)"
            kotlin.jvm.internal.h.d(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.player.controls.EsperantoPlayerControls.o(com.spotify.player.model.command.SkipToPrevTrackCommand):io.reactivex.z");
    }

    static /* synthetic */ z p(EsperantoPlayerControls esperantoPlayerControls, SkipToPrevTrackCommand skipToPrevTrackCommand, int i2) {
        SkipToPrevTrackCommand skipToPrevTrackCommand2;
        if ((i2 & 1) != 0) {
            skipToPrevTrackCommand2 = SkipToPrevTrackCommand.create();
            kotlin.jvm.internal.h.d(skipToPrevTrackCommand2, "SkipToPrevTrackCommand.create()");
        } else {
            skipToPrevTrackCommand2 = null;
        }
        return esperantoPlayerControls.o(skipToPrevTrackCommand2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.spotify.player.controls.b] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static io.reactivex.z q(com.spotify.player.controls.EsperantoPlayerControls r2, com.spotify.player.model.command.StopCommand r3, int r4) {
        /*
            r3 = r4 & 1
            if (r3 == 0) goto L_0x000e
            com.spotify.player.model.command.StopCommand r3 = com.spotify.player.model.command.StopCommand.create()
            java.lang.String r4 = "StopCommand.create()"
            kotlin.jvm.internal.h.d(r3, r4)
            goto L_0x000f
        L_0x000e:
            r3 = 0
        L_0x000f:
            r2.getClass()
            com.spotify.player.esperanto.proto.EsStop$StopRequest$a r4 = com.spotify.player.esperanto.proto.EsStop$StopRequest.i()
            com.spotify.player.internal.a r0 = r2.b
            com.google.common.base.Optional r3 = r3.loggingParams()
            java.lang.String r1 = "command.loggingParams()"
            kotlin.jvm.internal.h.d(r3, r1)
            com.spotify.player.model.command.options.LoggingParams r3 = r0.c(r3)
            java.lang.String r0 = "loggingParamsFactory.dec…(command.loggingParams())"
            kotlin.jvm.internal.h.d(r3, r0)
            com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams r3 = com.spotify.paste.widgets.b.g(r3)
            r4.m(r3)
            com.spotify.player.esperanto.proto.k$b r2 = r2.a
            com.google.protobuf.GeneratedMessageLite r3 = r4.build()
            com.spotify.player.esperanto.proto.EsStop$StopRequest r3 = (com.spotify.player.esperanto.proto.EsStop$StopRequest) r3
            io.reactivex.z r2 = r2.f(r3)
            com.spotify.player.controls.EsperantoPlayerControls$stop$1 r3 = com.spotify.player.controls.EsperantoPlayerControls$stop$1.a
            if (r3 == 0) goto L_0x0047
            com.spotify.player.controls.b r4 = new com.spotify.player.controls.b
            r4.<init>(r3)
            r3 = r4
        L_0x0047:
            io.reactivex.functions.l r3 = (io.reactivex.functions.l) r3
            io.reactivex.z r2 = r2.A(r3)
            java.lang.String r3 = "playerClient.Stop(reques…::commandResultFromProto)"
            kotlin.jvm.internal.h.d(r2, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.player.controls.EsperantoPlayerControls.q(com.spotify.player.controls.EsperantoPlayerControls, com.spotify.player.model.command.StopCommand, int):io.reactivex.z");
    }

    @Override // com.spotify.player.controls.d
    public z<zwd> a(c cVar) {
        kotlin.jvm.internal.h.e(cVar, "playerControlCommand");
        Object a2 = cVar.a(new c(this), new d(this), new e(this), new f(this), new g(this), new h(this), new i(this), new j(this), new k(this), new a(this), new b(this));
        kotlin.jvm.internal.h.d(a2, "playerControlCommand.map…     { stop() }\n        )");
        return (z) a2;
    }
}
