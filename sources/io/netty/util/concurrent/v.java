package io.netty.util.concurrent;

/* access modifiers changed from: package-private */
public class v implements Object<Object> {
    final /* synthetic */ w c;

    v(w wVar) {
        this.c = wVar;
    }

    public void a(r<Object> rVar) {
        if (this.c.c.incrementAndGet() == this.c.a.length) {
            this.c.f.v(null);
        }
    }
}
