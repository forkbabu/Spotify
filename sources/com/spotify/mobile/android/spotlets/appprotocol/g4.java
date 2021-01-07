package com.spotify.mobile.android.spotlets.appprotocol;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.u3;
import com.spotify.mobile.android.util.Assertion;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

public class g4 implements u3, Closeable {
    private final InputStream a;
    private final OutputStream b;
    private final ExecutorService c;
    private u3.a f;
    private volatile boolean n;
    private final Runnable o = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g4.d(g4.this);
            if (!g4.this.n) {
                g4.this.c.execute(g4.this.o);
            }
        }
    }

    public g4(InputStream inputStream, OutputStream outputStream, ExecutorService executorService) {
        this.a = inputStream;
        this.b = outputStream;
        this.c = executorService;
    }

    static void d(g4 g4Var) {
        g4Var.getClass();
        DataInputStream dataInputStream = new DataInputStream(g4Var.a);
        try {
            int readInt = dataInputStream.readInt();
            if (readInt < 0 || readInt > 120000) {
                g4Var.i(dataInputStream);
                throw null;
            }
            byte[] bArr = new byte[readInt];
            dataInputStream.readFully(bArr);
            u3.a aVar = g4Var.f;
            if (aVar != null) {
                ((i4) aVar).p(readInt, bArr);
            }
        } catch (Exception e) {
            g4Var.n = true;
            Logger.o(e, e.getMessage(), new Object[0]);
        }
    }

    private void i(DataInputStream dataInputStream) {
        String str;
        int min = Math.min(dataInputStream.available(), 100);
        byte[] bArr = new byte[min];
        dataInputStream.readFully(bArr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < min; i++) {
            int i2 = bArr[i] & 255;
            if (i2 < 32 || i2 > 126) {
                char[] charArray = "0123456789abcdef".toCharArray();
                StringBuilder V0 = je.V0(" 0x");
                V0.append(charArray[i2 >>> 4]);
                V0.append(charArray[i2 & 15]);
                V0.append(' ');
                str = V0.toString();
            } else {
                str = Character.toString((char) i2);
            }
            sb.append(str);
        }
        Assertion.g(String.format("Invalid data on input stream: %s", sb.toString()));
        throw new IOException("Invalid data on input stream");
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.u3
    public void a(u3.a aVar) {
        this.f = aVar;
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.u3
    public void b(int i, byte[] bArr) {
        DataOutputStream dataOutputStream = new DataOutputStream(this.b);
        try {
            Logger.l("AppProtocolSessionIo.writeBytes", new Object[0]);
            ByteBuffer allocate = ByteBuffer.allocate(i + 4);
            allocate.putInt(i);
            allocate.put(bArr, 0, i);
            dataOutputStream.write(allocate.array());
        } catch (IOException e) {
            this.n = true;
            Logger.o(e, e.getMessage(), new Object[0]);
        }
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.u3
    public void close() {
        this.n = true;
        try {
            this.a.close();
            this.b.close();
        } catch (IOException e) {
            Assertion.i("Failed to close session io", e);
        }
        this.c.shutdown();
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.u3
    public void start() {
        try {
            this.c.execute(this.o);
        } catch (RejectedExecutionException e) {
            Logger.e(e, "Failed to execute runnable on ExecutorService", new Object[0]);
        }
    }
}
