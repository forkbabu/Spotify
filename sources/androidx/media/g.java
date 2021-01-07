package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import androidx.media.b;
import java.util.List;

class g implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ b.e c;

    g(b.e eVar, String str, Bundle bundle) {
        this.c = eVar;
        this.a = str;
        this.b = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (IBinder iBinder : b.this.f.keySet()) {
            b.c cVar = b.this.f.get(iBinder);
            b.e eVar = this.c;
            String str = this.a;
            Bundle bundle = this.b;
            eVar.getClass();
            List<u3<IBinder, Bundle>> list = cVar.n.get(str);
            if (list != null) {
                for (u3<IBinder, Bundle> u3Var : list) {
                    if (e2.o(bundle, u3Var.b)) {
                        b.this.l(str, cVar, u3Var.b, bundle);
                    }
                }
            }
        }
    }
}
