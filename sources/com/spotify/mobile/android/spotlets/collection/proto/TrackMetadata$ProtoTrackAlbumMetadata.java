package com.spotify.mobile.android.spotlets.collection.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackAlbumArtistMetadata;
import com.spotify.mobile.android.spotlets.show.proto.ImageGroup$ProtoImageGroup;
import java.io.IOException;

public final class TrackMetadata$ProtoTrackAlbumMetadata extends GeneratedMessageLite<TrackMetadata$ProtoTrackAlbumMetadata, a> implements Object {
    private static final TrackMetadata$ProtoTrackAlbumMetadata o;
    private static volatile x<TrackMetadata$ProtoTrackAlbumMetadata> p;
    private int a;
    private TrackMetadata$ProtoTrackAlbumArtistMetadata b;
    private String c = "";
    private String f = "";
    private ImageGroup$ProtoImageGroup n;

    public static final class a extends GeneratedMessageLite.b<TrackMetadata$ProtoTrackAlbumMetadata, a> implements Object {
        private a() {
            super(TrackMetadata$ProtoTrackAlbumMetadata.o);
        }
    }

    static {
        TrackMetadata$ProtoTrackAlbumMetadata trackMetadata$ProtoTrackAlbumMetadata = new TrackMetadata$ProtoTrackAlbumMetadata();
        o = trackMetadata$ProtoTrackAlbumMetadata;
        trackMetadata$ProtoTrackAlbumMetadata.makeImmutable();
    }

    private TrackMetadata$ProtoTrackAlbumMetadata() {
    }

    public static TrackMetadata$ProtoTrackAlbumMetadata l() {
        return o;
    }

    public static x<TrackMetadata$ProtoTrackAlbumMetadata> parser() {
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
                TrackMetadata$ProtoTrackAlbumMetadata trackMetadata$ProtoTrackAlbumMetadata = (TrackMetadata$ProtoTrackAlbumMetadata) obj2;
                this.b = (TrackMetadata$ProtoTrackAlbumArtistMetadata) hVar.i(this.b, trackMetadata$ProtoTrackAlbumMetadata.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (trackMetadata$ProtoTrackAlbumMetadata.a & 2) == 2, trackMetadata$ProtoTrackAlbumMetadata.c);
                boolean z2 = (this.a & 4) == 4;
                String str = this.f;
                if ((trackMetadata$ProtoTrackAlbumMetadata.a & 4) == 4) {
                    z = true;
                }
                this.f = hVar.n(z2, str, z, trackMetadata$ProtoTrackAlbumMetadata.f);
                this.n = (ImageGroup$ProtoImageGroup) hVar.i(this.n, trackMetadata$ProtoTrackAlbumMetadata.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= trackMetadata$ProtoTrackAlbumMetadata.a;
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
                                TrackMetadata$ProtoTrackAlbumArtistMetadata.a aVar = (this.a & 1) == 1 ? (TrackMetadata$ProtoTrackAlbumArtistMetadata.a) this.b.toBuilder() : null;
                                TrackMetadata$ProtoTrackAlbumArtistMetadata trackMetadata$ProtoTrackAlbumArtistMetadata = (TrackMetadata$ProtoTrackAlbumArtistMetadata) gVar.o(TrackMetadata$ProtoTrackAlbumArtistMetadata.parser(), kVar);
                                this.b = trackMetadata$ProtoTrackAlbumArtistMetadata;
                                if (aVar != null) {
                                    aVar.mergeFrom((TrackMetadata$ProtoTrackAlbumArtistMetadata.a) trackMetadata$ProtoTrackAlbumArtistMetadata);
                                    this.b = (TrackMetadata$ProtoTrackAlbumArtistMetadata) aVar.buildPartial();
                                }
                                this.a |= 1;
                            } else if (B == 18) {
                                String z3 = gVar.z();
                                this.a |= 2;
                                this.c = z3;
                            } else if (B == 26) {
                                String z4 = gVar.z();
                                this.a |= 4;
                                this.f = z4;
                            } else if (B == 34) {
                                ImageGroup$ProtoImageGroup.a aVar2 = (this.a & 8) == 8 ? (ImageGroup$ProtoImageGroup.a) this.n.toBuilder() : null;
                                ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroup = (ImageGroup$ProtoImageGroup) gVar.o(ImageGroup$ProtoImageGroup.parser(), kVar);
                                this.n = imageGroup$ProtoImageGroup;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((ImageGroup$ProtoImageGroup.a) imageGroup$ProtoImageGroup);
                                    this.n = (ImageGroup$ProtoImageGroup) aVar2.buildPartial();
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
                return new TrackMetadata$ProtoTrackAlbumMetadata();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (TrackMetadata$ProtoTrackAlbumMetadata.class) {
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
            i2 = 0 + CodedOutputStream.n(1, h());
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.p(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.p(3, this.f);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.n(4, i());
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public TrackMetadata$ProtoTrackAlbumArtistMetadata h() {
        TrackMetadata$ProtoTrackAlbumArtistMetadata trackMetadata$ProtoTrackAlbumArtistMetadata = this.b;
        return trackMetadata$ProtoTrackAlbumArtistMetadata == null ? TrackMetadata$ProtoTrackAlbumArtistMetadata.h() : trackMetadata$ProtoTrackAlbumArtistMetadata;
    }

    public ImageGroup$ProtoImageGroup i() {
        ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroup = this.n;
        return imageGroup$ProtoImageGroup == null ? ImageGroup$ProtoImageGroup.h() : imageGroup$ProtoImageGroup;
    }

    public String m() {
        return this.c;
    }

    public String n() {
        return this.f;
    }

    public boolean o() {
        return (this.a & 1) == 1;
    }

    public boolean p() {
        return (this.a & 8) == 8;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.M(1, h());
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.P(2, this.c);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.P(3, this.f);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.M(4, i());
        }
        this.unknownFields.l(codedOutputStream);
    }
}
