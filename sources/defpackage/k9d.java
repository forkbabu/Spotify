package defpackage;

import com.spotify.music.sociallistening.models.a;
import defpackage.n8d;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: k9d  reason: default package */
public final class k9d<T> implements g<n8d.h> {
    final /* synthetic */ d8d a;

    k9d(d8d d8d) {
        this.a = d8d;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(n8d.h hVar) {
        a aVar;
        n8d.h hVar2 = hVar;
        h.e(hVar2, "notifyFailedToJoinSession");
        d8d d8d = this.a;
        if (hVar2.a()) {
            aVar = a.b.a;
        } else {
            aVar = a.c.a;
        }
        d8d.c(aVar);
    }
}
