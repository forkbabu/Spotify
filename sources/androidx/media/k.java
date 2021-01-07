package androidx.media;

import androidx.media.b;

class k implements Runnable {
    final /* synthetic */ b.m a;
    final /* synthetic */ b.l b;

    k(b.l lVar, b.m mVar) {
        this.b = lVar;
        this.a = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        b.c remove = b.this.f.remove(((b.n) this.a).a());
        if (remove != null) {
            ((b.n) remove.f).a().unlinkToDeath(remove, 0);
        }
    }
}
