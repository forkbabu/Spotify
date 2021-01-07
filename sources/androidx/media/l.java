package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import androidx.media.b;
import java.util.ArrayList;
import java.util.List;

class l implements Runnable {
    final /* synthetic */ b.m a;
    final /* synthetic */ String b;
    final /* synthetic */ IBinder c;
    final /* synthetic */ Bundle f;
    final /* synthetic */ b.l n;

    l(b.l lVar, b.m mVar, String str, IBinder iBinder, Bundle bundle) {
        this.n = lVar;
        this.a = mVar;
        this.b = str;
        this.c = iBinder;
        this.f = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        b.c cVar = b.this.f.get(((b.n) this.a).a());
        if (cVar != null) {
            b bVar = b.this;
            String str = this.b;
            IBinder iBinder = this.c;
            Bundle bundle = this.f;
            bVar.getClass();
            List<u3<IBinder, Bundle>> list = cVar.n.get(str);
            if (list == null) {
                list = new ArrayList<>();
            }
            for (u3<IBinder, Bundle> u3Var : list) {
                if (iBinder == u3Var.a) {
                    S s = u3Var.b;
                    boolean z = true;
                    if (bundle != s && (bundle != null ? s != null ? !(bundle.getInt("android.media.browse.extra.PAGE", -1) == s.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == s.getInt("android.media.browse.extra.PAGE_SIZE", -1)) : !(bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) : !(s.getInt("android.media.browse.extra.PAGE", -1) == -1 && s.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1))) {
                        z = false;
                    }
                    if (z) {
                        return;
                    }
                }
            }
            list.add(new u3<>(iBinder, bundle));
            cVar.n.put(str, list);
            bVar.l(str, cVar, bundle, null);
            bVar.j();
        }
    }
}
