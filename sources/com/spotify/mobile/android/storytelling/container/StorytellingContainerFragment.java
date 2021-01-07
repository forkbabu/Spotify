package com.spotify.mobile.android.storytelling.container;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.o;
import com.spotify.mobile.android.share.menu.preview.api.e;
import com.spotify.mobile.android.storytelling.common.PauseState;
import com.spotify.mobile.android.storytelling.container.view.StorytellingContainerViews;
import com.spotify.mobius.MobiusLoop;
import dagger.android.support.DaggerFragment;
import java.io.Serializable;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class StorytellingContainerFragment extends DaggerFragment {
    public StorytellingContainerInjector h0;
    public nmf<PauseState, f> i0;
    public e j0;
    public nx1 k0;
    private MobiusLoop.g<tx1, rx1> l0;

    @Override // androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        nmf<PauseState, f> nmf = this.i0;
        if (nmf != null) {
            nmf.invoke(PauseState.PAUSED);
        } else {
            h.k("pauseStateConsumer");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        e eVar = this.j0;
        if (eVar == null) {
            h.k("sharePreviewMenu");
            throw null;
        } else if (eVar.a()) {
            nmf<PauseState, f> nmf = this.i0;
            if (nmf != null) {
                nmf.invoke(PauseState.PAUSED);
            } else {
                h.k("pauseStateConsumer");
                throw null;
            }
        } else {
            nmf<PauseState, f> nmf2 = this.i0;
            if (nmf2 != null) {
                nmf2.invoke(PauseState.RESUMED);
            } else {
                h.k("pauseStateConsumer");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        h.e(bundle, "outState");
        MobiusLoop.g<tx1, rx1> gVar = this.l0;
        if (gVar != null) {
            bundle.putSerializable("pause_state", gVar.b().e());
            MobiusLoop.g<tx1, rx1> gVar2 = this.l0;
            if (gVar2 != null) {
                bundle.putBoolean("muted", gVar2.b().c());
            } else {
                h.k("controller");
                throw null;
            }
        } else {
            h.k("controller");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        MobiusLoop.g<tx1, rx1> gVar = this.l0;
        if (gVar != null) {
            gVar.start();
        } else {
            h.k("controller");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void P3() {
        MobiusLoop.g<tx1, rx1> gVar = this.l0;
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
        Serializable serializable;
        h.e(layoutInflater, "inflater");
        if (bundle == null || (serializable = bundle.getSerializable("pause_state")) == null) {
            serializable = PauseState.RESUMED;
        }
        tx1 tx1 = new tx1(null, 0, (PauseState) serializable, bundle != null ? bundle.getBoolean("muted", false) : false, 3);
        o E2 = E2();
        h.d(E2, "childFragmentManager");
        nx1 nx1 = this.k0;
        if (nx1 != null) {
            StorytellingContainerViews storytellingContainerViews = new StorytellingContainerViews(layoutInflater, viewGroup, E2, nx1);
            StorytellingContainerInjector storytellingContainerInjector = this.h0;
            if (storytellingContainerInjector != null) {
                MobiusLoop.g<tx1, rx1> a = storytellingContainerInjector.a(tx1, new StorytellingContainerFragment$onCreateView$1(storytellingContainerViews));
                this.l0 = a;
                if (a != null) {
                    a.c(storytellingContainerViews);
                    return storytellingContainerViews.e();
                }
                h.k("controller");
                throw null;
            }
            h.k("injector");
            throw null;
        }
        h.k("controls");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
        nx1 nx1 = this.k0;
        if (nx1 != null) {
            nx1.dispose();
            MobiusLoop.g<tx1, rx1> gVar = this.l0;
            if (gVar != null) {
                gVar.d();
            } else {
                h.k("controller");
                throw null;
            }
        } else {
            h.k("controls");
            throw null;
        }
    }
}
