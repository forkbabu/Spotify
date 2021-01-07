package com.spotify.inappmessaging.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class ClickActions$ClickActionV1 extends GeneratedMessageLite<ClickActions$ClickActionV1, a> implements Object {
    private static final ClickActions$ClickActionV1 f;
    private static volatile x<ClickActions$ClickActionV1> n;
    private String a = "";
    private String b = "";
    private String c = "";

    public static final class a extends GeneratedMessageLite.b<ClickActions$ClickActionV1, a> implements Object {
        private a() {
            super(ClickActions$ClickActionV1.f);
        }
    }

    static {
        ClickActions$ClickActionV1 clickActions$ClickActionV1 = new ClickActions$ClickActionV1();
        f = clickActions$ClickActionV1;
        clickActions$ClickActionV1.makeImmutable();
    }

    private ClickActions$ClickActionV1() {
    }

    public static ClickActions$ClickActionV1 i() {
        return f;
    }

    public static x<ClickActions$ClickActionV1> parser() {
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
                ClickActions$ClickActionV1 clickActions$ClickActionV1 = (ClickActions$ClickActionV1) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !clickActions$ClickActionV1.a.isEmpty(), clickActions$ClickActionV1.a);
                this.b = hVar.n(!this.b.isEmpty(), this.b, !clickActions$ClickActionV1.b.isEmpty(), clickActions$ClickActionV1.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, true ^ clickActions$ClickActionV1.c.isEmpty(), clickActions$ClickActionV1.c);
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
                return new ClickActions$ClickActionV1();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (ClickActions$ClickActionV1.class) {
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
        return this.a;
    }

    public String l() {
        return this.c;
    }

    public String m() {
        return this.b;
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
