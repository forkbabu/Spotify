package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.libs.carmodeengine.settings.r;
import com.spotify.music.libs.carmodeengine.util.y;

/* renamed from: v5a  reason: default package */
public class v5a implements d {
    public static final /* synthetic */ int n = 0;
    MobiusLoop.g<c7a, a7a> a;
    private final n5a b;
    private final y c;
    private final r f;

    public v5a(n5a n5a, y yVar, r rVar) {
        this.b = n5a;
        this.c = yVar;
        this.f = rVar;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.f.a();
        if (this.c.i()) {
            this.a = this.b.a(c7a.a);
        }
        MobiusLoop.g<c7a, a7a> gVar = this.a;
        if (gVar != null) {
            gVar.c(g5a.a);
            this.a.start();
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        MobiusLoop.g<c7a, a7a> gVar = this.a;
        if (gVar != null) {
            gVar.stop();
            this.a.d();
            this.a = null;
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "CarModeEngine";
    }
}
