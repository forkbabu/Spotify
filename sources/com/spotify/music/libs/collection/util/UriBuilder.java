package com.spotify.music.libs.collection.util;

import android.net.Uri;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SortOption;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class UriBuilder {
    private static final ImmutableSet<String> v = ImmutableSet.of("addTime", "publishDate", "number", "rowId");
    private final String a;
    private String b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private ane k;
    private Integer l;
    private Integer m;
    private Integer n;
    private int o = -1;
    private int p = -1;
    private Format q;
    private final Set<String> r = new HashSet();
    private final Set<String> s = new HashSet();
    private final Set<String> t = new HashSet();
    private final Set<String> u = new HashSet();

    public enum Format {
        JSON,
        PROTOBUF
    }

    public UriBuilder(String str) {
        Assertion.e(str);
        Assertion.b("Base uri should not contain a question mark (?).", str.contains("?"));
        this.a = str;
    }

    private static String b(ane ane) {
        ane f2 = ane.f();
        boolean e2 = ane.e();
        if (v.contains(ane.c())) {
            e2 = !e2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Uri.encode(ane.c()));
        String str = "";
        sb.append(e2 ? " DESC" : str);
        if (f2 != null) {
            StringBuilder S0 = je.S0(',');
            S0.append(b(f2));
            str = S0.toString();
        }
        sb.append(str);
        return sb.toString();
    }

    private static StringBuilder f(StringBuilder sb, AtomicBoolean atomicBoolean) {
        sb.append(atomicBoolean.getAndSet(true) ? "," : "");
        return sb;
    }

    public UriBuilder a(String str) {
        this.s.add(str);
        return this;
    }

    public UriBuilder c(boolean z) {
        this.c = z;
        return this;
    }

    public UriBuilder d(boolean z) {
        this.g = z;
        return this;
    }

    public Map<String, String> e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        StringBuilder sb = new StringBuilder(128);
        k(sb, new AtomicBoolean());
        linkedHashMap.put("sort", sb.toString());
        StringBuilder sb2 = new StringBuilder(128);
        i(sb2, new AtomicBoolean());
        linkedHashMap.put("filter", sb2.toString());
        if (!this.t.isEmpty()) {
            StringBuilder sb3 = new StringBuilder(128);
            j(sb3, new AtomicBoolean());
            linkedHashMap.put("tracksFilter", sb3.toString());
        }
        Iterator<String> it = this.r.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            String[] split = it.next().split("=");
            String str2 = split[0];
            if (split.length > 1) {
                str = split[1];
            }
            linkedHashMap.put(str2, str);
        }
        if (this.j) {
            linkedHashMap.put("group", null);
            linkedHashMap.put("groupByFullField", "1");
        } else if (this.i) {
            linkedHashMap.put("group", null);
        }
        Integer num = this.l;
        if (!(num == null || this.m == null)) {
            Locale locale = Locale.US;
            linkedHashMap.put("start", String.format(locale, "%d", num));
            linkedHashMap.put("length", String.format(locale, "%d", this.m));
        }
        Integer num2 = this.n;
        if (num2 != null) {
            linkedHashMap.put("updateThrottling", String.format(Locale.US, "%d", num2));
        }
        Format format = this.q;
        if (format != null) {
            linkedHashMap.put("responseFormat", format.toString().toLowerCase(Locale.US));
        }
        if (!this.u.isEmpty()) {
            StringBuilder sb4 = new StringBuilder(128);
            l(sb4, new AtomicBoolean());
            linkedHashMap.put("excludedPaths", sb4.toString());
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public UriBuilder g(boolean z) {
        this.d = z;
        return this;
    }

    public UriBuilder h(boolean z) {
        this.e = z;
        return this;
    }

    public /* synthetic */ void i(StringBuilder sb, AtomicBoolean atomicBoolean) {
        if (!MoreObjects.isNullOrEmpty(this.b)) {
            String format = String.format(Locale.US, "text contains %s", Uri.encode(Uri.encode(this.b)));
            f(sb, atomicBoolean);
            sb.append(format);
        }
        if (this.c) {
            f(sb, atomicBoolean);
            sb.append("availableOffline eq true");
        }
        if (this.d) {
            f(sb, atomicBoolean);
            sb.append("complete eq true");
        }
        if (this.e) {
            f(sb, atomicBoolean);
            sb.append("inCollection eq true");
        }
        if (this.f) {
            f(sb, atomicBoolean);
            sb.append("startedPlaying ne true,isPlayed ne true");
        }
        if (this.g) {
            f(sb, atomicBoolean);
            sb.append("available eq true");
        }
        if (this.h) {
            f(sb, atomicBoolean);
            sb.append("hasValidLocalVersion eq true");
        }
        for (String str : this.s) {
            f(sb, atomicBoolean);
            sb.append(str);
        }
        if (this.o != -1) {
            f(sb, atomicBoolean);
            sb.append("mediaTypeEnum eq ");
            sb.append(this.o);
        }
        if (this.p != -1) {
            f(sb, atomicBoolean);
            sb.append("mediaTypeEnum ne ");
            sb.append(this.p);
        }
    }

    public /* synthetic */ void j(StringBuilder sb, AtomicBoolean atomicBoolean) {
        for (String str : this.t) {
            f(sb, atomicBoolean);
            sb.append(str);
        }
    }

    public /* synthetic */ void k(StringBuilder sb, AtomicBoolean atomicBoolean) {
        if (this.k != null) {
            f(sb, atomicBoolean);
            sb.append(b(this.k));
        }
        if (!MoreObjects.isNullOrEmpty(null)) {
            f(sb, atomicBoolean);
            sb.append(Uri.encode(null));
        }
    }

    public /* synthetic */ void l(StringBuilder sb, AtomicBoolean atomicBoolean) {
        for (String str : this.u) {
            f(sb, atomicBoolean);
            sb.append(Uri.encode(str));
        }
    }

    public UriBuilder m(boolean z) {
        this.h = z;
        return this;
    }

    public UriBuilder n(boolean z) {
        this.f = z;
        return this;
    }

    public UriBuilder o(Format format) {
        this.q = format;
        return this;
    }

    public UriBuilder p(String str) {
        Assertion.j("Base uri does not contain the album id placeholder.", this.a.contains("<b62-album-id>"));
        return this;
    }

    public UriBuilder q(int i2) {
        this.p = i2;
        return this;
    }

    public UriBuilder r(boolean z) {
        this.j = z;
        return this;
    }

    public UriBuilder s(boolean z) {
        this.i = z;
        return this;
    }

    public UriBuilder t(Integer num, Integer num2) {
        this.l = num;
        this.m = num2;
        return this;
    }

    public UriBuilder u(SortOption sortOption) {
        this.k = sortOption != null ? z42.F(sortOption) : null;
        return this;
    }

    public UriBuilder v(ane ane) {
        this.k = ane;
        return this;
    }

    public UriBuilder w(String str) {
        this.b = str;
        return this;
    }

    public UriBuilder x(int i2) {
        this.n = Integer.valueOf(i2);
        return this;
    }

    public UriBuilder y(String str) {
        Assertion.j("Base uri does not contain the username placeholder.", this.a.contains("<username>"));
        return this;
    }
}
