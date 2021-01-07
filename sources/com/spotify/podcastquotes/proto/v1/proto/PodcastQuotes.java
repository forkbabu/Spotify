package com.spotify.podcastquotes.proto.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class PodcastQuotes extends GeneratedMessageLite<PodcastQuotes, b> implements Object {
    private static final PodcastQuotes b;
    private static volatile x<PodcastQuotes> c;
    private o.i<Quote> a = GeneratedMessageLite.emptyProtobufList();

    public static final class Quote extends GeneratedMessageLite<Quote, a> implements Object {
        private static final Quote o;
        private static volatile x<Quote> p;
        private Image a;
        private String b = "";
        private ShareInfo c;
        private int f;
        private String n = "";

        public static final class Image extends GeneratedMessageLite<Image, a> implements Object {
            private static final Image c;
            private static volatile x<Image> f;
            private String a = "";
            private String b = "";

            public static final class a extends GeneratedMessageLite.b<Image, a> implements Object {
                private a() {
                    super(Image.c);
                }
            }

            static {
                Image image = new Image();
                c = image;
                image.makeImmutable();
            }

            private Image() {
            }

            public static Image h() {
                return c;
            }

            public static x<Image> parser() {
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
                        Image image = (Image) obj2;
                        this.a = hVar.n(!this.a.isEmpty(), this.a, !image.a.isEmpty(), image.a);
                        this.b = hVar.n(!this.b.isEmpty(), this.b, true ^ image.b.isEmpty(), image.b);
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
                                        this.b = gVar.A();
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
                        return new Image();
                    case 5:
                        return new a();
                    case 6:
                        break;
                    case 7:
                        if (f == null) {
                            synchronized (Image.class) {
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
                if (!this.a.isEmpty()) {
                    i2 = 0 + CodedOutputStream.p(1, this.a);
                }
                if (!this.b.isEmpty()) {
                    i2 += CodedOutputStream.p(2, this.b);
                }
                this.memoizedSerializedSize = i2;
                return i2;
            }

            public String i() {
                return this.b;
            }

            public String l() {
                return this.a;
            }

            @Override // com.google.protobuf.u
            public void writeTo(CodedOutputStream codedOutputStream) {
                if (!this.a.isEmpty()) {
                    codedOutputStream.P(1, this.a);
                }
                if (!this.b.isEmpty()) {
                    codedOutputStream.P(2, this.b);
                }
            }
        }

        public static final class ShareInfo extends GeneratedMessageLite<ShareInfo, a> implements Object {
            private static final ShareInfo n;
            private static volatile x<ShareInfo> o;
            private String a = "";
            private String b = "";
            private String c = "";
            private String f = "";

            public static final class a extends GeneratedMessageLite.b<ShareInfo, a> implements Object {
                private a() {
                    super(ShareInfo.n);
                }
            }

            static {
                ShareInfo shareInfo = new ShareInfo();
                n = shareInfo;
                shareInfo.makeImmutable();
            }

            private ShareInfo() {
            }

            public static ShareInfo h() {
                return n;
            }

            public static x<ShareInfo> parser() {
                return n.getParserForType();
            }

            /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
            /* access modifiers changed from: protected */
            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                switch (methodToInvoke.ordinal()) {
                    case 0:
                        return n;
                    case 1:
                        GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                        ShareInfo shareInfo = (ShareInfo) obj2;
                        this.a = hVar.n(!this.a.isEmpty(), this.a, !shareInfo.a.isEmpty(), shareInfo.a);
                        this.b = hVar.n(!this.b.isEmpty(), this.b, !shareInfo.b.isEmpty(), shareInfo.b);
                        this.c = hVar.n(!this.c.isEmpty(), this.c, !shareInfo.c.isEmpty(), shareInfo.c);
                        this.f = hVar.n(!this.f.isEmpty(), this.f, true ^ shareInfo.f.isEmpty(), shareInfo.f);
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
                                        this.b = gVar.A();
                                    } else if (B == 26) {
                                        this.c = gVar.A();
                                    } else if (B == 34) {
                                        this.f = gVar.A();
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
                        return new ShareInfo();
                    case 5:
                        return new a();
                    case 6:
                        break;
                    case 7:
                        if (o == null) {
                            synchronized (ShareInfo.class) {
                                if (o == null) {
                                    o = new GeneratedMessageLite.c(n);
                                }
                            }
                        }
                        return o;
                    default:
                        throw new UnsupportedOperationException();
                }
                return n;
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
                if (!this.f.isEmpty()) {
                    i2 += CodedOutputStream.p(4, this.f);
                }
                this.memoizedSerializedSize = i2;
                return i2;
            }

            public String i() {
                return this.f;
            }

            public String l() {
                return this.b;
            }

            public String m() {
                return this.c;
            }

            public String n() {
                return this.a;
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
                if (!this.f.isEmpty()) {
                    codedOutputStream.P(4, this.f);
                }
            }
        }

        public static final class a extends GeneratedMessageLite.b<Quote, a> implements Object {
            private a() {
                super(Quote.o);
            }
        }

        static {
            Quote quote = new Quote();
            o = quote;
            quote.makeImmutable();
        }

        private Quote() {
        }

        public static x<Quote> parser() {
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
                    Quote quote = (Quote) obj2;
                    this.a = (Image) hVar.i(this.a, quote.a);
                    this.b = hVar.n(!this.b.isEmpty(), this.b, !quote.b.isEmpty(), quote.b);
                    this.c = (ShareInfo) hVar.i(this.c, quote.c);
                    int i = this.f;
                    boolean z2 = i != 0;
                    int i2 = quote.f;
                    if (i2 != 0) {
                        z = true;
                    }
                    this.f = hVar.m(z2, i, z, i2);
                    this.n = hVar.n(!this.n.isEmpty(), this.n, true ^ quote.n.isEmpty(), quote.n);
                    return this;
                case 2:
                    g gVar = (g) obj;
                    k kVar = (k) obj2;
                    while (!z) {
                        try {
                            int B = gVar.B();
                            if (B != 0) {
                                if (B == 10) {
                                    Image image = this.a;
                                    Image.a aVar = image != null ? (Image.a) image.toBuilder() : null;
                                    Image image2 = (Image) gVar.o(Image.parser(), kVar);
                                    this.a = image2;
                                    if (aVar != null) {
                                        aVar.mergeFrom((Image.a) image2);
                                        this.a = (Image) aVar.buildPartial();
                                    }
                                } else if (B == 18) {
                                    this.b = gVar.A();
                                } else if (B == 26) {
                                    ShareInfo shareInfo = this.c;
                                    ShareInfo.a aVar2 = shareInfo != null ? (ShareInfo.a) shareInfo.toBuilder() : null;
                                    ShareInfo shareInfo2 = (ShareInfo) gVar.o(ShareInfo.parser(), kVar);
                                    this.c = shareInfo2;
                                    if (aVar2 != null) {
                                        aVar2.mergeFrom((ShareInfo.a) shareInfo2);
                                        this.c = (ShareInfo) aVar2.buildPartial();
                                    }
                                } else if (B == 32) {
                                    this.f = gVar.u();
                                } else if (B == 42) {
                                    this.n = gVar.A();
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
                    return new Quote();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (p == null) {
                        synchronized (Quote.class) {
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
            if (this.a != null) {
                i2 = 0 + CodedOutputStream.n(1, i());
            }
            if (!this.b.isEmpty()) {
                i2 += CodedOutputStream.p(2, this.b);
            }
            if (this.c != null) {
                i2 += CodedOutputStream.n(3, l());
            }
            int i3 = this.f;
            if (i3 != 0) {
                i2 += CodedOutputStream.s(4, i3);
            }
            if (!this.n.isEmpty()) {
                i2 += CodedOutputStream.p(5, this.n);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public String h() {
            return this.n;
        }

        public Image i() {
            Image image = this.a;
            return image == null ? Image.h() : image;
        }

        public ShareInfo l() {
            ShareInfo shareInfo = this.c;
            return shareInfo == null ? ShareInfo.h() : shareInfo;
        }

        public String m() {
            return this.b;
        }

        public int n() {
            return this.f;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (this.a != null) {
                codedOutputStream.M(1, i());
            }
            if (!this.b.isEmpty()) {
                codedOutputStream.P(2, this.b);
            }
            if (this.c != null) {
                codedOutputStream.M(3, l());
            }
            int i = this.f;
            if (i != 0) {
                codedOutputStream.S(4, i);
            }
            if (!this.n.isEmpty()) {
                codedOutputStream.P(5, this.n);
            }
        }
    }

    public static final class b extends GeneratedMessageLite.b<PodcastQuotes, b> implements Object {
        private b() {
            super(PodcastQuotes.b);
        }
    }

    static {
        PodcastQuotes podcastQuotes = new PodcastQuotes();
        b = podcastQuotes;
        podcastQuotes.makeImmutable();
    }

    private PodcastQuotes() {
    }

    public static PodcastQuotes h() {
        return b;
    }

    public static x<PodcastQuotes> parser() {
        return b.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return b;
            case 1:
                this.a = ((GeneratedMessageLite.h) obj).q(this.a, ((PodcastQuotes) obj2).a);
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
                                if (!this.a.R0()) {
                                    this.a = GeneratedMessageLite.mutableCopy(this.a);
                                }
                                this.a.add(gVar.o(Quote.parser(), kVar));
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
                this.a.C();
                return null;
            case 4:
                return new PodcastQuotes();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (c == null) {
                    synchronized (PodcastQuotes.class) {
                        if (c == null) {
                            c = new GeneratedMessageLite.c(b);
                        }
                    }
                }
                return c;
            default:
                throw new UnsupportedOperationException();
        }
        return b;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            i2 += CodedOutputStream.n(1, this.a.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public List<Quote> i() {
        return this.a;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.a.size(); i++) {
            codedOutputStream.M(1, this.a.get(i));
        }
    }
}
