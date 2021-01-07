package com.spotify.player.esperanto.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class EsContextPlayerOptions$ContextPlayerOptions extends GeneratedMessageLite<EsContextPlayerOptions$ContextPlayerOptions, a> implements Object {
    private static final EsContextPlayerOptions$ContextPlayerOptions f;
    private static volatile x<EsContextPlayerOptions$ContextPlayerOptions> n;
    private boolean a;
    private boolean b;
    private boolean c;

    public static final class a extends GeneratedMessageLite.b<EsContextPlayerOptions$ContextPlayerOptions, a> implements Object {
        private a() {
            super(EsContextPlayerOptions$ContextPlayerOptions.f);
        }
    }

    static {
        EsContextPlayerOptions$ContextPlayerOptions esContextPlayerOptions$ContextPlayerOptions = new EsContextPlayerOptions$ContextPlayerOptions();
        f = esContextPlayerOptions$ContextPlayerOptions;
        esContextPlayerOptions$ContextPlayerOptions.makeImmutable();
    }

    private EsContextPlayerOptions$ContextPlayerOptions() {
    }

    public static EsContextPlayerOptions$ContextPlayerOptions h() {
        return f;
    }

    public static x<EsContextPlayerOptions$ContextPlayerOptions> parser() {
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
                EsContextPlayerOptions$ContextPlayerOptions esContextPlayerOptions$ContextPlayerOptions = (EsContextPlayerOptions$ContextPlayerOptions) obj2;
                boolean z = this.a;
                boolean z2 = esContextPlayerOptions$ContextPlayerOptions.a;
                this.a = hVar.f(z, z, z2, z2);
                boolean z3 = this.b;
                boolean z4 = esContextPlayerOptions$ContextPlayerOptions.b;
                this.b = hVar.f(z3, z3, z4, z4);
                boolean z5 = this.c;
                boolean z6 = esContextPlayerOptions$ContextPlayerOptions.c;
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
                return new EsContextPlayerOptions$ContextPlayerOptions();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (EsContextPlayerOptions$ContextPlayerOptions.class) {
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

    public boolean i() {
        return this.b;
    }

    public boolean l() {
        return this.c;
    }

    public boolean m() {
        return this.a;
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
