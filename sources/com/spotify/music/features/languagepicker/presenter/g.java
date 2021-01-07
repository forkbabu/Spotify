package com.spotify.music.features.languagepicker.presenter;

import android.os.Bundle;
import com.google.common.base.MoreObjects;
import com.spotify.music.C0707R;
import com.spotify.music.features.languagepicker.logger.b;
import com.spotify.music.features.languagepicker.model.e;
import com.spotify.music.features.languagepicker.presenter.ListSubscriber;
import defpackage.dm5;
import io.reactivex.a;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class g implements dm5.a, ListSubscriber.a<com.spotify.music.features.languagepicker.model.g>, ListSubscriber.b {
    private final ListSubscriber<jm5, com.spotify.music.features.languagepicker.model.g> a;
    private final e b;
    private final b c;
    private io.reactivex.disposables.b d = EmptyDisposable.INSTANCE;
    private com.spotify.music.features.languagepicker.view.g e;

    public g(ListSubscriber<jm5, com.spotify.music.features.languagepicker.model.g> listSubscriber, e eVar, b bVar) {
        this.a = listSubscriber;
        eVar.getClass();
        this.b = eVar;
        this.c = bVar;
    }

    private void j(int i, boolean z) {
        com.spotify.music.features.languagepicker.view.g gVar = this.e;
        gVar.getClass();
        gVar.P(i, z);
        this.e.p1(false);
        this.e.U(false);
        if (z) {
            this.c.n();
        }
    }

    public void a(Bundle bundle) {
        this.a.f(bundle);
    }

    @Override // com.spotify.music.features.languagepicker.presenter.ListSubscriber.b
    public void b(ListSubscriber.SubscriptionState subscriptionState) {
        int ordinal = subscriptionState.ordinal();
        if (ordinal == 0) {
            com.spotify.music.features.languagepicker.view.g gVar = this.e;
            gVar.getClass();
            gVar.h();
            this.e.p1(false);
            this.e.U(true);
            this.c.j();
        } else if (ordinal == 1) {
            com.spotify.music.features.languagepicker.view.g gVar2 = this.e;
            gVar2.getClass();
            gVar2.h();
            this.e.p1(true);
            this.e.U(false);
            this.c.i();
        } else if (ordinal == 2) {
            j(C0707R.string.error_view_something_went_wrong, true);
            this.c.e();
        } else if (ordinal == 3) {
            j(C0707R.string.error_view_no_internet_connection, false);
            this.c.m();
        } else {
            throw new AssertionError("unuspported state");
        }
    }

    @Override // defpackage.dm5.a
    public boolean c(int i) {
        if (this.a.b(i).f()) {
            int i2 = 0;
            for (com.spotify.music.features.languagepicker.model.g gVar : this.a.c()) {
                if (gVar.f()) {
                    i2++;
                }
            }
            if (i2 == 1) {
                com.spotify.music.features.languagepicker.view.g gVar2 = this.e;
                gVar2.getClass();
                gVar2.d2();
                return false;
            }
        }
        com.spotify.music.features.languagepicker.model.g b2 = this.a.b(i);
        com.spotify.music.features.languagepicker.model.g b3 = b2.b(!b2.f());
        this.a.h(i, b3);
        this.c.g(b3, i);
        return true;
    }

    @Override // com.spotify.music.features.languagepicker.presenter.ListSubscriber.a
    public void d(List<com.spotify.music.features.languagepicker.model.g> list) {
    }

    @Override // com.spotify.music.features.languagepicker.presenter.ListSubscriber.a
    public void e(int i) {
    }

    public void f() {
        this.a.g();
        this.c.o();
    }

    public void g(Bundle bundle) {
        ListSubscriber<jm5, com.spotify.music.features.languagepicker.model.g> listSubscriber = this.a;
        listSubscriber.getClass();
        bundle.putParcelableArrayList("items", new ArrayList<>(listSubscriber.c()));
    }

    public void h(com.spotify.music.features.languagepicker.view.g gVar) {
        MoreObjects.checkState(this.e == null);
        this.e = gVar;
        this.a.k(this.b.a().j0(b.a), this, this);
    }

    public void i() {
        this.d.dispose();
        this.c.l();
        this.d = this.b.b(this.a.c()).I(5000, TimeUnit.MILLISECONDS, a.t(new TimeoutException())).subscribe();
        this.a.l();
        this.e = null;
    }
}
