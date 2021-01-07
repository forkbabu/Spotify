package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class PartnerAccountLinkingResult extends GeneratedMessageLite<PartnerAccountLinkingResult, b> implements Object {
    private static final PartnerAccountLinkingResult p;
    private static volatile x<PartnerAccountLinkingResult> q;
    private int a;
    private String b = "";
    private boolean c;
    private String f = "";
    private String n = "";
    private String o = "";

    public static final class b extends GeneratedMessageLite.b<PartnerAccountLinkingResult, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            PartnerAccountLinkingResult.i((PartnerAccountLinkingResult) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            PartnerAccountLinkingResult.n((PartnerAccountLinkingResult) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            PartnerAccountLinkingResult.h((PartnerAccountLinkingResult) this.instance, str);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            PartnerAccountLinkingResult.m((PartnerAccountLinkingResult) this.instance, str);
            return this;
        }

        public b q(boolean z) {
            copyOnWrite();
            PartnerAccountLinkingResult.l((PartnerAccountLinkingResult) this.instance, z);
            return this;
        }

        private b() {
            super(PartnerAccountLinkingResult.p);
        }
    }

    static {
        PartnerAccountLinkingResult partnerAccountLinkingResult = new PartnerAccountLinkingResult();
        p = partnerAccountLinkingResult;
        partnerAccountLinkingResult.makeImmutable();
    }

    private PartnerAccountLinkingResult() {
    }

    static void h(PartnerAccountLinkingResult partnerAccountLinkingResult, String str) {
        partnerAccountLinkingResult.getClass();
        str.getClass();
        partnerAccountLinkingResult.a |= 1;
        partnerAccountLinkingResult.b = str;
    }

    static void i(PartnerAccountLinkingResult partnerAccountLinkingResult, String str) {
        partnerAccountLinkingResult.getClass();
        str.getClass();
        partnerAccountLinkingResult.a |= 16;
        partnerAccountLinkingResult.o = str;
    }

    static void l(PartnerAccountLinkingResult partnerAccountLinkingResult, boolean z) {
        partnerAccountLinkingResult.a |= 2;
        partnerAccountLinkingResult.c = z;
    }

    static void m(PartnerAccountLinkingResult partnerAccountLinkingResult, String str) {
        partnerAccountLinkingResult.getClass();
        str.getClass();
        partnerAccountLinkingResult.a |= 4;
        partnerAccountLinkingResult.f = str;
    }

    static void n(PartnerAccountLinkingResult partnerAccountLinkingResult, String str) {
        partnerAccountLinkingResult.getClass();
        str.getClass();
        partnerAccountLinkingResult.a |= 8;
        partnerAccountLinkingResult.n = str;
    }

    public static b o() {
        return (b) p.toBuilder();
    }

    public static x<PartnerAccountLinkingResult> parser() {
        return p.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return p;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PartnerAccountLinkingResult partnerAccountLinkingResult = (PartnerAccountLinkingResult) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (partnerAccountLinkingResult.a & 1) == 1, partnerAccountLinkingResult.b);
                this.c = hVar.f((this.a & 2) == 2, this.c, (partnerAccountLinkingResult.a & 2) == 2, partnerAccountLinkingResult.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (partnerAccountLinkingResult.a & 4) == 4, partnerAccountLinkingResult.f);
                this.n = hVar.n((this.a & 8) == 8, this.n, (partnerAccountLinkingResult.a & 8) == 8, partnerAccountLinkingResult.n);
                boolean z2 = (this.a & 16) == 16;
                String str = this.o;
                if ((partnerAccountLinkingResult.a & 16) == 16) {
                    z = true;
                }
                this.o = hVar.n(z2, str, z, partnerAccountLinkingResult.o);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= partnerAccountLinkingResult.a;
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
                                this.c = gVar.h();
                            } else if (B == 26) {
                                String z4 = gVar.z();
                                this.a |= 4;
                                this.f = z4;
                            } else if (B == 34) {
                                String z5 = gVar.z();
                                this.a |= 8;
                                this.n = z5;
                            } else if (B == 42) {
                                String z6 = gVar.z();
                                this.a |= 16;
                                this.o = z6;
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
                return new PartnerAccountLinkingResult();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (q == null) {
                    synchronized (PartnerAccountLinkingResult.class) {
                        if (q == null) {
                            q = new GeneratedMessageLite.c(p);
                        }
                    }
                }
                return q;
            default:
                throw new UnsupportedOperationException();
        }
        return p;
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
            i2 += CodedOutputStream.d(2, this.c);
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
            codedOutputStream.A(2, this.c);
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
        this.unknownFields.l(codedOutputStream);
    }
}
