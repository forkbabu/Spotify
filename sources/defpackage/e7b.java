package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.libs.search.offline.model.OfflineResults;
import io.reactivex.functions.l;

/* renamed from: e7b  reason: default package */
public final /* synthetic */ class e7b implements l {
    public final /* synthetic */ s7b a;

    public /* synthetic */ e7b(s7b s7b) {
        this.a = s7b;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        s7b s7b = this.a;
        Logger.l("Offline search for query <%s> completed", s7b.c());
        return d7b.c(s7b.c(), (OfflineResults) obj);
    }
}
