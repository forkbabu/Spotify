package com.spotify.playlist.endpoints;

import android.net.Uri;
import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.endpoints.p;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;

public final class o {
    private static final <T> void a(String str, List<String> list, String str2, T t) {
        if (t != null) {
            list.add(str2 + ' ' + str + ' ' + ((Object) t));
        }
    }

    private static final void b(Map<String, String> map, String str, boolean z) {
        map.put(str, String.valueOf(z));
    }

    public static final Map<String, String> c(d.b bVar, boolean z) {
        h.e(bVar, "configuration");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("updateThrottling", String.valueOf(bVar.q()));
        linkedHashMap.put("responseFormat", "protobuf");
        ane n = bVar.n();
        linkedHashMap.put("sort", n != null ? bne.b(n) : "");
        ArrayList arrayList = new ArrayList();
        a("eq", arrayList, "availableOffline", bVar.a());
        a("eq", arrayList, "isBanned", bVar.g());
        a("eq", arrayList, "isExplicit", bVar.h());
        a("eq", arrayList, "artist.isBanned", bVar.f());
        a("lt", arrayList, "originalIndex", bVar.j());
        String o = bVar.o();
        if (o.length() > 0) {
            StringBuilder V0 = je.V0("text contains ");
            V0.append(Uri.encode(Uri.encode(o)));
            arrayList.add(V0.toString());
        }
        linkedHashMap.put("filter", kotlin.collections.d.p(arrayList, ",", null, null, 0, null, null, 62, null));
        Boolean m = bVar.m();
        if (m != null) {
            b(linkedHashMap, "showUnavailable", m.booleanValue());
        }
        b(linkedHashMap, "alwaysShowWindowed", z);
        if (!bVar.c()) {
            b(linkedHashMap, "includeEpisodes", false);
        }
        if (bVar.e()) {
            b(linkedHashMap, "loadRecommendations", true);
        }
        qxd l = bVar.l();
        if (l != null) {
            int a = l.a();
            int b = l.b();
            linkedHashMap.put("start", String.valueOf(a));
            linkedHashMap.put("length", String.valueOf(b));
        }
        return linkedHashMap;
    }

    public static final Map<String, String> d(p.a aVar) {
        h.e(aVar, "configuration");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("updateThrottling", String.valueOf(aVar.l()));
        linkedHashMap.put("responseFormat", "protobuf");
        ane i = aVar.i();
        linkedHashMap.put("sort", i != null ? bne.b(i) : "");
        ArrayList arrayList = new ArrayList();
        a("eq", arrayList, "availableOffline", aVar.a());
        a("eq", arrayList, "isWritable", aVar.e());
        String j = aVar.j();
        if (j.length() > 0) {
            StringBuilder V0 = je.V0("text contains ");
            V0.append(Uri.encode(Uri.encode(j)));
            arrayList.add(V0.toString());
        }
        linkedHashMap.put("filter", kotlin.collections.d.p(arrayList, ",", null, null, 0, null, null, 62, null));
        if (aVar.c()) {
            b(linkedHashMap, "flattenTree", true);
        }
        qxd h = aVar.h();
        if (h != null) {
            int a = h.a();
            int b = h.b();
            linkedHashMap.put("start", String.valueOf(a));
            linkedHashMap.put("length", String.valueOf(b));
        }
        return linkedHashMap;
    }
}
