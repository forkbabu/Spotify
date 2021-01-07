package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.firebase.c;
import com.google.firebase.components.d;
import com.google.firebase.components.e;
import com.google.firebase.components.h;
import com.google.firebase.components.p;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.installations.g;
import java.util.Arrays;
import java.util.List;

@Keep
public final class Registrar implements h {

    /* access modifiers changed from: private */
    public static class a implements s10 {
        public a(FirebaseInstanceId firebaseInstanceId) {
        }
    }

    static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(e eVar) {
        return new FirebaseInstanceId((c) eVar.get(c.class), (r10) eVar.get(r10.class), (b20) eVar.get(b20.class), (HeartBeatInfo) eVar.get(HeartBeatInfo.class), (g) eVar.get(g.class));
    }

    static final /* synthetic */ s10 lambda$getComponents$1$Registrar(e eVar) {
        return new a((FirebaseInstanceId) eVar.get(FirebaseInstanceId.class));
    }

    @Override // com.google.firebase.components.h
    @Keep
    public final List<d<?>> getComponents() {
        d.b a2 = d.a(FirebaseInstanceId.class);
        a2.b(p.f(c.class));
        a2.b(p.f(r10.class));
        a2.b(p.f(b20.class));
        a2.b(p.f(HeartBeatInfo.class));
        a2.b(p.f(g.class));
        a2.f(f0.a);
        a2.c();
        d d = a2.d();
        d.b a3 = d.a(s10.class);
        a3.b(p.f(FirebaseInstanceId.class));
        a3.f(g0.a);
        return Arrays.asList(d, a3.d(), a20.a("fire-iid", "20.2.4"));
    }
}
