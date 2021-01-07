package com.uber.rxdogtag;

public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ DogTagSubscriber a;
    public final /* synthetic */ vpf b;

    public /* synthetic */ c0(DogTagSubscriber dogTagSubscriber, vpf vpf) {
        this.a = dogTagSubscriber;
        this.b = vpf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.h(this.b);
    }
}
