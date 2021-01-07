package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import androidx.media.b;
import java.util.Iterator;
import java.util.List;

class m implements Runnable {
    final /* synthetic */ b.m a;
    final /* synthetic */ String b;
    final /* synthetic */ IBinder c;
    final /* synthetic */ b.l f;

    m(b.l lVar, b.m mVar, String str, IBinder iBinder) {
        this.f = lVar;
        this.a = mVar;
        this.b = str;
        this.c = iBinder;
    }

    @Override // java.lang.Runnable
    public void run() {
        b.c cVar = b.this.f.get(((b.n) this.a).a());
        if (cVar != null) {
            b bVar = b.this;
            String str = this.b;
            IBinder iBinder = this.c;
            bVar.getClass();
            if (iBinder == null) {
                try {
                    if (cVar.n.remove(str) != null) {
                    }
                } catch (Throwable th) {
                    bVar.k();
                    throw th;
                }
            } else {
                List<u3<IBinder, Bundle>> list = cVar.n.get(str);
                if (list != null) {
                    Iterator<u3<IBinder, Bundle>> it = list.iterator();
                    while (it.hasNext()) {
                        if (iBinder == it.next().a) {
                            it.remove();
                        }
                    }
                    if (list.size() == 0) {
                        cVar.n.remove(str);
                    }
                }
            }
            bVar.k();
        }
    }
}
