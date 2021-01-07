package com.spotify.music.features.yourlibrary.container;

import com.google.common.base.Optional;
import com.spotify.music.yourlibrary.interfaces.LoadingState;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState;
import com.spotify.music.yourlibrary.interfaces.c;
import com.spotify.music.yourlibrary.interfaces.f;
import com.spotify.music.yourlibrary.interfaces.i;
import io.reactivex.s;

class g implements c {
    final /* synthetic */ h a;
    final /* synthetic */ f b;
    final /* synthetic */ h c;

    g(h hVar, h hVar2, f fVar) {
        this.c = hVar;
        this.a = hVar2;
        this.b = fVar;
    }

    @Override // com.spotify.music.yourlibrary.interfaces.c
    public void a(boolean z) {
        Optional<YourLibraryPageId> a2 = this.c.d.a(this.b);
        if (a2.isPresent()) {
            h.e(this.a, a2.get(), z);
        }
    }

    @Override // com.spotify.music.yourlibrary.interfaces.c
    public void b(boolean z) {
        Optional<YourLibraryPageId> a2 = this.c.d.a(this.b);
        if (a2.isPresent()) {
            h.d(this.a, a2.get(), z);
        }
    }

    @Override // com.spotify.music.yourlibrary.interfaces.c
    public void c(YourLibraryTabsCollapseState yourLibraryTabsCollapseState, boolean z) {
        Optional<YourLibraryPageId> a2 = this.c.d.a(this.b);
        if (a2.isPresent()) {
            h.c(this.a, a2.get(), yourLibraryTabsCollapseState, z);
        }
    }

    @Override // com.spotify.music.yourlibrary.interfaces.c
    public void d(boolean z) {
        Optional<YourLibraryPageId> a2 = this.c.d.a(this.b);
        if (!a2.isPresent()) {
            return;
        }
        if (!z) {
            h.c(this.a, a2.get(), YourLibraryTabsCollapseState.EXPANDED, true);
            h.d(this.a, a2.get(), true);
            return;
        }
        h.d(this.a, a2.get(), false);
    }

    @Override // com.spotify.music.yourlibrary.interfaces.c
    public void e(LoadingState loadingState) {
        Optional<YourLibraryPageId> a2 = this.c.d.a(this.b);
        if (a2.isPresent()) {
            h.f(this.a, a2.get(), loadingState);
        }
    }

    @Override // com.spotify.music.yourlibrary.interfaces.c
    public s<i> f() {
        return this.a.l();
    }
}
