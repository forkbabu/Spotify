package com.spotify.music.yourlibrary.quickscroll;

/* access modifiers changed from: package-private */
public class w implements v {
    final /* synthetic */ x a;

    w(x xVar) {
        this.a = xVar;
    }

    @Override // com.spotify.music.yourlibrary.quickscroll.a0
    public String a(int i) {
        return this.a.d().a(i);
    }

    @Override // com.spotify.music.yourlibrary.quickscroll.v
    public int f() {
        return this.a.e().f();
    }

    @Override // com.spotify.music.yourlibrary.quickscroll.v
    public int g() {
        return this.a.f().g();
    }

    @Override // com.spotify.music.yourlibrary.quickscroll.v
    public int getSize() {
        return this.a.f().getSize();
    }

    @Override // com.spotify.music.yourlibrary.quickscroll.z
    public boolean h(int i) {
        z b = this.a.b();
        if (b != null) {
            return b.h(i);
        }
        return false;
    }

    @Override // com.spotify.music.yourlibrary.quickscroll.z
    public int m() {
        z b = this.a.b();
        if (b != null) {
            return b.m();
        }
        return 0;
    }

    @Override // com.spotify.music.yourlibrary.quickscroll.v
    public void o(int i) {
        this.a.e().o(i);
    }
}
