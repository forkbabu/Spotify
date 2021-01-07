package defpackage;

import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.x;
import com.spotify.music.features.assistedcuration.search.e;
import defpackage.o81;
import defpackage.s81;
import java.util.ArrayList;
import java.util.List;

/* renamed from: l34  reason: default package */
public final class l34 implements sg0<b91, b91> {
    private static List<? extends s81> a(List<? extends s81> list) {
        s81 s81;
        String uri;
        s81.a aVar;
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        String str = null;
        for (s81 s812 : list) {
            if ("header".equals(s812.componentId().category())) {
                str = s812.text().title();
            }
            if (!("assisted-curation-search-album-entity".equals(s812.id()) && "header".equals(s812.componentId().category()))) {
                a91 target = s812.target();
                if (target == null || (uri = target.uri()) == null) {
                    s81 = s812;
                } else {
                    s81.a x = s812.toBuilder().x(null);
                    if (l0.b(uri, LinkType.TRACK)) {
                        String str2 = (String) x.n(s812.metadata().string("preview_id"), "");
                        String c = rqa.c(str2, str);
                        boolean a = nt2.a(s812);
                        boolean boolValue = s812.metadata().boolValue("is19plus", false);
                        s81.a f = rqa.b(x, c).f("click", i24.a(uri, str2, c, a, boolValue)).f("imageClick", i24.a(uri, str2, c, a, boolValue));
                        int i = y14.f;
                        aVar = f.f("rightAccessoryClick", z81.b().e("ac:addToPlaylist").b("uri", uri).c());
                    } else if (e.c(uri)) {
                        String str3 = (String) x.n(str, "");
                        int i2 = e24.f;
                        o81.a b = z81.b().e("ac:navigate").b("uri", uri);
                        str3.getClass();
                        aVar = x.f("click", b.b("title", str3).c());
                    } else {
                        aVar = x.f("click", e24.a(uri));
                    }
                    s81 = aVar.l();
                }
                arrayList.add(s81.toBuilder().m(a(s812.children())).l());
            }
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
