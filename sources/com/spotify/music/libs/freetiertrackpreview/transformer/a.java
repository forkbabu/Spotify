package com.spotify.music.libs.freetiertrackpreview.transformer;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class a implements w<b91, b91> {
    private final CollectionStateProvider a;
    private final String b;

    /* renamed from: com.spotify.music.libs.freetiertrackpreview.transformer.a$a  reason: collision with other inner class name */
    static final class C0286a<T1, T2, R> implements io.reactivex.functions.c<b91, Map<String, CollectionStateProvider.a>, b91> {
        final /* synthetic */ a a;

        C0286a(a aVar) {
            this.a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // io.reactivex.functions.c
        public b91 a(b91 b91, Map<String, CollectionStateProvider.a> map) {
            b91 b912 = b91;
            Map<String, CollectionStateProvider.a> map2 = map;
            h.e(b912, "hubsViewModel");
            h.e(map2, "collectionsState");
            return this.a.d(b912, map2);
        }
    }

    static final class b<T, R> implements l<b91, String[]> {
        final /* synthetic */ a a;

        b(a aVar) {
            this.a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public String[] apply(b91 b91) {
            b91 b912 = b91;
            h.e(b912, "it");
            return a.c(this.a, b912);
        }
    }

    static final class c<T, R> implements l<String[], v<? extends Map<String, CollectionStateProvider.a>>> {
        final /* synthetic */ a a;

        c(a aVar) {
            this.a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends Map<String, CollectionStateProvider.a>> apply(String[] strArr) {
            String[] strArr2 = strArr;
            h.e(strArr2, "it");
            return this.a.a.b(this.a.b, this.a.b, (String[]) Arrays.copyOf(strArr2, strArr2.length));
        }
    }

    public a(CollectionStateProvider collectionStateProvider, String str) {
        h.e(collectionStateProvider, "collectionStateProvider");
        h.e(str, "contextUri");
        this.a = collectionStateProvider;
        this.b = str;
    }

    public static final String[] c(a aVar, b91 b91) {
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (T t : b91.body()) {
            if (aVar.e(t)) {
                arrayList.add(t.metadata().string("uri", ""));
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    private final boolean e(s81 s81) {
        return je.C(s81, "consumerMobile:trackPreviewRowArtist") || je.C(s81, "consumerMobile:trackPreviewRowAlbum");
    }

    @Override // io.reactivex.w
    public v<b91> apply(s<b91> sVar) {
        h.e(sVar, "upstream");
        s n = s.n(sVar, sVar.j0(new b(this)).W(new c(this), false, Integer.MAX_VALUE), new C0286a(this));
        h.d(n, "Observable.combineLatest…ectionsState) }\n        )");
        return n;
    }

    public final b91 d(b91 b91, Map<String, ? extends CollectionStateProvider.a> map) {
        CollectionStateProvider.a aVar;
        h.e(b91, "hubsViewModel");
        h.e(map, "collectionsStateMap");
        List<? extends s81> body = b91.body();
        ArrayList arrayList = new ArrayList(d.e(body, 10));
        for (T t : body) {
            if (e(t) && (aVar = (CollectionStateProvider.a) map.get(t.metadata().string("uri", ""))) != null) {
                t = t.toBuilder().k("banned", Boolean.valueOf(aVar.a())).k("hearted", Boolean.valueOf(aVar.b())).l();
            }
            arrayList.add(t);
        }
        return je.L(b91, arrayList);
    }
}
