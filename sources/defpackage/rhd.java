package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: rhd  reason: default package */
public class rhd {
    private final InstallReferrerClient a;
    private final phd b;

    /* renamed from: rhd$a */
    class a implements InstallReferrerStateListener {
        a() {
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
            Logger.d("Install referrer service disconnected", new Object[0]);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i) {
            Logger.g("InstallReferrerClient connected %d", Integer.valueOf(i));
            if (i == 0) {
                rhd.a(rhd.this);
            } else {
                Logger.d("Error connecting to install referrer: %d", Integer.valueOf(i));
            }
        }
    }

    rhd(InstallReferrerClient installReferrerClient, phd phd) {
        this.a = installReferrerClient;
        this.b = phd;
    }

    static void a(rhd rhd) {
        if (rhd.a.isReady()) {
            try {
                rhd.a.getClass();
                String installReferrer = rhd.a.getInstallReferrer().getInstallReferrer();
                if (!TextUtils.isEmpty(installReferrer)) {
                    Logger.g("Install referrer is : %s ", installReferrer);
                    rhd.b.a(installReferrer);
                }
                rhd.c();
            } catch (RemoteException unused) {
                Logger.d("Remote exception while retrieving Install referrer.", new Object[0]);
            }
        }
    }

    public void b() {
        if (this.b.b()) {
            Logger.g("Install referrer already logged", new Object[0]);
            return;
        }
        try {
            this.a.startConnection(new a());
        } catch (SecurityException e) {
            Assertion.i("Unable to start connection", e);
        }
    }

    public void c() {
        if (this.a.isReady()) {
            Logger.g("End InstallReferrerClient connection", new Object[0]);
            this.a.endConnection();
        }
    }
}
