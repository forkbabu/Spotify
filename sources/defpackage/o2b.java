package defpackage;

import com.spotify.music.libs.search.view.l;
import io.reactivex.h;
import io.reactivex.i;

/* renamed from: o2b  reason: default package */
public final /* synthetic */ class o2b implements i {
    public final /* synthetic */ l a;
    public final /* synthetic */ k8b b;

    public /* synthetic */ o2b(l lVar, k8b k8b) {
        this.a = lVar;
        this.b = k8b;
    }

    @Override // io.reactivex.i
    public final void subscribe(h hVar) {
        l lVar = this.a;
        k8b k8b = this.b;
        k8b.a(new m2b(lVar, hVar));
        hVar.e(new n2b(k8b));
    }
}
