package com.spotify.music.features.churnlockedstate;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.c;
import com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment;
import com.spotify.rxjava2.q;
import dagger.android.support.a;
import io.reactivex.y;

public class ChurnLockedStateDetectorFragment extends PresentableDialogFragment {
    public static final /* synthetic */ int o0 = 0;
    u j0;
    w k0;
    y l0;
    private r m0;
    private q n0;

    @Override // com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment
    public void L4() {
        super.L4();
        if (this.m0 == null) {
            this.k0.a("no-configuration");
            return;
        }
        c B2 = B2();
        r rVar = this.m0;
        int i = ChurnLockedStateActivity.K;
        Intent intent = new Intent(B2, ChurnLockedStateActivity.class);
        intent.putExtra("churn_locked_state_configuration", rVar);
        B2.startActivity(intent);
    }

    public /* synthetic */ void M4(r rVar) {
        this.m0 = rVar;
        this.h0.M4(this);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.n0.a(this.j0.a().o0(this.l0).subscribe(new l(this), k.a));
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
    }
}
