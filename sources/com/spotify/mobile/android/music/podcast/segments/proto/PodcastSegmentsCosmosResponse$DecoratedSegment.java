package com.spotify.mobile.android.music.podcast.segments.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackMetadata;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata$ProtoEpisodeMetadata;
import java.io.IOException;

public final class PodcastSegmentsCosmosResponse$DecoratedSegment extends GeneratedMessageLite<PodcastSegmentsCosmosResponse$DecoratedSegment, a> implements Object {
    private static final PodcastSegmentsCosmosResponse$DecoratedSegment u;
    private static volatile x<PodcastSegmentsCosmosResponse$DecoratedSegment> v;
    private String a = "";
    private int b;
    private int c;
    private TrackMetadata$ProtoTrackMetadata f;
    private int n;
    private String o = "";
    private String p = "";
    private String q = "";
    private String r = "";
    private EpisodeMetadata$ProtoEpisodeMetadata s;
    private boolean t;

    public static final class a extends GeneratedMessageLite.b<PodcastSegmentsCosmosResponse$DecoratedSegment, a> implements Object {
        private a() {
            super(PodcastSegmentsCosmosResponse$DecoratedSegment.u);
        }
    }

    static {
        PodcastSegmentsCosmosResponse$DecoratedSegment podcastSegmentsCosmosResponse$DecoratedSegment = new PodcastSegmentsCosmosResponse$DecoratedSegment();
        u = podcastSegmentsCosmosResponse$DecoratedSegment;
        podcastSegmentsCosmosResponse$DecoratedSegment.makeImmutable();
    }

    private PodcastSegmentsCosmosResponse$DecoratedSegment() {
    }

    public static x<PodcastSegmentsCosmosResponse$DecoratedSegment> parser() {
        return u.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return u;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PodcastSegmentsCosmosResponse$DecoratedSegment podcastSegmentsCosmosResponse$DecoratedSegment = (PodcastSegmentsCosmosResponse$DecoratedSegment) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !podcastSegmentsCosmosResponse$DecoratedSegment.a.isEmpty(), podcastSegmentsCosmosResponse$DecoratedSegment.a);
                int i = this.b;
                boolean z2 = i != 0;
                int i2 = podcastSegmentsCosmosResponse$DecoratedSegment.b;
                this.b = hVar.m(z2, i, i2 != 0, i2);
                int i3 = this.c;
                boolean z3 = i3 != 0;
                int i4 = podcastSegmentsCosmosResponse$DecoratedSegment.c;
                this.c = hVar.m(z3, i3, i4 != 0, i4);
                this.f = (TrackMetadata$ProtoTrackMetadata) hVar.i(this.f, podcastSegmentsCosmosResponse$DecoratedSegment.f);
                int i5 = this.n;
                boolean z4 = i5 != 0;
                int i6 = podcastSegmentsCosmosResponse$DecoratedSegment.n;
                if (i6 != 0) {
                    z = true;
                }
                this.n = hVar.m(z4, i5, z, i6);
                this.o = hVar.n(!this.o.isEmpty(), this.o, !podcastSegmentsCosmosResponse$DecoratedSegment.o.isEmpty(), podcastSegmentsCosmosResponse$DecoratedSegment.o);
                this.p = hVar.n(!this.p.isEmpty(), this.p, !podcastSegmentsCosmosResponse$DecoratedSegment.p.isEmpty(), podcastSegmentsCosmosResponse$DecoratedSegment.p);
                this.q = hVar.n(!this.q.isEmpty(), this.q, !podcastSegmentsCosmosResponse$DecoratedSegment.q.isEmpty(), podcastSegmentsCosmosResponse$DecoratedSegment.q);
                this.r = hVar.n(!this.r.isEmpty(), this.r, true ^ podcastSegmentsCosmosResponse$DecoratedSegment.r.isEmpty(), podcastSegmentsCosmosResponse$DecoratedSegment.r);
                this.s = (EpisodeMetadata$ProtoEpisodeMetadata) hVar.i(this.s, podcastSegmentsCosmosResponse$DecoratedSegment.s);
                boolean z5 = this.t;
                boolean z6 = podcastSegmentsCosmosResponse$DecoratedSegment.t;
                this.t = hVar.f(z5, z5, z6, z6);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        switch (B) {
                            case 0:
                                break;
                            case 10:
                                this.a = gVar.A();
                                continue;
                            case 16:
                                this.b = gVar.u();
                                continue;
                            case 24:
                                this.c = gVar.u();
                                continue;
                            case 34:
                                TrackMetadata$ProtoTrackMetadata trackMetadata$ProtoTrackMetadata = this.f;
                                TrackMetadata$ProtoTrackMetadata.a aVar = trackMetadata$ProtoTrackMetadata != null ? (TrackMetadata$ProtoTrackMetadata.a) trackMetadata$ProtoTrackMetadata.toBuilder() : null;
                                TrackMetadata$ProtoTrackMetadata trackMetadata$ProtoTrackMetadata2 = (TrackMetadata$ProtoTrackMetadata) gVar.o(TrackMetadata$ProtoTrackMetadata.parser(), kVar);
                                this.f = trackMetadata$ProtoTrackMetadata2;
                                if (aVar != null) {
                                    aVar.mergeFrom((TrackMetadata$ProtoTrackMetadata.a) trackMetadata$ProtoTrackMetadata2);
                                    this.f = (TrackMetadata$ProtoTrackMetadata) aVar.buildPartial();
                                } else {
                                    continue;
                                }
                            case 40:
                                this.n = gVar.u();
                                continue;
                            case 50:
                                this.o = gVar.A();
                                continue;
                            case 58:
                                this.p = gVar.A();
                                continue;
                            case 66:
                                this.q = gVar.A();
                                continue;
                            case 74:
                                this.r = gVar.A();
                                continue;
                            case 82:
                                EpisodeMetadata$ProtoEpisodeMetadata episodeMetadata$ProtoEpisodeMetadata = this.s;
                                EpisodeMetadata$ProtoEpisodeMetadata.a aVar2 = episodeMetadata$ProtoEpisodeMetadata != null ? (EpisodeMetadata$ProtoEpisodeMetadata.a) episodeMetadata$ProtoEpisodeMetadata.toBuilder() : null;
                                EpisodeMetadata$ProtoEpisodeMetadata episodeMetadata$ProtoEpisodeMetadata2 = (EpisodeMetadata$ProtoEpisodeMetadata) gVar.o(EpisodeMetadata$ProtoEpisodeMetadata.parser(), kVar);
                                this.s = episodeMetadata$ProtoEpisodeMetadata2;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((EpisodeMetadata$ProtoEpisodeMetadata.a) episodeMetadata$ProtoEpisodeMetadata2);
                                    this.s = (EpisodeMetadata$ProtoEpisodeMetadata) aVar2.buildPartial();
                                } else {
                                    continue;
                                }
                            case 88:
                                this.t = gVar.h();
                                continue;
                            default:
                                if (gVar.F(B)) {
                                    continue;
                                }
                                break;
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
                return new PodcastSegmentsCosmosResponse$DecoratedSegment();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (v == null) {
                    synchronized (PodcastSegmentsCosmosResponse$DecoratedSegment.class) {
                        if (v == null) {
                            v = new GeneratedMessageLite.c(u);
                        }
                    }
                }
                return v;
            default:
                throw new UnsupportedOperationException();
        }
        return u;
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
        int i3 = this.b;
        if (i3 != 0) {
            i2 += CodedOutputStream.j(2, i3);
        }
        int i4 = this.c;
        if (i4 != 0) {
            i2 += CodedOutputStream.j(3, i4);
        }
        if (this.f != null) {
            i2 += CodedOutputStream.n(4, p());
        }
        if (this.n != PodcastSegmentsCosmosResponse$PodcastSegmentType.UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.h(5, this.n);
        }
        if (!this.o.isEmpty()) {
            i2 += CodedOutputStream.p(6, this.o);
        }
        if (!this.p.isEmpty()) {
            i2 += CodedOutputStream.p(7, this.p);
        }
        if (!this.q.isEmpty()) {
            i2 += CodedOutputStream.p(8, this.q);
        }
        if (!this.r.isEmpty()) {
            i2 += CodedOutputStream.p(9, this.r);
        }
        if (this.s != null) {
            i2 += CodedOutputStream.n(10, k());
        }
        boolean z = this.t;
        if (z) {
            i2 += CodedOutputStream.d(11, z);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String h() {
        return this.q;
    }

    public boolean i() {
        return this.t;
    }

    public EpisodeMetadata$ProtoEpisodeMetadata k() {
        EpisodeMetadata$ProtoEpisodeMetadata episodeMetadata$ProtoEpisodeMetadata = this.s;
        return episodeMetadata$ProtoEpisodeMetadata == null ? EpisodeMetadata$ProtoEpisodeMetadata.i() : episodeMetadata$ProtoEpisodeMetadata;
    }

    public int l() {
        return this.b;
    }

    public int m() {
        return this.c;
    }

    public String n() {
        return this.p;
    }

    public String o() {
        return this.o;
    }

    public TrackMetadata$ProtoTrackMetadata p() {
        TrackMetadata$ProtoTrackMetadata trackMetadata$ProtoTrackMetadata = this.f;
        return trackMetadata$ProtoTrackMetadata == null ? TrackMetadata$ProtoTrackMetadata.n() : trackMetadata$ProtoTrackMetadata;
    }

    public PodcastSegmentsCosmosResponse$PodcastSegmentType q() {
        PodcastSegmentsCosmosResponse$PodcastSegmentType podcastSegmentsCosmosResponse$PodcastSegmentType;
        int i = this.n;
        if (i == 0) {
            podcastSegmentsCosmosResponse$PodcastSegmentType = PodcastSegmentsCosmosResponse$PodcastSegmentType.UNKNOWN;
        } else if (i == 1) {
            podcastSegmentsCosmosResponse$PodcastSegmentType = PodcastSegmentsCosmosResponse$PodcastSegmentType.TALK;
        } else if (i == 2) {
            podcastSegmentsCosmosResponse$PodcastSegmentType = PodcastSegmentsCosmosResponse$PodcastSegmentType.MUSIC;
        } else if (i != 3) {
            podcastSegmentsCosmosResponse$PodcastSegmentType = null;
        } else {
            podcastSegmentsCosmosResponse$PodcastSegmentType = PodcastSegmentsCosmosResponse$PodcastSegmentType.UPSELL;
        }
        return podcastSegmentsCosmosResponse$PodcastSegmentType == null ? PodcastSegmentsCosmosResponse$PodcastSegmentType.UNRECOGNIZED : podcastSegmentsCosmosResponse$PodcastSegmentType;
    }

    public String r() {
        return this.a;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        int i = this.b;
        if (i != 0) {
            codedOutputStream.K(2, i);
        }
        int i2 = this.c;
        if (i2 != 0) {
            codedOutputStream.K(3, i2);
        }
        if (this.f != null) {
            codedOutputStream.M(4, p());
        }
        if (this.n != PodcastSegmentsCosmosResponse$PodcastSegmentType.UNKNOWN.getNumber()) {
            codedOutputStream.K(5, this.n);
        }
        if (!this.o.isEmpty()) {
            codedOutputStream.P(6, this.o);
        }
        if (!this.p.isEmpty()) {
            codedOutputStream.P(7, this.p);
        }
        if (!this.q.isEmpty()) {
            codedOutputStream.P(8, this.q);
        }
        if (!this.r.isEmpty()) {
            codedOutputStream.P(9, this.r);
        }
        if (this.s != null) {
            codedOutputStream.M(10, k());
        }
        boolean z = this.t;
        if (z) {
            codedOutputStream.A(11, z);
        }
    }
}
