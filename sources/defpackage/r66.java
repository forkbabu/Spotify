package defpackage;

import com.spotify.playlist.models.l;
import defpackage.d76;
import defpackage.g76;
import io.reactivex.functions.c;
import java.util.List;

/* renamed from: r66  reason: default package */
public final /* synthetic */ class r66 implements c {
    public final /* synthetic */ d76.a a;

    public /* synthetic */ r66(d76.a aVar) {
        this.a = aVar;
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        d76.a aVar = this.a;
        List<l> list = (List) obj;
        g76.a aVar2 = new g76.a(0, null, null, null, 15);
        aVar2.c(list);
        aVar2.e((List) obj2);
        aVar2.d(list.size());
        aVar2.b(aVar.a());
        return aVar2.a();
    }
}
