package okhttp3.internal.connection;

import com.spotify.cosmos.router.Request;
import okhttp3.a0;
import okhttp3.d0;
import okhttp3.v;
import okhttp3.y;

public final class a implements v {
    public final y a;

    public a(y yVar) {
        this.a = yVar;
    }

    @Override // okhttp3.v
    public d0 a(v.a aVar) {
        fof fof = (fof) aVar;
        a0 i = fof.i();
        f j = fof.j();
        return fof.g(i, j, j.h(this.a, aVar, !i.g().equals(Request.GET)), j.d());
    }
}
