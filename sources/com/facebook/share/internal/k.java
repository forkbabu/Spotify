package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.internal.f0;
import com.facebook.p;
import com.facebook.share.internal.e;

/* access modifiers changed from: package-private */
public class k implements e.o {
    final /* synthetic */ Bundle a;
    final /* synthetic */ e b;

    class a implements p.a {
        final /* synthetic */ e.m a;

        a(e.m mVar) {
            this.a = mVar;
        }

        @Override // com.facebook.p.a
        public void a(p pVar) {
            k.this.b.l = false;
            e.m mVar = this.a;
            if (mVar.d != null) {
                e.n(k.this.b, false);
                return;
            }
            k.this.b.h = f0.f(mVar.e, null);
            k.this.b.k = true;
            k.this.b.J().h("fb_like_control_did_like", null, k.this.a);
            k kVar = k.this;
            e.q(kVar.b, kVar.a);
        }
    }

    k(e eVar, Bundle bundle) {
        this.b = eVar;
        this.a = bundle;
    }

    @Override // com.facebook.share.internal.e.o
    public void onComplete() {
        if (f0.C(this.b.i)) {
            e.F(this.b, "com.facebook.sdk.LikeActionController.DID_ERROR", je.E("com.facebook.platform.status.ERROR_DESCRIPTION", "Invalid Object Id"));
            return;
        }
        p pVar = new p();
        e eVar = this.b;
        e.m mVar = new e.m(eVar.i, this.b.b);
        mVar.c(pVar);
        pVar.d(new a(mVar));
        pVar.e();
    }
}
