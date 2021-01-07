package defpackage;

import com.spotify.android.glue.components.toolbar.d;
import com.spotify.music.C0707R;
import com.spotify.music.libs.collection.played.a;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.t;
import com.spotify.music.podcast.episode.util.h;
import defpackage.wd7;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: ud7  reason: default package */
public class ud7 implements wd7.a {
    private final d a;
    private final com.spotify.music.features.addtoplaylist.d b;
    private final oa7 c;
    private final t d;
    private final jzc e;
    private final sd7 f;
    private final m8a g;
    private final a h;
    private final h i;
    private final bre j;

    public ud7(d dVar, com.spotify.music.features.addtoplaylist.d dVar2, t tVar, jzc jzc, sd7 sd7, oa7 oa7, m8a m8a, a aVar, h hVar, bre bre) {
        this.a = dVar;
        this.b = dVar2;
        this.d = tVar;
        this.e = jzc;
        this.f = sd7;
        this.c = oa7;
        this.g = m8a;
        this.h = aVar;
        this.i = hVar;
        this.j = bre;
    }

    @Override // defpackage.wd7.a
    public void a(String str) {
        this.g.a(str);
        this.c.j(true, str);
    }

    @Override // defpackage.wd7.a
    public void b(String str, List<String> list) {
        for (String str2 : list) {
            this.g.b(str2);
        }
        this.g.b(str);
        this.c.j(false, str);
    }

    @Override // defpackage.wd7.a
    public void c(String str) {
        this.b.a(Collections.singletonList(str), c.a(str).toString(), str);
        this.c.m();
    }

    @Override // defpackage.wd7.a
    public void d(String str) {
        this.d.d(str);
        this.c.r(str);
    }

    @Override // defpackage.wd7.a
    public void e(String str, Map<String, String> map) {
        this.f.a(str, map, this.j, this.c.l(str));
    }

    @Override // defpackage.wd7.a
    public void f(String str) {
        this.h.a(str);
        this.c.d(str);
        this.i.b(str);
    }

    @Override // defpackage.wd7.a
    public void g(String str) {
        this.h.b(str);
        this.c.h(str);
        this.i.c();
    }

    @Override // defpackage.wd7.a
    public void h(String str, String str2, String str3, String str4) {
        this.e.c(pzc.e(str3, str2, str4, str).build(), rzc.a, C0707R.string.integration_id_context_menu);
        this.c.e(str);
    }

    @Override // defpackage.wd7.a
    public void i() {
        this.a.P();
    }
}
