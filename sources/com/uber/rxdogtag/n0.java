package com.uber.rxdogtag;

import com.uber.rxdogtag.RxDogTag;
import io.reactivex.functions.c;
import io.reactivex.g;

public final /* synthetic */ class n0 implements c {
    public final /* synthetic */ RxDogTag.Configuration a;

    public /* synthetic */ n0(RxDogTag.Configuration configuration) {
        this.a = configuration;
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        return RxDogTag.b(this.a, (g) obj, (upf) obj2);
    }
}
