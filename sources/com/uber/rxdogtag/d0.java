package com.uber.rxdogtag;

public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ DogTagSubscriber a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d0(DogTagSubscriber dogTagSubscriber, Object obj) {
        this.a = dogTagSubscriber;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.f(this.b);
    }
}
