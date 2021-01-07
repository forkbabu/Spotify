package com.spotify.mobile.android.sso;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.ClientIdentity;
import com.spotify.mobile.android.sso.protocol.m;
import com.spotify.mobile.android.sso.protocol.n;
import com.spotify.mobile.android.util.connectivity.c0;
import io.reactivex.t;

public class i {
    private t<rv1> a;
    private final n b;
    private final m c;
    private final c0 d;
    private final Activity e;

    i(n nVar, m mVar, c0 c0Var, Activity activity) {
        this.b = nVar;
        this.c = mVar;
        this.d = c0Var;
        this.e = activity;
    }

    public /* synthetic */ void a(t tVar) {
        this.a = tVar;
    }

    public void b(Intent intent) {
        ClientIdentity clientIdentity;
        t<rv1> tVar = this.a;
        if (tVar != null) {
            m a2 = this.b.a(intent);
            String a3 = a2.a();
            AuthorizationRequest.ResponseType c2 = a2.c();
            String b2 = a2.b();
            try {
                m mVar = this.c;
                Activity activity = this.e;
                mVar.getClass();
                if (activity.getPackageName().equals(activity.getCallingPackage())) {
                    clientIdentity = a2.e();
                } else {
                    ComponentName callingActivity = activity.getCallingActivity();
                    if (callingActivity != null) {
                        clientIdentity = ClientIdentity.c(activity, callingActivity.getPackageName());
                    } else {
                        throw new ClientIdentity.ValidationException("Calling activity can't be null");
                    }
                }
            } catch (ClientIdentity.ValidationException unused) {
                clientIdentity = null;
            }
            tVar.onNext(rv1.f(AuthorizationRequest.a(a3, c2, b2, clientIdentity, a2.getState(), a2.f(), a2.d()), this.b.b(intent), this.d.a(), false));
        }
    }
}
