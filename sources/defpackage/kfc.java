package defpackage;

import com.spotify.playlist.models.k;
import io.reactivex.functions.g;
import io.reactivex.subjects.a;
import java.util.List;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: kfc  reason: default package */
public final class kfc<T> implements g<k> {
    final /* synthetic */ gfc a;

    kfc(gfc gfc) {
        this.a = gfc;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: io.reactivex.subjects.a */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.functions.g
    public void accept(k kVar) {
        k kVar2 = kVar;
        h.e(kVar2, "playlistEntity");
        this.a.h = kVar2.getItems();
        List list = this.a.f;
        if (list != null) {
            a aVar = this.a.i;
            gfc gfc = this.a;
            List list2 = gfc.h;
            h.c(list2);
            int i = this.a.b;
            int i2 = this.a.a;
            gfc.getClass();
            h.e(list2, "limitedItems");
            h.e(list, "items");
            aVar.onNext(new dfc(list2, list, i, i2));
        }
    }
}
