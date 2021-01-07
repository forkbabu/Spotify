package com.spotify.wrapped2020.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.wrapped2020.v1.proto.ShareConfiguration;
import java.io.IOException;

public final class IntroStoryResponse extends GeneratedMessageLite<IntroStoryResponse, b> implements Object {
    private static final IntroStoryResponse x;
    private static volatile x<IntroStoryResponse> y;
    private String a = "";
    private String b = "";
    private String c = "";
    private int f;
    private String n = "";
    private String o = "";
    private String p = "";
    private String q = "";
    private String r = "";
    private String s = "";
    private String t = "";
    private String u = "";
    private ShareConfiguration v;
    private String w = "";

    public static final class b extends GeneratedMessageLite.b<IntroStoryResponse, b> implements Object {
        private b() {
            super(IntroStoryResponse.x);
        }
    }

    static {
        IntroStoryResponse introStoryResponse = new IntroStoryResponse();
        x = introStoryResponse;
        introStoryResponse.makeImmutable();
    }

    private IntroStoryResponse() {
    }

    public static IntroStoryResponse n() {
        return x;
    }

    public static x<IntroStoryResponse> parser() {
        return x.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return x;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                IntroStoryResponse introStoryResponse = (IntroStoryResponse) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !introStoryResponse.a.isEmpty(), introStoryResponse.a);
                this.b = hVar.n(!this.b.isEmpty(), this.b, !introStoryResponse.b.isEmpty(), introStoryResponse.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !introStoryResponse.c.isEmpty(), introStoryResponse.c);
                int i = this.f;
                boolean z2 = i != 0;
                int i2 = introStoryResponse.f;
                if (i2 != 0) {
                    z = true;
                }
                this.f = hVar.m(z2, i, z, i2);
                this.n = hVar.n(!this.n.isEmpty(), this.n, !introStoryResponse.n.isEmpty(), introStoryResponse.n);
                this.o = hVar.n(!this.o.isEmpty(), this.o, !introStoryResponse.o.isEmpty(), introStoryResponse.o);
                this.p = hVar.n(!this.p.isEmpty(), this.p, !introStoryResponse.p.isEmpty(), introStoryResponse.p);
                this.q = hVar.n(!this.q.isEmpty(), this.q, !introStoryResponse.q.isEmpty(), introStoryResponse.q);
                this.r = hVar.n(!this.r.isEmpty(), this.r, !introStoryResponse.r.isEmpty(), introStoryResponse.r);
                this.s = hVar.n(!this.s.isEmpty(), this.s, !introStoryResponse.s.isEmpty(), introStoryResponse.s);
                this.t = hVar.n(!this.t.isEmpty(), this.t, !introStoryResponse.t.isEmpty(), introStoryResponse.t);
                this.u = hVar.n(!this.u.isEmpty(), this.u, !introStoryResponse.u.isEmpty(), introStoryResponse.u);
                this.v = (ShareConfiguration) hVar.i(this.v, introStoryResponse.v);
                this.w = hVar.n(!this.w.isEmpty(), this.w, !introStoryResponse.w.isEmpty(), introStoryResponse.w);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        switch (B) {
                            case 0:
                                break;
                            case 10:
                                this.a = gVar.A();
                                continue;
                            case 18:
                                this.b = gVar.A();
                                continue;
                            case 26:
                                this.c = gVar.A();
                                continue;
                            case 32:
                                this.f = gVar.u();
                                continue;
                            case 42:
                                this.n = gVar.A();
                                continue;
                            case 50:
                                this.o = gVar.A();
                                continue;
                            case 58:
                                this.p = gVar.A();
                                continue;
                            case 66:
                                this.q = gVar.A();
                                continue;
                            case 74:
                                this.r = gVar.A();
                                continue;
                            case 82:
                                this.s = gVar.A();
                                continue;
                            case 90:
                                this.t = gVar.A();
                                continue;
                            case 98:
                                this.u = gVar.A();
                                continue;
                            case 106:
                                ShareConfiguration shareConfiguration = this.v;
                                ShareConfiguration.b bVar = shareConfiguration != null ? (ShareConfiguration.b) shareConfiguration.toBuilder() : null;
                                ShareConfiguration shareConfiguration2 = (ShareConfiguration) gVar.o(ShareConfiguration.parser(), kVar);
                                this.v = shareConfiguration2;
                                if (bVar != null) {
                                    bVar.mergeFrom((ShareConfiguration.b) shareConfiguration2);
                                    this.v = (ShareConfiguration) bVar.buildPartial();
                                } else {
                                    continue;
                                }
                            case 114:
                                this.w = gVar.A();
                                continue;
                            default:
                                if (gVar.F(B)) {
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
                return new IntroStoryResponse();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (y == null) {
                    synchronized (IntroStoryResponse.class) {
                        if (y == null) {
                            y = new GeneratedMessageLite.c(x);
                        }
                    }
                }
                return y;
            default:
                throw new UnsupportedOperationException();
        }
        return x;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.a.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.a);
        }
        if (!this.b.isEmpty()) {
            i2 += CodedOutputStream.p(2, this.b);
        }
        if (!this.c.isEmpty()) {
            i2 += CodedOutputStream.p(3, this.c);
        }
        if (this.f != Gradient.VERSION_1.getNumber()) {
            i2 += CodedOutputStream.h(4, this.f);
        }
        if (!this.n.isEmpty()) {
            i2 += CodedOutputStream.p(5, this.n);
        }
        if (!this.o.isEmpty()) {
            i2 += CodedOutputStream.p(6, this.o);
        }
        if (!this.p.isEmpty()) {
            i2 += CodedOutputStream.p(7, this.p);
        }
        if (!this.q.isEmpty()) {
            i2 += CodedOutputStream.p(8, this.q);
        }
        if (!this.r.isEmpty()) {
            i2 += CodedOutputStream.p(9, this.r);
        }
        if (!this.s.isEmpty()) {
            i2 += CodedOutputStream.p(10, this.s);
        }
        if (!this.t.isEmpty()) {
            i2 += CodedOutputStream.p(11, this.t);
        }
        if (!this.u.isEmpty()) {
            i2 += CodedOutputStream.p(12, this.u);
        }
        if (this.v != null) {
            i2 += CodedOutputStream.n(13, q());
        }
        if (!this.w.isEmpty()) {
            i2 += CodedOutputStream.p(14, this.w);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String h() {
        return this.n;
    }

    public String i() {
        return this.o;
    }

    public String l() {
        return this.p;
    }

    public String m() {
        return this.q;
    }

    public String o() {
        return this.w;
    }

    public String p() {
        return this.a;
    }

    public ShareConfiguration q() {
        ShareConfiguration shareConfiguration = this.v;
        return shareConfiguration == null ? ShareConfiguration.h() : shareConfiguration;
    }

    public String r() {
        return this.c;
    }

    public Gradient s() {
        Gradient d = Gradient.d(this.f);
        return d == null ? Gradient.UNRECOGNIZED : d;
    }

    public String t() {
        return this.b;
    }

    public String u() {
        return this.t;
    }

    public String v() {
        return this.u;
    }

    public String w() {
        return this.s;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        if (!this.b.isEmpty()) {
            codedOutputStream.P(2, this.b);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(3, this.c);
        }
        if (this.f != Gradient.VERSION_1.getNumber()) {
            codedOutputStream.K(4, this.f);
        }
        if (!this.n.isEmpty()) {
            codedOutputStream.P(5, this.n);
        }
        if (!this.o.isEmpty()) {
            codedOutputStream.P(6, this.o);
        }
        if (!this.p.isEmpty()) {
            codedOutputStream.P(7, this.p);
        }
        if (!this.q.isEmpty()) {
            codedOutputStream.P(8, this.q);
        }
        if (!this.r.isEmpty()) {
            codedOutputStream.P(9, this.r);
        }
        if (!this.s.isEmpty()) {
            codedOutputStream.P(10, this.s);
        }
        if (!this.t.isEmpty()) {
            codedOutputStream.P(11, this.t);
        }
        if (!this.u.isEmpty()) {
            codedOutputStream.P(12, this.u);
        }
        if (this.v != null) {
            codedOutputStream.M(13, q());
        }
        if (!this.w.isEmpty()) {
            codedOutputStream.P(14, this.w);
        }
    }

    public String x() {
        return this.r;
    }
}
