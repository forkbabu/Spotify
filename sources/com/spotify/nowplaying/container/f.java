package com.spotify.nowplaying.container;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.transition.Fade;
import androidx.transition.TransitionSet;
import androidx.transition.u;
import com.spotify.music.C0707R;
import com.spotify.pageloader.s0;
import defpackage.cqd;
import kotlin.jvm.internal.h;

public final class f implements s0, c {
    private FrameLayout a;
    private final b b;

    public f(b bVar) {
        h.e(bVar, "modeContainerPresenter");
        this.b = bVar;
    }

    @Override // com.spotify.nowplaying.container.c
    public void a(cqd.a aVar) {
        h.e(aVar, "page");
        FrameLayout frameLayout = this.a;
        if (frameLayout != null) {
            LayoutInflater from = LayoutInflater.from(frameLayout.getContext());
            h.d(from, "LayoutInflater.from(rootView.context)");
            FrameLayout frameLayout2 = this.a;
            if (frameLayout2 != null) {
                View a2 = aVar.a(from, frameLayout2);
                FrameLayout frameLayout3 = this.a;
                if (frameLayout3 != null) {
                    Fade fade = new Fade(2);
                    fade.T(200);
                    Interpolator interpolator = ta0.e;
                    fade.V(interpolator);
                    Fade fade2 = new Fade(1);
                    fade2.T(200);
                    fade2.V(interpolator);
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.i0(0);
                    transitionSet.c0(fade);
                    transitionSet.c0(fade2);
                    u.a(frameLayout3, transitionSet);
                    FrameLayout frameLayout4 = this.a;
                    if (frameLayout4 != null) {
                        frameLayout4.removeAllViews();
                        FrameLayout frameLayout5 = this.a;
                        if (frameLayout5 != null) {
                            frameLayout5.addView(a2);
                            FrameLayout frameLayout6 = this.a;
                            if (frameLayout6 != null) {
                                q4.F(frameLayout6);
                            } else {
                                h.k("rootView");
                                throw null;
                            }
                        } else {
                            h.k("rootView");
                            throw null;
                        }
                    } else {
                        h.k("rootView");
                        throw null;
                    }
                } else {
                    h.k("rootView");
                    throw null;
                }
            } else {
                h.k("rootView");
                throw null;
            }
        } else {
            h.k("rootView");
            throw null;
        }
    }

    public FrameLayout b() {
        FrameLayout frameLayout = this.a;
        if (frameLayout == null) {
            return null;
        }
        if (frameLayout != null) {
            return frameLayout;
        }
        h.k("rootView");
        throw null;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        FrameLayout frameLayout = this.a;
        if (frameLayout != null) {
            return frameLayout;
        }
        return null;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        h.e(context, "context");
        h.e(viewGroup, "parent");
        h.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0707R.layout.now_playing_container, viewGroup, false);
        if (inflate != null) {
            this.a = (FrameLayout) inflate;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        this.b.b(this);
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        this.b.c();
    }
}
