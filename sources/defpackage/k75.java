package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import com.spotify.rxjava2.q;
import io.reactivex.y;

/* renamed from: k75  reason: default package */
public class k75 {
    private final g75 a;
    private final b61 b;
    private final String c;
    private final String d;
    private final y e;
    private final q f = new q();
    private b91 g = HubsImmutableViewModel.EMPTY;

    public k75(g75 g75, b61 b61, String str, String str2, y yVar) {
        this.a = g75;
        this.b = b61;
        this.c = str;
        this.d = str2;
        this.e = yVar;
    }

    public static void a(k75 k75, b91 b91) {
        k75.b.k(b91);
        k75.g = b91;
    }

    public boolean b(b91 b91) {
        b91 b912 = this.g;
        HubsImmutableViewModel hubsImmutableViewModel = HubsImmutableViewModel.EMPTY;
        if (!hubsImmutableViewModel.equals(b912)) {
            int i = t71.c;
            if (!"hubs/placeholder".equals(b912.id()) && (hubsImmutableViewModel.equals(b91) || "hubs/placeholder".equals(b91.id()))) {
                return false;
            }
        }
        return true;
    }

    public void c(Throwable th) {
        b91 a2 = t71.a(SpotifyIconV2.WARNING, this.c, this.d);
        this.b.k(a2);
        this.g = a2;
        Logger.d(th.getMessage(), new Object[0]);
    }

    public void d(String str) {
        this.f.a(this.a.a(str).o0(this.e).Q(new c75(this)).subscribe(new b75(this), new d75(this)));
    }

    public void e() {
        this.f.c();
    }
}
