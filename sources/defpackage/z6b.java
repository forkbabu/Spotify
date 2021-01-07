package defpackage;

import com.google.common.base.Optional;
import defpackage.c7b;

/* renamed from: z6b  reason: default package */
public final class z6b {
    private final y6b a;
    private final String b;
    private final b7b c;

    private z6b(b7b b7b, Optional<Integer> optional, String str, int i) {
        this.a = y6b.a(i);
        str.getClass();
        this.b = str;
        this.c = b7b;
    }

    public static z6b a(y6b y6b, String str, String str2) {
        return new z6b(y6b, str2, new w6b(str, new c7b.c()));
    }

    public static z6b b(b7b b7b, y6b y6b, String str) {
        return new z6b(y6b, str, b7b);
    }

    public static z6b c(b7b b7b, String str) {
        return new z6b(b7b, Optional.absent(), str, 4);
    }

    public String d() {
        return this.b;
    }

    public int e() {
        return this.a.d();
    }

    public int f() {
        return this.a.e();
    }

    public String g() {
        return this.c.a();
    }

    public b7b h() {
        return this.c;
    }

    public boolean i() {
        return !this.a.c().isPresent();
    }

    private z6b(y6b y6b, String str, b7b b7b) {
        y6b.getClass();
        this.a = y6b;
        str.getClass();
        this.b = str;
        this.c = b7b;
    }
}
