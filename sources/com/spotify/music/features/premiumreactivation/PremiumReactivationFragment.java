package com.spotify.music.features.premiumreactivation;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.c;
import com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment;
import com.spotify.mobile.android.util.DialogPresenter;
import com.spotify.mobile.android.util.t;
import com.spotify.music.features.checkout.web.PremiumSignupActivity;
import com.spotify.music.features.checkout.web.i;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.rxjava2.q;
import dagger.android.support.a;
import io.reactivex.y;

public class PremiumReactivationFragment extends PresentableDialogFragment {
    public static final /* synthetic */ int q0 = 0;
    p j0;
    y k0;
    m l0;
    t m0;
    private q n0;
    private Intent o0;
    private String p0;

    public static void M4(PremiumReactivationFragment premiumReactivationFragment, q qVar) {
        c j4 = premiumReactivationFragment.j4();
        i.a c = i.c();
        c.f(ViewUris.SubView.CANCEL_STATE_INTERSTITIAL);
        c.g("");
        c.h(Uri.parse(qVar.b()));
        c.d(premiumReactivationFragment.m0);
        premiumReactivationFragment.o0 = PremiumSignupActivity.U0(j4, c.a());
        premiumReactivationFragment.p0 = qVar.a().d();
        DialogPresenter dialogPresenter = premiumReactivationFragment.h0;
        if (dialogPresenter != null) {
            dialogPresenter.M4(premiumReactivationFragment);
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment
    public void K4(DialogPresenter dialogPresenter) {
        super.K4(dialogPresenter);
        if (this.o0 != null) {
            this.h0.M4(this);
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment
    public void L4() {
        super.L4();
        if (this.o0 != null) {
            this.j0.f(this.p0);
            G4(this.o0, null);
            this.o0 = null;
            this.n0.a(this.l0.c("impression"));
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment, com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        bundle.putParcelable("reactivation-activity-intent", this.o0);
        bundle.putString("notification-id", this.p0);
        super.N3(bundle);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        if (this.o0 == null) {
            this.n0.a(this.j0.a().o0(this.k0).subscribe(new a(this), b.a));
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        this.n0.c();
        super.P3();
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    @Override // com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment, com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        this.n0 = new q();
        if (bundle != null) {
            this.o0 = (Intent) bundle.getParcelable("reactivation-activity-intent");
            this.p0 = bundle.getString("notification-id");
        }
    }
}
