package com.spotify.wrapped2020.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class ConsumerShareRequest extends GeneratedMessageLite<ConsumerShareRequest, b> implements Object {
    private static final ConsumerShareRequest f;
    private static volatile x<ConsumerShareRequest> n;
    private String a = "";
    private String b = "";
    private String c = "";

    public static final class b extends GeneratedMessageLite.b<ConsumerShareRequest, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            ConsumerShareRequest.i((ConsumerShareRequest) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            ConsumerShareRequest.l((ConsumerShareRequest) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            ConsumerShareRequest.h((ConsumerShareRequest) this.instance, str);
            return this;
        }

        private b() {
            super(ConsumerShareRequest.f);
        }
    }

    static {
        ConsumerShareRequest consumerShareRequest = new ConsumerShareRequest();
        f = consumerShareRequest;
        consumerShareRequest.makeImmutable();
    }

    private ConsumerShareRequest() {
    }

    static void h(ConsumerShareRequest consumerShareRequest, String str) {
        consumerShareRequest.getClass();
        str.getClass();
        consumerShareRequest.a = str;
    }

    static void i(ConsumerShareRequest consumerShareRequest, String str) {
        consumerShareRequest.getClass();
        str.getClass();
        consumerShareRequest.b = str;
    }

    static void l(ConsumerShareRequest consumerShareRequest, String str) {
        consumerShareRequest.getClass();
        str.getClass();
        consumerShareRequest.c = str;
    }

    public static b m() {
        return (b) f.toBuilder();
    }

    public static x<ConsumerShareRequest> parser() {
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
                ConsumerShareRequest consumerShareRequest = (ConsumerShareRequest) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !consumerShareRequest.a.isEmpty(), consumerShareRequest.a);
                this.b = hVar.n(!this.b.isEmpty(), this.b, !consumerShareRequest.b.isEmpty(), consumerShareRequest.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, true ^ consumerShareRequest.c.isEmpty(), consumerShareRequest.c);
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
                return new ConsumerShareRequest();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (ConsumerShareRequest.class) {
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
