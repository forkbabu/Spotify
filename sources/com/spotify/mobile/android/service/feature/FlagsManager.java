package com.spotify.mobile.android.service.feature;

import android.content.Context;
import android.os.Bundle;
import com.google.common.base.MoreObjects;
import com.spotify.android.flags.UnmappableValueException;
import com.spotify.android.flags.f;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.libs.instrumentation.performance.ColdStartTracker;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;
import com.spotify.mobile.android.util.x;
import defpackage.c6;
import io.reactivex.g;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import io.reactivex.y;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FlagsManager {
    private static final Set<LoaderSource> w = Collections.unmodifiableSet(EnumSet.allOf(LoaderSource.class));
    private static final SpSharedPreferences.b<Object, JSONArray> x = SpSharedPreferences.b.c("feature-service-overrides");
    private static final AtomicReference<com.spotify.android.flags.c> y = new AtomicReference<>();
    private final Context a;
    private final i b;
    private final m c;
    private final s d;
    private final FireAndForgetResolver e;
    private final g<SessionState> f;
    private final y g;
    private final s<Map<String, String>> h;
    private final ColdStartTracker i;
    private final i j;
    private gc1 k;
    private boolean l;
    private com.spotify.android.flags.c m;
    private final Set<d> n = new CopyOnWriteArraySet();
    private final Map<String, String> o = new HashMap(64);
    private final Map<String, Boolean> p = new HashMap(64);
    private final Map<com.spotify.android.flags.b<? extends Serializable>, Serializable> q = new IdentityHashMap(64);
    private final Collection<LoaderSource> r = EnumSet.noneOf(LoaderSource.class);
    io.reactivex.disposables.b s;
    private io.reactivex.disposables.b t = EmptyDisposable.INSTANCE;
    private final io.reactivex.functions.g<SessionState> u = new a();
    private final c6.a<JSONArray> v = new b();

    /* access modifiers changed from: package-private */
    public enum LoaderSource {
        PRODUCT_STATE_FLAG,
        OVERRIDES
    }

    class a implements io.reactivex.functions.g<SessionState> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(SessionState sessionState) {
            SessionState sessionState2 = sessionState;
            z42.a("Not called on main looper");
            Logger.l("Session state changed: %s", sessionState2);
            boolean z = FlagsManager.this.l;
            FlagsManager.this.l = sessionState2.loggedIn();
            if (z && !FlagsManager.this.l) {
                FlagsManager.c(FlagsManager.this);
            } else if (!z && FlagsManager.this.l) {
                FlagsManager.g(FlagsManager.this);
                FlagsManager.this.j.a(sessionState2.currentUser());
            }
        }
    }

    class b implements c6.a<JSONArray> {
        b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.loader.content.b, java.lang.Object] */
        @Override // defpackage.c6.a
        public void a(androidx.loader.content.b<JSONArray> bVar, JSONArray jSONArray) {
            JSONArray jSONArray2 = jSONArray;
            if (FlagsManager.this.d.a()) {
                for (int i = 0; i < jSONArray2.length(); i++) {
                    try {
                        JSONObject jSONObject = jSONArray2.getJSONObject(i);
                        try {
                            com.spotify.android.flags.b<?> b = com.spotify.android.flags.b.b(jSONObject.getString("identifier"));
                            Class<?> f = b.f();
                            try {
                                if (x.j(f, Integer.class)) {
                                    FlagsManager.this.q.put(b, Integer.valueOf(jSONObject.getInt("value")));
                                } else if (x.j(f, Boolean.class)) {
                                    FlagsManager.this.q.put(b, Boolean.valueOf(jSONObject.getBoolean("value")));
                                } else if (x.j(f, String.class)) {
                                    FlagsManager.this.q.put(b, jSONObject.getString("value"));
                                } else {
                                    Assertion.p("Cannot handle " + b.f().getCanonicalName());
                                }
                            } catch (JSONException e) {
                                Assertion.w("Unable to get value for flag [" + b.d() + ']', e);
                            } catch (UnmappableValueException e2) {
                                Assertion.o(e2);
                            }
                        } catch (IllegalStateException unused) {
                        }
                    } catch (JSONException e3) {
                        Assertion.o(e3);
                    }
                }
            }
            FlagsManager.this.r.add(LoaderSource.OVERRIDES);
            if (FlagsManager.this.q()) {
                FlagsManager.this.p();
                FlagsManager.this.s();
            }
        }

        @Override // defpackage.c6.a
        public androidx.loader.content.b<JSONArray> b(int i, Bundle bundle) {
            return new c(FlagsManager.this.a, FlagsManager.this.b);
        }

        @Override // defpackage.c6.a
        public void c(androidx.loader.content.b<JSONArray> bVar) {
        }
    }

    private static class c extends androidx.loader.content.a<JSONArray> {
        private final i l;

        c(Context context, i iVar) {
            super(context);
            iVar.getClass();
            this.l = iVar;
        }

        /* access modifiers changed from: protected */
        @Override // androidx.loader.content.b
        public void f() {
            d();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // androidx.loader.content.a
        public JSONArray m() {
            try {
                return this.l.a(e()).g(FlagsManager.x, new JSONArray());
            } catch (JSONException e) {
                Logger.e(e, "Could not load key", new Object[0]);
                return new JSONArray();
            }
        }
    }

    /* access modifiers changed from: private */
    public static class d implements com.spotify.android.flags.g {
        private final WeakReference<com.spotify.android.flags.g> a;
        private final String b;
        private final String c;

        d(com.spotify.android.flags.g gVar) {
            String str;
            this.b = gVar.getClass().getCanonicalName();
            Class<?> enclosingClass = gVar.getClass().getEnclosingClass();
            if (enclosingClass == null) {
                str = "";
            } else {
                str = enclosingClass.getCanonicalName();
            }
            this.c = str;
            this.a = new WeakReference<>(gVar);
        }

        @Override // com.spotify.android.flags.g
        public void a(com.spotify.android.flags.c cVar) {
            com.spotify.android.flags.g gVar = this.a.get();
            MoreObjects.checkNotNull(gVar, "Listener of type %s defined at %s missing. Did you forget to unregister it?", this.b, this.c);
            gVar.a(cVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            return rw.equal(this.a.get(), ((d) obj).a.get());
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.a.get()});
        }
    }

    public FlagsManager(Context context, i iVar, m mVar, s sVar, FireAndForgetResolver fireAndForgetResolver, g<SessionState> gVar, y yVar, s<Map<String, String>> sVar2, ColdStartTracker coldStartTracker, i iVar2) {
        this.a = context;
        this.b = iVar;
        this.c = mVar;
        this.d = sVar;
        this.e = fireAndForgetResolver;
        this.f = gVar;
        this.g = yVar;
        this.h = sVar2;
        this.i = coldStartTracker;
        this.j = iVar2;
    }

    static void c(FlagsManager flagsManager) {
        flagsManager.w();
        flagsManager.x();
        flagsManager.r.clear();
    }

    static void g(FlagsManager flagsManager) {
        flagsManager.getClass();
        Logger.l(" -- starting loaders", new Object[0]);
        flagsManager.w();
        flagsManager.x();
        flagsManager.s = flagsManager.h.o0(flagsManager.g).subscribe(new b(flagsManager));
        gc1 gc1 = new gc1();
        flagsManager.k = gc1;
        gc1.a(flagsManager.v);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void p() {
        f.b bVar = new f.b();
        for (com.spotify.android.flags.b<?> bVar2 : this.c.a()) {
            bVar.c(bVar2, this.o.get(bVar2.d()));
        }
        for (Map.Entry<com.spotify.android.flags.b<? extends Serializable>, Serializable> entry : this.q.entrySet()) {
            bVar.b(entry.getKey(), entry.getValue());
        }
        f a2 = bVar.a();
        this.m = a2;
        y.set(a2);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean q() {
        Collection<LoaderSource> collection = this.r;
        Set<LoaderSource> set = w;
        boolean containsAll = collection.containsAll(set);
        Logger.b("isReadyForUse: %s (loaded %d out of %d sources)", Boolean.valueOf(containsAll), Integer.valueOf(this.r.size()), Integer.valueOf(set.size()));
        return containsAll;
    }

    public static void r(FlagsManager flagsManager, Map map) {
        boolean z;
        boolean z2 = false;
        for (com.spotify.android.flags.b<?> bVar : flagsManager.c.a()) {
            String str = (String) map.get(bVar.e().a());
            if (str != null) {
                try {
                    z = flagsManager.v(bVar, str, false);
                } catch (NumberFormatException unused) {
                    z2 |= flagsManager.u(bVar);
                    StringBuilder V0 = je.V0("Use of non-integer product state ");
                    V0.append(bVar.e().a());
                    V0.append('=');
                    V0.append(str);
                    Assertion.g(V0.toString());
                }
            } else {
                z = flagsManager.u(bVar);
            }
            z2 |= z;
        }
        boolean add = flagsManager.r.add(LoaderSource.PRODUCT_STATE_FLAG) | z2;
        Logger.l("Product flags are loaded", new Object[0]);
        if (flagsManager.q() && add) {
            Logger.l(" -- Notifying listeners", new Object[0]);
            flagsManager.p();
            flagsManager.s();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void s() {
        Logger.l("Notifying listeners", new Object[0]);
        for (d dVar : this.n) {
            com.spotify.android.flags.c cVar = this.m;
            cVar.getClass();
            dVar.a(cVar);
        }
    }

    private boolean u(com.spotify.android.flags.b<?> bVar) {
        String a2 = bVar.a();
        return !rw.equal(this.o.put(bVar.d(), a2), a2);
    }

    private void w() {
        gc1 gc1 = this.k;
        if (gc1 != null) {
            gc1.b(this.v);
        }
    }

    private void x() {
        io.reactivex.disposables.b bVar = this.s;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    /* access modifiers changed from: package-private */
    public void o(com.spotify.android.flags.g gVar) {
        boolean isEmpty = this.n.isEmpty();
        Logger.l("Adding listener", new Object[0]);
        this.n.add(new d(gVar));
        if (q()) {
            Logger.l(" -- Flags are ready to use, notifying listeners", new Object[0]);
            com.spotify.android.flags.c cVar = this.m;
            cVar.getClass();
            ((a) gVar).a.onNext(cVar);
        }
        if (isEmpty) {
            this.i.p("pfm_flags_start");
            Logger.l("startLoadingFlags()", new Object[0]);
            this.t = this.f.Q(this.g).subscribe(this.u);
        }
    }

    /* access modifiers changed from: package-private */
    public void t(com.spotify.android.flags.g gVar) {
        gVar.getClass();
        Logger.l("Removing listener", new Object[0]);
        d dVar = new d(gVar);
        if (!this.n.contains(dVar)) {
            Logger.n("FlagsManager does not contain this listener: %s", gVar.toString());
            return;
        }
        this.n.remove(dVar);
        if (this.n.isEmpty()) {
            Logger.l("FlagsManager cleanup invoked", new Object[0]);
            this.t.dispose();
            w();
            x();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean v(com.spotify.android.flags.b<?> bVar, String str, boolean z) {
        String str2;
        try {
            bVar.h(str);
            str2 = this.o.put(bVar.d(), str);
        } catch (UnmappableValueException e2) {
            StringBuilder V0 = je.V0("flag ");
            V0.append(bVar.d());
            V0.append(" is set to invalid value ");
            V0.append(str);
            Assertion.i(V0.toString(), e2);
            str = bVar.a();
            str2 = this.o.put(bVar.d(), str);
        }
        this.p.put(bVar.d(), Boolean.valueOf(z));
        return !rw.equal(str2, str);
    }
}
