package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.drm.l;
import com.google.android.exoplayer2.offline.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class e extends g {
    public static final e n = new e("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());
    public final List<Uri> d;
    public final List<b> e;
    public final List<a> f;
    public final List<a> g;
    public final List<a> h;
    public final List<a> i;
    public final d0 j;
    public final List<d0> k;
    public final Map<String, String> l;
    public final List<l> m;

    public static final class a {
        public final Uri a;
        public final d0 b;
        public final String c;

        public a(Uri uri, d0 d0Var, String str, String str2) {
            this.a = uri;
            this.b = d0Var;
            this.c = str2;
        }
    }

    public static final class b {
        public final Uri a;
        public final d0 b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public b(Uri uri, d0 d0Var, String str, String str2, String str3, String str4) {
            this.a = uri;
            this.b = d0Var;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
        }
    }

    public e(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, d0 d0Var, List<d0> list7, boolean z, Map<String, String> map, List<l> list8) {
        super(str, list, z);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list2.size(); i2++) {
            Uri uri = list2.get(i2).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        b(list6, arrayList);
        this.d = Collections.unmodifiableList(arrayList);
        this.e = Collections.unmodifiableList(list2);
        this.f = Collections.unmodifiableList(list3);
        this.g = Collections.unmodifiableList(list4);
        this.h = Collections.unmodifiableList(list5);
        this.i = Collections.unmodifiableList(list6);
        this.j = d0Var;
        this.k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.l = Collections.unmodifiableMap(map);
        this.m = Collections.unmodifiableList(list8);
    }

    private static void b(List<a> list, List<Uri> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            Uri uri = list.get(i2).a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    private static <T> List<T> c(List<T> list, int i2, List<x> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            T t = list.get(i3);
            int i4 = 0;
            while (true) {
                if (i4 >= list2.size()) {
                    break;
                }
                x xVar = list2.get(i4);
                if (xVar.b == i2 && xVar.c == i3) {
                    arrayList.add(t);
                    break;
                }
                i4++;
            }
        }
        return arrayList;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.exoplayer2.offline.t
    public g a(List list) {
        return new e(this.a, this.b, c(this.e, 0, list), Collections.emptyList(), c(this.g, 1, list), c(this.h, 2, list), Collections.emptyList(), this.j, this.k, this.c, this.l, this.m);
    }
}
