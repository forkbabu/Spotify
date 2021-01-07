package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: mq1  reason: default package */
public class mq1 {
    private static final byte[] i = new byte[0];
    private final byte[] a = new byte[200000];
    private final byte[] b = new byte[256];
    private final OutputStream c;
    private final ScheduledExecutorService d;
    private final Deque<byte[]> e = new ArrayDeque();
    private ScheduledFuture<?> f;
    private byte g;
    private final iq1 h;

    /* renamed from: mq1$a */
    class a implements Runnable {
        final /* synthetic */ byte a;

        a(byte b2) {
            this.a = b2;
        }

        @Override // java.lang.Runnable
        public void run() {
            ByteBuffer wrap = ByteBuffer.wrap(mq1.this.b);
            mq1.this.h.a(mq1.i, mq1.i.length, (byte) 1, this.a == 0 ? (byte) 1 : 0, wrap);
            wrap.array();
            wrap.position();
            try {
                mq1.this.c.write(wrap.array(), 0, wrap.position());
            } catch (IOException e) {
                mq1.k(mq1.this, e);
            }
        }
    }

    /* renamed from: mq1$b */
    class b implements Runnable {
        final /* synthetic */ byte a;

        b(byte b2) {
            this.a = b2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!mq1.d(mq1.this) || this.a == mq1.b(mq1.this)) {
                Logger.g("ACK ignored. Invalid sequence #. Last sent data had %s got %s", Integer.toHexString(mq1.this.g & 255), Integer.toHexString(this.a & 255));
                return;
            }
            mq1.this.s();
            mq1.e(mq1.this, this.a);
            mq1.m(mq1.this);
            Logger.b("ACK Accepted", new Object[0]);
        }
    }

    public mq1(OutputStream outputStream, ScheduledExecutorService scheduledExecutorService, iq1 iq1) {
        this.c = outputStream;
        this.d = scheduledExecutorService;
        this.h = iq1;
    }

    static byte b(mq1 mq1) {
        return mq1.g;
    }

    static boolean d(mq1 mq1) {
        return mq1.f != null;
    }

    static void e(mq1 mq1, byte b2) {
        mq1.g = b2;
    }

    static void k(mq1 mq1, IOException iOException) {
        mq1.getClass();
        Logger.c(iOException, "ProtocolFraming Error %s", iOException.getMessage());
    }

    static void m(mq1 mq1) {
        if (mq1.e.size() > 0) {
            byte[] removeLast = mq1.e.removeLast();
            mq1.q();
            mq1.u(removeLast.length, removeLast);
        }
    }

    private void q() {
        Logger.b("Queue size %d", Integer.valueOf(this.e.size()));
    }

    /* access modifiers changed from: private */
    public ScheduledFuture<?> r(Runnable runnable, long j) {
        if (!this.d.isShutdown()) {
            return this.d.schedule(runnable, j, TimeUnit.MILLISECONDS);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private synchronized void s() {
        ScheduledFuture<?> scheduledFuture = this.f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f = null;
        }
    }

    public void o() {
        s();
        try {
            this.c.close();
        } catch (IOException e2) {
            Logger.c(e2, "ProtocolFraming Error %s", e2.getMessage());
        }
        this.d.shutdown();
    }

    public synchronized void p(byte b2) {
        b bVar = new b(b2);
        if (!this.d.isShutdown()) {
            this.d.execute(bVar);
        }
    }

    public synchronized void t(byte b2) {
        r(new a(b2), 0);
    }

    public synchronized void u(int i2, byte[] bArr) {
        if (this.f != null) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            if (this.e.size() < 100) {
                this.e.addFirst(bArr2);
            } else {
                Assertion.g("Queue full");
            }
            q();
        } else {
            synchronized (this) {
                this.f = r(new lq1(this, bArr, i2), 0);
            }
        }
    }
}
