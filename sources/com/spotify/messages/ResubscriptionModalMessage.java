package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class ResubscriptionModalMessage extends GeneratedMessageLite<ResubscriptionModalMessage, b> implements Object {
    private static final ResubscriptionModalMessage p;
    private static volatile x<ResubscriptionModalMessage> q;
    private int a;
    private String b = "";
    private long c;
    private String f = "";
    private String n = "";
    private String o = "";

    public static final class b extends GeneratedMessageLite.b<ResubscriptionModalMessage, b> implements Object {
        public b m(long j) {
            copyOnWrite();
            ResubscriptionModalMessage.i((ResubscriptionModalMessage) this.instance, j);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            ResubscriptionModalMessage.h((ResubscriptionModalMessage) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            ResubscriptionModalMessage.l((ResubscriptionModalMessage) this.instance, str);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            ResubscriptionModalMessage.m((ResubscriptionModalMessage) this.instance, str);
            return this;
        }

        private b() {
            super(ResubscriptionModalMessage.p);
        }
    }

    static {
        ResubscriptionModalMessage resubscriptionModalMessage = new ResubscriptionModalMessage();
        p = resubscriptionModalMessage;
        resubscriptionModalMessage.makeImmutable();
    }

    private ResubscriptionModalMessage() {
    }

    static void h(ResubscriptionModalMessage resubscriptionModalMessage, String str) {
        resubscriptionModalMessage.getClass();
        str.getClass();
        resubscriptionModalMessage.a |= 1;
        resubscriptionModalMessage.b = str;
    }

    static void i(ResubscriptionModalMessage resubscriptionModalMessage, long j) {
        resubscriptionModalMessage.a |= 2;
        resubscriptionModalMessage.c = j;
    }

    static void l(ResubscriptionModalMessage resubscriptionModalMessage, String str) {
        resubscriptionModalMessage.getClass();
        str.getClass();
        resubscriptionModalMessage.a |= 4;
        resubscriptionModalMessage.f = str;
    }

    static void m(ResubscriptionModalMessage resubscriptionModalMessage, String str) {
        resubscriptionModalMessage.getClass();
        str.getClass();
        resubscriptionModalMessage.a |= 8;
        resubscriptionModalMessage.n = str;
    }

    public static b n() {
        return (b) p.toBuilder();
    }

    public static x<ResubscriptionModalMessage> parser() {
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
                ResubscriptionModalMessage resubscriptionModalMessage = (ResubscriptionModalMessage) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (resubscriptionModalMessage.a & 1) == 1, resubscriptionModalMessage.b);
                this.c = hVar.s((this.a & 2) == 2, this.c, (resubscriptionModalMessage.a & 2) == 2, resubscriptionModalMessage.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (resubscriptionModalMessage.a & 4) == 4, resubscriptionModalMessage.f);
                this.n = hVar.n((this.a & 8) == 8, this.n, (resubscriptionModalMessage.a & 8) == 8, resubscriptionModalMessage.n);
                boolean z2 = (this.a & 16) == 16;
                String str = this.o;
                if ((resubscriptionModalMessage.a & 16) == 16) {
                    z = true;
                }
                this.o = hVar.n(z2, str, z, resubscriptionModalMessage.o);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= resubscriptionModalMessage.a;
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
                return new ResubscriptionModalMessage();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (q == null) {
                    synchronized (ResubscriptionModalMessage.class) {
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
            i2 += CodedOutputStream.l(2, this.c);
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
            codedOutputStream.U(2, this.c);
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
