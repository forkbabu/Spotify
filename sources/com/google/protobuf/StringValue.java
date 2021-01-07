package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.io.IOException;

public final class StringValue extends GeneratedMessageLite<StringValue, b> implements Object {
    private static final StringValue b;
    private static volatile x<StringValue> c;
    private String a = "";

    public static final class b extends GeneratedMessageLite.b<StringValue, b> implements Object {
        private b() {
            super(StringValue.b);
        }

        b(a aVar) {
            super(StringValue.b);
        }
    }

    static {
        StringValue stringValue = new StringValue();
        b = stringValue;
        stringValue.makeImmutable();
    }

    private StringValue() {
    }

    public static StringValue h() {
        return b;
    }

    public static x<StringValue> parser() {
        return b.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return b;
            case 1:
                StringValue stringValue = (StringValue) obj2;
                this.a = ((GeneratedMessageLite.h) obj).n(!this.a.isEmpty(), this.a, true ^ stringValue.a.isEmpty(), stringValue.a);
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
                return new StringValue();
            case 5:
                return new b(null);
            case 6:
                break;
            case 7:
                if (c == null) {
                    synchronized (StringValue.class) {
                        if (c == null) {
                            c = new GeneratedMessageLite.c(b);
                        }
                    }
                }
                return c;
            default:
                throw new UnsupportedOperationException();
        }
        return b;
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
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String i() {
        return this.a;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
    }
}
