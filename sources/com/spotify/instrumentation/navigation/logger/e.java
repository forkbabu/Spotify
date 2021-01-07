package com.spotify.instrumentation.navigation.logger;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.EmptyList;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class e {
    private final d a;
    private final n b;
    private final AppForegroundState c;
    private final List<c> d;

    public e(d dVar, n nVar, AppForegroundState appForegroundState, List<c> list) {
        h.e(appForegroundState, "appForegroundState");
        h.e(list, "recentInteractions");
        this.a = dVar;
        this.b = nVar;
        this.c = appForegroundState;
        this.d = list;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.spotify.instrumentation.navigation.logger.e */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ e c(e eVar, d dVar, n nVar, AppForegroundState appForegroundState, List list, int i) {
        if ((i & 1) != 0) {
            dVar = eVar.a;
        }
        if ((i & 2) != 0) {
            nVar = eVar.b;
        }
        if ((i & 4) != 0) {
            appForegroundState = eVar.c;
        }
        if ((i & 8) != 0) {
            list = eVar.d;
        }
        return eVar.b(dVar, nVar, appForegroundState, list);
    }

    public final e a(c cVar) {
        List list;
        h.e(cVar, "interaction");
        List<c> list2 = this.d;
        h.e(list2, "$this$takeLast");
        int size = list2.size();
        if (2 >= size) {
            list = d.Q(list2);
        } else {
            ArrayList arrayList = new ArrayList(2);
            if (list2 instanceof RandomAccess) {
                for (int i = size - 2; i < size; i++) {
                    arrayList.add(list2.get(i));
                }
            } else {
                ListIterator<c> listIterator = list2.listIterator(size - 2);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            list = arrayList;
        }
        return c(this, null, null, null, d.D(list, cVar), 7);
    }

    public final e b(d dVar, n nVar, AppForegroundState appForegroundState, List<c> list) {
        h.e(appForegroundState, "appForegroundState");
        h.e(list, "recentInteractions");
        return new e(dVar, nVar, appForegroundState, list);
    }

    public final d d() {
        return this.a;
    }

    public final n e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return h.a(this.a, eVar.a) && h.a(this.b, eVar.b) && h.a(this.c, eVar.c) && h.a(this.d, eVar.d);
    }

    public final List<c> f() {
        return this.d;
    }

    public int hashCode() {
        d dVar = this.a;
        int i = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        n nVar = this.b;
        int hashCode2 = (hashCode + (nVar != null ? nVar.hashCode() : 0)) * 31;
        AppForegroundState appForegroundState = this.c;
        int hashCode3 = (hashCode2 + (appForegroundState != null ? appForegroundState.hashCode() : 0)) * 31;
        List<c> list = this.d;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Model(currentLocation=");
        V0.append(this.a);
        V0.append(", ongoingTransaction=");
        V0.append(this.b);
        V0.append(", appForegroundState=");
        V0.append(this.c);
        V0.append(", recentInteractions=");
        return je.L0(V0, this.d, ")");
    }

    public e(d dVar, n nVar, AppForegroundState appForegroundState, List list, int i) {
        EmptyList emptyList = (i & 8) != 0 ? EmptyList.a : null;
        h.e(appForegroundState, "appForegroundState");
        h.e(emptyList, "recentInteractions");
        this.a = null;
        this.b = null;
        this.c = appForegroundState;
        this.d = emptyList;
    }
}
