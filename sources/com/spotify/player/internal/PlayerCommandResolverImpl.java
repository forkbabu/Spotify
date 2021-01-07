package com.spotify.player.internal;

import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.cosmos.router.RxRouter;
import defpackage.pxd;
import io.reactivex.internal.operators.observable.m0;
import io.reactivex.s;
import io.reactivex.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.h;

public final class PlayerCommandResolverImpl implements c {
    private final RxRouter a;
    private final pxd b;

    public PlayerCommandResolverImpl(RxRouter rxRouter, pxd pxd) {
        h.e(rxRouter, "rxRouter");
        h.e(pxd, "serializer");
        this.a = rxRouter;
        this.b = pxd;
    }

    private final <T> z<Response> c(String str, String str2, T t) {
        pxd.a<byte[]> b2 = this.b.b(t);
        if (b2 instanceof pxd.a.b) {
            s<Response> resolve = this.a.resolve(new Request(str, str2, EmptyMap.a, (byte[]) ((pxd.a.b) b2).a()));
            if (resolve != null) {
                m0 m0Var = new m0(resolve, null);
                h.d(m0Var, "Single.fromObservable(rxRouter.resolve(request))");
                return m0Var;
            }
            throw new NullPointerException("observableSource is null");
        } else if (b2 instanceof pxd.a.C0670a) {
            z<Response> q = z.q(new PlayerInternalError(new Throwable(((pxd.a.C0670a) b2).a())));
            h.d(q, "Single.error(PlayerInter…hrowable(result.reason)))");
            return q;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.spotify.player.internal.d] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.spotify.player.internal.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public io.reactivex.z<defpackage.zwd> a(java.lang.String r3, com.spotify.player.model.command.Command r4) {
        /*
            r2 = this;
            java.lang.String r0 = "endpoint"
            kotlin.jvm.internal.h.e(r3, r0)
            java.lang.String r0 = "command"
            kotlin.jvm.internal.h.e(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "sp://player/v2/main/"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "PUT"
            io.reactivex.z r3 = r2.c(r0, r3, r4)
            com.spotify.player.internal.PlayerCommandResolverImpl$put$1 r4 = com.spotify.player.internal.PlayerCommandResolverImpl$put$1.a
            if (r4 == 0) goto L_0x002b
            com.spotify.player.internal.d r0 = new com.spotify.player.internal.d
            r0.<init>(r4)
            r4 = r0
        L_0x002b:
            io.reactivex.functions.l r4 = (io.reactivex.functions.l) r4
            io.reactivex.z r3 = r3.A(r4)
            java.lang.String r4 = "resolve(PUT, \"$PLAYER_UR…map(::parseCommandResult)"
            kotlin.jvm.internal.h.d(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.player.internal.PlayerCommandResolverImpl.a(java.lang.String, com.spotify.player.model.command.Command):io.reactivex.z");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.spotify.player.internal.d] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.spotify.player.internal.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public io.reactivex.z<defpackage.zwd> b(java.lang.String r3, com.spotify.player.model.command.Command r4) {
        /*
            r2 = this;
            java.lang.String r0 = "endpoint"
            kotlin.jvm.internal.h.e(r3, r0)
            java.lang.String r0 = "command"
            kotlin.jvm.internal.h.e(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "sp://player/v2/main/"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "POST"
            io.reactivex.z r3 = r2.c(r0, r3, r4)
            com.spotify.player.internal.PlayerCommandResolverImpl$post$1 r4 = com.spotify.player.internal.PlayerCommandResolverImpl$post$1.a
            if (r4 == 0) goto L_0x002b
            com.spotify.player.internal.d r0 = new com.spotify.player.internal.d
            r0.<init>(r4)
            r4 = r0
        L_0x002b:
            io.reactivex.functions.l r4 = (io.reactivex.functions.l) r4
            io.reactivex.z r3 = r3.A(r4)
            java.lang.String r4 = "resolve(POST, \"$PLAYER_U…map(::parseCommandResult)"
            kotlin.jvm.internal.h.d(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.player.internal.PlayerCommandResolverImpl.b(java.lang.String, com.spotify.player.model.command.Command):io.reactivex.z");
    }
}
