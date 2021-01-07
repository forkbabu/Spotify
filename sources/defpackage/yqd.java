package defpackage;

import io.reactivex.functions.g;
import io.reactivex.subjects.PublishSubject;

/* renamed from: yqd  reason: default package */
public final class yqd implements fjf<g<uqd>> {
    private final wlf<PublishSubject<uqd>> a;

    public yqd(wlf<PublishSubject<uqd>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        PublishSubject<uqd> publishSubject = this.a.get();
        publishSubject.getClass();
        return new xqd(publishSubject);
    }
}
