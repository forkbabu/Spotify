package com.spotify.music.imagepicker;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.n;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.imagepicker.b;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.s0;
import com.spotify.pageloader.t0;
import kotlin.jvm.internal.h;

public final class ImagePickerActivity extends ss2 implements c.a, mfd, a, b.a {
    public n G;
    public t0<String> H;
    public zac I;
    public iu9 J;
    public hu9 K;
    public b L;

    static final class a<I, O> implements sg0<String, s0> {
        final /* synthetic */ ImagePickerActivity a;

        a(ImagePickerActivity imagePickerActivity) {
            this.a = imagePickerActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.sg0
        public s0 apply(String str) {
            iu9 iu9 = this.a.J;
            if (iu9 != null) {
                return iu9;
            }
            h.k("mImagePickerPageElement");
            throw null;
        }
    }

    @Override // defpackage.mfd
    public com.spotify.instrumentation.a g1() {
        return PageIdentifiers.IMAGE_PICKER;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        c cVar = ViewUris.I2;
        h.d(cVar, "ViewUris.IMAGE_PICKER");
        return cVar;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        iu9 iu9 = this.J;
        if (iu9 != null) {
            iu9.a(i, i2, intent);
        } else {
            h.k("mImagePickerPageElement");
            throw null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        hu9 hu9 = this.K;
        if (hu9 != null) {
            hu9.a();
            super.onBackPressed();
            return;
        }
        h.k("logger");
        throw null;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b bVar = new b(getIntent().getBooleanExtra("using-camera", false), getIntent().getBooleanExtra("show-circle-overlay", false));
        h.e(bVar, "<set-?>");
        this.L = bVar;
        zac zac = this.I;
        if (zac != null) {
            PageLoaderView.a b = zac.b(getViewUri(), u0());
            b.e(new a(this));
            PageLoaderView a2 = b.a(this);
            n nVar = this.G;
            if (nVar != null) {
                t0<String> t0Var = this.H;
                if (t0Var != null) {
                    a2.j0(nVar, t0Var);
                    setContentView(a2);
                    return;
                }
                h.k("mPageLoader");
                throw null;
            }
            h.k("mLifecycleOwner");
            throw null;
        }
        h.k("mPageLoaderFactory");
        throw null;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        h.e(bundle, "savedInstanceState");
        super.onRestoreInstanceState(bundle);
        iu9 iu9 = this.J;
        if (iu9 != null) {
            iu9.b(bundle);
        } else {
            h.k("mImagePickerPageElement");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        h.e(bundle, "outState");
        super.onSaveInstanceState(bundle);
        iu9 iu9 = this.J;
        if (iu9 != null) {
            iu9.c(bundle);
        } else {
            h.k("mImagePickerPageElement");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStart() {
        super.onStart();
        t0<String> t0Var = this.H;
        if (t0Var != null) {
            t0Var.start();
        } else {
            h.k("mPageLoader");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStop() {
        super.onStop();
        t0<String> t0Var = this.H;
        if (t0Var != null) {
            t0Var.stop();
        } else {
            h.k("mPageLoader");
            throw null;
        }
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        ij9 b = ij9.b(PageIdentifiers.IMAGE_PICKER, null);
        h.d(b, "PageViewObservable.create(pageIdentifier)");
        return b;
    }

    @Override // com.spotify.music.imagepicker.b.a
    public b v() {
        b bVar = this.L;
        if (bVar != null) {
            return bVar;
        }
        h.k("imagePickerConfiguration");
        throw null;
    }
}
