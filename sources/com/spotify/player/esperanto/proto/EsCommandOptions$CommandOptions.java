package com.spotify.player.esperanto.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class EsCommandOptions$CommandOptions extends GeneratedMessageLite<EsCommandOptions$CommandOptions, a> implements Object {
    private static final EsCommandOptions$CommandOptions f;
    private static volatile x<EsCommandOptions$CommandOptions> n;
    private boolean a;
    private boolean b;
    private boolean c;

    public static final class a extends GeneratedMessageLite.b<EsCommandOptions$CommandOptions, a> implements Object {
        public a m(boolean z) {
            copyOnWrite();
            EsCommandOptions$CommandOptions.i((EsCommandOptions$CommandOptions) this.instance, z);
            return this;
        }

        public a n(boolean z) {
            copyOnWrite();
            EsCommandOptions$CommandOptions.h((EsCommandOptions$CommandOptions) this.instance, z);
            return this;
        }

        public a o(boolean z) {
            copyOnWrite();
            EsCommandOptions$CommandOptions.l((EsCommandOptions$CommandOptions) this.instance, z);
            return this;
        }

        private a() {
            super(EsCommandOptions$CommandOptions.f);
        }
    }

    static {
        EsCommandOptions$CommandOptions esCommandOptions$CommandOptions = new EsCommandOptions$CommandOptions();
        f = esCommandOptions$CommandOptions;
        esCommandOptions$CommandOptions.makeImmutable();
    }

    private EsCommandOptions$CommandOptions() {
    }

    static void h(EsCommandOptions$CommandOptions esCommandOptions$CommandOptions, boolean z) {
        esCommandOptions$CommandOptions.a = z;
    }

    static void i(EsCommandOptions$CommandOptions esCommandOptions$CommandOptions, boolean z) {
        esCommandOptions$CommandOptions.b = z;
    }

    static void l(EsCommandOptions$CommandOptions esCommandOptions$CommandOptions, boolean z) {
        esCommandOptions$CommandOptions.c = z;
    }

    public static a m() {
        return (a) f.toBuilder();
    }

    public static x<EsCommandOptions$CommandOptions> parser() {
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
                EsCommandOptions$CommandOptions esCommandOptions$CommandOptions = (EsCommandOptions$CommandOptions) obj2;
                boolean z = this.a;
                boolean z2 = esCommandOptions$CommandOptions.a;
                this.a = hVar.f(z, z, z2, z2);
                boolean z3 = this.b;
                boolean z4 = esCommandOptions$CommandOptions.b;
                this.b = hVar.f(z3, z3, z4, z4);
                boolean z5 = this.c;
                boolean z6 = esCommandOptions$CommandOptions.c;
                this.c = hVar.f(z5, z5, z6, z6);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z7 = false;
                while (!z7) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.a = gVar.h();
                            } else if (B == 16) {
                                this.b = gVar.h();
                            } else if (B == 24) {
                                this.c = gVar.h();
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z7 = true;
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
                return new EsCommandOptions$CommandOptions();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (EsCommandOptions$CommandOptions.class) {
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
        boolean z = this.a;
        if (z) {
            i2 = 0 + CodedOutputStream.d(1, z);
        }
        boolean z2 = this.b;
        if (z2) {
            i2 += CodedOutputStream.d(2, z2);
        }
        boolean z3 = this.c;
        if (z3) {
            i2 += CodedOutputStream.d(3, z3);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        boolean z = this.a;
        if (z) {
            codedOutputStream.A(1, z);
        }
        boolean z2 = this.b;
        if (z2) {
            codedOutputStream.A(2, z2);
        }
        boolean z3 = this.c;
        if (z3) {
            codedOutputStream.A(3, z3);
        }
    }
}
