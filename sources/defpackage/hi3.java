package defpackage;

import com.spotify.playlist.endpoints.d;
import io.reactivex.functions.l;
import java.util.List;

/* renamed from: hi3  reason: default package */
public final /* synthetic */ class hi3 implements l {
    public final /* synthetic */ gj3 a;

    public /* synthetic */ hi3(gj3 gj3) {
        this.a = gj3;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        List<String> list = (List) obj;
        this.a.getClass();
        d.c.a aVar = new d.c.a(null, null, 3);
        aVar.c(list);
        aVar.a(list);
        return aVar.b();
    }
}
