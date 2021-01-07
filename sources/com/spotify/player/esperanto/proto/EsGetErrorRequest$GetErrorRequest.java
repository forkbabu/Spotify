package com.spotify.player.esperanto.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class EsGetErrorRequest$GetErrorRequest extends GeneratedMessageLite<EsGetErrorRequest$GetErrorRequest, a> implements Object {
    private static final EsGetErrorRequest$GetErrorRequest a;
    private static volatile x<EsGetErrorRequest$GetErrorRequest> b;

    public static final class a extends GeneratedMessageLite.b<EsGetErrorRequest$GetErrorRequest, a> implements Object {
        private a() {
            super(EsGetErrorRequest$GetErrorRequest.a);
        }
    }

    static {
        EsGetErrorRequest$GetErrorRequest esGetErrorRequest$GetErrorRequest = new EsGetErrorRequest$GetErrorRequest();
        a = esGetErrorRequest$GetErrorRequest;
        esGetErrorRequest$GetErrorRequest.makeImmutable();
    }

    private EsGetErrorRequest$GetErrorRequest() {
    }

    public static EsGetErrorRequest$GetErrorRequest h() {
        return a;
    }

    public static x<EsGetErrorRequest$GetErrorRequest> parser() {
        return a.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return a;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                EsGetErrorRequest$GetErrorRequest esGetErrorRequest$GetErrorRequest = (EsGetErrorRequest$GetErrorRequest) obj2;
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B == 0 || !gVar.F(B)) {
                            z = true;
                        }
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
                return new EsGetErrorRequest$GetErrorRequest();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (b == null) {
                    synchronized (EsGetErrorRequest$GetErrorRequest.class) {
                        if (b == null) {
                            b = new GeneratedMessageLite.c(a);
                        }
                    }
                }
                return b;
            default:
                throw new UnsupportedOperationException();
        }
        return a;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        this.memoizedSerializedSize = 0;
        return 0;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
    }
}
