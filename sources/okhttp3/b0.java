package okhttp3;

import okio.f;

/* access modifiers changed from: package-private */
public class b0 extends c0 {
    final /* synthetic */ w a;
    final /* synthetic */ int b;
    final /* synthetic */ byte[] c;
    final /* synthetic */ int d;

    b0(w wVar, int i, byte[] bArr, int i2) {
        this.a = wVar;
        this.b = i;
        this.c = bArr;
        this.d = i2;
    }

    @Override // okhttp3.c0
    public long a() {
        return (long) this.b;
    }

    @Override // okhttp3.c0
    public w b() {
        return this.a;
    }

    @Override // okhttp3.c0
    public void f(f fVar) {
        fVar.write(this.c, this.d, this.b);
    }
}
