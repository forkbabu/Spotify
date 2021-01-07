package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class TtsPlayback extends GeneratedMessageLite<TtsPlayback, b> implements Object {
    private static final TtsPlayback u;
    private static volatile x<TtsPlayback> v;
    private int a;
    private String b = "";
    private int c;
    private int f;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private String r = "";
    private String s = "";
    private String t = "";

    public static final class b extends GeneratedMessageLite.b<TtsPlayback, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            TtsPlayback.m((TtsPlayback) this.instance, str);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            TtsPlayback.l((TtsPlayback) this.instance, str);
            return this;
        }

        public b o(int i) {
            copyOnWrite();
            TtsPlayback.i((TtsPlayback) this.instance, i);
            return this;
        }

        public b p(String str) {
            copyOnWrite();
            TtsPlayback.h((TtsPlayback) this.instance, str);
            return this;
        }

        private b() {
            super(TtsPlayback.u);
        }
    }

    static {
        TtsPlayback ttsPlayback = new TtsPlayback();
        u = ttsPlayback;
        ttsPlayback.makeImmutable();
    }

    private TtsPlayback() {
    }

    static void h(TtsPlayback ttsPlayback, String str) {
        ttsPlayback.getClass();
        str.getClass();
        ttsPlayback.a |= 1;
        ttsPlayback.b = str;
    }

    static void i(TtsPlayback ttsPlayback, int i) {
        ttsPlayback.a |= 32;
        ttsPlayback.p = i;
    }

    static void l(TtsPlayback ttsPlayback, String str) {
        ttsPlayback.getClass();
        str.getClass();
        ttsPlayback.a |= 256;
        ttsPlayback.s = str;
    }

    static void m(TtsPlayback ttsPlayback, String str) {
        ttsPlayback.getClass();
        str.getClass();
        ttsPlayback.a |= 512;
        ttsPlayback.t = str;
    }

    public static b n() {
        return (b) u.toBuilder();
    }

    public static x<TtsPlayback> parser() {
        return u.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return u;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                TtsPlayback ttsPlayback = (TtsPlayback) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (ttsPlayback.a & 1) == 1, ttsPlayback.b);
                this.c = hVar.m((this.a & 2) == 2, this.c, (ttsPlayback.a & 2) == 2, ttsPlayback.c);
                this.f = hVar.m((this.a & 4) == 4, this.f, (ttsPlayback.a & 4) == 4, ttsPlayback.f);
                this.n = hVar.m((this.a & 8) == 8, this.n, (ttsPlayback.a & 8) == 8, ttsPlayback.n);
                this.o = hVar.m((this.a & 16) == 16, this.o, (ttsPlayback.a & 16) == 16, ttsPlayback.o);
                this.p = hVar.m((this.a & 32) == 32, this.p, (ttsPlayback.a & 32) == 32, ttsPlayback.p);
                this.q = hVar.f((this.a & 64) == 64, this.q, (ttsPlayback.a & 64) == 64, ttsPlayback.q);
                this.r = hVar.n((this.a & 128) == 128, this.r, (ttsPlayback.a & 128) == 128, ttsPlayback.r);
                this.s = hVar.n((this.a & 256) == 256, this.s, (ttsPlayback.a & 256) == 256, ttsPlayback.s);
                this.t = hVar.n((this.a & 512) == 512, this.t, (ttsPlayback.a & 512) == 512, ttsPlayback.t);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= ttsPlayback.a;
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
                            case 16:
                                this.a |= 2;
                                this.c = gVar.u();
                                continue;
                            case 24:
                                this.a |= 4;
                                this.f = gVar.u();
                                continue;
                            case 32:
                                this.a |= 8;
                                this.n = gVar.u();
                                continue;
                            case 40:
                                this.a |= 16;
                                this.o = gVar.u();
                                continue;
                            case 48:
                                this.a |= 32;
                                this.p = gVar.u();
                                continue;
                            case 56:
                                this.a |= 64;
                                this.q = gVar.h();
                                continue;
                            case 66:
                                String z3 = gVar.z();
                                this.a |= 128;
                                this.r = z3;
                                continue;
                            case 74:
                                String z4 = gVar.z();
                                this.a |= 256;
                                this.s = z4;
                                continue;
                            case 82:
                                String z5 = gVar.z();
                                this.a |= 512;
                                this.t = z5;
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
                return new TtsPlayback();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (v == null) {
                    synchronized (TtsPlayback.class) {
                        if (v == null) {
                            v = new GeneratedMessageLite.c(u);
                        }
                    }
                }
                return v;
            default:
                throw new UnsupportedOperationException();
        }
        return u;
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
            i2 += CodedOutputStream.j(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.j(3, this.f);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.j(4, this.n);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.j(5, this.o);
        }
        if ((this.a & 32) == 32) {
            i2 += CodedOutputStream.j(6, this.p);
        }
        if ((this.a & 64) == 64) {
            i2 += CodedOutputStream.d(7, this.q);
        }
        if ((this.a & 128) == 128) {
            i2 += CodedOutputStream.p(8, this.r);
        }
        if ((this.a & 256) == 256) {
            i2 += CodedOutputStream.p(9, this.s);
        }
        if ((this.a & 512) == 512) {
            i2 += CodedOutputStream.p(10, this.t);
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
            codedOutputStream.K(2, this.c);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.K(3, this.f);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.K(4, this.n);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.K(5, this.o);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.K(6, this.p);
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.A(7, this.q);
        }
        if ((this.a & 128) == 128) {
            codedOutputStream.P(8, this.r);
        }
        if ((this.a & 256) == 256) {
            codedOutputStream.P(9, this.s);
        }
        if ((this.a & 512) == 512) {
            codedOutputStream.P(10, this.t);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
