package com.spotify.music.mainactivity;

import androidx.fragment.app.Fragment;
import com.spotify.music.navigation.c;
import com.spotify.music.navigation.f;
import com.spotify.music.navigation.g;
import com.spotify.music.navigation.j;
import com.spotify.music.navigation.r;

public class m implements j {
    private final r a;

    public m(r rVar) {
        this.a = rVar;
    }

    @Override // com.spotify.music.navigation.j
    public void a(f fVar, Fragment fragment, g gVar, c cVar) {
        fVar.a(new d(this, fragment, gVar, cVar), new c(this, fragment, gVar, cVar), new f(this, fragment, gVar, cVar), new e(this, fragment, gVar, cVar));
    }

    public /* synthetic */ void b(Fragment fragment, g gVar, c cVar, f.a aVar) {
        this.a.b(fragment, gVar.d(), gVar.b(), gVar.c(), gVar.a(), false, cVar);
    }

    public /* synthetic */ void c(Fragment fragment, g gVar, c cVar, f.d dVar) {
        this.a.d(fragment, gVar.d(), gVar.b(), gVar.c(), gVar.a(), cVar.b());
    }

    public /* synthetic */ void d(Fragment fragment, g gVar, c cVar, f.b bVar) {
        this.a.b(fragment, gVar.d(), gVar.b(), gVar.c(), gVar.a(), true, cVar);
    }

    public /* synthetic */ void e(Fragment fragment, g gVar, c cVar, f.c cVar2) {
        this.a.f(cVar2.f(), fragment, gVar.d(), gVar.b(), gVar.c(), gVar.a(), cVar.b());
    }
}
