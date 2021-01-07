package com.spotify.music.libs.mediabrowserservice;

import com.spotify.music.libs.mediabrowserservice.h2;
import io.reactivex.a0;

/* access modifiers changed from: package-private */
public class s2 implements h2.a {
    final /* synthetic */ a0 a;
    final /* synthetic */ String b;

    s2(t2 t2Var, a0 a0Var, String str) {
        this.a = a0Var;
        this.b = str;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.h2.a
    public void a() {
        a0 a0Var = this.a;
        StringBuilder V0 = je.V0("Couldn't resolve callback handler for package name ");
        V0.append(this.b);
        a0Var.onError(new Throwable(V0.toString()));
    }

    @Override // com.spotify.music.libs.mediabrowserservice.h2.a
    public void b(n2 n2Var) {
        this.a.onSuccess(n2Var);
    }
}
