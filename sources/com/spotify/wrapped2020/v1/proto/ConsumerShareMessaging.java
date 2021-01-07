package com.spotify.wrapped2020.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class ConsumerShareMessaging extends GeneratedMessageLite<ConsumerShareMessaging, b> implements Object {
    private static final ConsumerShareMessaging n;
    private static volatile x<ConsumerShareMessaging> o;
    private int a;
    private o.i<ConsumerShareQueryParameter> b = GeneratedMessageLite.emptyProtobufList();
    private String c = "";
    private String f = "";

    public static final class b extends GeneratedMessageLite.b<ConsumerShareMessaging, b> implements Object {
        private b() {
            super(ConsumerShareMessaging.n);
        }
    }

    static {
        ConsumerShareMessaging consumerShareMessaging = new ConsumerShareMessaging();
        n = consumerShareMessaging;
        consumerShareMessaging.makeImmutable();
    }

    private ConsumerShareMessaging() {
    }

    public static ConsumerShareMessaging h() {
        return n;
    }

    public static x<ConsumerShareMessaging> parser() {
        return n.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return n;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ConsumerShareMessaging consumerShareMessaging = (ConsumerShareMessaging) obj2;
                this.b = hVar.q(this.b, consumerShareMessaging.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !consumerShareMessaging.c.isEmpty(), consumerShareMessaging.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, true ^ consumerShareMessaging.f.isEmpty(), consumerShareMessaging.f);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= consumerShareMessaging.a;
                }
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
                                if (!this.b.R0()) {
                                    this.b = GeneratedMessageLite.mutableCopy(this.b);
                                }
                                this.b.add(gVar.o(ConsumerShareQueryParameter.parser(), kVar));
                            } else if (B == 18) {
                                this.c = gVar.A();
                            } else if (B == 26) {
                                this.f = gVar.A();
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
                this.b.C();
                return null;
            case 4:
                return new ConsumerShareMessaging();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (ConsumerShareMessaging.class) {
                        if (o == null) {
                            o = new GeneratedMessageLite.c(n);
                        }
                    }
                }
                return o;
            default:
                throw new UnsupportedOperationException();
        }
        return n;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            i2 += CodedOutputStream.n(1, this.b.get(i3));
        }
        if (!this.c.isEmpty()) {
            i2 += CodedOutputStream.p(2, this.c);
        }
        if (!this.f.isEmpty()) {
            i2 += CodedOutputStream.p(3, this.f);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String i() {
        return this.c;
    }

    public List<ConsumerShareQueryParameter> l() {
        return this.b;
    }

    public String m() {
        return this.f;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.b.size(); i++) {
            codedOutputStream.M(1, this.b.get(i));
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(2, this.c);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.P(3, this.f);
        }
    }
}
