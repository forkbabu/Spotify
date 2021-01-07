package com.spotify.rcs.resolver.grpc.v0;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.rcs.resolver.grpc.v0.Configuration;
import java.io.IOException;

public final class ResolveResponse extends GeneratedMessageLite<ResolveResponse, b> implements Object {
    private static final ResolveResponse b;
    private static volatile x<ResolveResponse> c;
    private Configuration a;

    public static final class b extends GeneratedMessageLite.b<ResolveResponse, b> implements Object {
        private b() {
            super(ResolveResponse.b);
        }
    }

    static {
        ResolveResponse resolveResponse = new ResolveResponse();
        b = resolveResponse;
        resolveResponse.makeImmutable();
    }

    private ResolveResponse() {
    }

    public static ResolveResponse i() {
        return b;
    }

    public static x<ResolveResponse> parser() {
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
                this.a = (Configuration) ((GeneratedMessageLite.h) obj).i(this.a, ((ResolveResponse) obj2).a);
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
                                Configuration configuration = this.a;
                                Configuration.b bVar = configuration != null ? (Configuration.b) configuration.toBuilder() : null;
                                Configuration configuration2 = (Configuration) gVar.o(Configuration.parser(), kVar);
                                this.a = configuration2;
                                if (bVar != null) {
                                    bVar.mergeFrom((Configuration.b) configuration2);
                                    this.a = (Configuration) bVar.buildPartial();
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
                return new ResolveResponse();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (c == null) {
                    synchronized (ResolveResponse.class) {
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

    public Configuration h() {
        Configuration configuration = this.a;
        return configuration == null ? Configuration.l() : configuration;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.a != null) {
            codedOutputStream.M(1, h());
        }
    }
}
