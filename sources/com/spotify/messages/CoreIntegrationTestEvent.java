package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class CoreIntegrationTestEvent extends GeneratedMessageLite<CoreIntegrationTestEvent, b> implements Object {
    private static final CoreIntegrationTestEvent f;
    private static volatile x<CoreIntegrationTestEvent> n;
    private int a;
    private String b = "";
    private o.i<String> c = GeneratedMessageLite.emptyProtobufList();

    public static final class b extends GeneratedMessageLite.b<CoreIntegrationTestEvent, b> implements Object {
        public b m(Iterable<String> iterable) {
            copyOnWrite();
            CoreIntegrationTestEvent.i((CoreIntegrationTestEvent) this.instance, iterable);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            CoreIntegrationTestEvent.h((CoreIntegrationTestEvent) this.instance, str);
            return this;
        }

        private b() {
            super(CoreIntegrationTestEvent.f);
        }
    }

    static {
        CoreIntegrationTestEvent coreIntegrationTestEvent = new CoreIntegrationTestEvent();
        f = coreIntegrationTestEvent;
        coreIntegrationTestEvent.makeImmutable();
    }

    private CoreIntegrationTestEvent() {
    }

    static void h(CoreIntegrationTestEvent coreIntegrationTestEvent, String str) {
        coreIntegrationTestEvent.getClass();
        str.getClass();
        coreIntegrationTestEvent.a |= 1;
        coreIntegrationTestEvent.b = str;
    }

    static void i(CoreIntegrationTestEvent coreIntegrationTestEvent, Iterable iterable) {
        if (!coreIntegrationTestEvent.c.R0()) {
            coreIntegrationTestEvent.c = GeneratedMessageLite.mutableCopy(coreIntegrationTestEvent.c);
        }
        com.google.protobuf.a.addAll(iterable, coreIntegrationTestEvent.c);
    }

    public static b l() {
        return (b) f.toBuilder();
    }

    public static x<CoreIntegrationTestEvent> parser() {
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
                CoreIntegrationTestEvent coreIntegrationTestEvent = (CoreIntegrationTestEvent) obj2;
                boolean z2 = (this.a & 1) == 1;
                String str = this.b;
                if ((coreIntegrationTestEvent.a & 1) == 1) {
                    z = true;
                }
                this.b = hVar.n(z2, str, z, coreIntegrationTestEvent.b);
                this.c = hVar.q(this.c, coreIntegrationTestEvent.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= coreIntegrationTestEvent.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                String z3 = gVar.z();
                                this.a |= 1;
                                this.b = z3;
                            } else if (B == 18) {
                                String z4 = gVar.z();
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(z4);
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
                this.c.C();
                return null;
            case 4:
                return new CoreIntegrationTestEvent();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (CoreIntegrationTestEvent.class) {
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
        int p = (this.a & 1) == 1 ? CodedOutputStream.p(1, this.b) + 0 : 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.c.size(); i3++) {
            i2 += CodedOutputStream.q(this.c.get(i3));
        }
        int c2 = this.unknownFields.c() + je.C0(this.c, 1, p + i2);
        this.memoizedSerializedSize = c2;
        return c2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.P(1, this.b);
        }
        for (int i = 0; i < this.c.size(); i++) {
            codedOutputStream.P(2, this.c.get(i));
        }
        this.unknownFields.l(codedOutputStream);
    }
}
