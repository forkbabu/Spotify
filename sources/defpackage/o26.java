package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.c;
import com.spotify.ubi.specification.factories.k2;
import io.reactivex.a;
import io.reactivex.internal.operators.completable.b;
import io.reactivex.internal.operators.completable.i;
import java.util.concurrent.TimeUnit;

/* renamed from: o26  reason: default package */
public class o26 {
    private final ere a;
    private final q26 b;
    private final uq6 c;
    private final k2.c d;

    public o26(c cVar, ere ere, q26 q26, uq6 uq6) {
        this.a = ere;
        this.b = q26;
        this.c = uq6;
        this.d = new k2(PageIdentifiers.PLAYLIST_NOTLOADED.path(), cVar.toString(), "johboh").d();
    }

    public a a(String str) {
        String T = this.c.T();
        if (MoreObjects.isNullOrEmpty(T)) {
            return b.a;
        }
        this.a.a(this.d.a());
        return new i(this.b.a(str, T).I(1200, TimeUnit.MILLISECONDS).D(n26.a).p(new m26(this)));
    }

    public /* synthetic */ void b(String str) {
        this.c.d1();
    }
}
