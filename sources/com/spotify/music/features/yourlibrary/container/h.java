package com.spotify.music.features.yourlibrary.container;

import com.spotify.music.yourlibrary.interfaces.LoadingState;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState;
import com.spotify.music.yourlibrary.interfaces.i;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.a;

public class h implements da2<i> {
    private final PublishSubject<o19> a = PublishSubject.h1();
    private final a<i> b = a.i1(i.a);
    private final PublishSubject<ej9> c = PublishSubject.h1();
    private final z09 d;

    public h(z09 z09) {
        this.d = z09;
    }

    static void c(h hVar, YourLibraryPageId yourLibraryPageId, YourLibraryTabsCollapseState yourLibraryTabsCollapseState, boolean z) {
        hVar.a.onNext(o19.j(yourLibraryPageId, yourLibraryTabsCollapseState, z));
    }

    static void d(h hVar, YourLibraryPageId yourLibraryPageId, boolean z) {
        hVar.a.onNext(o19.i(yourLibraryPageId, z));
    }

    static void e(h hVar, YourLibraryPageId yourLibraryPageId, boolean z) {
        hVar.a.onNext(o19.h(yourLibraryPageId, z));
    }

    static void f(h hVar, YourLibraryPageId yourLibraryPageId, LoadingState loadingState) {
        hVar.a.onNext(o19.f(yourLibraryPageId, loadingState));
    }

    public void a(i iVar) {
        this.b.onNext(iVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.da2
    public void accept(i iVar) {
        this.b.onNext(iVar);
    }

    public s<o19> g() {
        return this.a;
    }

    public void h(YourLibraryPageId yourLibraryPageId, boolean z) {
        this.a.onNext(o19.d(yourLibraryPageId, z));
    }

    public s<ej9> i() {
        return this.c;
    }

    public void j(ej9 ej9) {
        this.c.onNext(ej9);
    }

    public void k() {
        this.a.onNext(o19.g());
    }

    public s<i> l() {
        return this.b;
    }
}
