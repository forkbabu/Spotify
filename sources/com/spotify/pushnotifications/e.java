package com.spotify.pushnotifications;

import com.google.android.gms.tasks.c;
import com.google.android.gms.tasks.g;
import com.google.firebase.iid.w;
import com.spotify.base.java.logging.Logger;
import io.reactivex.a0;

public final /* synthetic */ class e implements c {
    public final /* synthetic */ a0 a;

    public /* synthetic */ e(a0 a0Var) {
        this.a = a0Var;
    }

    @Override // com.google.android.gms.tasks.c
    public final void a(g gVar) {
        a0 a0Var = this.a;
        if (!gVar.r()) {
            Exception m = gVar.m();
            Logger.o(m, "Error getting token from firebase", new Object[0]);
            a0Var.onError(m);
            return;
        }
        w wVar = (w) gVar.n();
        if (wVar != null) {
            String token = wVar.getToken();
            Logger.b("succesfully obtained firebase token", new Object[0]);
            a0Var.onSuccess(token);
        }
    }
}
