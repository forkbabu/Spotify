package com.uber.rxdogtag;

import com.uber.rxdogtag.RxDogTag;

public final /* synthetic */ class f0 implements RxDogTag.NonCheckingConsumer {
    public final /* synthetic */ DogTagSubscriber a;

    public /* synthetic */ f0(DogTagSubscriber dogTagSubscriber) {
        this.a = dogTagSubscriber;
    }

    @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
    public final void accept(Object obj) {
        this.a.a((Throwable) obj);
    }
}