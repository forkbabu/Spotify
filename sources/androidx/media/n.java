package androidx.media;

import androidx.media.b;

class n implements Runnable {
    final /* synthetic */ b.m a;
    final /* synthetic */ String b;
    final /* synthetic */ p c;
    final /* synthetic */ b.l f;

    n(b.l lVar, b.m mVar, String str, p pVar) {
        this.f = lVar;
        this.a = mVar;
        this.b = str;
        this.c = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (b.this.f.get(((b.n) this.a).a()) != null) {
            b bVar = b.this;
            String str = this.b;
            c cVar = new c(bVar, str, this.c);
            bVar.h(cVar);
            if (!cVar.c()) {
                throw new IllegalStateException(je.x0("onLoadItem must call detach() or sendResult() before returning for id=", str));
            }
        }
    }
}
