package com.spotify.music.features.languagepicker.presenter;

import android.os.Bundle;
import com.google.common.base.MoreObjects;
import com.spotify.encore.mobile.snackbar.SnackbarUtilsKt;
import com.spotify.mobile.android.ui.activity.c;
import com.spotify.music.C0707R;
import com.spotify.music.features.languagepicker.logger.b;
import com.spotify.music.features.languagepicker.model.e;
import com.spotify.music.features.languagepicker.model.g;
import com.spotify.music.features.languagepicker.presenter.ListSubscriber;
import com.spotify.music.features.languagepicker.presenter.i;
import com.spotify.music.features.languagepicker.view.j;
import com.spotify.music.navigation.t;
import defpackage.dm5;
import io.reactivex.disposables.d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class f implements dm5.a, ListSubscriber.a<g>, ListSubscriber.b, i.a {
    private final t a;
    private final ListSubscriber<hm5, g> b;
    private final c c;
    private final e d;
    private final b e;
    i f;
    private final d g = new d();
    private j h;

    class a implements io.reactivex.c {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // io.reactivex.c
        public void onComplete() {
            f.this.g(this.a);
        }

        @Override // io.reactivex.c
        public void onError(Throwable th) {
            f.this.g(this.a);
        }

        @Override // io.reactivex.c
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            f.this.g.b(bVar);
        }
    }

    public f(t tVar, ListSubscriber<hm5, g> listSubscriber, c cVar, e eVar, b bVar) {
        tVar.getClass();
        this.a = tVar;
        this.b = listSubscriber;
        this.c = cVar;
        eVar.getClass();
        this.d = eVar;
        this.e = bVar;
        this.f = new i.b(this, SnackbarUtilsKt.SNACKBAR_ACTION_DURATION);
    }

    private void q(boolean z) {
        j jVar = this.h;
        jVar.getClass();
        boolean F0 = jVar.F0(z);
        if (z && F0) {
            this.e.k();
        }
    }

    private void r(int i, boolean z) {
        j jVar = this.h;
        jVar.getClass();
        jVar.P(i, z);
        this.h.p1(false);
        this.h.U(false);
        if (z) {
            this.e.n();
        }
    }

    @Override // com.spotify.music.features.languagepicker.presenter.i.a
    public void a(ListSubscriber.SubscriptionState subscriptionState) {
        int ordinal = subscriptionState.ordinal();
        boolean z = false;
        if (ordinal == 0) {
            j jVar = this.h;
            jVar.getClass();
            jVar.h();
            this.h.p1(false);
            this.h.U(true);
            q(false);
            this.e.j();
        } else if (ordinal == 1) {
            j jVar2 = this.h;
            jVar2.getClass();
            jVar2.h();
            this.h.p1(true);
            this.h.U(false);
            if (h() > 0) {
                z = true;
            }
            q(z);
            this.e.i();
        } else if (ordinal == 2) {
            r(C0707R.string.error_view_something_went_wrong, true);
            q(false);
            this.e.e();
        } else if (ordinal == 3) {
            r(C0707R.string.error_view_no_internet_connection, false);
            q(false);
            this.e.m();
        } else {
            throw new AssertionError("unuspported state");
        }
    }

    @Override // com.spotify.music.features.languagepicker.presenter.ListSubscriber.b
    public void b(ListSubscriber.SubscriptionState subscriptionState) {
        subscriptionState.getClass();
        this.f.e(subscriptionState, subscriptionState == ListSubscriber.SubscriptionState.NO_CONNECTION);
    }

    @Override // defpackage.dm5.a
    public boolean c(int i) {
        g b2 = this.b.b(i);
        g b3 = b2.b(!b2.f());
        this.b.h(i, b3);
        this.e.g(b3, i);
        return true;
    }

    @Override // com.spotify.music.features.languagepicker.presenter.ListSubscriber.a
    public void d(List<g> list) {
        q(h() > 0);
    }

    @Override // com.spotify.music.features.languagepicker.presenter.ListSubscriber.a
    public void e(int i) {
        q(h() > 0);
    }

    /* access modifiers changed from: package-private */
    public void g(String str) {
        this.c.a();
        if (str != null) {
            this.a.d(str);
        }
    }

    public int h() {
        int i = 0;
        for (g gVar : this.b.c()) {
            if (gVar.f()) {
                i++;
            }
        }
        return i;
    }

    public boolean i() {
        ListSubscriber.SubscriptionState c2 = this.f.c();
        if (c2 == null) {
            return true;
        }
        int ordinal = c2.ordinal();
        if (ordinal == 0) {
            this.e.c();
            return true;
        } else if (ordinal == 1) {
            this.e.b();
            if (h() <= 0) {
                j jVar = this.h;
                jVar.getClass();
                jVar.d2();
            }
            return true;
        } else if (ordinal == 2) {
            this.e.a();
            return false;
        } else if (ordinal == 3) {
            this.e.d();
            return true;
        } else {
            throw new RuntimeException("Unsupported UiState");
        }
    }

    public void j() {
        this.e.h();
    }

    public void k(String str) {
        this.e.l();
        j jVar = this.h;
        jVar.getClass();
        jVar.p1(false);
        this.h.U(true);
        this.h.h();
        q(false);
        j jVar2 = this.h;
        jVar2.getClass();
        jVar2.b1(C0707R.string.adding_languages_title);
        MoreObjects.checkState(!this.b.c().isEmpty());
        this.d.b(this.b.c()).I(5000, TimeUnit.MILLISECONDS, io.reactivex.a.t(new TimeoutException())).subscribe(new a(str));
    }

    public void l(Bundle bundle) {
        this.b.f(bundle);
    }

    public void m() {
        this.b.g();
        this.e.o();
    }

    public void n(Bundle bundle) {
        ListSubscriber<hm5, g> listSubscriber = this.b;
        listSubscriber.getClass();
        bundle.putParcelableArrayList("items", new ArrayList<>(listSubscriber.c()));
    }

    public void o(j jVar) {
        this.h = jVar;
        this.b.k(this.d.a(), this, this);
    }

    public void p() {
        this.b.l();
    }
}
