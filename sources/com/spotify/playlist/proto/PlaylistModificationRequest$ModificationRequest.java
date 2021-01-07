package com.spotify.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class PlaylistModificationRequest$ModificationRequest extends GeneratedMessageLite<PlaylistModificationRequest$ModificationRequest, a> implements Object {
    private static final PlaylistModificationRequest$ModificationRequest t;
    private static volatile x<PlaylistModificationRequest$ModificationRequest> u;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private String n = "";
    private boolean o;
    private Attributes p;
    private o.i<String> q = GeneratedMessageLite.emptyProtobufList();
    private o.i<String> r = GeneratedMessageLite.emptyProtobufList();
    private boolean s;

    public static final class Attributes extends GeneratedMessageLite<Attributes, a> implements Object {
        private static final Attributes q;
        private static volatile x<Attributes> r;
        private int a;
        private boolean b;
        private boolean c;
        private String f = "";
        private String n = "";
        private String o = "";
        private String p = "";

        public static final class a extends GeneratedMessageLite.b<Attributes, a> implements Object {
            public a m(boolean z) {
                copyOnWrite();
                Attributes.l((Attributes) this.instance, z);
                return this;
            }

            public a n(String str) {
                copyOnWrite();
                Attributes.n((Attributes) this.instance, str);
                return this;
            }

            public a o(String str) {
                copyOnWrite();
                Attributes.m((Attributes) this.instance, str);
                return this;
            }

            public a p(String str) {
                copyOnWrite();
                Attributes.i((Attributes) this.instance, str);
                return this;
            }

            public a q(boolean z) {
                copyOnWrite();
                Attributes.h((Attributes) this.instance, z);
                return this;
            }

            private a() {
                super(Attributes.q);
            }
        }

        static {
            Attributes attributes = new Attributes();
            q = attributes;
            attributes.makeImmutable();
        }

        private Attributes() {
        }

        static void h(Attributes attributes, boolean z) {
            attributes.a |= 1;
            attributes.b = z;
        }

        static void i(Attributes attributes, String str) {
            attributes.getClass();
            str.getClass();
            attributes.a |= 32;
            attributes.p = str;
        }

        static void l(Attributes attributes, boolean z) {
            attributes.a |= 2;
            attributes.c = z;
        }

        static void m(Attributes attributes, String str) {
            attributes.getClass();
            str.getClass();
            attributes.a |= 4;
            attributes.f = str;
        }

        static void n(Attributes attributes, String str) {
            attributes.getClass();
            str.getClass();
            attributes.a |= 8;
            attributes.n = str;
        }

        public static Attributes o() {
            return q;
        }

        public static a p() {
            return (a) q.toBuilder();
        }

        public static x<Attributes> parser() {
            return q.getParserForType();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return q;
                case 1:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    Attributes attributes = (Attributes) obj2;
                    this.b = hVar.f((this.a & 1) == 1, this.b, (attributes.a & 1) == 1, attributes.b);
                    this.c = hVar.f((this.a & 2) == 2, this.c, (attributes.a & 2) == 2, attributes.c);
                    this.f = hVar.n((this.a & 4) == 4, this.f, (attributes.a & 4) == 4, attributes.f);
                    this.n = hVar.n((this.a & 8) == 8, this.n, (attributes.a & 8) == 8, attributes.n);
                    this.o = hVar.n((this.a & 16) == 16, this.o, (attributes.a & 16) == 16, attributes.o);
                    boolean z2 = (this.a & 32) == 32;
                    String str = this.p;
                    if ((attributes.a & 32) == 32) {
                        z = true;
                    }
                    this.p = hVar.n(z2, str, z, attributes.p);
                    if (hVar == GeneratedMessageLite.g.a) {
                        this.a |= attributes.a;
                    }
                    return this;
                case 2:
                    g gVar = (g) obj;
                    k kVar = (k) obj2;
                    while (!z) {
                        try {
                            int B = gVar.B();
                            if (B != 0) {
                                if (B == 8) {
                                    this.a |= 1;
                                    this.b = gVar.h();
                                } else if (B == 16) {
                                    this.a |= 2;
                                    this.c = gVar.h();
                                } else if (B == 26) {
                                    String z3 = gVar.z();
                                    this.a |= 4;
                                    this.f = z3;
                                } else if (B == 34) {
                                    String z4 = gVar.z();
                                    this.a |= 8;
                                    this.n = z4;
                                } else if (B == 42) {
                                    String z5 = gVar.z();
                                    this.a |= 16;
                                    this.o = z5;
                                } else if (B == 50) {
                                    String z6 = gVar.z();
                                    this.a |= 32;
                                    this.p = z6;
                                } else if (!parseUnknownField(B, gVar)) {
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
                    return new Attributes();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (r == null) {
                        synchronized (Attributes.class) {
                            if (r == null) {
                                r = new GeneratedMessageLite.c(q);
                            }
                        }
                    }
                    return r;
                default:
                    throw new UnsupportedOperationException();
            }
            return q;
        }

        @Override // com.google.protobuf.u
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.a & 1) == 1) {
                i2 = 0 + CodedOutputStream.d(1, this.b);
            }
            if ((this.a & 2) == 2) {
                i2 += CodedOutputStream.d(2, this.c);
            }
            if ((this.a & 4) == 4) {
                i2 += CodedOutputStream.p(3, this.f);
            }
            if ((this.a & 8) == 8) {
                i2 += CodedOutputStream.p(4, this.n);
            }
            if ((this.a & 16) == 16) {
                i2 += CodedOutputStream.p(5, this.o);
            }
            if ((this.a & 32) == 32) {
                i2 += CodedOutputStream.p(6, this.p);
            }
            int c2 = this.unknownFields.c() + i2;
            this.memoizedSerializedSize = c2;
            return c2;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.a & 1) == 1) {
                codedOutputStream.A(1, this.b);
            }
            if ((this.a & 2) == 2) {
                codedOutputStream.A(2, this.c);
            }
            if ((this.a & 4) == 4) {
                codedOutputStream.P(3, this.f);
            }
            if ((this.a & 8) == 8) {
                codedOutputStream.P(4, this.n);
            }
            if ((this.a & 16) == 16) {
                codedOutputStream.P(5, this.o);
            }
            if ((this.a & 32) == 32) {
                codedOutputStream.P(6, this.p);
            }
            this.unknownFields.l(codedOutputStream);
        }
    }

    public static final class a extends GeneratedMessageLite.b<PlaylistModificationRequest$ModificationRequest, a> implements Object {
        public a m(Iterable<String> iterable) {
            copyOnWrite();
            PlaylistModificationRequest$ModificationRequest.s((PlaylistModificationRequest$ModificationRequest) this.instance, iterable);
            return this;
        }

        public a n(Iterable<String> iterable) {
            copyOnWrite();
            PlaylistModificationRequest$ModificationRequest.q((PlaylistModificationRequest$ModificationRequest) this.instance, iterable);
            return this;
        }

        public a o(String str) {
            copyOnWrite();
            PlaylistModificationRequest$ModificationRequest.r((PlaylistModificationRequest$ModificationRequest) this.instance, str);
            return this;
        }

        public a p(String str) {
            copyOnWrite();
            PlaylistModificationRequest$ModificationRequest.p((PlaylistModificationRequest$ModificationRequest) this.instance, str);
            return this;
        }

        public a q(String str) {
            copyOnWrite();
            PlaylistModificationRequest$ModificationRequest.l((PlaylistModificationRequest$ModificationRequest) this.instance, str);
            return this;
        }

        public a r(Attributes.a aVar) {
            copyOnWrite();
            PlaylistModificationRequest$ModificationRequest.o((PlaylistModificationRequest$ModificationRequest) this.instance, aVar);
            return this;
        }

        public a s(String str) {
            copyOnWrite();
            PlaylistModificationRequest$ModificationRequest.i((PlaylistModificationRequest$ModificationRequest) this.instance, str);
            return this;
        }

        public a t(boolean z) {
            copyOnWrite();
            PlaylistModificationRequest$ModificationRequest.t((PlaylistModificationRequest$ModificationRequest) this.instance, z);
            return this;
        }

        public a u(String str) {
            copyOnWrite();
            PlaylistModificationRequest$ModificationRequest.m((PlaylistModificationRequest$ModificationRequest) this.instance, str);
            return this;
        }

        public a v(String str) {
            copyOnWrite();
            PlaylistModificationRequest$ModificationRequest.h((PlaylistModificationRequest$ModificationRequest) this.instance, str);
            return this;
        }

        public a w(boolean z) {
            copyOnWrite();
            PlaylistModificationRequest$ModificationRequest.n((PlaylistModificationRequest$ModificationRequest) this.instance, z);
            return this;
        }

        private a() {
            super(PlaylistModificationRequest$ModificationRequest.t);
        }
    }

    static {
        PlaylistModificationRequest$ModificationRequest playlistModificationRequest$ModificationRequest = new PlaylistModificationRequest$ModificationRequest();
        t = playlistModificationRequest$ModificationRequest;
        playlistModificationRequest$ModificationRequest.makeImmutable();
    }

    private PlaylistModificationRequest$ModificationRequest() {
    }

    static void h(PlaylistModificationRequest$ModificationRequest playlistModificationRequest$ModificationRequest, String str) {
        playlistModificationRequest$ModificationRequest.getClass();
        str.getClass();
        playlistModificationRequest$ModificationRequest.a |= 1;
        playlistModificationRequest$ModificationRequest.b = str;
    }

    static void i(PlaylistModificationRequest$ModificationRequest playlistModificationRequest$ModificationRequest, String str) {
        playlistModificationRequest$ModificationRequest.getClass();
        str.getClass();
        playlistModificationRequest$ModificationRequest.a |= 2;
        playlistModificationRequest$ModificationRequest.c = str;
    }

    static void l(PlaylistModificationRequest$ModificationRequest playlistModificationRequest$ModificationRequest, String str) {
        playlistModificationRequest$ModificationRequest.getClass();
        str.getClass();
        playlistModificationRequest$ModificationRequest.a |= 4;
        playlistModificationRequest$ModificationRequest.f = str;
    }

    static void m(PlaylistModificationRequest$ModificationRequest playlistModificationRequest$ModificationRequest, String str) {
        playlistModificationRequest$ModificationRequest.getClass();
        str.getClass();
        playlistModificationRequest$ModificationRequest.a |= 8;
        playlistModificationRequest$ModificationRequest.n = str;
    }

    static void n(PlaylistModificationRequest$ModificationRequest playlistModificationRequest$ModificationRequest, boolean z) {
        playlistModificationRequest$ModificationRequest.a |= 16;
        playlistModificationRequest$ModificationRequest.o = z;
    }

    static void o(PlaylistModificationRequest$ModificationRequest playlistModificationRequest$ModificationRequest, Attributes.a aVar) {
        playlistModificationRequest$ModificationRequest.getClass();
        playlistModificationRequest$ModificationRequest.p = (Attributes) aVar.build();
        playlistModificationRequest$ModificationRequest.a |= 32;
    }

    static void p(PlaylistModificationRequest$ModificationRequest playlistModificationRequest$ModificationRequest, String str) {
        playlistModificationRequest$ModificationRequest.getClass();
        str.getClass();
        if (!playlistModificationRequest$ModificationRequest.q.R0()) {
            playlistModificationRequest$ModificationRequest.q = GeneratedMessageLite.mutableCopy(playlistModificationRequest$ModificationRequest.q);
        }
        playlistModificationRequest$ModificationRequest.q.add(str);
    }

    public static x<PlaylistModificationRequest$ModificationRequest> parser() {
        return t.getParserForType();
    }

    static void q(PlaylistModificationRequest$ModificationRequest playlistModificationRequest$ModificationRequest, Iterable iterable) {
        if (!playlistModificationRequest$ModificationRequest.q.R0()) {
            playlistModificationRequest$ModificationRequest.q = GeneratedMessageLite.mutableCopy(playlistModificationRequest$ModificationRequest.q);
        }
        com.google.protobuf.a.addAll(iterable, playlistModificationRequest$ModificationRequest.q);
    }

    static void r(PlaylistModificationRequest$ModificationRequest playlistModificationRequest$ModificationRequest, String str) {
        playlistModificationRequest$ModificationRequest.getClass();
        str.getClass();
        if (!playlistModificationRequest$ModificationRequest.r.R0()) {
            playlistModificationRequest$ModificationRequest.r = GeneratedMessageLite.mutableCopy(playlistModificationRequest$ModificationRequest.r);
        }
        playlistModificationRequest$ModificationRequest.r.add(str);
    }

    static void s(PlaylistModificationRequest$ModificationRequest playlistModificationRequest$ModificationRequest, Iterable iterable) {
        if (!playlistModificationRequest$ModificationRequest.r.R0()) {
            playlistModificationRequest$ModificationRequest.r = GeneratedMessageLite.mutableCopy(playlistModificationRequest$ModificationRequest.r);
        }
        com.google.protobuf.a.addAll(iterable, playlistModificationRequest$ModificationRequest.r);
    }

    static void t(PlaylistModificationRequest$ModificationRequest playlistModificationRequest$ModificationRequest, boolean z) {
        playlistModificationRequest$ModificationRequest.a |= 64;
        playlistModificationRequest$ModificationRequest.s = z;
    }

    public static a u() {
        return (a) t.toBuilder();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return t;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PlaylistModificationRequest$ModificationRequest playlistModificationRequest$ModificationRequest = (PlaylistModificationRequest$ModificationRequest) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (playlistModificationRequest$ModificationRequest.a & 1) == 1, playlistModificationRequest$ModificationRequest.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (playlistModificationRequest$ModificationRequest.a & 2) == 2, playlistModificationRequest$ModificationRequest.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (playlistModificationRequest$ModificationRequest.a & 4) == 4, playlistModificationRequest$ModificationRequest.f);
                this.n = hVar.n((this.a & 8) == 8, this.n, (playlistModificationRequest$ModificationRequest.a & 8) == 8, playlistModificationRequest$ModificationRequest.n);
                this.o = hVar.f((this.a & 16) == 16, this.o, (playlistModificationRequest$ModificationRequest.a & 16) == 16, playlistModificationRequest$ModificationRequest.o);
                this.p = (Attributes) hVar.i(this.p, playlistModificationRequest$ModificationRequest.p);
                this.q = hVar.q(this.q, playlistModificationRequest$ModificationRequest.q);
                this.r = hVar.q(this.r, playlistModificationRequest$ModificationRequest.r);
                boolean z2 = (this.a & 64) == 64;
                boolean z3 = this.s;
                if ((playlistModificationRequest$ModificationRequest.a & 64) == 64) {
                    z = true;
                }
                this.s = hVar.f(z2, z3, z, playlistModificationRequest$ModificationRequest.s);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= playlistModificationRequest$ModificationRequest.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                String z4 = gVar.z();
                                this.a |= 1;
                                this.b = z4;
                            } else if (B == 18) {
                                String z5 = gVar.z();
                                this.a |= 2;
                                this.c = z5;
                            } else if (B == 26) {
                                String z6 = gVar.z();
                                this.a |= 4;
                                this.f = z6;
                            } else if (B == 34) {
                                String z7 = gVar.z();
                                this.a |= 8;
                                this.n = z7;
                            } else if (B == 40) {
                                this.a |= 16;
                                this.o = gVar.h();
                            } else if (B == 50) {
                                Attributes.a aVar = (this.a & 32) == 32 ? (Attributes.a) this.p.toBuilder() : null;
                                Attributes attributes = (Attributes) gVar.o(Attributes.parser(), kVar);
                                this.p = attributes;
                                if (aVar != null) {
                                    aVar.mergeFrom((Attributes.a) attributes);
                                    this.p = (Attributes) aVar.buildPartial();
                                }
                                this.a |= 32;
                            } else if (B == 58) {
                                String z8 = gVar.z();
                                if (!this.q.R0()) {
                                    this.q = GeneratedMessageLite.mutableCopy(this.q);
                                }
                                this.q.add(z8);
                            } else if (B == 66) {
                                String z9 = gVar.z();
                                if (!this.r.R0()) {
                                    this.r = GeneratedMessageLite.mutableCopy(this.r);
                                }
                                this.r.add(z9);
                            } else if (B == 72) {
                                this.a |= 64;
                                this.s = gVar.h();
                            } else if (!parseUnknownField(B, gVar)) {
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
                this.q.C();
                this.r.C();
                return null;
            case 4:
                return new PlaylistModificationRequest$ModificationRequest();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (u == null) {
                    synchronized (PlaylistModificationRequest$ModificationRequest.class) {
                        if (u == null) {
                            u = new GeneratedMessageLite.c(t);
                        }
                    }
                }
                return u;
            default:
                throw new UnsupportedOperationException();
        }
        return t;
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
            p2 += CodedOutputStream.p(4, this.n);
        }
        if ((this.a & 16) == 16) {
            p2 += CodedOutputStream.d(5, this.o);
        }
        if ((this.a & 32) == 32) {
            Attributes attributes = this.p;
            if (attributes == null) {
                attributes = Attributes.o();
            }
            p2 += CodedOutputStream.n(6, attributes);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.q.size(); i3++) {
            i2 += CodedOutputStream.q(this.q.get(i3));
        }
        int C0 = je.C0(this.q, 1, p2 + i2);
        int i4 = 0;
        for (int i5 = 0; i5 < this.r.size(); i5++) {
            i4 += CodedOutputStream.q(this.r.get(i5));
        }
        int C02 = je.C0(this.r, 1, C0 + i4);
        if ((this.a & 64) == 64) {
            C02 += CodedOutputStream.d(9, this.s);
        }
        int c2 = this.unknownFields.c() + C02;
        this.memoizedSerializedSize = c2;
        return c2;
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
            codedOutputStream.P(4, this.n);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.A(5, this.o);
        }
        if ((this.a & 32) == 32) {
            Attributes attributes = this.p;
            if (attributes == null) {
                attributes = Attributes.o();
            }
            codedOutputStream.M(6, attributes);
        }
        for (int i = 0; i < this.q.size(); i++) {
            codedOutputStream.P(7, this.q.get(i));
        }
        for (int i2 = 0; i2 < this.r.size(); i2++) {
            codedOutputStream.P(8, this.r.get(i2));
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.A(9, this.s);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
