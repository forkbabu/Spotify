package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.l;

/* renamed from: ru8  reason: default package */
public class ru8 implements l<Optional<b91>, Optional<b91>> {
    private final yt8 a;

    public ru8(yt8 yt8) {
        yt8.getClass();
        this.a = yt8;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public Optional<b91> apply(Optional<b91> optional) {
        Optional<b91> optional2 = optional;
        b91 a2 = this.a.a();
        if (a2 == null) {
            return optional2;
        }
        return Optional.fromNullable(tu8.b(optional2.isPresent() ? optional2.get() : null, a2));
    }
}
