package com.airbnb.lottie.model;

import com.airbnb.lottie.model.content.j;
import java.util.List;

public class c {
    private final List<j> a;
    private final char b;
    private final double c;
    private final String d;
    private final String e;

    public c(List<j> list, char c2, double d2, double d3, String str, String str2) {
        this.a = list;
        this.b = c2;
        this.c = d3;
        this.d = str;
        this.e = str2;
    }

    public static int c(char c2, String str, String str2) {
        return str2.hashCode() + je.Y0(str, (c2 + 0) * 31, 31);
    }

    public List<j> a() {
        return this.a;
    }

    public double b() {
        return this.c;
    }

    public int hashCode() {
        return c(this.b, this.e, this.d);
    }
}
