package com.spotify.music.carmode.nowplaying.podcast.view.speedmenu;

import com.google.common.base.MoreObjects;
import com.spotify.music.carmode.nowplaying.podcast.view.speedmenu.f;
import com.spotify.music.carmode.nowplaying.podcast.view.speedmenu.g;
import io.reactivex.disposables.a;
import io.reactivex.s;
import io.reactivex.y;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class h implements g.a, f.a {
    private final Map<g, j> a = new HashMap(k.a().size());
    private final a b = new a();
    private final s<Integer> c;
    private final oq2 d;
    private final e e;

    public h(oq2 oq2, e eVar, y yVar) {
        this.c = oq2.a().o0(yVar);
        this.d = oq2;
        this.e = eVar;
    }

    public static void a(h hVar, int i) {
        for (Map.Entry<g, j> entry : hVar.a.entrySet()) {
            entry.getKey().setSelected(entry.getValue().b() == i);
        }
    }

    public void b() {
        this.e.a();
    }

    public void c(g gVar) {
        this.a.get(gVar).getClass();
        this.b.b(this.d.b(this.a.get(gVar).b()).subscribe());
    }

    public void d(List<? extends g> list, f fVar) {
        this.a.clear();
        List<j> a2 = k.a();
        MoreObjects.checkArgument(a2.size() == list.size());
        for (int i = 0; i < list.size(); i++) {
            g gVar = (g) list.get(i);
            j jVar = a2.get(i);
            gVar.setDescription(jVar.a());
            gVar.setSpeedIcon(mq2.a(jVar.b()).intValue());
            gVar.setListener(this);
            this.a.put(gVar, jVar);
        }
        this.b.b(this.c.subscribe(new c(this)));
        fVar.setListener(this);
    }

    public void e() {
        this.b.f();
    }
}
