package com.spotify.music.yourlibrary.filterchips;

import androidx.transition.Transition;

/* access modifiers changed from: package-private */
public class g implements Transition.d {
    final /* synthetic */ Runnable a;

    g(h hVar, Runnable runnable) {
        this.a = runnable;
    }

    @Override // androidx.transition.Transition.d
    public void a(Transition transition) {
    }

    @Override // androidx.transition.Transition.d
    public void b(Transition transition) {
    }

    @Override // androidx.transition.Transition.d
    public void c(Transition transition) {
    }

    @Override // androidx.transition.Transition.d
    public void d(Transition transition) {
        this.a.run();
    }

    @Override // androidx.transition.Transition.d
    public void e(Transition transition) {
    }
}
