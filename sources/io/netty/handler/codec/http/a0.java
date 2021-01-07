package io.netty.handler.codec.http;

public class a0 extends HttpObjectDecoder {
    private static final b0 E = new b0(999, "Unknown");

    public a0(int i, int i2, int i3, boolean z) {
        super(i, i2, i3, true, z);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.handler.codec.http.HttpObjectDecoder
    public t o() {
        return new c(d0.q, E, this.t);
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.handler.codec.http.HttpObjectDecoder
    public t q(String[] strArr) {
        d0 d0Var;
        String str = strArr[0];
        d0 d0Var2 = d0.q;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                if ("HTTP/1.1".equals(trim)) {
                    d0Var = d0.r;
                } else {
                    d0Var = "HTTP/1.0".equals(trim) ? d0.q : null;
                }
                if (d0Var == null) {
                    d0Var = new d0(trim, true);
                }
                return new i(d0Var, new b0(Integer.parseInt(strArr[1]), strArr[2]), this.t);
            }
            throw new IllegalArgumentException("text is empty");
        }
        throw new NullPointerException("text");
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.handler.codec.http.HttpObjectDecoder
    public boolean y() {
        return false;
    }
}
