package defpackage;

import com.spotify.music.podcastinteractivity.qna.datasource.i;
import defpackage.juc;
import defpackage.xtc;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* renamed from: iuc  reason: default package */
final class iuc<T, R> implements l<Throwable, xtc> {
    final /* synthetic */ juc.a a;

    iuc(juc.a aVar) {
        this.a = aVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public xtc apply(Throwable th) {
        h.e(th, "it");
        this.a.a.b.c(i.c.a);
        return new xtc.d(null, 1);
    }
}
