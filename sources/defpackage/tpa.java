package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.quotesharing.a;
import com.spotify.mobile.android.quotesharing.b;
import com.spotify.mobile.android.util.l0;
import com.spotify.playlist.models.m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.collections.d;
import kotlin.jvm.internal.h;
import kotlin.text.e;

/* renamed from: tpa  reason: default package */
/* compiled from: QuoteCardMapper.kt */
public final /* synthetic */ class tpa {
    public static List<b> a(ImmutableList<m> immutableList) {
        String str;
        a aVar;
        String str2;
        String str3;
        String str4;
        String str5;
        Map map;
        String str6;
        h.e(immutableList, "quotes");
        ArrayList arrayList = new ArrayList(d.e(immutableList, 10));
        for (T t : immutableList) {
            m.b b = t.b();
            m.c c = t.c();
            String a = t.a();
            String str7 = a != null ? a : "";
            long d = t.d();
            String a2 = b != null ? b.a() : null;
            if (a2 == null) {
                a2 = "";
            }
            String a3 = c != null ? c.a() : null;
            if (a3 != null) {
                str = a3;
            } else {
                str = "";
            }
            m.c c2 = t.c();
            if (c2 == null) {
                aVar = new a("", "", "", "", EmptyMap.a);
            } else {
                String B = l0.z(c2.a()).B();
                if (B != null) {
                    str2 = B;
                } else {
                    str2 = "";
                }
                if (c2.b() == null ? c2.d() == null || (str6 = c2.d()) == null : (str6 = c2.b()) == null) {
                    str3 = "";
                } else {
                    str3 = str6;
                }
                String c3 = c2.c();
                if (c3 != null) {
                    str4 = c3;
                } else {
                    str4 = "";
                }
                String a4 = c2.a();
                if (a4 != null) {
                    str5 = a4;
                } else {
                    str5 = "";
                }
                String a5 = c2.a();
                if (a5 == null || !e.c(a5, "quote_id", false, 2, null)) {
                    map = EmptyMap.a;
                } else {
                    String queryParameter = l0.z(a5).a.getQueryParameter("quote_id");
                    if (queryParameter == null || queryParameter.length() == 0) {
                        map = EmptyMap.a;
                    } else {
                        map = d.A(new Pair("quote_id", queryParameter));
                    }
                }
                aVar = new a(str2, str3, str4, str5, map);
            }
            arrayList.add(new b(str7, d, a2, str, aVar));
        }
        return d.Q(arrayList);
    }
}
