package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.io.IOException;

public final class Any extends GeneratedMessageLite<Any, b> implements Object {
    private static final Any c;
    private static volatile x<Any> f;
    private String a = "";
    private ByteString b = ByteString.a;

    public static final class b extends GeneratedMessageLite.b<Any, b> implements Object {
        private b() {
            super(Any.c);
        }

        b(a aVar) {
            super(Any.c);
        }
    }

    static {
        Any any = new Any();
        c = any;
        any.makeImmutable();
    }

    private Any() {
    }

    public static Any h() {
        return c;
    }

    public static x<Any> parser() {
        return c.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return c;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Any any = (Any) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !any.a.isEmpty(), any.a);
                ByteString byteString = this.b;
                ByteString byteString2 = ByteString.a;
                boolean z2 = byteString != byteString2;
                ByteString byteString3 = any.b;
                if (byteString3 != byteString2) {
                    z = true;
                }
                this.b = hVar.r(z2, byteString, z, byteString3);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                this.a = gVar.A();
                            } else if (B == 18) {
                                this.b = gVar.i();
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
                return new Any();
            case 5:
                return new b(null);
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (Any.class) {
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
            i2 += CodedOutputStream.e(2, this.b);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String i() {
        return this.a;
    }

    public ByteString l() {
        return this.b;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        if (!this.b.isEmpty()) {
            codedOutputStream.C(2, this.b);
        }
    }
}
