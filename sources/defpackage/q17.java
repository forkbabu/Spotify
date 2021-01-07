package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.util.t;
import io.reactivex.s;
import io.reactivex.v;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: q17  reason: default package */
public class q17 {
    private final m17 a;
    private final int b;
    private final t c;
    private final w d;

    public q17(m17 m17, t tVar, int i, w wVar) {
        this.b = i;
        this.a = m17;
        this.c = tVar;
        this.d = wVar;
    }

    public s<HubsImmutableViewModel> a(String str) {
        return this.d.b().W(new f17(this, str), false, Integer.MAX_VALUE);
    }

    public /* synthetic */ v b(String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(10);
        linkedHashMap.put("signal", String.format("playlistURI:%s", str));
        linkedHashMap.put("region", Locale.getDefault().getCountry());
        linkedHashMap.putAll(hfd.b(map, this.b, this.c));
        return this.a.a(linkedHashMap, hfd.c(map)).P().j0(x07.a);
    }
}
