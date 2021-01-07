package com.spotify.allboarding.model.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.allboarding.model.v1.proto.Logging;
import com.spotify.allboarding.model.v1.proto.NullableString;
import java.io.IOException;
import java.util.List;

public final class SquircleArtistMore extends GeneratedMessageLite<SquircleArtistMore, b> implements Object {
    private static final SquircleArtistMore r;
    private static volatile x<SquircleArtistMore> s;
    private int a;
    private String b = "";
    private String c = "";
    private o.i<SquircleArtist> f = GeneratedMessageLite.emptyProtobufList();
    private NullableString n;
    private String o = "";
    private Logging p;
    private int q;

    public static final class b extends GeneratedMessageLite.b<SquircleArtistMore, b> implements Object {
        private b() {
            super(SquircleArtistMore.r);
        }
    }

    static {
        SquircleArtistMore squircleArtistMore = new SquircleArtistMore();
        r = squircleArtistMore;
        squircleArtistMore.makeImmutable();
    }

    private SquircleArtistMore() {
    }

    public static SquircleArtistMore i() {
        return r;
    }

    public static x<SquircleArtistMore> parser() {
        return r.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return r;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                SquircleArtistMore squircleArtistMore = (SquircleArtistMore) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, !squircleArtistMore.b.isEmpty(), squircleArtistMore.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !squircleArtistMore.c.isEmpty(), squircleArtistMore.c);
                this.f = hVar.q(this.f, squircleArtistMore.f);
                this.n = (NullableString) hVar.i(this.n, squircleArtistMore.n);
                this.o = hVar.n(!this.o.isEmpty(), this.o, !squircleArtistMore.o.isEmpty(), squircleArtistMore.o);
                this.p = (Logging) hVar.i(this.p, squircleArtistMore.p);
                int i = this.q;
                boolean z2 = i != 0;
                int i2 = squircleArtistMore.q;
                if (i2 != 0) {
                    z = true;
                }
                this.q = hVar.m(z2, i, z, i2);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= squircleArtistMore.a;
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
                                this.b = gVar.A();
                            } else if (B == 18) {
                                this.c = gVar.A();
                            } else if (B == 26) {
                                if (!this.f.R0()) {
                                    this.f = GeneratedMessageLite.mutableCopy(this.f);
                                }
                                this.f.add(gVar.o(SquircleArtist.parser(), kVar));
                            } else if (B == 34) {
                                NullableString nullableString = this.n;
                                NullableString.b bVar = nullableString != null ? (NullableString.b) nullableString.toBuilder() : null;
                                NullableString nullableString2 = (NullableString) gVar.o(NullableString.parser(), kVar);
                                this.n = nullableString2;
                                if (bVar != null) {
                                    bVar.mergeFrom((NullableString.b) nullableString2);
                                    this.n = (NullableString) bVar.buildPartial();
                                }
                            } else if (B == 42) {
                                this.o = gVar.A();
                            } else if (B == 50) {
                                Logging logging = this.p;
                                Logging.b bVar2 = logging != null ? (Logging.b) logging.toBuilder() : null;
                                Logging logging2 = (Logging) gVar.o(Logging.parser(), kVar);
                                this.p = logging2;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((Logging.b) logging2);
                                    this.p = (Logging) bVar2.buildPartial();
                                }
                            } else if (B == 56) {
                                this.q = gVar.u();
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
                this.f.C();
                return null;
            case 4:
                return new SquircleArtistMore();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (s == null) {
                    synchronized (SquircleArtistMore.class) {
                        if (s == null) {
                            s = new GeneratedMessageLite.c(r);
                        }
                    }
                }
                return s;
            default:
                throw new UnsupportedOperationException();
        }
        return r;
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
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            p2 += CodedOutputStream.n(3, this.f.get(i2));
        }
        if (this.n != null) {
            p2 += CodedOutputStream.n(4, n());
        }
        if (!this.o.isEmpty()) {
            p2 += CodedOutputStream.p(5, this.o);
        }
        if (this.p != null) {
            p2 += CodedOutputStream.n(6, m());
        }
        int i3 = this.q;
        if (i3 != 0) {
            p2 += CodedOutputStream.j(7, i3);
        }
        this.memoizedSerializedSize = p2;
        return p2;
    }

    public String h() {
        return this.o;
    }

    public int l() {
        return this.q;
    }

    public Logging m() {
        Logging logging = this.p;
        return logging == null ? Logging.i() : logging;
    }

    public NullableString n() {
        NullableString nullableString = this.n;
        return nullableString == null ? NullableString.h() : nullableString;
    }

    public List<SquircleArtist> o() {
        return this.f;
    }

    public String p() {
        return this.c;
    }

    public String q() {
        return this.b;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.P(1, this.b);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(2, this.c);
        }
        for (int i = 0; i < this.f.size(); i++) {
            codedOutputStream.M(3, this.f.get(i));
        }
        if (this.n != null) {
            codedOutputStream.M(4, n());
        }
        if (!this.o.isEmpty()) {
            codedOutputStream.P(5, this.o);
        }
        if (this.p != null) {
            codedOutputStream.M(6, m());
        }
        int i2 = this.q;
        if (i2 != 0) {
            codedOutputStream.K(7, i2);
        }
    }
}
