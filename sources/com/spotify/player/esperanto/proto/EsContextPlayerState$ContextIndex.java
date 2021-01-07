package com.spotify.player.esperanto.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class EsContextPlayerState$ContextIndex extends GeneratedMessageLite<EsContextPlayerState$ContextIndex, a> implements Object {
    private static final EsContextPlayerState$ContextIndex c;
    private static volatile x<EsContextPlayerState$ContextIndex> f;
    private long a;
    private long b;

    public static final class a extends GeneratedMessageLite.b<EsContextPlayerState$ContextIndex, a> implements Object {
        private a() {
            super(EsContextPlayerState$ContextIndex.c);
        }
    }

    static {
        EsContextPlayerState$ContextIndex esContextPlayerState$ContextIndex = new EsContextPlayerState$ContextIndex();
        c = esContextPlayerState$ContextIndex;
        esContextPlayerState$ContextIndex.makeImmutable();
    }

    private EsContextPlayerState$ContextIndex() {
    }

    public static EsContextPlayerState$ContextIndex h() {
        return c;
    }

    public static x<EsContextPlayerState$ContextIndex> parser() {
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
                EsContextPlayerState$ContextIndex esContextPlayerState$ContextIndex = (EsContextPlayerState$ContextIndex) obj2;
                long j = this.a;
                boolean z2 = j != 0;
                long j2 = esContextPlayerState$ContextIndex.a;
                this.a = hVar.s(z2, j, j2 != 0, j2);
                long j3 = this.b;
                boolean z3 = j3 != 0;
                long j4 = esContextPlayerState$ContextIndex.b;
                this.b = hVar.s(z3, j3, j4 != 0, j4);
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
                                this.b = gVar.w();
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
                return new EsContextPlayerState$ContextIndex();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (EsContextPlayerState$ContextIndex.class) {
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
            i2 = 0 + CodedOutputStream.u(1, j);
        }
        long j2 = this.b;
        if (j2 != 0) {
            i2 += CodedOutputStream.u(2, j2);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public long i() {
        return this.a;
    }

    public long l() {
        return this.b;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        long j = this.a;
        if (j != 0) {
            codedOutputStream.U(1, j);
        }
        long j2 = this.b;
        if (j2 != 0) {
            codedOutputStream.U(2, j2);
        }
    }
}
