package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public class l extends a {
    private static final t10<Set<Object>> e = k.a();
    public static final /* synthetic */ int f = 0;
    private final Map<d<?>, s<?>> a = new HashMap();
    private final Map<Class<?>, s<?>> b = new HashMap();
    private final Map<Class<?>, s<Set<?>>> c = new HashMap();
    private final r d;

    public l(Executor executor, Iterable<h> iterable, d<?>... dVarArr) {
        Set<n> set;
        r rVar = new r(executor);
        this.d = rVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(d.j(rVar, r.class, r10.class, q10.class));
        for (h hVar : iterable) {
            arrayList.addAll(hVar.getComponents());
        }
        for (d<?> dVar : dVarArr) {
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d dVar2 = (d) it.next();
            n nVar = new n(dVar2);
            Iterator it2 = dVar2.d().iterator();
            while (true) {
                if (it2.hasNext()) {
                    Class cls = (Class) it2.next();
                    o oVar = new o(cls, !dVar2.i(), null);
                    if (!hashMap.containsKey(oVar)) {
                        hashMap.put(oVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(oVar);
                    if (set2.isEmpty() || o.a(oVar)) {
                        set2.add(nVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                    }
                }
            }
        }
        for (Set<n> set3 : hashMap.values()) {
            for (n nVar2 : set3) {
                for (p pVar : nVar2.c().b()) {
                    if (pVar.b() && (set = (Set) hashMap.get(new o(pVar.a(), pVar.d(), null))) != null) {
                        for (n nVar3 : set) {
                            nVar2.a(nVar3);
                            nVar3.b(nVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set set4 : hashMap.values()) {
            hashSet.addAll(set4);
        }
        HashSet hashSet2 = new HashSet();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            n nVar4 = (n) it3.next();
            if (nVar4.f()) {
                hashSet2.add(nVar4);
            }
        }
        int i = 0;
        while (!hashSet2.isEmpty()) {
            n nVar5 = (n) hashSet2.iterator().next();
            hashSet2.remove(nVar5);
            i++;
            for (n nVar6 : nVar5.d()) {
                nVar6.g(nVar5);
                if (nVar6.f()) {
                    hashSet2.add(nVar6);
                }
            }
        }
        if (i == arrayList.size()) {
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                d<?> dVar3 = (d) it4.next();
                this.a.put(dVar3, new s<>(i.a(this, dVar3)));
            }
            for (Map.Entry<d<?>, s<?>> entry : this.a.entrySet()) {
                d<?> key = entry.getKey();
                if (key.i()) {
                    s<?> value = entry.getValue();
                    for (Class<? super Object> cls2 : key.d()) {
                        this.b.put(cls2, value);
                    }
                }
            }
            for (d<?> dVar4 : this.a.keySet()) {
                Iterator<p> it5 = dVar4.b().iterator();
                while (true) {
                    if (it5.hasNext()) {
                        p next = it5.next();
                        if (next.c() && !this.b.containsKey(next.a())) {
                            throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", dVar4, next.a()));
                        }
                    }
                }
            }
            HashMap hashMap2 = new HashMap();
            for (Map.Entry<d<?>, s<?>> entry2 : this.a.entrySet()) {
                d<?> key2 = entry2.getKey();
                if (!key2.i()) {
                    s<?> value2 = entry2.getValue();
                    for (Class<? super Object> cls3 : key2.d()) {
                        if (!hashMap2.containsKey(cls3)) {
                            hashMap2.put(cls3, new HashSet());
                        }
                        ((Set) hashMap2.get(cls3)).add(value2);
                    }
                }
            }
            for (Map.Entry entry3 : hashMap2.entrySet()) {
                this.c.put((Class) entry3.getKey(), new s<>(j.a((Set) entry3.getValue())));
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it6 = hashSet.iterator();
        while (it6.hasNext()) {
            n nVar7 = (n) it6.next();
            if (!nVar7.f() && !nVar7.e()) {
                arrayList2.add(nVar7.c());
            }
        }
        throw new DependencyCycleException(arrayList2);
    }

    @Override // com.google.firebase.components.e
    public Set a(Class cls) {
        return (Set) d(cls).get();
    }

    public <T> t10<T> b(Class<T> cls) {
        if (cls != null) {
            return this.b.get(cls);
        }
        throw new NullPointerException("Null interface requested.");
    }

    public void c(boolean z) {
        for (Map.Entry<d<?>, s<?>> entry : this.a.entrySet()) {
            d<?> key = entry.getKey();
            s<?> value = entry.getValue();
            if (key.g() || (key.h() && z)) {
                value.get();
            }
        }
        this.d.c();
    }

    public <T> t10<Set<T>> d(Class<T> cls) {
        s<Set<?>> sVar = this.c.get(cls);
        return sVar != null ? sVar : (t10<Set<T>>) e;
    }

    @Override // com.google.firebase.components.e
    public Object get(Class cls) {
        t10 b2 = b(cls);
        if (b2 == null) {
            return null;
        }
        return b2.get();
    }
}
