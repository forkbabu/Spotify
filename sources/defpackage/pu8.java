package defpackage;

import com.google.common.collect.FluentIterable;
import com.spotify.ubi.specification.factories.q3;
import io.reactivex.functions.l;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: pu8  reason: default package */
public class pu8 implements l<b91, b91> {
    private final q3 a = new q3();

    public s81 a(AtomicInteger atomicInteger, s81 s81) {
        return s81.toBuilder().v(s81.logging().toBuilder().a(n81.a(this.a.c().c().c().b(Integer.valueOf(atomicInteger.getAndIncrement())).a())).d()).l();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public b91 apply(b91 b91) {
        b91 b912 = b91;
        if (!(!b912.body().isEmpty() && b912.body().size() == 2 && !((s81) b912.body().get(1)).children().isEmpty())) {
            return b912;
        }
        s81 s81 = (s81) b912.body().get(1);
        return b912.toBuilder().f((s81) b912.body().get(0), s81.toBuilder().m(FluentIterable.from(s81.children()).transform(new hu8(this, new AtomicInteger())).toList()).l()).g();
    }
}
