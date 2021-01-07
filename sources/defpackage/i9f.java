package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;
import defpackage.t8a;
import io.reactivex.a;

/* renamed from: i9f  reason: default package */
public class i9f {
    private final t8a a;

    public i9f(t8a.a aVar) {
        this.a = aVar.a(ViewUris.e2);
    }

    public a a(String str) {
        return a.u(new f9f(this, str));
    }

    public /* synthetic */ void b(String str) {
        this.a.e(str, ViewUris.e2.toString());
    }
}
