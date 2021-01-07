package com.spotify.intentrouter;

import com.spotify.base.java.logging.Logger;
import com.spotify.intentrouter.CommandRunner;
import com.spotify.mobile.android.util.Assertion;
import java.util.ArrayList;
import java.util.List;

public class l<T> {
    private final j<T> a;
    private final i<T> b;
    private a<T> c;

    public interface a<T> {
    }

    private l(j<T> jVar, i<T> iVar) {
        this.a = jVar;
        this.b = iVar;
    }

    public static <T> l<T> a(j<T> jVar) {
        return new l<>(jVar, new i());
    }

    public boolean b(T t) {
        List<k<T>> b2 = this.a.b(t);
        if (b2.size() == 0) {
            a<T> aVar = this.c;
            if (aVar != null) {
                clb clb = (clb) aVar;
                Logger.b("No route found in intent-router for input: %s", t);
            }
            return false;
        } else if (b2.size() > 1) {
            a<T> aVar2 = this.c;
            if (aVar2 != null) {
                clb clb2 = (clb) aVar2;
                StringBuilder sb = new StringBuilder(200);
                sb.append("Too many routes found in intent-router for input: ");
                sb.append((Object) t);
                sb.append('\n');
                for (k<T> kVar : b2) {
                    sb.append("    Matched by: ");
                    sb.append(kVar.b().description());
                    sb.append(", Command: ");
                    sb.append(kVar.a().c());
                    sb.append('\n');
                }
                Assertion.g(sb.toString());
            }
            ArrayList arrayList = new ArrayList();
            for (k<T> kVar2 : b2) {
                arrayList.add(kVar2.b());
            }
            throw new MatcherCollisionException(arrayList);
        } else {
            k<T> kVar3 = b2.get(0);
            a<T> aVar3 = this.c;
            if (aVar3 != null) {
                clb clb3 = (clb) aVar3;
                Logger.b("Route found in intent-router for input: %s", t);
                Logger.b("Matched by: %s, Command: %s", kVar3.b().description(), kVar3.a().c());
            }
            h<T> a2 = kVar3.a();
            this.b.a(new e(a2.b(t), t, a2.a(t), a2.c()));
            return true;
        }
    }

    public void c(a<T> aVar) {
        this.c = aVar;
    }

    public void d(CommandRunner.b<T> bVar) {
        this.b.b(bVar);
    }
}
