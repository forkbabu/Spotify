package com.uber.rxdogtag;

import com.uber.rxdogtag.RxDogTag;
import io.reactivex.functions.c;
import io.reactivex.l;
import io.reactivex.n;

public final /* synthetic */ class k0 implements c {
    public final /* synthetic */ RxDogTag.Configuration a;

    public /* synthetic */ k0(RxDogTag.Configuration configuration) {
        this.a = configuration;
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        return RxDogTag.d(this.a, (l) obj, (n) obj2);
    }
}
