package defpackage;

import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Ordering;
import com.google.common.hash.Hashing;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* renamed from: mae  reason: default package */
public final class mae {
    private static final Comparator<a> a = Ordering.from(kae.a);
    private static final Comparator<a> b = Ordering.from(lae.a);
    public static final /* synthetic */ int c = 0;

    /* access modifiers changed from: private */
    /* renamed from: mae$a */
    public static class a implements Map.Entry<String, Object> {
        private final String a;
        private Object b;
        private char c;
        private int f;

        a(String str, Object obj) {
            this.a = str;
            this.b = obj;
        }

        public String f() {
            return this.a;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Map.Entry
        public String getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            this.b = obj;
            return obj;
        }
    }

    public static Map<String, Object> a(Map<String, Object> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            arrayList.add(new a(entry.getKey(), entry.getValue()));
        }
        Collections.sort(arrayList, a);
        StringBuilder sb = new StringBuilder(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append(((a) it.next()).b);
        }
        String hashCode = Hashing.md5().hashString(sb, Charsets.UTF_8).toString();
        for (int i = 0; i < arrayList.size(); i++) {
            a aVar = (a) arrayList.get(i);
            aVar.c = hashCode.charAt(i);
            aVar.f = i;
        }
        Collections.sort(arrayList, b);
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.putAll(arrayList);
        return builder.build();
    }
}
