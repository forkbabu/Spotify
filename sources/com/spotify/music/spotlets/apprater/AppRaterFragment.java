package com.spotify.music.spotlets.apprater;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.c;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment;
import com.spotify.mobile.android.util.DialogPresenter;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.t;
import com.spotify.player.model.PlayerState;
import dagger.android.support.a;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.flowable.r;
import java.util.concurrent.TimeUnit;

public class AppRaterFragment extends PresentableDialogFragment {
    static final long r0 = TimeUnit.DAYS.toMillis(14);
    static final SpSharedPreferences.b<Object, Boolean> s0 = SpSharedPreferences.b.e("key_rater_shown");
    static final SpSharedPreferences.b<Object, Long> t0 = SpSharedPreferences.b.e("key_date_first_launch");
    static final SpSharedPreferences.b<Object, Integer> u0 = SpSharedPreferences.b.e("key_rater_plays_amount");
    t j0;
    g<PlayerState> k0;
    cqe l0;
    SpSharedPreferences<Object> m0;
    private boolean n0;
    private b o0 = EmptyDisposable.INSTANCE;
    private boolean p0;
    int q0;

    public static void M4(AppRaterFragment appRaterFragment) {
        if (appRaterFragment.j0.b() == null) {
            Logger.g("The app is sideloaded, skipping the AppRater Dialog", new Object[0]);
            return;
        }
        DialogPresenter dialogPresenter = appRaterFragment.h0;
        if (dialogPresenter != null && !appRaterFragment.n0) {
            dialogPresenter.M4(appRaterFragment);
            appRaterFragment.n0 = true;
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment
    public void L4() {
        super.L4();
        SpSharedPreferences<Object> spSharedPreferences = this.m0;
        SpSharedPreferences.b<Object, Boolean> bVar = s0;
        if (!spSharedPreferences.d(bVar, false)) {
            SpSharedPreferences.a<Object> b = this.m0.b();
            b.a(bVar, true);
            b.j();
            c B2 = B2();
            int i = AppRaterActivity.H;
            G4(new Intent(B2, AppRaterActivity.class), null);
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment, com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        super.N3(bundle);
        bundle.putBoolean("extra_queued", this.n0);
        bundle.putInt("extra_plays", this.q0);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        if (this.p0) {
            SpSharedPreferences<Object> spSharedPreferences = this.m0;
            SpSharedPreferences.b<Object, Long> bVar = t0;
            long j = spSharedPreferences.j(bVar, 0);
            if (j == 0) {
                j = this.l0.d();
                SpSharedPreferences.a<Object> b = this.m0.b();
                b.e(bVar, j);
                b.j();
            }
            this.o0 = new r(this.k0.O(h.a).O(e.a).s().A(new g(this)).C(new d(this, j + r0)).h0(1)).subscribe(new f(this), c.a);
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        if (this.p0) {
            if (!this.o0.d()) {
                this.o0.dispose();
            }
            SpSharedPreferences.a<Object> b = this.m0.b();
            b.b(u0, this.q0);
            b.j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    @Override // com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment, com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        if (this.m0.d(s0, false)) {
            this.p0 = false;
            return;
        }
        this.p0 = true;
        if (bundle != null) {
            this.n0 = bundle.getBoolean("extra_queued", false);
            this.q0 = bundle.getInt("extra_plays", 0);
            return;
        }
        this.q0 = this.m0.f(u0, 0);
    }
}
