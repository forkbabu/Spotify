package defpackage;

import com.spotify.music.libs.search.view.l;
import io.reactivex.h;
import io.reactivex.i;

/* renamed from: g2b  reason: default package */
public final /* synthetic */ class g2b implements i {
    public final /* synthetic */ f4b a;
    public final /* synthetic */ l b;

    public /* synthetic */ g2b(f4b f4b, l lVar) {
        this.a = f4b;
        this.b = lVar;
    }

    @Override // io.reactivex.i
    public final void subscribe(h hVar) {
        f4b f4b = this.a;
        l lVar = this.b;
        e4b e4b = new e4b(hVar, f4b);
        lVar.g(e4b);
        hVar.e(new f2b(lVar, e4b));
    }
}
