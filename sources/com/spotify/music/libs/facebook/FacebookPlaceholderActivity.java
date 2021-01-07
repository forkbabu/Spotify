package com.spotify.music.libs.facebook;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.f;
import com.facebook.i;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.login.o;
import com.facebook.login.q;
import com.google.common.collect.ImmutableList;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.o0;
import com.spotify.music.C0707R;
import com.spotify.rxjava2.p;

public class FacebookPlaceholderActivity extends ss2 {
    public static final /* synthetic */ int P = 0;
    private final p G = new p();
    private final p H = new p();
    private final p I = new p();
    private f J;
    private boolean K;
    q L;
    o0 M;
    t N;
    com.facebook.a O;

    class a implements i<q> {
        a() {
        }

        @Override // com.facebook.i
        public void a(FacebookException facebookException) {
            FacebookPlaceholderActivity.this.M.c(C0707R.string.toast_generic_facebook_error, new Object[0]);
            FacebookPlaceholderActivity.this.setResult(0);
            FacebookPlaceholderActivity.this.finish();
        }

        @Override // com.facebook.i
        public void b() {
            com.facebook.a e = com.facebook.a.e();
            q qVar = FacebookPlaceholderActivity.this.L;
            ImmutableList<String> immutableList = q.c;
            qVar.getClass();
            boolean z = true;
            Logger.b("Checking if active session contains permissions:%s", immutableList.toString());
            com.facebook.a e2 = com.facebook.a.e();
            if (e2 == null || !e2.l().containsAll(immutableList)) {
                z = false;
            }
            if (!z || e.q()) {
                FacebookPlaceholderActivity.this.setResult(0);
                FacebookPlaceholderActivity.this.finish();
                return;
            }
            FacebookPlaceholderActivity.this.O = e;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.facebook.i
        public void onSuccess(q qVar) {
            com.facebook.a e = com.facebook.a.e();
            if (!e.q()) {
                FacebookPlaceholderActivity facebookPlaceholderActivity = FacebookPlaceholderActivity.this;
                facebookPlaceholderActivity.O = e;
                if (facebookPlaceholderActivity.K) {
                    FacebookPlaceholderActivity facebookPlaceholderActivity2 = FacebookPlaceholderActivity.this;
                    facebookPlaceholderActivity2.W0(facebookPlaceholderActivity2.O);
                    return;
                }
                return;
            }
            FacebookPlaceholderActivity.this.setResult(0);
            FacebookPlaceholderActivity.this.finish();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void W0(com.facebook.a aVar) {
        this.G.b(this.N.a().o0(io.reactivex.android.schedulers.a.b()).subscribe(new h(this, aVar), c.a));
        this.H.b(this.N.b(aVar.n()).subscribe(d.a, e.a));
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((CallbackManagerImpl) this.J).a(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        o a2 = this.L.a();
        if (bundle == null) {
            a2.j();
        }
        CallbackManagerImpl callbackManagerImpl = new CallbackManagerImpl();
        this.J = callbackManagerImpl;
        a2.l(callbackManagerImpl, new a());
        a2.h(this, q.d);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.K = false;
        this.G.a();
        this.H.a();
        this.I.a();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.K = true;
        this.I.b(this.N.events().Q(i.a).o0(io.reactivex.android.schedulers.a.b()).subscribe(new f(this), new g(this)));
        com.facebook.a aVar = this.O;
        if (aVar != null) {
            W0(aVar);
            this.O = null;
        }
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.FACEBOOK_CONNECT, null);
    }
}
