package defpackage;

import com.spotify.mobile.android.share.menu.preview.destinations.a;
import com.spotify.mobile.android.share.menu.preview.domain.a;
import com.spotify.mobile.android.share.menu.preview.domain.d;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: jo1  reason: default package */
public final class jo1<V> implements Callable<d> {
    final /* synthetic */ a a;

    jo1(a aVar) {
        this.a = aVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public d call() {
        return new d.b(new a.b(this.a.a()));
    }
}
