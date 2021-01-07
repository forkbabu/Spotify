package com.spotify.mobile.android.spotlets.collection.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class ArtistState$ProtoArtistCollectionState extends GeneratedMessageLite<ArtistState$ProtoArtistCollectionState, a> implements Object {
    private static final ArtistState$ProtoArtistCollectionState p;
    private static volatile x<ArtistState$ProtoArtistCollectionState> q;
    private int a;
    private String b = "";
    private boolean c;
    private int f;
    private int n;
    private boolean o;

    public static final class a extends GeneratedMessageLite.b<ArtistState$ProtoArtistCollectionState, a> implements Object {
        private a() {
            super(ArtistState$ProtoArtistCollectionState.p);
        }
    }

    static {
        ArtistState$ProtoArtistCollectionState artistState$ProtoArtistCollectionState = new ArtistState$ProtoArtistCollectionState();
        p = artistState$ProtoArtistCollectionState;
        artistState$ProtoArtistCollectionState.makeImmutable();
    }

    private ArtistState$ProtoArtistCollectionState() {
    }

    public static ArtistState$ProtoArtistCollectionState i() {
        return p;
    }

    public static x<ArtistState$ProtoArtistCollectionState> parser() {
        return p.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return p;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ArtistState$ProtoArtistCollectionState artistState$ProtoArtistCollectionState = (ArtistState$ProtoArtistCollectionState) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (artistState$ProtoArtistCollectionState.a & 1) == 1, artistState$ProtoArtistCollectionState.b);
                this.c = hVar.f((this.a & 2) == 2, this.c, (artistState$ProtoArtistCollectionState.a & 2) == 2, artistState$ProtoArtistCollectionState.c);
                this.f = hVar.m((this.a & 4) == 4, this.f, (artistState$ProtoArtistCollectionState.a & 4) == 4, artistState$ProtoArtistCollectionState.f);
                this.n = hVar.m((this.a & 8) == 8, this.n, (artistState$ProtoArtistCollectionState.a & 8) == 8, artistState$ProtoArtistCollectionState.n);
                boolean z2 = (this.a & 16) == 16;
                boolean z3 = this.o;
                if ((artistState$ProtoArtistCollectionState.a & 16) == 16) {
                    z = true;
                }
                this.o = hVar.f(z2, z3, z, artistState$ProtoArtistCollectionState.o);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= artistState$ProtoArtistCollectionState.a;
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
                            } else if (B == 16) {
                                this.a |= 2;
                                this.c = gVar.h();
                            } else if (B == 24) {
                                this.a |= 4;
                                this.f = gVar.u();
                            } else if (B == 32) {
                                this.a |= 8;
                                this.n = gVar.u();
                            } else if (B == 40) {
                                this.a |= 16;
                                this.o = gVar.h();
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
                return new ArtistState$ProtoArtistCollectionState();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (q == null) {
                    synchronized (ArtistState$ProtoArtistCollectionState.class) {
                        if (q == null) {
                            q = new GeneratedMessageLite.c(p);
                        }
                    }
                }
                return q;
            default:
                throw new UnsupportedOperationException();
        }
        return p;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.p(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.d(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.s(3, this.f);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.s(4, this.n);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.d(5, this.o);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public String h() {
        return this.b;
    }

    public boolean l() {
        return this.c;
    }

    public boolean m() {
        return this.o;
    }

    public int n() {
        return this.n;
    }

    public int o() {
        return this.f;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.P(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.A(2, this.c);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.S(3, this.f);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.S(4, this.n);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.A(5, this.o);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
