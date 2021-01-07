package com.uber.rxdogtag;

import com.uber.rxdogtag.RxDogTag;

public final /* synthetic */ class a0 implements RxDogTag.NonCheckingConsumer {
    public final /* synthetic */ DogTagSingleObserver a;

    public /* synthetic */ a0(DogTagSingleObserver dogTagSingleObserver) {
        this.a = dogTagSingleObserver;
    }

    @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
    public final void accept(Object obj) {
        this.a.a((Throwable) obj);
    }
}
