package com.spotify.wrapped2020.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.wrapped2020.v1.proto.ColoredText;
import com.spotify.wrapped2020.v1.proto.Paragraph;
import com.spotify.wrapped2020.v1.proto.ShareConfiguration;
import java.io.IOException;
import java.util.List;

public final class TopGenresStoryResponse extends GeneratedMessageLite<TopGenresStoryResponse, b> implements Object {
    private static final TopGenresStoryResponse v;
    private static volatile x<TopGenresStoryResponse> w;
    private int a;
    private String b = "";
    private String c = "";
    private ShareConfiguration f;
    private String n = "";
    private ColoredText o;
    private ColoredText p;
    private String q = "";
    private Paragraph r;
    private String s = "";
    private ColoredText t;
    private o.i<TopGenresBlob> u = GeneratedMessageLite.emptyProtobufList();

    public static final class TopGenresBlob extends GeneratedMessageLite<TopGenresBlob, a> implements Object {
        private static final TopGenresBlob f;
        private static volatile x<TopGenresBlob> n;
        private String a = "";
        private ColoredText b;
        private ColoredText c;

        public static final class a extends GeneratedMessageLite.b<TopGenresBlob, a> implements Object {
            private a() {
                super(TopGenresBlob.f);
            }
        }

        static {
            TopGenresBlob topGenresBlob = new TopGenresBlob();
            f = topGenresBlob;
            topGenresBlob.makeImmutable();
        }

        private TopGenresBlob() {
        }

        public static x<TopGenresBlob> parser() {
            return f.getParserForType();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return f;
                case 1:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    TopGenresBlob topGenresBlob = (TopGenresBlob) obj2;
                    this.a = hVar.n(!this.a.isEmpty(), this.a, true ^ topGenresBlob.a.isEmpty(), topGenresBlob.a);
                    this.b = (ColoredText) hVar.i(this.b, topGenresBlob.b);
                    this.c = (ColoredText) hVar.i(this.c, topGenresBlob.c);
                    return this;
                case 2:
                    g gVar = (g) obj;
                    k kVar = (k) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int B = gVar.B();
                            if (B != 0) {
                                if (B == 10) {
                                    this.a = gVar.A();
                                } else if (B == 18) {
                                    ColoredText coloredText = this.b;
                                    ColoredText.b bVar = coloredText != null ? (ColoredText.b) coloredText.toBuilder() : null;
                                    ColoredText coloredText2 = (ColoredText) gVar.o(ColoredText.parser(), kVar);
                                    this.b = coloredText2;
                                    if (bVar != null) {
                                        bVar.mergeFrom((ColoredText.b) coloredText2);
                                        this.b = (ColoredText) bVar.buildPartial();
                                    }
                                } else if (B == 26) {
                                    ColoredText coloredText3 = this.c;
                                    ColoredText.b bVar2 = coloredText3 != null ? (ColoredText.b) coloredText3.toBuilder() : null;
                                    ColoredText coloredText4 = (ColoredText) gVar.o(ColoredText.parser(), kVar);
                                    this.c = coloredText4;
                                    if (bVar2 != null) {
                                        bVar2.mergeFrom((ColoredText.b) coloredText4);
                                        this.c = (ColoredText) bVar2.buildPartial();
                                    }
                                } else if (!gVar.F(B)) {
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
                    return new TopGenresBlob();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (n == null) {
                        synchronized (TopGenresBlob.class) {
                            if (n == null) {
                                n = new GeneratedMessageLite.c(f);
                            }
                        }
                    }
                    return n;
                default:
                    throw new UnsupportedOperationException();
            }
            return f;
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
                i2 += CodedOutputStream.n(2, l());
            }
            if (this.c != null) {
                i2 += CodedOutputStream.n(3, h());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public ColoredText h() {
            ColoredText coloredText = this.c;
            return coloredText == null ? ColoredText.h() : coloredText;
        }

        public String i() {
            return this.a;
        }

        public ColoredText l() {
            ColoredText coloredText = this.b;
            return coloredText == null ? ColoredText.h() : coloredText;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (!this.a.isEmpty()) {
                codedOutputStream.P(1, this.a);
            }
            if (this.b != null) {
                codedOutputStream.M(2, l());
            }
            if (this.c != null) {
                codedOutputStream.M(3, h());
            }
        }
    }

    public static final class b extends GeneratedMessageLite.b<TopGenresStoryResponse, b> implements Object {
        private b() {
            super(TopGenresStoryResponse.v);
        }
    }

    static {
        TopGenresStoryResponse topGenresStoryResponse = new TopGenresStoryResponse();
        v = topGenresStoryResponse;
        topGenresStoryResponse.makeImmutable();
    }

    private TopGenresStoryResponse() {
    }

    public static TopGenresStoryResponse i() {
        return v;
    }

    public static x<TopGenresStoryResponse> parser() {
        return v.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return v;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                TopGenresStoryResponse topGenresStoryResponse = (TopGenresStoryResponse) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, !topGenresStoryResponse.b.isEmpty(), topGenresStoryResponse.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !topGenresStoryResponse.c.isEmpty(), topGenresStoryResponse.c);
                this.f = (ShareConfiguration) hVar.i(this.f, topGenresStoryResponse.f);
                this.n = hVar.n(!this.n.isEmpty(), this.n, !topGenresStoryResponse.n.isEmpty(), topGenresStoryResponse.n);
                this.o = (ColoredText) hVar.i(this.o, topGenresStoryResponse.o);
                this.p = (ColoredText) hVar.i(this.p, topGenresStoryResponse.p);
                this.q = hVar.n(!this.q.isEmpty(), this.q, !topGenresStoryResponse.q.isEmpty(), topGenresStoryResponse.q);
                this.r = (Paragraph) hVar.i(this.r, topGenresStoryResponse.r);
                this.s = hVar.n(!this.s.isEmpty(), this.s, true ^ topGenresStoryResponse.s.isEmpty(), topGenresStoryResponse.s);
                this.t = (ColoredText) hVar.i(this.t, topGenresStoryResponse.t);
                this.u = hVar.q(this.u, topGenresStoryResponse.u);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= topGenresStoryResponse.a;
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
                                this.b = gVar.A();
                                continue;
                            case 18:
                                this.c = gVar.A();
                                continue;
                            case 26:
                                ShareConfiguration shareConfiguration = this.f;
                                ShareConfiguration.b bVar = shareConfiguration != null ? (ShareConfiguration.b) shareConfiguration.toBuilder() : null;
                                ShareConfiguration shareConfiguration2 = (ShareConfiguration) gVar.o(ShareConfiguration.parser(), kVar);
                                this.f = shareConfiguration2;
                                if (bVar != null) {
                                    bVar.mergeFrom((ShareConfiguration.b) shareConfiguration2);
                                    this.f = (ShareConfiguration) bVar.buildPartial();
                                } else {
                                    continue;
                                }
                            case 34:
                                this.n = gVar.A();
                                continue;
                            case 42:
                                ColoredText coloredText = this.o;
                                ColoredText.b bVar2 = coloredText != null ? (ColoredText.b) coloredText.toBuilder() : null;
                                ColoredText coloredText2 = (ColoredText) gVar.o(ColoredText.parser(), kVar);
                                this.o = coloredText2;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((ColoredText.b) coloredText2);
                                    this.o = (ColoredText) bVar2.buildPartial();
                                } else {
                                    continue;
                                }
                            case 50:
                                ColoredText coloredText3 = this.p;
                                ColoredText.b bVar3 = coloredText3 != null ? (ColoredText.b) coloredText3.toBuilder() : null;
                                ColoredText coloredText4 = (ColoredText) gVar.o(ColoredText.parser(), kVar);
                                this.p = coloredText4;
                                if (bVar3 != null) {
                                    bVar3.mergeFrom((ColoredText.b) coloredText4);
                                    this.p = (ColoredText) bVar3.buildPartial();
                                } else {
                                    continue;
                                }
                            case 58:
                                this.q = gVar.A();
                                continue;
                            case 66:
                                Paragraph paragraph = this.r;
                                Paragraph.b bVar4 = paragraph != null ? (Paragraph.b) paragraph.toBuilder() : null;
                                Paragraph paragraph2 = (Paragraph) gVar.o(Paragraph.parser(), kVar);
                                this.r = paragraph2;
                                if (bVar4 != null) {
                                    bVar4.mergeFrom((Paragraph.b) paragraph2);
                                    this.r = (Paragraph) bVar4.buildPartial();
                                } else {
                                    continue;
                                }
                            case 74:
                                this.s = gVar.A();
                                continue;
                            case 82:
                                ColoredText coloredText5 = this.t;
                                ColoredText.b bVar5 = coloredText5 != null ? (ColoredText.b) coloredText5.toBuilder() : null;
                                ColoredText coloredText6 = (ColoredText) gVar.o(ColoredText.parser(), kVar);
                                this.t = coloredText6;
                                if (bVar5 != null) {
                                    bVar5.mergeFrom((ColoredText.b) coloredText6);
                                    this.t = (ColoredText) bVar5.buildPartial();
                                } else {
                                    continue;
                                }
                            case 90:
                                if (!this.u.R0()) {
                                    this.u = GeneratedMessageLite.mutableCopy(this.u);
                                }
                                this.u.add(gVar.o(TopGenresBlob.parser(), kVar));
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
                this.u.C();
                return null;
            case 4:
                return new TopGenresStoryResponse();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (w == null) {
                    synchronized (TopGenresStoryResponse.class) {
                        if (w == null) {
                            w = new GeneratedMessageLite.c(v);
                        }
                    }
                }
                return w;
            default:
                throw new UnsupportedOperationException();
        }
        return v;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int p2 = !this.b.isEmpty() ? CodedOutputStream.p(1, this.b) + 0 : 0;
        if (!this.c.isEmpty()) {
            p2 += CodedOutputStream.p(2, this.c);
        }
        if (this.f != null) {
            p2 += CodedOutputStream.n(3, s());
        }
        if (!this.n.isEmpty()) {
            p2 += CodedOutputStream.p(4, this.n);
        }
        if (this.o != null) {
            p2 += CodedOutputStream.n(5, q());
        }
        if (this.p != null) {
            p2 += CodedOutputStream.n(6, p());
        }
        if (!this.q.isEmpty()) {
            p2 += CodedOutputStream.p(7, this.q);
        }
        if (this.r != null) {
            p2 += CodedOutputStream.n(8, n());
        }
        if (!this.s.isEmpty()) {
            p2 += CodedOutputStream.p(9, this.s);
        }
        if (this.t != null) {
            p2 += CodedOutputStream.n(10, u());
        }
        for (int i2 = 0; i2 < this.u.size(); i2++) {
            p2 += CodedOutputStream.n(11, this.u.get(i2));
        }
        this.memoizedSerializedSize = p2;
        return p2;
    }

    public List<TopGenresBlob> h() {
        return this.u;
    }

    public String l() {
        return this.b;
    }

    public String m() {
        return this.n;
    }

    public Paragraph n() {
        Paragraph paragraph = this.r;
        return paragraph == null ? Paragraph.h() : paragraph;
    }

    public String o() {
        return this.q;
    }

    public ColoredText p() {
        ColoredText coloredText = this.p;
        return coloredText == null ? ColoredText.h() : coloredText;
    }

    public ColoredText q() {
        ColoredText coloredText = this.o;
        return coloredText == null ? ColoredText.h() : coloredText;
    }

    public String r() {
        return this.c;
    }

    public ShareConfiguration s() {
        ShareConfiguration shareConfiguration = this.f;
        return shareConfiguration == null ? ShareConfiguration.h() : shareConfiguration;
    }

    public String t() {
        return this.s;
    }

    public ColoredText u() {
        ColoredText coloredText = this.t;
        return coloredText == null ? ColoredText.h() : coloredText;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.P(1, this.b);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(2, this.c);
        }
        if (this.f != null) {
            codedOutputStream.M(3, s());
        }
        if (!this.n.isEmpty()) {
            codedOutputStream.P(4, this.n);
        }
        if (this.o != null) {
            codedOutputStream.M(5, q());
        }
        if (this.p != null) {
            codedOutputStream.M(6, p());
        }
        if (!this.q.isEmpty()) {
            codedOutputStream.P(7, this.q);
        }
        if (this.r != null) {
            codedOutputStream.M(8, n());
        }
        if (!this.s.isEmpty()) {
            codedOutputStream.P(9, this.s);
        }
        if (this.t != null) {
            codedOutputStream.M(10, u());
        }
        for (int i = 0; i < this.u.size(); i++) {
            codedOutputStream.M(11, this.u.get(i));
        }
    }
}
