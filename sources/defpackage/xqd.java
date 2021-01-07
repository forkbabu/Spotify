package defpackage;

import io.reactivex.functions.g;
import io.reactivex.subjects.PublishSubject;

/* renamed from: xqd  reason: default package */
public final /* synthetic */ class xqd implements g {
    public final /* synthetic */ PublishSubject a;

    public /* synthetic */ xqd(PublishSubject publishSubject) {
        this.a = publishSubject;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.onNext((uqd) obj);
    }
}
