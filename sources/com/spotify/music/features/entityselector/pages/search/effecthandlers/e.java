package com.spotify.music.features.entityselector.pages.search.effecthandlers;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import defpackage.tz4;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class e<T> implements g<tz4.f> {
    final /* synthetic */ tg0 a;
    final /* synthetic */ SnackbarManager b;

    e(tg0 tg0, SnackbarManager snackbarManager) {
        this.a = tg0;
        this.b = snackbarManager;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(tz4.f fVar) {
        View view;
        tz4.f fVar2 = fVar;
        try {
            view = (View) this.a.get();
        } catch (Exception unused) {
            view = null;
        }
        if (view != null) {
            Object systemService = view.getContext().getSystemService("input_method");
            if (systemService != null) {
                ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
                String a2 = fVar2.a();
                if (a2 == null) {
                    a2 = view.getContext().getString(C0707R.string.default_list_name);
                    h.d(a2, "it.context.getString(R.string.default_list_name)");
                }
                String string = view.getContext().getString(C0707R.string.duplicate_track_snackbar_text, a2);
                h.d(string, "it.context.getString(\n  …       name\n            )");
                SnackbarManager snackbarManager = this.b;
                SnackbarConfiguration build = SnackbarConfiguration.builder(string).build();
                h.d(build, "SnackbarConfiguration.bu…(snackbarMessage).build()");
                snackbarManager.showInView(build, view);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }
}
