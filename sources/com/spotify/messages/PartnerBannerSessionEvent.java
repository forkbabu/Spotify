package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class PartnerBannerSessionEvent extends GeneratedMessageLite<PartnerBannerSessionEvent, b> implements Object {
    private static final PartnerBannerSessionEvent r;
    private static volatile x<PartnerBannerSessionEvent> s;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private long n;
    private String o = "";
    private o.i<String> p = GeneratedMessageLite.emptyProtobufList();
    private String q = "";

    public static final class b extends GeneratedMessageLite.b<PartnerBannerSessionEvent, b> implements Object {
        public b m(Iterable<String> iterable) {
            copyOnWrite();
            PartnerBannerSessionEvent.m((PartnerBannerSessionEvent) this.instance, iterable);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            PartnerBannerSessionEvent.h((PartnerBannerSessionEvent) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            PartnerBannerSessionEvent.n((PartnerBannerSessionEvent) this.instance, str);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            PartnerBannerSessionEvent.p((PartnerBannerSessionEvent) this.instance, str);
            return this;
        }

        public b q(String str) {
            copyOnWrite();
            PartnerBannerSessionEvent.o((PartnerBannerSessionEvent) this.instance, str);
            return this;
        }

        public b r(long j) {
            copyOnWrite();
            PartnerBannerSessionEvent.i((PartnerBannerSessionEvent) this.instance, j);
            return this;
        }

        public b s(String str) {
            copyOnWrite();
            PartnerBannerSessionEvent.l((PartnerBannerSessionEvent) this.instance, str);
            return this;
        }

        private b() {
            super(PartnerBannerSessionEvent.r);
        }
    }

    static {
        PartnerBannerSessionEvent partnerBannerSessionEvent = new PartnerBannerSessionEvent();
        r = partnerBannerSessionEvent;
        partnerBannerSessionEvent.makeImmutable();
    }

    private PartnerBannerSessionEvent() {
    }

    static void h(PartnerBannerSessionEvent partnerBannerSessionEvent, String str) {
        partnerBannerSessionEvent.getClass();
        str.getClass();
        partnerBannerSessionEvent.a |= 1;
        partnerBannerSessionEvent.b = str;
    }

    static void i(PartnerBannerSessionEvent partnerBannerSessionEvent, long j) {
        partnerBannerSessionEvent.a |= 8;
        partnerBannerSessionEvent.n = j;
    }

    static void l(PartnerBannerSessionEvent partnerBannerSessionEvent, String str) {
        partnerBannerSessionEvent.getClass();
        str.getClass();
        partnerBannerSessionEvent.a |= 16;
        partnerBannerSessionEvent.o = str;
    }

    static void m(PartnerBannerSessionEvent partnerBannerSessionEvent, Iterable iterable) {
        if (!partnerBannerSessionEvent.p.R0()) {
            partnerBannerSessionEvent.p = GeneratedMessageLite.mutableCopy(partnerBannerSessionEvent.p);
        }
        com.google.protobuf.a.addAll(iterable, partnerBannerSessionEvent.p);
    }

    static void n(PartnerBannerSessionEvent partnerBannerSessionEvent, String str) {
        partnerBannerSessionEvent.getClass();
        str.getClass();
        partnerBannerSessionEvent.a |= 32;
        partnerBannerSessionEvent.q = str;
    }

    static void o(PartnerBannerSessionEvent partnerBannerSessionEvent, String str) {
        partnerBannerSessionEvent.getClass();
        str.getClass();
        partnerBannerSessionEvent.a |= 2;
        partnerBannerSessionEvent.c = str;
    }

    static void p(PartnerBannerSessionEvent partnerBannerSessionEvent, String str) {
        partnerBannerSessionEvent.getClass();
        str.getClass();
        partnerBannerSessionEvent.a |= 4;
        partnerBannerSessionEvent.f = str;
    }

    public static x<PartnerBannerSessionEvent> parser() {
        return r.getParserForType();
    }

    public static b q() {
        return (b) r.toBuilder();
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
                PartnerBannerSessionEvent partnerBannerSessionEvent = (PartnerBannerSessionEvent) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (partnerBannerSessionEvent.a & 1) == 1, partnerBannerSessionEvent.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (partnerBannerSessionEvent.a & 2) == 2, partnerBannerSessionEvent.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (partnerBannerSessionEvent.a & 4) == 4, partnerBannerSessionEvent.f);
                this.n = hVar.s((this.a & 8) == 8, this.n, (partnerBannerSessionEvent.a & 8) == 8, partnerBannerSessionEvent.n);
                this.o = hVar.n((this.a & 16) == 16, this.o, (partnerBannerSessionEvent.a & 16) == 16, partnerBannerSessionEvent.o);
                this.p = hVar.q(this.p, partnerBannerSessionEvent.p);
                boolean z2 = (this.a & 32) == 32;
                String str = this.q;
                if ((partnerBannerSessionEvent.a & 32) == 32) {
                    z = true;
                }
                this.q = hVar.n(z2, str, z, partnerBannerSessionEvent.q);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= partnerBannerSessionEvent.a;
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
                            } else if (B == 32) {
                                this.a |= 8;
                                this.n = gVar.w();
                            } else if (B == 42) {
                                String z6 = gVar.z();
                                this.a |= 16;
                                this.o = z6;
                            } else if (B == 50) {
                                String z7 = gVar.z();
                                if (!this.p.R0()) {
                                    this.p = GeneratedMessageLite.mutableCopy(this.p);
                                }
                                this.p.add(z7);
                            } else if (B == 58) {
                                String z8 = gVar.z();
                                this.a |= 32;
                                this.q = z8;
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
                this.p.C();
                return null;
            case 4:
                return new PartnerBannerSessionEvent();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (s == null) {
                    synchronized (PartnerBannerSessionEvent.class) {
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
        int p2 = (this.a & 1) == 1 ? CodedOutputStream.p(1, this.b) + 0 : 0;
        if ((this.a & 2) == 2) {
            p2 += CodedOutputStream.p(2, this.c);
        }
        if ((this.a & 4) == 4) {
            p2 += CodedOutputStream.p(3, this.f);
        }
        if ((this.a & 8) == 8) {
            p2 += CodedOutputStream.l(4, this.n);
        }
        if ((this.a & 16) == 16) {
            p2 += CodedOutputStream.p(5, this.o);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.p.size(); i3++) {
            i2 += CodedOutputStream.q(this.p.get(i3));
        }
        int C0 = je.C0(this.p, 1, p2 + i2);
        if ((this.a & 32) == 32) {
            C0 += CodedOutputStream.p(7, this.q);
        }
        int c2 = this.unknownFields.c() + C0;
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
            codedOutputStream.U(4, this.n);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.P(5, this.o);
        }
        for (int i = 0; i < this.p.size(); i++) {
            codedOutputStream.P(6, this.p.get(i));
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.P(7, this.q);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
