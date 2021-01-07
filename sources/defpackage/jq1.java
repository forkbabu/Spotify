package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import defpackage.iq1;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* renamed from: jq1  reason: default package */
public class jq1 {
    private final iq1 a;
    private final DataInputStream b;
    private final Executor c;
    private final byte[] d = new byte[10000];
    private kq1 e;
    private volatile boolean f;
    private final Runnable g = new a();

    /* renamed from: jq1$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!jq1.this.f) {
                try {
                    jq1.b(jq1.this);
                } catch (EOFException e) {
                    jq1 jq1 = jq1.this;
                    IOException iOException = new IOException("EoF detected, session will close", e);
                    jq1.getClass();
                    Logger.c(iOException, "ProtocolFraming Error %s", iOException.getMessage());
                    jq1.this.e();
                    return;
                } catch (IOException e2) {
                    jq1.this.getClass();
                    Logger.c(e2, "ProtocolFraming Error %s", e2.getMessage());
                } catch (Exception e3) {
                    jq1.this.getClass();
                    Assertion.i("ProtocolFraming Error", e3);
                }
                if (!jq1.this.f) {
                    jq1.this.c.execute(jq1.this.g);
                }
            }
        }
    }

    public jq1(InputStream inputStream, Executor executor, iq1 iq1) {
        this.b = new DataInputStream(inputStream);
        this.c = executor;
        this.a = iq1;
    }

    static void b(jq1 jq1) {
        ByteBuffer wrap = ByteBuffer.wrap(jq1.d);
        iq1 iq1 = jq1.a;
        DataInputStream dataInputStream = jq1.b;
        iq1.getClass();
        hq1 hq1 = new hq1();
        try {
            for (byte readByte = dataInputStream.readByte(); readByte != 126; readByte = dataInputStream.readByte()) {
            }
            byte readByte2 = dataInputStream.readByte();
            hq1.a(readByte2);
            byte readByte3 = dataInputStream.readByte();
            hq1.a(readByte3);
            int i = 0;
            while (true) {
                byte readByte4 = dataInputStream.readByte();
                if (readByte4 == 124) {
                    break;
                }
                if (readByte4 == 125) {
                    readByte4 = (byte) (dataInputStream.readByte() + 32);
                }
                if (i < 4) {
                    hq1.a(readByte4);
                } else {
                    if (wrap.position() > 1) {
                        hq1.a(wrap.get(wrap.position() - 2));
                    }
                    wrap.put(readByte4);
                }
                i++;
            }
            short s = wrap.getShort(wrap.position() - 2);
            short b2 = hq1.b();
            if (b2 == s) {
                wrap.position(wrap.position() - 2);
                iq1.a aVar = new iq1.a(readByte2, readByte3);
                if (aVar.b() == 0) {
                    wrap.array();
                    wrap.position();
                    byte a2 = aVar.a();
                    if (jq1.e != null) {
                        ByteBuffer allocate = ByteBuffer.allocate(wrap.position());
                        allocate.put(jq1.d, 0, allocate.limit());
                        ((nq1) jq1.e).d(a2, allocate.array());
                    }
                } else if (aVar.b() == 1) {
                    wrap.array();
                    wrap.position();
                    byte a3 = aVar.a();
                    kq1 kq1 = jq1.e;
                    if (kq1 != null) {
                        ((nq1) kq1).c(a3);
                    }
                } else {
                    Logger.b("Unexpected type", new Object[0]);
                }
            } else {
                StringBuilder V0 = je.V0("Wrong checksum. calculated = ");
                V0.append(Integer.toHexString(b2));
                V0.append(" received = ");
                V0.append(Integer.toHexString(s));
                throw new IOException(V0.toString());
            }
        } catch (IOException e2) {
            EOFException eOFException = new EOFException("IO exception while waiting for start byte");
            eOFException.initCause(e2);
            throw eOFException;
        }
    }

    public void e() {
        this.f = true;
        try {
            this.b.close();
        } catch (IOException e2) {
            Logger.c(e2, "ProtocolFraming Error %s", e2.getMessage());
        }
    }

    public void f(kq1 kq1) {
        this.e = kq1;
    }

    public void g() {
        this.c.execute(this.g);
    }
}
