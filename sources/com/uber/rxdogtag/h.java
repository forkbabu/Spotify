package com.uber.rxdogtag;

import com.uber.rxdogtag.RxDogTag;

public final /* synthetic */ class h implements RxDogTag.NonCheckingConsumer {
    public final /* synthetic */ DogTagMaybeObserver a;

    public /* synthetic */ h(DogTagMaybeObserver dogTagMaybeObserver) {
        this.a = dogTagMaybeObserver;
    }

    @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
    public final void accept(Object obj) {
        this.a.f((Throwable) obj);
    }
}
