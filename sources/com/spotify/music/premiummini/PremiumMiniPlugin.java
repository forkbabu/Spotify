package com.spotify.music.premiummini;

import android.view.ViewGroup;
import com.google.common.base.Optional;
import com.spotify.common.uri.SpotifyUri;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.offline.OfflineUtilImpl;
import com.spotify.offline.b;
import com.spotify.offline.data.OfflineAvailability;
import com.spotify.playlist.endpoints.i;
import com.spotify.playlist.endpoints.v;
import io.reactivex.functions.l;
import java.util.Map;
import kotlin.jvm.internal.h;

public final class PremiumMiniPlugin implements ahb {
    private final io.reactivex.disposables.a a = new io.reactivex.disposables.a();
    private final io.reactivex.disposables.a b = new io.reactivex.disposables.a();
    private final txc c;
    private final k f;
    private final v n;
    private final i o;
    private final b p;
    private final SpSharedPreferences<Object> q;

    static final class a<T, R> implements l<Map<String, ? extends String>, Boolean> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Boolean apply(Map<String, ? extends String> map) {
            Map<String, ? extends String> map2 = map;
            h.e(map2, "productState");
            return Boolean.valueOf(com.spotify.mobile.android.converter.a.a((String) map2.get("premium-mini")));
        }
    }

    public PremiumMiniPlugin(txc txc, k kVar, v vVar, i iVar, b bVar, SpSharedPreferences<Object> spSharedPreferences) {
        h.e(txc, "productState");
        h.e(kVar, "premiumMiniProperties");
        h.e(vVar, "rootlistOperation");
        h.e(iVar, "playlistOperation");
        h.e(bVar, "offlineUtil");
        h.e(spSharedPreferences, "userPreferences");
        this.c = txc;
        this.f = kVar;
        this.n = vVar;
        this.o = iVar;
        this.p = bVar;
        this.q = spSharedPreferences;
    }

    public static final boolean g(PremiumMiniPlugin premiumMiniPlugin, com.spotify.offline.data.a aVar) {
        premiumMiniPlugin.getClass();
        if ((!h.a(aVar.b(), "spotify:playlist:37i9dQZF1EGfvr6Ga3L7Ne")) && aVar.a() != OfflineAvailability.No) {
            if (new SpotifyUri(aVar.b()).i() != SpotifyUri.Kind.EPISODE) {
                return true;
            }
        }
        return false;
    }

    public static final void h(PremiumMiniPlugin premiumMiniPlugin, boolean z) {
        boolean d = premiumMiniPlugin.q.d(j.a(), false);
        SpSharedPreferences.a<Object> b2 = premiumMiniPlugin.q.b();
        b2.a(j.a(), z);
        b2.i();
        if (!(!z && !d)) {
            premiumMiniPlugin.f.c(z);
            premiumMiniPlugin.b.f();
            if (premiumMiniPlugin.f.a()) {
                io.reactivex.a D = premiumMiniPlugin.n.c("spotify:playlist:37i9dQZF1EGfvr6Ga3L7Ne").D(h.a);
                i iVar = premiumMiniPlugin.o;
                Optional<ane> absent = Optional.absent();
                h.d(absent, "Optional.absent()");
                io.reactivex.disposables.b subscribe = D.d(iVar.c("spotify:playlist:37i9dQZF1EGfvr6Ga3L7Ne", absent, true)).subscribe();
                h.d(subscribe, "rootlistOperation.addPla…             .subscribe()");
                premiumMiniPlugin.a.b(subscribe);
                io.reactivex.a Y = ((OfflineUtilImpl) premiumMiniPlugin.p).a().P().Z(e.a).Y(new f(premiumMiniPlugin));
                h.d(Y, "offlineUtil\n            …          }\n            }");
                io.reactivex.disposables.b subscribe2 = Y.subscribe();
                h.d(subscribe2, "markAllOtherResourcesAsN…             .subscribe()");
                premiumMiniPlugin.a.b(subscribe2);
                io.reactivex.disposables.b subscribe3 = ((OfflineUtilImpl) premiumMiniPlugin.p).c(true).subscribe(new g(premiumMiniPlugin));
                h.d(subscribe3, "offlineUtil\n            …          }\n            }");
                premiumMiniPlugin.b.b(subscribe3);
                return;
            }
            i iVar2 = premiumMiniPlugin.o;
            Optional<ane> absent2 = Optional.absent();
            h.d(absent2, "Optional.absent()");
            io.reactivex.disposables.b subscribe4 = iVar2.c("spotify:playlist:37i9dQZF1EGfvr6Ga3L7Ne", absent2, false).subscribe();
            h.d(subscribe4, "markOfflineUserMixPlayli…             .subscribe()");
            premiumMiniPlugin.a.b(subscribe4);
            io.reactivex.disposables.b subscribe5 = premiumMiniPlugin.n.d("spotify:playlist:37i9dQZF1EGfvr6Ga3L7Ne").B().subscribe();
            h.d(subscribe5, "removePremiumMiniPlaylis…             .subscribe()");
            premiumMiniPlugin.a.b(subscribe5);
        }
    }

    @Override // defpackage.ahb
    public void a() {
        io.reactivex.disposables.b subscribe = this.c.b().j0(a.a).E().N(new i(new PremiumMiniPlugin$onUiVisible$2(this))).subscribe();
        h.d(subscribe, "productState.productStat…\n            .subscribe()");
        this.a.b(subscribe);
    }

    @Override // defpackage.ahb
    public void c() {
    }

    @Override // defpackage.ahb
    public void e() {
        this.a.f();
    }

    @Override // defpackage.ahb
    public void f(ViewGroup viewGroup) {
        h.e(viewGroup, "activityLayout");
    }
}
