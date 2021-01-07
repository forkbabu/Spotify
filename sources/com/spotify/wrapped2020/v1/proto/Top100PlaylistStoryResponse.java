package com.spotify.wrapped2020.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.wrapped2020.v1.proto.ShareConfiguration;
import java.io.IOException;

public final class Top100PlaylistStoryResponse extends GeneratedMessageLite<Top100PlaylistStoryResponse, b> implements Object {
    private static final Top100PlaylistStoryResponse w;
    private static volatile x<Top100PlaylistStoryResponse> x;
    private String a = "";
    private ShareConfiguration b;
    private String c = "";
    private String f = "";
    private String n = "";
    private String o = "";
    private int p;
    private String q = "";
    private String r = "";
    private String s = "";
    private String t = "";
    private String u = "";
    private String v = "";

    public static final class b extends GeneratedMessageLite.b<Top100PlaylistStoryResponse, b> implements Object {
        private b() {
            super(Top100PlaylistStoryResponse.w);
        }
    }

    static {
        Top100PlaylistStoryResponse top100PlaylistStoryResponse = new Top100PlaylistStoryResponse();
        w = top100PlaylistStoryResponse;
        top100PlaylistStoryResponse.makeImmutable();
    }

    private Top100PlaylistStoryResponse() {
    }

    public static Top100PlaylistStoryResponse n() {
        return w;
    }

    public static x<Top100PlaylistStoryResponse> parser() {
        return w.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return w;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Top100PlaylistStoryResponse top100PlaylistStoryResponse = (Top100PlaylistStoryResponse) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !top100PlaylistStoryResponse.a.isEmpty(), top100PlaylistStoryResponse.a);
                this.b = (ShareConfiguration) hVar.i(this.b, top100PlaylistStoryResponse.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !top100PlaylistStoryResponse.c.isEmpty(), top100PlaylistStoryResponse.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, !top100PlaylistStoryResponse.f.isEmpty(), top100PlaylistStoryResponse.f);
                this.n = hVar.n(!this.n.isEmpty(), this.n, !top100PlaylistStoryResponse.n.isEmpty(), top100PlaylistStoryResponse.n);
                this.o = hVar.n(!this.o.isEmpty(), this.o, !top100PlaylistStoryResponse.o.isEmpty(), top100PlaylistStoryResponse.o);
                int i = this.p;
                boolean z2 = i != 0;
                int i2 = top100PlaylistStoryResponse.p;
                if (i2 != 0) {
                    z = true;
                }
                this.p = hVar.m(z2, i, z, i2);
                this.q = hVar.n(!this.q.isEmpty(), this.q, !top100PlaylistStoryResponse.q.isEmpty(), top100PlaylistStoryResponse.q);
                this.r = hVar.n(!this.r.isEmpty(), this.r, !top100PlaylistStoryResponse.r.isEmpty(), top100PlaylistStoryResponse.r);
                this.s = hVar.n(!this.s.isEmpty(), this.s, !top100PlaylistStoryResponse.s.isEmpty(), top100PlaylistStoryResponse.s);
                this.t = hVar.n(!this.t.isEmpty(), this.t, !top100PlaylistStoryResponse.t.isEmpty(), top100PlaylistStoryResponse.t);
                this.u = hVar.n(!this.u.isEmpty(), this.u, !top100PlaylistStoryResponse.u.isEmpty(), top100PlaylistStoryResponse.u);
                this.v = hVar.n(!this.v.isEmpty(), this.v, !top100PlaylistStoryResponse.v.isEmpty(), top100PlaylistStoryResponse.v);
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
                                ShareConfiguration shareConfiguration = this.b;
                                ShareConfiguration.b bVar = shareConfiguration != null ? (ShareConfiguration.b) shareConfiguration.toBuilder() : null;
                                ShareConfiguration shareConfiguration2 = (ShareConfiguration) gVar.o(ShareConfiguration.parser(), kVar);
                                this.b = shareConfiguration2;
                                if (bVar != null) {
                                    bVar.mergeFrom((ShareConfiguration.b) shareConfiguration2);
                                    this.b = (ShareConfiguration) bVar.buildPartial();
                                } else {
                                    continue;
                                }
                            case 26:
                                this.c = gVar.A();
                                continue;
                            case 34:
                                this.f = gVar.A();
                                continue;
                            case 42:
                                this.n = gVar.A();
                                continue;
                            case 50:
                                this.o = gVar.A();
                                continue;
                            case 56:
                                this.p = gVar.u();
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
                                this.v = gVar.A();
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
                return new Top100PlaylistStoryResponse();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (x == null) {
                    synchronized (Top100PlaylistStoryResponse.class) {
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
        if (!this.a.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.a);
        }
        if (this.b != null) {
            i2 += CodedOutputStream.n(2, t());
        }
        if (!this.c.isEmpty()) {
            i2 += CodedOutputStream.p(3, this.c);
        }
        if (!this.f.isEmpty()) {
            i2 += CodedOutputStream.p(4, this.f);
        }
        if (!this.n.isEmpty()) {
            i2 += CodedOutputStream.p(5, this.n);
        }
        if (!this.o.isEmpty()) {
            i2 += CodedOutputStream.p(6, this.o);
        }
        if (this.p != Gradient.VERSION_1.getNumber()) {
            i2 += CodedOutputStream.h(7, this.p);
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
        if (!this.v.isEmpty()) {
            i2 += CodedOutputStream.p(13, this.v);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String h() {
        return this.s;
    }

    public String i() {
        return this.v;
    }

    public Gradient l() {
        Gradient d = Gradient.d(this.p);
        return d == null ? Gradient.UNRECOGNIZED : d;
    }

    public String m() {
        return this.n;
    }

    public String o() {
        return this.o;
    }

    public String p() {
        return this.u;
    }

    public String q() {
        return this.r;
    }

    public String r() {
        return this.q;
    }

    public String s() {
        return this.a;
    }

    public ShareConfiguration t() {
        ShareConfiguration shareConfiguration = this.b;
        return shareConfiguration == null ? ShareConfiguration.h() : shareConfiguration;
    }

    public String u() {
        return this.f;
    }

    public String v() {
        return this.t;
    }

    public String w() {
        return this.c;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        if (this.b != null) {
            codedOutputStream.M(2, t());
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(3, this.c);
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.P(4, this.f);
        }
        if (!this.n.isEmpty()) {
            codedOutputStream.P(5, this.n);
        }
        if (!this.o.isEmpty()) {
            codedOutputStream.P(6, this.o);
        }
        if (this.p != Gradient.VERSION_1.getNumber()) {
            codedOutputStream.K(7, this.p);
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
        if (!this.v.isEmpty()) {
            codedOutputStream.P(13, this.v);
        }
    }
}
