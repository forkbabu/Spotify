package com.uber.rxdogtag;

import com.uber.rxdogtag.RxDogTag;

public final /* synthetic */ class h0 implements RxDogTag.NonCheckingConsumer {
    public final /* synthetic */ DogTagSubscriber a;

    public /* synthetic */ h0(DogTagSubscriber dogTagSubscriber) {
        this.a = dogTagSubscriber;
    }

    @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
    public final void accept(Object obj) {
        this.a.b((Throwable) obj);
    }
}
