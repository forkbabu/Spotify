package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.datatransport.d;
import com.google.android.datatransport.e;
import com.google.android.datatransport.f;
import com.google.android.datatransport.g;
import com.google.firebase.components.d;
import com.google.firebase.components.h;
import com.google.firebase.components.p;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Arrays;
import java.util.List;

@Keep
public class FirebaseMessagingRegistrar implements h {

    private static class b<T> implements e<T> {
        b(a aVar) {
        }

        @Override // com.google.android.datatransport.e
        public void a(com.google.android.datatransport.c<T> cVar, g gVar) {
            gVar.a(null);
        }

        @Override // com.google.android.datatransport.e
        public void b(com.google.android.datatransport.c<T> cVar) {
        }
    }

    public static class c implements f {
        @Override // com.google.android.datatransport.f
        public <T> e<T> a(String str, Class<T> cls, d<T, byte[]> dVar) {
            return new b(null);
        }

        @Override // com.google.android.datatransport.f
        public <T> e<T> b(String str, Class<T> cls, com.google.android.datatransport.b bVar, d<T, byte[]> dVar) {
            return new b(null);
        }
    }

    static f determineFactory(f fVar) {
        if (fVar == null || !com.google.android.datatransport.cct.a.h.e().contains(com.google.android.datatransport.b.b("json"))) {
            return new c();
        }
        return fVar;
    }

    static final /* synthetic */ FirebaseMessaging lambda$getComponents$0$FirebaseMessagingRegistrar(com.google.firebase.components.e eVar) {
        return new FirebaseMessaging((com.google.firebase.c) eVar.get(com.google.firebase.c.class), (FirebaseInstanceId) eVar.get(FirebaseInstanceId.class), (b20) eVar.get(b20.class), (HeartBeatInfo) eVar.get(HeartBeatInfo.class), (com.google.firebase.installations.g) eVar.get(com.google.firebase.installations.g.class), determineFactory((f) eVar.get(f.class)));
    }

    @Override // com.google.firebase.components.h
    @Keep
    public List<com.google.firebase.components.d<?>> getComponents() {
        d.b a2 = com.google.firebase.components.d.a(FirebaseMessaging.class);
        a2.b(p.f(com.google.firebase.c.class));
        a2.b(p.f(FirebaseInstanceId.class));
        a2.b(p.f(b20.class));
        a2.b(p.f(HeartBeatInfo.class));
        a2.b(p.e(f.class));
        a2.b(p.f(com.google.firebase.installations.g.class));
        a2.f(i.a);
        a2.c();
        return Arrays.asList(a2.d(), a20.a("fire-fcm", "20.2.4"));
    }
}
