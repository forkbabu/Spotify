package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.internal.http2.e;

/* access modifiers changed from: package-private */
public class f extends qnf {
    final /* synthetic */ j b;
    final /* synthetic */ e.l c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    f(e.l lVar, String str, Object[] objArr, j jVar) {
        super(str, objArr);
        this.c = lVar;
        this.b = jVar;
    }

    @Override // defpackage.qnf
    public void a() {
        try {
            e.this.b.b(this.b);
        } catch (IOException e) {
            sof h = sof.h();
            StringBuilder V0 = je.V0("Http2Connection.Listener failure for ");
            V0.append(e.this.f);
            h.m(4, V0.toString(), e);
            try {
                this.b.d(ErrorCode.PROTOCOL_ERROR);
            } catch (IOException unused) {
            }
        }
    }
}
