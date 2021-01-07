package com.spotify.music.marquee.feedback;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.marquee.q;
import dagger.android.support.DaggerAppCompatDialogFragment;
import java.util.Arrays;
import java.util.List;

public class FeedbackMenuFragment extends DaggerAppCompatDialogFragment implements mfd, s {
    i A0;
    e B0;
    jjb C0;
    private AnimatorSet v0;
    private LinearLayout w0;
    private String x0 = "";
    private String y0 = "";
    private boolean z0;

    class a extends Dialog {

        /* renamed from: com.spotify.music.marquee.feedback.FeedbackMenuFragment$a$a  reason: collision with other inner class name */
        class C0309a extends AnimatorListenerAdapter {
            C0309a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (FeedbackMenuFragment.this.Y2() != null) {
                    FeedbackMenuFragment.this.Y2().n3(FeedbackMenuFragment.this.Z2(), 1, null);
                }
                FeedbackMenuFragment feedbackMenuFragment = FeedbackMenuFragment.this;
                feedbackMenuFragment.C0.b(feedbackMenuFragment.x0, FeedbackMenuFragment.this.y0);
                a.this.dismiss();
            }
        }

        a(Context context, int i) {
            super(context, i);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            FeedbackMenuFragment.c5(FeedbackMenuFragment.this, new C0309a());
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FeedbackMenuFragment.this.z0 = true;
        }
    }

    static void c5(FeedbackMenuFragment feedbackMenuFragment, Animator.AnimatorListener animatorListener) {
        feedbackMenuFragment.e5(Arrays.asList(q.c(feedbackMenuFragment.w0), q.d(feedbackMenuFragment.w0, 20.0f)), Optional.fromNullable(animatorListener));
    }

    private void e5(List<Animator> list, Optional<Animator.AnimatorListener> optional) {
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
            e5(Arrays.asList(q.b(this.w0), q.e(this.w0, 20.0f)), Optional.fromNullable(new b()));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        bundle.putBoolean("feedback_animation_enter_completed", this.z0);
        super.N3(bundle);
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog R4(Bundle bundle) {
        if (D2() != null) {
            this.x0 = D2().getString("artist_uri", "");
            this.y0 = D2().getString("lineitem_id", "");
        }
        if (bundle != null) {
            this.z0 = bundle.getBoolean("feedback_animation_enter_completed", false);
        }
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(B2()).inflate(C0707R.layout.marquee_feedback_menu, (ViewGroup) null);
        this.w0 = (LinearLayout) frameLayout.findViewById(C0707R.id.feedback_menu_content);
        a aVar = new a(B2(), 16973840);
        aVar.setContentView(frameLayout);
        RecyclerView recyclerView = (RecyclerView) aVar.findViewById(C0707R.id.feedback_menu_options);
        f fVar = new f(this.A0.a(), LayoutInflater.from(B2()), this.B0.b(this.x0, this.y0, B2()));
        recyclerView.setLayoutManager(new LinearLayoutManager(B2()));
        recyclerView.setAdapter(fVar);
        return aVar;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // defpackage.mfd
    public com.spotify.instrumentation.a g1() {
        return PageIdentifiers.ADS;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return ViewUris.f1.toString();
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.ADS, null);
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.a;
    }
}
