package com.uber.rxdogtag;

import com.uber.rxdogtag.RxDogTag;

public final /* synthetic */ class q implements RxDogTag.NonCheckingConsumer {
    public final /* synthetic */ DogTagObserver a;

    public /* synthetic */ q(DogTagObserver dogTagObserver) {
        this.a = dogTagObserver;
    }

    @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
    public final void accept(Object obj) {
        this.a.b((Throwable) obj);
    }
}
