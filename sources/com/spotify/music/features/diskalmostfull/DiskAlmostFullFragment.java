package com.spotify.music.features.diskalmostfull;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment;
import com.spotify.mobile.android.util.r;

public class DiskAlmostFullFragment extends PresentableDialogFragment {
    private Intent j0;
    private boolean k0;
    private boolean l0;
    wlf<r> m0;
    e6 n0;
    private r o0;
    private final BroadcastReceiver p0 = new a();

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!DiskAlmostFullFragment.this.k0 && context != null) {
                DiskAlmostFullFragment.this.l0 = true;
                if (!"check_storage.diskspace.ok".equals(intent.getAction())) {
                    DiskAlmostFullFragment.this.j0 = new Intent(context, DiskAlmostFullActivity.class);
                    if (((PresentableDialogFragment) DiskAlmostFullFragment.this).h0 != null) {
                        ((PresentableDialogFragment) DiskAlmostFullFragment.this).h0.M4(DiskAlmostFullFragment.this);
                        DiskAlmostFullFragment.this.k0 = true;
                    }
                }
            }
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        this.n0.e(this.p0);
        r rVar = this.o0;
        if (rVar != null) {
            rVar.cancel(false);
        }
        super.H3();
    }

    @Override // com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment
    public void L4() {
        super.L4();
        Intent intent = this.j0;
        if (intent != null) {
            H4(intent, this.i0, null);
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("check_storage.settings_low.error");
        intentFilter.addAction("check_storage.cache_low.error");
        intentFilter.addAction("check_storage.diskspace.ok");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        this.n0.c(this.p0, intentFilter);
        if (!this.l0) {
            r rVar = this.m0.get();
            this.o0 = rVar;
            rVar.execute(new Void[0]);
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment, com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        super.N3(bundle);
        bundle.putBoolean("queued", this.k0);
        bundle.putBoolean("checked", this.l0);
    }

    @Override // com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment, com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void n3(int i, int i2, Intent intent) {
        super.n3(i, i2, intent);
        this.k0 = false;
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
            this.k0 = bundle.getBoolean("queued", false);
            this.l0 = bundle.getBoolean("checked", false);
        }
    }
}
