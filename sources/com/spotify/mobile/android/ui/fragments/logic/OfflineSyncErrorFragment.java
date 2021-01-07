package com.spotify.mobile.android.ui.fragments.logic;

import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import com.spotify.music.offline.OfflineError;
import defpackage.m8c;

public class OfflineSyncErrorFragment extends PresentableDialogFragment {
    m8c j0;
    SnackbarManager k0;
    private final m8c.a l0 = new a();

    /* access modifiers changed from: package-private */
    public class a implements m8c.a {
        a() {
        }

        @Override // defpackage.m8c.a
        public void a(OfflineError offlineError) {
            if (offlineError == OfflineError.OFFLINE_NOT_ALLOWED) {
                SnackbarConfiguration build = SnackbarConfiguration.builder((int) C0707R.string.toast_feature_premium_discovered).actionText(OfflineSyncErrorFragment.this.B2().getString(C0707R.string.premium_signup_title)).onClickListener(new b(this)).build();
                if (OfflineSyncErrorFragment.this.k0.isAttached()) {
                    OfflineSyncErrorFragment.this.k0.show(build);
                } else {
                    OfflineSyncErrorFragment.this.k0.showOnNextAttach(build);
                }
            }
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        this.j0.b(this.l0);
        this.j0.a();
        super.H3();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.j0.d(this.l0);
        this.j0.c();
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }
}
