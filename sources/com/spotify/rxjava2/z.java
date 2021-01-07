package com.spotify.rxjava2;

import com.google.common.collect.Collections2;
import com.spotify.base.java.logging.Logger;
import com.spotify.remoteconfig.ma;
import io.reactivex.disposables.b;
import io.reactivex.f;
import io.reactivex.g;
import io.reactivex.h;
import io.reactivex.s;
import io.reactivex.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class z<T> {
    final Set<b0> a;
    private final boolean b;

    public z(ma maVar) {
        this.a = new HashSet();
        this.b = maVar.a();
    }

    private String b() {
        ArrayList newArrayList = Collections2.newArrayList(this.a);
        StringBuilder sb = new StringBuilder(newArrayList.size());
        sb.append(String.format(Locale.getDefault(), "#Active subscriptions: %d", Integer.valueOf(newArrayList.size())));
        Iterator it = newArrayList.iterator();
        while (it.hasNext()) {
            sb.append(String.format(Locale.getDefault(), "\n%s", ((b0) it.next()).a().b()));
        }
        return sb.toString();
    }

    private b0 c(String str, StackTraceElement[] stackTraceElementArr, f<T> fVar, b bVar) {
        b0 b0Var = new b0(fVar, bVar, y.c(str, stackTraceElementArr), str, this.b);
        synchronized (this) {
            this.a.add(b0Var);
            Logger.b("Added %s#%d subscription. Current count: %d", str, Integer.valueOf(hashCode()), Integer.valueOf(this.a.size()));
        }
        return b0Var;
    }

    /* access modifiers changed from: package-private */
    public void a(String str, StackTraceElement[] stackTraceElementArr, s<T> sVar, t<T> tVar) {
        tVar.getClass();
        b subscribe = sVar.subscribe(new i(tVar), new k(tVar), new l(tVar));
        tVar.e(new g(this, str, subscribe, c(str, stackTraceElementArr, tVar, subscribe)));
    }

    public void d(String str, StackTraceElement[] stackTraceElementArr, g gVar, h hVar) {
        hVar.getClass();
        b subscribe = gVar.subscribe(new j(hVar), new a(hVar), new e(hVar));
        hVar.e(new g(this, str, subscribe, c(str, stackTraceElementArr, hVar, subscribe)));
    }

    public s<T> e(String str, s<T> sVar) {
        return s.y(new h(this, str, x.a(), sVar));
    }

    public synchronized List<y> f() {
        Logger.b("--> unsubscribeAndReturnLeaks. Current count: %d", Integer.valueOf(this.a.size()));
        ArrayList<b0> newArrayList = Collections2.newArrayList(this.a);
        if (newArrayList.isEmpty()) {
            return Collections.emptyList();
        }
        Logger.d("Found active subscribers:\n%s", b());
        ArrayList arrayList = new ArrayList();
        for (b0 b0Var : newArrayList) {
            if (b0Var.b()) {
                arrayList.add(b0Var.a());
            }
        }
        Logger.b("<-- unsubscribeAndReturnLeaks. Current count: %d", Integer.valueOf(this.a.size()));
        return arrayList;
    }

    public z() {
        this.a = new HashSet();
        this.b = false;
    }
}
