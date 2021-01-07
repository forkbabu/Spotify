package com.spotify.encore.mobile.snackbar;

import android.view.View;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class SnackbarUtilsKt$applyFloatingStyle$1 extends FunctionReferenceImpl implements rmf<View, b5, b5> {
    public static final SnackbarUtilsKt$applyFloatingStyle$1 INSTANCE = new SnackbarUtilsKt$applyFloatingStyle$1();

    SnackbarUtilsKt$applyFloatingStyle$1() {
        super(2, SnackbarUtilsKt.class, "applyWindowInsetsForFloatingSnackbar", "applyWindowInsetsForFloatingSnackbar(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", 1);
    }

    public final b5 invoke(View view, b5 b5Var) {
        h.e(view, "p1");
        h.e(b5Var, "p2");
        return SnackbarUtilsKt.applyWindowInsetsForFloatingSnackbar(view, b5Var);
    }
}
