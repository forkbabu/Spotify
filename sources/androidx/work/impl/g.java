package androidx.work.impl;

import android.text.TextUtils;
import androidx.work.ExistingWorkPolicy;
import androidx.work.impl.utils.b;
import androidx.work.j;
import androidx.work.l;
import androidx.work.o;
import androidx.work.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class g extends o {
    private static final String j = j.f("WorkContinuationImpl");
    private final l a;
    private final String b;
    private final ExistingWorkPolicy c;
    private final List<? extends q> d;
    private final List<String> e;
    private final List<String> f;
    private final List<g> g = null;
    private boolean h;
    private l i;

    g(l lVar, String str, ExistingWorkPolicy existingWorkPolicy, List<? extends q> list, List<g> list2) {
        this.a = lVar;
        this.b = str;
        this.c = existingWorkPolicy;
        this.d = list;
        this.e = new ArrayList(list.size());
        this.f = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String a2 = ((q) list.get(i2)).a();
            this.e.add(a2);
            this.f.add(a2);
        }
    }

    private static boolean i(g gVar, Set<String> set) {
        set.addAll(gVar.e);
        Set<String> l = l(gVar);
        for (String str : set) {
            if (((HashSet) l).contains(str)) {
                return true;
            }
        }
        List<g> list = gVar.g;
        if (list != null && !list.isEmpty()) {
            for (g gVar2 : list) {
                if (i(gVar2, set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.e);
        return false;
    }

    public static Set<String> l(g gVar) {
        HashSet hashSet = new HashSet();
        List<g> list = gVar.g;
        if (list != null && !list.isEmpty()) {
            for (g gVar2 : list) {
                hashSet.addAll(gVar2.e);
            }
        }
        return hashSet;
    }

    public l a() {
        if (!this.h) {
            b bVar = new b(this);
            ((oa) this.a.q()).a(bVar);
            this.i = bVar.a();
        } else {
            j.c().h(j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.e)), new Throwable[0]);
        }
        return this.i;
    }

    public ExistingWorkPolicy b() {
        return this.c;
    }

    public List<String> c() {
        return this.e;
    }

    public String d() {
        return this.b;
    }

    public List<g> e() {
        return this.g;
    }

    public List<? extends q> f() {
        return this.d;
    }

    public l g() {
        return this.a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.h;
    }

    public void k() {
        this.h = true;
    }
}
