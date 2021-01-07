package com.spotify.music.features.languagepicker.presenter;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.common.recyclerview.d;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.List;

public class ListSubscriber<VH extends e<T>, T extends Parcelable> {
    private static final String j = "ListSubscriber";
    public static final /* synthetic */ int k = 0;
    private final yn1 a;
    private final y b;
    private final d<VH, T> c;
    private io.reactivex.disposables.b d;
    private io.reactivex.disposables.b e;
    private s<List<T>> f;
    private b g;
    private a<T> h;
    private SubscriptionState i;

    public enum SubscriptionState {
        LOADING,
        LOADED,
        ERROR,
        NO_CONNECTION
    }

    public interface a<T> {
        void d(List<T> list);

        void e(int i);
    }

    public interface b {
        void b(SubscriptionState subscriptionState);
    }

    public ListSubscriber(yn1 yn1, y yVar, d<VH, T> dVar) {
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        this.d = emptyDisposable;
        this.e = emptyDisposable;
        this.a = yn1;
        this.b = yVar;
        dVar.getClass();
        this.c = dVar;
    }

    private void a() {
        if (!c().isEmpty()) {
            a<T> aVar = this.h;
            aVar.getClass();
            aVar.d(c());
            j(SubscriptionState.LOADED);
            return;
        }
        j(SubscriptionState.LOADING);
        s<List<T>> sVar = this.f;
        sVar.getClass();
        this.d = sVar.o0(this.b).subscribe(new a(this), new d(this));
    }

    public static void d(ListSubscriber listSubscriber, Throwable th) {
        listSubscriber.j(SubscriptionState.ERROR);
        Logger.e(th, "%s: failed to subscribe", j);
    }

    private void j(SubscriptionState subscriptionState) {
        if (this.i != subscriptionState) {
            this.i = subscriptionState;
            b bVar = this.g;
            bVar.getClass();
            bVar.b(this.i);
        }
    }

    public T b(int i2) {
        return this.c.Z(i2);
    }

    public List<T> c() {
        return this.c.b0();
    }

    public /* synthetic */ void e(SessionState sessionState) {
        if (!sessionState.connected()) {
            j(SubscriptionState.NO_CONNECTION);
        } else {
            a();
        }
    }

    public void f(Bundle bundle) {
        MoreObjects.checkState(this.f == null);
        ArrayList<T> parcelableArrayList = bundle.getParcelableArrayList("items");
        if (parcelableArrayList != null) {
            this.c.f0(new ArrayList(parcelableArrayList));
        }
    }

    public void g() {
        MoreObjects.checkState(this.i == SubscriptionState.ERROR);
        a();
    }

    public void h(int i2, T t) {
        this.c.c0(i2, t);
        a<T> aVar = this.h;
        aVar.getClass();
        aVar.e(i2);
    }

    /* access modifiers changed from: package-private */
    public void i(List<T> list) {
        d<VH, T> dVar = this.c;
        list.getClass();
        dVar.f0(new ArrayList(list));
        a<T> aVar = this.h;
        aVar.getClass();
        aVar.d(c());
        j(SubscriptionState.LOADED);
    }

    public void k(s<List<T>> sVar, b bVar, a<T> aVar) {
        boolean z = false;
        MoreObjects.checkState(this.f == null);
        MoreObjects.checkState(this.g == null);
        if (this.h == null) {
            z = true;
        }
        MoreObjects.checkState(z);
        sVar.getClass();
        this.f = sVar;
        this.g = bVar;
        this.h = aVar;
        this.e.dispose();
        this.e = this.a.a().Q(this.b).subscribe(new e(this), c.a);
    }

    public void l() {
        this.d.dispose();
        c().clear();
        this.e.dispose();
        this.h = null;
        this.g = null;
        this.f = null;
        this.i = null;
    }
}
