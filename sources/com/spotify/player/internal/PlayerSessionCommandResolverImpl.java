package com.spotify.player.internal;

import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.player.model.PlayerSession;
import com.spotify.player.model.command.PreparePlayCommand;
import defpackage.pxd;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.observable.m0;
import io.reactivex.s;
import io.reactivex.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.h;

public final class PlayerSessionCommandResolverImpl implements g {
    private final RxRouter a;
    private final pxd b;

    static final class a<T, R> implements l<Response, PlayerSession> {
        final /* synthetic */ PlayerSessionCommandResolverImpl a;

        a(PlayerSessionCommandResolverImpl playerSessionCommandResolverImpl) {
            this.a = playerSessionCommandResolverImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public PlayerSession apply(Response response) {
            Response response2 = response;
            h.e(response2, "it");
            pxd pxd = this.a.b;
            h.e(response2, "response");
            h.e(pxd, "serializer");
            if (response2.getStatus() == 200) {
                byte[] body = response2.getBody();
                h.d(body, "response.body");
                pxd.a<T> a2 = pxd.a(body, PlayerSession.class);
                if (a2 instanceof pxd.a.b) {
                    return (PlayerSession) ((pxd.a.b) a2).a();
                }
                if (a2 instanceof pxd.a.C0670a) {
                    throw new PlayerInternalError(new Throwable(((pxd.a.C0670a) a2).a()));
                }
                throw new NoWhenBranchMatchedException();
            }
            StringBuilder V0 = je.V0("Unknown error for ");
            V0.append(response2.getUri());
            V0.append(" with status code ");
            V0.append(response2.getStatus());
            V0.append('!');
            throw new PlayerInternalError(new Throwable(V0.toString()));
        }
    }

    public PlayerSessionCommandResolverImpl(RxRouter rxRouter, pxd pxd) {
        h.e(rxRouter, "rxRouter");
        h.e(pxd, "serializer");
        this.a = rxRouter;
        this.b = pxd;
    }

    private final <T> z<Response> d(String str, T t) {
        pxd.a<byte[]> b2 = this.b.b(t);
        if (b2 instanceof pxd.a.b) {
            s<Response> resolve = this.a.resolve(new Request(Request.POST, str, EmptyMap.a, (byte[]) ((pxd.a.b) b2).a()));
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

    @Override // com.spotify.player.internal.g
    public z<PlayerSession> a(PreparePlayCommand preparePlayCommand) {
        h.e(preparePlayCommand, "command");
        z<R> A = d("sp://player/v2/main/session", preparePlayCommand).A(new a(this));
        h.d(A, "post(CREATE_SESSION_URI,…Session(it, serializer) }");
        return A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.spotify.player.internal.h] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.spotify.player.internal.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public io.reactivex.z<defpackage.zwd> b(java.lang.String r2, com.spotify.player.model.command.PlaySessionCommand r3) {
        /*
            r1 = this;
            java.lang.String r0 = "sessionUrl"
            kotlin.jvm.internal.h.e(r2, r0)
            java.lang.String r0 = "command"
            kotlin.jvm.internal.h.e(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "/play"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            io.reactivex.z r2 = r1.d(r2, r3)
            com.spotify.player.internal.PlayerSessionCommandResolverImpl$playSession$1 r3 = com.spotify.player.internal.PlayerSessionCommandResolverImpl$playSession$1.a
            if (r3 == 0) goto L_0x0029
            com.spotify.player.internal.h r0 = new com.spotify.player.internal.h
            r0.<init>(r3)
            r3 = r0
        L_0x0029:
            io.reactivex.functions.l r3 = (io.reactivex.functions.l) r3
            io.reactivex.z r2 = r2.A(r3)
            java.lang.String r3 = "post(\"$sessionUrl$PLAY_S…map(::parseCommandResult)"
            kotlin.jvm.internal.h.d(r2, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.player.internal.PlayerSessionCommandResolverImpl.b(java.lang.String, com.spotify.player.model.command.PlaySessionCommand):io.reactivex.z");
    }
}
