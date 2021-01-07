package com.spotify.music.libs.home.common.contentapi;

import com.google.common.collect.ImmutableMap;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;
import com.spotify.playlist.endpoints.policy.playlist.ListPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import com.spotify.playlist.endpoints.v;
import com.spotify.playlist.models.k;
import io.reactivex.functions.l;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public final class c implements b {
    private static final d.b f;
    public static final /* synthetic */ int n = 0;
    private final v a;
    private final d b;
    private final SnackbarManager c;

    static final class a implements io.reactivex.functions.a {
        final /* synthetic */ c a;

        a(c cVar) {
            this.a = cVar;
        }

        @Override // io.reactivex.functions.a
        public final void run() {
            this.a.c.dismiss();
            SnackbarManager snackbarManager = this.a.c;
            int i = c.n;
            SnackbarConfiguration build = SnackbarConfiguration.builder((int) C0707R.string.toast_liked_show_your_library).build();
            h.d(build, "SnackbarConfiguration.bu…_TO_YOUR_LIBRARY).build()");
            snackbarManager.show(build);
        }
    }

    static final class b implements io.reactivex.functions.a {
        final /* synthetic */ c a;

        b(c cVar) {
            this.a = cVar;
        }

        @Override // io.reactivex.functions.a
        public final void run() {
            this.a.c.dismiss();
            SnackbarManager snackbarManager = this.a.c;
            int i = c.n;
            SnackbarConfiguration build = SnackbarConfiguration.builder((int) C0707R.string.toast_removed_from_collection_your_library).build();
            h.d(build, "SnackbarConfiguration.bu…ROM_YOUR_LIBRARY).build()");
            snackbarManager.show(build);
        }
    }

    /* renamed from: com.spotify.music.libs.home.common.contentapi.c$c  reason: collision with other inner class name */
    static final class C0296c<T, R> implements l<k, Boolean> {
        public static final C0296c a = new C0296c();

        C0296c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Boolean apply(k kVar) {
            k kVar2 = kVar;
            h.e(kVar2, "it");
            return Boolean.valueOf(kVar2.j().t());
        }
    }

    static {
        ListPolicy e = ListPolicy.Companion.a().e();
        HeaderPolicy.a a2 = HeaderPolicy.Companion.a();
        ImmutableMap of = ImmutableMap.of("followed", Boolean.TRUE);
        h.d(of, "ImmutableMap.of(\"followed\", true)");
        a2.a(of);
        HeaderPolicy b2 = a2.b();
        DecorationPolicy.a a3 = DecorationPolicy.Companion.a();
        a3.c(e);
        a3.b(b2);
        DecorationPolicy a4 = a3.a();
        Policy.a a5 = Policy.Companion.a();
        a5.b(a4);
        Policy a6 = a5.a();
        d.b.a aVar = new d.b.a(null, null, null, null, null, false, null, false, null, null, null, 0, null, null, 16383);
        aVar.g(a6);
        aVar.i(new qxd(0, 0));
        f = aVar.b();
    }

    public c(v vVar, d dVar, SnackbarManager snackbarManager) {
        h.e(vVar, "rootlistOperation");
        h.e(dVar, "playlistEndpoint");
        h.e(snackbarManager, "snackbarManager");
        this.a = vVar;
        this.b = dVar;
        this.c = snackbarManager;
    }

    @Override // com.spotify.music.libs.home.common.contentapi.b
    public io.reactivex.a a(String str) {
        h.e(str, "uri");
        io.reactivex.a p = this.a.c(str).p(new a(this));
        h.d(p, "rootlistOperation.addPla…Y).build())\n            }");
        return p;
    }

    @Override // com.spotify.music.libs.home.common.contentapi.b
    public io.reactivex.a b(String str) {
        h.e(str, "uri");
        io.reactivex.a p = this.a.d(str).p(new b(this));
        h.d(p, "rootlistOperation.remove…          )\n            }");
        return p;
    }

    @Override // com.spotify.music.libs.home.common.contentapi.b
    public s<Boolean> c(String str) {
        h.e(str, "uri");
        s<R> E = this.b.a(str, f).j0(C0296c.a).E();
        h.d(E, "playlistEndpoint.subscri…  .distinctUntilChanged()");
        return E;
    }
}
