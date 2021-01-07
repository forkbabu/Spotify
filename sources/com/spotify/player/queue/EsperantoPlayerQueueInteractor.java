package com.spotify.player.queue;

import com.spotify.player.esperanto.proto.k;
import com.spotify.player.internal.a;
import com.spotify.player.model.PlayerQueue;
import io.reactivex.g;

public final class EsperantoPlayerQueueInteractor implements f {
    private final g<PlayerQueue> a;
    private final k.b b;
    private final a c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.spotify.player.queue.e] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EsperantoPlayerQueueInteractor(com.spotify.player.esperanto.proto.k.b r2, com.spotify.player.internal.a r3) {
        /*
            r1 = this;
            java.lang.String r0 = "playerClient"
            kotlin.jvm.internal.h.e(r2, r0)
            java.lang.String r0 = "loggingParamsFactory"
            kotlin.jvm.internal.h.e(r3, r0)
            r1.<init>()
            r1.b = r2
            r1.c = r3
            com.spotify.player.esperanto.proto.EsGetQueueRequest$GetQueueRequest r3 = com.spotify.player.esperanto.proto.EsGetQueueRequest$GetQueueRequest.h()
            io.reactivex.s r2 = r2.e(r3)
            com.spotify.player.queue.EsperantoPlayerQueueInteractor$playerQueueFlowable$1 r3 = com.spotify.player.queue.EsperantoPlayerQueueInteractor$playerQueueFlowable$1.a
            if (r3 == 0) goto L_0x0023
            com.spotify.player.queue.e r0 = new com.spotify.player.queue.e
            r0.<init>(r3)
            r3 = r0
        L_0x0023:
            io.reactivex.functions.l r3 = (io.reactivex.functions.l) r3
            io.reactivex.s r2 = r2.j0(r3)
            io.reactivex.BackpressureStrategy r3 = io.reactivex.BackpressureStrategy.LATEST
            io.reactivex.g r2 = r2.Y0(r3)
            r3 = 1
            io.reactivex.flowables.a r2 = r2.V(r3)
            io.reactivex.g r2 = r2.r0()
            java.lang.String r3 = "playerClient.GetQueue(Es…)\n            .refCount()"
            kotlin.jvm.internal.h.d(r2, r3)
            r1.a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.player.queue.EsperantoPlayerQueueInteractor.<init>(com.spotify.player.esperanto.proto.k$b, com.spotify.player.internal.a):void");
    }

    @Override // com.spotify.player.queue.f
    public g<PlayerQueue> a() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.spotify.player.queue.e] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.spotify.player.queue.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public io.reactivex.z<defpackage.zwd> b(com.spotify.player.model.command.SetQueueCommand r6) {
        /*
            r5 = this;
            java.lang.String r0 = "command"
            kotlin.jvm.internal.h.e(r6, r0)
            com.spotify.player.esperanto.proto.EsSetQueueRequest$SetQueueRequest$a r0 = com.spotify.player.esperanto.proto.EsSetQueueRequest$SetQueueRequest.o()
            com.google.common.base.Optional r1 = r6.options()
            java.lang.String r2 = "command.options()"
            kotlin.jvm.internal.h.d(r1, r2)
            boolean r1 = r1.isPresent()
            if (r1 == 0) goto L_0x002e
            com.google.common.base.Optional r1 = r6.options()
            java.lang.Object r1 = r1.get()
            java.lang.String r2 = "command.options().get()"
            kotlin.jvm.internal.h.d(r1, r2)
            com.spotify.player.model.command.options.CommandOptions r1 = (com.spotify.player.model.command.options.CommandOptions) r1
            com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions r1 = com.spotify.paste.widgets.b.a(r1)
            r0.p(r1)
        L_0x002e:
            java.lang.String r1 = r6.queueRevision()     // Catch:{ NumberFormatException -> 0x00d7 }
            java.lang.String r2 = "command.queueRevision()"
            kotlin.jvm.internal.h.d(r1, r2)     // Catch:{ NumberFormatException -> 0x00d7 }
            long r1 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x00d7 }
            r0.q(r1)     // Catch:{ NumberFormatException -> 0x00d7 }
            com.spotify.player.internal.a r1 = r5.c
            com.google.common.base.Optional r2 = r6.loggingParams()
            java.lang.String r3 = "command.loggingParams()"
            kotlin.jvm.internal.h.d(r2, r3)
            com.spotify.player.model.command.options.LoggingParams r1 = r1.c(r2)
            java.lang.String r2 = "loggingParamsFactory.dec…(command.loggingParams())"
            kotlin.jvm.internal.h.d(r1, r2)
            com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams r1 = com.spotify.paste.widgets.b.g(r1)
            r0.o(r1)
            com.google.common.collect.ImmutableList r1 = r6.nextTracks()
            java.lang.String r2 = "command.nextTracks()"
            kotlin.jvm.internal.h.d(r1, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r4 = kotlin.collections.d.e(r1, r3)
            r2.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x0071:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0085
            java.lang.Object r4 = r1.next()
            com.spotify.player.model.ContextTrack r4 = (com.spotify.player.model.ContextTrack) r4
            com.spotify.player.esperanto.proto.EsProvidedTrack$ProvidedTrack r4 = com.spotify.paste.widgets.b.d(r4)
            r2.add(r4)
            goto L_0x0071
        L_0x0085:
            r0.m(r2)
            com.google.common.collect.ImmutableList r6 = r6.prevTracks()
            java.lang.String r1 = "command.prevTracks()"
            kotlin.jvm.internal.h.d(r6, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.d.e(r6, r3)
            r1.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L_0x009e:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x00b2
            java.lang.Object r2 = r6.next()
            com.spotify.player.model.ContextTrack r2 = (com.spotify.player.model.ContextTrack) r2
            com.spotify.player.esperanto.proto.EsProvidedTrack$ProvidedTrack r2 = com.spotify.paste.widgets.b.d(r2)
            r1.add(r2)
            goto L_0x009e
        L_0x00b2:
            r0.n(r1)
            com.spotify.player.esperanto.proto.k$b r6 = r5.b
            com.google.protobuf.GeneratedMessageLite r0 = r0.build()
            com.spotify.player.esperanto.proto.EsSetQueueRequest$SetQueueRequest r0 = (com.spotify.player.esperanto.proto.EsSetQueueRequest$SetQueueRequest) r0
            io.reactivex.z r6 = r6.n(r0)
            com.spotify.player.queue.EsperantoPlayerQueueInteractor$setQueue$3 r0 = com.spotify.player.queue.EsperantoPlayerQueueInteractor$setQueue$3.a
            if (r0 == 0) goto L_0x00cb
            com.spotify.player.queue.e r1 = new com.spotify.player.queue.e
            r1.<init>(r0)
            r0 = r1
        L_0x00cb:
            io.reactivex.functions.l r0 = (io.reactivex.functions.l) r0
            io.reactivex.z r6 = r6.A(r0)
            java.lang.String r0 = "playerClient.SetQueue(re…::commandResultFromProto)"
            kotlin.jvm.internal.h.d(r6, r0)
            return r6
        L_0x00d7:
            java.lang.String r6 = "Invalid revision"
            zwd r6 = defpackage.zwd.a(r6)
            io.reactivex.z r6 = io.reactivex.z.z(r6)
            java.lang.String r0 = "Single.just(CommandResul…lure(\"Invalid revision\"))"
            kotlin.jvm.internal.h.d(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.player.queue.EsperantoPlayerQueueInteractor.b(com.spotify.player.model.command.SetQueueCommand):io.reactivex.z");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.spotify.player.queue.e] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.spotify.player.queue.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public io.reactivex.z<defpackage.zwd> c(com.spotify.player.model.ContextTrack r5) {
        /*
            r4 = this;
            java.lang.String r0 = "track"
            kotlin.jvm.internal.h.e(r5, r0)
            com.spotify.player.model.command.AddToQueueCommand r5 = com.spotify.player.model.command.AddToQueueCommand.create(r5)
            java.lang.String r0 = "AddToQueueCommand.create(track)"
            kotlin.jvm.internal.h.d(r5, r0)
            java.lang.String r0 = "command"
            kotlin.jvm.internal.h.e(r5, r0)
            com.spotify.player.esperanto.proto.EsAddToQueueRequest$AddToQueueRequest$a r0 = com.spotify.player.esperanto.proto.EsAddToQueueRequest$AddToQueueRequest.m()
            com.google.common.base.Optional r1 = r5.options()
            java.lang.String r2 = "command.options()"
            kotlin.jvm.internal.h.d(r1, r2)
            boolean r1 = r1.isPresent()
            if (r1 == 0) goto L_0x003c
            com.google.common.base.Optional r1 = r5.options()
            java.lang.Object r1 = r1.get()
            java.lang.String r2 = "command.options().get()"
            kotlin.jvm.internal.h.d(r1, r2)
            com.spotify.player.model.command.options.CommandOptions r1 = (com.spotify.player.model.command.options.CommandOptions) r1
            com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions r1 = com.spotify.paste.widgets.b.a(r1)
            r0.n(r1)
        L_0x003c:
            com.spotify.player.internal.a r1 = r4.c
            com.google.common.base.Optional r2 = r5.loggingParams()
            java.lang.String r3 = "command.loggingParams()"
            kotlin.jvm.internal.h.d(r2, r3)
            com.spotify.player.model.command.options.LoggingParams r1 = r1.c(r2)
            java.lang.String r2 = "loggingParamsFactory.dec…(command.loggingParams())"
            kotlin.jvm.internal.h.d(r1, r2)
            com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams r1 = com.spotify.paste.widgets.b.g(r1)
            r0.m(r1)
            com.spotify.player.model.ContextTrack r5 = r5.track()
            java.lang.String r1 = "command.track()"
            kotlin.jvm.internal.h.d(r5, r1)
            com.spotify.player.esperanto.proto.EsContextTrack$ContextTrack r5 = com.spotify.paste.widgets.b.c(r5)
            r0.o(r5)
            com.spotify.player.esperanto.proto.k$b r5 = r4.b
            com.google.protobuf.GeneratedMessageLite r0 = r0.build()
            com.spotify.player.esperanto.proto.EsAddToQueueRequest$AddToQueueRequest r0 = (com.spotify.player.esperanto.proto.EsAddToQueueRequest$AddToQueueRequest) r0
            io.reactivex.z r5 = r5.m(r0)
            com.spotify.player.queue.EsperantoPlayerQueueInteractor$addToQueue$1 r0 = com.spotify.player.queue.EsperantoPlayerQueueInteractor$addToQueue$1.a
            if (r0 == 0) goto L_0x007d
            com.spotify.player.queue.e r1 = new com.spotify.player.queue.e
            r1.<init>(r0)
            r0 = r1
        L_0x007d:
            io.reactivex.functions.l r0 = (io.reactivex.functions.l) r0
            io.reactivex.z r5 = r5.A(r0)
            java.lang.String r0 = "playerClient.AddToQueue(…::commandResultFromProto)"
            kotlin.jvm.internal.h.d(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.player.queue.EsperantoPlayerQueueInteractor.c(com.spotify.player.model.ContextTrack):io.reactivex.z");
    }
}
