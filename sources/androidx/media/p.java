package androidx.media;

import android.os.IBinder;
import androidx.media.b;

class p implements Runnable {
    final /* synthetic */ b.m a;
    final /* synthetic */ b.l b;

    p(b.l lVar, b.m mVar) {
        this.b = lVar;
        this.a = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IBinder a2 = ((b.n) this.a).a();
        b.c remove = b.this.f.remove(a2);
        if (remove != null) {
            a2.unlinkToDeath(remove, 0);
        }
    }
}
