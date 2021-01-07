package com.spotify.encore.mobile.snackbar;

import android.app.Activity;
import android.view.View;
import kotlin.jvm.internal.FunctionReferenceImpl;

final /* synthetic */ class SnackbarManager$1$onActivityResumed$1$1 extends FunctionReferenceImpl implements nmf<Integer, View> {
    SnackbarManager$1$onActivityResumed$1$1(Activity activity) {
        super(1, activity, Activity.class, "findViewById", "findViewById(I)Landroid/view/View;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public /* bridge */ /* synthetic */ View invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final View invoke(int i) {
        return ((Activity) this.receiver).findViewById(i);
    }
}
