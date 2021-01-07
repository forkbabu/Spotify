package com.uber.rxdogtag;

import com.uber.rxdogtag.RxDogTag;
import io.reactivex.b0;
import io.reactivex.functions.c;
import io.reactivex.z;

public final /* synthetic */ class j0 implements c {
    public final /* synthetic */ RxDogTag.Configuration a;

    public /* synthetic */ j0(RxDogTag.Configuration configuration) {
        this.a = configuration;
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        return RxDogTag.c(this.a, (z) obj, (b0) obj2);
    }
}
