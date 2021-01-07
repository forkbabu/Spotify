package com.spotify.music.marquee.optout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.o0;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.marquee.feedback.FeedbackMenuFragment;
import com.spotify.music.marquee.q;
import dagger.android.support.DaggerAppCompatDialogFragment;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MarqueeOptOutMenuFragment extends DaggerAppCompatDialogFragment implements s, mfd, e {
    public static final /* synthetic */ int I0 = 0;
    g A0;
    o0 B0;
    private String C0 = "";
    private String D0 = "";
    private String E0 = "";
    private String F0 = "";
    private String G0 = "";
    private String H0 = "";
    private AnimatorSet v0;
    private View w0;
    private LinearLayout x0;
    private TextView y0;
    private boolean z0;

    /* access modifiers changed from: private */
    public enum MenuTransition {
        OVERLAY_TO_OPT_OUT,
        OPT_OUT_BACK,
        OPT_OUT_TO_SURVEY,
        SURVEY_TO_OPT_OUT
    }

    class a extends Dialog {

        /* renamed from: com.spotify.music.marquee.optout.MarqueeOptOutMenuFragment$a$a  reason: collision with other inner class name */
        class C0310a extends AnimatorListenerAdapter {
            C0310a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                a.this.dismiss();
            }
        }

        a(Context context, int i) {
            super(context, i);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            MarqueeOptOutMenuFragment.this.f5(MenuTransition.OPT_OUT_BACK, new C0310a());
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            MarqueeOptOutMenuFragment.b5(MarqueeOptOutMenuFragment.this);
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            o v0 = MarqueeOptOutMenuFragment.this.j4().v0();
            MarqueeOptOutMenuFragment marqueeOptOutMenuFragment = MarqueeOptOutMenuFragment.this;
            String str = marqueeOptOutMenuFragment.C0;
            String str2 = MarqueeOptOutMenuFragment.this.D0;
            FeedbackMenuFragment feedbackMenuFragment = new FeedbackMenuFragment();
            Bundle bundle = new Bundle();
            bundle.putString("artist_uri", str);
            bundle.putString("lineitem_id", str2);
            feedbackMenuFragment.r4(bundle);
            feedbackMenuFragment.E4(marqueeOptOutMenuFragment, 0);
            feedbackMenuFragment.Y4(v0, "marquee_feedback_menu");
        }
    }

    static void b5(MarqueeOptOutMenuFragment marqueeOptOutMenuFragment) {
        marqueeOptOutMenuFragment.z0 = true;
    }

    private void e5(MenuTransition menuTransition, Animator.AnimatorListener animatorListener) {
        Animator b2 = q.b(this.w0);
        Animator b3 = q.b(this.x0);
        Animator e = q.e(this.x0, 50.0f);
        List<Animator> emptyList = Collections.emptyList();
        if (menuTransition == MenuTransition.OVERLAY_TO_OPT_OUT) {
            emptyList = Arrays.asList(b2, b3, e);
        } else if (menuTransition == MenuTransition.SURVEY_TO_OPT_OUT) {
            emptyList = Arrays.asList(b3, e);
        }
        g5(emptyList, Optional.fromNullable(animatorListener));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void f5(MenuTransition menuTransition, Animator.AnimatorListener animatorListener) {
        Animator c2 = q.c(this.w0);
        Animator c3 = q.c(this.x0);
        Animator d = q.d(this.x0, 50.0f);
        List<Animator> emptyList = Collections.emptyList();
        if (menuTransition == MenuTransition.OPT_OUT_TO_SURVEY) {
            emptyList = Arrays.asList(c3, d);
        } else if (menuTransition == MenuTransition.OPT_OUT_BACK) {
            emptyList = Arrays.asList(c2, c3, d);
        }
        g5(emptyList, Optional.fromNullable(animatorListener));
    }

    private void g5(List<Animator> list, Optional<Animator.AnimatorListener> optional) {
        AnimatorSet animatorSet = this.v0;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.v0.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(list);
        animatorSet2.setDuration(200L);
        if (optional.isPresent()) {
            animatorSet2.addListener(optional.get());
        }
        animatorSet2.start();
        this.v0 = animatorSet2;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "";
    }

    @Override // androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        AnimatorSet animatorSet = this.v0;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.v0.cancel();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        if (!this.z0) {
            e5(MenuTransition.OVERLAY_TO_OPT_OUT, new b());
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        bundle.putBoolean("opt_out_animation_completed", this.z0);
        bundle.putFloat("opt_out_content_alpha", this.x0.getAlpha());
        bundle.putFloat("opt_out_content_translation_y", this.x0.getTranslationY());
        super.N3(bundle);
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog R4(Bundle bundle) {
        float f;
        float f2;
        androidx.fragment.app.c B2 = B2();
        if (D2() != null) {
            this.C0 = D2().getString("artist_uri");
            this.D0 = D2().getString("lineitem_id");
            this.E0 = D2().getString("disclosure_text");
            this.F0 = D2().getString("disclosure_cta_text");
            this.G0 = D2().getString("optout_artist_text");
            this.H0 = D2().getString("optout_marquee_text");
        }
        if (bundle != null) {
            this.z0 = bundle.getBoolean("opt_out_animation_completed", false);
            f2 = bundle.getFloat("opt_out_content_alpha");
            f = bundle.getFloat("opt_out_content_translation_y");
        } else {
            f2 = 1.0f;
            f = 0.0f;
        }
        a aVar = new a(B2, 16973840);
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(B2).inflate(C0707R.layout.optout_context_menu, (ViewGroup) null);
        this.w0 = frameLayout.findViewById(C0707R.id.opt_out_background_view);
        this.x0 = (LinearLayout) frameLayout.findViewById(C0707R.id.panel);
        this.y0 = (TextView) frameLayout.findViewById(C0707R.id.optout_title);
        this.x0.setAlpha(f2);
        this.x0.setTranslationY(f);
        int b2 = androidx.core.content.a.b(B2(), R.color.white);
        String str = this.E0;
        String str2 = this.F0;
        b bVar = new b(this);
        int length = str2.length();
        SpannableString spannableString = new SpannableString(str2);
        spannableString.setSpan(new sjb(b2, bVar), 0, length, 17);
        SpannableStringBuilder spannableStringBuilder = spannableString;
        if (!MoreObjects.isNullOrEmpty(str)) {
            spannableStringBuilder = SpannableStringBuilder.valueOf(str).append((CharSequence) " ").append((CharSequence) spannableString);
        }
        this.y0.setHighlightColor(0);
        this.y0.setMovementMethod(LinkMovementMethod.getInstance());
        this.y0.setText(spannableStringBuilder);
        aVar.setContentView(frameLayout);
        RecyclerView recyclerView = (RecyclerView) aVar.findViewById(C0707R.id.optout_menu_options);
        c cVar = new c(LayoutInflater.from(B2()), this.A0.b(this.C0, this.D0, this.G0, this.H0, B2()));
        recyclerView.setLayoutManager(new LinearLayoutManager(B2()));
        recyclerView.setAdapter(cVar);
        return aVar;
    }

    @Override // com.spotify.music.marquee.optout.e
    public void b0(int i) {
        this.B0.a(SpotifyIconV2.BAN, i, 1);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.music.marquee.optout.e
    public void e0() {
        f5(MenuTransition.OPT_OUT_TO_SURVEY, new c());
    }

    @Override // defpackage.mfd
    public com.spotify.instrumentation.a g1() {
        return PageIdentifiers.ADS;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return ViewUris.f1.toString();
    }

    @Override // androidx.fragment.app.Fragment
    public void n3(int i, int i2, Intent intent) {
        if (i2 == 1) {
            e5(MenuTransition.SURVEY_TO_OPT_OUT, null);
        }
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.ADS, null);
    }

    @Override // com.spotify.music.marquee.optout.e
    public void z() {
        if (B2() != null) {
            B2().finish();
            B2().overridePendingTransition(0, C0707R.anim.marquee_overlay_exit);
        }
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.a;
    }
}
