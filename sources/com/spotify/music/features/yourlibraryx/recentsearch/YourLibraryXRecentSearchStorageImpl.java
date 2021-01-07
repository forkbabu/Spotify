package com.spotify.music.features.yourlibraryx.recentsearch;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class YourLibraryXRecentSearchStorageImpl implements a {
    private static final SpSharedPreferences.b<Object, String> c;
    private final SpSharedPreferences<Object> a;
    private final y b;

    static final class a implements Runnable {
        final /* synthetic */ YourLibraryXRecentSearchStorageImpl a;
        final /* synthetic */ String b;

        a(YourLibraryXRecentSearchStorageImpl yourLibraryXRecentSearchStorageImpl, String str) {
            this.a = yourLibraryXRecentSearchStorageImpl;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            List d = YourLibraryXRecentSearchStorageImpl.d(this.a);
            ArrayList arrayList = (ArrayList) d;
            arrayList.remove(this.b);
            arrayList.add(0, this.b);
            YourLibraryXRecentSearchStorageImpl.e(this.a, d);
        }
    }

    static final class b<T, R> implements l<SpSharedPreferences.Update<String>, List<? extends String>> {
        public static final b a = new b();

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public List<? extends String> apply(SpSharedPreferences.Update<String> update) {
            SpSharedPreferences.Update<String> update2 = update;
            h.e(update2, "it");
            return c.a(update2.a);
        }
    }

    static final class c implements Runnable {
        final /* synthetic */ YourLibraryXRecentSearchStorageImpl a;
        final /* synthetic */ String b;

        c(YourLibraryXRecentSearchStorageImpl yourLibraryXRecentSearchStorageImpl, String str) {
            this.a = yourLibraryXRecentSearchStorageImpl;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            List d = YourLibraryXRecentSearchStorageImpl.d(this.a);
            if (((ArrayList) d).remove(this.b)) {
                YourLibraryXRecentSearchStorageImpl.e(this.a, d);
            }
        }
    }

    static {
        SpSharedPreferences.b<Object, String> e = SpSharedPreferences.b.e("YourLibraryX.recentSearches");
        h.d(e, "makeUserKey(\"YourLibraryX.recentSearches\")");
        c = e;
    }

    public YourLibraryXRecentSearchStorageImpl(SpSharedPreferences<Object> spSharedPreferences, y yVar) {
        h.e(spSharedPreferences, "preferences");
        h.e(yVar, "ioScheduler");
        this.a = spSharedPreferences;
        this.b = yVar;
    }

    public static final List d(YourLibraryXRecentSearchStorageImpl yourLibraryXRecentSearchStorageImpl) {
        return d.W(c.a(yourLibraryXRecentSearchStorageImpl.a.m(c, null)));
    }

    public static final void e(YourLibraryXRecentSearchStorageImpl yourLibraryXRecentSearchStorageImpl, List list) {
        SpSharedPreferences.a<Object> b2 = yourLibraryXRecentSearchStorageImpl.a.b();
        b2.f(c, d.p(d.K(list, 10), ",", null, null, 0, null, null, 62, null));
        b2.j();
    }

    @Override // com.spotify.music.features.yourlibraryx.recentsearch.a
    public io.reactivex.a a(String str) {
        h.e(str, "uri");
        io.reactivex.a G = io.reactivex.a.x(new a(this, str)).G(this.b);
        h.d(G, "Completable.fromRunnable….subscribeOn(ioScheduler)");
        return G;
    }

    @Override // com.spotify.music.features.yourlibraryx.recentsearch.a
    public io.reactivex.a b(String str) {
        h.e(str, "uri");
        io.reactivex.a G = io.reactivex.a.x(new c(this, str)).G(this.b);
        h.d(G, "Completable.fromRunnable….subscribeOn(ioScheduler)");
        return G;
    }

    @Override // com.spotify.music.features.yourlibraryx.recentsearch.a
    public s<List<String>> c() {
        s<R> E = this.a.r(c).j0(b.a).E0(s.c0(new b(new YourLibraryXRecentSearchStorageImpl$observe$2(this)))).E();
        h.d(E, "preferences.observeStrin…  .distinctUntilChanged()");
        return E;
    }
}
