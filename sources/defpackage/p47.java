package defpackage;

import com.spotify.playlist.models.Show;
import defpackage.b57;
import kotlin.jvm.internal.h;

/* renamed from: p47  reason: default package */
public final class p47 implements o47 {
    private final String a;

    public p47(String str) {
        h.e(str, "episodeUri");
        this.a = str;
    }

    @Override // defpackage.o47
    public b57 a(Show show) {
        h.e(show, "show");
        String str = this.a;
        boolean z = false;
        if (!(str == null || str.length() == 0)) {
            return new b57.b(this.a);
        }
        if (show.b() != Show.ConsumptionOrder.RECENT) {
            String f = show.f();
            if (!(f == null || f.length() == 0)) {
                z = true;
            }
        }
        if (z) {
            return new b57.b(show.f());
        }
        return b57.a.a;
    }
}
