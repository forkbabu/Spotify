package defpackage;

import com.spotify.music.features.nowplayingbar.domain.c;
import io.reactivex.functions.g;

/* renamed from: at5  reason: default package */
final class at5<T> implements g<c.b> {
    final /* synthetic */ t8a a;

    at5(t8a t8a) {
        this.a = t8a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(c.b bVar) {
        c.b bVar2 = bVar;
        if (bVar2.b().h()) {
            this.a.f(bVar2.b().g(), true);
        } else {
            this.a.a(bVar2.b().g(), bVar2.a(), true);
        }
    }
}
