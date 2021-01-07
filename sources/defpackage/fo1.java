package defpackage;

import com.spotify.mobile.android.share.menu.preview.api.h;
import com.spotify.mobile.android.share.menu.preview.domain.c;
import defpackage.ho1;
import java.util.concurrent.Callable;

/* renamed from: fo1  reason: default package */
final class fo1<V> implements Callable<h> {
    final /* synthetic */ ho1.a a;
    final /* synthetic */ c.C0188c b;

    fo1(ho1.a aVar, c.C0188c cVar) {
        this.a = aVar;
        this.b = cVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public h call() {
        h hVar;
        rmf rmf = (rmf) this.a.a.a.get(this.b.a().a());
        if (rmf != null && (hVar = (h) rmf.invoke(this.b.a(), this.b.b())) != null) {
            return hVar;
        }
        StringBuilder V0 = je.V0("No action available for destination: ");
        V0.append(this.b.a());
        throw new IllegalStateException(V0.toString().toString());
    }
}
