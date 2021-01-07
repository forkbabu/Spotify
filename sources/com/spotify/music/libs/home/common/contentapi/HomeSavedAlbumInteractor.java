package com.spotify.music.libs.home.common.contentapi;

import androidx.lifecycle.e;
import androidx.lifecycle.n;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import io.reactivex.functions.g;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.h;

public final class HomeSavedAlbumInteractor implements b, e {
    private final HashMap<String, io.reactivex.subjects.a<Boolean>> a = new HashMap<>();
    private final AtomicReference<HashMap<String, Boolean>> b = new AtomicReference<>(new HashMap());
    private final Policy c;
    private final io.reactivex.disposables.d f = new io.reactivex.disposables.d();
    private final t8a n;
    private final s9a o;

    static final class a implements io.reactivex.functions.a {
        final /* synthetic */ HomeSavedAlbumInteractor a;
        final /* synthetic */ String b;

        a(HomeSavedAlbumInteractor homeSavedAlbumInteractor, String str) {
            this.a = homeSavedAlbumInteractor;
            this.b = str;
        }

        @Override // io.reactivex.functions.a
        public final void run() {
            t8a t8a = this.a.n;
            String str = this.b;
            t8a.a(str, str, true);
        }
    }

    static final class b implements io.reactivex.functions.a {
        final /* synthetic */ HomeSavedAlbumInteractor a;
        final /* synthetic */ String b;

        b(HomeSavedAlbumInteractor homeSavedAlbumInteractor, String str) {
            this.a = homeSavedAlbumInteractor;
            this.b = str;
        }

        @Override // io.reactivex.functions.a
        public final void run() {
            this.a.n.f(this.b, true);
        }
    }

    static final class c<T, R> implements l<com.spotify.music.libs.collection.model.d, v<? extends HashMap<String, Boolean>>> {
        public static final c a = new c();

        c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends HashMap<String, Boolean>> apply(com.spotify.music.libs.collection.model.d dVar) {
            com.spotify.music.libs.collection.model.d dVar2 = dVar;
            h.e(dVar2, "albums");
            HashMap hashMap = new HashMap(dVar2.getItems().size());
            for (T t : dVar2.getItems()) {
                hashMap.put(t.getUri(), Boolean.valueOf(t.k()));
            }
            return s.i0(hashMap);
        }
    }

    static final class d<T> implements g<HashMap<String, Boolean>> {
        final /* synthetic */ HomeSavedAlbumInteractor a;

        d(HomeSavedAlbumInteractor homeSavedAlbumInteractor) {
            this.a = homeSavedAlbumInteractor;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(HashMap<String, Boolean> hashMap) {
            this.a.b.set(hashMap);
            HomeSavedAlbumInteractor.f(this.a);
        }
    }

    public HomeSavedAlbumInteractor(n nVar, t8a t8a, s9a s9a) {
        h.e(nVar, "lifecycleOwner");
        h.e(t8a, "likedContent");
        h.e(s9a, "albumsDataLoader");
        this.n = t8a;
        this.o = s9a;
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        decorationPolicy.setListAttributes(ImmutableMap.of("link", Boolean.TRUE));
        this.c = new Policy(decorationPolicy);
        nVar.A().a(this);
    }

    public static final void f(HomeSavedAlbumInteractor homeSavedAlbumInteractor) {
        for (Map.Entry<String, io.reactivex.subjects.a<Boolean>> entry : homeSavedAlbumInteractor.a.entrySet()) {
            Boolean bool = homeSavedAlbumInteractor.b.get().get(entry.getKey());
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            h.d(bool, "savedAlbums.get()[stringToPublisher.key] ?: false");
            entry.getValue().onNext(Boolean.valueOf(bool.booleanValue()));
        }
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void V(n nVar) {
        androidx.lifecycle.d.d(this, nVar);
    }

    @Override // com.spotify.music.libs.home.common.contentapi.b
    public io.reactivex.a a(String str) {
        h.e(str, "uri");
        io.reactivex.a u = io.reactivex.a.u(new a(this, str));
        h.d(u, "Completable.fromAction {…uri, uri, true)\n        }");
        return u;
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void a0(n nVar) {
        androidx.lifecycle.d.c(this, nVar);
    }

    @Override // com.spotify.music.libs.home.common.contentapi.b
    public io.reactivex.a b(String str) {
        h.e(str, "uri");
        io.reactivex.a u = io.reactivex.a.u(new b(this, str));
        h.d(u, "Completable.fromAction {…move(uri, true)\n        }");
        return u;
    }

    @Override // com.spotify.music.libs.home.common.contentapi.b
    public s<Boolean> c(String str) {
        h.e(str, "uri");
        if (this.f.a() == null || this.f.d()) {
            this.o.a().h(new ane("addTime", true, null, 4));
            this.o.a().f(0, 128);
            this.o.a().e(true);
            this.o.a().d(true, false, false);
            this.f.b(this.o.d(this.c).J0(c.a).E().subscribe(new d(this)));
        }
        io.reactivex.subjects.a<Boolean> aVar = this.a.get(str);
        if (aVar != null) {
            return aVar;
        }
        Boolean bool = Boolean.FALSE;
        io.reactivex.subjects.a<Boolean> i1 = io.reactivex.subjects.a.i1(bool);
        Boolean bool2 = this.b.get().get(str);
        if (bool2 != null) {
            bool = bool2;
        }
        i1.onNext(bool);
        this.a.put(str, i1);
        return i1;
    }

    @Override // androidx.lifecycle.g
    public void d0(n nVar) {
        h.e(nVar, "owner");
        this.f.b(null);
    }

    @Override // androidx.lifecycle.g
    public void h0(n nVar) {
        h.e(nVar, "owner");
        nVar.A().c(this);
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void n(n nVar) {
        androidx.lifecycle.d.a(this, nVar);
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void o0(n nVar) {
        androidx.lifecycle.d.e(this, nVar);
    }
}
