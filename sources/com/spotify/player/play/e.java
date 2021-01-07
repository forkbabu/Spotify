package com.spotify.player.play;

import com.spotify.player.esperanto.proto.k;
import com.spotify.player.internal.PlayerInternalError;
import com.spotify.player.internal.a;
import java.util.Arrays;
import kotlin.jvm.internal.h;

public final class e implements g {
    private boolean a;
    private final k.b b;
    private final a c;
    private final String d;

    public e(k.b bVar, a aVar, String str) {
        h.e(bVar, "playerClient");
        h.e(aVar, "loggingParamsFactory");
        h.e(str, "sessionId");
        this.b = bVar;
        this.c = aVar;
        this.d = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.spotify.player.play.d] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.spotify.player.play.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public io.reactivex.z<defpackage.zwd> H() {
        /*
            r5 = this;
            com.spotify.player.model.command.PlaySessionCommand r0 = com.spotify.player.model.command.PlaySessionCommand.create()
            java.lang.String r1 = "PlaySessionCommand.create()"
            kotlin.jvm.internal.h.d(r0, r1)
            java.lang.String r1 = "command"
            kotlin.jvm.internal.h.e(r0, r1)
            com.spotify.player.esperanto.proto.EsPlay$PlayPreparedRequest$a r1 = com.spotify.player.esperanto.proto.EsPlay$PlayPreparedRequest.n()
            java.lang.String r2 = "builder"
            kotlin.jvm.internal.h.d(r1, r2)
            java.lang.String r2 = r5.d
            r1.p(r2)
            com.spotify.player.internal.a r2 = r5.c
            com.google.common.base.Optional r3 = r0.loggingParams()
            java.lang.String r4 = "command.loggingParams()"
            kotlin.jvm.internal.h.d(r3, r4)
            com.spotify.player.model.command.options.LoggingParams r2 = r2.c(r3)
            java.lang.String r3 = "loggingParamsFactory.dec…(command.loggingParams())"
            kotlin.jvm.internal.h.d(r2, r3)
            com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams r2 = com.spotify.paste.widgets.b.g(r2)
            r1.m(r2)
            com.google.common.base.Optional r2 = r0.playOptions()
            java.lang.String r3 = "command.playOptions()"
            kotlin.jvm.internal.h.d(r2, r3)
            boolean r2 = r2.isPresent()
            if (r2 == 0) goto L_0x0076
            com.google.common.base.Optional r2 = r0.playOptions()
            java.lang.Object r2 = r2.get()
            java.lang.String r3 = "command.playOptions().get()"
            kotlin.jvm.internal.h.d(r2, r3)
            com.spotify.player.model.command.options.PlayOptions r2 = (com.spotify.player.model.command.options.PlayOptions) r2
            com.spotify.player.esperanto.proto.EsPlayOptions$PlayOptions r2 = com.spotify.paste.widgets.b.h(r2)
            r1.o(r2)
            com.google.common.base.Optional r0 = r0.playOptions()
            java.lang.Object r0 = r0.get()
            com.spotify.player.model.command.options.PlayOptions r0 = (com.spotify.player.model.command.options.PlayOptions) r0
            com.spotify.player.model.command.options.CommandOptions r0 = r0.commandOptions()
            java.lang.String r2 = "command.playOptions().get().commandOptions()"
            kotlin.jvm.internal.h.d(r0, r2)
            com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions r0 = com.spotify.paste.widgets.b.a(r0)
            r1.n(r0)
        L_0x0076:
            r0 = 1
            r5.a = r0
            com.spotify.player.esperanto.proto.k$b r0 = r5.b
            com.google.protobuf.GeneratedMessageLite r1 = r1.build()
            com.spotify.player.esperanto.proto.EsPlay$PlayPreparedRequest r1 = (com.spotify.player.esperanto.proto.EsPlay$PlayPreparedRequest) r1
            io.reactivex.z r0 = r0.j(r1)
            com.spotify.player.play.EsperantoPreparedSession$play$1 r1 = com.spotify.player.play.EsperantoPreparedSession$play$1.a
            if (r1 == 0) goto L_0x008f
            com.spotify.player.play.d r2 = new com.spotify.player.play.d
            r2.<init>(r1)
            r1 = r2
        L_0x008f:
            io.reactivex.functions.l r1 = (io.reactivex.functions.l) r1
            io.reactivex.z r0 = r0.A(r1)
            java.lang.String r1 = "playerClient.PlayPrepare…::commandResultFromProto)"
            kotlin.jvm.internal.h.d(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.player.play.e.H():io.reactivex.z");
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        if (!this.a) {
            String format = String.format("PreparedSession '%s' has not been destroyed", Arrays.copyOf(new Object[]{this.d}, 1));
            h.d(format, "java.lang.String.format(format, *args)");
            throw new PlayerInternalError(new Throwable(format));
        }
    }
}
