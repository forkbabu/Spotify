package com.spotify.wrapped2020.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.wrapped2020.v1.proto.ColoredText;
import com.spotify.wrapped2020.v1.proto.ShareConfiguration;
import java.io.IOException;

public final class SummaryIntroStoryResponse extends GeneratedMessageLite<SummaryIntroStoryResponse, b> implements Object {
    private static final SummaryIntroStoryResponse x;
    private static volatile x<SummaryIntroStoryResponse> y;
    private String a = "";
    private ShareConfiguration b;
    private int c;
    private String f = "";
    private String n = "";
    private String o = "";
    private String p = "";
    private String q = "";
    private ColoredText r;
    private ColoredText s;
    private String t = "";
    private ColoredText u;
    private String v = "";
    private String w = "";

    public static final class b extends GeneratedMessageLite.b<SummaryIntroStoryResponse, b> implements Object {
        private b() {
            super(SummaryIntroStoryResponse.x);
        }
    }

    static {
        SummaryIntroStoryResponse summaryIntroStoryResponse = new SummaryIntroStoryResponse();
        x = summaryIntroStoryResponse;
        summaryIntroStoryResponse.makeImmutable();
    }

    private SummaryIntroStoryResponse() {
    }

    public static x<SummaryIntroStoryResponse> parser() {
        return x.getParserForType();
    }

    public static SummaryIntroStoryResponse q() {
        return x;
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
                SummaryIntroStoryResponse summaryIntroStoryResponse = (SummaryIntroStoryResponse) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !summaryIntroStoryResponse.a.isEmpty(), summaryIntroStoryResponse.a);
                this.b = (ShareConfiguration) hVar.i(this.b, summaryIntroStoryResponse.b);
                int i = this.c;
                boolean z2 = i != 0;
                int i2 = summaryIntroStoryResponse.c;
                if (i2 != 0) {
                    z = true;
                }
                this.c = hVar.m(z2, i, z, i2);
                this.f = hVar.n(!this.f.isEmpty(), this.f, !summaryIntroStoryResponse.f.isEmpty(), summaryIntroStoryResponse.f);
                this.n = hVar.n(!this.n.isEmpty(), this.n, !summaryIntroStoryResponse.n.isEmpty(), summaryIntroStoryResponse.n);
                this.o = hVar.n(!this.o.isEmpty(), this.o, !summaryIntroStoryResponse.o.isEmpty(), summaryIntroStoryResponse.o);
                this.p = hVar.n(!this.p.isEmpty(), this.p, !summaryIntroStoryResponse.p.isEmpty(), summaryIntroStoryResponse.p);
                this.q = hVar.n(!this.q.isEmpty(), this.q, !summaryIntroStoryResponse.q.isEmpty(), summaryIntroStoryResponse.q);
                this.r = (ColoredText) hVar.i(this.r, summaryIntroStoryResponse.r);
                this.s = (ColoredText) hVar.i(this.s, summaryIntroStoryResponse.s);
                this.t = hVar.n(!this.t.isEmpty(), this.t, !summaryIntroStoryResponse.t.isEmpty(), summaryIntroStoryResponse.t);
                this.u = (ColoredText) hVar.i(this.u, summaryIntroStoryResponse.u);
                this.v = hVar.n(!this.v.isEmpty(), this.v, !summaryIntroStoryResponse.v.isEmpty(), summaryIntroStoryResponse.v);
                this.w = hVar.n(!this.w.isEmpty(), this.w, !summaryIntroStoryResponse.w.isEmpty(), summaryIntroStoryResponse.w);
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
                            case 24:
                                this.c = gVar.u();
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
                            case 58:
                                this.p = gVar.A();
                                continue;
                            case 66:
                                this.q = gVar.A();
                                continue;
                            case 74:
                                ColoredText coloredText = this.r;
                                ColoredText.b bVar2 = coloredText != null ? (ColoredText.b) coloredText.toBuilder() : null;
                                ColoredText coloredText2 = (ColoredText) gVar.o(ColoredText.parser(), kVar);
                                this.r = coloredText2;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((ColoredText.b) coloredText2);
                                    this.r = (ColoredText) bVar2.buildPartial();
                                } else {
                                    continue;
                                }
                            case 82:
                                ColoredText coloredText3 = this.s;
                                ColoredText.b bVar3 = coloredText3 != null ? (ColoredText.b) coloredText3.toBuilder() : null;
                                ColoredText coloredText4 = (ColoredText) gVar.o(ColoredText.parser(), kVar);
                                this.s = coloredText4;
                                if (bVar3 != null) {
                                    bVar3.mergeFrom((ColoredText.b) coloredText4);
                                    this.s = (ColoredText) bVar3.buildPartial();
                                } else {
                                    continue;
                                }
                            case 90:
                                this.t = gVar.A();
                                continue;
                            case 98:
                                ColoredText coloredText5 = this.u;
                                ColoredText.b bVar4 = coloredText5 != null ? (ColoredText.b) coloredText5.toBuilder() : null;
                                ColoredText coloredText6 = (ColoredText) gVar.o(ColoredText.parser(), kVar);
                                this.u = coloredText6;
                                if (bVar4 != null) {
                                    bVar4.mergeFrom((ColoredText.b) coloredText6);
                                    this.u = (ColoredText) bVar4.buildPartial();
                                } else {
                                    continue;
                                }
                            case 106:
                                this.v = gVar.A();
                                continue;
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
                return new SummaryIntroStoryResponse();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (y == null) {
                    synchronized (SummaryIntroStoryResponse.class) {
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
        if (this.b != null) {
            i2 += CodedOutputStream.n(2, u());
        }
        if (this.c != Gradient.VERSION_1.getNumber()) {
            i2 += CodedOutputStream.h(3, this.c);
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
        if (!this.p.isEmpty()) {
            i2 += CodedOutputStream.p(7, this.p);
        }
        if (!this.q.isEmpty()) {
            i2 += CodedOutputStream.p(8, this.q);
        }
        if (this.r != null) {
            i2 += CodedOutputStream.n(9, x());
        }
        if (this.s != null) {
            i2 += CodedOutputStream.n(10, w());
        }
        if (!this.t.isEmpty()) {
            i2 += CodedOutputStream.p(11, this.t);
        }
        if (this.u != null) {
            i2 += CodedOutputStream.n(12, v());
        }
        if (!this.v.isEmpty()) {
            i2 += CodedOutputStream.p(13, this.v);
        }
        if (!this.w.isEmpty()) {
            i2 += CodedOutputStream.p(14, this.w);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String h() {
        return this.f;
    }

    public String i() {
        return this.n;
    }

    public String l() {
        return this.o;
    }

    public String m() {
        return this.p;
    }

    public String n() {
        return this.q;
    }

    public String o() {
        return this.t;
    }

    public String p() {
        return this.w;
    }

    public Gradient r() {
        Gradient d = Gradient.d(this.c);
        return d == null ? Gradient.UNRECOGNIZED : d;
    }

    public String s() {
        return this.v;
    }

    public String t() {
        return this.a;
    }

    public ShareConfiguration u() {
        ShareConfiguration shareConfiguration = this.b;
        return shareConfiguration == null ? ShareConfiguration.h() : shareConfiguration;
    }

    public ColoredText v() {
        ColoredText coloredText = this.u;
        return coloredText == null ? ColoredText.h() : coloredText;
    }

    public ColoredText w() {
        ColoredText coloredText = this.s;
        return coloredText == null ? ColoredText.h() : coloredText;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        if (this.b != null) {
            codedOutputStream.M(2, u());
        }
        if (this.c != Gradient.VERSION_1.getNumber()) {
            codedOutputStream.K(3, this.c);
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
        if (!this.p.isEmpty()) {
            codedOutputStream.P(7, this.p);
        }
        if (!this.q.isEmpty()) {
            codedOutputStream.P(8, this.q);
        }
        if (this.r != null) {
            codedOutputStream.M(9, x());
        }
        if (this.s != null) {
            codedOutputStream.M(10, w());
        }
        if (!this.t.isEmpty()) {
            codedOutputStream.P(11, this.t);
        }
        if (this.u != null) {
            codedOutputStream.M(12, v());
        }
        if (!this.v.isEmpty()) {
            codedOutputStream.P(13, this.v);
        }
        if (!this.w.isEmpty()) {
            codedOutputStream.P(14, this.w);
        }
    }

    public ColoredText x() {
        ColoredText coloredText = this.r;
        return coloredText == null ? ColoredText.h() : coloredText;
    }
}
