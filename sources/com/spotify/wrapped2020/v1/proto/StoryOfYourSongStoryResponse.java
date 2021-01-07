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

public final class StoryOfYourSongStoryResponse extends GeneratedMessageLite<StoryOfYourSongStoryResponse, b> implements Object {
    private static final StoryOfYourSongStoryResponse u;
    private static volatile x<StoryOfYourSongStoryResponse> v;
    private int a;
    private String b = "";
    private ShareConfiguration c;
    private String f = "";
    private Paragraph n;
    private String o = "";
    private int p;
    private o.i<Statistic> q = GeneratedMessageLite.emptyProtobufList();
    private ColoredText r;
    private ColoredText s;
    private String t = "";

    public static final class Statistic extends GeneratedMessageLite<Statistic, a> implements Object {
        private static final Statistic c;
        private static volatile x<Statistic> f;
        private ColoredText a;
        private ColoredText b;

        public static final class a extends GeneratedMessageLite.b<Statistic, a> implements Object {
            private a() {
                super(Statistic.c);
            }
        }

        static {
            Statistic statistic = new Statistic();
            c = statistic;
            statistic.makeImmutable();
        }

        private Statistic() {
        }

        public static x<Statistic> parser() {
            return c.getParserForType();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return c;
                case 1:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    Statistic statistic = (Statistic) obj2;
                    this.a = (ColoredText) hVar.i(this.a, statistic.a);
                    this.b = (ColoredText) hVar.i(this.b, statistic.b);
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
                                    ColoredText coloredText = this.a;
                                    ColoredText.b bVar = coloredText != null ? (ColoredText.b) coloredText.toBuilder() : null;
                                    ColoredText coloredText2 = (ColoredText) gVar.o(ColoredText.parser(), kVar);
                                    this.a = coloredText2;
                                    if (bVar != null) {
                                        bVar.mergeFrom((ColoredText.b) coloredText2);
                                        this.a = (ColoredText) bVar.buildPartial();
                                    }
                                } else if (B == 18) {
                                    ColoredText coloredText3 = this.b;
                                    ColoredText.b bVar2 = coloredText3 != null ? (ColoredText.b) coloredText3.toBuilder() : null;
                                    ColoredText coloredText4 = (ColoredText) gVar.o(ColoredText.parser(), kVar);
                                    this.b = coloredText4;
                                    if (bVar2 != null) {
                                        bVar2.mergeFrom((ColoredText.b) coloredText4);
                                        this.b = (ColoredText) bVar2.buildPartial();
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
                    return new Statistic();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (f == null) {
                        synchronized (Statistic.class) {
                            if (f == null) {
                                f = new GeneratedMessageLite.c(c);
                            }
                        }
                    }
                    return f;
                default:
                    throw new UnsupportedOperationException();
            }
            return c;
        }

        @Override // com.google.protobuf.u
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.a != null) {
                i2 = 0 + CodedOutputStream.n(1, i());
            }
            if (this.b != null) {
                i2 += CodedOutputStream.n(2, h());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public ColoredText h() {
            ColoredText coloredText = this.b;
            return coloredText == null ? ColoredText.h() : coloredText;
        }

        public ColoredText i() {
            ColoredText coloredText = this.a;
            return coloredText == null ? ColoredText.h() : coloredText;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (this.a != null) {
                codedOutputStream.M(1, i());
            }
            if (this.b != null) {
                codedOutputStream.M(2, h());
            }
        }
    }

    public static final class b extends GeneratedMessageLite.b<StoryOfYourSongStoryResponse, b> implements Object {
        private b() {
            super(StoryOfYourSongStoryResponse.u);
        }
    }

    static {
        StoryOfYourSongStoryResponse storyOfYourSongStoryResponse = new StoryOfYourSongStoryResponse();
        u = storyOfYourSongStoryResponse;
        storyOfYourSongStoryResponse.makeImmutable();
    }

    private StoryOfYourSongStoryResponse() {
    }

    public static StoryOfYourSongStoryResponse l() {
        return u;
    }

    public static x<StoryOfYourSongStoryResponse> parser() {
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
                StoryOfYourSongStoryResponse storyOfYourSongStoryResponse = (StoryOfYourSongStoryResponse) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, !storyOfYourSongStoryResponse.b.isEmpty(), storyOfYourSongStoryResponse.b);
                this.c = (ShareConfiguration) hVar.i(this.c, storyOfYourSongStoryResponse.c);
                this.f = hVar.n(!this.f.isEmpty(), this.f, !storyOfYourSongStoryResponse.f.isEmpty(), storyOfYourSongStoryResponse.f);
                this.n = (Paragraph) hVar.i(this.n, storyOfYourSongStoryResponse.n);
                this.o = hVar.n(!this.o.isEmpty(), this.o, !storyOfYourSongStoryResponse.o.isEmpty(), storyOfYourSongStoryResponse.o);
                int i = this.p;
                boolean z2 = i != 0;
                int i2 = storyOfYourSongStoryResponse.p;
                if (i2 != 0) {
                    z = true;
                }
                this.p = hVar.m(z2, i, z, i2);
                this.q = hVar.q(this.q, storyOfYourSongStoryResponse.q);
                this.r = (ColoredText) hVar.i(this.r, storyOfYourSongStoryResponse.r);
                this.s = (ColoredText) hVar.i(this.s, storyOfYourSongStoryResponse.s);
                this.t = hVar.n(!this.t.isEmpty(), this.t, true ^ storyOfYourSongStoryResponse.t.isEmpty(), storyOfYourSongStoryResponse.t);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= storyOfYourSongStoryResponse.a;
                }
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
                                this.b = gVar.A();
                                continue;
                            case 18:
                                ShareConfiguration shareConfiguration = this.c;
                                ShareConfiguration.b bVar = shareConfiguration != null ? (ShareConfiguration.b) shareConfiguration.toBuilder() : null;
                                ShareConfiguration shareConfiguration2 = (ShareConfiguration) gVar.o(ShareConfiguration.parser(), kVar);
                                this.c = shareConfiguration2;
                                if (bVar != null) {
                                    bVar.mergeFrom((ShareConfiguration.b) shareConfiguration2);
                                    this.c = (ShareConfiguration) bVar.buildPartial();
                                } else {
                                    continue;
                                }
                            case 26:
                                this.f = gVar.A();
                                continue;
                            case 34:
                                Paragraph paragraph = this.n;
                                Paragraph.b bVar2 = paragraph != null ? (Paragraph.b) paragraph.toBuilder() : null;
                                Paragraph paragraph2 = (Paragraph) gVar.o(Paragraph.parser(), kVar);
                                this.n = paragraph2;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((Paragraph.b) paragraph2);
                                    this.n = (Paragraph) bVar2.buildPartial();
                                } else {
                                    continue;
                                }
                            case 42:
                                this.o = gVar.A();
                                continue;
                            case 48:
                                this.p = gVar.u();
                                continue;
                            case 58:
                                if (!this.q.R0()) {
                                    this.q = GeneratedMessageLite.mutableCopy(this.q);
                                }
                                this.q.add(gVar.o(Statistic.parser(), kVar));
                                continue;
                            case 66:
                                ColoredText coloredText = this.r;
                                ColoredText.b bVar3 = coloredText != null ? (ColoredText.b) coloredText.toBuilder() : null;
                                ColoredText coloredText2 = (ColoredText) gVar.o(ColoredText.parser(), kVar);
                                this.r = coloredText2;
                                if (bVar3 != null) {
                                    bVar3.mergeFrom((ColoredText.b) coloredText2);
                                    this.r = (ColoredText) bVar3.buildPartial();
                                } else {
                                    continue;
                                }
                            case 74:
                                ColoredText coloredText3 = this.s;
                                ColoredText.b bVar4 = coloredText3 != null ? (ColoredText.b) coloredText3.toBuilder() : null;
                                ColoredText coloredText4 = (ColoredText) gVar.o(ColoredText.parser(), kVar);
                                this.s = coloredText4;
                                if (bVar4 != null) {
                                    bVar4.mergeFrom((ColoredText.b) coloredText4);
                                    this.s = (ColoredText) bVar4.buildPartial();
                                } else {
                                    continue;
                                }
                            case 82:
                                this.t = gVar.A();
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
                this.q.C();
                return null;
            case 4:
                return new StoryOfYourSongStoryResponse();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (v == null) {
                    synchronized (StoryOfYourSongStoryResponse.class) {
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
        int p2 = !this.b.isEmpty() ? CodedOutputStream.p(1, this.b) + 0 : 0;
        if (this.c != null) {
            p2 += CodedOutputStream.n(2, q());
        }
        if (!this.f.isEmpty()) {
            p2 += CodedOutputStream.p(3, this.f);
        }
        if (this.n != null) {
            p2 += CodedOutputStream.n(4, o());
        }
        if (!this.o.isEmpty()) {
            p2 += CodedOutputStream.p(5, this.o);
        }
        if (this.p != Gradient.VERSION_1.getNumber()) {
            p2 += CodedOutputStream.h(6, this.p);
        }
        for (int i2 = 0; i2 < this.q.size(); i2++) {
            p2 += CodedOutputStream.n(7, this.q.get(i2));
        }
        if (this.r != null) {
            p2 += CodedOutputStream.n(8, t());
        }
        if (this.s != null) {
            p2 += CodedOutputStream.n(9, s());
        }
        if (!this.t.isEmpty()) {
            p2 += CodedOutputStream.p(10, this.t);
        }
        this.memoizedSerializedSize = p2;
        return p2;
    }

    public String h() {
        return this.f;
    }

    public Gradient i() {
        Gradient d = Gradient.d(this.p);
        return d == null ? Gradient.UNRECOGNIZED : d;
    }

    public String m() {
        return this.t;
    }

    public String n() {
        return this.o;
    }

    public Paragraph o() {
        Paragraph paragraph = this.n;
        return paragraph == null ? Paragraph.h() : paragraph;
    }

    public String p() {
        return this.b;
    }

    public ShareConfiguration q() {
        ShareConfiguration shareConfiguration = this.c;
        return shareConfiguration == null ? ShareConfiguration.h() : shareConfiguration;
    }

    public List<Statistic> r() {
        return this.q;
    }

    public ColoredText s() {
        ColoredText coloredText = this.s;
        return coloredText == null ? ColoredText.h() : coloredText;
    }

    public ColoredText t() {
        ColoredText coloredText = this.r;
        return coloredText == null ? ColoredText.h() : coloredText;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.P(1, this.b);
        }
        if (this.c != null) {
            codedOutputStream.M(2, q());
        }
        if (!this.f.isEmpty()) {
            codedOutputStream.P(3, this.f);
        }
        if (this.n != null) {
            codedOutputStream.M(4, o());
        }
        if (!this.o.isEmpty()) {
            codedOutputStream.P(5, this.o);
        }
        if (this.p != Gradient.VERSION_1.getNumber()) {
            codedOutputStream.K(6, this.p);
        }
        for (int i = 0; i < this.q.size(); i++) {
            codedOutputStream.M(7, this.q.get(i));
        }
        if (this.r != null) {
            codedOutputStream.M(8, t());
        }
        if (this.s != null) {
            codedOutputStream.M(9, s());
        }
        if (!this.t.isEmpty()) {
            codedOutputStream.P(10, this.t);
        }
    }
}
