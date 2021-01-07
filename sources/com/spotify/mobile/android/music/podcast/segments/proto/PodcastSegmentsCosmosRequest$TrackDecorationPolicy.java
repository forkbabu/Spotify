package com.spotify.mobile.android.music.podcast.segments.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.cosmos.util.proto.AlbumDecorationPolicy;
import com.spotify.cosmos.util.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.proto.TrackDecorationPolicy;
import java.io.IOException;

public final class PodcastSegmentsCosmosRequest$TrackDecorationPolicy extends GeneratedMessageLite<PodcastSegmentsCosmosRequest$TrackDecorationPolicy, a> implements Object {
    private static final PodcastSegmentsCosmosRequest$TrackDecorationPolicy n;
    private static volatile x<PodcastSegmentsCosmosRequest$TrackDecorationPolicy> o;
    private TrackDecorationPolicy a;
    private ArtistDecorationPolicy b;
    private AlbumDecorationPolicy c;
    private ArtistDecorationPolicy f;

    public static final class a extends GeneratedMessageLite.b<PodcastSegmentsCosmosRequest$TrackDecorationPolicy, a> implements Object {
        public a m(AlbumDecorationPolicy albumDecorationPolicy) {
            copyOnWrite();
            PodcastSegmentsCosmosRequest$TrackDecorationPolicy.l((PodcastSegmentsCosmosRequest$TrackDecorationPolicy) this.instance, albumDecorationPolicy);
            return this;
        }

        public a n(ArtistDecorationPolicy artistDecorationPolicy) {
            copyOnWrite();
            PodcastSegmentsCosmosRequest$TrackDecorationPolicy.i((PodcastSegmentsCosmosRequest$TrackDecorationPolicy) this.instance, artistDecorationPolicy);
            return this;
        }

        public a o(TrackDecorationPolicy trackDecorationPolicy) {
            copyOnWrite();
            PodcastSegmentsCosmosRequest$TrackDecorationPolicy.h((PodcastSegmentsCosmosRequest$TrackDecorationPolicy) this.instance, trackDecorationPolicy);
            return this;
        }

        private a() {
            super(PodcastSegmentsCosmosRequest$TrackDecorationPolicy.n);
        }
    }

    static {
        PodcastSegmentsCosmosRequest$TrackDecorationPolicy podcastSegmentsCosmosRequest$TrackDecorationPolicy = new PodcastSegmentsCosmosRequest$TrackDecorationPolicy();
        n = podcastSegmentsCosmosRequest$TrackDecorationPolicy;
        podcastSegmentsCosmosRequest$TrackDecorationPolicy.makeImmutable();
    }

    private PodcastSegmentsCosmosRequest$TrackDecorationPolicy() {
    }

    static void h(PodcastSegmentsCosmosRequest$TrackDecorationPolicy podcastSegmentsCosmosRequest$TrackDecorationPolicy, TrackDecorationPolicy trackDecorationPolicy) {
        podcastSegmentsCosmosRequest$TrackDecorationPolicy.getClass();
        trackDecorationPolicy.getClass();
        podcastSegmentsCosmosRequest$TrackDecorationPolicy.a = trackDecorationPolicy;
    }

    static void i(PodcastSegmentsCosmosRequest$TrackDecorationPolicy podcastSegmentsCosmosRequest$TrackDecorationPolicy, ArtistDecorationPolicy artistDecorationPolicy) {
        podcastSegmentsCosmosRequest$TrackDecorationPolicy.getClass();
        artistDecorationPolicy.getClass();
        podcastSegmentsCosmosRequest$TrackDecorationPolicy.b = artistDecorationPolicy;
    }

    static void l(PodcastSegmentsCosmosRequest$TrackDecorationPolicy podcastSegmentsCosmosRequest$TrackDecorationPolicy, AlbumDecorationPolicy albumDecorationPolicy) {
        podcastSegmentsCosmosRequest$TrackDecorationPolicy.getClass();
        albumDecorationPolicy.getClass();
        podcastSegmentsCosmosRequest$TrackDecorationPolicy.c = albumDecorationPolicy;
    }

    public static a m() {
        return (a) n.toBuilder();
    }

    public static x<PodcastSegmentsCosmosRequest$TrackDecorationPolicy> parser() {
        return n.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return n;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PodcastSegmentsCosmosRequest$TrackDecorationPolicy podcastSegmentsCosmosRequest$TrackDecorationPolicy = (PodcastSegmentsCosmosRequest$TrackDecorationPolicy) obj2;
                this.a = (TrackDecorationPolicy) hVar.i(this.a, podcastSegmentsCosmosRequest$TrackDecorationPolicy.a);
                this.b = (ArtistDecorationPolicy) hVar.i(this.b, podcastSegmentsCosmosRequest$TrackDecorationPolicy.b);
                this.c = (AlbumDecorationPolicy) hVar.i(this.c, podcastSegmentsCosmosRequest$TrackDecorationPolicy.c);
                this.f = (ArtistDecorationPolicy) hVar.i(this.f, podcastSegmentsCosmosRequest$TrackDecorationPolicy.f);
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
                                TrackDecorationPolicy trackDecorationPolicy = this.a;
                                TrackDecorationPolicy.Builder builder = trackDecorationPolicy != null ? (TrackDecorationPolicy.Builder) trackDecorationPolicy.toBuilder() : null;
                                TrackDecorationPolicy trackDecorationPolicy2 = (TrackDecorationPolicy) gVar.o(TrackDecorationPolicy.parser(), kVar);
                                this.a = trackDecorationPolicy2;
                                if (builder != null) {
                                    builder.mergeFrom((TrackDecorationPolicy.Builder) trackDecorationPolicy2);
                                    this.a = (TrackDecorationPolicy) builder.buildPartial();
                                }
                            } else if (B == 18) {
                                ArtistDecorationPolicy artistDecorationPolicy = this.b;
                                ArtistDecorationPolicy.Builder builder2 = artistDecorationPolicy != null ? (ArtistDecorationPolicy.Builder) artistDecorationPolicy.toBuilder() : null;
                                ArtistDecorationPolicy artistDecorationPolicy2 = (ArtistDecorationPolicy) gVar.o(ArtistDecorationPolicy.parser(), kVar);
                                this.b = artistDecorationPolicy2;
                                if (builder2 != null) {
                                    builder2.mergeFrom((ArtistDecorationPolicy.Builder) artistDecorationPolicy2);
                                    this.b = (ArtistDecorationPolicy) builder2.buildPartial();
                                }
                            } else if (B == 26) {
                                AlbumDecorationPolicy albumDecorationPolicy = this.c;
                                AlbumDecorationPolicy.Builder builder3 = albumDecorationPolicy != null ? (AlbumDecorationPolicy.Builder) albumDecorationPolicy.toBuilder() : null;
                                AlbumDecorationPolicy albumDecorationPolicy2 = (AlbumDecorationPolicy) gVar.o(AlbumDecorationPolicy.parser(), kVar);
                                this.c = albumDecorationPolicy2;
                                if (builder3 != null) {
                                    builder3.mergeFrom((AlbumDecorationPolicy.Builder) albumDecorationPolicy2);
                                    this.c = (AlbumDecorationPolicy) builder3.buildPartial();
                                }
                            } else if (B == 34) {
                                ArtistDecorationPolicy artistDecorationPolicy3 = this.f;
                                ArtistDecorationPolicy.Builder builder4 = artistDecorationPolicy3 != null ? (ArtistDecorationPolicy.Builder) artistDecorationPolicy3.toBuilder() : null;
                                ArtistDecorationPolicy artistDecorationPolicy4 = (ArtistDecorationPolicy) gVar.o(ArtistDecorationPolicy.parser(), kVar);
                                this.f = artistDecorationPolicy4;
                                if (builder4 != null) {
                                    builder4.mergeFrom((ArtistDecorationPolicy.Builder) artistDecorationPolicy4);
                                    this.f = (ArtistDecorationPolicy) builder4.buildPartial();
                                }
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
                return new PodcastSegmentsCosmosRequest$TrackDecorationPolicy();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (PodcastSegmentsCosmosRequest$TrackDecorationPolicy.class) {
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
        TrackDecorationPolicy trackDecorationPolicy = this.a;
        if (trackDecorationPolicy != null) {
            i2 = 0 + CodedOutputStream.n(1, trackDecorationPolicy);
        }
        ArtistDecorationPolicy artistDecorationPolicy = this.b;
        if (artistDecorationPolicy != null) {
            i2 += CodedOutputStream.n(2, artistDecorationPolicy);
        }
        AlbumDecorationPolicy albumDecorationPolicy = this.c;
        if (albumDecorationPolicy != null) {
            i2 += CodedOutputStream.n(3, albumDecorationPolicy);
        }
        ArtistDecorationPolicy artistDecorationPolicy2 = this.f;
        if (artistDecorationPolicy2 != null) {
            i2 += CodedOutputStream.n(4, artistDecorationPolicy2);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        TrackDecorationPolicy trackDecorationPolicy = this.a;
        if (trackDecorationPolicy != null) {
            codedOutputStream.M(1, trackDecorationPolicy);
        }
        ArtistDecorationPolicy artistDecorationPolicy = this.b;
        if (artistDecorationPolicy != null) {
            codedOutputStream.M(2, artistDecorationPolicy);
        }
        AlbumDecorationPolicy albumDecorationPolicy = this.c;
        if (albumDecorationPolicy != null) {
            codedOutputStream.M(3, albumDecorationPolicy);
        }
        ArtistDecorationPolicy artistDecorationPolicy2 = this.f;
        if (artistDecorationPolicy2 != null) {
            codedOutputStream.M(4, artistDecorationPolicy2);
        }
    }
}
