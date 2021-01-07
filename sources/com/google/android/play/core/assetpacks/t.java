package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.a;
import com.google.android.play.core.internal.x;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class t extends ny<AssetPackState> {
    private final i1 g;
    private final r0 h;
    private final x<f3> i;
    private final j0 j;
    private final u0 k;
    private final a l;
    private final x<Executor> m;
    private final x<Executor> n;
    private final Handler o = new Handler(Looper.getMainLooper());

    t(Context context, i1 i1Var, r0 r0Var, x<f3> xVar, u0 u0Var, j0 j0Var, a aVar, x<Executor> xVar2, x<Executor> xVar3) {
        super(new com.google.android.play.core.internal.a("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.g = i1Var;
        this.h = r0Var;
        this.i = xVar;
        this.k = u0Var;
        this.j = j0Var;
        this.l = aVar;
        this.m = xVar2;
        this.n = xVar3;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ny
    public final void a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra != null) {
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
            if (stringArrayList == null || stringArrayList.size() != 1) {
                this.a.e("Corrupt bundle received from broadcast.", new Object[0]);
                return;
            }
            Bundle bundleExtra2 = intent.getBundleExtra("com.google.android.play.core.FLAGS");
            if (bundleExtra2 != null) {
                this.l.a(bundleExtra2);
            }
            AssetPackState b = AssetPackState.b(bundleExtra, stringArrayList.get(0), this.k, v.a);
            this.a.c("ListenerRegistryBroadcastReceiver.onReceive: %s", b);
            if (((PendingIntent) bundleExtra.getParcelable("confirmation_intent")) != null) {
                this.j.getClass();
            }
            this.n.e().execute(new r(this, bundleExtra, b));
            this.m.e().execute(new s(this, bundleExtra));
            return;
        }
        this.a.e("Empty bundle received from broadcast.", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f(Bundle bundle) {
        if (this.g.e(bundle)) {
            this.h.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void g(Bundle bundle, AssetPackState assetPackState) {
        if (this.g.i(bundle)) {
            this.o.post(new q(this, assetPackState));
            this.i.e().e();
        }
    }

    /* access modifiers changed from: package-private */
    public final void h(AssetPackState assetPackState) {
        this.o.post(new q(this, assetPackState));
    }
}
