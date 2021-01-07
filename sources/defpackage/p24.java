package defpackage;

import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.t;
import com.spotify.music.C0707R;
import com.spotify.music.features.assistedcuration.search.e;
import io.reactivex.s;
import io.reactivex.v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: p24  reason: default package */
public class p24 {
    private final w a;
    private final t b;
    private final y24 c;

    public p24(w wVar, t tVar, y24 y24) {
        this.a = wVar;
        this.b = tVar;
        this.c = y24;
    }

    public s<b91> a(String str) {
        return this.a.b().E().W(new o24(this, str), false, Integer.MAX_VALUE);
    }

    public v b(String str, Map map) {
        Map<String, String> b2 = hfd.b(map, C0707R.integer.hugs_grid_columns_land, this.b);
        List<String> c2 = hfd.c(map);
        int ordinal = l0.z(str).q().ordinal();
        if (ordinal == 6) {
            ((ArrayList) c2).add(String.format("albumURI:%s", str));
            return this.c.a(b2, c2).P().h(b91.class);
        } else if (ordinal == 14) {
            ((ArrayList) c2).add(String.format("artistURI:%s", str));
            return this.c.b(b2, c2).P().h(b91.class);
        } else if (e.c(str)) {
            String a2 = e.a(str);
            ((ArrayList) c2).add(String.format("artistURI:%s", e.b(str)));
            return this.c.c(a2, b2, c2).P().h(b91.class);
        } else {
            throw new AssertionError(je.x0("Bad uri in AssistedCurationSearchEntityDataSource: ", str));
        }
    }
}
