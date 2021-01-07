package defpackage;

import com.spotify.music.podcastinteractivity.qna.datasource.i;
import com.spotify.podcastinteractivity.qna.model.proto.QAndA;
import defpackage.auc;
import defpackage.uuc;
import defpackage.xtc;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: suc  reason: default package */
final class suc<T, R> implements l<QAndA, xtc> {
    final /* synthetic */ uuc.a a;

    suc(uuc.a aVar) {
        this.a = aVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public xtc apply(QAndA qAndA) {
        QAndA qAndA2 = qAndA;
        h.e(qAndA2, "qAndA");
        this.a.a.b.c(i.h.a);
        return new xtc.h(new auc.c(qAndA2));
    }
}
