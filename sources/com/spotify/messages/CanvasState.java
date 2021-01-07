package com.spotify.messages;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class CanvasState extends GeneratedMessageLite<CanvasState, b> implements Object {
    private static final CanvasState t;
    private static volatile x<CanvasState> u;
    private int a;
    private String b = "";
    private String c = "";
    private ByteString f = ByteString.a;
    private double n;
    private String o = "";
    private String p = "";
    private String q = "";
    private String r = "";
    private String s = "";

    public static final class b extends GeneratedMessageLite.b<CanvasState, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            CanvasState.l((CanvasState) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            CanvasState.m((CanvasState) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            CanvasState.h((CanvasState) this.instance, str);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            CanvasState.p((CanvasState) this.instance, str);
            return this;
        }

        public b q(String str) {
            copyOnWrite();
            CanvasState.i((CanvasState) this.instance, str);
            return this;
        }

        public b r(String str) {
            copyOnWrite();
            CanvasState.o((CanvasState) this.instance, str);
            return this;
        }

        public b s(ByteString byteString) {
            copyOnWrite();
            CanvasState.q((CanvasState) this.instance, byteString);
            return this;
        }

        public b t(double d) {
            copyOnWrite();
            CanvasState.r((CanvasState) this.instance, d);
            return this;
        }

        public b u(String str) {
            copyOnWrite();
            CanvasState.n((CanvasState) this.instance, str);
            return this;
        }

        private b() {
            super(CanvasState.t);
        }
    }

    static {
        CanvasState canvasState = new CanvasState();
        t = canvasState;
        canvasState.makeImmutable();
    }

    private CanvasState() {
    }

    static void h(CanvasState canvasState, String str) {
        canvasState.getClass();
        str.getClass();
        canvasState.a |= 1;
        canvasState.b = str;
    }

    static void i(CanvasState canvasState, String str) {
        canvasState.getClass();
        str.getClass();
        canvasState.a |= 16;
        canvasState.o = str;
    }

    static void l(CanvasState canvasState, String str) {
        canvasState.getClass();
        str.getClass();
        canvasState.a |= 32;
        canvasState.p = str;
    }

    static void m(CanvasState canvasState, String str) {
        canvasState.getClass();
        str.getClass();
        canvasState.a |= 64;
        canvasState.q = str;
    }

    static void n(CanvasState canvasState, String str) {
        canvasState.getClass();
        str.getClass();
        canvasState.a |= 128;
        canvasState.r = str;
    }

    static void o(CanvasState canvasState, String str) {
        canvasState.getClass();
        str.getClass();
        canvasState.a |= 256;
        canvasState.s = str;
    }

    static void p(CanvasState canvasState, String str) {
        canvasState.getClass();
        str.getClass();
        canvasState.a |= 2;
        canvasState.c = str;
    }

    public static x<CanvasState> parser() {
        return t.getParserForType();
    }

    static void q(CanvasState canvasState, ByteString byteString) {
        canvasState.getClass();
        byteString.getClass();
        canvasState.a |= 4;
        canvasState.f = byteString;
    }

    static void r(CanvasState canvasState, double d) {
        canvasState.a |= 8;
        canvasState.n = d;
    }

    public static b s() {
        return (b) t.toBuilder();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = true;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return t;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                CanvasState canvasState = (CanvasState) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (canvasState.a & 1) == 1, canvasState.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (canvasState.a & 2) == 2, canvasState.c);
                this.f = hVar.r((this.a & 4) == 4, this.f, (canvasState.a & 4) == 4, canvasState.f);
                this.n = hVar.t((this.a & 8) == 8, this.n, (canvasState.a & 8) == 8, canvasState.n);
                this.o = hVar.n((this.a & 16) == 16, this.o, (canvasState.a & 16) == 16, canvasState.o);
                this.p = hVar.n((this.a & 32) == 32, this.p, (canvasState.a & 32) == 32, canvasState.p);
                this.q = hVar.n((this.a & 64) == 64, this.q, (canvasState.a & 64) == 64, canvasState.q);
                this.r = hVar.n((this.a & 128) == 128, this.r, (canvasState.a & 128) == 128, canvasState.r);
                boolean z2 = (this.a & 256) == 256;
                String str = this.s;
                if ((canvasState.a & 256) != 256) {
                    z = false;
                }
                this.s = hVar.n(z2, str, z, canvasState.s);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= canvasState.a;
                }
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
                                String z4 = gVar.z();
                                this.a |= 1;
                                this.b = z4;
                            } else if (B == 18) {
                                String z5 = gVar.z();
                                this.a |= 2;
                                this.c = z5;
                            } else if (B == 26) {
                                this.a |= 4;
                                this.f = gVar.i();
                            } else if (B == 33) {
                                this.a |= 8;
                                this.n = gVar.j();
                            } else if (B == 42) {
                                String z6 = gVar.z();
                                this.a |= 16;
                                this.o = z6;
                            } else if (B == 50) {
                                String z7 = gVar.z();
                                this.a |= 32;
                                this.p = z7;
                            } else if (B == 58) {
                                String z8 = gVar.z();
                                this.a |= 64;
                                this.q = z8;
                            } else if (B == 66) {
                                String z9 = gVar.z();
                                this.a |= 128;
                                this.r = z9;
                            } else if (B == 82) {
                                String z10 = gVar.z();
                                this.a |= 256;
                                this.s = z10;
                            } else if (!parseUnknownField(B, gVar)) {
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
                return new CanvasState();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (u == null) {
                    synchronized (CanvasState.class) {
                        if (u == null) {
                            u = new GeneratedMessageLite.c(t);
                        }
                    }
                }
                return u;
            default:
                throw new UnsupportedOperationException();
        }
        return t;
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
            i2 += CodedOutputStream.p(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.e(3, this.f);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.g(4, this.n);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.p(5, this.o);
        }
        if ((this.a & 32) == 32) {
            i2 += CodedOutputStream.p(6, this.p);
        }
        if ((this.a & 64) == 64) {
            i2 += CodedOutputStream.p(7, this.q);
        }
        if ((this.a & 128) == 128) {
            i2 += CodedOutputStream.p(8, this.r);
        }
        if ((this.a & 256) == 256) {
            i2 += CodedOutputStream.p(10, this.s);
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
            codedOutputStream.P(2, this.c);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.C(3, this.f);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.E(4, this.n);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.P(5, this.o);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.P(6, this.p);
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.P(7, this.q);
        }
        if ((this.a & 128) == 128) {
            codedOutputStream.P(8, this.r);
        }
        if ((this.a & 256) == 256) {
            codedOutputStream.P(10, this.s);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
