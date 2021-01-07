package defpackage;

import com.spotify.mobile.android.share.menu.preview.api.d;
import com.spotify.mobile.android.share.menu.preview.domain.c;
import defpackage.eo1;
import io.reactivex.a0;
import io.reactivex.c0;
import kotlin.jvm.internal.h;

/* renamed from: bo1  reason: default package */
final class bo1<T> implements c0<d> {
    final /* synthetic */ eo1.a a;
    final /* synthetic */ c.b b;

    bo1(eo1.a aVar, c.b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: io.reactivex.a0<com.spotify.mobile.android.share.menu.preview.api.d> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.c0
    public final void subscribe(a0<d> a0Var) {
        h.e(a0Var, "emitter");
        try {
            a0Var.onSuccess(((cmf) this.a.a.b.get(this.b.a())).invoke());
        } catch (InterruptedException e) {
            if (!a0Var.d()) {
                a0Var.onError(e);
            }
        }
    }
}
