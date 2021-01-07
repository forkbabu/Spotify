package com.spotify.connect.snacks;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.player.model.Context;
import io.reactivex.functions.l;
import io.reactivex.functions.n;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.d;
import kotlin.jvm.internal.h;
import org.json.JSONObject;

public final class NewDevicesTransformer implements w<List<? extends a>, List<? extends a>> {
    private final SpSharedPreferences<Object> a;

    static final class a<T> implements n<List<List<? extends a>>> {
        final /* synthetic */ NewDevicesTransformer a;

        a(NewDevicesTransformer newDevicesTransformer) {
            this.a = newDevicesTransformer;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.n
        public boolean test(List<List<? extends a>> list) {
            T t;
            List<List<? extends a>> list2 = list;
            h.e(list2, Context.Metadata.SHUFFLE_ALGORITHM_HISTORY);
            NewDevicesTransformer newDevicesTransformer = this.a;
            List<? extends a> list3 = list2.get(1);
            h.d(list3, "history[1]");
            newDevicesTransformer.getClass();
            Iterator<T> it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (t.c()) {
                    break;
                }
            }
            if (t == null) {
                return true;
            }
            return false;
        }
    }

    static final class b<T, R> implements l<List<List<? extends a>>, List<? extends a>> {
        final /* synthetic */ NewDevicesTransformer a;

        b(NewDevicesTransformer newDevicesTransformer) {
            this.a = newDevicesTransformer;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public List<? extends a> apply(List<List<? extends a>> list) {
            List<List<? extends a>> list2 = list;
            h.e(list2, Context.Metadata.SHUFFLE_ALGORITHM_HISTORY);
            NewDevicesTransformer newDevicesTransformer = this.a;
            List<? extends a> list3 = list2.get(0);
            h.d(list3, "history[0]");
            List<? extends a> list4 = list3;
            List<? extends a> list5 = list2.get(1);
            h.d(list5, "history[1]");
            List<? extends a> list6 = list5;
            newDevicesTransformer.getClass();
            ArrayList arrayList = new ArrayList(d.e(list4, 10));
            Iterator<T> it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().b());
            }
            ArrayList arrayList2 = new ArrayList();
            for (T t : list6) {
                if (!arrayList.contains(t.b())) {
                    arrayList2.add(t);
                }
            }
            return arrayList2;
        }
    }

    static final class c<T> implements n<List<? extends a>> {
        public static final c a = new c();

        c() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.n
        public boolean test(List<? extends a> list) {
            List<? extends a> list2 = list;
            h.e(list2, "newDevices");
            return !list2.isEmpty();
        }
    }

    public NewDevicesTransformer(SpSharedPreferences<Object> spSharedPreferences) {
        h.e(spSharedPreferences, "preferences");
        this.a = spSharedPreferences;
    }

    public static final void a(NewDevicesTransformer newDevicesTransformer, List list) {
        newDevicesTransformer.getClass();
        JSONObject jSONObject = new JSONObject();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            jSONObject.put(aVar.b(), aVar.a());
        }
        SpSharedPreferences.a<Object> b2 = newDevicesTransformer.a.b();
        b2.d(k.a(), jSONObject);
        b2.i();
    }

    /* Return type fixed from 'io.reactivex.v<java.util.List<com.spotify.connect.snacks.a>>' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.reactivex.s<java.util.List<com.spotify.connect.snacks.a>>] */
    @Override // io.reactivex.w
    public v<List<? extends a>> apply(s<List<? extends a>> sVar) {
        List<? extends a> list;
        h.e(sVar, "upstream");
        s<List<? extends a>> N = sVar.N(new j(new NewDevicesTransformer$apply$1(this)));
        if (this.a.a(k.a())) {
            JSONObject h = this.a.h(k.a());
            ArrayList arrayList = new ArrayList();
            Iterator<String> keys = h.keys();
            h.d(keys, "jsonDevices.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                h.d(next, "name");
                String string = h.getString(next);
                h.d(string, "jsonDevices.getString(name)");
                arrayList.add(new a(next, string, false));
            }
            list = d.Q(arrayList);
        } else {
            list = EmptyList.a;
        }
        s<R> Q = N.G0(list).e(2, 1).Q(new a(this)).j0(new b(this)).Q(c.a);
        h.d(Q, "upstream\n               …newDevices.isNotEmpty() }");
        return Q;
    }
}
