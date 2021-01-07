package com.uber.rxdogtag;

import com.uber.rxdogtag.RxDogTag;

public final /* synthetic */ class e implements RxDogTag.NonCheckingConsumer {
    public final /* synthetic */ DogTagCompletableObserver a;

    public /* synthetic */ e(DogTagCompletableObserver dogTagCompletableObserver) {
        this.a = dogTagCompletableObserver;
    }

    @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
    public final void accept(Object obj) {
        this.a.a((Throwable) obj);
    }
}
