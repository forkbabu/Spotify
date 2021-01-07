package com.spotify.share.base.linkgeneration.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class GenerateUrlResponse extends GeneratedMessageLite<GenerateUrlResponse, b> implements Object {
    private static final GenerateUrlResponse f;
    private static volatile x<GenerateUrlResponse> n;
    private String a = "";
    private String b = "";
    private String c = "";

    public static final class b extends GeneratedMessageLite.b<GenerateUrlResponse, b> implements Object {
        private b() {
            super(GenerateUrlResponse.f);
        }
    }

    static {
        GenerateUrlResponse generateUrlResponse = new GenerateUrlResponse();
        f = generateUrlResponse;
        generateUrlResponse.makeImmutable();
    }

    private GenerateUrlResponse() {
    }

    public static x<GenerateUrlResponse> parser() {
        return f.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return f;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                GenerateUrlResponse generateUrlResponse = (GenerateUrlResponse) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !generateUrlResponse.a.isEmpty(), generateUrlResponse.a);
                this.b = hVar.n(!this.b.isEmpty(), this.b, !generateUrlResponse.b.isEmpty(), generateUrlResponse.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, true ^ generateUrlResponse.c.isEmpty(), generateUrlResponse.c);
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
                            } else if (B == 26) {
                                this.c = gVar.A();
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
                return new GenerateUrlResponse();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (GenerateUrlResponse.class) {
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
        if (!this.a.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.a);
        }
        if (!this.b.isEmpty()) {
            i2 += CodedOutputStream.p(2, this.b);
        }
        if (!this.c.isEmpty()) {
            i2 += CodedOutputStream.p(3, this.c);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String h() {
        return this.c;
    }

    public String i() {
        return this.b;
    }

    public String l() {
        return this.a;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        if (!this.b.isEmpty()) {
            codedOutputStream.P(2, this.b);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(3, this.c);
        }
    }
}
