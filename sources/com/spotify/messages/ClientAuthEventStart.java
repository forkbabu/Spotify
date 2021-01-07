package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class ClientAuthEventStart extends GeneratedMessageLite<ClientAuthEventStart, b> implements Object {
    private static final ClientAuthEventStart s;
    private static volatile x<ClientAuthEventStart> t;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private o.i<String> n = GeneratedMessageLite.emptyProtobufList();
    private boolean o;
    private String p = "";
    private boolean q;
    private String r = "";

    public static final class b extends GeneratedMessageLite.b<ClientAuthEventStart, b> implements Object {
        public b m(Iterable<String> iterable) {
            copyOnWrite();
            ClientAuthEventStart.i((ClientAuthEventStart) this.instance, iterable);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            ClientAuthEventStart.m((ClientAuthEventStart) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            ClientAuthEventStart.o((ClientAuthEventStart) this.instance, str);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            ClientAuthEventStart.h((ClientAuthEventStart) this.instance, str);
            return this;
        }

        public b q(boolean z) {
            copyOnWrite();
            ClientAuthEventStart.n((ClientAuthEventStart) this.instance, z);
            return this;
        }

        public b r(boolean z) {
            copyOnWrite();
            ClientAuthEventStart.l((ClientAuthEventStart) this.instance, z);
            return this;
        }

        public b s(String str) {
            copyOnWrite();
            ClientAuthEventStart.q((ClientAuthEventStart) this.instance, str);
            return this;
        }

        public b t(String str) {
            copyOnWrite();
            ClientAuthEventStart.p((ClientAuthEventStart) this.instance, str);
            return this;
        }

        private b() {
            super(ClientAuthEventStart.s);
        }
    }

    static {
        ClientAuthEventStart clientAuthEventStart = new ClientAuthEventStart();
        s = clientAuthEventStart;
        clientAuthEventStart.makeImmutable();
    }

    private ClientAuthEventStart() {
    }

    static void h(ClientAuthEventStart clientAuthEventStart, String str) {
        clientAuthEventStart.getClass();
        str.getClass();
        clientAuthEventStart.a |= 1;
        clientAuthEventStart.b = str;
    }

    static void i(ClientAuthEventStart clientAuthEventStart, Iterable iterable) {
        if (!clientAuthEventStart.n.R0()) {
            clientAuthEventStart.n = GeneratedMessageLite.mutableCopy(clientAuthEventStart.n);
        }
        com.google.protobuf.a.addAll(iterable, clientAuthEventStart.n);
    }

    static void l(ClientAuthEventStart clientAuthEventStart, boolean z) {
        clientAuthEventStart.a |= 8;
        clientAuthEventStart.o = z;
    }

    static void m(ClientAuthEventStart clientAuthEventStart, String str) {
        clientAuthEventStart.getClass();
        str.getClass();
        clientAuthEventStart.a |= 16;
        clientAuthEventStart.p = str;
    }

    static void n(ClientAuthEventStart clientAuthEventStart, boolean z) {
        clientAuthEventStart.a |= 32;
        clientAuthEventStart.q = z;
    }

    static void o(ClientAuthEventStart clientAuthEventStart, String str) {
        clientAuthEventStart.getClass();
        str.getClass();
        clientAuthEventStart.a |= 64;
        clientAuthEventStart.r = str;
    }

    static void p(ClientAuthEventStart clientAuthEventStart, String str) {
        clientAuthEventStart.getClass();
        str.getClass();
        clientAuthEventStart.a |= 2;
        clientAuthEventStart.c = str;
    }

    public static x<ClientAuthEventStart> parser() {
        return s.getParserForType();
    }

    static void q(ClientAuthEventStart clientAuthEventStart, String str) {
        clientAuthEventStart.getClass();
        str.getClass();
        clientAuthEventStart.a |= 4;
        clientAuthEventStart.f = str;
    }

    public static b r() {
        return (b) s.toBuilder();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return s;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ClientAuthEventStart clientAuthEventStart = (ClientAuthEventStart) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (clientAuthEventStart.a & 1) == 1, clientAuthEventStart.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (clientAuthEventStart.a & 2) == 2, clientAuthEventStart.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (clientAuthEventStart.a & 4) == 4, clientAuthEventStart.f);
                this.n = hVar.q(this.n, clientAuthEventStart.n);
                this.o = hVar.f((this.a & 8) == 8, this.o, (clientAuthEventStart.a & 8) == 8, clientAuthEventStart.o);
                this.p = hVar.n((this.a & 16) == 16, this.p, (clientAuthEventStart.a & 16) == 16, clientAuthEventStart.p);
                this.q = hVar.f((this.a & 32) == 32, this.q, (clientAuthEventStart.a & 32) == 32, clientAuthEventStart.q);
                boolean z2 = (this.a & 64) == 64;
                String str = this.r;
                if ((clientAuthEventStart.a & 64) == 64) {
                    z = true;
                }
                this.r = hVar.n(z2, str, z, clientAuthEventStart.r);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= clientAuthEventStart.a;
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
                                if (!this.n.R0()) {
                                    this.n = GeneratedMessageLite.mutableCopy(this.n);
                                }
                                this.n.add(z6);
                            } else if (B == 40) {
                                this.a |= 8;
                                this.o = gVar.h();
                            } else if (B == 50) {
                                String z7 = gVar.z();
                                this.a |= 16;
                                this.p = z7;
                            } else if (B == 56) {
                                this.a |= 32;
                                this.q = gVar.h();
                            } else if (B == 66) {
                                String z8 = gVar.z();
                                this.a |= 64;
                                this.r = z8;
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
                this.n.C();
                return null;
            case 4:
                return new ClientAuthEventStart();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (t == null) {
                    synchronized (ClientAuthEventStart.class) {
                        if (t == null) {
                            t = new GeneratedMessageLite.c(s);
                        }
                    }
                }
                return t;
            default:
                throw new UnsupportedOperationException();
        }
        return s;
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
        int i2 = 0;
        for (int i3 = 0; i3 < this.n.size(); i3++) {
            i2 += CodedOutputStream.q(this.n.get(i3));
        }
        int C0 = je.C0(this.n, 1, p2 + i2);
        if ((this.a & 8) == 8) {
            C0 += CodedOutputStream.d(5, this.o);
        }
        if ((this.a & 16) == 16) {
            C0 += CodedOutputStream.p(6, this.p);
        }
        if ((this.a & 32) == 32) {
            C0 += CodedOutputStream.d(7, this.q);
        }
        if ((this.a & 64) == 64) {
            C0 += CodedOutputStream.p(8, this.r);
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
        for (int i = 0; i < this.n.size(); i++) {
            codedOutputStream.P(4, this.n.get(i));
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.A(5, this.o);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.P(6, this.p);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.A(7, this.q);
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.P(8, this.r);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
