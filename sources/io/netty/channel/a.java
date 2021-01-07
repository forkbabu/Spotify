package io.netty.channel;

import io.netty.channel.AbstractChannel;

/* access modifiers changed from: package-private */
public class a implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ v b;
    final /* synthetic */ AbstractChannel.a c;

    a(AbstractChannel.a aVar, boolean z, v vVar) {
        this.c = aVar;
        this.a = z;
        this.b = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        a0 a0Var;
        try {
            AbstractChannel.this.F0();
            if (this.a) {
                b.M0(AbstractChannel.this.o.a);
            }
            if (AbstractChannel.this.u) {
                AbstractChannel.this.u = false;
                a0Var = AbstractChannel.this.o;
                b.V0(a0Var.a);
            }
        } catch (Throwable th) {
            if (this.a) {
                b.M0(AbstractChannel.this.o.a);
            }
            if (AbstractChannel.this.u) {
                AbstractChannel.this.u = false;
                b.V0(AbstractChannel.this.o.a);
            }
            this.c.v(this.b);
            throw th;
        }
        this.c.v(this.b);
    }
}
