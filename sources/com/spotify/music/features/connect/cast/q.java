package com.spotify.music.features.connect.cast;

import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.j;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.connect.cast.o;

/* access modifiers changed from: package-private */
public class q implements j<c> {
    final /* synthetic */ r a;

    q(r rVar) {
        this.a = rVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.cast.framework.h, int] */
    @Override // com.google.android.gms.cast.framework.j
    public void f(c cVar, int i) {
        this.a.c.a(i);
        Logger.b("CR -------> onSessionSuspended %d", Integer.valueOf(i));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.cast.framework.h, java.lang.String] */
    @Override // com.google.android.gms.cast.framework.j
    public void g(c cVar, String str) {
        Logger.b("CR -------> onSessionResuming", new Object[0]);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.cast.framework.h, int] */
    @Override // com.google.android.gms.cast.framework.j
    public void h(c cVar, int i) {
        this.a.getClass();
        if (i != 0) {
            this.a.c.c(i);
        }
        Logger.b("CR -------> onSessionEnded %d", Integer.valueOf(i));
        r.e(this.a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.cast.framework.h, int] */
    @Override // com.google.android.gms.cast.framework.j
    public void i(c cVar, int i) {
        this.a.getClass();
        if (i != 0) {
            this.a.c.b(i);
        }
        Logger.b("CR -------> onSessionStartFailed (Error code: %d)", Integer.valueOf(i));
        ((o.a) this.a.f).b(this.a.e);
        r.e(this.a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.cast.framework.h] */
    @Override // com.google.android.gms.cast.framework.j
    public void j(c cVar) {
        Logger.b("CR -------> onSessionStarting", new Object[0]);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.cast.framework.h, java.lang.String] */
    @Override // com.google.android.gms.cast.framework.j
    public void l(c cVar, String str) {
        Logger.b("CR -------> onSessionStarted", new Object[0]);
        r.c(this.a, cVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.cast.framework.h, boolean] */
    @Override // com.google.android.gms.cast.framework.j
    public void m(c cVar, boolean z) {
        Logger.b("CR -------> onSessionResumed", new Object[0]);
        r.c(this.a, cVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.cast.framework.h, int] */
    @Override // com.google.android.gms.cast.framework.j
    public void n(c cVar, int i) {
        Logger.b("CR -------> onSessionResumeFailed %d", Integer.valueOf(i));
        r.e(this.a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.cast.framework.h] */
    @Override // com.google.android.gms.cast.framework.j
    public void o(c cVar) {
        Logger.b("CR -------> onSessionEnding", new Object[0]);
    }
}
