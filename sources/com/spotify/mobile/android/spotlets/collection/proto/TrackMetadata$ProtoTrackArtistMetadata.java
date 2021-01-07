package com.spotify.mobile.android.spotlets.collection.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.mobile.android.spotlets.show.proto.ImageGroup$ProtoImageGroup;
import java.io.IOException;

public final class TrackMetadata$ProtoTrackArtistMetadata extends GeneratedMessageLite<TrackMetadata$ProtoTrackArtistMetadata, a> implements Object {
    private static final TrackMetadata$ProtoTrackArtistMetadata n;
    private static volatile x<TrackMetadata$ProtoTrackArtistMetadata> o;
    private int a;
    private String b = "";
    private String c = "";
    private ImageGroup$ProtoImageGroup f;

    public static final class a extends GeneratedMessageLite.b<TrackMetadata$ProtoTrackArtistMetadata, a> implements Object {
        private a() {
            super(TrackMetadata$ProtoTrackArtistMetadata.n);
        }
    }

    static {
        TrackMetadata$ProtoTrackArtistMetadata trackMetadata$ProtoTrackArtistMetadata = new TrackMetadata$ProtoTrackArtistMetadata();
        n = trackMetadata$ProtoTrackArtistMetadata;
        trackMetadata$ProtoTrackArtistMetadata.makeImmutable();
    }

    private TrackMetadata$ProtoTrackArtistMetadata() {
    }

    public static x<TrackMetadata$ProtoTrackArtistMetadata> parser() {
        return n.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return n;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                TrackMetadata$ProtoTrackArtistMetadata trackMetadata$ProtoTrackArtistMetadata = (TrackMetadata$ProtoTrackArtistMetadata) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (trackMetadata$ProtoTrackArtistMetadata.a & 1) == 1, trackMetadata$ProtoTrackArtistMetadata.b);
                boolean z2 = (this.a & 2) == 2;
                String str = this.c;
                if ((trackMetadata$ProtoTrackArtistMetadata.a & 2) == 2) {
                    z = true;
                }
                this.c = hVar.n(z2, str, z, trackMetadata$ProtoTrackArtistMetadata.c);
                this.f = (ImageGroup$ProtoImageGroup) hVar.i(this.f, trackMetadata$ProtoTrackArtistMetadata.f);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= trackMetadata$ProtoTrackArtistMetadata.a;
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
                                ImageGroup$ProtoImageGroup.a aVar = (this.a & 4) == 4 ? (ImageGroup$ProtoImageGroup.a) this.f.toBuilder() : null;
                                ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroup = (ImageGroup$ProtoImageGroup) gVar.o(ImageGroup$ProtoImageGroup.parser(), kVar);
                                this.f = imageGroup$ProtoImageGroup;
                                if (aVar != null) {
                                    aVar.mergeFrom((ImageGroup$ProtoImageGroup.a) imageGroup$ProtoImageGroup);
                                    this.f = (ImageGroup$ProtoImageGroup) aVar.buildPartial();
                                }
                                this.a |= 4;
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
                return new TrackMetadata$ProtoTrackArtistMetadata();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (TrackMetadata$ProtoTrackArtistMetadata.class) {
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
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.p(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.p(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.n(3, l());
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public String h() {
        return this.b;
    }

    public String i() {
        return this.c;
    }

    public ImageGroup$ProtoImageGroup l() {
        ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroup = this.f;
        return imageGroup$ProtoImageGroup == null ? ImageGroup$ProtoImageGroup.h() : imageGroup$ProtoImageGroup;
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
            codedOutputStream.M(3, l());
        }
        this.unknownFields.l(codedOutputStream);
    }
}
