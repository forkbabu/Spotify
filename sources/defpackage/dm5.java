package defpackage;

import com.spotify.mobile.android.spotlets.common.recyclerview.d;
import com.spotify.music.features.languagepicker.logger.b;
import com.spotify.music.features.languagepicker.model.g;
import defpackage.em5;
import java.util.HashSet;
import java.util.Set;

/* renamed from: dm5  reason: default package */
public abstract class dm5<VH extends em5> extends d<VH, g> {
    private final com.spotify.music.features.languagepicker.logger.a n;
    private final Set<String> o = new HashSet();
    protected a p;

    /* renamed from: dm5$a */
    public interface a {
        boolean c(int i);
    }

    public dm5(com.spotify.music.features.languagepicker.logger.a aVar) {
        this.n = aVar;
    }

    /* renamed from: i0 */
    public void X(VH vh) {
        vh.l0();
        int w = vh.w();
        if (w >= 0) {
            g gVar = (g) Z(w);
            if (this.o.add(gVar.a())) {
                ((b) this.n).f(gVar, w);
            }
        }
    }

    public void j0(a aVar) {
        aVar.getClass();
        this.p = aVar;
    }
}
