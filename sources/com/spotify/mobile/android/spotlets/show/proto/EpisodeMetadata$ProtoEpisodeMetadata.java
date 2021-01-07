package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata$ProtoEpisodeShowMetadata;
import com.spotify.mobile.android.spotlets.show.proto.ImageGroup$ProtoImageGroup;
import com.spotify.podcastsegments.proto.PodcastSegments;
import java.io.IOException;

public final class EpisodeMetadata$ProtoEpisodeMetadata extends GeneratedMessageLite<EpisodeMetadata$ProtoEpisodeMetadata, a> implements Object {
    private static final EpisodeMetadata$ProtoEpisodeMetadata D;
    private static volatile x<EpisodeMetadata$ProtoEpisodeMetadata> E;
    private int A;
    private boolean B;
    private PodcastSegments C;
    private int a;
    private EpisodeMetadata$ProtoEpisodeShowMetadata b;
    private String c = "";
    private String f = "";
    private int n;
    private ImageGroup$ProtoImageGroup o;
    private String p = "";
    private String q = "";
    private long r;
    private ImageGroup$ProtoImageGroup s;
    private String t = "";
    private boolean u;
    private int v;
    private boolean w;
    private String x = "";
    private boolean y;
    private String z = "";

    public enum EpisodeType implements o.c {
        UNKNOWN(0),
        FULL(1),
        TRAILER(2),
        BONUS(3);
        
        private final int value;

        private EpisodeType(int i) {
            this.value = i;
        }

        public static EpisodeType d(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return FULL;
            }
            if (i == 2) {
                return TRAILER;
            }
            if (i != 3) {
                return null;
            }
            return BONUS;
        }

        @Override // com.google.protobuf.o.c
        public final int getNumber() {
            return this.value;
        }
    }

    public enum MediaType implements o.c {
        VODCAST(0),
        AUDIO(1),
        VIDEO(2);
        
        private final int value;

        private MediaType(int i) {
            this.value = i;
        }

        public static MediaType d(int i) {
            if (i == 0) {
                return VODCAST;
            }
            if (i == 1) {
                return AUDIO;
            }
            if (i != 2) {
                return null;
            }
            return VIDEO;
        }

        @Override // com.google.protobuf.o.c
        public final int getNumber() {
            return this.value;
        }
    }

    public static final class a extends GeneratedMessageLite.b<EpisodeMetadata$ProtoEpisodeMetadata, a> implements Object {
        private a() {
            super(EpisodeMetadata$ProtoEpisodeMetadata.D);
        }
    }

    static {
        EpisodeMetadata$ProtoEpisodeMetadata episodeMetadata$ProtoEpisodeMetadata = new EpisodeMetadata$ProtoEpisodeMetadata();
        D = episodeMetadata$ProtoEpisodeMetadata;
        episodeMetadata$ProtoEpisodeMetadata.makeImmutable();
    }

    private EpisodeMetadata$ProtoEpisodeMetadata() {
    }

    public static EpisodeMetadata$ProtoEpisodeMetadata i() {
        return D;
    }

    public static x<EpisodeMetadata$ProtoEpisodeMetadata> parser() {
        return D.getParserForType();
    }

    public boolean A() {
        return (this.a & 65536) == 65536;
    }

    public boolean B() {
        return (this.a & 256) == 256;
    }

    public boolean C() {
        return (this.a & 2048) == 2048;
    }

    public boolean D() {
        return (this.a & 1) == 1;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return D;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                EpisodeMetadata$ProtoEpisodeMetadata episodeMetadata$ProtoEpisodeMetadata = (EpisodeMetadata$ProtoEpisodeMetadata) obj2;
                this.b = (EpisodeMetadata$ProtoEpisodeShowMetadata) hVar.i(this.b, episodeMetadata$ProtoEpisodeMetadata.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (episodeMetadata$ProtoEpisodeMetadata.a & 2) == 2, episodeMetadata$ProtoEpisodeMetadata.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (episodeMetadata$ProtoEpisodeMetadata.a & 4) == 4, episodeMetadata$ProtoEpisodeMetadata.f);
                this.n = hVar.m((this.a & 8) == 8, this.n, (episodeMetadata$ProtoEpisodeMetadata.a & 8) == 8, episodeMetadata$ProtoEpisodeMetadata.n);
                this.o = (ImageGroup$ProtoImageGroup) hVar.i(this.o, episodeMetadata$ProtoEpisodeMetadata.o);
                this.p = hVar.n((this.a & 32) == 32, this.p, (episodeMetadata$ProtoEpisodeMetadata.a & 32) == 32, episodeMetadata$ProtoEpisodeMetadata.p);
                this.q = hVar.n((this.a & 64) == 64, this.q, (episodeMetadata$ProtoEpisodeMetadata.a & 64) == 64, episodeMetadata$ProtoEpisodeMetadata.q);
                this.r = hVar.s((this.a & 128) == 128, this.r, (episodeMetadata$ProtoEpisodeMetadata.a & 128) == 128, episodeMetadata$ProtoEpisodeMetadata.r);
                this.s = (ImageGroup$ProtoImageGroup) hVar.i(this.s, episodeMetadata$ProtoEpisodeMetadata.s);
                this.t = hVar.n((this.a & 512) == 512, this.t, (episodeMetadata$ProtoEpisodeMetadata.a & 512) == 512, episodeMetadata$ProtoEpisodeMetadata.t);
                this.u = hVar.f((this.a & 1024) == 1024, this.u, (episodeMetadata$ProtoEpisodeMetadata.a & 1024) == 1024, episodeMetadata$ProtoEpisodeMetadata.u);
                this.v = hVar.m(C(), this.v, episodeMetadata$ProtoEpisodeMetadata.C(), episodeMetadata$ProtoEpisodeMetadata.v);
                this.w = hVar.f(y(), this.w, episodeMetadata$ProtoEpisodeMetadata.y(), episodeMetadata$ProtoEpisodeMetadata.w);
                this.x = hVar.n((this.a & 8192) == 8192, this.x, (episodeMetadata$ProtoEpisodeMetadata.a & 8192) == 8192, episodeMetadata$ProtoEpisodeMetadata.x);
                this.y = hVar.f((this.a & 16384) == 16384, this.y, (episodeMetadata$ProtoEpisodeMetadata.a & 16384) == 16384, episodeMetadata$ProtoEpisodeMetadata.y);
                this.z = hVar.n((this.a & 32768) == 32768, this.z, (episodeMetadata$ProtoEpisodeMetadata.a & 32768) == 32768, episodeMetadata$ProtoEpisodeMetadata.z);
                this.A = hVar.m(A(), this.A, episodeMetadata$ProtoEpisodeMetadata.A(), episodeMetadata$ProtoEpisodeMetadata.A);
                this.B = hVar.f((this.a & 131072) == 131072, this.B, (episodeMetadata$ProtoEpisodeMetadata.a & 131072) == 131072, episodeMetadata$ProtoEpisodeMetadata.B);
                this.C = (PodcastSegments) hVar.i(this.C, episodeMetadata$ProtoEpisodeMetadata.C);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= episodeMetadata$ProtoEpisodeMetadata.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z2 = false;
                while (!z2) {
                    try {
                        int B2 = gVar.B();
                        switch (B2) {
                            case 0:
                                z2 = true;
                                break;
                            case 10:
                                EpisodeMetadata$ProtoEpisodeShowMetadata.a aVar = (this.a & 1) == 1 ? (EpisodeMetadata$ProtoEpisodeShowMetadata.a) this.b.toBuilder() : null;
                                EpisodeMetadata$ProtoEpisodeShowMetadata episodeMetadata$ProtoEpisodeShowMetadata = (EpisodeMetadata$ProtoEpisodeShowMetadata) gVar.o(EpisodeMetadata$ProtoEpisodeShowMetadata.parser(), kVar);
                                this.b = episodeMetadata$ProtoEpisodeShowMetadata;
                                if (aVar != null) {
                                    aVar.mergeFrom((EpisodeMetadata$ProtoEpisodeShowMetadata.a) episodeMetadata$ProtoEpisodeShowMetadata);
                                    this.b = (EpisodeMetadata$ProtoEpisodeShowMetadata) aVar.buildPartial();
                                }
                                this.a |= 1;
                                break;
                            case 18:
                                String z3 = gVar.z();
                                this.a |= 2;
                                this.c = z3;
                                break;
                            case 26:
                                String z4 = gVar.z();
                                this.a |= 4;
                                this.f = z4;
                                break;
                            case 32:
                                this.a |= 8;
                                this.n = gVar.u();
                                break;
                            case 42:
                                ImageGroup$ProtoImageGroup.a aVar2 = (this.a & 16) == 16 ? (ImageGroup$ProtoImageGroup.a) this.o.toBuilder() : null;
                                ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroup = (ImageGroup$ProtoImageGroup) gVar.o(ImageGroup$ProtoImageGroup.parser(), kVar);
                                this.o = imageGroup$ProtoImageGroup;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((ImageGroup$ProtoImageGroup.a) imageGroup$ProtoImageGroup);
                                    this.o = (ImageGroup$ProtoImageGroup) aVar2.buildPartial();
                                }
                                this.a |= 16;
                                break;
                            case 50:
                                String z5 = gVar.z();
                                this.a |= 32;
                                this.p = z5;
                                break;
                            case 58:
                                String z6 = gVar.z();
                                this.a |= 64;
                                this.q = z6;
                                break;
                            case 64:
                                this.a |= 128;
                                this.r = gVar.w();
                                break;
                            case 74:
                                ImageGroup$ProtoImageGroup.a aVar3 = (this.a & 256) == 256 ? (ImageGroup$ProtoImageGroup.a) this.s.toBuilder() : null;
                                ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroup2 = (ImageGroup$ProtoImageGroup) gVar.o(ImageGroup$ProtoImageGroup.parser(), kVar);
                                this.s = imageGroup$ProtoImageGroup2;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((ImageGroup$ProtoImageGroup.a) imageGroup$ProtoImageGroup2);
                                    this.s = (ImageGroup$ProtoImageGroup) aVar3.buildPartial();
                                }
                                this.a |= 256;
                                break;
                            case 82:
                                String z7 = gVar.z();
                                this.a |= 512;
                                this.t = z7;
                                break;
                            case 88:
                                this.a |= 1024;
                                this.u = gVar.h();
                                break;
                            case 96:
                                int u2 = gVar.u();
                                if (MediaType.d(u2) == null) {
                                    super.mergeVarintField(12, u2);
                                } else {
                                    this.a |= 2048;
                                    this.v = u2;
                                }
                                break;
                            case 112:
                                this.a |= 4096;
                                this.w = gVar.h();
                                break;
                            case 122:
                                String z8 = gVar.z();
                                this.a |= 8192;
                                this.x = z8;
                                break;
                            case 128:
                                this.a |= 16384;
                                this.y = gVar.h();
                                break;
                            case 138:
                                String z9 = gVar.z();
                                this.a |= 32768;
                                this.z = z9;
                                break;
                            case 144:
                                int u3 = gVar.u();
                                if (EpisodeType.d(u3) == null) {
                                    super.mergeVarintField(18, u3);
                                } else {
                                    this.a |= 65536;
                                    this.A = u3;
                                }
                                break;
                            case 152:
                                this.a |= 131072;
                                this.B = gVar.h();
                                break;
                            case 162:
                                PodcastSegments.b bVar = (this.a & 262144) == 262144 ? (PodcastSegments.b) this.C.toBuilder() : null;
                                PodcastSegments podcastSegments = (PodcastSegments) gVar.o(PodcastSegments.parser(), kVar);
                                this.C = podcastSegments;
                                if (bVar != null) {
                                    bVar.mergeFrom((PodcastSegments.b) podcastSegments);
                                    this.C = (PodcastSegments) bVar.buildPartial();
                                }
                                this.a |= 262144;
                                break;
                            default:
                                if (parseUnknownField(B2, gVar)) {
                                    break;
                                }
                                z2 = true;
                                break;
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
                return new EpisodeMetadata$ProtoEpisodeMetadata();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (E == null) {
                    synchronized (EpisodeMetadata$ProtoEpisodeMetadata.class) {
                        if (E == null) {
                            E = new GeneratedMessageLite.c(D);
                        }
                    }
                }
                return E;
            default:
                throw new UnsupportedOperationException();
        }
        return D;
    }

    public boolean getAvailable() {
        return this.u;
    }

    public boolean getBackgroundable() {
        return this.w;
    }

    public boolean getIsExplicit() {
        return this.y;
    }

    public boolean getIsMusicAndTalk() {
        return this.B;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.n(1, x());
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.p(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.p(3, this.f);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.s(4, this.n);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.n(5, h());
        }
        if ((this.a & 32) == 32) {
            i2 += CodedOutputStream.p(6, this.p);
        }
        if ((this.a & 64) == 64) {
            i2 += CodedOutputStream.p(7, this.q);
        }
        if ((this.a & 128) == 128) {
            i2 += CodedOutputStream.l(8, this.r);
        }
        if ((this.a & 256) == 256) {
            i2 += CodedOutputStream.n(9, n());
        }
        if ((this.a & 512) == 512) {
            i2 += CodedOutputStream.p(10, this.t);
        }
        if ((this.a & 1024) == 1024) {
            i2 += CodedOutputStream.d(11, this.u);
        }
        if ((this.a & 2048) == 2048) {
            i2 += CodedOutputStream.h(12, this.v);
        }
        if ((this.a & 4096) == 4096) {
            i2 += CodedOutputStream.d(14, this.w);
        }
        if ((this.a & 8192) == 8192) {
            i2 += CodedOutputStream.p(15, this.x);
        }
        if ((this.a & 16384) == 16384) {
            i2 += CodedOutputStream.d(16, this.y);
        }
        if ((this.a & 32768) == 32768) {
            i2 += CodedOutputStream.p(17, this.z);
        }
        if ((this.a & 65536) == 65536) {
            i2 += CodedOutputStream.h(18, this.A);
        }
        if ((this.a & 131072) == 131072) {
            i2 += CodedOutputStream.d(19, this.B);
        }
        if ((this.a & 262144) == 262144) {
            i2 += CodedOutputStream.n(20, t());
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public ImageGroup$ProtoImageGroup h() {
        ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroup = this.o;
        return imageGroup$ProtoImageGroup == null ? ImageGroup$ProtoImageGroup.h() : imageGroup$ProtoImageGroup;
    }

    public boolean hasPodcastSegments() {
        return (this.a & 262144) == 262144;
    }

    public String l() {
        return this.q;
    }

    public EpisodeType m() {
        EpisodeType d = EpisodeType.d(this.A);
        return d == null ? EpisodeType.UNKNOWN : d;
    }

    public ImageGroup$ProtoImageGroup n() {
        ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroup = this.s;
        return imageGroup$ProtoImageGroup == null ? ImageGroup$ProtoImageGroup.h() : imageGroup$ProtoImageGroup;
    }

    public int o() {
        return this.n;
    }

    public String p() {
        return this.c;
    }

    public String q() {
        return this.p;
    }

    public MediaType r() {
        MediaType d = MediaType.d(this.v);
        return d == null ? MediaType.VODCAST : d;
    }

    public String s() {
        return this.f;
    }

    public PodcastSegments t() {
        PodcastSegments podcastSegments = this.C;
        return podcastSegments == null ? PodcastSegments.i() : podcastSegments;
    }

    public String u() {
        return this.z;
    }

    public String v() {
        return this.x;
    }

    public long w() {
        return this.r;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.M(1, x());
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.P(2, this.c);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.P(3, this.f);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.S(4, this.n);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.M(5, h());
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.P(6, this.p);
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.P(7, this.q);
        }
        if ((this.a & 128) == 128) {
            codedOutputStream.U(8, this.r);
        }
        if ((this.a & 256) == 256) {
            codedOutputStream.M(9, n());
        }
        if ((this.a & 512) == 512) {
            codedOutputStream.P(10, this.t);
        }
        if ((this.a & 1024) == 1024) {
            codedOutputStream.A(11, this.u);
        }
        if ((this.a & 2048) == 2048) {
            codedOutputStream.K(12, this.v);
        }
        if ((this.a & 4096) == 4096) {
            codedOutputStream.A(14, this.w);
        }
        if ((this.a & 8192) == 8192) {
            codedOutputStream.P(15, this.x);
        }
        if ((this.a & 16384) == 16384) {
            codedOutputStream.A(16, this.y);
        }
        if ((this.a & 32768) == 32768) {
            codedOutputStream.P(17, this.z);
        }
        if ((this.a & 65536) == 65536) {
            codedOutputStream.K(18, this.A);
        }
        if ((this.a & 131072) == 131072) {
            codedOutputStream.A(19, this.B);
        }
        if ((this.a & 262144) == 262144) {
            codedOutputStream.M(20, t());
        }
        this.unknownFields.l(codedOutputStream);
    }

    public EpisodeMetadata$ProtoEpisodeShowMetadata x() {
        EpisodeMetadata$ProtoEpisodeShowMetadata episodeMetadata$ProtoEpisodeShowMetadata = this.b;
        return episodeMetadata$ProtoEpisodeShowMetadata == null ? EpisodeMetadata$ProtoEpisodeShowMetadata.i() : episodeMetadata$ProtoEpisodeShowMetadata;
    }

    public boolean y() {
        return (this.a & 4096) == 4096;
    }

    public boolean z() {
        return (this.a & 16) == 16;
    }
}
