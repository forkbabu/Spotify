package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class TasteOnboardingSearchInteraction extends GeneratedMessageLite<TasteOnboardingSearchInteraction, b> implements Object {
    private static final TasteOnboardingSearchInteraction r;
    private static volatile x<TasteOnboardingSearchInteraction> s;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private String n = "";
    private String o = "";
    private String p = "";
    private String q = "";

    public static final class b extends GeneratedMessageLite.b<TasteOnboardingSearchInteraction, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            TasteOnboardingSearchInteraction.n((TasteOnboardingSearchInteraction) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            TasteOnboardingSearchInteraction.h((TasteOnboardingSearchInteraction) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            TasteOnboardingSearchInteraction.m((TasteOnboardingSearchInteraction) this.instance, str);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            TasteOnboardingSearchInteraction.i((TasteOnboardingSearchInteraction) this.instance, str);
            return this;
        }

        public b q(String str) {
            copyOnWrite();
            TasteOnboardingSearchInteraction.l((TasteOnboardingSearchInteraction) this.instance, str);
            return this;
        }

        public b r(String str) {
            copyOnWrite();
            TasteOnboardingSearchInteraction.o((TasteOnboardingSearchInteraction) this.instance, str);
            return this;
        }

        private b() {
            super(TasteOnboardingSearchInteraction.r);
        }
    }

    static {
        TasteOnboardingSearchInteraction tasteOnboardingSearchInteraction = new TasteOnboardingSearchInteraction();
        r = tasteOnboardingSearchInteraction;
        tasteOnboardingSearchInteraction.makeImmutable();
    }

    private TasteOnboardingSearchInteraction() {
    }

    static void h(TasteOnboardingSearchInteraction tasteOnboardingSearchInteraction, String str) {
        tasteOnboardingSearchInteraction.getClass();
        str.getClass();
        tasteOnboardingSearchInteraction.a |= 1;
        tasteOnboardingSearchInteraction.b = str;
    }

    static void i(TasteOnboardingSearchInteraction tasteOnboardingSearchInteraction, String str) {
        tasteOnboardingSearchInteraction.getClass();
        str.getClass();
        tasteOnboardingSearchInteraction.a |= 8;
        tasteOnboardingSearchInteraction.n = str;
    }

    static void l(TasteOnboardingSearchInteraction tasteOnboardingSearchInteraction, String str) {
        tasteOnboardingSearchInteraction.getClass();
        str.getClass();
        tasteOnboardingSearchInteraction.a |= 16;
        tasteOnboardingSearchInteraction.o = str;
    }

    static void m(TasteOnboardingSearchInteraction tasteOnboardingSearchInteraction, String str) {
        tasteOnboardingSearchInteraction.getClass();
        str.getClass();
        tasteOnboardingSearchInteraction.a |= 32;
        tasteOnboardingSearchInteraction.p = str;
    }

    static void n(TasteOnboardingSearchInteraction tasteOnboardingSearchInteraction, String str) {
        tasteOnboardingSearchInteraction.getClass();
        str.getClass();
        tasteOnboardingSearchInteraction.a |= 2;
        tasteOnboardingSearchInteraction.c = str;
    }

    static void o(TasteOnboardingSearchInteraction tasteOnboardingSearchInteraction, String str) {
        tasteOnboardingSearchInteraction.getClass();
        str.getClass();
        tasteOnboardingSearchInteraction.a |= 4;
        tasteOnboardingSearchInteraction.f = str;
    }

    public static b p() {
        return (b) r.toBuilder();
    }

    public static x<TasteOnboardingSearchInteraction> parser() {
        return r.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return r;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                TasteOnboardingSearchInteraction tasteOnboardingSearchInteraction = (TasteOnboardingSearchInteraction) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (tasteOnboardingSearchInteraction.a & 1) == 1, tasteOnboardingSearchInteraction.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (tasteOnboardingSearchInteraction.a & 2) == 2, tasteOnboardingSearchInteraction.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (tasteOnboardingSearchInteraction.a & 4) == 4, tasteOnboardingSearchInteraction.f);
                this.n = hVar.n((this.a & 8) == 8, this.n, (tasteOnboardingSearchInteraction.a & 8) == 8, tasteOnboardingSearchInteraction.n);
                this.o = hVar.n((this.a & 16) == 16, this.o, (tasteOnboardingSearchInteraction.a & 16) == 16, tasteOnboardingSearchInteraction.o);
                this.p = hVar.n((this.a & 32) == 32, this.p, (tasteOnboardingSearchInteraction.a & 32) == 32, tasteOnboardingSearchInteraction.p);
                boolean z2 = (this.a & 64) == 64;
                String str = this.q;
                if ((tasteOnboardingSearchInteraction.a & 64) == 64) {
                    z = true;
                }
                this.q = hVar.n(z2, str, z, tasteOnboardingSearchInteraction.q);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= tasteOnboardingSearchInteraction.a;
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
                            } else if (B == 18) {
                                String z4 = gVar.z();
                                this.a |= 2;
                                this.c = z4;
                            } else if (B == 26) {
                                String z5 = gVar.z();
                                this.a |= 4;
                                this.f = z5;
                            } else if (B == 34) {
                                String z6 = gVar.z();
                                this.a |= 8;
                                this.n = z6;
                            } else if (B == 42) {
                                String z7 = gVar.z();
                                this.a |= 16;
                                this.o = z7;
                            } else if (B == 50) {
                                String z8 = gVar.z();
                                this.a |= 32;
                                this.p = z8;
                            } else if (B == 58) {
                                String z9 = gVar.z();
                                this.a |= 64;
                                this.q = z9;
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
                return new TasteOnboardingSearchInteraction();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (s == null) {
                    synchronized (TasteOnboardingSearchInteraction.class) {
                        if (s == null) {
                            s = new GeneratedMessageLite.c(r);
                        }
                    }
                }
                return s;
            default:
                throw new UnsupportedOperationException();
        }
        return r;
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
            i2 += CodedOutputStream.p(7, this.q);
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
            codedOutputStream.P(7, this.q);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
