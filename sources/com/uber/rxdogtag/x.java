package com.uber.rxdogtag;

import com.uber.rxdogtag.RxDogTag;

public final /* synthetic */ class x implements RxDogTag.NonCheckingConsumer {
    public final /* synthetic */ DogTagSingleObserver a;

    public /* synthetic */ x(DogTagSingleObserver dogTagSingleObserver) {
        this.a = dogTagSingleObserver;
    }

    @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
    public final void accept(Object obj) {
        this.a.e((Throwable) obj);
    }
}
