package com.spotify.music.libs.podcast.download;

import android.content.DialogInterface;
import com.google.common.collect.ImmutableList;
import com.spotify.music.navigation.t;
import com.spotify.playlist.endpoints.p;
import com.spotify.playlist.models.offline.a;
import java.util.List;
import kotlin.f;

public class a0 {
    private final y a;
    private final t b;

    public interface a {
        void a();
    }

    public interface b {
        void a(List<String> list);
    }

    public a0(y yVar, t tVar) {
        this.a = yVar;
        this.b = tVar;
    }

    private void a(c0 c0Var, b bVar) {
        ImmutableList<p.b> b2 = c0Var.b();
        if (b2.isEmpty()) {
            this.a.c(new f(bVar), e.a).a();
        } else {
            this.a.d(new d(bVar, b2), p.a, b2).a();
        }
    }

    public f b(c0 c0Var, a aVar, a.f fVar) {
        if (c0Var.a()) {
            aVar.a();
        } else {
            this.a.b(new l(this), h.a).a();
        }
        return f.a;
    }

    public /* synthetic */ f c(c0 c0Var, b bVar, a.C0377a aVar) {
        a(c0Var, bVar);
        return f.a;
    }

    public /* synthetic */ f d(c0 c0Var, b bVar, a.g gVar) {
        a(c0Var, bVar);
        return f.a;
    }

    public void e(DialogInterface dialogInterface, int i) {
        this.b.d("spotify:internal:preferences");
    }

    public void f(com.spotify.playlist.models.offline.a aVar, c0 c0Var, a aVar2, b bVar) {
        aVar.b(new n(this, c0Var, aVar2), new i(bVar), new j(bVar), new o(this, c0Var, bVar), new m(bVar), new c(bVar), new g(bVar), new k(this, c0Var, bVar));
    }
}
