package defpackage;

import android.text.TextUtils;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: s8  reason: default package */
class s8 implements Comparable<s8> {
    static final s8 o;
    static final s8 p;
    private final int a;
    private final int b;
    private final int c;
    private final String f;
    private BigInteger n;

    static {
        s8 s8Var = new s8(1, 0, 0, "");
        o = s8Var;
        p = s8Var;
    }

    private s8(int i, int i2, int i3, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.f = str;
    }

    static s8 g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        return new s8(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)), matcher.group(4) != null ? matcher.group(4) : "");
    }

    private BigInteger h() {
        if (this.n == null) {
            this.n = BigInteger.valueOf((long) this.a).shiftLeft(32).or(BigInteger.valueOf((long) this.b)).shiftLeft(32).or(BigInteger.valueOf((long) this.c));
        }
        return this.n;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public int compareTo(s8 s8Var) {
        return h().compareTo(s8Var.h());
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (!(obj instanceof s8)) {
            return false;
        }
        s8 s8Var = (s8) obj;
        if (this.a == s8Var.a && this.b == s8Var.b && this.c == s8Var.c) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((527 + this.a) * 31) + this.b) * 31) + this.c;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder(this.a);
        sb.append(".");
        sb.append(this.b);
        sb.append(".");
        sb.append(this.c);
        if (!TextUtils.isEmpty(this.f)) {
            sb.append("-");
            sb.append(this.f);
        }
        return sb.toString();
    }
}
