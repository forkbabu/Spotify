package defpackage;

import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.remoteconfig.y8;
import io.reactivex.disposables.b;
import io.reactivex.s;
import io.reactivex.v;
import java.util.Collections;
import java.util.Map;

/* renamed from: xyb  reason: default package */
public class xyb implements d {
    private final w a;
    private final pyb b;
    private final szb c;
    private final y8 f;
    private b n;

    public xyb(w wVar, pyb pyb, szb szb, y8 y8Var) {
        this.b = pyb;
        this.a = wVar;
        this.f = y8Var;
        this.c = szb;
    }

    public static void a(xyb xyb, Map map) {
        xyb.getClass();
        if (map != null && !map.isEmpty()) {
            xyb.c.a(map);
        }
    }

    public /* synthetic */ v b(Boolean bool) {
        if (bool.booleanValue()) {
            return this.b.a().P();
        }
        return s.i0(Collections.emptyMap());
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        if (this.f.a()) {
            this.n = this.a.b().j0(lyb.a).W(new oyb(this), false, Integer.MAX_VALUE).subscribe(new nyb(this), myb.a);
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        b bVar = this.n;
        if (bVar != null && !bVar.d()) {
            this.n.dispose();
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "MusicVideoTogglePrefetcher";
    }
}
