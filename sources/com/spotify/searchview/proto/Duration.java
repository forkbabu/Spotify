package com.spotify.searchview.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class Duration extends GeneratedMessageLite<Duration, b> implements Object {
    private static final Duration c;
    private static volatile x<Duration> f;
    private long a;
    private int b;

    public static final class b extends GeneratedMessageLite.b<Duration, b> implements Object {
        private b() {
            super(Duration.c);
        }
    }

    static {
        Duration duration = new Duration();
        c = duration;
        duration.makeImmutable();
    }

    private Duration() {
    }

    public static Duration h() {
        return c;
    }

    public static x<Duration> parser() {
        return c.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return c;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Duration duration = (Duration) obj2;
                long j = this.a;
                boolean z2 = j != 0;
                long j2 = duration.a;
                this.a = hVar.s(z2, j, j2 != 0, j2);
                int i = this.b;
                boolean z3 = i != 0;
                int i2 = duration.b;
                if (i2 != 0) {
                    z = true;
                }
                this.b = hVar.m(z3, i, z, i2);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.a = gVar.w();
                            } else if (B == 16) {
                                this.b = gVar.u();
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.d(this);
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                        invalidProtocolBufferException.d(this);
                        throw new RuntimeException(invalidProtocolBufferException);
                    }
                }
                break;
            case 3:
                return null;
            case 4:
                return new Duration();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (Duration.class) {
                        if (f == null) {
                            f = new GeneratedMessageLite.c(c);
                        }
                    }
                }
                return f;
            default:
                throw new UnsupportedOperationException();
        }
        return c;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        long j = this.a;
        if (j != 0) {
            i2 = 0 + CodedOutputStream.l(1, j);
        }
        int i3 = this.b;
        if (i3 != 0) {
            i2 += CodedOutputStream.j(2, i3);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public long i() {
        return this.a;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        long j = this.a;
        if (j != 0) {
            codedOutputStream.U(1, j);
        }
        int i = this.b;
        if (i != 0) {
            codedOutputStream.K(2, i);
        }
    }
}
