package com.spotify.voice.experiments.experience;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Collections2;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx2.i;
import com.spotify.music.C0707R;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.x;
import com.spotify.voice.api.model.VoiceInteractionResponse;
import com.spotify.voice.experiments.experience.view.ExperimentsViewFactory;
import com.spotify.voice.experiments.experience.view.e1;
import com.spotify.voice.experiments.experience.view.listening.ListeningView;
import dagger.android.support.DaggerFragment;
import defpackage.x2f;
import io.reactivex.s;

public class VoiceExperimentsFragment extends DaggerFragment implements ToolbarConfig.a, NavigationItem, x {
    public static final /* synthetic */ int l0 = 0;
    l h0;
    p8f i0;
    ExperimentsViewFactory j0;
    private MobiusLoop.g<w2f, q2f> k0;

    class a implements View.OnLayoutChangeListener {
        final /* synthetic */ View a;
        final /* synthetic */ BottomSheetBehavior b;

        a(View view, BottomSheetBehavior bottomSheetBehavior) {
            this.a = view;
            this.b = bottomSheetBehavior;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.a.removeOnLayoutChangeListener(this);
            this.b.v(i4 - VoiceExperimentsFragment.this.R2().getDimensionPixelSize(C0707R.dimen.std_72dp));
            VoiceExperimentsFragment.this.J4();
        }
    }

    private w2f K4(Bundle bundle) {
        String str;
        x2f x2f;
        v2f v2f;
        VoiceInteractionResponse.Action action = null;
        VoiceInteractionResponse.ClientActions clientActions = bundle == null ? null : (VoiceInteractionResponse.ClientActions) bundle.getParcelable("com.spotify.com.voice.experiments.experience.KEY_ARG_ACTIONS");
        l lVar = this.h0;
        if (clientActions == null) {
            str = "";
        } else {
            str = MoreObjects.nullToEmpty(clientActions.interactionId());
        }
        if (clientActions == null || clientActions.actions() == null) {
            x2f = x2f.f();
        } else {
            if (!clientActions.actions().isEmpty()) {
                action = clientActions.actions().get(0);
            }
            x2f = x2f.a(action, Collections2.newArrayDeque(clientActions.actions()));
        }
        if (bundle == null) {
            v2f = v2f.b();
        } else {
            v2f = (v2f) bundle.getParcelable("com.spotify.com.voice.experiments.experience.KEY_ARG_EXP_LOG_MODEL");
            if (v2f == null) {
                v2f = v2f.b();
            }
        }
        boolean c = this.j0.c();
        lVar.getClass();
        return w2f.a(str).k(x2f).j(v2f).l(c);
    }

    public static VoiceExperimentsFragment L4(String str, String str2, Parcelable parcelable, String str3) {
        Bundle bundle = new Bundle(3);
        bundle.putParcelable("com.spotify.com.voice.experiments.experience.KEY_ARG_EXP_LOG_MODEL", v2f.a(str, str2));
        bundle.putParcelable("com.spotify.com.voice.experiments.experience.KEY_ARG_ACTIONS", parcelable);
        bundle.putString("com.spotify.com.voice.experiments.experience.KEY_DEEPLINK", str3);
        VoiceExperimentsFragment voiceExperimentsFragment = new VoiceExperimentsFragment();
        voiceExperimentsFragment.r4(bundle);
        return voiceExperimentsFragment;
    }

    @Override // com.spotify.music.navigation.x
    public boolean C0() {
        MobiusLoop.g<w2f, q2f> gVar = this.k0;
        w2f K4 = K4(D2());
        x2f d = gVar.b().d();
        d.getClass();
        if (d instanceof x2f.a) {
            return false;
        }
        if (!(d instanceof x2f.h)) {
            if (!(d instanceof x2f.b) && !(d instanceof x2f.i) && !(d instanceof x2f.e)) {
                return false;
            }
            gVar.stop();
            gVar.a(K4);
            gVar.start();
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        this.k0.stop();
    }

    @Override // androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.k0.start();
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        MobiusLoop.g<w2f, q2f> a2 = this.h0.a(j4(), new e1((ListeningView) q4.G(view, C0707R.id.listeningView)), K4(D2()), i.a(s.y(new a9f(q2f.e(), BottomSheetBehavior.o(view.findViewById(C0707R.id.bottom_sheet_content))))));
        this.k0 = a2;
        a2.c(com.spotify.mobius.extras.a.a(new b(this), this.j0.a((ViewGroup) view)));
    }

    @Override // com.spotify.music.navigation.x
    public boolean Y() {
        return false;
    }

    @Override // com.spotify.music.navigation.NavigationItem
    public NavigationItem.NavigationGroup k0() {
        return NavigationItem.NavigationGroup.VOICE;
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h4();
        View inflate = layoutInflater.inflate(this.j0.b(), viewGroup, false);
        View G = q4.G(inflate, C0707R.id.bottom_sheet_content);
        inflate.setSystemUiVisibility(1792);
        q4.P(G, new a(G));
        BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
        bottomSheetBehavior.u(true);
        bottomSheetBehavior.w(true);
        ((CoordinatorLayout.e) G.getLayoutParams()).j(bottomSheetBehavior);
        inflate.addOnLayoutChangeListener(new a(inflate, bottomSheetBehavior));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
        this.k0.d();
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.a
    public ToolbarConfig.Visibility z0() {
        return ToolbarConfig.Visibility.HIDE;
    }
}
