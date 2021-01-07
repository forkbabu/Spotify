package com.spotify.music.features.listeninghistory.presenter;

import android.content.Context;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.listeninghistory.datasource.ListeningHistoryDataSource;
import com.spotify.rxjava2.q;
import defpackage.s81;
import io.reactivex.functions.g;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.h;

public final class ListeningHistoryPresenterImpl implements a {
    private HashMap<ListeningHistoryDataSource.HistoryType, b91> a = new HashMap<>();
    private final q b = new q();
    private final kotlin.d c = kotlin.a.b(new ListeningHistoryPresenterImpl$emptyView$2(this));
    private final s81 d;
    private ListeningHistoryDataSource.HistoryType e;
    private hn5 f;
    private boolean g;
    private final g<b91> h;
    private final g<Throwable> i;
    private final Context j;
    private final y k;
    private final y l;
    private final cbc<rm5> m;
    private final ListeningHistoryDataSource n;
    private final com.spotify.music.features.listeninghistory.datasource.d o;

    static final class a<T> implements g<Throwable> {
        final /* synthetic */ ListeningHistoryPresenterImpl a;

        a(ListeningHistoryPresenterImpl listeningHistoryPresenterImpl) {
            this.a = listeningHistoryPresenterImpl;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            ListeningHistoryPresenterImpl.h(this.a).a();
            Assertion.i("Listening History: Loading error", th);
        }
    }

    static final class b<T> implements g<io.reactivex.disposables.b> {
        final /* synthetic */ ListeningHistoryPresenterImpl a;

        b(ListeningHistoryPresenterImpl listeningHistoryPresenterImpl) {
            this.a = listeningHistoryPresenterImpl;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(io.reactivex.disposables.b bVar) {
            ListeningHistoryPresenterImpl.k(this.a);
        }
    }

    static final class c implements io.reactivex.functions.a {
        final /* synthetic */ ListeningHistoryPresenterImpl a;

        c(ListeningHistoryPresenterImpl listeningHistoryPresenterImpl) {
            this.a = listeningHistoryPresenterImpl;
        }

        @Override // io.reactivex.functions.a
        public final void run() {
            this.a.g = false;
        }
    }

    static final class d<T> implements g<b91> {
        final /* synthetic */ ListeningHistoryPresenterImpl a;

        d(ListeningHistoryPresenterImpl listeningHistoryPresenterImpl) {
            this.a = listeningHistoryPresenterImpl;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(b91 b91) {
            b91 b912 = b91;
            if (!b912.body().isEmpty()) {
                if (this.a.l().containsKey(this.a.d())) {
                    b91 b913 = this.a.l().get(this.a.d());
                    h.c(b913);
                    this.a.c(b913.toBuilder().a(b912.body()).h(b912.custom()).g());
                    return;
                }
                ListeningHistoryPresenterImpl listeningHistoryPresenterImpl = this.a;
                h.d(b912, "it");
                listeningHistoryPresenterImpl.c(b912);
            } else if (!this.a.m(b912)) {
                b91 b914 = this.a.l().get(this.a.d());
                h.c(b914);
                this.a.c(b914.toBuilder().h(b912.custom()).g());
            }
        }
    }

    public ListeningHistoryPresenterImpl(Context context, y yVar, y yVar2, cbc<rm5> cbc, ListeningHistoryDataSource listeningHistoryDataSource, com.spotify.music.features.listeninghistory.datasource.d dVar) {
        h.e(context, "context");
        h.e(yVar, "ioScheduler");
        h.e(yVar2, "mainScheduler");
        h.e(cbc, "pageLoaderScope");
        h.e(listeningHistoryDataSource, "dataSource");
        h.e(dVar, "listeningHistoryProperties");
        this.j = context;
        this.k = yVar;
        this.l = yVar2;
        this.m = cbc;
        this.n = listeningHistoryDataSource;
        this.o = dVar;
        s81.a c2 = z81.c();
        ym5 ym5 = ym5.b;
        this.d = c2.n(ym5.a).l();
        this.e = dVar.getFilter();
        this.h = new d(this);
        this.i = new a(this);
    }

    public static final /* synthetic */ hn5 h(ListeningHistoryPresenterImpl listeningHistoryPresenterImpl) {
        hn5 hn5 = listeningHistoryPresenterImpl.f;
        if (hn5 != null) {
            return hn5;
        }
        h.k("viewBinder");
        throw null;
    }

    public static final void k(ListeningHistoryPresenterImpl listeningHistoryPresenterImpl) {
        listeningHistoryPresenterImpl.g = true;
        if (listeningHistoryPresenterImpl.a.containsKey(listeningHistoryPresenterImpl.e)) {
            b91 b91 = listeningHistoryPresenterImpl.a.get(listeningHistoryPresenterImpl.e);
            h.c(b91);
            b91 g2 = b91.toBuilder().b(listeningHistoryPresenterImpl.d).g();
            hn5 hn5 = listeningHistoryPresenterImpl.f;
            if (hn5 != null) {
                com.spotify.music.features.listeninghistory.c.a(hn5, g2, false, 2, null);
            } else {
                h.k("viewBinder");
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final boolean m(b91 b91) {
        p81 custom;
        Long longValue;
        return ((b91 == null || (custom = b91.custom()) == null || (longValue = custom.longValue("timestamp")) == null) ? -1 : longValue.longValue()) > 0;
    }

    @Override // com.spotify.music.features.listeninghistory.presenter.a
    public void a() {
        this.b.c();
    }

    @Override // com.spotify.music.features.listeninghistory.presenter.a
    public void b(hn5 hn5) {
        h.e(hn5, "viewBinder");
        this.f = hn5;
    }

    @Override // com.spotify.music.features.listeninghistory.presenter.a
    public void c(b91 b91) {
        h.e(b91, "data");
        if (b91.body().isEmpty()) {
            hn5 hn5 = this.f;
            if (hn5 != null) {
                com.spotify.music.features.listeninghistory.c.a(hn5, (b91) this.c.getValue(), false, 2, null);
            } else {
                h.k("viewBinder");
                throw null;
            }
        } else {
            h.e(b91, "$this$removeBodyDuplicates");
            List<? extends s81> body = b91.body();
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (T t : body) {
                if (hashSet.add(t.id())) {
                    arrayList.add(t);
                }
            }
            b91 L = je.L(b91, arrayList);
            hn5 hn52 = this.f;
            if (hn52 != null) {
                com.spotify.music.features.listeninghistory.c.a(hn52, L, false, 2, null);
                this.a.put(this.e, L);
                return;
            }
            h.k("viewBinder");
            throw null;
        }
    }

    @Override // com.spotify.music.features.listeninghistory.presenter.a
    public ListeningHistoryDataSource.HistoryType d() {
        return this.e;
    }

    @Override // com.spotify.music.features.listeninghistory.presenter.a
    public void e() {
        p81 custom;
        if (!this.g && m(this.a.get(this.e))) {
            b91 b91 = this.a.get(this.e);
            this.b.a(this.n.a((b91 == null || (custom = b91.custom()) == null) ? null : custom.longValue("timestamp"), this.e).H(this.k).B(this.l).o(new b(this)).l(new c(this)).subscribe(this.h, this.i));
        }
    }

    @Override // com.spotify.music.features.listeninghistory.presenter.a
    public void f(ListeningHistoryDataSource.HistoryType historyType) {
        h.e(historyType, "type");
        h.e(historyType, "value");
        this.e = historyType;
        this.o.a(historyType);
        if (this.a.containsKey(historyType)) {
            hn5 hn5 = this.f;
            if (hn5 != null) {
                b91 b91 = this.a.get(historyType);
                h.c(b91);
                h.d(b91, "localHubs[type]!!");
                hn5.c(b91, true);
                return;
            }
            h.k("viewBinder");
            throw null;
        }
        this.m.get().b();
    }

    public final HashMap<ListeningHistoryDataSource.HistoryType, b91> l() {
        return this.a;
    }
}
