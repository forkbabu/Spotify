package com.spotify.music.features.connect.dialogs.newdevice;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.c;
import com.google.common.base.Joiner;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.android.ResolverCallbackReceiver;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment;
import com.spotify.mobile.android.util.DialogPresenter;
import com.spotify.music.features.ads.model.Ad;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;

public class NewDeviceFragment extends PresentableDialogFragment {
    public static final /* synthetic */ int s0 = 0;
    private boolean j0;
    private s<a> k0;
    private Intent l0;
    private b m0 = EmptyDisposable.INSTANCE;
    zr0 n0;
    ConnectManager o0;
    FireAndForgetResolver p0;
    gs0 q0;
    s<Intent> r0;

    /* access modifiers changed from: private */
    public static class a {
        private final GaiaDevice a;

        a(GaiaDevice gaiaDevice) {
            this.a = gaiaDevice;
        }

        public GaiaDevice a() {
            return this.a;
        }
    }

    public static void M4(NewDeviceFragment newDeviceFragment, a aVar) {
        newDeviceFragment.getClass();
        GaiaDevice a2 = aVar.a();
        Logger.g("Spotify Connect: Onboarding request triggered", new Object[0]);
        c B2 = newDeviceFragment.B2();
        if (B2 != null) {
            int i = NewDeviceActivity.S;
            a2.getClass();
            Intent intent = new Intent(B2, NewDeviceActivity.class);
            intent.putExtra("device", a2);
            newDeviceFragment.l0 = intent;
            DialogPresenter dialogPresenter = newDeviceFragment.h0;
            if (dialogPresenter != null && !newDeviceFragment.j0) {
                newDeviceFragment.j0 = true;
                dialogPresenter.M4(newDeviceFragment);
            }
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment
    public void L4() {
        super.L4();
        Intent intent = this.l0;
        if (intent != null) {
            H4(intent, this.i0, null);
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
        this.m0 = this.k0.subscribe(new c(this));
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.m0.dispose();
    }

    @Override // com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment, com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void n3(int i, int i2, Intent intent) {
        if (intent != null && (i2 == 0 || i2 == -1)) {
            Parcelable parcelableExtra = intent.getParcelableExtra("device");
            parcelableExtra.getClass();
            GaiaDevice gaiaDevice = (GaiaDevice) parcelableExtra;
            boolean z = i2 == -1;
            String cosmosIdentifier = gaiaDevice.getCosmosIdentifier();
            String str = z ? "1" : Ad.DEFAULT_SKIPPABLE_AD_DELAY;
            this.p0.detached(this.q0.b(Joiner.on("\n").join(cosmosIdentifier, str, new Object[0])), ResolverCallbackReceiver.forAny(null, new d(str), a.a));
            if (z) {
                String cosmosIdentifier2 = gaiaDevice.getCosmosIdentifier();
                if (this.o0 != null) {
                    Logger.b("Transfer playback to onboarding device:%s", cosmosIdentifier2);
                    this.n0.c(cosmosIdentifier2);
                }
            }
        }
        super.n3(i, i2, intent);
        this.j0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
        if (this.r0 == null) {
            Context F2 = F2();
            IntentFilter intentFilter = new IntentFilter("com.spotify.mobile.android.service.broadcast.connect.CONNECT_ONBOARDING");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            this.r0 = u0e.a(F2, intentFilter);
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment, com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        if (bundle != null) {
            this.j0 = bundle.getBoolean("dialog_queued", false);
        }
        this.k0 = this.r0.j0(b.a);
    }
}
