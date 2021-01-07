package com.spotify.mobile.android.music.podcast.segments.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy;
import com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosRequest$SegmentsPolicy;
import com.spotify.mobile.android.music.podcast.segments.proto.PodcastSegmentsCosmosRequest$TrackDecorationPolicy;
import java.io.IOException;

public final class PodcastSegmentsCosmosRequest$PodcastSegmentsRequest extends GeneratedMessageLite<PodcastSegmentsCosmosRequest$PodcastSegmentsRequest, a> implements Object {
    private static final PodcastSegmentsCosmosRequest$PodcastSegmentsRequest o;
    private static volatile x<PodcastSegmentsCosmosRequest$PodcastSegmentsRequest> p;
    private int a;
    private o.i<String> b = GeneratedMessageLite.emptyProtobufList();
    private PodcastSegmentsCosmosRequest$TrackDecorationPolicy c;
    private PodcastSegmentsCosmosRequest$SegmentsPolicy f;
    private PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy n;

    public static final class a extends GeneratedMessageLite.b<PodcastSegmentsCosmosRequest$PodcastSegmentsRequest, a> implements Object {
        public a m(String str) {
            copyOnWrite();
            PodcastSegmentsCosmosRequest$PodcastSegmentsRequest.l((PodcastSegmentsCosmosRequest$PodcastSegmentsRequest) this.instance, str);
            return this;
        }

        public a n(PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy.a aVar) {
            copyOnWrite();
            PodcastSegmentsCosmosRequest$PodcastSegmentsRequest.i((PodcastSegmentsCosmosRequest$PodcastSegmentsRequest) this.instance, aVar);
            return this;
        }

        public a o(PodcastSegmentsCosmosRequest$SegmentsPolicy podcastSegmentsCosmosRequest$SegmentsPolicy) {
            copyOnWrite();
            PodcastSegmentsCosmosRequest$PodcastSegmentsRequest.h((PodcastSegmentsCosmosRequest$PodcastSegmentsRequest) this.instance, podcastSegmentsCosmosRequest$SegmentsPolicy);
            return this;
        }

        public a p(PodcastSegmentsCosmosRequest$TrackDecorationPolicy.a aVar) {
            copyOnWrite();
            PodcastSegmentsCosmosRequest$PodcastSegmentsRequest.m((PodcastSegmentsCosmosRequest$PodcastSegmentsRequest) this.instance, aVar);
            return this;
        }

        private a() {
            super(PodcastSegmentsCosmosRequest$PodcastSegmentsRequest.o);
        }
    }

    static {
        PodcastSegmentsCosmosRequest$PodcastSegmentsRequest podcastSegmentsCosmosRequest$PodcastSegmentsRequest = new PodcastSegmentsCosmosRequest$PodcastSegmentsRequest();
        o = podcastSegmentsCosmosRequest$PodcastSegmentsRequest;
        podcastSegmentsCosmosRequest$PodcastSegmentsRequest.makeImmutable();
    }

    private PodcastSegmentsCosmosRequest$PodcastSegmentsRequest() {
    }

    static void h(PodcastSegmentsCosmosRequest$PodcastSegmentsRequest podcastSegmentsCosmosRequest$PodcastSegmentsRequest, PodcastSegmentsCosmosRequest$SegmentsPolicy podcastSegmentsCosmosRequest$SegmentsPolicy) {
        podcastSegmentsCosmosRequest$PodcastSegmentsRequest.getClass();
        podcastSegmentsCosmosRequest$SegmentsPolicy.getClass();
        podcastSegmentsCosmosRequest$PodcastSegmentsRequest.f = podcastSegmentsCosmosRequest$SegmentsPolicy;
    }

    static void i(PodcastSegmentsCosmosRequest$PodcastSegmentsRequest podcastSegmentsCosmosRequest$PodcastSegmentsRequest, PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy.a aVar) {
        podcastSegmentsCosmosRequest$PodcastSegmentsRequest.getClass();
        podcastSegmentsCosmosRequest$PodcastSegmentsRequest.n = (PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy) aVar.build();
    }

    static void l(PodcastSegmentsCosmosRequest$PodcastSegmentsRequest podcastSegmentsCosmosRequest$PodcastSegmentsRequest, String str) {
        podcastSegmentsCosmosRequest$PodcastSegmentsRequest.getClass();
        str.getClass();
        if (!podcastSegmentsCosmosRequest$PodcastSegmentsRequest.b.R0()) {
            podcastSegmentsCosmosRequest$PodcastSegmentsRequest.b = GeneratedMessageLite.mutableCopy(podcastSegmentsCosmosRequest$PodcastSegmentsRequest.b);
        }
        podcastSegmentsCosmosRequest$PodcastSegmentsRequest.b.add(str);
    }

    static void m(PodcastSegmentsCosmosRequest$PodcastSegmentsRequest podcastSegmentsCosmosRequest$PodcastSegmentsRequest, PodcastSegmentsCosmosRequest$TrackDecorationPolicy.a aVar) {
        podcastSegmentsCosmosRequest$PodcastSegmentsRequest.getClass();
        podcastSegmentsCosmosRequest$PodcastSegmentsRequest.c = (PodcastSegmentsCosmosRequest$TrackDecorationPolicy) aVar.build();
    }

    public static a n() {
        return (a) o.toBuilder();
    }

    public static x<PodcastSegmentsCosmosRequest$PodcastSegmentsRequest> parser() {
        return o.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return o;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PodcastSegmentsCosmosRequest$PodcastSegmentsRequest podcastSegmentsCosmosRequest$PodcastSegmentsRequest = (PodcastSegmentsCosmosRequest$PodcastSegmentsRequest) obj2;
                this.b = hVar.q(this.b, podcastSegmentsCosmosRequest$PodcastSegmentsRequest.b);
                this.c = (PodcastSegmentsCosmosRequest$TrackDecorationPolicy) hVar.i(this.c, podcastSegmentsCosmosRequest$PodcastSegmentsRequest.c);
                this.f = (PodcastSegmentsCosmosRequest$SegmentsPolicy) hVar.i(this.f, podcastSegmentsCosmosRequest$PodcastSegmentsRequest.f);
                this.n = (PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy) hVar.i(this.n, podcastSegmentsCosmosRequest$PodcastSegmentsRequest.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= podcastSegmentsCosmosRequest$PodcastSegmentsRequest.a;
                }
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
                                String A = gVar.A();
                                if (!this.b.R0()) {
                                    this.b = GeneratedMessageLite.mutableCopy(this.b);
                                }
                                this.b.add(A);
                            } else if (B == 18) {
                                PodcastSegmentsCosmosRequest$TrackDecorationPolicy podcastSegmentsCosmosRequest$TrackDecorationPolicy = this.c;
                                PodcastSegmentsCosmosRequest$TrackDecorationPolicy.a aVar = podcastSegmentsCosmosRequest$TrackDecorationPolicy != null ? (PodcastSegmentsCosmosRequest$TrackDecorationPolicy.a) podcastSegmentsCosmosRequest$TrackDecorationPolicy.toBuilder() : null;
                                PodcastSegmentsCosmosRequest$TrackDecorationPolicy podcastSegmentsCosmosRequest$TrackDecorationPolicy2 = (PodcastSegmentsCosmosRequest$TrackDecorationPolicy) gVar.o(PodcastSegmentsCosmosRequest$TrackDecorationPolicy.parser(), kVar);
                                this.c = podcastSegmentsCosmosRequest$TrackDecorationPolicy2;
                                if (aVar != null) {
                                    aVar.mergeFrom((PodcastSegmentsCosmosRequest$TrackDecorationPolicy.a) podcastSegmentsCosmosRequest$TrackDecorationPolicy2);
                                    this.c = (PodcastSegmentsCosmosRequest$TrackDecorationPolicy) aVar.buildPartial();
                                }
                            } else if (B == 26) {
                                PodcastSegmentsCosmosRequest$SegmentsPolicy podcastSegmentsCosmosRequest$SegmentsPolicy = this.f;
                                PodcastSegmentsCosmosRequest$SegmentsPolicy.a aVar2 = podcastSegmentsCosmosRequest$SegmentsPolicy != null ? (PodcastSegmentsCosmosRequest$SegmentsPolicy.a) podcastSegmentsCosmosRequest$SegmentsPolicy.toBuilder() : null;
                                PodcastSegmentsCosmosRequest$SegmentsPolicy podcastSegmentsCosmosRequest$SegmentsPolicy2 = (PodcastSegmentsCosmosRequest$SegmentsPolicy) gVar.o(PodcastSegmentsCosmosRequest$SegmentsPolicy.parser(), kVar);
                                this.f = podcastSegmentsCosmosRequest$SegmentsPolicy2;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((PodcastSegmentsCosmosRequest$SegmentsPolicy.a) podcastSegmentsCosmosRequest$SegmentsPolicy2);
                                    this.f = (PodcastSegmentsCosmosRequest$SegmentsPolicy) aVar2.buildPartial();
                                }
                            } else if (B == 34) {
                                PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy podcastSegmentsCosmosRequest$EpisodeDecorationPolicy = this.n;
                                PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy.a aVar3 = podcastSegmentsCosmosRequest$EpisodeDecorationPolicy != null ? (PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy.a) podcastSegmentsCosmosRequest$EpisodeDecorationPolicy.toBuilder() : null;
                                PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy podcastSegmentsCosmosRequest$EpisodeDecorationPolicy2 = (PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy) gVar.o(PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy.parser(), kVar);
                                this.n = podcastSegmentsCosmosRequest$EpisodeDecorationPolicy2;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy.a) podcastSegmentsCosmosRequest$EpisodeDecorationPolicy2);
                                    this.n = (PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy) aVar3.buildPartial();
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
                this.b.C();
                return null;
            case 4:
                return new PodcastSegmentsCosmosRequest$PodcastSegmentsRequest();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (PodcastSegmentsCosmosRequest$PodcastSegmentsRequest.class) {
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
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            i2 += CodedOutputStream.q(this.b.get(i3));
        }
        int C0 = je.C0(this.b, 1, 0 + i2);
        PodcastSegmentsCosmosRequest$TrackDecorationPolicy podcastSegmentsCosmosRequest$TrackDecorationPolicy = this.c;
        if (podcastSegmentsCosmosRequest$TrackDecorationPolicy != null) {
            C0 += CodedOutputStream.n(2, podcastSegmentsCosmosRequest$TrackDecorationPolicy);
        }
        PodcastSegmentsCosmosRequest$SegmentsPolicy podcastSegmentsCosmosRequest$SegmentsPolicy = this.f;
        if (podcastSegmentsCosmosRequest$SegmentsPolicy != null) {
            C0 += CodedOutputStream.n(3, podcastSegmentsCosmosRequest$SegmentsPolicy);
        }
        PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy podcastSegmentsCosmosRequest$EpisodeDecorationPolicy = this.n;
        if (podcastSegmentsCosmosRequest$EpisodeDecorationPolicy != null) {
            C0 += CodedOutputStream.n(4, podcastSegmentsCosmosRequest$EpisodeDecorationPolicy);
        }
        this.memoizedSerializedSize = C0;
        return C0;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.b.size(); i++) {
            codedOutputStream.P(1, this.b.get(i));
        }
        PodcastSegmentsCosmosRequest$TrackDecorationPolicy podcastSegmentsCosmosRequest$TrackDecorationPolicy = this.c;
        if (podcastSegmentsCosmosRequest$TrackDecorationPolicy != null) {
            codedOutputStream.M(2, podcastSegmentsCosmosRequest$TrackDecorationPolicy);
        }
        PodcastSegmentsCosmosRequest$SegmentsPolicy podcastSegmentsCosmosRequest$SegmentsPolicy = this.f;
        if (podcastSegmentsCosmosRequest$SegmentsPolicy != null) {
            codedOutputStream.M(3, podcastSegmentsCosmosRequest$SegmentsPolicy);
        }
        PodcastSegmentsCosmosRequest$EpisodeDecorationPolicy podcastSegmentsCosmosRequest$EpisodeDecorationPolicy = this.n;
        if (podcastSegmentsCosmosRequest$EpisodeDecorationPolicy != null) {
            codedOutputStream.M(4, podcastSegmentsCosmosRequest$EpisodeDecorationPolicy);
        }
    }
}
