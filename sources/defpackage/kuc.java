package defpackage;

import com.spotify.podcastinteractivity.qna.model.proto.QAndA;
import defpackage.auc;
import defpackage.xtc;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: kuc  reason: default package */
final class kuc<T, R> implements l<QAndA, xtc> {
    public static final kuc a = new kuc();

    kuc() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public xtc apply(QAndA qAndA) {
        QAndA qAndA2 = qAndA;
        h.e(qAndA2, "qAndA");
        return new xtc.d(new auc.c(qAndA2));
    }
}
