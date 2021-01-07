package com.spotify.music.features.radio.common;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.google.common.base.MoreObjects;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.contentviewstate.ContentViewManager;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.t;
import io.reactivex.functions.g;

@Deprecated
public abstract class AbstractContentFragment<D extends Parcelable, V extends View> extends LifecycleListenableFragment implements s, c.a {
    public static final /* synthetic */ int v0 = 0;
    public final d<D> h0 = new e(null);
    private gb0 i0;
    private LoadingView j0;
    private V k0;
    private long l0 = -1;
    private cqe m0 = fqe.a;
    private ContentViewManager n0;
    private final io.reactivex.disposables.a o0 = new io.reactivex.disposables.a();
    protected yn1 p0;
    protected t q0;
    protected e r0;
    private final g<SessionState> s0 = new a(this);
    private D t0;
    private DataRetrievingState u0 = DataRetrievingState.IDLE;

    public enum DataRetrievingState {
        IDLE,
        RETRIEVING,
        SUCCESS,
        FAILURE
    }

    class a implements ContentViewManager.c {
        a() {
        }

        @Override // com.spotify.music.contentviewstate.ContentViewManager.c
        public void a(gb0 gb0, ContentViewManager.ContentState contentState) {
            AbstractContentFragment.this.V4(gb0, contentState);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {
        final /* synthetic */ SessionState a;

        b(SessionState sessionState) {
            this.a = sessionState;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractContentFragment abstractContentFragment = AbstractContentFragment.this;
            abstractContentFragment.W4(this.a, abstractContentFragment.n0);
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements Runnable {
        final /* synthetic */ SessionState a;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                AbstractContentFragment abstractContentFragment = AbstractContentFragment.this;
                abstractContentFragment.W4(cVar.a, abstractContentFragment.n0);
            }
        }

        c(SessionState sessionState) {
            this.a = sessionState;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractContentFragment.this.e5();
            AbstractContentFragment.this.r0.b(new a(), 20000);
        }
    }

    public interface d<D> {
        void a(D d);

        void b();
    }

    /* access modifiers changed from: private */
    public class e implements d<D> {
        e(a aVar) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.spotify.music.features.radio.common.AbstractContentFragment */
        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.spotify.music.features.radio.common.AbstractContentFragment */
        /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: com.spotify.music.features.radio.common.AbstractContentFragment */
        /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: com.spotify.music.features.radio.common.AbstractContentFragment */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.spotify.music.features.radio.common.AbstractContentFragment.d
        public void a(Object obj) {
            Parcelable parcelable = (Parcelable) obj;
            AbstractContentFragment.this.a5(parcelable);
            AbstractContentFragment.this.u0 = DataRetrievingState.SUCCESS;
            if (AbstractContentFragment.this.k3()) {
                if (AbstractContentFragment.this.S4(parcelable)) {
                    AbstractContentFragment.this.n0.e(ContentViewManager.ContentState.EMPTY_CONTENT);
                    return;
                }
                parcelable.getClass();
                AbstractContentFragment.this.n0.e(null);
                if (AbstractContentFragment.this.R4(parcelable)) {
                    AbstractContentFragment.this.M4().setTag(C0707R.id.content_view_data_tag, parcelable);
                    AbstractContentFragment abstractContentFragment = AbstractContentFragment.this;
                    abstractContentFragment.U4(parcelable, abstractContentFragment.M4());
                }
            }
        }

        @Override // com.spotify.music.features.radio.common.AbstractContentFragment.d
        public final void b() {
            AbstractContentFragment.this.u0 = DataRetrievingState.FAILURE;
            AbstractContentFragment.this.n0.i(true);
        }
    }

    protected AbstractContentFragment() {
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        this.r0.a();
        this.o0.f();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.o0.b(this.p0.a().subscribe(this.s0, b.a));
    }

    public V M4() {
        return this.k0;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        super.N3(bundle);
        if (d5()) {
            bundle.putParcelable("AbstractContentFragment.KEY_INSTANCE_STATE_PARCELABLE_DATA", this.t0);
            DataRetrievingState dataRetrievingState = this.u0;
            if (dataRetrievingState == DataRetrievingState.RETRIEVING) {
                dataRetrievingState = DataRetrievingState.IDLE;
            }
            bundle.putSerializable("AbstractContentFragment.KEY_INSTANCE_STATE_DATA_RETRIEVING_STATE", dataRetrievingState);
        }
        bundle.putLong("AbstractContentFragment.KEY_INSTANCE_STATE_NO_NETWORK_START", this.l0);
    }

    /* access modifiers changed from: protected */
    public ContentViewManager N4() {
        return this.n0;
    }

    public D O4() {
        return this.t0;
    }

    public gb0 P4() {
        return this.i0;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        super.Q3(view, bundle);
        this.k0.getClass();
        ContentViewManager.b bVar = new ContentViewManager.b(j4(), this.i0, this.k0);
        bVar.g(new a());
        b5(bVar);
        ContentViewManager f = bVar.f();
        this.n0 = f;
        MoreObjects.checkState(f.c(ContentViewManager.ContentState.EMPTY_CONTENT) && this.n0.c(ContentViewManager.ContentState.SERVICE_ERROR) && this.n0.c(ContentViewManager.ContentState.NO_NETWORK), "In setupContentViewManager(), EMPTY_CONTENT, SERVICE_ERROR, NO_NETWORK states' text should be defined. Otherwise, the app could be crashed.");
    }

    /* access modifiers changed from: protected */
    public abstract V Q4(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    /* access modifiers changed from: protected */
    public boolean R4(D d2) {
        return this.k0.getTag(C0707R.id.content_view_data_tag) == null || this.k0.getTag(C0707R.id.content_view_data_tag) != d2;
    }

    /* access modifiers changed from: protected */
    public boolean S4(D d2) {
        return d2 == null;
    }

    /* access modifiers changed from: protected */
    public boolean T4(SessionState sessionState) {
        return sessionState.connected() || this.u0 == DataRetrievingState.SUCCESS;
    }

    /* access modifiers changed from: protected */
    public abstract void U4(D d2, V v);

    /* access modifiers changed from: protected */
    public void V4(gb0 gb0, ContentViewManager.ContentState contentState) {
    }

    /* access modifiers changed from: protected */
    public void W4(SessionState sessionState, ContentViewManager contentViewManager) {
        contentViewManager.h(!sessionState.connected());
    }

    /* access modifiers changed from: protected */
    public void X4(SessionState sessionState) {
        long j;
        if (sessionState.canConnect()) {
            if (this.l0 == -1) {
                j = 0;
            } else {
                j = Math.max(0L, this.m0.d() - this.l0);
            }
            long max = Math.max(0L, 800 - j);
            long max2 = Math.max(0L, 20800 - j);
            if (max2 == 0) {
                W4(sessionState, this.n0);
            } else if (max == 0) {
                e5();
                if (!this.r0.c(new b(sessionState), max2)) {
                    W4(sessionState, this.n0);
                }
            } else if (!this.r0.c(new c(sessionState), max)) {
                W4(sessionState, this.n0);
            }
            if (this.l0 == -1) {
                this.l0 = this.m0.d();
                return;
            }
            return;
        }
        W4(sessionState, this.n0);
    }

    /* access modifiers changed from: protected */
    public void Y4(SessionState sessionState) {
        DataRetrievingState dataRetrievingState = DataRetrievingState.RETRIEVING;
        this.r0.a();
        if (!S4(this.t0)) {
            ((e) this.h0).a(this.t0);
        } else if (c5()) {
            this.u0 = dataRetrievingState;
            e5();
            Z4(this.h0);
        } else if (this.u0 != dataRetrievingState) {
            this.n0.e(ContentViewManager.ContentState.EMPTY_CONTENT);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void Z4(d<D> dVar);

    /* access modifiers changed from: protected */
    public final void a5(D d2) {
        this.t0 = d2;
    }

    /* access modifiers changed from: protected */
    public abstract void b5(ContentViewManager.b bVar);

    /* access modifiers changed from: protected */
    public boolean c5() {
        DataRetrievingState dataRetrievingState = this.u0;
        return (dataRetrievingState == DataRetrievingState.SUCCESS || dataRetrievingState == DataRetrievingState.RETRIEVING) ? false : true;
    }

    /* access modifiers changed from: protected */
    public boolean d5() {
        return true;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    /* access modifiers changed from: protected */
    public void e5() {
        LoadingView loadingView = this.j0;
        if (loadingView == null) {
            loadingView = LoadingView.l(LayoutInflater.from(B2()));
            this.j0 = loadingView;
            ViewGroup viewGroup = (ViewGroup) a3();
            if (viewGroup != null) {
                viewGroup.addView(loadingView);
            }
        }
        if (!loadingView.p()) {
            this.n0.g(loadingView);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        if (bundle != null) {
            bundle.setClassLoader(l4().getClassLoader());
            this.t0 = (D) bundle.getParcelable("AbstractContentFragment.KEY_INSTANCE_STATE_PARCELABLE_DATA");
            this.u0 = (DataRetrievingState) bundle.getSerializable("AbstractContentFragment.KEY_INSTANCE_STATE_DATA_RETRIEVING_STATE");
            this.l0 = bundle.getLong("AbstractContentFragment.KEY_INSTANCE_STATE_NO_NETWORK_START");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C0707R.layout.fragment_content_base, viewGroup, false);
        jb0 c2 = e90.c();
        j4();
        this.i0 = c2.b((ViewStub) viewGroup2.findViewById(C0707R.id.content_fragment_empty_view_stub));
        V Q4 = Q4(layoutInflater, viewGroup2, bundle);
        this.k0 = Q4;
        viewGroup2.addView(Q4);
        return viewGroup2;
    }
}
