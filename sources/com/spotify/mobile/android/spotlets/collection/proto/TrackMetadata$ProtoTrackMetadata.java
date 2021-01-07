package com.spotify.mobile.android.spotlets.collection.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.mobile.android.spotlets.collection.proto.TrackMetadata$ProtoTrackAlbumMetadata;
import java.io.IOException;
import java.util.List;

public final class TrackMetadata$ProtoTrackMetadata extends GeneratedMessageLite<TrackMetadata$ProtoTrackMetadata, a> implements Object {
    private static final TrackMetadata$ProtoTrackMetadata A;
    private static volatile x<TrackMetadata$ProtoTrackMetadata> B;
    private int a;
    private TrackMetadata$ProtoTrackAlbumMetadata b;
    private o.i<TrackMetadata$ProtoTrackArtistMetadata> c = GeneratedMessageLite.emptyProtobufList();
    private String f = "";
    private String n = "";
    private int o;
    private boolean p;
    private int q;
    private int r;
    private boolean s;
    private String t = "";
    private boolean u;
    private boolean v;
    private boolean w;
    private String x = "";
    private boolean y;
    private o.i<TrackMetadata$TrackDescriptor> z = GeneratedMessageLite.emptyProtobufList();

    public static final class a extends GeneratedMessageLite.b<TrackMetadata$ProtoTrackMetadata, a> implements Object {
        private a() {
            super(TrackMetadata$ProtoTrackMetadata.A);
        }
    }

    static {
        TrackMetadata$ProtoTrackMetadata trackMetadata$ProtoTrackMetadata = new TrackMetadata$ProtoTrackMetadata();
        A = trackMetadata$ProtoTrackMetadata;
        trackMetadata$ProtoTrackMetadata.makeImmutable();
    }

    private TrackMetadata$ProtoTrackMetadata() {
    }

    public static TrackMetadata$ProtoTrackMetadata n() {
        return A;
    }

    public static x<TrackMetadata$ProtoTrackMetadata> parser() {
        return A.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return A;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                TrackMetadata$ProtoTrackMetadata trackMetadata$ProtoTrackMetadata = (TrackMetadata$ProtoTrackMetadata) obj2;
                this.b = (TrackMetadata$ProtoTrackAlbumMetadata) hVar.i(this.b, trackMetadata$ProtoTrackMetadata.b);
                this.c = hVar.q(this.c, trackMetadata$ProtoTrackMetadata.c);
                this.f = hVar.n((this.a & 2) == 2, this.f, (trackMetadata$ProtoTrackMetadata.a & 2) == 2, trackMetadata$ProtoTrackMetadata.f);
                this.n = hVar.n((this.a & 4) == 4, this.n, (trackMetadata$ProtoTrackMetadata.a & 4) == 4, trackMetadata$ProtoTrackMetadata.n);
                this.o = hVar.m((this.a & 8) == 8, this.o, (trackMetadata$ProtoTrackMetadata.a & 8) == 8, trackMetadata$ProtoTrackMetadata.o);
                this.p = hVar.f((this.a & 16) == 16, this.p, (trackMetadata$ProtoTrackMetadata.a & 16) == 16, trackMetadata$ProtoTrackMetadata.p);
                this.q = hVar.m((this.a & 32) == 32, this.q, (trackMetadata$ProtoTrackMetadata.a & 32) == 32, trackMetadata$ProtoTrackMetadata.q);
                this.r = hVar.m((this.a & 64) == 64, this.r, (trackMetadata$ProtoTrackMetadata.a & 64) == 64, trackMetadata$ProtoTrackMetadata.r);
                this.s = hVar.f((this.a & 128) == 128, this.s, (trackMetadata$ProtoTrackMetadata.a & 128) == 128, trackMetadata$ProtoTrackMetadata.s);
                this.t = hVar.n((this.a & 256) == 256, this.t, (trackMetadata$ProtoTrackMetadata.a & 256) == 256, trackMetadata$ProtoTrackMetadata.t);
                this.u = hVar.f((this.a & 512) == 512, this.u, (trackMetadata$ProtoTrackMetadata.a & 512) == 512, trackMetadata$ProtoTrackMetadata.u);
                this.v = hVar.f((this.a & 1024) == 1024, this.v, (trackMetadata$ProtoTrackMetadata.a & 1024) == 1024, trackMetadata$ProtoTrackMetadata.v);
                this.w = hVar.f((this.a & 2048) == 2048, this.w, (trackMetadata$ProtoTrackMetadata.a & 2048) == 2048, trackMetadata$ProtoTrackMetadata.w);
                this.x = hVar.n((this.a & 4096) == 4096, this.x, (trackMetadata$ProtoTrackMetadata.a & 4096) == 4096, trackMetadata$ProtoTrackMetadata.x);
                this.y = hVar.f((this.a & 8192) == 8192, this.y, (trackMetadata$ProtoTrackMetadata.a & 8192) == 8192, trackMetadata$ProtoTrackMetadata.y);
                this.z = hVar.q(this.z, trackMetadata$ProtoTrackMetadata.z);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= trackMetadata$ProtoTrackMetadata.a;
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
                                TrackMetadata$ProtoTrackAlbumMetadata.a aVar = (this.a & 1) == 1 ? (TrackMetadata$ProtoTrackAlbumMetadata.a) this.b.toBuilder() : null;
                                TrackMetadata$ProtoTrackAlbumMetadata trackMetadata$ProtoTrackAlbumMetadata = (TrackMetadata$ProtoTrackAlbumMetadata) gVar.o(TrackMetadata$ProtoTrackAlbumMetadata.parser(), kVar);
                                this.b = trackMetadata$ProtoTrackAlbumMetadata;
                                if (aVar != null) {
                                    aVar.mergeFrom((TrackMetadata$ProtoTrackAlbumMetadata.a) trackMetadata$ProtoTrackAlbumMetadata);
                                    this.b = (TrackMetadata$ProtoTrackAlbumMetadata) aVar.buildPartial();
                                }
                                this.a |= 1;
                                break;
                            case 18:
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(gVar.o(TrackMetadata$ProtoTrackArtistMetadata.parser(), kVar));
                                break;
                            case 26:
                                String z3 = gVar.z();
                                this.a |= 2;
                                this.f = z3;
                                break;
                            case 34:
                                String z4 = gVar.z();
                                this.a |= 4;
                                this.n = z4;
                                break;
                            case 40:
                                this.a |= 8;
                                this.o = gVar.u();
                                break;
                            case 48:
                                this.a |= 16;
                                this.p = gVar.h();
                                break;
                            case 56:
                                this.a |= 32;
                                this.q = gVar.u();
                                break;
                            case 64:
                                this.a |= 64;
                                this.r = gVar.u();
                                break;
                            case 72:
                                this.a |= 128;
                                this.s = gVar.h();
                                break;
                            case 82:
                                String z5 = gVar.z();
                                this.a |= 256;
                                this.t = z5;
                                break;
                            case 88:
                                this.a |= 512;
                                this.u = gVar.h();
                                break;
                            case 104:
                                this.a |= 1024;
                                this.v = gVar.h();
                                break;
                            case 112:
                                this.a |= 2048;
                                this.w = gVar.h();
                                break;
                            case 130:
                                String z6 = gVar.z();
                                this.a |= 4096;
                                this.x = z6;
                                break;
                            case 144:
                                this.a |= 8192;
                                this.y = gVar.h();
                                break;
                            case 154:
                                if (!this.z.R0()) {
                                    this.z = GeneratedMessageLite.mutableCopy(this.z);
                                }
                                this.z.add(gVar.o(TrackMetadata$TrackDescriptor.parser(), kVar));
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
                this.c.C();
                this.z.C();
                return null;
            case 4:
                return new TrackMetadata$ProtoTrackMetadata();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (B == null) {
                    synchronized (TrackMetadata$ProtoTrackMetadata.class) {
                        if (B == null) {
                            B = new GeneratedMessageLite.c(A);
                        }
                    }
                }
                return B;
            default:
                throw new UnsupportedOperationException();
        }
        return A;
    }

    public boolean getAvailable() {
        return this.p;
    }

    public boolean getHasLyrics() {
        return this.v;
    }

    public boolean getIs19PlusOnly() {
        return this.y;
    }

    public boolean getIsExplicit() {
        return this.s;
    }

    public boolean getIsLocal() {
        return this.u;
    }

    public boolean getIsPremiumOnly() {
        return this.w;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int n2 = (this.a & 1) == 1 ? CodedOutputStream.n(1, h()) + 0 : 0;
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            n2 += CodedOutputStream.n(2, this.c.get(i2));
        }
        if ((this.a & 2) == 2) {
            n2 += CodedOutputStream.p(3, this.f);
        }
        if ((this.a & 4) == 4) {
            n2 += CodedOutputStream.p(4, this.n);
        }
        if ((this.a & 8) == 8) {
            n2 += CodedOutputStream.s(5, this.o);
        }
        if ((this.a & 16) == 16) {
            n2 += CodedOutputStream.d(6, this.p);
        }
        if ((this.a & 32) == 32) {
            n2 += CodedOutputStream.s(7, this.q);
        }
        if ((this.a & 64) == 64) {
            n2 += CodedOutputStream.s(8, this.r);
        }
        if ((this.a & 128) == 128) {
            n2 += CodedOutputStream.d(9, this.s);
        }
        if ((this.a & 256) == 256) {
            n2 += CodedOutputStream.p(10, this.t);
        }
        if ((this.a & 512) == 512) {
            n2 += CodedOutputStream.d(11, this.u);
        }
        if ((this.a & 1024) == 1024) {
            n2 += CodedOutputStream.d(13, this.v);
        }
        if ((this.a & 2048) == 2048) {
            n2 += CodedOutputStream.d(14, this.w);
        }
        if ((this.a & 4096) == 4096) {
            n2 += CodedOutputStream.p(16, this.x);
        }
        if ((this.a & 8192) == 8192) {
            n2 += CodedOutputStream.d(18, this.y);
        }
        for (int i3 = 0; i3 < this.z.size(); i3++) {
            n2 += CodedOutputStream.n(19, this.z.get(i3));
        }
        int c2 = this.unknownFields.c() + n2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public TrackMetadata$ProtoTrackAlbumMetadata h() {
        TrackMetadata$ProtoTrackAlbumMetadata trackMetadata$ProtoTrackAlbumMetadata = this.b;
        return trackMetadata$ProtoTrackAlbumMetadata == null ? TrackMetadata$ProtoTrackAlbumMetadata.l() : trackMetadata$ProtoTrackAlbumMetadata;
    }

    public TrackMetadata$ProtoTrackArtistMetadata i(int i) {
        return this.c.get(i);
    }

    public int l() {
        return this.c.size();
    }

    public List<TrackMetadata$ProtoTrackArtistMetadata> m() {
        return this.c;
    }

    public int o() {
        return this.o;
    }

    public String p() {
        return this.f;
    }

    public String q() {
        return this.n;
    }

    public String r() {
        return this.x;
    }

    public String s() {
        return this.t;
    }

    public List<TrackMetadata$TrackDescriptor> t() {
        return this.z;
    }

    public boolean u() {
        return (this.a & 1) == 1;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.M(1, h());
        }
        for (int i = 0; i < this.c.size(); i++) {
            codedOutputStream.M(2, this.c.get(i));
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.P(3, this.f);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.P(4, this.n);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.S(5, this.o);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.A(6, this.p);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.S(7, this.q);
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.S(8, this.r);
        }
        if ((this.a & 128) == 128) {
            codedOutputStream.A(9, this.s);
        }
        if ((this.a & 256) == 256) {
            codedOutputStream.P(10, this.t);
        }
        if ((this.a & 512) == 512) {
            codedOutputStream.A(11, this.u);
        }
        if ((this.a & 1024) == 1024) {
            codedOutputStream.A(13, this.v);
        }
        if ((this.a & 2048) == 2048) {
            codedOutputStream.A(14, this.w);
        }
        if ((this.a & 4096) == 4096) {
            codedOutputStream.P(16, this.x);
        }
        if ((this.a & 8192) == 8192) {
            codedOutputStream.A(18, this.y);
        }
        for (int i2 = 0; i2 < this.z.size(); i2++) {
            codedOutputStream.M(19, this.z.get(i2));
        }
        this.unknownFields.l(codedOutputStream);
    }
}
