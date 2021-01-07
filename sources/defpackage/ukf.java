package defpackage;

import io.netty.channel.v;

/* renamed from: ukf  reason: default package */
class ukf implements Runnable {
    final /* synthetic */ v a;
    final /* synthetic */ vkf b;

    ukf(vkf vkf, v vVar) {
        this.b = vkf;
        this.a = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.b.q1(this.a);
    }
}
