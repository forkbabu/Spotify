package com.spotify.music.libs.common.presenter;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.common.base.MoreObjects;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.contentviewstate.ContentViewManager;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.libs.performance.tracking.h0;
import com.spotify.music.libs.viewuri.c;

@Deprecated
public abstract class BaseViewBinderFragment<T extends Parcelable> extends LifecycleListenableFragment implements e<T>, c.a, s {
    private ViewLoadingTracker h0;
    private ContentViewManager i0;
    private f<T> j0;

    public static final class a {
        public h0 a;
    }

    @Override // com.spotify.music.libs.common.presenter.e
    public void K0() {
        this.i0.h(true);
    }

    /* access modifiers changed from: protected */
    public abstract f<T> K4();

    /* access modifiers changed from: protected */
    public abstract View L4(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    public abstract View M4();

    @Override // com.spotify.music.libs.common.presenter.e
    public void N(T t) {
        this.i0.e(null);
        S4(t);
        ViewLoadingTracker viewLoadingTracker = this.h0;
        if (viewLoadingTracker != null) {
            viewLoadingTracker.g();
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        super.N3(bundle);
        ViewLoadingTracker viewLoadingTracker = this.h0;
        if (viewLoadingTracker != null) {
            viewLoadingTracker.t(bundle);
        }
        f<T> fVar = this.j0;
        if (fVar != null) {
            fVar.g(bundle);
        }
    }

    public T N4() {
        f<T> fVar = this.j0;
        if (fVar == null) {
            return null;
        }
        return fVar.h;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.j0.i(this);
    }

    /* access modifiers changed from: protected */
    public T O4() {
        return null;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.j0.j();
    }

    /* access modifiers changed from: protected */
    public abstract gb0 P4();

    public abstract a Q4();

    /* access modifiers changed from: protected */
    public abstract LoadingView R4();

    /* access modifiers changed from: protected */
    public abstract void S4(T t);

    /* access modifiers changed from: protected */
    public void T4() {
    }

    @Override // com.spotify.music.libs.common.presenter.e
    public void W0(SessionState sessionState) {
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.music.libs.common.presenter.e
    public void f1(Throwable th) {
        this.i0.i(true);
        T4();
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return getViewUri().toString();
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // com.spotify.music.libs.common.presenter.e
    public void s1() {
        this.i0.e(null);
        ContentViewManager contentViewManager = this.i0;
        LoadingView R4 = R4();
        R4.getClass();
        contentViewManager.g(R4);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.j0 == null) {
            f<T> K4 = K4();
            K4.getClass();
            this.j0 = K4;
        }
        this.j0.f(bundle, O4());
        View L4 = L4(layoutInflater, viewGroup);
        L4.getClass();
        this.h0 = Q4().a.b(L4, getViewUri().toString(), bundle, u0());
        androidx.fragment.app.c B2 = B2();
        gb0 P4 = P4();
        P4.getClass();
        View M4 = M4();
        M4.getClass();
        ContentViewManager.b bVar = new ContentViewManager.b(B2, P4, M4);
        bVar.b(C0707R.string.error_no_connection_title, C0707R.string.error_no_connection_body);
        bVar.c(C0707R.string.error_general_title, C0707R.string.error_general_body);
        ContentViewManager f = bVar.f();
        this.i0 = f;
        MoreObjects.checkState(f.c(ContentViewManager.ContentState.SERVICE_ERROR) && this.i0.c(ContentViewManager.ContentState.NO_NETWORK));
        return L4;
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
        this.h0.f();
    }
}
