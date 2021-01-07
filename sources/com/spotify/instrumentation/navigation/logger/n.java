package com.spotify.instrumentation.navigation.logger;

import java.util.List;
import kotlin.jvm.internal.h;

public final class n {
    private final f a;
    private final NavigationTransactionState b;
    private final List<h> c;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.spotify.instrumentation.navigation.logger.h> */
    /* JADX WARN: Multi-variable type inference failed */
    public n(f fVar, NavigationTransactionState navigationTransactionState, List<? extends h> list) {
        h.e(fVar, "action");
        h.e(navigationTransactionState, "state");
        h.e(list, "errors");
        this.a = fVar;
        this.b = navigationTransactionState;
        this.c = list;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.spotify.instrumentation.navigation.logger.n */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ n b(n nVar, f fVar, NavigationTransactionState navigationTransactionState, List list, int i) {
        if ((i & 1) != 0) {
            fVar = nVar.a;
        }
        NavigationTransactionState navigationTransactionState2 = (i & 2) != 0 ? nVar.b : null;
        if ((i & 4) != 0) {
            list = nVar.c;
        }
        return nVar.a(fVar, navigationTransactionState2, list);
    }

    public final n a(f fVar, NavigationTransactionState navigationTransactionState, List<? extends h> list) {
        h.e(fVar, "action");
        h.e(navigationTransactionState, "state");
        h.e(list, "errors");
        return new n(fVar, navigationTransactionState, list);
    }

    public final f c() {
        return this.a;
    }

    public final List<h> d() {
        return this.c;
    }

    public final NavigationTransactionState e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return h.a(this.a, nVar.a) && h.a(this.b, nVar.b) && h.a(this.c, nVar.c);
    }

    public int hashCode() {
        f fVar = this.a;
        int i = 0;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        NavigationTransactionState navigationTransactionState = this.b;
        int hashCode2 = (hashCode + (navigationTransactionState != null ? navigationTransactionState.hashCode() : 0)) * 31;
        List<h> list = this.c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("NavigationTransaction(action=");
        V0.append(this.a);
        V0.append(", state=");
        V0.append(this.b);
        V0.append(", errors=");
        return je.L0(V0, this.c, ")");
    }
}
