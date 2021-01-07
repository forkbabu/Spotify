package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: ymc  reason: default package */
final class ymc<T, R> implements l<Optional<String>, String> {
    public static final ymc a = new ymc();

    ymc() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public String apply(Optional<String> optional) {
        Optional<String> optional2 = optional;
        h.e(optional2, "it");
        return optional2.or((Optional<String>) "");
    }
}
