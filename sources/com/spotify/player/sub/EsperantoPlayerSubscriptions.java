package com.spotify.player.sub;

import com.spotify.player.esperanto.proto.k;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import kotlin.jvm.internal.h;

public final class EsperantoPlayerSubscriptions implements l {
    private final k.b a;

    public EsperantoPlayerSubscriptions(k.b bVar) {
        h.e(bVar, "playerClient");
        this.a = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.spotify.player.sub.i] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.spotify.player.sub.l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public io.reactivex.g<com.spotify.player.model.PlayerState> a(int r5, int r6) {
        /*
            r4 = this;
            if (r5 < 0) goto L_0x0046
            if (r6 < 0) goto L_0x0046
            com.spotify.player.esperanto.proto.EsGetStateRequest$GetStateRequest$a r0 = com.spotify.player.esperanto.proto.EsGetStateRequest$GetStateRequest.l()
            com.spotify.player.esperanto.proto.EsOptional$OptionalInt64$a r1 = com.spotify.player.esperanto.proto.EsOptional$OptionalInt64.m()
            long r2 = (long) r5
            r1.m(r2)
            r0.n(r1)
            com.spotify.player.esperanto.proto.EsOptional$OptionalInt64$a r5 = com.spotify.player.esperanto.proto.EsOptional$OptionalInt64.m()
            long r1 = (long) r6
            r5.m(r1)
            r0.m(r5)
            com.google.protobuf.GeneratedMessageLite r5 = r0.build()
            com.spotify.player.esperanto.proto.EsGetStateRequest$GetStateRequest r5 = (com.spotify.player.esperanto.proto.EsGetStateRequest$GetStateRequest) r5
            com.spotify.player.esperanto.proto.k$b r6 = r4.a
            io.reactivex.s r5 = r6.b(r5)
            com.spotify.player.sub.EsperantoPlayerSubscriptions$playerState$1 r6 = com.spotify.player.sub.EsperantoPlayerSubscriptions$playerState$1.a
            if (r6 == 0) goto L_0x0034
            com.spotify.player.sub.i r0 = new com.spotify.player.sub.i
            r0.<init>(r6)
            r6 = r0
        L_0x0034:
            io.reactivex.functions.l r6 = (io.reactivex.functions.l) r6
            io.reactivex.s r5 = r5.j0(r6)
            io.reactivex.BackpressureStrategy r6 = io.reactivex.BackpressureStrategy.LATEST
            io.reactivex.g r5 = r5.Y0(r6)
            java.lang.String r6 = "playerClient.GetState(re…kpressureStrategy.LATEST)"
            kotlin.jvm.internal.h.d(r5, r6)
            return r5
        L_0x0046:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Cap under zero"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.player.sub.EsperantoPlayerSubscriptions.a(int, int):io.reactivex.g");
    }

    @Override // com.spotify.player.sub.l
    public g<PlayerState> d() {
        return a(2, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.spotify.player.sub.i] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.spotify.player.sub.l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public io.reactivex.s<com.spotify.player.model.PlayerError> error() {
        /*
            r3 = this;
            com.spotify.player.esperanto.proto.k$b r0 = r3.a
            com.spotify.player.esperanto.proto.EsGetErrorRequest$GetErrorRequest r1 = com.spotify.player.esperanto.proto.EsGetErrorRequest$GetErrorRequest.h()
            io.reactivex.s r0 = r0.k(r1)
            com.spotify.player.sub.EsperantoPlayerSubscriptions$error$1 r1 = com.spotify.player.sub.EsperantoPlayerSubscriptions$error$1.a
            if (r1 == 0) goto L_0x0014
            com.spotify.player.sub.i r2 = new com.spotify.player.sub.i
            r2.<init>(r1)
            r1 = r2
        L_0x0014:
            io.reactivex.functions.l r1 = (io.reactivex.functions.l) r1
            io.reactivex.s r0 = r0.j0(r1)
            java.lang.String r1 = "playerClient.GetError(Es…p(::playerErrorFromProto)"
            kotlin.jvm.internal.h.d(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.player.sub.EsperantoPlayerSubscriptions.error():io.reactivex.s");
    }
}
