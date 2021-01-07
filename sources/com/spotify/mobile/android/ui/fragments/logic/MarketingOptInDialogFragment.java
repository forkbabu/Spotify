package com.spotify.mobile.android.ui.fragments.logic;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.ui.activity.MarketingOptInActivity;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.DialogPresenter;
import com.spotify.mobile.android.util.prefs.i;
import com.spotify.music.C0707R;
import defpackage.c6;

public class MarketingOptInDialogFragment extends PresentableDialogFragment {
    private boolean j0;
    private Intent k0;
    i l0;
    private final c6.a<b> m0 = new a();

    class a implements c6.a<b> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.loader.content.b, java.lang.Object] */
        @Override // defpackage.c6.a
        public void a(androidx.loader.content.b<b> bVar, b bVar2) {
            MarketingOptInDialogFragment.M4(MarketingOptInDialogFragment.this, bVar2);
        }

        @Override // defpackage.c6.a
        public androidx.loader.content.b<b> b(int i, Bundle bundle) {
            MarketingOptInDialogFragment marketingOptInDialogFragment = MarketingOptInDialogFragment.this;
            return new c(marketingOptInDialogFragment, marketingOptInDialogFragment.l0);
        }

        @Override // defpackage.c6.a
        public void c(androidx.loader.content.b<b> bVar) {
        }
    }

    /* access modifiers changed from: private */
    public static class b {
        boolean a;
        boolean b;

        private b() {
        }

        b(a aVar) {
        }
    }

    private static class c extends androidx.loader.content.a<b> {
        private final i l;

        public c(MarketingOptInDialogFragment marketingOptInDialogFragment, i iVar) {
            super(marketingOptInDialogFragment.j4());
            this.l = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // androidx.loader.content.a
        public b m() {
            b bVar = new b(null);
            bVar.a = this.l.d(e()).d(i31.b, false);
            bVar.b = this.l.d(e()).d(i31.c, false);
            return bVar;
        }
    }

    static void M4(MarketingOptInDialogFragment marketingOptInDialogFragment, b bVar) {
        marketingOptInDialogFragment.getClass();
        if (bVar.a && !marketingOptInDialogFragment.j0) {
            marketingOptInDialogFragment.j0 = true;
            androidx.fragment.app.c B2 = marketingOptInDialogFragment.B2();
            boolean z = bVar.b;
            int i = MarketingOptInActivity.J;
            Intent intent = new Intent(B2, MarketingOptInActivity.class);
            intent.putExtra("use-new-marketing-opt-in", z);
            marketingOptInDialogFragment.k0 = intent;
            DialogPresenter dialogPresenter = marketingOptInDialogFragment.h0;
            if (dialogPresenter != null) {
                dialogPresenter.M4(marketingOptInDialogFragment);
            }
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment
    public void K4(DialogPresenter dialogPresenter) {
        super.K4(dialogPresenter);
        if (this.j0) {
            this.h0.M4(this);
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment
    public void L4() {
        super.L4();
        if (this.j0) {
            H4(this.k0, this.i0, null);
        } else {
            Assertion.p("Unexpected onShow(). Did not expect to show a dialog when nothing queued");
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment, com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        super.N3(bundle);
        bundle.putBoolean("dialog_queued", this.j0);
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment, com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        if (bundle != null) {
            this.j0 = bundle.getBoolean("dialog_queued", false);
        }
        c6.c(this).d(C0707R.id.loader_marketing_opt_in, null, this.m0).d();
    }
}
