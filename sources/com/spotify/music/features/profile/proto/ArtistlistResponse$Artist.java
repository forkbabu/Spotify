package com.spotify.music.features.profile.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class ArtistlistResponse$Artist extends GeneratedMessageLite<ArtistlistResponse$Artist, a> implements Object {
    private static final ArtistlistResponse$Artist o;
    private static volatile x<ArtistlistResponse$Artist> p;
    private String a = "";
    private String b = "";
    private String c = "";
    private int f;
    private boolean n;

    public static final class a extends GeneratedMessageLite.b<ArtistlistResponse$Artist, a> implements Object {
        private a() {
            super(ArtistlistResponse$Artist.o);
        }
    }

    static {
        ArtistlistResponse$Artist artistlistResponse$Artist = new ArtistlistResponse$Artist();
        o = artistlistResponse$Artist;
        artistlistResponse$Artist.makeImmutable();
    }

    private ArtistlistResponse$Artist() {
    }

    public static x<ArtistlistResponse$Artist> parser() {
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
                ArtistlistResponse$Artist artistlistResponse$Artist = (ArtistlistResponse$Artist) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !artistlistResponse$Artist.a.isEmpty(), artistlistResponse$Artist.a);
                this.b = hVar.n(!this.b.isEmpty(), this.b, !artistlistResponse$Artist.b.isEmpty(), artistlistResponse$Artist.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !artistlistResponse$Artist.c.isEmpty(), artistlistResponse$Artist.c);
                int i = this.f;
                boolean z2 = i != 0;
                int i2 = artistlistResponse$Artist.f;
                if (i2 != 0) {
                    z = true;
                }
                this.f = hVar.m(z2, i, z, i2);
                boolean z3 = this.n;
                boolean z4 = artistlistResponse$Artist.n;
                this.n = hVar.f(z3, z3, z4, z4);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
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
                            } else if (B == 32) {
                                this.f = gVar.u();
                            } else if (B == 40) {
                                this.n = gVar.h();
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
                return new ArtistlistResponse$Artist();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (ArtistlistResponse$Artist.class) {
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
        if (!this.a.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.a);
        }
        if (!this.b.isEmpty()) {
            i2 += CodedOutputStream.p(2, this.b);
        }
        if (!this.c.isEmpty()) {
            i2 += CodedOutputStream.p(3, this.c);
        }
        int i3 = this.f;
        if (i3 != 0) {
            i2 += CodedOutputStream.j(4, i3);
        }
        boolean z = this.n;
        if (z) {
            i2 += CodedOutputStream.d(5, z);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public int h() {
        return this.f;
    }

    public String i() {
        return this.c;
    }

    public String l() {
        return this.b;
    }

    public String m() {
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
        int i = this.f;
        if (i != 0) {
            codedOutputStream.K(4, i);
        }
        boolean z = this.n;
        if (z) {
            codedOutputStream.A(5, z);
        }
    }
}
