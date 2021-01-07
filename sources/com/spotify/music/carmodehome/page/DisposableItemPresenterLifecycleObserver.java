package com.spotify.music.carmodehome.page;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import kotlin.jvm.internal.h;

public final class DisposableItemPresenterLifecycleObserver implements m {
    private a a;
    private final n b;

    public interface a {
        void a();

        void b();
    }

    public static final class b implements View.OnAttachStateChangeListener {
        final /* synthetic */ DisposableItemPresenterLifecycleObserver a;
        final /* synthetic */ a b;

        b(DisposableItemPresenterLifecycleObserver disposableItemPresenterLifecycleObserver, a aVar) {
            this.a = disposableItemPresenterLifecycleObserver;
            this.b = aVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.a.b.A().a(this.a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.a.b.A().c(this.a);
            Lifecycle A = this.a.b.A();
            h.d(A, "lifecycleOwner.lifecycle");
            if (A.b().compareTo(Lifecycle.State.RESUMED) >= 0) {
                this.b.a();
            }
        }
    }

    public DisposableItemPresenterLifecycleObserver(n nVar) {
        h.e(nVar, "lifecycleOwner");
        this.b = nVar;
    }

    public final void b(View view, a aVar) {
        h.e(view, "itemView");
        h.e(aVar, "listener");
        this.a = aVar;
        view.addOnAttachStateChangeListener(new b(this, aVar));
    }

    @w(Lifecycle.Event.ON_RESUME)
    public final void onViewStart() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.b();
        }
    }

    @w(Lifecycle.Event.ON_PAUSE)
    public final void onViewStop() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
    }
}
