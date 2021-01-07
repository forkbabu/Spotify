package com.spotify.podcastextensions.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class Podcastextensions$PodcastHtmlDescription extends GeneratedMessageLite<Podcastextensions$PodcastHtmlDescription, a> implements Object {
    private static final Podcastextensions$PodcastHtmlDescription c;
    private static volatile x<Podcastextensions$PodcastHtmlDescription> f;
    private Header a;
    private String b = "";

    public static final class Header extends GeneratedMessageLite<Header, a> implements Object {
        private static final Header a;
        private static volatile x<Header> b;

        public static final class a extends GeneratedMessageLite.b<Header, a> implements Object {
            private a() {
                super(Header.a);
            }
        }

        static {
            Header header = new Header();
            a = header;
            header.makeImmutable();
        }

        private Header() {
        }

        public static x<Header> parser() {
            return a.getParserForType();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return a;
                case 1:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    Header header = (Header) obj2;
                    return this;
                case 2:
                    g gVar = (g) obj;
                    k kVar = (k) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int B = gVar.B();
                            if (B == 0 || !gVar.F(B)) {
                                z = true;
                            }
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
                    return new Header();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (b == null) {
                        synchronized (Header.class) {
                            if (b == null) {
                                b = new GeneratedMessageLite.c(a);
                            }
                        }
                    }
                    return b;
                default:
                    throw new UnsupportedOperationException();
            }
            return a;
        }

        @Override // com.google.protobuf.u
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            this.memoizedSerializedSize = 0;
            return 0;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
        }
    }

    public static final class a extends GeneratedMessageLite.b<Podcastextensions$PodcastHtmlDescription, a> implements Object {
        private a() {
            super(Podcastextensions$PodcastHtmlDescription.c);
        }
    }

    static {
        Podcastextensions$PodcastHtmlDescription podcastextensions$PodcastHtmlDescription = new Podcastextensions$PodcastHtmlDescription();
        c = podcastextensions$PodcastHtmlDescription;
        podcastextensions$PodcastHtmlDescription.makeImmutable();
    }

    private Podcastextensions$PodcastHtmlDescription() {
    }

    public static Podcastextensions$PodcastHtmlDescription h() {
        return c;
    }

    public static x<Podcastextensions$PodcastHtmlDescription> parser() {
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
                Podcastextensions$PodcastHtmlDescription podcastextensions$PodcastHtmlDescription = (Podcastextensions$PodcastHtmlDescription) obj2;
                this.a = (Header) hVar.i(this.a, podcastextensions$PodcastHtmlDescription.a);
                this.b = hVar.n(!this.b.isEmpty(), this.b, true ^ podcastextensions$PodcastHtmlDescription.b.isEmpty(), podcastextensions$PodcastHtmlDescription.b);
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
                                Header header = this.a;
                                Header.a aVar = header != null ? (Header.a) header.toBuilder() : null;
                                Header header2 = (Header) gVar.o(Header.parser(), kVar);
                                this.a = header2;
                                if (aVar != null) {
                                    aVar.mergeFrom((Header.a) header2);
                                    this.a = (Header) aVar.buildPartial();
                                }
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
                return new Podcastextensions$PodcastHtmlDescription();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (Podcastextensions$PodcastHtmlDescription.class) {
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
        Header header = this.a;
        if (header != null) {
            i2 = 0 + CodedOutputStream.n(1, header);
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

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        Header header = this.a;
        if (header != null) {
            codedOutputStream.M(1, header);
        }
        if (!this.b.isEmpty()) {
            codedOutputStream.P(2, this.b);
        }
    }
}
