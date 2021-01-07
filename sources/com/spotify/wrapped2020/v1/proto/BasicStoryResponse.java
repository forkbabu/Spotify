package com.spotify.wrapped2020.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.wrapped2020.v1.proto.ColoredText;
import com.spotify.wrapped2020.v1.proto.Paragraph;
import com.spotify.wrapped2020.v1.proto.ShareConfiguration;
import java.io.IOException;

public final class BasicStoryResponse extends GeneratedMessageLite<BasicStoryResponse, b> implements Object {
    private static final BasicStoryResponse u;
    private static volatile x<BasicStoryResponse> v;
    private String a = "";
    private ShareConfiguration b;
    private String c = "";
    private int f;
    private String n = "";
    private Paragraph o;
    private String p = "";
    private Paragraph q;
    private String r = "";
    private String s = "";
    private ColoredText t;

    public static final class b extends GeneratedMessageLite.b<BasicStoryResponse, b> implements Object {
        private b() {
            super(BasicStoryResponse.u);
        }
    }

    static {
        BasicStoryResponse basicStoryResponse = new BasicStoryResponse();
        u = basicStoryResponse;
        basicStoryResponse.makeImmutable();
    }

    private BasicStoryResponse() {
    }

    public static BasicStoryResponse n() {
        return u;
    }

    public static x<BasicStoryResponse> parser() {
        return u.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return u;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                BasicStoryResponse basicStoryResponse = (BasicStoryResponse) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !basicStoryResponse.a.isEmpty(), basicStoryResponse.a);
                this.b = (ShareConfiguration) hVar.i(this.b, basicStoryResponse.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !basicStoryResponse.c.isEmpty(), basicStoryResponse.c);
                int i = this.f;
                boolean z2 = i != 0;
                int i2 = basicStoryResponse.f;
                if (i2 != 0) {
                    z = true;
                }
                this.f = hVar.m(z2, i, z, i2);
                this.n = hVar.n(!this.n.isEmpty(), this.n, !basicStoryResponse.n.isEmpty(), basicStoryResponse.n);
                this.o = (Paragraph) hVar.i(this.o, basicStoryResponse.o);
                this.p = hVar.n(!this.p.isEmpty(), this.p, !basicStoryResponse.p.isEmpty(), basicStoryResponse.p);
                this.q = (Paragraph) hVar.i(this.q, basicStoryResponse.q);
                this.r = hVar.n(!this.r.isEmpty(), this.r, !basicStoryResponse.r.isEmpty(), basicStoryResponse.r);
                this.s = hVar.n(!this.s.isEmpty(), this.s, true ^ basicStoryResponse.s.isEmpty(), basicStoryResponse.s);
                this.t = (ColoredText) hVar.i(this.t, basicStoryResponse.t);
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
                            case 32:
                                this.f = gVar.u();
                                continue;
                            case 42:
                                this.n = gVar.A();
                                continue;
                            case 50:
                                Paragraph paragraph = this.o;
                                Paragraph.b bVar2 = paragraph != null ? (Paragraph.b) paragraph.toBuilder() : null;
                                Paragraph paragraph2 = (Paragraph) gVar.o(Paragraph.parser(), kVar);
                                this.o = paragraph2;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((Paragraph.b) paragraph2);
                                    this.o = (Paragraph) bVar2.buildPartial();
                                } else {
                                    continue;
                                }
                            case 58:
                                this.p = gVar.A();
                                continue;
                            case 66:
                                Paragraph paragraph3 = this.q;
                                Paragraph.b bVar3 = paragraph3 != null ? (Paragraph.b) paragraph3.toBuilder() : null;
                                Paragraph paragraph4 = (Paragraph) gVar.o(Paragraph.parser(), kVar);
                                this.q = paragraph4;
                                if (bVar3 != null) {
                                    bVar3.mergeFrom((Paragraph.b) paragraph4);
                                    this.q = (Paragraph) bVar3.buildPartial();
                                } else {
                                    continue;
                                }
                            case 74:
                                this.r = gVar.A();
                                continue;
                            case 82:
                                this.s = gVar.A();
                                continue;
                            case 90:
                                ColoredText coloredText = this.t;
                                ColoredText.b bVar4 = coloredText != null ? (ColoredText.b) coloredText.toBuilder() : null;
                                ColoredText coloredText2 = (ColoredText) gVar.o(ColoredText.parser(), kVar);
                                this.t = coloredText2;
                                if (bVar4 != null) {
                                    bVar4.mergeFrom((ColoredText.b) coloredText2);
                                    this.t = (ColoredText) bVar4.buildPartial();
                                } else {
                                    continue;
                                }
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
                return new BasicStoryResponse();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (v == null) {
                    synchronized (BasicStoryResponse.class) {
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
        if (!this.a.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.a);
        }
        if (this.b != null) {
            i2 += CodedOutputStream.n(2, s());
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
        if (this.o != null) {
            i2 += CodedOutputStream.n(6, u());
        }
        if (!this.p.isEmpty()) {
            i2 += CodedOutputStream.p(7, this.p);
        }
        if (this.q != null) {
            i2 += CodedOutputStream.n(8, o());
        }
        if (!this.r.isEmpty()) {
            i2 += CodedOutputStream.p(9, this.r);
        }
        if (!this.s.isEmpty()) {
            i2 += CodedOutputStream.p(10, this.s);
        }
        if (this.t != null) {
            i2 += CodedOutputStream.n(11, l());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String h() {
        return this.c;
    }

    public String i() {
        return this.n;
    }

    public ColoredText l() {
        ColoredText coloredText = this.t;
        return coloredText == null ? ColoredText.h() : coloredText;
    }

    public String m() {
        return this.s;
    }

    public Paragraph o() {
        Paragraph paragraph = this.q;
        return paragraph == null ? Paragraph.h() : paragraph;
    }

    public String p() {
        return this.r;
    }

    public String q() {
        return this.a;
    }

    public Gradient r() {
        Gradient d = Gradient.d(this.f);
        return d == null ? Gradient.UNRECOGNIZED : d;
    }

    public ShareConfiguration s() {
        ShareConfiguration shareConfiguration = this.b;
        return shareConfiguration == null ? ShareConfiguration.h() : shareConfiguration;
    }

    public String t() {
        return this.p;
    }

    public Paragraph u() {
        Paragraph paragraph = this.o;
        return paragraph == null ? Paragraph.h() : paragraph;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        if (this.b != null) {
            codedOutputStream.M(2, s());
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
        if (this.o != null) {
            codedOutputStream.M(6, u());
        }
        if (!this.p.isEmpty()) {
            codedOutputStream.P(7, this.p);
        }
        if (this.q != null) {
            codedOutputStream.M(8, o());
        }
        if (!this.r.isEmpty()) {
            codedOutputStream.P(9, this.r);
        }
        if (!this.s.isEmpty()) {
            codedOutputStream.P(10, this.s);
        }
        if (this.t != null) {
            codedOutputStream.M(11, l());
        }
    }
}
