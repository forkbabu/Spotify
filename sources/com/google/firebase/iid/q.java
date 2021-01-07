package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import com.google.android.gms.tasks.c;
import com.google.android.gms.tasks.g;

final /* synthetic */ class q implements c {
    private final boolean a;
    private final BroadcastReceiver.PendingResult b;

    q(boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.a = z;
        this.b = pendingResult;
    }

    @Override // com.google.android.gms.tasks.c
    public final void a(g gVar) {
        boolean z = this.a;
        BroadcastReceiver.PendingResult pendingResult = this.b;
        int i = FirebaseInstanceIdReceiver.f;
        if (z) {
            pendingResult.setResultCode(gVar.r() ? ((Integer) gVar.n()).intValue() : 500);
        }
        pendingResult.finish();
    }
}
