package com.spotify.smartlock.store;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.f;
import com.google.android.gms.common.internal.n;
import com.spotify.credentials.store.CredentialsSource;
import com.spotify.credentials.store.b;
import com.spotify.smartlock.store.SmartlockProviderCallback;
import io.reactivex.internal.operators.observable.x;
import io.reactivex.s;
import io.reactivex.subjects.c;

public class g implements b {
    private final f a;
    private final c<com.spotify.credentials.store.a> b = io.reactivex.subjects.a.h1();
    private Credential c;

    class a implements SmartlockProviderCallback {
        a() {
        }

        @Override // com.spotify.smartlock.store.SmartlockProviderCallback
        public void c() {
        }

        @Override // com.spotify.smartlock.store.SmartlockProviderCallback
        public void e() {
            g.this.b.onNext(com.spotify.credentials.store.a.b());
        }

        @Override // com.spotify.smartlock.store.SmartlockProviderCallback
        public void f(Credential credential, SmartlockProviderCallback.CredentialType credentialType) {
            com.spotify.credentials.store.a aVar;
            CredentialsSource credentialsSource;
            g.this.c = credential;
            c cVar = g.this.b;
            if ("https://www.facebook.com".equals(credential.I1())) {
                aVar = com.spotify.credentials.store.a.a();
            } else {
                String Q1 = credential.Q1();
                String o2 = credential.o2();
                o2.getClass();
                int ordinal = credentialType.ordinal();
                if (ordinal == 0) {
                    credentialsSource = CredentialsSource.SMARTLOCK_AUTO;
                } else if (ordinal != 1) {
                    credentialsSource = null;
                } else {
                    credentialsSource = CredentialsSource.SMARTLOCK_ASSISTED;
                }
                aVar = com.spotify.credentials.store.a.c(Q1, o2, credentialsSource);
            }
            cVar.onNext(aVar);
        }
    }

    public g(f fVar) {
        io.reactivex.subjects.a.h1();
        io.reactivex.subjects.a.h1();
        this.a = fVar;
    }

    @Override // com.spotify.credentials.store.b
    public void a() {
        f fVar = this.a.d;
        if (fVar != null) {
            n.b(((ws) oq.g).b(fVar.c()));
        }
    }

    @Override // com.spotify.credentials.store.b
    public s<com.spotify.credentials.store.a> b() {
        c<com.spotify.credentials.store.a> cVar = this.b;
        cVar.getClass();
        return new x(cVar);
    }

    @Override // com.spotify.credentials.store.b
    public void c() {
        Credential credential = this.c;
        if (credential != null) {
            this.a.a(credential);
        }
    }

    @Override // com.spotify.credentials.store.b
    public void d() {
        f fVar = this.a;
        a aVar = new a();
        fVar.getClass();
        fVar.j(aVar, false, "", "https://www.facebook.com");
    }
}
