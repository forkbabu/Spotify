package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class TasteOnboardingInteraction extends GeneratedMessageLite<TasteOnboardingInteraction, b> implements Object {
    private static final TasteOnboardingInteraction w;
    private static volatile x<TasteOnboardingInteraction> x;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private String n = "";
    private String o = "";
    private String p = "";
    private int q;
    private int r;
    private int s;
    private String t = "";
    private String u = "";
    private String v = "";

    public static final class b extends GeneratedMessageLite.b<TasteOnboardingInteraction, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            TasteOnboardingInteraction.h((TasteOnboardingInteraction) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            TasteOnboardingInteraction.i((TasteOnboardingInteraction) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            TasteOnboardingInteraction.r((TasteOnboardingInteraction) this.instance, str);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            TasteOnboardingInteraction.p((TasteOnboardingInteraction) this.instance, str);
            return this;
        }

        public b q(int i) {
            copyOnWrite();
            TasteOnboardingInteraction.n((TasteOnboardingInteraction) this.instance, i);
            return this;
        }

        public b r(int i) {
            copyOnWrite();
            TasteOnboardingInteraction.m((TasteOnboardingInteraction) this.instance, i);
            return this;
        }

        public b s(String str) {
            copyOnWrite();
            TasteOnboardingInteraction.l((TasteOnboardingInteraction) this.instance, str);
            return this;
        }

        public b t(String str) {
            copyOnWrite();
            TasteOnboardingInteraction.o((TasteOnboardingInteraction) this.instance, str);
            return this;
        }

        public b u(String str) {
            copyOnWrite();
            TasteOnboardingInteraction.q((TasteOnboardingInteraction) this.instance, str);
            return this;
        }

        private b() {
            super(TasteOnboardingInteraction.w);
        }
    }

    static {
        TasteOnboardingInteraction tasteOnboardingInteraction = new TasteOnboardingInteraction();
        w = tasteOnboardingInteraction;
        tasteOnboardingInteraction.makeImmutable();
    }

    private TasteOnboardingInteraction() {
    }

    static void h(TasteOnboardingInteraction tasteOnboardingInteraction, String str) {
        tasteOnboardingInteraction.getClass();
        str.getClass();
        tasteOnboardingInteraction.a |= 8;
        tasteOnboardingInteraction.n = str;
    }

    static void i(TasteOnboardingInteraction tasteOnboardingInteraction, String str) {
        tasteOnboardingInteraction.getClass();
        str.getClass();
        tasteOnboardingInteraction.a |= 16;
        tasteOnboardingInteraction.o = str;
    }

    static void l(TasteOnboardingInteraction tasteOnboardingInteraction, String str) {
        tasteOnboardingInteraction.getClass();
        str.getClass();
        tasteOnboardingInteraction.a |= 32;
        tasteOnboardingInteraction.p = str;
    }

    static void m(TasteOnboardingInteraction tasteOnboardingInteraction, int i) {
        tasteOnboardingInteraction.a |= 64;
        tasteOnboardingInteraction.q = i;
    }

    static void n(TasteOnboardingInteraction tasteOnboardingInteraction, int i) {
        tasteOnboardingInteraction.a |= 128;
        tasteOnboardingInteraction.r = i;
    }

    static void o(TasteOnboardingInteraction tasteOnboardingInteraction, String str) {
        tasteOnboardingInteraction.getClass();
        str.getClass();
        tasteOnboardingInteraction.a |= 512;
        tasteOnboardingInteraction.t = str;
    }

    static void p(TasteOnboardingInteraction tasteOnboardingInteraction, String str) {
        tasteOnboardingInteraction.getClass();
        str.getClass();
        tasteOnboardingInteraction.a |= 1024;
        tasteOnboardingInteraction.u = str;
    }

    public static x<TasteOnboardingInteraction> parser() {
        return w.getParserForType();
    }

    static void q(TasteOnboardingInteraction tasteOnboardingInteraction, String str) {
        tasteOnboardingInteraction.getClass();
        str.getClass();
        tasteOnboardingInteraction.a |= 2;
        tasteOnboardingInteraction.c = str;
    }

    static void r(TasteOnboardingInteraction tasteOnboardingInteraction, String str) {
        tasteOnboardingInteraction.getClass();
        str.getClass();
        tasteOnboardingInteraction.a |= 4;
        tasteOnboardingInteraction.f = str;
    }

    public static b s() {
        return (b) w.toBuilder();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return w;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                TasteOnboardingInteraction tasteOnboardingInteraction = (TasteOnboardingInteraction) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (tasteOnboardingInteraction.a & 1) == 1, tasteOnboardingInteraction.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (tasteOnboardingInteraction.a & 2) == 2, tasteOnboardingInteraction.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (tasteOnboardingInteraction.a & 4) == 4, tasteOnboardingInteraction.f);
                this.n = hVar.n((this.a & 8) == 8, this.n, (tasteOnboardingInteraction.a & 8) == 8, tasteOnboardingInteraction.n);
                this.o = hVar.n((this.a & 16) == 16, this.o, (tasteOnboardingInteraction.a & 16) == 16, tasteOnboardingInteraction.o);
                this.p = hVar.n((this.a & 32) == 32, this.p, (tasteOnboardingInteraction.a & 32) == 32, tasteOnboardingInteraction.p);
                this.q = hVar.m((this.a & 64) == 64, this.q, (tasteOnboardingInteraction.a & 64) == 64, tasteOnboardingInteraction.q);
                this.r = hVar.m((this.a & 128) == 128, this.r, (tasteOnboardingInteraction.a & 128) == 128, tasteOnboardingInteraction.r);
                this.s = hVar.m((this.a & 256) == 256, this.s, (tasteOnboardingInteraction.a & 256) == 256, tasteOnboardingInteraction.s);
                this.t = hVar.n((this.a & 512) == 512, this.t, (tasteOnboardingInteraction.a & 512) == 512, tasteOnboardingInteraction.t);
                this.u = hVar.n((this.a & 1024) == 1024, this.u, (tasteOnboardingInteraction.a & 1024) == 1024, tasteOnboardingInteraction.u);
                this.v = hVar.n((this.a & 2048) == 2048, this.v, (tasteOnboardingInteraction.a & 2048) == 2048, tasteOnboardingInteraction.v);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= tasteOnboardingInteraction.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int B = gVar.B();
                        switch (B) {
                            case 0:
                                break;
                            case 10:
                                String z2 = gVar.z();
                                this.a |= 1;
                                this.b = z2;
                                continue;
                            case 18:
                                String z3 = gVar.z();
                                this.a |= 2;
                                this.c = z3;
                                continue;
                            case 26:
                                String z4 = gVar.z();
                                this.a |= 4;
                                this.f = z4;
                                continue;
                            case 34:
                                String z5 = gVar.z();
                                this.a |= 8;
                                this.n = z5;
                                continue;
                            case 42:
                                String z6 = gVar.z();
                                this.a |= 16;
                                this.o = z6;
                                continue;
                            case 50:
                                String z7 = gVar.z();
                                this.a |= 32;
                                this.p = z7;
                                continue;
                            case 56:
                                this.a |= 64;
                                this.q = gVar.u();
                                continue;
                            case 64:
                                this.a |= 128;
                                this.r = gVar.u();
                                continue;
                            case 72:
                                this.a |= 256;
                                this.s = gVar.u();
                                continue;
                            case 82:
                                String z8 = gVar.z();
                                this.a |= 512;
                                this.t = z8;
                                continue;
                            case 90:
                                String z9 = gVar.z();
                                this.a |= 1024;
                                this.u = z9;
                                continue;
                            case 98:
                                String z10 = gVar.z();
                                this.a |= 2048;
                                this.v = z10;
                                continue;
                            default:
                                if (parseUnknownField(B, gVar)) {
                                    continue;
                                }
                                break;
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
                return new TasteOnboardingInteraction();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (x == null) {
                    synchronized (TasteOnboardingInteraction.class) {
                        if (x == null) {
                            x = new GeneratedMessageLite.c(w);
                        }
                    }
                }
                return x;
            default:
                throw new UnsupportedOperationException();
        }
        return w;
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
            i2 += CodedOutputStream.p(3, this.f);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.p(4, this.n);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.p(5, this.o);
        }
        if ((this.a & 32) == 32) {
            i2 += CodedOutputStream.p(6, this.p);
        }
        if ((this.a & 64) == 64) {
            i2 += CodedOutputStream.j(7, this.q);
        }
        if ((this.a & 128) == 128) {
            i2 += CodedOutputStream.j(8, this.r);
        }
        if ((this.a & 256) == 256) {
            i2 += CodedOutputStream.j(9, this.s);
        }
        if ((this.a & 512) == 512) {
            i2 += CodedOutputStream.p(10, this.t);
        }
        if ((this.a & 1024) == 1024) {
            i2 += CodedOutputStream.p(11, this.u);
        }
        if ((this.a & 2048) == 2048) {
            i2 += CodedOutputStream.p(12, this.v);
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
            codedOutputStream.P(3, this.f);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.P(4, this.n);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.P(5, this.o);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.P(6, this.p);
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.K(7, this.q);
        }
        if ((this.a & 128) == 128) {
            codedOutputStream.K(8, this.r);
        }
        if ((this.a & 256) == 256) {
            codedOutputStream.K(9, this.s);
        }
        if ((this.a & 512) == 512) {
            codedOutputStream.P(10, this.t);
        }
        if ((this.a & 1024) == 1024) {
            codedOutputStream.P(11, this.u);
        }
        if ((this.a & 2048) == 2048) {
            codedOutputStream.P(12, this.v);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
