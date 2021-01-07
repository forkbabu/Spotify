package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.l;

/* renamed from: n3b  reason: default package */
public class n3b implements l<d7b<b91>, b91> {
    private final qqa a;

    n3b(qqa qqa) {
        qqa.getClass();
        this.a = qqa;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public b91 apply(d7b<b91> d7b) {
        d7b<b91> d7b2 = d7b;
        if (d7b2.i().isPresent()) {
            return d7b2.i().get();
        }
        return this.a.d(d7b2.g(), Optional.fromNullable(d7b2.h()));
    }
}
