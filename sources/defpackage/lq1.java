package defpackage;

import com.spotify.base.java.logging.Logger;
import java.io.IOException;
import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
/* renamed from: lq1  reason: default package */
public class lq1 implements Runnable {
    private int a;
    final /* synthetic */ byte[] b;
    final /* synthetic */ int c;
    final /* synthetic */ mq1 f;

    lq1(mq1 mq1, byte[] bArr, int i) {
        this.f = mq1;
        this.b = bArr;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        ByteBuffer wrap = ByteBuffer.wrap(this.f.a);
        this.f.h.a(this.b, this.c, (byte) 0, mq1.b(this.f), wrap);
        if (this.a < 5) {
            try {
                wrap.array();
                wrap.position();
                this.f.c.write(wrap.array(), 0, wrap.position());
                this.a++;
                double d = (double) this.c;
                Double.isNaN(d);
                long max = Math.max(750L, Math.min(5000L, (long) ((d / 35000.0d) * 5000.0d)));
                mq1 mq1 = this.f;
                mq1.f = mq1.r(this, max);
                Logger.b("Adaptive timeout = %d", Long.valueOf(max));
            } catch (IOException e) {
                mq1.k(this.f, new IOException("Error sending data", e));
                this.f.s();
                mq1.m(this.f);
            }
        } else {
            mq1.k(this.f, new IOException("Message resent five times without being ACKed, giving up on this message"));
            this.f.s();
            mq1.m(this.f);
        }
    }
}
