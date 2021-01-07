package com.spotify.music.lyrics.core.experience.fullscreen;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.androidx.fragment.app.LifecycleListenableDialogFragment;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import kotlin.jvm.internal.h;

public abstract class BaseLyricsFullscreenFragment extends LifecycleListenableDialogFragment implements c.a {

    public static final class a extends Dialog {
        final /* synthetic */ BaseLyricsFullscreenFragment a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(BaseLyricsFullscreenFragment baseLyricsFullscreenFragment, Context context, int i) {
            super(context, i);
            this.a = baseLyricsFullscreenFragment;
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            this.a.c5();
            Dialog P4 = this.a.P4();
            if (P4 != null) {
                P4.dismiss();
            }
        }
    }

    static final class b implements m4 {
        final /* synthetic */ BaseLyricsFullscreenFragment a;

        b(BaseLyricsFullscreenFragment baseLyricsFullscreenFragment) {
            this.a = baseLyricsFullscreenFragment;
        }

        @Override // defpackage.m4
        public final b5 onApplyWindowInsets(View view, b5 b5Var) {
            h.e(view, "v");
            h.e(b5Var, "insets");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams)).bottomMargin = this.a.R2().getDimensionPixelSize(C0707R.dimen.bottom_margin) + b5Var.g();
                return b5Var;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        Dialog P4 = P4();
        Window window = P4 != null ? P4.getWindow() : null;
        if (window != null) {
            window.setLayout(-1, -1);
            View decorView = window.getDecorView();
            h.d(decorView, "window.decorView");
            decorView.setSystemUiVisibility(1796);
            window.clearFlags(2);
            window.setWindowAnimations(a5());
            q4.P(b5(), new b(this));
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog R4(Bundle bundle) {
        return new a(this, j4(), Q4());
    }

    public int a5() {
        return C0707R.style.DialogNoAnimation;
    }

    public abstract View b5();

    public abstract void c5();

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.Y;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void p3(Context context) {
        h.e(context, "context");
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        V4(0, C0707R.style.res_2132083081_lyrics_fullscreen);
    }
}
