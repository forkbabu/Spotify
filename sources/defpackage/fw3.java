package defpackage;

import android.graphics.Color;

/* renamed from: fw3  reason: default package */
public class fw3 {
    private static final int e = Color.parseColor("#282828");
    private static final int f = Color.parseColor("#B3B3B3");
    private static final int g = Color.parseColor("#FFFFFF");
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public fw3(p81 p81) {
        int i = e;
        this.a = p81.intValue("background_start", i);
        this.b = p81.intValue("background_end", i);
        this.c = p81.intValue("title", f);
        this.d = p81.intValue("text", g);
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.c;
    }
}
