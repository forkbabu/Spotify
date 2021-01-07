package com.spotify.signup.splitflow;

import android.content.Intent;
import com.google.android.gms.auth.api.credentials.Credential;
import com.spotify.mobius.q;
import com.spotify.smartlock.store.SmartlockProviderCallback;
import com.spotify.smartlock.store.f;
import com.spotify.smartlock.store.i;

public class w1 {
    private final f a;
    private final ume<iee> b;
    private final i c = new a();

    class a extends i {
        a() {
        }

        @Override // com.spotify.smartlock.store.SmartlockProviderCallback
        public void c() {
            w1.this.b.c(iee.f());
        }

        @Override // com.spotify.smartlock.store.i, com.spotify.smartlock.store.SmartlockProviderCallback
        public void e() {
            w1.this.b.c(iee.g(ohe.a()));
        }

        @Override // com.spotify.smartlock.store.i, com.spotify.smartlock.store.SmartlockProviderCallback
        public void f(Credential credential, SmartlockProviderCallback.CredentialType credentialType) {
            w1.this.b.c(iee.g(ohe.c(credential.Q1())));
        }
    }

    public w1(f fVar, ume<iee> ume) {
        this.a = fVar;
        this.b = ume;
    }

    public void b(int i, int i2, Intent intent) {
        if (f.c(i)) {
            this.a.m(this.c);
            this.a.i(i, i2, intent);
        }
    }

    /* access modifiers changed from: package-private */
    public q<iee> c() {
        return this.b;
    }

    public void d() {
        this.a.b(this.c);
    }

    public void e(String str, String str2) {
        this.a.l(str, str2, "", this.c);
    }
}
