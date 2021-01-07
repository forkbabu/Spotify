package com.spotify.voice.experiments.onboarding;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import dagger.android.support.DaggerFragment;

public class VoiceExperimentsOnboardingFragment extends DaggerFragment {
    public static final /* synthetic */ int l0 = 0;
    v8f h0;
    w8f i0;
    x8f j0;
    private final io.reactivex.disposables.a k0 = new io.reactivex.disposables.a();

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
            this.b.v(i4 - VoiceExperimentsOnboardingFragment.this.R2().getDimensionPixelSize(C0707R.dimen.std_72dp));
            VoiceExperimentsOnboardingFragment.this.J4();
        }
    }

    class b extends BottomSheetBehavior.d {
        b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public void a(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public void b(View view, int i) {
            if (5 == i) {
                VoiceExperimentsOnboardingFragment.this.j0.h();
                VoiceExperimentsOnboardingFragment.this.h0.dismiss();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.k0.b(this.h0.c().o0(io.reactivex.android.schedulers.a.b()).subscribe(new b(this)));
    }

    @Override // androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.k0.f();
    }

    @Override // androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        q4.G(view, C0707R.id.closeButton).setOnClickListener(new a(this));
        q4.G(view, 16908313).setOnClickListener(new d(this));
        q4.G(view, 16908314).setOnClickListener(new e(this));
        TextView textView = (TextView) q4.G(view, C0707R.id.point_total);
        Context context = textView.getContext();
        String quantityString = context.getResources().getQuantityString(C0707R.plurals.points_label, 0, 0);
        SpannableString spannableString = new SpannableString(quantityString);
        spannableString.setSpan(new TextAppearanceSpan(context, R.style.TextAppearance_Encore_Forte), 0, 1, 33);
        spannableString.setSpan(new TextAppearanceSpan(context, R.style.TextAppearance_Encore_Cello), 1, quantityString.length(), 33);
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
        textView.setVisibility(0);
        BottomSheetBehavior.o(q4.G(view, C0707R.id.bottom_sheet_content)).i(new b());
    }

    @Override // androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        this.j0.g();
        this.i0.a();
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h4();
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_voice_onbording_experiments, viewGroup, false);
        View G = q4.G(inflate, C0707R.id.bottom_sheet_content);
        inflate.setSystemUiVisibility(1792);
        q4.P(G, new c(G));
        BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
        bottomSheetBehavior.u(true);
        bottomSheetBehavior.w(true);
        ((CoordinatorLayout.e) G.getLayoutParams()).j(bottomSheetBehavior);
        inflate.addOnLayoutChangeListener(new a(inflate, bottomSheetBehavior));
        return inflate;
    }
}
