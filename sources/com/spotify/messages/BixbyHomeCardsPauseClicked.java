package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class BixbyHomeCardsPauseClicked extends GeneratedMessageLite<BixbyHomeCardsPauseClicked, b> implements Object {
    private static final BixbyHomeCardsPauseClicked o;
    private static volatile x<BixbyHomeCardsPauseClicked> p;
    private int a;
    private int b;
    private String c = "";
    private String f = "";
    private String n = "";

    public static final class b extends GeneratedMessageLite.b<BixbyHomeCardsPauseClicked, b> implements Object {
        public b m(int i) {
            copyOnWrite();
            BixbyHomeCardsPauseClicked.h((BixbyHomeCardsPauseClicked) this.instance, i);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            BixbyHomeCardsPauseClicked.m((BixbyHomeCardsPauseClicked) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            BixbyHomeCardsPauseClicked.i((BixbyHomeCardsPauseClicked) this.instance, str);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            BixbyHomeCardsPauseClicked.l((BixbyHomeCardsPauseClicked) this.instance, str);
            return this;
        }

        private b() {
            super(BixbyHomeCardsPauseClicked.o);
        }
    }

    static {
        BixbyHomeCardsPauseClicked bixbyHomeCardsPauseClicked = new BixbyHomeCardsPauseClicked();
        o = bixbyHomeCardsPauseClicked;
        bixbyHomeCardsPauseClicked.makeImmutable();
    }

    private BixbyHomeCardsPauseClicked() {
    }

    static void h(BixbyHomeCardsPauseClicked bixbyHomeCardsPauseClicked, int i) {
        bixbyHomeCardsPauseClicked.a |= 1;
        bixbyHomeCardsPauseClicked.b = i;
    }

    static void i(BixbyHomeCardsPauseClicked bixbyHomeCardsPauseClicked, String str) {
        bixbyHomeCardsPauseClicked.getClass();
        str.getClass();
        bixbyHomeCardsPauseClicked.a |= 2;
        bixbyHomeCardsPauseClicked.c = str;
    }

    static void l(BixbyHomeCardsPauseClicked bixbyHomeCardsPauseClicked, String str) {
        bixbyHomeCardsPauseClicked.getClass();
        str.getClass();
        bixbyHomeCardsPauseClicked.a |= 4;
        bixbyHomeCardsPauseClicked.f = str;
    }

    static void m(BixbyHomeCardsPauseClicked bixbyHomeCardsPauseClicked, String str) {
        bixbyHomeCardsPauseClicked.getClass();
        str.getClass();
        bixbyHomeCardsPauseClicked.a |= 8;
        bixbyHomeCardsPauseClicked.n = str;
    }

    public static b n() {
        return (b) o.toBuilder();
    }

    public static x<BixbyHomeCardsPauseClicked> parser() {
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
                BixbyHomeCardsPauseClicked bixbyHomeCardsPauseClicked = (BixbyHomeCardsPauseClicked) obj2;
                this.b = hVar.m((this.a & 1) == 1, this.b, (bixbyHomeCardsPauseClicked.a & 1) == 1, bixbyHomeCardsPauseClicked.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (bixbyHomeCardsPauseClicked.a & 2) == 2, bixbyHomeCardsPauseClicked.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (bixbyHomeCardsPauseClicked.a & 4) == 4, bixbyHomeCardsPauseClicked.f);
                boolean z2 = (this.a & 8) == 8;
                String str = this.n;
                if ((bixbyHomeCardsPauseClicked.a & 8) == 8) {
                    z = true;
                }
                this.n = hVar.n(z2, str, z, bixbyHomeCardsPauseClicked.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= bixbyHomeCardsPauseClicked.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.a |= 1;
                                this.b = gVar.u();
                            } else if (B == 18) {
                                String z3 = gVar.z();
                                this.a |= 2;
                                this.c = z3;
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
                return new BixbyHomeCardsPauseClicked();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (BixbyHomeCardsPauseClicked.class) {
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
            i2 = 0 + CodedOutputStream.j(1, this.b);
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
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.K(1, this.b);
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
        this.unknownFields.l(codedOutputStream);
    }
}
