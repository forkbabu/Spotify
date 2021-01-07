package com.spotify.android.glue.components.trackcloud;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class a {
    private String a = "";
    private String b = "";
    private int c = 3;
    private List<C0145a> d = new ArrayList();
    private boolean e = true;
    private boolean f = false;
    private boolean g = false;
    private int h = 10;

    /* renamed from: com.spotify.android.glue.components.trackcloud.a$a  reason: collision with other inner class name */
    public static class C0145a {
        final String a;
        final String b;
        final boolean c;
        final boolean d;

        public C0145a(String str, String str2, boolean z, boolean z2) {
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = z2;
        }
    }

    private a() {
    }

    public static a a() {
        return new a();
    }

    public a b(String str) {
        this.b = str;
        return this;
    }

    public String c() {
        return this.b;
    }

    public boolean d() {
        return !TextUtils.isEmpty(this.a);
    }

    public int e() {
        return this.c;
    }

    public a f(int i) {
        this.c = i;
        return this;
    }

    public int g() {
        return this.h;
    }

    public a h(int i) {
        this.h = i;
        return this;
    }

    public a i(boolean z) {
        this.e = z;
        return this;
    }

    public boolean j() {
        return this.e;
    }

    public a k(boolean z) {
        this.f = z;
        return this;
    }

    public boolean l() {
        return this.f;
    }

    public a m(boolean z) {
        this.g = z;
        return this;
    }

    public boolean n() {
        return this.g;
    }

    public a o(String str) {
        this.a = str;
        return this;
    }

    public String p() {
        return this.a;
    }

    public a q(List<C0145a> list) {
        this.d = list;
        return this;
    }

    public List<C0145a> r() {
        return this.d;
    }

    public int s() {
        return this.d.size();
    }
}
