package com.spotify.music.libs.assistedcuration.provider;

import android.os.Parcel;
import com.google.common.collect.Collections2;
import com.spotify.music.libs.assistedcuration.model.e;
import com.spotify.music.libs.assistedcuration.model.h;
import com.spotify.music.libs.assistedcuration.provider.x;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;
import io.reactivex.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class y<T extends x<T>> {
    private final a<T> a;
    private final io.reactivex.subjects.a<CardAction> b = io.reactivex.subjects.a.h1();
    private Map<String, T> c = Collections.synchronizedMap(new LinkedHashMap());
    private CardAction d = CardAction.h();

    public interface a<T> {
        s<Map<String, T>> a(Set<String> set, String str);

        h b(T t, boolean z);

        s<Map<String, T>> c(e eVar, Set<String> set);

        s<T> d(e eVar, Set<String> set, T t);

        s<T> e(T t);
    }

    y(a<T> aVar) {
        this.a = aVar;
    }

    /* access modifiers changed from: package-private */
    public void a(e eVar, Set<String> set) {
        this.b.onNext(CardAction.a(eVar, set));
    }

    /* access modifiers changed from: package-private */
    public void b(String str, Set<String> set) {
        this.b.onNext(CardAction.b(str, set));
    }

    /* access modifiers changed from: package-private */
    public void c(String str, e eVar, Set<String> set) {
        this.b.onNext(CardAction.c(str, eVar, set));
    }

    public /* synthetic */ Map d(Map map, Map map2) {
        this.d = CardAction.i();
        map.putAll(map2);
        return map;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: com.spotify.music.libs.assistedcuration.provider.y$a<T extends com.spotify.music.libs.assistedcuration.provider.x<T>> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v8, resolved type: com.spotify.music.libs.assistedcuration.provider.y$a<T extends com.spotify.music.libs.assistedcuration.provider.x<T>> */
    /* JADX WARN: Multi-variable type inference failed */
    public v e(Set set, String str, CardAction cardAction) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.c);
        int ordinal = cardAction.d().ordinal();
        if (ordinal == 0) {
            return this.a.a(set, str).j0(new g(this, linkedHashMap));
        }
        if (ordinal == 1) {
            e f = cardAction.f();
            x xVar = (x) linkedHashMap.get(cardAction.e());
            xVar.h(f);
            return this.a.d(f, cardAction.g(), xVar).j0(new e(linkedHashMap, cardAction));
        } else if (ordinal == 2) {
            return this.a.e(linkedHashMap.get(cardAction.e())).j0(new c(linkedHashMap, cardAction));
        } else {
            if (ordinal == 3) {
                return this.a.c(cardAction.f(), cardAction.g()).j0(new b(linkedHashMap));
            }
            if (ordinal == 4) {
                return s.B(new f(linkedHashMap, cardAction));
            }
            if (ordinal != 5) {
                return o.a;
            }
            return s.i0(linkedHashMap);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: com.spotify.music.libs.assistedcuration.provider.y$a<T extends com.spotify.music.libs.assistedcuration.provider.x<T>> */
    /* JADX WARN: Multi-variable type inference failed */
    public List f(Set set, Map map) {
        this.c = Collections.synchronizedMap(map);
        ArrayList arrayList = new ArrayList();
        ArrayList newArrayList = Collections2.newArrayList(map.keySet());
        int size = newArrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return arrayList;
            }
            x xVar = (x) map.get(newArrayList.get(size));
            if (xVar != null && !xVar.e().isEmpty()) {
                arrayList.add(this.a.b(xVar, !set.isEmpty()));
            }
        }
    }

    public s<List<h>> g(Set<String> set, String str) {
        return this.b.G0(this.d).w(new d(this, set, str)).j0(new a(this, set));
    }

    /* access modifiers changed from: package-private */
    public void h(Set<String> set) {
        this.b.onNext(CardAction.j(set));
    }

    /* access modifiers changed from: package-private */
    public void i(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        obtain.readMap(this.c, y.class.getClassLoader());
        obtain.recycle();
        if (!this.c.isEmpty()) {
            this.d = CardAction.i();
        }
    }

    /* access modifiers changed from: package-private */
    public byte[] j() {
        return k(this.c.size());
    }

    /* access modifiers changed from: package-private */
    public byte[] k(int i) {
        Parcel obtain = Parcel.obtain();
        if (i < this.c.size()) {
            Map<String, T> map = this.c;
            Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
            ArrayList newArrayList = Collections2.newArrayList(map.keySet());
            for (int size = newArrayList.size() - i; size < newArrayList.size(); size++) {
                String str = (String) newArrayList.get(size);
                synchronizedMap.put(str, map.get(str));
            }
            obtain.writeMap(synchronizedMap);
        } else {
            obtain.writeMap(this.c);
        }
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
