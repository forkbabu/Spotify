package com.spotify.encore.mobile.snackbar;

import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.a;
import androidx.core.widget.c;
import com.comscore.util.crashreport.CrashReportManager;
import com.google.android.material.snackbar.Snackbar;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

public final class SnackbarUtilsKt {
    private static final int ACTION_TEXT_APPEARANCE = R.style.TextAppearance_Encore_MinuetBold;
    private static final int ACTION_TEXT_COLOR = C0707R.color.cat_accessory_green;
    private static final int DEFAULT_BACKGROUND_COLOR = R.color.white;
    private static final int DEFAULT_TEXT_COLOR = R.color.black;
    private static final int INFO_TEXT_APPEARANCE = R.style.TextAppearance_Encore_Mesto;
    public static final int SNACKBAR_ACTION_DURATION = 2000;
    public static final int SNACKBAR_BASELINE_DURATION = 3000;

    private static final void applyActionButtonStyle(Snackbar snackbar) {
        View G = q4.G(snackbar.t(), C0707R.id.snackbar_action);
        h.d(G, "requireViewById<TextView…ial.R.id.snackbar_action)");
        TextView textView = (TextView) G;
        c.n(textView, ACTION_TEXT_APPEARANCE);
        textView.setBackground(null);
        dvd.a(textView).a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.spotify.encore.mobile.snackbar.SnackbarUtilsKt$sam$androidx_core_view_OnApplyWindowInsetsListener$0] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void applyFloatingStyle(com.google.android.material.snackbar.Snackbar r3) {
        /*
            java.lang.String r0 = "$this$applyFloatingStyle"
            kotlin.jvm.internal.h.e(r3, r0)
            android.view.View r0 = r3.t()
            int r1 = com.spotify.encore.mobile.snackbar.R.drawable.bg_floating_snackbar_view
            r0.setBackgroundResource(r1)
            android.view.View r0 = r3.t()
            com.spotify.encore.mobile.snackbar.SnackbarUtilsKt$applyFloatingStyle$1 r1 = com.spotify.encore.mobile.snackbar.SnackbarUtilsKt$applyFloatingStyle$1.INSTANCE
            if (r1 == 0) goto L_0x001c
            com.spotify.encore.mobile.snackbar.SnackbarUtilsKt$sam$androidx_core_view_OnApplyWindowInsetsListener$0 r2 = new com.spotify.encore.mobile.snackbar.SnackbarUtilsKt$sam$androidx_core_view_OnApplyWindowInsetsListener$0
            r2.<init>(r1)
            r1 = r2
        L_0x001c:
            m4 r1 = (defpackage.m4) r1
            defpackage.q4.P(r0, r1)
            applySnackbarGravity(r3)
            applyTextStyle(r3)
            applyActionButtonStyle(r3)
            android.content.Context r0 = r3.q()
            int r1 = com.spotify.encore.mobile.snackbar.SnackbarUtilsKt.ACTION_TEXT_COLOR
            android.content.res.ColorStateList r0 = androidx.core.content.a.c(r0, r1)
            r3.G(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.encore.mobile.snackbar.SnackbarUtilsKt.applyFloatingStyle(com.google.android.material.snackbar.Snackbar):void");
    }

    private static final void applySnackbarGravity(Snackbar snackbar) {
        View t = snackbar.t();
        h.d(t, "view");
        ViewGroup.LayoutParams layoutParams = t.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 8388691;
        } else if (layoutParams instanceof CoordinatorLayout.e) {
            ((CoordinatorLayout.e) layoutParams).c = 8388691;
        } else {
            Assertion.g("This " + layoutParams + " does not yet have support for applying gravity.");
        }
    }

    public static final void applyStyle(Snackbar snackbar) {
        h.e(snackbar, "$this$applyStyle");
        snackbar.t().setBackgroundColor(a.b(snackbar.q(), DEFAULT_BACKGROUND_COLOR));
        removeAdditionalTopPadding(snackbar);
        applyTextStyle(snackbar);
        applyActionButtonStyle(snackbar);
        snackbar.G(a.c(snackbar.q(), ACTION_TEXT_COLOR));
    }

    private static final void applyTextStyle(Snackbar snackbar) {
        View G = q4.G(snackbar.t(), C0707R.id.snackbar_text);
        h.d(G, "requireViewById<TextView…erial.R.id.snackbar_text)");
        TextView textView = (TextView) G;
        c.n(textView, INFO_TEXT_APPEARANCE);
        textView.setTextColor(a.b(snackbar.q(), DEFAULT_TEXT_COLOR));
    }

    /* access modifiers changed from: private */
    public static final b5 applyWindowInsetsForFloatingSnackbar(View view, b5 b5Var) {
        Resources resources = view.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.snackbar_floating_margin_start_end);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.snackbar_floating_margin_bottom);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(dimensionPixelSize, 0, dimensionPixelSize, b5Var.g() + dimensionPixelSize2);
            return b5Var;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final int getACTION_TEXT_APPEARANCE() {
        return ACTION_TEXT_APPEARANCE;
    }

    public static final int getDEFAULT_BACKGROUND_COLOR() {
        return DEFAULT_BACKGROUND_COLOR;
    }

    public static final int getDEFAULT_TEXT_COLOR() {
        return DEFAULT_TEXT_COLOR;
    }

    public static final int getINFO_TEXT_APPEARANCE() {
        return INFO_TEXT_APPEARANCE;
    }

    public static final int getSnackbarDuration(String str) {
        if (str != null) {
            if (str.length() > 0) {
                return CrashReportManager.TIME_WINDOW;
            }
        }
        return SNACKBAR_BASELINE_DURATION;
    }

    private static final void removeAdditionalTopPadding(Snackbar snackbar) {
        if (Build.VERSION.SDK_INT == 19) {
            View t = snackbar.t();
            h.d(t, "view");
            t.setFitsSystemWindows(false);
        }
    }
}
