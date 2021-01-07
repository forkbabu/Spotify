package com.spotify.music.features.yourlibrary.container.view;

import androidx.viewpager.widget.ViewPager;
import com.google.common.base.Optional;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import com.spotify.music.yourlibrary.interfaces.f;

class y implements ViewPager.i {
    final /* synthetic */ da2 a;
    final /* synthetic */ x b;

    y(x xVar, da2 da2) {
        this.b = xVar;
        this.a = da2;
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void a(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void f(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void g(int i) {
        YourLibraryPageId x = this.b.o.x(i);
        Optional<f> A = this.b.o.A(x);
        if (A.isPresent()) {
            f fVar = A.get();
            String path = fVar.g1().path();
            String cVar = fVar.getViewUri().toString();
            this.a.accept(o19.e(x, path, cVar));
            this.b.q.b(cVar);
        }
    }
}
