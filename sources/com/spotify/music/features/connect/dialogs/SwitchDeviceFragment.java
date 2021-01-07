package com.spotify.music.features.connect.dialogs;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.c;
import com.google.common.base.Optional;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment;
import com.spotify.mobile.android.util.DialogPresenter;
import com.spotify.rxjava2.p;
import dagger.android.support.a;
import io.reactivex.y;

public class SwitchDeviceFragment extends PresentableDialogFragment {
    private boolean j0;
    private Intent k0;
    private final p l0 = new p();
    public ConnectManager m0;
    public zr0 n0;
    public y o0;

    @Override // com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment
    public void L4() {
        super.L4();
        Intent intent = this.k0;
        if (intent != null) {
            H4(intent, this.i0, null);
        }
    }

    public void M4(GaiaDevice gaiaDevice) {
        DialogPresenter dialogPresenter = this.h0;
        String cosmosIdentifier = gaiaDevice.getCosmosIdentifier();
        Optional<String> b = this.n0.b();
        dialogPresenter.getClass();
        boolean z = false;
        boolean z2 = b.isPresent() && b.get().contains(cosmosIdentifier);
        gaiaDevice.getCosmosIdentifier().getClass();
        if (!gaiaDevice.isSelf() && !gaiaDevice.isAttached() && !gaiaDevice.isSocialConnect()) {
            z = !z2;
        }
        if (z) {
            c B2 = B2();
            int i = SwitchDeviceActivity.U;
            B2.getClass();
            Intent intent = new Intent(B2, SwitchDeviceActivity.class);
            intent.putExtra("active_device", gaiaDevice);
            this.k0 = intent;
            DialogPresenter dialogPresenter2 = this.h0;
            if (dialogPresenter2 != null && !this.j0) {
                this.j0 = true;
                dialogPresenter2.M4(this);
            }
        }
        if (gaiaDevice.isSocialConnect()) {
            this.n0.a(gaiaDevice.getAttachId());
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment, com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        super.N3(bundle);
        bundle.putBoolean("dialog_queued", this.j0);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.l0.b(this.m0.p(getClass().getSimpleName()).o0(this.o0).subscribe(new a(this)));
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        this.l0.a();
        super.P3();
    }

    @Override // com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment, com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void n3(int i, int i2, Intent intent) {
        super.n3(i, i2, intent);
        this.j0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    @Override // com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment, com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        if (bundle != null) {
            this.j0 = bundle.getBoolean("dialog_queued", false);
        }
    }
}
