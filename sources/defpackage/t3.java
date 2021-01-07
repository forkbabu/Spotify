package defpackage;

import java.io.Writer;

@Deprecated
/* renamed from: t3  reason: default package */
public class t3 extends Writer {
    private final String a;
    private StringBuilder b = new StringBuilder(128);

    public t3(String str) {
        this.a = str;
    }

    private void a() {
        if (this.b.length() > 0) {
            this.b.toString();
            StringBuilder sb = this.b;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                a();
            } else {
                this.b.append(c);
            }
        }
    }
}
