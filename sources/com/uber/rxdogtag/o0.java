package com.uber.rxdogtag;

import com.uber.rxdogtag.RxDogTag;
import io.reactivex.functions.c;
import io.reactivex.s;
import io.reactivex.x;

public final /* synthetic */ class o0 implements c {
    public final /* synthetic */ RxDogTag.Configuration a;

    public /* synthetic */ o0(RxDogTag.Configuration configuration) {
        this.a = configuration;
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        return RxDogTag.a(this.a, (s) obj, (x) obj2);
    }
}
