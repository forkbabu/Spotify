package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.media.b;
import java.util.Iterator;

class o implements Runnable {
    final /* synthetic */ b.m a;
    final /* synthetic */ int b;
    final /* synthetic */ String c;
    final /* synthetic */ int f;
    final /* synthetic */ Bundle n;
    final /* synthetic */ b.l o;

    o(b.l lVar, b.m mVar, int i, String str, int i2, Bundle bundle) {
        this.o = lVar;
        this.a = mVar;
        this.b = i;
        this.c = str;
        this.f = i2;
        this.n = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        IBinder a2 = ((b.n) this.a).a();
        b.this.f.remove(a2);
        Iterator<b.c> it = b.this.c.iterator();
        b.c cVar = null;
        while (it.hasNext()) {
            b.c next = it.next();
            if (next.c == this.b) {
                if (TextUtils.isEmpty(this.c) || this.f <= 0) {
                    cVar = new b.c(next.a, next.b, next.c, this.n, this.a);
                }
                it.remove();
            }
        }
        if (cVar == null) {
            cVar = new b.c(this.c, this.f, this.b, this.n, this.a);
        }
        b.this.f.put(a2, cVar);
        try {
            a2.linkToDeath(cVar, 0);
        } catch (RemoteException unused) {
        }
    }
}
