package com.spotify.googleauth;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.c;
import com.google.android.gms.tasks.g;
import kotlin.f;
import kotlin.jvm.internal.h;

final class a<TResult, TContinuationResult> implements com.google.android.gms.tasks.a<Void, f> {
    final /* synthetic */ GoogleLoginFragment a;
    final /* synthetic */ c b;

    a(GoogleLoginFragment googleLoginFragment, c cVar) {
        this.a = googleLoginFragment;
        this.b = cVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.tasks.g] */
    @Override // com.google.android.gms.tasks.a
    public f a(g<Void> gVar) {
        h.e(gVar, "it");
        c cVar = this.b;
        h.d(cVar, "client");
        Intent u = cVar.u();
        h.d(u, "client.signInIntent");
        this.a.H4(u, 200, null);
        return f.a;
    }
}
