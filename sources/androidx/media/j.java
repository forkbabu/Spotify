package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.media.b;

class j implements Runnable {
    final /* synthetic */ b.m a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ int f;
    final /* synthetic */ Bundle n;
    final /* synthetic */ b.l o;

    j(b.l lVar, b.m mVar, String str, int i, int i2, Bundle bundle) {
        this.o = lVar;
        this.a = mVar;
        this.b = str;
        this.c = i;
        this.f = i2;
        this.n = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        IBinder a2 = ((b.n) this.a).a();
        b.this.f.remove(a2);
        b.c cVar = new b.c(this.b, this.c, this.f, this.n, this.a);
        b.this.getClass();
        cVar.o = b.this.e(this.b, this.f, this.n);
        b.this.getClass();
        if (cVar.o == null) {
            try {
                ((b.n) this.a).c();
            } catch (RemoteException unused) {
            }
        } else {
            try {
                b.this.f.put(a2, cVar);
                a2.linkToDeath(cVar, 0);
                if (b.this.o != null) {
                    ((b.n) this.a).b(cVar.o.d(), b.this.o, cVar.o.c());
                }
            } catch (RemoteException unused2) {
                b.this.f.remove(a2);
            }
        }
    }
}
