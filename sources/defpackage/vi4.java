package defpackage;

import com.spotify.ubi.specification.factories.w;
import com.spotify.ubi.specification.factories.x;
import kotlin.jvm.internal.h;

/* renamed from: vi4  reason: default package */
public final class vi4 implements ui4 {
    private final ere a;
    private final w b;
    private final x c;

    public vi4(ere ere, w wVar, x xVar) {
        h.e(ere, "userBehaviourEventLogger");
        h.e(wVar, "mobileAudioplhsAddsongModalEventFactory");
        h.e(xVar, "mobileAudioplusInterfaceEventFactory");
        this.a = ere;
        this.b = wVar;
        this.c = xVar;
    }

    @Override // defpackage.ui4
    public void a(String str, String str2) {
        h.e(str, "trackUri");
        h.e(str2, "playlistUri");
        this.a.a(this.b.b().c().b(str, "").a(str2, str));
    }

    @Override // defpackage.ui4
    public void b() {
        this.a.a(this.c.c().a());
    }

    @Override // defpackage.ui4
    public void c(int i) {
        this.a.a(this.c.b().b(Integer.valueOf(i)).a());
    }

    @Override // defpackage.ui4
    public void d(String str, String str2) {
        h.e(str, "podcastUri");
        h.e(str2, "playlistUri");
        this.a.a(this.b.b().b().b(str, "").a(str2, str));
    }
}
