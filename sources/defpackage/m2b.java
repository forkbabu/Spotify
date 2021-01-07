package defpackage;

import com.spotify.music.libs.search.view.l;
import io.reactivex.h;

/* renamed from: m2b  reason: default package */
public final /* synthetic */ class m2b implements j8b {
    public final /* synthetic */ l a;
    public final /* synthetic */ h b;

    public /* synthetic */ m2b(l lVar, h hVar) {
        this.a = lVar;
        this.b = hVar;
    }

    @Override // defpackage.j8b
    public final void b(String str) {
        l lVar = this.a;
        h hVar = this.b;
        lVar.k(str, false);
        lVar.n(true);
        hVar.onNext(b7b.d(str));
    }
}
