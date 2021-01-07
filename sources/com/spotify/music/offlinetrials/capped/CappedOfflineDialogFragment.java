package com.spotify.music.offlinetrials.capped;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.core.app.b;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment;
import com.spotify.mobile.android.util.DialogPresenter;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.slate.SlateModalActivity;
import com.spotify.music.slate.model.t;

public class CappedOfflineDialogFragment extends PresentableDialogFragment implements mfd, c.a {
    public static final /* synthetic */ int o0 = 0;
    protected kd0 j0;
    protected o k0;
    protected t l0;
    final BroadcastReceiver m0 = new a();
    protected boolean n0;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CappedOfflineDialogFragment.this.j0.b(intent);
            CappedOfflineDialogFragment.M4(CappedOfflineDialogFragment.this, (t) intent.getParcelableExtra("extra_dialog_view_model"));
        }
    }

    static void M4(CappedOfflineDialogFragment cappedOfflineDialogFragment, t tVar) {
        DialogPresenter dialogPresenter;
        if (!cappedOfflineDialogFragment.n0 && (dialogPresenter = cappedOfflineDialogFragment.h0) != null && tVar != null) {
            cappedOfflineDialogFragment.n0 = true;
            cappedOfflineDialogFragment.l0 = tVar;
            dialogPresenter.M4(cappedOfflineDialogFragment);
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        this.j0.d(this.m0);
    }

    @Override // com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment
    public void L4() {
        super.L4();
        Context F2 = F2();
        if (F2 != null) {
            Bundle c = b.a(F2(), 17432576, 17432577).c();
            t tVar = this.l0;
            int i = SlateModalActivity.L;
            Intent intent = new Intent(F2, SlateModalActivity.class);
            intent.putExtra("VIEW_MODEL", tVar);
            H4(intent, this.i0, c);
            this.k0.b();
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.j0.a(this.m0, new IntentFilter("com.spotify.music.internal.intent.view.CAPPED_OFFLINE_DIALOG"));
    }

    @Override // defpackage.mfd
    public com.spotify.instrumentation.a g1() {
        return PageIdentifiers.CAPPED_OFFLINE_DIALOG;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.Z;
    }

    @Override // com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment, com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void n3(int i, int i2, Intent intent) {
        super.n3(i, i2, intent);
        if (i == this.i0) {
            this.k0.a();
            this.n0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }
}
