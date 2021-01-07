package androidx.media;

import android.os.Bundle;
import androidx.media.b;

class q implements Runnable {
    final /* synthetic */ b.m a;
    final /* synthetic */ String b;
    final /* synthetic */ Bundle c;
    final /* synthetic */ p f;
    final /* synthetic */ b.l n;

    q(b.l lVar, b.m mVar, String str, Bundle bundle, p pVar) {
        this.n = lVar;
        this.a = mVar;
        this.b = str;
        this.c = bundle;
        this.f = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (b.this.f.get(((b.n) this.a).a()) != null) {
            b bVar = b.this;
            String str = this.b;
            Bundle bundle = this.c;
            d dVar = new d(bVar, str, this.f);
            bVar.i(str, bundle, dVar);
            if (!dVar.c()) {
                throw new IllegalStateException(je.x0("onSearch must call detach() or sendResult() before returning for query=", str));
            }
        }
    }
}
