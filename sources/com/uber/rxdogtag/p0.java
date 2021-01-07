package com.uber.rxdogtag;

import com.uber.rxdogtag.RxDogTag;
import io.reactivex.a;
import io.reactivex.functions.c;

public final /* synthetic */ class p0 implements c {
    public final /* synthetic */ RxDogTag.Configuration a;

    public /* synthetic */ p0(RxDogTag.Configuration configuration) {
        this.a = configuration;
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        return RxDogTag.e(this.a, (a) obj, (io.reactivex.c) obj2);
    }
}
