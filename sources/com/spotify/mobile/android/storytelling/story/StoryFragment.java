package com.spotify.mobile.android.storytelling.story;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.storytelling.common.PauseState;
import com.spotify.mobile.android.storytelling.common.g;
import com.spotify.mobile.android.storytelling.story.view.StoryViews;
import com.spotify.mobius.MobiusLoop;
import dagger.android.support.DaggerFragment;
import defpackage.wy1;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class StoryFragment extends DaggerFragment {
    public nmf<Integer, g> h0;
    public nmf<kx1, f> i0;
    public ix1 j0;
    public mx1 k0;
    public StoryInjector l0;
    private MobiusLoop.g<yy1, vy1> m0;

    private final int K4() {
        Bundle D2 = D2();
        if (D2 != null) {
            return D2.getInt("story_index");
        }
        throw new IllegalStateException("story index not found".toString());
    }

    @Override // androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        h.e(bundle, "outState");
        MobiusLoop.g<yy1, vy1> gVar = this.m0;
        if (gVar != null) {
            bundle.putParcelable("model", gVar.b());
        } else {
            h.k("controller");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        MobiusLoop.g<yy1, vy1> gVar = this.m0;
        if (gVar != null) {
            gVar.start();
        } else {
            h.k("controller");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void P3() {
        MobiusLoop.g<yy1, vy1> gVar = this.m0;
        if (gVar != null) {
            gVar.stop();
            super.P3();
            return;
        }
        h.k("controller");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        yy1 yy1;
        h.e(layoutInflater, "inflater");
        nmf<Integer, g> nmf = this.h0;
        if (nmf != null) {
            nmf<kx1, f> nmf2 = this.i0;
            if (nmf2 != null) {
                ix1 ix1 = this.j0;
                if (ix1 != null) {
                    mx1 mx1 = this.k0;
                    if (mx1 != null) {
                        StoryViews storyViews = new StoryViews(layoutInflater, viewGroup, nmf, nmf2, ix1, mx1);
                        nmf<Integer, g> nmf3 = this.h0;
                        if (nmf3 != null) {
                            g invoke = nmf3.invoke(Integer.valueOf(K4()));
                            if (bundle == null || (yy1 = (yy1) bundle.getParcelable("model")) == null) {
                                yy1 = new yy1(K4(), invoke instanceof g.a ? wy1.c.a : wy1.b.a, PauseState.RESUMED);
                            }
                            if (invoke instanceof g.a) {
                                int K4 = K4();
                                hx1 a = ((g.a) invoke).a();
                                nmf<kx1, f> nmf4 = this.i0;
                                if (nmf4 != null) {
                                    storyViews.e(K4, a, nmf4, yy1.b());
                                } else {
                                    h.k("storyStartConsumer");
                                    throw null;
                                }
                            }
                            StoryInjector storyInjector = this.l0;
                            if (storyInjector != null) {
                                MobiusLoop.g<yy1, vy1> a2 = storyInjector.a(yy1);
                                this.m0 = a2;
                                if (a2 != null) {
                                    a2.c(storyViews);
                                    return storyViews.d();
                                }
                                h.k("controller");
                                throw null;
                            }
                            h.k("injector");
                            throw null;
                        }
                        h.k("storyStateProvider");
                        throw null;
                    }
                    h.k("storyPlayer");
                    throw null;
                }
                h.k("storyContainerControl");
                throw null;
            }
            h.k("storyStartConsumer");
            throw null;
        }
        h.k("storyStateProvider");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
        nmf<Integer, g> nmf = this.h0;
        if (nmf != null) {
            g invoke = nmf.invoke(Integer.valueOf(K4()));
            if (invoke instanceof g.a) {
                ((g.a) invoke).a().dispose();
            }
            MobiusLoop.g<yy1, vy1> gVar = this.m0;
            if (gVar != null) {
                gVar.d();
            } else {
                h.k("controller");
                throw null;
            }
        } else {
            h.k("storyStateProvider");
            throw null;
        }
    }
}
