package com.spotify.music.libs.podcast.loader;

import android.text.TextUtils;
import com.google.common.collect.ImmutableSet;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SortOption;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class ShowUriBuilder {
    private static final ImmutableSet<String> m = ImmutableSet.of("addTime", "publishDate", "number", "rowId");
    private final String a;
    private String b;
    private boolean c;
    private boolean d;
    private boolean e;
    private SortOption f;
    private Integer g;
    private Integer h;
    private Integer i;
    private Integer j;
    private Format k;
    private boolean l;

    public enum Format {
        JSON,
        PROTOBUF
    }

    public ShowUriBuilder(String str) {
        Assertion.e(str);
        Object[] objArr = new Object[0];
        if (str.contains("?")) {
            Assertion.p(Logger.f("Base uri should not contain a question mark (?).", objArr));
        }
        this.a = str;
    }

    private static String a(SortOption sortOption) {
        SortOption e2 = sortOption.e();
        boolean f2 = sortOption.f();
        if (m.contains(sortOption.a())) {
            f2 = !f2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(sortOption.a());
        String str = "";
        sb.append(f2 ? " DESC" : str);
        if (e2 != null) {
            StringBuilder S0 = je.S0(',');
            S0.append(a(e2));
            str = S0.toString();
        }
        sb.append(str);
        return sb.toString();
    }

    private static StringBuilder d(StringBuilder sb, AtomicBoolean atomicBoolean) {
        sb.append(atomicBoolean.getAndSet(true) ? "," : "");
        return sb;
    }

    public ShowUriBuilder b(boolean z) {
        this.c = z;
        return this;
    }

    public Map<String, String> c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sort", "");
        SortOption sortOption = this.f;
        if (sortOption != null) {
            String a2 = a(sortOption);
            if (!TextUtils.isEmpty(a2)) {
                linkedHashMap.put("sort", a2);
            }
        }
        StringBuilder sb = new StringBuilder(128);
        h(sb, new AtomicBoolean());
        linkedHashMap.put("filter", sb.toString());
        Integer num = this.g;
        if (!(num == null || this.h == null)) {
            Locale locale = Locale.US;
            linkedHashMap.put("start", String.format(locale, "%d", num));
            linkedHashMap.put("length", String.format(locale, "%d", this.h));
        }
        Integer num2 = this.i;
        if (num2 != null) {
            linkedHashMap.put("updateThrottling", String.format(Locale.US, "%d", num2));
        }
        Format format = this.k;
        if (format != null) {
            linkedHashMap.put("responseFormat", String.format("%s", format.toString().toLowerCase(Locale.US)));
        }
        String str = this.b;
        if (str != null) {
            linkedHashMap.put("includeInRange", String.format("%s", str));
        }
        Integer num3 = this.j;
        if (num3 != null) {
            linkedHashMap.put("includeInRangeContext", String.format("%s", num3));
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public ShowUriBuilder e(boolean z) {
        this.d = z;
        return this;
    }

    public ShowUriBuilder f(String str) {
        this.b = str;
        return this;
    }

    public ShowUriBuilder g(Integer num) {
        this.j = num;
        return this;
    }

    public /* synthetic */ void h(StringBuilder sb, AtomicBoolean atomicBoolean) {
        d(sb, atomicBoolean);
        sb.append("available eq true");
        if (this.c) {
            d(sb, atomicBoolean);
            sb.append("availableOffline eq true");
        }
        if (this.d) {
            d(sb, atomicBoolean);
            sb.append("inCollection eq true");
        }
        if (this.e) {
            d(sb, atomicBoolean);
            sb.append("startedPlaying ne true");
            d(sb, atomicBoolean);
            sb.append("isPlayed ne true");
        }
        if (this.l) {
            d(sb, atomicBoolean);
            sb.append("videoEpisode eq false");
        }
    }

    public ShowUriBuilder i(boolean z) {
        this.e = z;
        return this;
    }

    public ShowUriBuilder j(Format format) {
        this.k = format;
        return this;
    }

    public ShowUriBuilder k(Integer num, Integer num2) {
        this.g = num;
        this.h = num2;
        return this;
    }

    public ShowUriBuilder l(String str) {
        Assertion.k(this.a.contains("<b62-show-id>"), "Base uri does not contain the show id placeholder.", new Object[0]);
        return this;
    }

    public ShowUriBuilder m(SortOption sortOption) {
        this.f = sortOption;
        return this;
    }

    public ShowUriBuilder n(int i2) {
        this.i = Integer.valueOf(i2);
        return this;
    }

    public ShowUriBuilder o(boolean z) {
        this.l = z;
        return this;
    }
}
