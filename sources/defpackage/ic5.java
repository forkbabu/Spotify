package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.libs.fullscreen.story.domain.b;
import com.spotify.music.libs.fullscreen.story.domain.c;
import com.spotify.music.libs.fullscreen.story.domain.d;
import com.spotify.music.libs.fullscreen.story.domain.e;
import com.spotify.music.libs.fullscreen.story.domain.g;
import com.spotify.music.libs.fullscreen.story.domain.h;
import com.spotify.music.libs.fullscreen.story.domain.i;
import com.spotify.music.libs.fullscreen.story.domain.p;
import com.spotify.stories.v2.view.rpc.proto.GetStoryViewResponse;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* renamed from: ic5  reason: default package */
public class ic5 {
    private static final Pattern e = Pattern.compile("\\{token\\}");
    public static final /* synthetic */ int f = 0;
    private final na5 a;
    private final gc5 b;
    private final l<GetStoryViewResponse, p> c;
    private final String d;

    public ic5(na5 na5, gc5 gc5, String str, l<GetStoryViewResponse, p> lVar) {
        this.a = na5;
        this.b = gc5;
        this.d = str;
        this.c = lVar;
    }

    static i a(p pVar, String str) {
        Optional optional;
        if (!pVar.b().isEmpty()) {
            Iterator<c> it = pVar.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    optional = Optional.absent();
                    break;
                }
                c next = it.next();
                if (!((next.b() instanceof b.C0289b) || (next.b() instanceof b.a))) {
                    optional = Optional.of(new i.h(new h.a(pVar)));
                    break;
                }
            }
        } else {
            optional = Optional.of(new i.h(new h.b(pVar)));
        }
        if (optional.isPresent()) {
            return (i) optional.get();
        }
        e c2 = pVar.c();
        ArrayList arrayList = new ArrayList(c2.a().size());
        for (d dVar : c2.a()) {
            arrayList.add(dVar.c(e.matcher(dVar.getUri()).replaceAll(str)));
        }
        return new i.u(pVar.g(new e(arrayList)));
    }

    public v b(g.e eVar) {
        s<R> j0 = this.a.a(this.d).P().j0(this.c);
        hc5 hc5 = (hc5) this.b;
        hc5.getClass();
        return s.d1(j0, s.c0(new ob5(hc5)).s0(""), qb5.a).r0(sb5.a);
    }
}
