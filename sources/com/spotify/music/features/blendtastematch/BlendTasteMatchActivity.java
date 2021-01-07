package com.spotify.music.features.blendtastematch;

import android.os.Bundle;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.features.blendtastematch.api.d;
import com.spotify.music.features.blendtastematch.view.g;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.t0;
import kotlin.jvm.internal.h;

public final class BlendTasteMatchActivity extends ss2 implements c.a, g {
    public t0<d> G;
    public PageLoaderView.a<d> H;
    private PageLoaderView<d> I;

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        c a = c.a("spotify:blend:taste-match");
        h.d(a, "ViewUri.create(\"spotify:blend:taste-match\")");
        return a;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PageLoaderView.a<d> aVar = this.H;
        if (aVar != null) {
            PageLoaderView<d> a = aVar.a(this);
            h.d(a, "pageLoaderViewBuilder.createView(this)");
            this.I = a;
            if (a != null) {
                setContentView(a);
            } else {
                h.k("pageLoaderView");
                throw null;
            }
        } else {
            h.k("pageLoaderViewBuilder");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStart() {
        super.onStart();
        PageLoaderView<d> pageLoaderView = this.I;
        if (pageLoaderView != null) {
            t0<d> t0Var = this.G;
            if (t0Var != null) {
                pageLoaderView.j0(this, t0Var);
                t0<d> t0Var2 = this.G;
                if (t0Var2 != null) {
                    t0Var2.start();
                } else {
                    h.k("pageLoader");
                    throw null;
                }
            } else {
                h.k("pageLoader");
                throw null;
            }
        } else {
            h.k("pageLoaderView");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStop() {
        super.onStop();
        t0<d> t0Var = this.G;
        if (t0Var != null) {
            t0Var.stop();
        } else {
            h.k("pageLoader");
            throw null;
        }
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        ij9 b = ij9.b(PageIdentifiers.BLEND_TASTE_MATCH, null);
        h.d(b, "PageViewObservable.creat…ifiers.BLEND_TASTE_MATCH)");
        return b;
    }

    @Override // com.spotify.music.features.blendtastematch.view.g
    public void z() {
        finish();
    }
}
