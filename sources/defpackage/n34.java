package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.x;
import defpackage.s81;
import java.util.ArrayList;
import java.util.List;

/* renamed from: n34  reason: default package */
public final class n34 implements sg0<b91, b91> {
    private static List<? extends s81> a(List<? extends s81> list) {
        s81 s81;
        String uri;
        s81.a aVar;
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        s81 s812 = null;
        for (s81 s813 : list) {
            if (s813.componentId().category().equals(HubsComponentCategory.HEADER.d())) {
                s812 = s813;
            }
            a91 target = s813.target();
            if (target == null || (uri = target.uri()) == null) {
                s81 = s813;
            } else {
                s81.a x = s813.toBuilder().x(null);
                if (l0.b(uri, LinkType.TRACK)) {
                    String str = "";
                    String str2 = (String) x.n(s813.metadata().string("preview_id"), str);
                    if (s812 != null) {
                        str = s812.id();
                    }
                    String c = rqa.c(str2, str);
                    boolean a = nt2.a(s813);
                    boolean boolValue = s813.metadata().boolValue("is19plus", false);
                    s81.a f = rqa.b(x, c).f("click", i24.a(uri, str2, c, a, boolValue)).f("imageClick", i24.a(uri, str2, c, a, boolValue));
                    int i = w14.o;
                    aVar = f.f("rightAccessoryClick", z81.b().e("ac:addToPlaylistAndSaveToHistory").b("uri", uri).c());
                } else if (pqa.d(uri)) {
                    aVar = x.f("click", e24.a(uri));
                } else {
                    int i2 = c24.o;
                    aVar = x.f("click", z81.b().e("ac:navigateAndSaveToHistory").b("uri", uri).c());
                }
                s81 = aVar.l();
            }
            arrayList.add(s81.toBuilder().m(a(s813.children())).l());
        }
        return arrayList;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.sg0
    public b91 apply(b91 b91) {
        b91 b912 = b91;
        return b912.toBuilder().e(a(b912.body())).g();
    }
}
