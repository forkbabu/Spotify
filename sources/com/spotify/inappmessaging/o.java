package com.spotify.inappmessaging;

import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;

/* access modifiers changed from: package-private */
public class o implements n {
    private final PublishSubject<jo0> a = PublishSubject.h1();

    o() {
    }

    @Override // com.spotify.inappmessaging.n
    public void a(String str, TriggerType triggerType) {
        this.a.onNext(jo0.d(str, triggerType));
    }

    /* access modifiers changed from: package-private */
    public s<jo0> b() {
        return this.a;
    }
}
