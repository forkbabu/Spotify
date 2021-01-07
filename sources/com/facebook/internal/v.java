package com.facebook.internal;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.facebook.internal.w;

/* access modifiers changed from: package-private */
public final class v implements InstallReferrerStateListener {
    final /* synthetic */ InstallReferrerClient a;
    final /* synthetic */ w.a b;

    v(InstallReferrerClient installReferrerClient, w.a aVar) {
        this.a = installReferrerClient;
        this.b = aVar;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerServiceDisconnected() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerSetupFinished(int i) {
        if (i == 0) {
            try {
                String installReferrer = this.a.getInstallReferrer().getInstallReferrer();
                if (installReferrer != null && (installReferrer.contains("fb") || installReferrer.contains("facebook"))) {
                    this.b.a(installReferrer);
                }
                w.a();
            } catch (RemoteException unused) {
            }
        } else if (i == 2) {
            w.a();
        }
    }
}
