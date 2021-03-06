package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.io.IOException;

public final class Int32Value extends GeneratedMessageLite<Int32Value, b> implements Object {
    private static final Int32Value b;
    private static volatile x<Int32Value> c;
    private int a;

    public static final class b extends GeneratedMessageLite.b<Int32Value, b> implements Object {
        private b() {
            super(Int32Value.b);
        }

        b(a aVar) {
            super(Int32Value.b);
        }
    }

    static {
        Int32Value int32Value = new Int32Value();
        b = int32Value;
        int32Value.makeImmutable();
    }

    private Int32Value() {
    }

    public static x<Int32Value> parser() {
        return b.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return b;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Int32Value int32Value = (Int32Value) obj2;
                int i = this.a;
                boolean z2 = i != 0;
                int i2 = int32Value.a;
                if (i2 != 0) {
                    z = true;
                }
                this.a = hVar.m(z2, i, z, i2);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.a = gVar.u();
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
                return new Int32Value();
            case 5:
                return new b(null);
            case 6:
                break;
            case 7:
                if (c == null) {
                    synchronized (Int32Value.class) {
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
        int i3 = this.a;
        if (i3 != 0) {
            i2 = 0 + CodedOutputStream.j(1, i3);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        int i = this.a;
        if (i != 0) {
            codedOutputStream.K(1, i);
        }
    }
}
