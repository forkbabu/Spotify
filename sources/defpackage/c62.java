package defpackage;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.ui.fragments.logic.m;
import com.spotify.mobile.android.ui.fragments.logic.n;
import com.spotify.player.sub.l;
import com.spotify.rxjava2.p;
import io.reactivex.android.schedulers.a;
import io.reactivex.s;
import io.reactivex.v;

/* renamed from: c62  reason: default package */
public class c62 {
    private static final Optional<String> e = Optional.of("premium");
    private final n a;
    private final l b;
    private final w c;
    private final p d = new p();

    public c62(n nVar, l lVar, w wVar) {
        this.b = lVar;
        this.c = wVar;
        this.a = nVar;
    }

    public static void a(c62 c62, m mVar) {
        c62.getClass();
        int a2 = mVar.a();
        String b2 = mVar.b();
        Logger.b("onPlaybackError(playbackError: %d, uri: %s);", Integer.valueOf(a2), b2);
        if (a2 == 14) {
            c62.a.a(a2, b2);
        }
    }

    public /* synthetic */ v b(Boolean bool) {
        return this.b.error().j0(new b62(bool));
    }

    public void c() {
        p pVar = this.d;
        s<Optional<String>> c2 = this.c.c("type");
        Optional<String> optional = e;
        optional.getClass();
        pVar.b(c2.j0(new x52(optional)).E().J0(new a62(this)).o0(a.b()).subscribe(new z52(this), new y52(this)));
    }

    public void d() {
        this.d.a();
    }
}
