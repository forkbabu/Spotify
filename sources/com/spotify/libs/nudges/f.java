package com.spotify.libs.nudges;

import com.google.android.material.snackbar.Snackbar;
import com.spotify.encore.mobile.snackbar.SnackBarListener;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import defpackage.rv0;
import kotlin.jvm.internal.h;

public final class f implements rv0 {
    private rv0.a a = rv0.a.C0679a.a;
    private nmf<? super rv0.a, kotlin.f> b;

    public static final class a implements SnackBarListener {
        final /* synthetic */ f a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(f fVar) {
            this.a = fVar;
        }

        @Override // com.spotify.encore.mobile.snackbar.SnackBarListener
        public void onDismissed(Snackbar snackbar) {
            h.e(snackbar, "snackBar");
            f.c(this.a, rv0.a.C0679a.a);
        }

        @Override // com.spotify.encore.mobile.snackbar.SnackBarListener
        public void onShown(Snackbar snackbar) {
            h.e(snackbar, "snackBar");
            f.c(this.a, rv0.a.b.a);
        }
    }

    public f(SnackbarManager snackbarManager) {
        h.e(snackbarManager, "snackBarManager");
        snackbarManager.addListener(new a(this));
    }

    public static final void c(f fVar, rv0.a aVar) {
        fVar.a = aVar;
        nmf<? super rv0.a, kotlin.f> nmf = fVar.b;
        if (nmf != null) {
            nmf.invoke(aVar);
        }
    }

    @Override // defpackage.rv0
    public void a(nmf<? super rv0.a, kotlin.f> nmf) {
        this.b = nmf;
    }

    @Override // defpackage.rv0
    public rv0.a b() {
        return this.a;
    }
}
