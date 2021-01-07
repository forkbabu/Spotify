package com.google.android.exoplayer2.util;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

public final class y extends BufferedOutputStream {
    private boolean a;

    public y(OutputStream outputStream) {
        super(outputStream);
    }

    public void a(OutputStream outputStream) {
        g.m(this.a);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.a = false;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
    public void close() {
        Throwable th;
        this.a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        if (th != null) {
            int i = f0.a;
            throw th;
        }
    }

    public y(OutputStream outputStream, int i) {
        super(outputStream, i);
    }
}
