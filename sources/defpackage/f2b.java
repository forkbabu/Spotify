package defpackage;

import com.spotify.music.libs.search.view.l;
import io.reactivex.functions.f;

/* renamed from: f2b  reason: default package */
public final /* synthetic */ class f2b implements f {
    public final /* synthetic */ l a;
    public final /* synthetic */ l.b b;

    public /* synthetic */ f2b(l lVar, l.b bVar) {
        this.a = lVar;
        this.b = bVar;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.q(this.b);
    }
}
