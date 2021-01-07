package com.spotify.podcastsegments.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class PodcastSegments extends GeneratedMessageLite<PodcastSegments, b> implements Object {
    private static final PodcastSegments r;
    private static volatile x<PodcastSegments> s;
    private int a;
    private String b = "";
    private o.i<PlaybackSegment> c = GeneratedMessageLite.emptyProtobufList();
    private o.i<EmbeddedSegment> f = GeneratedMessageLite.emptyProtobufList();
    private boolean n;
    private String o = "";
    private o.i<String> p = GeneratedMessageLite.emptyProtobufList();
    private int q;

    public static final class b extends GeneratedMessageLite.b<PodcastSegments, b> implements Object {
        private b() {
            super(PodcastSegments.r);
        }
    }

    static {
        PodcastSegments podcastSegments = new PodcastSegments();
        r = podcastSegments;
        podcastSegments.makeImmutable();
    }

    private PodcastSegments() {
    }

    public static PodcastSegments i() {
        return r;
    }

    public static x<PodcastSegments> parser() {
        return r.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return r;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PodcastSegments podcastSegments = (PodcastSegments) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, !podcastSegments.b.isEmpty(), podcastSegments.b);
                this.c = hVar.q(this.c, podcastSegments.c);
                this.f = hVar.q(this.f, podcastSegments.f);
                boolean z2 = this.n;
                boolean z3 = podcastSegments.n;
                this.n = hVar.f(z2, z2, z3, z3);
                this.o = hVar.n(!this.o.isEmpty(), this.o, !podcastSegments.o.isEmpty(), podcastSegments.o);
                this.p = hVar.q(this.p, podcastSegments.p);
                int i = this.q;
                boolean z4 = i != 0;
                int i2 = podcastSegments.q;
                if (i2 != 0) {
                    z = true;
                }
                this.q = hVar.m(z4, i, z, i2);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= podcastSegments.a;
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
                                this.b = gVar.A();
                            } else if (B == 18) {
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(gVar.o(PlaybackSegment.parser(), kVar));
                            } else if (B == 26) {
                                if (!this.f.R0()) {
                                    this.f = GeneratedMessageLite.mutableCopy(this.f);
                                }
                                this.f.add(gVar.o(EmbeddedSegment.parser(), kVar));
                            } else if (B == 32) {
                                this.n = gVar.h();
                            } else if (B == 42) {
                                this.o = gVar.A();
                            } else if (B == 50) {
                                String A = gVar.A();
                                if (!this.p.R0()) {
                                    this.p = GeneratedMessageLite.mutableCopy(this.p);
                                }
                                this.p.add(A);
                            } else if (B == 56) {
                                this.q = gVar.u();
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
                this.c.C();
                this.f.C();
                this.p.C();
                return null;
            case 4:
                return new PodcastSegments();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (s == null) {
                    synchronized (PodcastSegments.class) {
                        if (s == null) {
                            s = new GeneratedMessageLite.c(r);
                        }
                    }
                }
                return s;
            default:
                throw new UnsupportedOperationException();
        }
        return r;
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
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            p2 += CodedOutputStream.n(3, this.f.get(i3));
        }
        boolean z = this.n;
        if (z) {
            p2 += CodedOutputStream.d(4, z);
        }
        if (!this.o.isEmpty()) {
            p2 += CodedOutputStream.p(5, this.o);
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.p.size(); i5++) {
            i4 += CodedOutputStream.q(this.p.get(i5));
        }
        int C0 = je.C0(this.p, 1, p2 + i4);
        int i6 = this.q;
        if (i6 != 0) {
            C0 += CodedOutputStream.j(7, i6);
        }
        this.memoizedSerializedSize = C0;
        return C0;
    }

    public List<String> h() {
        return this.p;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.P(1, this.b);
        }
        for (int i = 0; i < this.c.size(); i++) {
            codedOutputStream.M(2, this.c.get(i));
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            codedOutputStream.M(3, this.f.get(i2));
        }
        boolean z = this.n;
        if (z) {
            codedOutputStream.A(4, z);
        }
        if (!this.o.isEmpty()) {
            codedOutputStream.P(5, this.o);
        }
        for (int i3 = 0; i3 < this.p.size(); i3++) {
            codedOutputStream.P(6, this.p.get(i3));
        }
        int i4 = this.q;
        if (i4 != 0) {
            codedOutputStream.K(7, i4);
        }
    }
}
