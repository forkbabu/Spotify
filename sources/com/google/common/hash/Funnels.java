package com.google.common.hash;

import java.io.OutputStream;

public final class Funnels {

    /* access modifiers changed from: private */
    public static class SinkAsStream extends OutputStream {
        final PrimitiveSink sink;

        SinkAsStream(PrimitiveSink primitiveSink) {
            primitiveSink.getClass();
            this.sink = primitiveSink;
        }

        @Override // java.lang.Object
        public String toString() {
            StringBuilder V0 = je.V0("Funnels.asOutputStream(");
            V0.append(this.sink);
            V0.append(")");
            return V0.toString();
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            this.sink.mo78putByte((byte) i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            this.sink.mo81putBytes(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            this.sink.mo79putBytes(bArr, i, i2);
        }
    }

    public static OutputStream asOutputStream(PrimitiveSink primitiveSink) {
        return new SinkAsStream(primitiveSink);
    }
}
