package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class ResolveConfigurationError extends GeneratedMessageLite<ResolveConfigurationError, b> implements Object {
    private static final ResolveConfigurationError o;
    private static volatile x<ResolveConfigurationError> p;
    private int a;
    private String b = "";
    private long c;
    private String f = "";
    private String n = "";

    public static final class b extends GeneratedMessageLite.b<ResolveConfigurationError, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            ResolveConfigurationError.l((ResolveConfigurationError) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            ResolveConfigurationError.m((ResolveConfigurationError) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            ResolveConfigurationError.h((ResolveConfigurationError) this.instance, str);
            return this;
        }

        public b p(long j) {
            copyOnWrite();
            ResolveConfigurationError.i((ResolveConfigurationError) this.instance, j);
            return this;
        }

        private b() {
            super(ResolveConfigurationError.o);
        }
    }

    static {
        ResolveConfigurationError resolveConfigurationError = new ResolveConfigurationError();
        o = resolveConfigurationError;
        resolveConfigurationError.makeImmutable();
    }

    private ResolveConfigurationError() {
    }

    static void h(ResolveConfigurationError resolveConfigurationError, String str) {
        resolveConfigurationError.getClass();
        str.getClass();
        resolveConfigurationError.a |= 1;
        resolveConfigurationError.b = str;
    }

    static void i(ResolveConfigurationError resolveConfigurationError, long j) {
        resolveConfigurationError.a |= 2;
        resolveConfigurationError.c = j;
    }

    static void l(ResolveConfigurationError resolveConfigurationError, String str) {
        resolveConfigurationError.getClass();
        str.getClass();
        resolveConfigurationError.a |= 4;
        resolveConfigurationError.f = str;
    }

    static void m(ResolveConfigurationError resolveConfigurationError, String str) {
        resolveConfigurationError.getClass();
        str.getClass();
        resolveConfigurationError.a |= 8;
        resolveConfigurationError.n = str;
    }

    public static b n() {
        return (b) o.toBuilder();
    }

    public static x<ResolveConfigurationError> parser() {
        return o.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return o;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ResolveConfigurationError resolveConfigurationError = (ResolveConfigurationError) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (resolveConfigurationError.a & 1) == 1, resolveConfigurationError.b);
                this.c = hVar.s((this.a & 2) == 2, this.c, (resolveConfigurationError.a & 2) == 2, resolveConfigurationError.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (resolveConfigurationError.a & 4) == 4, resolveConfigurationError.f);
                boolean z2 = (this.a & 8) == 8;
                String str = this.n;
                if ((resolveConfigurationError.a & 8) == 8) {
                    z = true;
                }
                this.n = hVar.n(z2, str, z, resolveConfigurationError.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= resolveConfigurationError.a;
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
                            } else if (B == 16) {
                                this.a |= 2;
                                this.c = gVar.w();
                            } else if (B == 26) {
                                String z4 = gVar.z();
                                this.a |= 4;
                                this.f = z4;
                            } else if (B == 34) {
                                String z5 = gVar.z();
                                this.a |= 8;
                                this.n = z5;
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
                return null;
            case 4:
                return new ResolveConfigurationError();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (ResolveConfigurationError.class) {
                        if (p == null) {
                            p = new GeneratedMessageLite.c(o);
                        }
                    }
                }
                return p;
            default:
                throw new UnsupportedOperationException();
        }
        return o;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.p(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.l(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.p(3, this.f);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.p(4, this.n);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.P(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.U(2, this.c);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.P(3, this.f);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.P(4, this.n);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
