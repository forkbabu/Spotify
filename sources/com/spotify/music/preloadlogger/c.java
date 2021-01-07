package com.spotify.music.preloadlogger;

import android.content.Context;
import androidx.work.d;
import androidx.work.impl.l;
import androidx.work.k;

public class c implements b {
    private final Context a;
    private final cqe b;

    public c(Context context, cqe cqe) {
        this.a = context;
        this.b = cqe;
    }

    @Override // com.spotify.music.preloadlogger.b
    public void a(boolean z) {
        l k = l.k(this.a);
        cqe cqe = this.b;
        d.a aVar = new d.a();
        aVar.d("afterAccountCreation", z);
        aVar.f("timeInMillisWhenCreatedWork", cqe.d());
        k.b(((k.a) new k.a(LoginTimeReporterWorker.class).h(aVar.a())).b());
    }
}
