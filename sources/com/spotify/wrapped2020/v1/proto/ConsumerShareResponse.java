package com.spotify.wrapped2020.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.wrapped2020.v1.proto.ConsumerShareMessaging;
import java.io.IOException;

public final class ConsumerShareResponse extends GeneratedMessageLite<ConsumerShareResponse, b> implements Object {
    private static final ConsumerShareResponse f;
    private static volatile x<ConsumerShareResponse> n;
    private String a = "";
    private String b = "";
    private ConsumerShareMessaging c;

    public static final class b extends GeneratedMessageLite.b<ConsumerShareResponse, b> implements Object {
        private b() {
            super(ConsumerShareResponse.f);
        }
    }

    static {
        ConsumerShareResponse consumerShareResponse = new ConsumerShareResponse();
        f = consumerShareResponse;
        consumerShareResponse.makeImmutable();
    }

    private ConsumerShareResponse() {
    }

    public static x<ConsumerShareResponse> parser() {
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
                ConsumerShareResponse consumerShareResponse = (ConsumerShareResponse) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !consumerShareResponse.a.isEmpty(), consumerShareResponse.a);
                this.b = hVar.n(!this.b.isEmpty(), this.b, true ^ consumerShareResponse.b.isEmpty(), consumerShareResponse.b);
                this.c = (ConsumerShareMessaging) hVar.i(this.c, consumerShareResponse.c);
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
                                ConsumerShareMessaging consumerShareMessaging = this.c;
                                ConsumerShareMessaging.b bVar = consumerShareMessaging != null ? (ConsumerShareMessaging.b) consumerShareMessaging.toBuilder() : null;
                                ConsumerShareMessaging consumerShareMessaging2 = (ConsumerShareMessaging) gVar.o(ConsumerShareMessaging.parser(), kVar);
                                this.c = consumerShareMessaging2;
                                if (bVar != null) {
                                    bVar.mergeFrom((ConsumerShareMessaging.b) consumerShareMessaging2);
                                    this.c = (ConsumerShareMessaging) bVar.buildPartial();
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
                return new ConsumerShareResponse();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (ConsumerShareResponse.class) {
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
        if (this.c != null) {
            i2 += CodedOutputStream.n(3, i());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String h() {
        return this.b;
    }

    public ConsumerShareMessaging i() {
        ConsumerShareMessaging consumerShareMessaging = this.c;
        return consumerShareMessaging == null ? ConsumerShareMessaging.h() : consumerShareMessaging;
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
        if (this.c != null) {
            codedOutputStream.M(3, i());
        }
    }
}
