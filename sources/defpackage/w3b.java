package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.search.view.l;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.h;

/* renamed from: w3b  reason: default package */
public final class w3b implements t3b<String> {
    private final l a;

    w3b(l lVar) {
        this.a = lVar;
    }

    @Override // defpackage.t3b
    public g<String> a(h5b h5b) {
        return g.p(new y1b(this, h5b), BackpressureStrategy.LATEST);
    }

    public /* synthetic */ void b(h hVar) {
        Logger.l("Retry Search for query = %s", this.a.h());
        hVar.onNext(this.a.h());
    }
}
