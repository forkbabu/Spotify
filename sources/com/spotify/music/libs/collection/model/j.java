package com.spotify.music.libs.collection.model;

import com.adjust.sdk.Constants;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.libs.collection.util.UriBuilder;

public class j {
    private SortOption a;
    private boolean b;
    private boolean c;
    private Integer d;
    private Integer e;
    private boolean f;
    private String g;
    private ImmutableList<String> h;
    private boolean i;

    public UriBuilder a() {
        UriBuilder uriBuilder = new UriBuilder("");
        uriBuilder.u(this.a);
        uriBuilder.h(this.c);
        uriBuilder.c(this.b);
        uriBuilder.d(this.i);
        boolean z = false;
        uriBuilder.m(false);
        uriBuilder.n(this.f);
        uriBuilder.w(this.g);
        ImmutableList<String> immutableList = this.h;
        if (immutableList != null && !immutableList.isEmpty()) {
            z = true;
        }
        if (z) {
            UnmodifiableListIterator<String> listIterator = this.h.listIterator();
            while (listIterator.hasNext()) {
                uriBuilder.a(listIterator.next());
            }
        }
        return uriBuilder;
    }

    public UriBuilder b() {
        UriBuilder uriBuilder = new UriBuilder("");
        uriBuilder.x(Constants.ONE_SECOND);
        uriBuilder.u(this.a);
        uriBuilder.h(this.c);
        uriBuilder.c(this.b);
        boolean z = false;
        uriBuilder.m(false);
        uriBuilder.t(this.d, this.e);
        uriBuilder.n(this.f);
        uriBuilder.w(this.g);
        uriBuilder.r(false);
        uriBuilder.o(UriBuilder.Format.PROTOBUF);
        ImmutableList<String> immutableList = this.h;
        if (immutableList != null && !immutableList.isEmpty()) {
            z = true;
        }
        if (z) {
            UnmodifiableListIterator<String> listIterator = this.h.listIterator();
            while (listIterator.hasNext()) {
                uriBuilder.a(listIterator.next());
            }
        }
        return uriBuilder;
    }

    public void c(boolean z) {
        this.i = z;
    }

    public void d(boolean z, boolean z2, boolean z3) {
        this.c = z;
        this.b = z2;
        this.f = z3;
    }

    public void e(ImmutableList<String> immutableList) {
        this.h = immutableList;
    }

    public void f(Integer num, Integer num2) {
        this.d = num;
        this.e = num2;
    }

    public void g(SortOption sortOption) {
        this.a = sortOption;
    }

    public void h(ane ane) {
        this.a = z42.E(ane);
    }

    public void i(String str) {
        this.g = str;
    }
}
