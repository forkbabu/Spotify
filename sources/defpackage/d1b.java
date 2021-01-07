package defpackage;

import com.spotify.mobile.android.rx.w;
import com.spotify.mobius.q;
import com.spotify.mobius.rx2.i;
import com.spotify.music.connection.l;
import io.reactivex.s;
import java.util.Map;

/* renamed from: d1b  reason: default package */
public class d1b {
    private final l a;
    private final w b;
    private final String c;
    private final s<txa> d;

    public d1b(l lVar, w wVar, String str, s<txa> sVar) {
        this.a = lVar;
        this.b = wVar;
        this.c = str;
        this.d = sVar;
    }

    public /* synthetic */ fza a(Map map) {
        return fza.c(this.c, (String) map.get("catalogue"), (String) map.get("country_code"));
    }

    public q<zya> b() {
        return i.a(this.a.a().v0(1).h1().j0(c1b.a).E(), this.b.b().j0(new b1b(this)).j0(z0b.a).E(), this.d.v0(1).h1().j0(a1b.a).E());
    }
}
