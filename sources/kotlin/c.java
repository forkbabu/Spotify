package kotlin;

import kotlin.jvm.internal.h;

public final class c implements Comparable<c> {
    public static final c n = new c(1, 4, 0);
    private final int a;
    private final int b;
    private final int c;
    private final int f;

    public c(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.f = i3;
        if (i >= 0 && 255 >= i && i2 >= 0 && 255 >= i2 && i3 >= 0 && 255 >= i3) {
            this.a = (i << 16) + (i2 << 8) + i3;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public int compareTo(c cVar) {
        c cVar2 = cVar;
        h.e(cVar2, "other");
        return this.a - cVar2.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            obj = null;
        }
        c cVar = (c) obj;
        if (cVar == null || this.a != cVar.a) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.a;
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: [(wrap: int : 0x0005: IGET  (r1v0 int) = (r3v0 'this' kotlin.c A[IMMUTABLE_TYPE, THIS]) kotlin.c.b int), ('.' char), (wrap: int : 0x000f: IGET  (r2v0 int) = (r3v0 'this' kotlin.c A[IMMUTABLE_TYPE, THIS]) kotlin.c.c int), ('.' char), (wrap: int : 0x0017: IGET  (r1v2 int) = (r3v0 'this' kotlin.c A[IMMUTABLE_TYPE, THIS]) kotlin.c.f int)] */
    @Override // java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append('.');
        sb.append(this.c);
        sb.append('.');
        sb.append(this.f);
        return sb.toString();
    }
}
