package com.spotify.voice.experience;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.c;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.base.Supplier;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.q;
import com.spotify.music.C0707R;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.x;
import com.spotify.voice.results.model.e;
import dagger.android.support.DaggerFragment;
import defpackage.eve;
import io.reactivex.functions.h;

public class VoiceFragment extends DaggerFragment implements ToolbarConfig.a, NavigationItem, x {
    public static final /* synthetic */ int y0 = 0;
    n h0;
    v0f i0;
    w0f j0;
    y0f k0;
    h<ImageView, String, String, ng0> l0;
    VoiceFragmentLifecycleObserver m0;
    l1f n0;
    cif o0;
    Supplier<Boolean> p0;
    boolean q0;
    q<vue> r0;
    private MobiusLoop.g<dve, vue> s0;
    private int t0 = C0707R.array.suggestions_error_generic;
    private e u0;
    private boolean v0;
    private boolean w0;
    private int x0;

    class a extends ViewPager2.g {
        a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public void c(int i) {
            VoiceFragment.this.x0 = i;
        }
    }

    class b implements View.OnLayoutChangeListener {
        final /* synthetic */ View a;
        final /* synthetic */ BottomSheetBehavior b;

        b(View view, BottomSheetBehavior bottomSheetBehavior) {
            this.a = view;
            this.b = bottomSheetBehavior;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.a.removeOnLayoutChangeListener(this);
            this.b.v(i4 - VoiceFragment.this.R2().getDimensionPixelSize(C0707R.dimen.std_72dp));
            VoiceFragment.this.J4();
        }
    }

    private dve L4(Bundle bundle, Bundle bundle2) {
        eve c;
        cve cve;
        String string = bundle == null ? null : bundle.getString("com.spotify.voice.experience.KEY_DEEPLINK_OPTIONS");
        boolean z = bundle == null || bundle.getBoolean("com.spotify.voice.experience.KEY_ARG_INLINE");
        boolean z2 = bundle != null && bundle.getBoolean("com.spotify.voice.experience.KEY_ARG_IS_WAKE_WORD_SOURCE", false);
        n nVar = this.h0;
        if (bundle2 == null) {
            c = eve.e();
        } else {
            e eVar = (e) bundle2.getParcelable("com.spotify.voice.experience.KEY_BUNDLE_RESULTS");
            if (eVar != null) {
                c = eve.c(eVar);
            } else if (bundle2.getBoolean("com.spotify.voice.experience.KEY_BUNDLE_IS_IDLE")) {
                c = eve.d(bundle2.getInt("com.spotify.voice.experience.KEY_IDLE_SUGGESTIONS"));
            } else {
                c = eve.e();
            }
        }
        if (bundle == null) {
            cve = cve.c();
        } else {
            cve = (cve) bundle.getParcelable("com.spotify.voice.experience.KEY_ARG_EXP_LOG_MODEL");
            if (cve == null) {
                cve = cve.c();
            }
        }
        return nVar.b(z, c, cve, z2, this.o0.b(), string, this.q0);
    }

    public static VoiceFragment N4(String str, String str2, String str3, String str4, boolean z, String str5) {
        Bundle bundle = new Bundle(3);
        bundle.putString("com.spotify.voice.experience.KEY_ARG_PLAYER_TRACK_URI", str);
        bundle.putParcelable("com.spotify.voice.experience.KEY_ARG_EXP_LOG_MODEL", cve.b(str2, str3, str4));
        bundle.putBoolean("com.spotify.voice.experience.KEY_ARG_INLINE", z);
        bundle.putBoolean("com.spotify.voice.experience.KEY_ARG_IS_WAKE_WORD_SOURCE", "wakeword".equals(str2));
        bundle.putString("com.spotify.voice.experience.KEY_DEEPLINK_OPTIONS", str5);
        VoiceFragment voiceFragment = new VoiceFragment();
        voiceFragment.r4(bundle);
        return voiceFragment;
    }

    @Override // com.spotify.music.navigation.x
    public boolean C0() {
        MobiusLoop.g<dve, vue> gVar = this.s0;
        dve L4 = L4(D2(), null);
        eve l = gVar.b().l();
        l.getClass();
        if (l instanceof eve.c) {
            return false;
        }
        if (!(l instanceof eve.g)) {
            if (!(l instanceof eve.a) && !(l instanceof eve.h) && !(l instanceof eve.i) && !(l instanceof eve.j) && !(l instanceof eve.k) && !(l instanceof eve.l) && !(l instanceof eve.d)) {
                return false;
            }
            gVar.stop();
            gVar.a(L4);
            gVar.start();
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        this.s0.stop();
    }

    @Override // androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.s0.start();
    }

    public q1f M4(dve dve) {
        eve l = dve.l();
        l.getClass();
        if (l instanceof eve.c) {
            eve l2 = dve.l();
            l2.getClass();
            this.u0 = ((eve.c) l2).n();
        }
        eve l3 = dve.l();
        l3.getClass();
        boolean z = l3 instanceof eve.d;
        this.v0 = z;
        if (z) {
            eve l4 = dve.l();
            l4.getClass();
            this.t0 = ((eve.d) l4).n();
        }
        return this.n0.g(dve);
    }

    @Override // androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        bundle.putParcelable("com.spotify.voice.experience.KEY_BUNDLE_RESULTS", this.u0);
        bundle.putBoolean("com.spotify.voice.experience.KEY_BUNDLE_IS_IDLE", this.v0);
        bundle.putInt("com.spotify.voice.experience.KEY_IDLE_SUGGESTIONS", this.t0);
        bundle.putInt("com.spotify.voice.experience.KEY_BUNDLE_PAGE_POSITION", this.x0);
    }

    public void O4(String str) {
        D2().putBoolean("com.spotify.voice.experience.KEY_ARG_IS_WAKE_WORD_SOURCE", "wakeword".equals(str));
        this.s0.a(L4(D2(), null));
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        q<vue> qVar;
        Bundle D2 = D2();
        boolean z = D2 == null || D2.getBoolean("com.spotify.voice.experience.KEY_ARG_INLINE");
        this.w0 = z;
        l0f l0f = new l0f((ViewGroup) view, this.i0, this.k0, this.j0, this.l0, z, this.x0, this.p0);
        n nVar = this.h0;
        c j4 = j4();
        dve L4 = L4(D2, bundle);
        if (this.w0) {
            qVar = d.a;
        } else {
            qVar = bhf.a(BottomSheetBehavior.o(view.findViewById(C0707R.id.bottom_sheet_content)), vue.g());
        }
        MobiusLoop.g<dve, vue> a2 = nVar.a(j4, l0f, L4, qVar, this.r0);
        this.s0 = a2;
        a2.c(com.spotify.mobius.extras.a.a(new b(this), l0f));
    }

    @Override // com.spotify.music.navigation.x
    public boolean Y() {
        return this.w0;
    }

    @Override // com.spotify.music.navigation.NavigationItem
    public NavigationItem.NavigationGroup k0() {
        return NavigationItem.NavigationGroup.VOICE;
    }

    @Override // androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        A().a(this.m0);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        h4();
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_voice, viewGroup, false);
        ViewPager2 viewPager2 = (ViewPager2) q4.G(inflate, 16908298);
        viewPager2.e(new a());
        if (bundle == null) {
            i = 0;
        } else {
            i = bundle.getInt("com.spotify.voice.experience.KEY_BUNDLE_PAGE_POSITION");
        }
        this.x0 = i;
        if (D2() != null && D2().getBoolean("com.spotify.voice.experience.KEY_ARG_INLINE", false)) {
            return inflate;
        }
        View G = q4.G(inflate, C0707R.id.bottom_sheet_content);
        inflate.setSystemUiVisibility(1792);
        q4.P(G, new c(this, G, viewPager2));
        BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
        bottomSheetBehavior.u(true);
        bottomSheetBehavior.w(true);
        ((CoordinatorLayout.e) G.getLayoutParams()).j(bottomSheetBehavior);
        inflate.addOnLayoutChangeListener(new b(inflate, bottomSheetBehavior));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
        this.s0.d();
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.a
    public ToolbarConfig.Visibility z0() {
        return ToolbarConfig.Visibility.HIDE;
    }
}
