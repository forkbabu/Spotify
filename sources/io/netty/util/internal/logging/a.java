package io.netty.util.internal.logging;

class a {
    private final String a;
    private final Throwable b;
    private final Object[] c;

    a(String str, Object[] objArr, Throwable th) {
        this.a = str;
        this.b = th;
        if (th == null) {
            this.c = objArr;
        } else if (objArr == null || objArr.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        } else {
            int length = objArr.length - 1;
            Object[] objArr2 = new Object[length];
            System.arraycopy(objArr, 0, objArr2, 0, length);
            this.c = objArr2;
        }
    }

    public String a() {
        return this.a;
    }

    public Throwable b() {
        return this.b;
    }
}
