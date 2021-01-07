package com.spotify.remoteconfig.client.network;

import com.spotify.remoteconfig.client.network.m;
import io.reactivex.s;
import io.reactivex.v;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

final class l<T, R> implements io.reactivex.functions.l<T, v<? extends R>> {
    final /* synthetic */ m.a a;

    l(m.a aVar) {
        this.a = aVar;
    }

    @Override // io.reactivex.functions.l
    public Object apply(Object obj) {
        u3 u3Var = (u3) obj;
        h.f(u3Var, "tuple");
        F f = u3Var.a;
        if (f != null) {
            F f2 = f;
            S s = u3Var.b;
            if (s != null) {
                int intValue = s.intValue();
                if (intValue == this.a.a) {
                    return s.P(f2);
                }
                long j = (long) (this.a.b * intValue);
                StringBuilder W0 = je.W0("Failed ", intValue, " attempt with error: ");
                W0.append(f2.getMessage());
                W0.append(", retrying in ");
                W0.append(j);
                W0.append(" ms...");
                trf.a(W0.toString(), new Object[0]);
                return s.W0(j, TimeUnit.MILLISECONDS);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
