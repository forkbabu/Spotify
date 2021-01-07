package com.spotify.player.options;

import com.spotify.player.esperanto.proto.k;
import com.spotify.player.internal.a;
import io.reactivex.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

public final class c implements d {
    private final k.b a;
    private final a b;

    public c(k.b bVar, a aVar) {
        h.e(bVar, "playerClient");
        h.e(aVar, "loggingParamsFactory");
        this.a = bVar;
        this.b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.spotify.player.options.b] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final io.reactivex.z<defpackage.zwd> b(boolean r4, boolean r5) {
        /*
            r3 = this;
            com.spotify.player.model.command.SetOptionsCommand$Builder r0 = com.spotify.player.model.command.SetOptionsCommand.builder()
            com.spotify.player.model.command.SetOptionsCommand$Builder r4 = r0.repeatingContext(r4)
            com.spotify.player.model.command.SetOptionsCommand$Builder r4 = r4.repeatingTrack(r5)
            com.spotify.player.model.command.SetOptionsCommand r4 = r4.build()
            java.lang.String r5 = "setOptionsCommand"
            kotlin.jvm.internal.h.d(r4, r5)
            java.lang.String r5 = "command"
            kotlin.jvm.internal.h.e(r4, r5)
            com.spotify.player.esperanto.proto.EsSetOptions$SetOptionsRequest$a r5 = com.spotify.player.esperanto.proto.EsSetOptions$SetOptionsRequest.o()
            com.google.common.base.Optional r0 = r4.repeatingContext()
            java.lang.String r1 = "command.repeatingContext()"
            kotlin.jvm.internal.h.d(r0, r1)
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto L_0x0050
            com.spotify.player.esperanto.proto.EsOptional$OptionalBoolean$a r0 = com.spotify.player.esperanto.proto.EsOptional$OptionalBoolean.i()
            com.google.common.base.Optional r1 = r4.repeatingContext()
            java.lang.Object r1 = r1.get()
            java.lang.String r2 = "command.repeatingContext().get()"
            kotlin.jvm.internal.h.d(r1, r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.m(r1)
            com.google.protobuf.GeneratedMessageLite r0 = r0.build()
            com.spotify.player.esperanto.proto.EsOptional$OptionalBoolean r0 = (com.spotify.player.esperanto.proto.EsOptional$OptionalBoolean) r0
            r5.o(r0)
        L_0x0050:
            com.google.common.base.Optional r0 = r4.repeatingTrack()
            java.lang.String r1 = "command.repeatingTrack()"
            kotlin.jvm.internal.h.d(r0, r1)
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto L_0x0082
            com.spotify.player.esperanto.proto.EsOptional$OptionalBoolean$a r0 = com.spotify.player.esperanto.proto.EsOptional$OptionalBoolean.i()
            com.google.common.base.Optional r1 = r4.repeatingTrack()
            java.lang.Object r1 = r1.get()
            java.lang.String r2 = "command.repeatingTrack().get()"
            kotlin.jvm.internal.h.d(r1, r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.m(r1)
            com.google.protobuf.GeneratedMessageLite r0 = r0.build()
            com.spotify.player.esperanto.proto.EsOptional$OptionalBoolean r0 = (com.spotify.player.esperanto.proto.EsOptional$OptionalBoolean) r0
            r5.p(r0)
        L_0x0082:
            com.google.common.base.Optional r0 = r4.shufflingContext()
            java.lang.String r1 = "command.shufflingContext()"
            kotlin.jvm.internal.h.d(r0, r1)
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto L_0x00b4
            com.spotify.player.esperanto.proto.EsOptional$OptionalBoolean$a r0 = com.spotify.player.esperanto.proto.EsOptional$OptionalBoolean.i()
            com.google.common.base.Optional r1 = r4.shufflingContext()
            java.lang.Object r1 = r1.get()
            java.lang.String r2 = "command.shufflingContext().get()"
            kotlin.jvm.internal.h.d(r1, r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.m(r1)
            com.google.protobuf.GeneratedMessageLite r0 = r0.build()
            com.spotify.player.esperanto.proto.EsOptional$OptionalBoolean r0 = (com.spotify.player.esperanto.proto.EsOptional$OptionalBoolean) r0
            r5.q(r0)
        L_0x00b4:
            com.google.common.base.Optional r0 = r4.options()
            java.lang.String r1 = "command.options()"
            kotlin.jvm.internal.h.d(r0, r1)
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto L_0x00d9
            com.google.common.base.Optional r0 = r4.options()
            java.lang.Object r0 = r0.get()
            java.lang.String r1 = "command.options().get()"
            kotlin.jvm.internal.h.d(r0, r1)
            com.spotify.player.model.command.options.CommandOptions r0 = (com.spotify.player.model.command.options.CommandOptions) r0
            com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions r0 = com.spotify.paste.widgets.b.a(r0)
            r5.n(r0)
        L_0x00d9:
            com.spotify.player.internal.a r0 = r3.b
            com.google.common.base.Optional r4 = r4.loggingParams()
            java.lang.String r1 = "command.loggingParams()"
            kotlin.jvm.internal.h.d(r4, r1)
            com.spotify.player.model.command.options.LoggingParams r4 = r0.c(r4)
            java.lang.String r0 = "loggingParamsFactory.dec…(command.loggingParams())"
            kotlin.jvm.internal.h.d(r4, r0)
            com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams r4 = com.spotify.paste.widgets.b.g(r4)
            r5.m(r4)
            com.spotify.player.esperanto.proto.k$b r4 = r3.a
            com.google.protobuf.GeneratedMessageLite r5 = r5.build()
            com.spotify.player.esperanto.proto.EsSetOptions$SetOptionsRequest r5 = (com.spotify.player.esperanto.proto.EsSetOptions$SetOptionsRequest) r5
            io.reactivex.z r4 = r4.g(r5)
            com.spotify.player.options.EsperantoPlayerOptions$setOptions$1 r5 = com.spotify.player.options.EsperantoPlayerOptions$setOptions$1.a
            if (r5 == 0) goto L_0x010a
            com.spotify.player.options.b r0 = new com.spotify.player.options.b
            r0.<init>(r5)
            r5 = r0
        L_0x010a:
            io.reactivex.functions.l r5 = (io.reactivex.functions.l) r5
            io.reactivex.z r4 = r4.A(r5)
            java.lang.String r5 = "playerClient.SetOptions(…::commandResultFromProto)"
            kotlin.jvm.internal.h.d(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.player.options.c.b(boolean, boolean):io.reactivex.z");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.spotify.player.options.b] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.spotify.player.options.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public io.reactivex.z<defpackage.zwd> a(boolean r4) {
        /*
            r3 = this;
            com.spotify.player.model.command.SetShufflingContextCommand r4 = com.spotify.player.model.command.SetShufflingContextCommand.create(r4)
            java.lang.String r0 = "SetShufflingContextCommand.create(enabled)"
            kotlin.jvm.internal.h.d(r4, r0)
            java.lang.String r0 = "command"
            kotlin.jvm.internal.h.e(r4, r0)
            com.spotify.player.esperanto.proto.EsSetShufflingContext$SetShufflingContextRequest$a r0 = com.spotify.player.esperanto.proto.EsSetShufflingContext$SetShufflingContextRequest.m()
            boolean r1 = r4.value()
            r0.o(r1)
            com.google.common.base.Optional r1 = r4.options()
            java.lang.String r2 = "command.options()"
            kotlin.jvm.internal.h.d(r1, r2)
            boolean r1 = r1.isPresent()
            if (r1 == 0) goto L_0x003e
            com.google.common.base.Optional r1 = r4.options()
            java.lang.Object r1 = r1.get()
            java.lang.String r2 = "command.options().get()"
            kotlin.jvm.internal.h.d(r1, r2)
            com.spotify.player.model.command.options.CommandOptions r1 = (com.spotify.player.model.command.options.CommandOptions) r1
            com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions r1 = com.spotify.paste.widgets.b.a(r1)
            r0.n(r1)
        L_0x003e:
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
            com.spotify.player.esperanto.proto.EsSetShufflingContext$SetShufflingContextRequest r0 = (com.spotify.player.esperanto.proto.EsSetShufflingContext$SetShufflingContextRequest) r0
            io.reactivex.z r4 = r4.c(r0)
            com.spotify.player.options.EsperantoPlayerOptions$setShufflingContext$1 r0 = com.spotify.player.options.EsperantoPlayerOptions$setShufflingContext$1.a
            if (r0 == 0) goto L_0x006f
            com.spotify.player.options.b r1 = new com.spotify.player.options.b
            r1.<init>(r0)
            r0 = r1
        L_0x006f:
            io.reactivex.functions.l r0 = (io.reactivex.functions.l) r0
            io.reactivex.z r4 = r4.A(r0)
            java.lang.String r0 = "playerClient.SetShufflin…::commandResultFromProto)"
            kotlin.jvm.internal.h.d(r4, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.player.options.c.a(boolean):io.reactivex.z");
    }

    @Override // com.spotify.player.options.d
    public z<zwd> setRepeatMode(RepeatMode repeatMode) {
        h.e(repeatMode, "repeatMode");
        int ordinal = repeatMode.ordinal();
        if (ordinal == 0) {
            return b(false, false);
        }
        if (ordinal == 1) {
            return b(true, false);
        }
        if (ordinal == 2) {
            return b(true, true);
        }
        throw new NoWhenBranchMatchedException();
    }
}
