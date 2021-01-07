package com.uber.rxdogtag;

import com.uber.rxdogtag.RxDogTag;

public final /* synthetic */ class v implements RxDogTag.NonCheckingConsumer {
    public final /* synthetic */ DogTagSingleObserver a;

    public /* synthetic */ v(DogTagSingleObserver dogTagSingleObserver) {
        this.a = dogTagSingleObserver;
    }

    @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
    public final void accept(Object obj) {
        this.a.c((Throwable) obj);
    }
}
