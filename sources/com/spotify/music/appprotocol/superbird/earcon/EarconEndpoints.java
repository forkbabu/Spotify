package com.spotify.music.appprotocol.superbird.earcon;

import com.spotify.music.appprotocol.api.a;
import com.spotify.music.appprotocol.api.model.AppProtocolBase;
import com.spotify.music.appprotocol.superbird.earcon.model.EarconAppProtocol;
import com.spotify.superbird.earcon.EarconType;
import io.reactivex.internal.operators.completable.b;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public final class EarconEndpoints implements a, bh2 {
    private final com.spotify.superbird.earcon.a a;

    public EarconEndpoints(com.spotify.superbird.earcon.a aVar) {
        h.e(aVar, "earconManager");
        this.a = aVar;
    }

    public static final s d(EarconEndpoints earconEndpoints, EarconAppProtocol.PlayEarconRequest playEarconRequest) {
        EarconType earconType;
        io.reactivex.a aVar;
        earconEndpoints.getClass();
        String earcon = playEarconRequest.getEarcon();
        h.e(earcon, "alias");
        EarconType[] values = EarconType.values();
        int i = 0;
        while (true) {
            if (i >= 3) {
                earconType = null;
                break;
            }
            earconType = values[i];
            if (h.a(earconType.d(), earcon)) {
                break;
            }
            i++;
        }
        if (earconType == null || (aVar = earconEndpoints.a.a(earconType)) == null) {
            aVar = b.a;
            h.d(aVar, "Completable.complete()");
        }
        s g = aVar.g(s.i0(AppProtocolBase.a));
        h.d(g, "earconEvent\n            …t(AppProtocolBase.EMPTY))");
        return g;
    }

    @Override // com.spotify.music.appprotocol.api.a
    public void a(qg0<bf2<?, ?>> qg0) {
        h.e(qg0, "addEndpoint");
        cf2 b = cf2.b(EarconAppProtocol.PlayEarconRequest.class, AppProtocolBase.Empty.class);
        b.d("com.spotify.superbird.earcon");
        b.c(0);
        b.e(new a(new EarconEndpoints$setupEndpoints$1(this)));
        qg0.accept(b.a());
    }

    @Override // defpackage.bh2
    public void b() {
        this.a.start();
    }

    @Override // defpackage.bh2
    public void c() {
        this.a.stop();
    }
}
