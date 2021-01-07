package com.spotify.player.play;

import com.google.common.base.Optional;
import com.google.protobuf.GeneratedMessageLite;
import com.spotify.player.esperanto.proto.EsPreparePlay$PreparePlayRequest;
import com.spotify.player.esperanto.proto.EsSessionResponse$SessionResponse;
import com.spotify.player.esperanto.proto.k;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PreparePlayCommand;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.proto.b;
import io.reactivex.functions.l;
import io.reactivex.z;
import kotlin.jvm.internal.h;

public final class EsperantoPlayer implements f {
    private final k.b a;
    private final com.spotify.player.internal.a b;
    private final pxd c;

    static final class a<T, R> implements l<EsSessionResponse$SessionResponse, g> {
        final /* synthetic */ EsperantoPlayer a;

        a(EsperantoPlayer esperantoPlayer) {
            this.a = esperantoPlayer;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public g apply(EsSessionResponse$SessionResponse esSessionResponse$SessionResponse) {
            EsSessionResponse$SessionResponse esSessionResponse$SessionResponse2 = esSessionResponse$SessionResponse;
            h.e(esSessionResponse$SessionResponse2, "response");
            k.b bVar = this.a.a;
            com.spotify.player.internal.a aVar = this.a.b;
            String h = esSessionResponse$SessionResponse2.h();
            h.d(h, "response.sessionId");
            return new e(bVar, aVar, h);
        }
    }

    public EsperantoPlayer(k.b bVar, com.spotify.player.internal.a aVar, pxd pxd) {
        h.e(bVar, "playerClient");
        h.e(aVar, "loggingParamsFactory");
        h.e(pxd, "serializer");
        this.a = bVar;
        this.b = aVar;
        this.c = pxd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.spotify.player.play.c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.spotify.player.play.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public io.reactivex.z<defpackage.zwd> a(com.spotify.player.model.command.PlayCommand r6) {
        /*
            r5 = this;
            java.lang.String r0 = "playCommand"
            kotlin.jvm.internal.h.e(r6, r0)
            com.spotify.player.esperanto.proto.k$b r0 = r5.a
            com.spotify.player.esperanto.proto.EsPlay$PlayRequest$a r1 = com.spotify.player.esperanto.proto.EsPlay$PlayRequest.m()
            com.spotify.player.esperanto.proto.EsPreparePlay$PreparePlayRequest$a r2 = com.spotify.player.esperanto.proto.EsPreparePlay$PreparePlayRequest.m()
            com.spotify.player.model.Context r3 = r6.context()
            java.lang.String r4 = "command.context()"
            kotlin.jvm.internal.h.d(r3, r4)
            com.spotify.player.esperanto.proto.EsContext$Context r3 = com.spotify.player.proto.b.a(r3)
            r2.m(r3)
            com.spotify.player.model.PlayOrigin r3 = r6.playOrigin()
            java.lang.String r4 = "command.playOrigin()"
            kotlin.jvm.internal.h.d(r3, r4)
            com.spotify.player.esperanto.proto.EsPlayOrigin$PlayOrigin r3 = com.spotify.paste.widgets.b.i(r3)
            r2.o(r3)
            com.google.common.base.Optional r3 = r6.options()
            java.lang.String r4 = "command.options()"
            kotlin.jvm.internal.h.d(r3, r4)
            boolean r3 = r3.isPresent()
            if (r3 == 0) goto L_0x0056
            com.google.common.base.Optional r3 = r6.options()
            java.lang.Object r3 = r3.get()
            java.lang.String r4 = "command.options().get()"
            kotlin.jvm.internal.h.d(r3, r4)
            com.spotify.player.model.command.options.PreparePlayOptions r3 = (com.spotify.player.model.command.options.PreparePlayOptions) r3
            pxd r4 = r5.c
            com.spotify.player.esperanto.proto.EsPreparePlayOptions$PreparePlayOptions r3 = com.spotify.player.proto.b.b(r3, r4)
            r2.n(r3)
        L_0x0056:
            com.google.protobuf.GeneratedMessageLite r2 = r2.build()
            com.spotify.player.esperanto.proto.EsPreparePlay$PreparePlayRequest r2 = (com.spotify.player.esperanto.proto.EsPreparePlay$PreparePlayRequest) r2
            r1.o(r2)
            com.google.common.base.Optional r2 = r6.playOptions()
            java.lang.String r3 = "command.playOptions()"
            kotlin.jvm.internal.h.d(r2, r3)
            boolean r2 = r2.isPresent()
            if (r2 == 0) goto L_0x0084
            com.google.common.base.Optional r2 = r6.playOptions()
            java.lang.Object r2 = r2.get()
            java.lang.String r3 = "command.playOptions().get()"
            kotlin.jvm.internal.h.d(r2, r3)
            com.spotify.player.model.command.options.PlayOptions r2 = (com.spotify.player.model.command.options.PlayOptions) r2
            com.spotify.player.esperanto.proto.EsPlayOptions$PlayOptions r2 = com.spotify.paste.widgets.b.h(r2)
            r1.n(r2)
        L_0x0084:
            com.spotify.player.internal.a r2 = r5.b
            com.google.common.base.Optional r6 = r6.loggingParams()
            java.lang.String r3 = "command.loggingParams()"
            kotlin.jvm.internal.h.d(r6, r3)
            com.spotify.player.model.command.options.LoggingParams r6 = r2.c(r6)
            java.lang.String r2 = "loggingParamsFactory.dec…(command.loggingParams())"
            kotlin.jvm.internal.h.d(r6, r2)
            com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams r6 = com.spotify.paste.widgets.b.g(r6)
            r1.m(r6)
            com.google.protobuf.GeneratedMessageLite r6 = r1.build()
            java.lang.String r1 = "EsPlay.PlayRequest.newBu…ams()))\n        }.build()"
            kotlin.jvm.internal.h.d(r6, r1)
            com.spotify.player.esperanto.proto.EsPlay$PlayRequest r6 = (com.spotify.player.esperanto.proto.EsPlay$PlayRequest) r6
            io.reactivex.z r6 = r0.d(r6)
            com.spotify.player.play.EsperantoPlayer$play$1 r0 = com.spotify.player.play.EsperantoPlayer$play$1.a
            if (r0 == 0) goto L_0x00b8
            com.spotify.player.play.c r1 = new com.spotify.player.play.c
            r1.<init>(r0)
            r0 = r1
        L_0x00b8:
            io.reactivex.functions.l r0 = (io.reactivex.functions.l) r0
            io.reactivex.z r6 = r6.A(r0)
            java.lang.String r0 = "playerClient.Play(playCo…::commandResultFromProto)"
            kotlin.jvm.internal.h.d(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.player.play.EsperantoPlayer.a(com.spotify.player.model.command.PlayCommand):io.reactivex.z");
    }

    @Override // com.spotify.player.play.f
    public z<g> b(PreparePlayCommand preparePlayCommand) {
        h.e(preparePlayCommand, "preparePlayCommand");
        k.b bVar = this.a;
        pxd pxd = this.c;
        h.e(preparePlayCommand, "preparePlayCommand");
        h.e(pxd, "serializer");
        EsPreparePlay$PreparePlayRequest.a m = EsPreparePlay$PreparePlayRequest.m();
        Context context = preparePlayCommand.context();
        h.d(context, "preparePlayCommand.context()");
        m.m(b.a(context));
        Optional<PreparePlayOptions> options = preparePlayCommand.options();
        h.d(options, "preparePlayCommand.options()");
        if (options.isPresent()) {
            PreparePlayOptions preparePlayOptions = preparePlayCommand.options().get();
            h.d(preparePlayOptions, "preparePlayCommand.options().get()");
            m.n(b.b(preparePlayOptions, pxd));
        }
        PlayOrigin playOrigin = preparePlayCommand.playOrigin();
        h.d(playOrigin, "preparePlayCommand.playOrigin()");
        m.o(com.spotify.paste.widgets.b.i(playOrigin));
        GeneratedMessageLite build = m.build();
        h.d(build, "EsPreparePlay.PreparePla…igin())\n        }.build()");
        z<R> A = bVar.a((EsPreparePlay$PreparePlayRequest) build).A(new a(this));
        h.d(A, "playerClient.PreparePlay….sessionId)\n            }");
        return A;
    }
}
