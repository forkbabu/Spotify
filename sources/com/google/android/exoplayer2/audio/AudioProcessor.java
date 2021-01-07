package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.f0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public interface AudioProcessor {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class UnhandledAudioFormatException extends Exception {
        public UnhandledAudioFormatException(a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    public static final class a {
        public static final a e = new a(-1, -1, -1);
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = f0.B(i3) ? f0.t(i3, i2) : -1;
        }

        public String toString() {
            StringBuilder V0 = je.V0("AudioFormat[sampleRate=");
            V0.append(this.a);
            V0.append(", channelCount=");
            V0.append(this.b);
            V0.append(", encoding=");
            return je.A0(V0, this.c, ']');
        }
    }

    ByteBuffer a();

    boolean b();

    void c(ByteBuffer byteBuffer);

    a d(a aVar);

    void e();

    void flush();

    boolean isActive();

    void reset();
}
