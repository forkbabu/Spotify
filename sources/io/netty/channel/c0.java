package io.netty.channel;

class c0 implements Runnable {
    final /* synthetic */ b a;
    final /* synthetic */ a0 b;

    c0(a0 a0Var, b bVar) {
        this.b = a0Var;
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.b.L(this.a);
    }
}
