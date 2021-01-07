package com.spotify.mobile.android.spotlets.collection.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.mobile.android.spotlets.show.proto.ImageGroup$ProtoImageGroup;
import java.io.IOException;
import java.util.List;

public final class AlbumMetadata$ProtoAlbumMetadata extends GeneratedMessageLite<AlbumMetadata$ProtoAlbumMetadata, a> implements Object {
    private static final AlbumMetadata$ProtoAlbumMetadata t;
    private static volatile x<AlbumMetadata$ProtoAlbumMetadata> u;
    private int a;
    private o.i<AlbumMetadata$ProtoAlbumArtistMetadata> b = GeneratedMessageLite.emptyProtobufList();
    private String c = "";
    private String f = "";
    private String n = "";
    private ImageGroup$ProtoImageGroup o;
    private int p;
    private int q;
    private int r;
    private boolean s;

    public static final class a extends GeneratedMessageLite.b<AlbumMetadata$ProtoAlbumMetadata, a> implements Object {
        private a() {
            super(AlbumMetadata$ProtoAlbumMetadata.t);
        }
    }

    static {
        AlbumMetadata$ProtoAlbumMetadata albumMetadata$ProtoAlbumMetadata = new AlbumMetadata$ProtoAlbumMetadata();
        t = albumMetadata$ProtoAlbumMetadata;
        albumMetadata$ProtoAlbumMetadata.makeImmutable();
    }

    private AlbumMetadata$ProtoAlbumMetadata() {
    }

    public static AlbumMetadata$ProtoAlbumMetadata o() {
        return t;
    }

    public static x<AlbumMetadata$ProtoAlbumMetadata> parser() {
        return t.getParserForType();
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
                AlbumMetadata$ProtoAlbumMetadata albumMetadata$ProtoAlbumMetadata = (AlbumMetadata$ProtoAlbumMetadata) obj2;
                this.b = hVar.q(this.b, albumMetadata$ProtoAlbumMetadata.b);
                this.c = hVar.n((this.a & 1) == 1, this.c, (albumMetadata$ProtoAlbumMetadata.a & 1) == 1, albumMetadata$ProtoAlbumMetadata.c);
                this.f = hVar.n((this.a & 2) == 2, this.f, (albumMetadata$ProtoAlbumMetadata.a & 2) == 2, albumMetadata$ProtoAlbumMetadata.f);
                this.n = hVar.n((this.a & 4) == 4, this.n, (albumMetadata$ProtoAlbumMetadata.a & 4) == 4, albumMetadata$ProtoAlbumMetadata.n);
                this.o = (ImageGroup$ProtoImageGroup) hVar.i(this.o, albumMetadata$ProtoAlbumMetadata.o);
                this.p = hVar.m((this.a & 16) == 16, this.p, (albumMetadata$ProtoAlbumMetadata.a & 16) == 16, albumMetadata$ProtoAlbumMetadata.p);
                this.q = hVar.m((this.a & 32) == 32, this.q, (albumMetadata$ProtoAlbumMetadata.a & 32) == 32, albumMetadata$ProtoAlbumMetadata.q);
                this.r = hVar.m((this.a & 64) == 64, this.r, (albumMetadata$ProtoAlbumMetadata.a & 64) == 64, albumMetadata$ProtoAlbumMetadata.r);
                boolean z2 = (this.a & 128) == 128;
                boolean z3 = this.s;
                if ((albumMetadata$ProtoAlbumMetadata.a & 128) == 128) {
                    z = true;
                }
                this.s = hVar.f(z2, z3, z, albumMetadata$ProtoAlbumMetadata.s);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= albumMetadata$ProtoAlbumMetadata.a;
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
                                if (!this.b.R0()) {
                                    this.b = GeneratedMessageLite.mutableCopy(this.b);
                                }
                                this.b.add(gVar.o(AlbumMetadata$ProtoAlbumArtistMetadata.parser(), kVar));
                            } else if (B == 18) {
                                String z4 = gVar.z();
                                this.a |= 1;
                                this.c = z4;
                            } else if (B == 26) {
                                String z5 = gVar.z();
                                this.a |= 2;
                                this.f = z5;
                            } else if (B == 34) {
                                String z6 = gVar.z();
                                this.a |= 4;
                                this.n = z6;
                            } else if (B == 42) {
                                ImageGroup$ProtoImageGroup.a aVar = (this.a & 8) == 8 ? (ImageGroup$ProtoImageGroup.a) this.o.toBuilder() : null;
                                ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroup = (ImageGroup$ProtoImageGroup) gVar.o(ImageGroup$ProtoImageGroup.parser(), kVar);
                                this.o = imageGroup$ProtoImageGroup;
                                if (aVar != null) {
                                    aVar.mergeFrom((ImageGroup$ProtoImageGroup.a) imageGroup$ProtoImageGroup);
                                    this.o = (ImageGroup$ProtoImageGroup) aVar.buildPartial();
                                }
                                this.a |= 8;
                            } else if (B == 48) {
                                this.a |= 16;
                                this.p = gVar.u();
                            } else if (B == 56) {
                                this.a |= 32;
                                this.q = gVar.u();
                            } else if (B == 64) {
                                this.a |= 64;
                                this.r = gVar.u();
                            } else if (B == 72) {
                                this.a |= 128;
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
                this.b.C();
                return null;
            case 4:
                return new AlbumMetadata$ProtoAlbumMetadata();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (u == null) {
                    synchronized (AlbumMetadata$ProtoAlbumMetadata.class) {
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

    public boolean getPlayability() {
        return this.s;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            i2 += CodedOutputStream.n(1, this.b.get(i3));
        }
        if ((this.a & 1) == 1) {
            i2 += CodedOutputStream.p(2, this.c);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.p(3, this.f);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.p(4, this.n);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.n(5, n());
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.s(6, this.p);
        }
        if ((this.a & 32) == 32) {
            i2 += CodedOutputStream.s(7, this.q);
        }
        if ((this.a & 64) == 64) {
            i2 += CodedOutputStream.s(8, this.r);
        }
        if ((this.a & 128) == 128) {
            i2 += CodedOutputStream.d(9, this.s);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public AlbumMetadata$ProtoAlbumArtistMetadata h(int i) {
        return this.b.get(i);
    }

    public int i() {
        return this.b.size();
    }

    public List<AlbumMetadata$ProtoAlbumArtistMetadata> l() {
        return this.b;
    }

    public String m() {
        return this.n;
    }

    public ImageGroup$ProtoImageGroup n() {
        ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroup = this.o;
        return imageGroup$ProtoImageGroup == null ? ImageGroup$ProtoImageGroup.h() : imageGroup$ProtoImageGroup;
    }

    public String p() {
        return this.c;
    }

    public String q() {
        return this.f;
    }

    public int r() {
        return this.q;
    }

    public int s() {
        return this.r;
    }

    public int t() {
        return this.p;
    }

    public boolean u() {
        return (this.a & 8) == 8;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.b.size(); i++) {
            codedOutputStream.M(1, this.b.get(i));
        }
        if ((this.a & 1) == 1) {
            codedOutputStream.P(2, this.c);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.P(3, this.f);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.P(4, this.n);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.M(5, n());
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.S(6, this.p);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.S(7, this.q);
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.S(8, this.r);
        }
        if ((this.a & 128) == 128) {
            codedOutputStream.A(9, this.s);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
