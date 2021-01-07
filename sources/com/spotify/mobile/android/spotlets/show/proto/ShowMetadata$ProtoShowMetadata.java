package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.mobile.android.spotlets.show.proto.ImageGroup$ProtoImageGroup;
import java.io.IOException;

public final class ShowMetadata$ProtoShowMetadata extends GeneratedMessageLite<ShowMetadata$ProtoShowMetadata, a> implements Object {
    private static final ShowMetadata$ProtoShowMetadata y;
    private static volatile x<ShowMetadata$ProtoShowMetadata> z;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private int n;
    private String o = "";
    private String p = "";
    private boolean q;
    private ImageGroup$ProtoImageGroup r;
    private int s;
    private String t = "";
    private int u;
    private o.i<String> v = GeneratedMessageLite.emptyProtobufList();
    private String w = "";
    private boolean x;

    public static final class a extends GeneratedMessageLite.b<ShowMetadata$ProtoShowMetadata, a> implements Object {
        private a() {
            super(ShowMetadata$ProtoShowMetadata.y);
        }
    }

    static {
        ShowMetadata$ProtoShowMetadata showMetadata$ProtoShowMetadata = new ShowMetadata$ProtoShowMetadata();
        y = showMetadata$ProtoShowMetadata;
        showMetadata$ProtoShowMetadata.makeImmutable();
    }

    private ShowMetadata$ProtoShowMetadata() {
    }

    public static ShowMetadata$ProtoShowMetadata l() {
        return y;
    }

    public static x<ShowMetadata$ProtoShowMetadata> parser() {
        return y.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = 4096;
        int i2 = 2048;
        boolean z2 = true;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return y;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ShowMetadata$ProtoShowMetadata showMetadata$ProtoShowMetadata = (ShowMetadata$ProtoShowMetadata) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (showMetadata$ProtoShowMetadata.a & 1) == 1, showMetadata$ProtoShowMetadata.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (showMetadata$ProtoShowMetadata.a & 2) == 2, showMetadata$ProtoShowMetadata.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (showMetadata$ProtoShowMetadata.a & 4) == 4, showMetadata$ProtoShowMetadata.f);
                this.n = hVar.m((this.a & 8) == 8, this.n, (showMetadata$ProtoShowMetadata.a & 8) == 8, showMetadata$ProtoShowMetadata.n);
                this.o = hVar.n((this.a & 16) == 16, this.o, (showMetadata$ProtoShowMetadata.a & 16) == 16, showMetadata$ProtoShowMetadata.o);
                this.p = hVar.n((this.a & 32) == 32, this.p, (showMetadata$ProtoShowMetadata.a & 32) == 32, showMetadata$ProtoShowMetadata.p);
                this.q = hVar.f((this.a & 64) == 64, this.q, (showMetadata$ProtoShowMetadata.a & 64) == 64, showMetadata$ProtoShowMetadata.q);
                this.r = (ImageGroup$ProtoImageGroup) hVar.i(this.r, showMetadata$ProtoShowMetadata.r);
                this.s = hVar.m((this.a & 256) == 256, this.s, (showMetadata$ProtoShowMetadata.a & 256) == 256, showMetadata$ProtoShowMetadata.s);
                this.t = hVar.n((this.a & 512) == 512, this.t, (showMetadata$ProtoShowMetadata.a & 512) == 512, showMetadata$ProtoShowMetadata.t);
                this.u = hVar.m(t(), this.u, showMetadata$ProtoShowMetadata.t(), showMetadata$ProtoShowMetadata.u);
                this.v = hVar.q(this.v, showMetadata$ProtoShowMetadata.v);
                this.w = hVar.n((this.a & 2048) == 2048, this.w, (showMetadata$ProtoShowMetadata.a & 2048) == 2048, showMetadata$ProtoShowMetadata.w);
                boolean z3 = (this.a & 4096) == 4096;
                boolean z4 = this.x;
                if ((showMetadata$ProtoShowMetadata.a & 4096) != 4096) {
                    z2 = false;
                }
                this.x = hVar.f(z3, z4, z2, showMetadata$ProtoShowMetadata.x);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= showMetadata$ProtoShowMetadata.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z5 = false;
                while (!z5) {
                    try {
                        int B = gVar.B();
                        switch (B) {
                            case 0:
                                break;
                            case 10:
                                String z6 = gVar.z();
                                this.a |= 1;
                                this.b = z6;
                                continue;
                                i = 4096;
                                i2 = 2048;
                            case 18:
                                String z7 = gVar.z();
                                this.a |= 2;
                                this.c = z7;
                                continue;
                                i = 4096;
                                i2 = 2048;
                            case 26:
                                String z8 = gVar.z();
                                this.a |= 4;
                                this.f = z8;
                                continue;
                                i = 4096;
                                i2 = 2048;
                            case 32:
                                this.a |= 8;
                                this.n = gVar.u();
                                continue;
                                i = 4096;
                                i2 = 2048;
                            case 42:
                                String z9 = gVar.z();
                                this.a |= 16;
                                this.o = z9;
                                continue;
                                i = 4096;
                                i2 = 2048;
                            case 50:
                                String z10 = gVar.z();
                                this.a |= 32;
                                this.p = z10;
                                continue;
                                i = 4096;
                                i2 = 2048;
                            case 56:
                                this.a |= 64;
                                this.q = gVar.h();
                                continue;
                                i = 4096;
                                i2 = 2048;
                            case 66:
                                ImageGroup$ProtoImageGroup.a aVar = (this.a & 128) == 128 ? (ImageGroup$ProtoImageGroup.a) this.r.toBuilder() : null;
                                ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroup = (ImageGroup$ProtoImageGroup) gVar.o(ImageGroup$ProtoImageGroup.parser(), kVar);
                                this.r = imageGroup$ProtoImageGroup;
                                if (aVar != null) {
                                    aVar.mergeFrom((ImageGroup$ProtoImageGroup.a) imageGroup$ProtoImageGroup);
                                    this.r = (ImageGroup$ProtoImageGroup) aVar.buildPartial();
                                }
                                this.a |= 128;
                                continue;
                                i = 4096;
                                i2 = 2048;
                            case 72:
                                this.a |= 256;
                                this.s = gVar.u();
                                continue;
                                i = 4096;
                                i2 = 2048;
                            case 82:
                                String z11 = gVar.z();
                                this.a |= 512;
                                this.t = z11;
                                continue;
                                i = 4096;
                                i2 = 2048;
                            case 88:
                                this.a |= 1024;
                                this.u = gVar.u();
                                continue;
                                i = 4096;
                                i2 = 2048;
                            case 98:
                                String z12 = gVar.z();
                                if (!this.v.R0()) {
                                    this.v = GeneratedMessageLite.mutableCopy(this.v);
                                }
                                this.v.add(z12);
                                continue;
                                i = 4096;
                                i2 = 2048;
                            case 106:
                                String z13 = gVar.z();
                                this.a |= i2;
                                this.w = z13;
                                continue;
                                i = 4096;
                                i2 = 2048;
                            case 112:
                                this.a |= i;
                                this.x = gVar.h();
                                continue;
                                i = 4096;
                                i2 = 2048;
                            default:
                                if (parseUnknownField(B, gVar)) {
                                    continue;
                                    i = 4096;
                                    i2 = 2048;
                                }
                                break;
                        }
                        z5 = true;
                        i = 4096;
                        i2 = 2048;
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
                this.v.C();
                return null;
            case 4:
                return new ShowMetadata$ProtoShowMetadata();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (z == null) {
                    synchronized (ShowMetadata$ProtoShowMetadata.class) {
                        if (z == null) {
                            z = new GeneratedMessageLite.c(y);
                        }
                    }
                }
                return z;
            default:
                throw new UnsupportedOperationException();
        }
        return y;
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
            p2 += CodedOutputStream.s(4, this.n);
        }
        if ((this.a & 16) == 16) {
            p2 += CodedOutputStream.p(5, this.o);
        }
        if ((this.a & 32) == 32) {
            p2 += CodedOutputStream.p(6, this.p);
        }
        if ((this.a & 64) == 64) {
            p2 += CodedOutputStream.d(7, this.q);
        }
        if ((this.a & 128) == 128) {
            p2 += CodedOutputStream.n(8, i());
        }
        if ((this.a & 256) == 256) {
            p2 += CodedOutputStream.s(9, this.s);
        }
        if ((this.a & 512) == 512) {
            p2 += CodedOutputStream.p(10, this.t);
        }
        if ((this.a & 1024) == 1024) {
            p2 += CodedOutputStream.j(11, this.u);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.v.size(); i3++) {
            i2 += CodedOutputStream.q(this.v.get(i3));
        }
        int C0 = je.C0(this.v, 1, p2 + i2);
        if ((this.a & 2048) == 2048) {
            C0 += CodedOutputStream.p(13, this.w);
        }
        if ((this.a & 4096) == 4096) {
            C0 += CodedOutputStream.d(14, this.x);
        }
        int c2 = this.unknownFields.c() + C0;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public String h() {
        return this.t;
    }

    public ImageGroup$ProtoImageGroup i() {
        ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroup = this.r;
        return imageGroup$ProtoImageGroup == null ? ImageGroup$ProtoImageGroup.h() : imageGroup$ProtoImageGroup;
    }

    public String m() {
        return this.f;
    }

    public String n() {
        return this.b;
    }

    public int o() {
        return this.u;
    }

    public String p() {
        return this.c;
    }

    public String q() {
        return this.o;
    }

    public String r() {
        return this.w;
    }

    public boolean s() {
        return (this.a & 128) == 128;
    }

    public boolean t() {
        return (this.a & 1024) == 1024;
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
            codedOutputStream.S(4, this.n);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.P(5, this.o);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.P(6, this.p);
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.A(7, this.q);
        }
        if ((this.a & 128) == 128) {
            codedOutputStream.M(8, i());
        }
        if ((this.a & 256) == 256) {
            codedOutputStream.S(9, this.s);
        }
        if ((this.a & 512) == 512) {
            codedOutputStream.P(10, this.t);
        }
        if ((this.a & 1024) == 1024) {
            codedOutputStream.K(11, this.u);
        }
        for (int i = 0; i < this.v.size(); i++) {
            codedOutputStream.P(12, this.v.get(i));
        }
        if ((this.a & 2048) == 2048) {
            codedOutputStream.P(13, this.w);
        }
        if ((this.a & 4096) == 4096) {
            codedOutputStream.A(14, this.x);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
