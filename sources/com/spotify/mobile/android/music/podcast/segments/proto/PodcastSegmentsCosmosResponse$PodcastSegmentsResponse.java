package com.spotify.mobile.android.music.podcast.segments.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class PodcastSegmentsCosmosResponse$PodcastSegmentsResponse extends GeneratedMessageLite<PodcastSegmentsCosmosResponse$PodcastSegmentsResponse, a> implements Object {
    private static final PodcastSegmentsCosmosResponse$PodcastSegmentsResponse f;
    private static volatile x<PodcastSegmentsCosmosResponse$PodcastSegmentsResponse> n;
    private int a;
    private boolean b;
    private o.i<PodcastSegmentsCosmosResponse$EpisodeSegments> c = GeneratedMessageLite.emptyProtobufList();

    public static final class a extends GeneratedMessageLite.b<PodcastSegmentsCosmosResponse$PodcastSegmentsResponse, a> implements Object {
        private a() {
            super(PodcastSegmentsCosmosResponse$PodcastSegmentsResponse.f);
        }
    }

    static {
        PodcastSegmentsCosmosResponse$PodcastSegmentsResponse podcastSegmentsCosmosResponse$PodcastSegmentsResponse = new PodcastSegmentsCosmosResponse$PodcastSegmentsResponse();
        f = podcastSegmentsCosmosResponse$PodcastSegmentsResponse;
        podcastSegmentsCosmosResponse$PodcastSegmentsResponse.makeImmutable();
    }

    private PodcastSegmentsCosmosResponse$PodcastSegmentsResponse() {
    }

    public static x<PodcastSegmentsCosmosResponse$PodcastSegmentsResponse> parser() {
        return f.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return f;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PodcastSegmentsCosmosResponse$PodcastSegmentsResponse podcastSegmentsCosmosResponse$PodcastSegmentsResponse = (PodcastSegmentsCosmosResponse$PodcastSegmentsResponse) obj2;
                boolean z = this.b;
                boolean z2 = podcastSegmentsCosmosResponse$PodcastSegmentsResponse.b;
                this.b = hVar.f(z, z, z2, z2);
                this.c = hVar.q(this.c, podcastSegmentsCosmosResponse$PodcastSegmentsResponse.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= podcastSegmentsCosmosResponse$PodcastSegmentsResponse.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.b = gVar.h();
                            } else if (B == 18) {
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(gVar.o(PodcastSegmentsCosmosResponse$EpisodeSegments.parser(), kVar));
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z3 = true;
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
                this.c.C();
                return null;
            case 4:
                return new PodcastSegmentsCosmosResponse$PodcastSegmentsResponse();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (PodcastSegmentsCosmosResponse$PodcastSegmentsResponse.class) {
                        if (n == null) {
                            n = new GeneratedMessageLite.c(f);
                        }
                    }
                }
                return n;
            default:
                throw new UnsupportedOperationException();
        }
        return f;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        boolean z = this.b;
        int d = z ? CodedOutputStream.d(1, z) + 0 : 0;
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            d += CodedOutputStream.n(2, this.c.get(i2));
        }
        this.memoizedSerializedSize = d;
        return d;
    }

    public List<PodcastSegmentsCosmosResponse$EpisodeSegments> h() {
        return this.c;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        boolean z = this.b;
        if (z) {
            codedOutputStream.A(1, z);
        }
        for (int i = 0; i < this.c.size(); i++) {
            codedOutputStream.M(2, this.c.get(i));
        }
    }
}
