package defpackage;

import io.netty.channel.d;
import io.reactivex.functions.n;

/* renamed from: ise  reason: default package */
public final /* synthetic */ class ise implements n {
    public final /* synthetic */ d a;

    public /* synthetic */ ise(d dVar) {
        this.a = dVar;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        Float f = (Float) obj;
        return !this.a.isActive();
    }
}
