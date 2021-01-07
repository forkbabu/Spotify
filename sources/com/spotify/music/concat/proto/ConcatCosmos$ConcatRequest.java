package com.spotify.music.concat.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class ConcatCosmos$ConcatRequest extends GeneratedMessageLite<ConcatCosmos$ConcatRequest, a> implements Object {
    private static final ConcatCosmos$ConcatRequest c;
    private static volatile x<ConcatCosmos$ConcatRequest> f;
    private String a = "";
    private String b = "";

    public static final class a extends GeneratedMessageLite.b<ConcatCosmos$ConcatRequest, a> implements Object {
        public a m(String str) {
            copyOnWrite();
            ConcatCosmos$ConcatRequest.h((ConcatCosmos$ConcatRequest) this.instance, str);
            return this;
        }

        public a n(String str) {
            copyOnWrite();
            ConcatCosmos$ConcatRequest.i((ConcatCosmos$ConcatRequest) this.instance, str);
            return this;
        }

        private a() {
            super(ConcatCosmos$ConcatRequest.c);
        }
    }

    static {
        ConcatCosmos$ConcatRequest concatCosmos$ConcatRequest = new ConcatCosmos$ConcatRequest();
        c = concatCosmos$ConcatRequest;
        concatCosmos$ConcatRequest.makeImmutable();
    }

    private ConcatCosmos$ConcatRequest() {
    }

    static void h(ConcatCosmos$ConcatRequest concatCosmos$ConcatRequest, String str) {
        concatCosmos$ConcatRequest.getClass();
        str.getClass();
        concatCosmos$ConcatRequest.a = str;
    }

    static void i(ConcatCosmos$ConcatRequest concatCosmos$ConcatRequest, String str) {
        concatCosmos$ConcatRequest.getClass();
        str.getClass();
        concatCosmos$ConcatRequest.b = str;
    }

    public static a l() {
        return (a) c.toBuilder();
    }

    public static x<ConcatCosmos$ConcatRequest> parser() {
        return c.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return c;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ConcatCosmos$ConcatRequest concatCosmos$ConcatRequest = (ConcatCosmos$ConcatRequest) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !concatCosmos$ConcatRequest.a.isEmpty(), concatCosmos$ConcatRequest.a);
                this.b = hVar.n(!this.b.isEmpty(), this.b, true ^ concatCosmos$ConcatRequest.b.isEmpty(), concatCosmos$ConcatRequest.b);
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
                                this.a = gVar.A();
                            } else if (B == 18) {
                                this.b = gVar.A();
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
                return new ConcatCosmos$ConcatRequest();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (ConcatCosmos$ConcatRequest.class) {
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
        if (!this.a.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.a);
        }
        if (!this.b.isEmpty()) {
            i2 += CodedOutputStream.p(2, this.b);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        if (!this.b.isEmpty()) {
            codedOutputStream.P(2, this.b);
        }
    }
}
