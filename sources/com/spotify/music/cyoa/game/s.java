package com.spotify.music.cyoa.game;

import com.spotify.music.cyoa.model.CyoaGame;
import com.spotify.music.cyoa.model.CyoaGameOption;
import com.spotify.music.cyoa.model.CyoaGameStatus;
import io.reactivex.disposables.b;
import io.reactivex.disposables.c;
import io.reactivex.y;

public class s {
    private final t a;
    private final o b;
    private final y c;
    private b d = c.a();
    private b e = c.a();
    private b f = c.a();

    public s(o oVar, t tVar, y yVar) {
        this.b = oVar;
        tVar.getClass();
        this.a = tVar;
        this.c = yVar;
    }

    private void g(int i, boolean z) {
        this.e = (z ? this.b.a(i) : this.b.d(i)).o0(this.c).subscribe(new b(this, i), i.a);
    }

    public void a(int i, CyoaGameOption cyoaGameOption) {
        io.reactivex.s<CyoaGameStatus> o0 = this.b.c(i, cyoaGameOption.getId()).o0(this.c);
        t tVar = this.a;
        tVar.getClass();
        this.f = o0.subscribe(new a(tVar), h.a);
    }

    public /* synthetic */ void b(CyoaGame cyoaGame) {
        g(cyoaGame.getId(), cyoaGame.isContinue());
    }

    public /* synthetic */ void c(CyoaGame cyoaGame) {
        g(cyoaGame.getId(), false);
    }

    public /* synthetic */ void d(CyoaGame cyoaGame) {
        this.a.h(cyoaGame);
        this.a.f(new d(this, cyoaGame));
        this.a.g(new g(this, cyoaGame));
    }

    public /* synthetic */ void e(int i, CyoaGameStatus cyoaGameStatus) {
        this.a.d(new f(this, i));
        this.a.e(cyoaGameStatus);
    }

    public void f(String str) {
        this.d = this.b.b(str).o0(this.c).subscribe(new e(this), c.a);
    }

    public void h() {
        this.d.dispose();
        this.e.dispose();
        this.f.dispose();
        this.a.c();
    }
}
