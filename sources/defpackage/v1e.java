package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import defpackage.u50;
import io.reactivex.t;

/* access modifiers changed from: package-private */
/* renamed from: v1e  reason: default package */
public class v1e implements ServiceConnection {
    final /* synthetic */ t a;
    final /* synthetic */ w1e b;

    v1e(w1e w1e, t tVar) {
        this.b = w1e;
        this.a = tVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (!this.a.d()) {
            this.b.getClass();
            u50 C3 = u50.a.C3(iBinder);
            if (C3 == null) {
                this.a.f(new Exception("Failed to create ISAService"));
            }
            this.a.onNext(C3);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (!this.a.d()) {
            this.a.onComplete();
        }
    }
}
