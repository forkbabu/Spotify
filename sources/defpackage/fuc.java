package defpackage;

import com.spotify.music.podcastinteractivity.qna.datasource.i;
import defpackage.juc;
import io.reactivex.disposables.b;
import io.reactivex.functions.g;

/* renamed from: fuc  reason: default package */
final class fuc<T> implements g<b> {
    final /* synthetic */ juc.a a;

    fuc(juc.a aVar) {
        this.a = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(b bVar) {
        this.a.a.b.c(new i.b(true));
    }
}
