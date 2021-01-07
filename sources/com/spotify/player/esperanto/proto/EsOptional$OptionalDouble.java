package com.spotify.player.esperanto.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class EsOptional$OptionalDouble extends GeneratedMessageLite<EsOptional$OptionalDouble, a> implements Object {
    private static final EsOptional$OptionalDouble b;
    private static volatile x<EsOptional$OptionalDouble> c;
    private double a;

    public static final class a extends GeneratedMessageLite.b<EsOptional$OptionalDouble, a> implements Object {
        private a() {
            super(EsOptional$OptionalDouble.b);
        }
    }

    static {
        EsOptional$OptionalDouble esOptional$OptionalDouble = new EsOptional$OptionalDouble();
        b = esOptional$OptionalDouble;
        esOptional$OptionalDouble.makeImmutable();
    }

    private EsOptional$OptionalDouble() {
    }

    public static EsOptional$OptionalDouble h() {
        return b;
    }

    public static x<EsOptional$OptionalDouble> parser() {
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
                EsOptional$OptionalDouble esOptional$OptionalDouble = (EsOptional$OptionalDouble) obj2;
                double d = this.a;
                boolean z2 = d != 0.0d;
                double d2 = esOptional$OptionalDouble.a;
                this.a = hVar.t(z2, d, d2 != 0.0d, d2);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 9) {
                                this.a = gVar.j();
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
                return new EsOptional$OptionalDouble();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (c == null) {
                    synchronized (EsOptional$OptionalDouble.class) {
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
        double d = this.a;
        if (d != 0.0d) {
            i2 = 0 + CodedOutputStream.g(1, d);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public double i() {
        return this.a;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        double d = this.a;
        if (d != 0.0d) {
            codedOutputStream.E(1, d);
        }
    }
}
