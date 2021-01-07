package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.libs.collection.util.c;
import com.spotify.music.libs.collection.util.d;
import com.spotify.music.libs.collection.util.k;
import io.reactivex.s;
import io.reactivex.w;
import java.util.Map;

/* renamed from: xv3  reason: default package */
public class xv3 {
    private final CollectionStateProvider a;
    private final k b;
    private final w<b91, b91> c;
    private final String d;

    public xv3(CollectionStateProvider collectionStateProvider, k kVar, k1e<b91> k1e, String str) {
        this.a = collectionStateProvider;
        this.b = kVar;
        this.c = k1e;
        this.d = str;
    }

    public static wv3 b(xv3 xv3, b91 b91, Map map, Boolean bool) {
        return new wv3(b91, jf3.a(b91, ((CollectionStateProvider.a) map.get(xv3.d)).b(), ((CollectionStateProvider.a) map.get(xv3.d)).a(), bool.booleanValue()));
    }

    public s<wv3> a(b91 b91) {
        s i0 = s.i0(b91);
        CollectionStateProvider collectionStateProvider = this.a;
        String str = this.d;
        return s.m(i0.q(this.c), collectionStateProvider.b(str, str, str), this.b.b(this.d).j0(c.a).r0(d.a).R((R) Boolean.FALSE).P(), new tv3(this));
    }
}
