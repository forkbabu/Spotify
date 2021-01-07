package com.spotify.contexts;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class MonotonicClock extends GeneratedMessageLite<MonotonicClock, b> implements Object {
    private static final MonotonicClock f;
    private static volatile x<MonotonicClock> n;
    private int a;
    private long b;
    private long c;

    public static final class b extends GeneratedMessageLite.b<MonotonicClock, b> implements Object {
        public b m(long j) {
            copyOnWrite();
            MonotonicClock.h((MonotonicClock) this.instance, j);
            return this;
        }

        public b n(long j) {
            copyOnWrite();
            MonotonicClock.i((MonotonicClock) this.instance, j);
            return this;
        }

        private b() {
            super(MonotonicClock.f);
        }
    }

    static {
        MonotonicClock monotonicClock = new MonotonicClock();
        f = monotonicClock;
        monotonicClock.makeImmutable();
    }

    private MonotonicClock() {
    }

    static void h(MonotonicClock monotonicClock, long j) {
        monotonicClock.a |= 1;
        monotonicClock.b = j;
    }

    static void i(MonotonicClock monotonicClock, long j) {
        monotonicClock.a |= 2;
        monotonicClock.c = j;
    }

    public static b l() {
        return (b) f.toBuilder();
    }

    public static x<MonotonicClock> parser() {
        return f.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return f;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                MonotonicClock monotonicClock = (MonotonicClock) obj2;
                this.b = hVar.s((this.a & 1) == 1, this.b, (monotonicClock.a & 1) == 1, monotonicClock.b);
                this.c = hVar.s((this.a & 2) == 2, this.c, (monotonicClock.a & 2) == 2, monotonicClock.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= monotonicClock.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.a |= 1;
                                this.b = gVar.w();
                            } else if (B == 16) {
                                this.a |= 2;
                                this.c = gVar.w();
                            } else if (!parseUnknownField(B, gVar)) {
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
                return new MonotonicClock();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (MonotonicClock.class) {
                        if (n == null) {
                            n = new GeneratedMessageLite.c(f);
                        }
                    }
                }
                return n;
            default:
                throw new UnsupportedOperationException();
        }
        return f;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.l(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.l(2, this.c);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.U(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.U(2, this.c);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
