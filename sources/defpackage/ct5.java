package defpackage;

import com.spotify.music.features.nowplayingbar.domain.c;
import io.reactivex.functions.g;

/* access modifiers changed from: package-private */
/* renamed from: ct5  reason: default package */
public final class ct5<T> implements g<c.d> {
    final /* synthetic */ nsb a;

    ct5(nsb nsb) {
        this.a = nsb;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(c.d dVar) {
        com.spotify.instrumentation.navigation.logger.c a2 = dVar.a();
        if (a2 != null) {
            this.a.b(a2);
        } else {
            this.a.a();
        }
    }
}
