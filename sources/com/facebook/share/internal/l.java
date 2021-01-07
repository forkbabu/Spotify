package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.p;
import com.facebook.share.internal.e;

/* access modifiers changed from: package-private */
public class l implements p.a {
    final /* synthetic */ e.n a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ e c;

    l(e eVar, e.n nVar, Bundle bundle) {
        this.c = eVar;
        this.a = nVar;
        this.b = bundle;
    }

    @Override // com.facebook.p.a
    public void a(p pVar) {
        this.c.l = false;
        if (this.a.d != null) {
            e.n(this.c, true);
            return;
        }
        this.c.h = null;
        this.c.k = false;
        this.c.J().h("fb_like_control_did_unlike", null, this.b);
        e.q(this.c, this.b);
    }
}
