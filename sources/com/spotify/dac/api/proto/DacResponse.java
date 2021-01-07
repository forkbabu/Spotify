package com.spotify.dac.api.proto;

import com.google.protobuf.Any;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class DacResponse extends GeneratedMessageLite<DacResponse, b> implements Object {
    private static final DacResponse b;
    private static volatile x<DacResponse> c;
    private Any a;

    public static final class b extends GeneratedMessageLite.b<DacResponse, b> implements Object {
        private b() {
            super(DacResponse.b);
        }
    }

    static {
        DacResponse dacResponse = new DacResponse();
        b = dacResponse;
        dacResponse.makeImmutable();
    }

    private DacResponse() {
    }

    public static x<DacResponse> parser() {
        return b.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return b;
            case 1:
                this.a = (Any) ((GeneratedMessageLite.h) obj).i(this.a, ((DacResponse) obj2).a);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                Any any = this.a;
                                Any.b bVar = any != null ? (Any.b) any.toBuilder() : null;
                                Any any2 = (Any) gVar.o(Any.parser(), kVar);
                                this.a = any2;
                                if (bVar != null) {
                                    bVar.mergeFrom((Any.b) any2);
                                    this.a = (Any) bVar.buildPartial();
                                }
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
                return new DacResponse();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (c == null) {
                    synchronized (DacResponse.class) {
                        if (c == null) {
                            c = new GeneratedMessageLite.c(b);
                        }
                    }
                }
                return c;
            default:
                throw new UnsupportedOperationException();
        }
        return b;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.a != null) {
            i2 = 0 + CodedOutputStream.n(1, h());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public Any h() {
        Any any = this.a;
        return any == null ? Any.h() : any;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a != null) {
            codedOutputStream.M(1, h());
        }
    }
}
