package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.mobile.android.util.l0;
import com.spotify.playlist.endpoints.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: pj3  reason: default package */
public class pj3 {
    private static final List<ane> b;
    private static final ane c;
    public static final /* synthetic */ int d = 0;
    private final ane a;

    static {
        ane ane = p.a.c.d;
        c = ane;
        ArrayList arrayList = new ArrayList();
        b = arrayList;
        arrayList.add(new ane("", false, null, 6));
        arrayList.add(p.a.c.b);
        arrayList.add(p.a.c.c);
        arrayList.add(p.a.c.e);
        arrayList.add(ane);
    }

    public pj3(rpd rpd) {
        Collection transform = Collections2.transform((Collection) b, (Function) oj3.a);
        l0 z = l0.z("spotify:playlists");
        ane ane = c;
        SortOption sortOption = new SortOption(ane.c(), true);
        sortOption.h(ane.e(), false);
        ArrayList newArrayList = Collections2.newArrayList(transform);
        rpd.getClass();
        this.a = z42.F(rpd.a(z.B(), sortOption, ImmutableList.copyOf((Collection) newArrayList)));
    }

    public ane a() {
        return this.a;
    }
}
