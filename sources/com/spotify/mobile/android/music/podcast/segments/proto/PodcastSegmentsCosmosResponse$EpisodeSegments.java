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

public final class PodcastSegmentsCosmosResponse$EpisodeSegments extends GeneratedMessageLite<PodcastSegmentsCosmosResponse$EpisodeSegments, a> implements Object {
    private static final PodcastSegmentsCosmosResponse$EpisodeSegments p;
    private static volatile x<PodcastSegmentsCosmosResponse$EpisodeSegments> q;
    private int a;
    private String b = "";
    private o.i<PodcastSegmentsCosmosResponse$DecoratedSegment> c = GeneratedMessageLite.emptyProtobufList();
    private boolean f;
    private String n = "";
    private o.i<String> o = GeneratedMessageLite.emptyProtobufList();

    public static final class a extends GeneratedMessageLite.b<PodcastSegmentsCosmosResponse$EpisodeSegments, a> implements Object {
        private a() {
            super(PodcastSegmentsCosmosResponse$EpisodeSegments.p);
        }
    }

    static {
        PodcastSegmentsCosmosResponse$EpisodeSegments podcastSegmentsCosmosResponse$EpisodeSegments = new PodcastSegmentsCosmosResponse$EpisodeSegments();
        p = podcastSegmentsCosmosResponse$EpisodeSegments;
        podcastSegmentsCosmosResponse$EpisodeSegments.makeImmutable();
    }

    private PodcastSegmentsCosmosResponse$EpisodeSegments() {
    }

    public static x<PodcastSegmentsCosmosResponse$EpisodeSegments> parser() {
        return p.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return p;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PodcastSegmentsCosmosResponse$EpisodeSegments podcastSegmentsCosmosResponse$EpisodeSegments = (PodcastSegmentsCosmosResponse$EpisodeSegments) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, !podcastSegmentsCosmosResponse$EpisodeSegments.b.isEmpty(), podcastSegmentsCosmosResponse$EpisodeSegments.b);
                this.c = hVar.q(this.c, podcastSegmentsCosmosResponse$EpisodeSegments.c);
                boolean z = this.f;
                boolean z2 = podcastSegmentsCosmosResponse$EpisodeSegments.f;
                this.f = hVar.f(z, z, z2, z2);
                this.n = hVar.n(!this.n.isEmpty(), this.n, true ^ podcastSegmentsCosmosResponse$EpisodeSegments.n.isEmpty(), podcastSegmentsCosmosResponse$EpisodeSegments.n);
                this.o = hVar.q(this.o, podcastSegmentsCosmosResponse$EpisodeSegments.o);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= podcastSegmentsCosmosResponse$EpisodeSegments.a;
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
                            if (B == 10) {
                                this.b = gVar.A();
                            } else if (B == 18) {
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(gVar.o(PodcastSegmentsCosmosResponse$DecoratedSegment.parser(), kVar));
                            } else if (B == 24) {
                                this.f = gVar.h();
                            } else if (B == 34) {
                                this.n = gVar.A();
                            } else if (B == 42) {
                                String A = gVar.A();
                                if (!this.o.R0()) {
                                    this.o = GeneratedMessageLite.mutableCopy(this.o);
                                }
                                this.o.add(A);
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
                this.o.C();
                return null;
            case 4:
                return new PodcastSegmentsCosmosResponse$EpisodeSegments();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (q == null) {
                    synchronized (PodcastSegmentsCosmosResponse$EpisodeSegments.class) {
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

    public boolean getCanUpsell() {
        return this.f;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int p2 = !this.b.isEmpty() ? CodedOutputStream.p(1, this.b) + 0 : 0;
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            p2 += CodedOutputStream.n(2, this.c.get(i2));
        }
        boolean z = this.f;
        if (z) {
            p2 += CodedOutputStream.d(3, z);
        }
        if (!this.n.isEmpty()) {
            p2 += CodedOutputStream.p(4, this.n);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.o.size(); i4++) {
            i3 += CodedOutputStream.q(this.o.get(i4));
        }
        int C0 = je.C0(this.o, 1, p2 + i3);
        this.memoizedSerializedSize = C0;
        return C0;
    }

    public String h() {
        return this.n;
    }

    public List<String> i() {
        return this.o;
    }

    public String l() {
        return this.b;
    }

    public List<PodcastSegmentsCosmosResponse$DecoratedSegment> m() {
        return this.c;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.P(1, this.b);
        }
        for (int i = 0; i < this.c.size(); i++) {
            codedOutputStream.M(2, this.c.get(i));
        }
        boolean z = this.f;
        if (z) {
            codedOutputStream.A(3, z);
        }
        if (!this.n.isEmpty()) {
            codedOutputStream.P(4, this.n);
        }
        for (int i2 = 0; i2 < this.o.size(); i2++) {
            codedOutputStream.P(5, this.o.get(i2));
        }
    }
}
