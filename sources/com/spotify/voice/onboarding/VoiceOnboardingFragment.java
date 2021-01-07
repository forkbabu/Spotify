package com.spotify.voice.onboarding;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.C0707R;
import dagger.android.support.DaggerFragment;

public class VoiceOnboardingFragment extends DaggerFragment {
    public static final /* synthetic */ int l0 = 0;
    e h0;
    vff i0;
    uff j0;
    private MobiusLoop.g<jff, hff> k0;

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
            this.b.v(i4 - this.a.getResources().getDimensionPixelSize(C0707R.dimen.std_72dp));
            VoiceOnboardingFragment.this.J4();
        }
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
        jff jff;
        Bundle D2 = D2();
        if (D2 == null) {
            jff = jff.b();
        } else {
            jff = (jff) D2.getParcelable("KEY_MODEL");
            if (jff == null) {
                jff = jff.b();
            }
        }
        View findViewById = view.findViewById(C0707R.id.bottom_sheet_content);
        MobiusLoop.g<jff, hff> a2 = this.h0.a(jff, bhf.a(BottomSheetBehavior.o(findViewById), hff.i()));
        this.k0 = a2;
        a2.c(new lgf(findViewById, M2(), jff, this.i0, this.j0));
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h4();
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_voice_onboarding, viewGroup, false);
        View findViewById = inflate.findViewById(C0707R.id.bottom_sheet_content);
        findViewById.addOnLayoutChangeListener(new a(inflate, BottomSheetBehavior.o(findViewById)));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
        this.k0.d();
    }
}
