package com.google.gson.internal;

import java.io.Writer;

/* access modifiers changed from: package-private */
public final class s extends Writer {
    private final Appendable a;
    private final a b = new a();

    static class a implements CharSequence {
        char[] a;

        a() {
        }

        @Override // java.lang.CharSequence
        public char charAt(int i) {
            return this.a[i];
        }

        @Override // java.lang.CharSequence
        public int length() {
            return this.a.length;
        }

        @Override // java.lang.CharSequence
        public CharSequence subSequence(int i, int i2) {
            return new String(this.a, i, i2 - i);
        }
    }

    s(Appendable appendable) {
        this.a = appendable;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        a aVar = this.b;
        aVar.a = cArr;
        this.a.append(aVar, i, i2 + i);
    }

    @Override // java.io.Writer
    public void write(int i) {
        this.a.append((char) i);
    }
}
