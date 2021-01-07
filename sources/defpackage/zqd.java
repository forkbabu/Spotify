package defpackage;

import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;

/* renamed from: zqd  reason: default package */
public final class zqd implements fjf<s<uqd>> {
    private final wlf<PublishSubject<uqd>> a;

    public zqd(wlf<PublishSubject<uqd>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        PublishSubject<uqd> publishSubject = this.a.get();
        if (publishSubject != null) {
            return publishSubject;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
