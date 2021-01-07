package com.uber.rxdogtag;

import com.uber.rxdogtag.RxDogTag;

public final /* synthetic */ class c implements RxDogTag.NonCheckingConsumer {
    public final /* synthetic */ DogTagCompletableObserver a;

    public /* synthetic */ c(DogTagCompletableObserver dogTagCompletableObserver) {
        this.a = dogTagCompletableObserver;
    }

    @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
    public final void accept(Object obj) {
        this.a.d((Throwable) obj);
    }
}
