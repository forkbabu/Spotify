package defpackage;

import com.spotify.music.podcastinteractivity.qna.datasource.i;
import com.spotify.podcastinteractivity.qna.model.proto.QAndA;
import defpackage.auc;
import defpackage.juc;
import defpackage.xtc;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: huc  reason: default package */
final class huc<T, R> implements l<QAndA, xtc> {
    final /* synthetic */ juc.a a;

    huc(juc.a aVar) {
        this.a = aVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public xtc apply(QAndA qAndA) {
        QAndA qAndA2 = qAndA;
        h.e(qAndA2, "qAndA");
        this.a.a.b.c(i.g.a);
        return new xtc.d(new auc.c(qAndA2));
    }
}
