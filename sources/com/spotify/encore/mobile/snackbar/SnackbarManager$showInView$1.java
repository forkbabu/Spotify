package com.spotify.encore.mobile.snackbar;

import android.view.View;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* access modifiers changed from: package-private */
public final /* synthetic */ class SnackbarManager$showInView$1 extends FunctionReferenceImpl implements nmf<Integer, View> {
    SnackbarManager$showInView$1(View view) {
        super(1, view, View.class, "findViewById", "findViewById(I)Landroid/view/View;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public /* bridge */ /* synthetic */ View invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final View invoke(int i) {
        return ((View) this.receiver).findViewById(i);
    }
}
