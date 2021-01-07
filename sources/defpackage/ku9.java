package defpackage;

import android.net.Uri;
import java.util.concurrent.Callable;

/* renamed from: ku9  reason: default package */
final class ku9<V> implements Callable<Uri> {
    final /* synthetic */ nu9 a;

    ku9(nu9 nu9) {
        this.a = nu9;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public Uri call() {
        return this.a.g.b(this.a.b);
    }
}
