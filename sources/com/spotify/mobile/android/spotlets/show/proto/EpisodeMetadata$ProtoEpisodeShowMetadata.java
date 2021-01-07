package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.mobile.android.spotlets.show.proto.ImageGroup$ProtoImageGroup;
import java.io.IOException;

public final class EpisodeMetadata$ProtoEpisodeShowMetadata extends GeneratedMessageLite<EpisodeMetadata$ProtoEpisodeShowMetadata, a> implements Object {
    private static final EpisodeMetadata$ProtoEpisodeShowMetadata o;
    private static volatile x<EpisodeMetadata$ProtoEpisodeShowMetadata> p;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private ImageGroup$ProtoImageGroup n;

    public static final class a extends GeneratedMessageLite.b<EpisodeMetadata$ProtoEpisodeShowMetadata, a> implements Object {
        private a() {
            super(EpisodeMetadata$ProtoEpisodeShowMetadata.o);
        }
    }

    static {
        EpisodeMetadata$ProtoEpisodeShowMetadata episodeMetadata$ProtoEpisodeShowMetadata = new EpisodeMetadata$ProtoEpisodeShowMetadata();
        o = episodeMetadata$ProtoEpisodeShowMetadata;
        episodeMetadata$ProtoEpisodeShowMetadata.makeImmutable();
    }

    private EpisodeMetadata$ProtoEpisodeShowMetadata() {
    }

    public static EpisodeMetadata$ProtoEpisodeShowMetadata i() {
        return o;
    }

    public static x<EpisodeMetadata$ProtoEpisodeShowMetadata> parser() {
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
                EpisodeMetadata$ProtoEpisodeShowMetadata episodeMetadata$ProtoEpisodeShowMetadata = (EpisodeMetadata$ProtoEpisodeShowMetadata) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (episodeMetadata$ProtoEpisodeShowMetadata.a & 1) == 1, episodeMetadata$ProtoEpisodeShowMetadata.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (episodeMetadata$ProtoEpisodeShowMetadata.a & 2) == 2, episodeMetadata$ProtoEpisodeShowMetadata.c);
                boolean z2 = (this.a & 4) == 4;
                String str = this.f;
                if ((episodeMetadata$ProtoEpisodeShowMetadata.a & 4) == 4) {
                    z = true;
                }
                this.f = hVar.n(z2, str, z, episodeMetadata$ProtoEpisodeShowMetadata.f);
                this.n = (ImageGroup$ProtoImageGroup) hVar.i(this.n, episodeMetadata$ProtoEpisodeShowMetadata.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= episodeMetadata$ProtoEpisodeShowMetadata.a;
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
                                String z3 = gVar.z();
                                this.a |= 1;
                                this.b = z3;
                            } else if (B == 18) {
                                String z4 = gVar.z();
                                this.a |= 2;
                                this.c = z4;
                            } else if (B == 26) {
                                String z5 = gVar.z();
                                this.a |= 4;
                                this.f = z5;
                            } else if (B == 34) {
                                ImageGroup$ProtoImageGroup.a aVar = (this.a & 8) == 8 ? (ImageGroup$ProtoImageGroup.a) this.n.toBuilder() : null;
                                ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroup = (ImageGroup$ProtoImageGroup) gVar.o(ImageGroup$ProtoImageGroup.parser(), kVar);
                                this.n = imageGroup$ProtoImageGroup;
                                if (aVar != null) {
                                    aVar.mergeFrom((ImageGroup$ProtoImageGroup.a) imageGroup$ProtoImageGroup);
                                    this.n = (ImageGroup$ProtoImageGroup) aVar.buildPartial();
                                }
                                this.a |= 8;
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
                return new EpisodeMetadata$ProtoEpisodeShowMetadata();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (EpisodeMetadata$ProtoEpisodeShowMetadata.class) {
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
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.p(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.p(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.p(3, this.f);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.n(4, h());
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public ImageGroup$ProtoImageGroup h() {
        ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroup = this.n;
        return imageGroup$ProtoImageGroup == null ? ImageGroup$ProtoImageGroup.h() : imageGroup$ProtoImageGroup;
    }

    public String l() {
        return this.b;
    }

    public String m() {
        return this.c;
    }

    public String n() {
        return this.f;
    }

    public boolean o() {
        return (this.a & 8) == 8;
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
            codedOutputStream.M(4, h());
        }
        this.unknownFields.l(codedOutputStream);
    }
}
