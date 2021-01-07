package com.spotify.mobile.android.share.menu.preview;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.Optional;
import com.spotify.mobile.android.share.menu.preview.api.f;
import com.spotify.mobile.android.share.menu.preview.domain.SharePreviewMenuModel;
import com.spotify.mobile.android.share.menu.preview.domain.d;
import com.spotify.mobile.android.share.menu.preview.view.SharePreviewMenuViews;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;
import dagger.android.support.DaggerAppCompatDialogFragment;
import io.reactivex.d0;
import io.reactivex.functions.l;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.z;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.h;

public final class SharePreviewMenuFragment extends DaggerAppCompatDialogFragment implements c.a, g6e {
    public static final /* synthetic */ int C0 = 0;
    private final PublishSubject<Boolean> A0;
    private final int B0 = 1;
    public SharePreviewMenuInjector v0;
    public Map<String, com.spotify.mobile.android.share.menu.preview.api.b> w0;
    public Optional<f> x0;
    public int y0;
    private MobiusLoop.g<SharePreviewMenuModel, d> z0;

    static final class a<V> implements Callable<Boolean> {
        final /* synthetic */ SharePreviewMenuFragment a;
        final /* synthetic */ String b;

        a(SharePreviewMenuFragment sharePreviewMenuFragment, String str) {
            this.a = sharePreviewMenuFragment;
            this.b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public Boolean call() {
            SharePreviewMenuFragment sharePreviewMenuFragment = this.a;
            String str = this.b;
            int i = SharePreviewMenuFragment.C0;
            Context F2 = sharePreviewMenuFragment.F2();
            boolean z = false;
            if (F2 != null && e2.d(F2, str) == 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T, R> implements l<Boolean, d0<? extends Boolean>> {
        final /* synthetic */ SharePreviewMenuFragment a;
        final /* synthetic */ String b;

        b(SharePreviewMenuFragment sharePreviewMenuFragment, String str) {
            this.a = sharePreviewMenuFragment;
            this.b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends Boolean> apply(Boolean bool) {
            Boolean bool2 = bool;
            h.e(bool2, "granted");
            if (bool2.booleanValue()) {
                return z.z(Boolean.TRUE);
            }
            return this.a.A0.T().o(new d(this)).m(e.a);
        }
    }

    public SharePreviewMenuFragment() {
        PublishSubject<Boolean> h1 = PublishSubject.h1();
        h.d(h1, "PublishSubject.create()");
        this.A0 = h1;
        V4(2, C0707R.style.res_2132083511_theme_glue_noactionbar_previewsharemenu);
    }

    public static final void b5(SharePreviewMenuFragment sharePreviewMenuFragment, String str) {
        sharePreviewMenuFragment.getClass();
        sharePreviewMenuFragment.i4(new String[]{str}, sharePreviewMenuFragment.B0);
    }

    @Override // androidx.fragment.app.Fragment
    public void L3(int i, String[] strArr, int[] iArr) {
        h.e(strArr, "permissions");
        h.e(iArr, "grantResults");
        boolean z = true;
        if (i == 1) {
            PublishSubject<Boolean> publishSubject = this.A0;
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                z = false;
            }
            publishSubject.onNext(Boolean.valueOf(z));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        MobiusLoop.g<SharePreviewMenuModel, d> gVar = this.z0;
        if (gVar != null) {
            gVar.start();
        } else {
            h.k("controller");
            throw null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        MobiusLoop.g<SharePreviewMenuModel, d> gVar = this.z0;
        if (gVar != null) {
            gVar.stop();
        } else {
            h.k("controller");
            throw null;
        }
    }

    @Override // defpackage.g6e
    public z<Boolean> e2(String str) {
        h.e(str, "permissionToGrant");
        z<Boolean> s = z.y(new a(this, str)).s(new b(this, str));
        h.d(s, "Single.fromCallable {\n  …}\n            }\n        }");
        return s;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        c a2 = c.a("spotify:share:preview-menu");
        h.d(a2, "ViewUri.create(SHARE_PREVIEW_MENU_URI)");
        return a2;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        h.e(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        Optional<f> optional = this.x0;
        if (optional != null) {
            f orNull = optional.orNull();
            if (orNull != null) {
                orNull.a();
                return;
            }
            return;
        }
        h.k("onDismissListener");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        Map<String, com.spotify.mobile.android.share.menu.preview.api.b> map = this.w0;
        if (map != null) {
            SharePreviewMenuViews sharePreviewMenuViews = new SharePreviewMenuViews(layoutInflater, viewGroup, map);
            SharePreviewMenuInjector sharePreviewMenuInjector = this.v0;
            if (sharePreviewMenuInjector != null) {
                MobiusLoop.g<SharePreviewMenuModel, d> b2 = sharePreviewMenuInjector.b(new SharePreviewMenuModel(this.y0));
                h.d(b2, "injector.createControlle…wMenuModel(payloadCount))");
                this.z0 = b2;
                if (b2 != null) {
                    b2.c(sharePreviewMenuViews);
                    return sharePreviewMenuViews.j();
                }
                h.k("controller");
                throw null;
            }
            h.k("injector");
            throw null;
        }
        h.k("shareDestinationViewDataMap");
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
        MobiusLoop.g<SharePreviewMenuModel, d> gVar = this.z0;
        if (gVar != null) {
            gVar.d();
        } else {
            h.k("controller");
            throw null;
        }
    }
}
