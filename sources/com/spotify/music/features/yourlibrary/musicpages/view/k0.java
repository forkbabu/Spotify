package com.spotify.music.features.yourlibrary.musicpages.view;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.pages.q;
import com.spotify.music.features.yourlibrary.musicpages.pages.s;
import com.spotify.music.features.yourlibrary.musicpages.pages.u;
import com.spotify.music.features.yourlibrary.musicpages.pages.y;
import java.util.EnumMap;
import java.util.Map;

public class k0 implements g<MusicPagesModel, s0> {
    private final LoadingView a;
    private final q b;
    private final zc9 c;
    private final Map<MusicPagesModel.LoadingState, View> f;
    private final Map<MusicPagesModel.LoadingState, ViewPropertyAnimator> n = new EnumMap(MusicPagesModel.LoadingState.class);
    private final Map<MusicPagesModel.LoadingState, b> o;

    class a implements h<MusicPagesModel> {
        c a;
        u b;

        a() {
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            MusicPagesModel musicPagesModel = (MusicPagesModel) obj;
            g0 g0Var = new g0(musicPagesModel.l(), musicPagesModel.g());
            if (!g0Var.equals(this.a)) {
                this.a = g0Var;
                k0.a(k0.this, g0Var);
            }
            u m = musicPagesModel.m();
            if (!m.equals(this.b)) {
                this.b = m;
                k0.this.b.a(m);
            }
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
        }
    }

    /* access modifiers changed from: private */
    public static class b implements Animator.AnimatorListener {
        private final d a;

        private b(d dVar) {
            this.a = dVar;
        }

        static b a(d dVar) {
            return new b(dVar);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.a();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* access modifiers changed from: package-private */
    public static abstract class c {
        c() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean a();

        /* access modifiers changed from: package-private */
        public abstract MusicPagesModel.LoadingState b();
    }

    /* access modifiers changed from: private */
    public interface d {
        void a();
    }

    public k0(LoadingView loadingView, q qVar, y yVar, s sVar, zc9 zc9) {
        this.a = loadingView;
        this.b = qVar;
        this.c = zc9;
        EnumMap enumMap = new EnumMap(MusicPagesModel.LoadingState.class);
        this.o = enumMap;
        MusicPagesModel.LoadingState loadingState = MusicPagesModel.LoadingState.LOADED_EMPTY;
        zc9.getClass();
        enumMap.put((EnumMap) loadingState, (MusicPagesModel.LoadingState) b.a(new e0(zc9)));
        MusicPagesModel.LoadingState loadingState2 = MusicPagesModel.LoadingState.LOADED_EMPTY_WITH_TEXT_FILTER;
        enumMap.put((EnumMap) loadingState2, (MusicPagesModel.LoadingState) b.a(new c0(zc9)));
        MusicPagesModel.LoadingState loadingState3 = MusicPagesModel.LoadingState.LOADED_EMPTY_WITH_FILTER;
        enumMap.put((EnumMap) loadingState3, (MusicPagesModel.LoadingState) b.a(new d0(zc9)));
        EnumMap enumMap2 = new EnumMap(MusicPagesModel.LoadingState.class);
        this.f = enumMap2;
        enumMap2.put((EnumMap) loadingState, (MusicPagesModel.LoadingState) qVar.b());
        enumMap2.put((EnumMap) loadingState2, (MusicPagesModel.LoadingState) yVar.a());
        enumMap2.put((EnumMap) loadingState3, (MusicPagesModel.LoadingState) sVar.a());
    }

    static void a(k0 k0Var, c cVar) {
        k0Var.getClass();
        MusicPagesModel.LoadingState b2 = cVar.b();
        boolean a2 = cVar.a();
        if (b2 != MusicPagesModel.LoadingState.LOADING) {
            k0Var.a.n();
        } else if (a2) {
            k0Var.a.s(0);
        }
        for (MusicPagesModel.LoadingState loadingState : k0Var.f.keySet()) {
            View view = k0Var.f.get(loadingState);
            ViewPropertyAnimator viewPropertyAnimator = k0Var.n.get(loadingState);
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            b bVar = k0Var.o.get(loadingState);
            ViewPropertyAnimator viewPropertyAnimator2 = null;
            if (b2 == loadingState) {
                if (!(view == null || view.getVisibility() == 0)) {
                    view.setAlpha(0.0f);
                    view.setVisibility(0);
                    viewPropertyAnimator2 = view.animate().alpha(1.0f).setDuration(100).setListener(bVar);
                }
            } else if (!(view == null || view.getVisibility() == 8)) {
                viewPropertyAnimator2 = view.animate().alpha(0.0f).setDuration(100).setListener(new l0(view));
            }
            k0Var.n.put(loadingState, viewPropertyAnimator2);
        }
    }

    public /* synthetic */ void c(da2 da2) {
        da2.accept(s0.f());
        this.c.q();
    }

    @Override // com.spotify.mobius.g
    public h<MusicPagesModel> t(da2<s0> da2) {
        this.b.d(new c(this, da2));
        return new a();
    }
}
