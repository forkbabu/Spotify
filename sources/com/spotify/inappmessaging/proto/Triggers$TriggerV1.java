package com.spotify.inappmessaging.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class Triggers$TriggerV1 extends GeneratedMessageLite<Triggers$TriggerV1, a> implements Object {
    private static final Triggers$TriggerV1 n;
    private static volatile x<Triggers$TriggerV1> o;
    private String a = "";
    private String b = "";
    private String c = "";
    private boolean f;

    public static final class a extends GeneratedMessageLite.b<Triggers$TriggerV1, a> implements Object {
        private a() {
            super(Triggers$TriggerV1.n);
        }
    }

    static {
        Triggers$TriggerV1 triggers$TriggerV1 = new Triggers$TriggerV1();
        n = triggers$TriggerV1;
        triggers$TriggerV1.makeImmutable();
    }

    private Triggers$TriggerV1() {
    }

    public static x<Triggers$TriggerV1> parser() {
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
                Triggers$TriggerV1 triggers$TriggerV1 = (Triggers$TriggerV1) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !triggers$TriggerV1.a.isEmpty(), triggers$TriggerV1.a);
                this.b = hVar.n(!this.b.isEmpty(), this.b, !triggers$TriggerV1.b.isEmpty(), triggers$TriggerV1.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, true ^ triggers$TriggerV1.c.isEmpty(), triggers$TriggerV1.c);
                boolean z = this.f;
                boolean z2 = triggers$TriggerV1.f;
                this.f = hVar.f(z, z, z2, z2);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                this.a = gVar.A();
                            } else if (B == 18) {
                                this.b = gVar.A();
                            } else if (B == 26) {
                                this.c = gVar.A();
                            } else if (B == 32) {
                                this.f = gVar.h();
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z3 = true;
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
                return new Triggers$TriggerV1();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (Triggers$TriggerV1.class) {
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
        if (!this.a.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.a);
        }
        if (!this.b.isEmpty()) {
            i2 += CodedOutputStream.p(2, this.b);
        }
        if (!this.c.isEmpty()) {
            i2 += CodedOutputStream.p(3, this.c);
        }
        boolean z = this.f;
        if (z) {
            i2 += CodedOutputStream.d(4, z);
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
        boolean z = this.f;
        if (z) {
            codedOutputStream.A(4, z);
        }
    }
}
