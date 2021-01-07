package com.spotify.android.dac.engine.view.binders.containers.list;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.google.protobuf.Any;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class b extends v<Any, a> {
    private final Map<String, Integer> n = new LinkedHashMap();
    private final Map<Integer, Integer> o = new LinkedHashMap();
    private final Map<Integer, String> p = new LinkedHashMap();
    private final Map<Integer, String> q = new LinkedHashMap();
    private final Map<Integer, Any> r = new LinkedHashMap();
    private final wlf<s80> s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(wlf<s80> wlf) {
        super(c.a());
        h.e(wlf, "dacResolverProvider");
        this.s = wlf;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        a aVar = (a) b0Var;
        h.e(aVar, "holder");
        Object Y = Y(i);
        h.d(Y, "getItem(position)");
        aVar.h0((Any) Y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        h.e(viewGroup, "parent");
        Any any = this.r.get(Integer.valueOf(i));
        h.c(any);
        t80 a = this.s.get().a(any);
        return new a(a.b(viewGroup, false), a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void Q(RecyclerView.b0 b0Var) {
        a aVar = (a) b0Var;
        h.e(aVar, "holder");
        aVar.j0();
    }

    @Override // androidx.recyclerview.widget.v
    public void b0(List<Any> list) {
        this.p.clear();
        this.o.clear();
        this.q.clear();
        this.r.clear();
        this.n.clear();
        if (list != null) {
            int i = 0;
            int i2 = 0;
            for (T t : list) {
                int i3 = i + 1;
                if (i >= 0) {
                    T t2 = t;
                    if (!this.n.containsKey(t2.i())) {
                        Map<String, Integer> map = this.n;
                        String i4 = t2.i();
                        h.d(i4, "protoItem.typeUrl");
                        map.put(i4, Integer.valueOf(i2));
                        Map<Integer, String> map2 = this.q;
                        Integer valueOf = Integer.valueOf(i2);
                        String i5 = t2.i();
                        h.d(i5, "protoItem.typeUrl");
                        map2.put(valueOf, i5);
                        this.r.put(Integer.valueOf(i2), t2);
                        i2++;
                    }
                    Map<Integer, String> map3 = this.p;
                    Integer valueOf2 = Integer.valueOf(i);
                    String i6 = t2.i();
                    h.d(i6, "protoItem.typeUrl");
                    map3.put(valueOf2, i6);
                    Map<Integer, Integer> map4 = this.o;
                    Integer valueOf3 = Integer.valueOf(i);
                    Integer num = this.n.get(t2.i());
                    h.c(num);
                    map4.put(valueOf3, num);
                    i = i3;
                } else {
                    d.L();
                    throw null;
                }
            }
        }
        super.b0(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        Integer num = this.o.get(Integer.valueOf(i));
        return num != null ? num.intValue() : i;
    }
}
