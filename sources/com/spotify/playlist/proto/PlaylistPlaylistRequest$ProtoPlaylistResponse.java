package com.spotify.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.playlist.proto.PlaylistPlaylistRequest$Collaborators;
import com.spotify.playlist.proto.PlaylistPlaylistRequest$ProtoPlaylistHeader;
import java.io.IOException;
import java.util.List;

public final class PlaylistPlaylistRequest$ProtoPlaylistResponse extends GeneratedMessageLite<PlaylistPlaylistRequest$ProtoPlaylistResponse, a> implements Object {
    private static final PlaylistPlaylistRequest$ProtoPlaylistResponse G;
    private static volatile x<PlaylistPlaylistRequest$ProtoPlaylistResponse> H;
    private boolean A;
    private int B;
    private int C;
    private boolean D;
    private int E;
    private PlaylistPlaylistRequest$Collaborators F;
    private int a;
    private o.i<PlaylistPlaylistRequest$ProtoPlaylistItem> b = GeneratedMessageLite.emptyProtobufList();
    private PlaylistPlaylistRequest$ProtoPlaylistHeader c;
    private int f;
    private int n;
    private long o;
    private boolean p;
    private long q;
    private int r;
    private boolean s;
    private o.i<PlaylistPlaylistRequest$ProtoRecommendationItem> t = GeneratedMessageLite.emptyProtobufList();
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public static final class a extends GeneratedMessageLite.b<PlaylistPlaylistRequest$ProtoPlaylistResponse, a> implements Object {
        private a() {
            super(PlaylistPlaylistRequest$ProtoPlaylistResponse.G);
        }
    }

    static {
        PlaylistPlaylistRequest$ProtoPlaylistResponse playlistPlaylistRequest$ProtoPlaylistResponse = new PlaylistPlaylistRequest$ProtoPlaylistResponse();
        G = playlistPlaylistRequest$ProtoPlaylistResponse;
        playlistPlaylistRequest$ProtoPlaylistResponse.makeImmutable();
    }

    private PlaylistPlaylistRequest$ProtoPlaylistResponse() {
    }

    public static PlaylistPlaylistRequest$ProtoPlaylistResponse n() {
        return G;
    }

    public static x<PlaylistPlaylistRequest$ProtoPlaylistResponse> parser() {
        return G.getParserForType();
    }

    public List<PlaylistPlaylistRequest$ProtoRecommendationItem> A() {
        return this.t;
    }

    public int B() {
        return this.f;
    }

    public int C() {
        return this.n;
    }

    public boolean D() {
        return (this.a & 16384) == 16384;
    }

    public boolean E() {
        return (this.a & 262144) == 262144;
    }

    public boolean F() {
        return (this.a & 128) == 128;
    }

    public boolean G() {
        return (this.a & 1) == 1;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return G;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PlaylistPlaylistRequest$ProtoPlaylistResponse playlistPlaylistRequest$ProtoPlaylistResponse = (PlaylistPlaylistRequest$ProtoPlaylistResponse) obj2;
                this.b = hVar.q(this.b, playlistPlaylistRequest$ProtoPlaylistResponse.b);
                this.c = (PlaylistPlaylistRequest$ProtoPlaylistHeader) hVar.i(this.c, playlistPlaylistRequest$ProtoPlaylistResponse.c);
                this.f = hVar.m((this.a & 2) == 2, this.f, (playlistPlaylistRequest$ProtoPlaylistResponse.a & 2) == 2, playlistPlaylistRequest$ProtoPlaylistResponse.f);
                this.n = hVar.m((this.a & 4) == 4, this.n, (playlistPlaylistRequest$ProtoPlaylistResponse.a & 4) == 4, playlistPlaylistRequest$ProtoPlaylistResponse.n);
                this.o = hVar.s((this.a & 8) == 8, this.o, (playlistPlaylistRequest$ProtoPlaylistResponse.a & 8) == 8, playlistPlaylistRequest$ProtoPlaylistResponse.o);
                this.p = hVar.f((this.a & 16) == 16, this.p, (playlistPlaylistRequest$ProtoPlaylistResponse.a & 16) == 16, playlistPlaylistRequest$ProtoPlaylistResponse.p);
                this.q = hVar.s((this.a & 32) == 32, this.q, (playlistPlaylistRequest$ProtoPlaylistResponse.a & 32) == 32, playlistPlaylistRequest$ProtoPlaylistResponse.q);
                this.r = hVar.m((this.a & 64) == 64, this.r, (playlistPlaylistRequest$ProtoPlaylistResponse.a & 64) == 64, playlistPlaylistRequest$ProtoPlaylistResponse.r);
                this.s = hVar.f(F(), this.s, playlistPlaylistRequest$ProtoPlaylistResponse.F(), playlistPlaylistRequest$ProtoPlaylistResponse.s);
                this.t = hVar.q(this.t, playlistPlaylistRequest$ProtoPlaylistResponse.t);
                this.u = hVar.f((this.a & 256) == 256, this.u, (playlistPlaylistRequest$ProtoPlaylistResponse.a & 256) == 256, playlistPlaylistRequest$ProtoPlaylistResponse.u);
                this.v = hVar.f((this.a & 512) == 512, this.v, (playlistPlaylistRequest$ProtoPlaylistResponse.a & 512) == 512, playlistPlaylistRequest$ProtoPlaylistResponse.v);
                this.w = hVar.f((this.a & 1024) == 1024, this.w, (playlistPlaylistRequest$ProtoPlaylistResponse.a & 1024) == 1024, playlistPlaylistRequest$ProtoPlaylistResponse.w);
                this.x = hVar.f((this.a & 2048) == 2048, this.x, (playlistPlaylistRequest$ProtoPlaylistResponse.a & 2048) == 2048, playlistPlaylistRequest$ProtoPlaylistResponse.x);
                this.y = hVar.f((this.a & 4096) == 4096, this.y, (playlistPlaylistRequest$ProtoPlaylistResponse.a & 4096) == 4096, playlistPlaylistRequest$ProtoPlaylistResponse.y);
                this.z = hVar.f((this.a & 8192) == 8192, this.z, (playlistPlaylistRequest$ProtoPlaylistResponse.a & 8192) == 8192, playlistPlaylistRequest$ProtoPlaylistResponse.z);
                this.A = hVar.f(D(), this.A, playlistPlaylistRequest$ProtoPlaylistResponse.D(), playlistPlaylistRequest$ProtoPlaylistResponse.A);
                this.B = hVar.m((this.a & 32768) == 32768, this.B, (playlistPlaylistRequest$ProtoPlaylistResponse.a & 32768) == 32768, playlistPlaylistRequest$ProtoPlaylistResponse.B);
                this.C = hVar.m((this.a & 65536) == 65536, this.C, (playlistPlaylistRequest$ProtoPlaylistResponse.a & 65536) == 65536, playlistPlaylistRequest$ProtoPlaylistResponse.C);
                this.D = hVar.f((this.a & 131072) == 131072, this.D, (playlistPlaylistRequest$ProtoPlaylistResponse.a & 131072) == 131072, playlistPlaylistRequest$ProtoPlaylistResponse.D);
                this.E = hVar.m(E(), this.E, playlistPlaylistRequest$ProtoPlaylistResponse.E(), playlistPlaylistRequest$ProtoPlaylistResponse.E);
                this.F = (PlaylistPlaylistRequest$Collaborators) hVar.i(this.F, playlistPlaylistRequest$ProtoPlaylistResponse.F);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= playlistPlaylistRequest$ProtoPlaylistResponse.a;
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
                                if (!this.b.R0()) {
                                    this.b = GeneratedMessageLite.mutableCopy(this.b);
                                }
                                this.b.add(gVar.o(PlaylistPlaylistRequest$ProtoPlaylistItem.parser(), kVar));
                                break;
                            case 18:
                                PlaylistPlaylistRequest$ProtoPlaylistHeader.a aVar = (this.a & 1) == 1 ? (PlaylistPlaylistRequest$ProtoPlaylistHeader.a) this.c.toBuilder() : null;
                                PlaylistPlaylistRequest$ProtoPlaylistHeader playlistPlaylistRequest$ProtoPlaylistHeader = (PlaylistPlaylistRequest$ProtoPlaylistHeader) gVar.o(PlaylistPlaylistRequest$ProtoPlaylistHeader.parser(), kVar);
                                this.c = playlistPlaylistRequest$ProtoPlaylistHeader;
                                if (aVar != null) {
                                    aVar.mergeFrom((PlaylistPlaylistRequest$ProtoPlaylistHeader.a) playlistPlaylistRequest$ProtoPlaylistHeader);
                                    this.c = (PlaylistPlaylistRequest$ProtoPlaylistHeader) aVar.buildPartial();
                                }
                                this.a |= 1;
                                break;
                            case 24:
                                this.a |= 2;
                                this.f = gVar.u();
                                break;
                            case 32:
                                this.a |= 4;
                                this.n = gVar.u();
                                break;
                            case 40:
                                this.a |= 8;
                                this.o = gVar.w();
                                break;
                            case 48:
                                this.a |= 16;
                                this.p = gVar.h();
                                break;
                            case 56:
                                this.a |= 32;
                                this.q = gVar.w();
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
                                if (!this.t.R0()) {
                                    this.t = GeneratedMessageLite.mutableCopy(this.t);
                                }
                                this.t.add(gVar.o(PlaylistPlaylistRequest$ProtoRecommendationItem.parser(), kVar));
                                break;
                            case 88:
                                this.a |= 256;
                                this.u = gVar.h();
                                break;
                            case 96:
                                this.a |= 512;
                                this.v = gVar.h();
                                break;
                            case 104:
                                this.a |= 1024;
                                this.w = gVar.h();
                                break;
                            case 112:
                                this.a |= 2048;
                                this.x = gVar.h();
                                break;
                            case 120:
                                this.a |= 4096;
                                this.y = gVar.h();
                                break;
                            case 128:
                                this.a |= 8192;
                                this.z = gVar.h();
                                break;
                            case 136:
                                this.a |= 16384;
                                this.A = gVar.h();
                                break;
                            case 144:
                                this.a |= 32768;
                                this.B = gVar.u();
                                break;
                            case 152:
                                this.a |= 65536;
                                this.C = gVar.u();
                                break;
                            case 160:
                                this.a |= 131072;
                                this.D = gVar.h();
                                break;
                            case 168:
                                int u2 = gVar.u();
                                if (OnDemandInFreeReason.d(u2) == null) {
                                    super.mergeVarintField(21, u2);
                                } else {
                                    this.a |= 262144;
                                    this.E = u2;
                                }
                                break;
                            case 178:
                                PlaylistPlaylistRequest$Collaborators.a aVar2 = (this.a & 524288) == 524288 ? (PlaylistPlaylistRequest$Collaborators.a) this.F.toBuilder() : null;
                                PlaylistPlaylistRequest$Collaborators playlistPlaylistRequest$Collaborators = (PlaylistPlaylistRequest$Collaborators) gVar.o(PlaylistPlaylistRequest$Collaborators.parser(), kVar);
                                this.F = playlistPlaylistRequest$Collaborators;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((PlaylistPlaylistRequest$Collaborators.a) playlistPlaylistRequest$Collaborators);
                                    this.F = (PlaylistPlaylistRequest$Collaborators) aVar2.buildPartial();
                                }
                                this.a |= 524288;
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
                this.b.C();
                this.t.C();
                return null;
            case 4:
                return new PlaylistPlaylistRequest$ProtoPlaylistResponse();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (H == null) {
                    synchronized (PlaylistPlaylistRequest$ProtoPlaylistResponse.class) {
                        if (H == null) {
                            H = new GeneratedMessageLite.c(G);
                        }
                    }
                }
                return H;
            default:
                throw new UnsupportedOperationException();
        }
        return G;
    }

    public boolean getPlayable() {
        return this.s;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            i2 += CodedOutputStream.n(1, this.b.get(i3));
        }
        if ((this.a & 1) == 1) {
            i2 += CodedOutputStream.n(2, y());
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.s(3, this.f);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.s(4, this.n);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.u(5, this.o);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.d(6, this.p);
        }
        if ((this.a & 32) == 32) {
            i2 += CodedOutputStream.u(7, this.q);
        }
        if ((this.a & 64) == 64) {
            i2 += CodedOutputStream.s(8, this.r);
        }
        if ((this.a & 128) == 128) {
            i2 += CodedOutputStream.d(9, this.s);
        }
        for (int i4 = 0; i4 < this.t.size(); i4++) {
            i2 += CodedOutputStream.n(10, this.t.get(i4));
        }
        if ((this.a & 256) == 256) {
            i2 += CodedOutputStream.d(11, this.u);
        }
        if ((this.a & 512) == 512) {
            i2 += CodedOutputStream.d(12, this.v);
        }
        if ((this.a & 1024) == 1024) {
            i2 += CodedOutputStream.d(13, this.w);
        }
        if ((this.a & 2048) == 2048) {
            i2 += CodedOutputStream.d(14, this.x);
        }
        if ((this.a & 4096) == 4096) {
            i2 += CodedOutputStream.d(15, this.y);
        }
        if ((this.a & 8192) == 8192) {
            i2 += CodedOutputStream.d(16, this.z);
        }
        if ((this.a & 16384) == 16384) {
            i2 += CodedOutputStream.d(17, this.A);
        }
        if ((this.a & 32768) == 32768) {
            i2 += CodedOutputStream.s(18, this.B);
        }
        if ((this.a & 65536) == 65536) {
            i2 += CodedOutputStream.s(19, this.C);
        }
        if ((this.a & 131072) == 131072) {
            i2 += CodedOutputStream.d(20, this.D);
        }
        if ((this.a & 262144) == 262144) {
            i2 += CodedOutputStream.h(21, this.E);
        }
        if ((this.a & 524288) == 524288) {
            i2 += CodedOutputStream.n(22, h());
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public PlaylistPlaylistRequest$Collaborators h() {
        PlaylistPlaylistRequest$Collaborators playlistPlaylistRequest$Collaborators = this.F;
        return playlistPlaylistRequest$Collaborators == null ? PlaylistPlaylistRequest$Collaborators.l() : playlistPlaylistRequest$Collaborators;
    }

    public boolean i() {
        return this.y;
    }

    public boolean l() {
        return this.w;
    }

    public boolean m() {
        return this.z;
    }

    public long o() {
        return this.o;
    }

    public boolean p() {
        return this.u;
    }

    public boolean q() {
        return this.A;
    }

    public List<PlaylistPlaylistRequest$ProtoPlaylistItem> r() {
        return this.b;
    }

    public long s() {
        return this.q;
    }

    public boolean t() {
        return this.p;
    }

    public int u() {
        return this.r;
    }

    public int v() {
        return this.C;
    }

    public int w() {
        return this.B;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.b.size(); i++) {
            codedOutputStream.M(1, this.b.get(i));
        }
        if ((this.a & 1) == 1) {
            codedOutputStream.M(2, y());
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.S(3, this.f);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.S(4, this.n);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.U(5, this.o);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.A(6, this.p);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.U(7, this.q);
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.S(8, this.r);
        }
        if ((this.a & 128) == 128) {
            codedOutputStream.A(9, this.s);
        }
        for (int i2 = 0; i2 < this.t.size(); i2++) {
            codedOutputStream.M(10, this.t.get(i2));
        }
        if ((this.a & 256) == 256) {
            codedOutputStream.A(11, this.u);
        }
        if ((this.a & 512) == 512) {
            codedOutputStream.A(12, this.v);
        }
        if ((this.a & 1024) == 1024) {
            codedOutputStream.A(13, this.w);
        }
        if ((this.a & 2048) == 2048) {
            codedOutputStream.A(14, this.x);
        }
        if ((this.a & 4096) == 4096) {
            codedOutputStream.A(15, this.y);
        }
        if ((this.a & 8192) == 8192) {
            codedOutputStream.A(16, this.z);
        }
        if ((this.a & 16384) == 16384) {
            codedOutputStream.A(17, this.A);
        }
        if ((this.a & 32768) == 32768) {
            codedOutputStream.S(18, this.B);
        }
        if ((this.a & 65536) == 65536) {
            codedOutputStream.S(19, this.C);
        }
        if ((this.a & 131072) == 131072) {
            codedOutputStream.A(20, this.D);
        }
        if ((this.a & 262144) == 262144) {
            codedOutputStream.K(21, this.E);
        }
        if ((this.a & 524288) == 524288) {
            codedOutputStream.M(22, h());
        }
        this.unknownFields.l(codedOutputStream);
    }

    public OnDemandInFreeReason x() {
        OnDemandInFreeReason d = OnDemandInFreeReason.d(this.E);
        return d == null ? OnDemandInFreeReason.UNKNOWN : d;
    }

    public PlaylistPlaylistRequest$ProtoPlaylistHeader y() {
        PlaylistPlaylistRequest$ProtoPlaylistHeader playlistPlaylistRequest$ProtoPlaylistHeader = this.c;
        return playlistPlaylistRequest$ProtoPlaylistHeader == null ? PlaylistPlaylistRequest$ProtoPlaylistHeader.h() : playlistPlaylistRequest$ProtoPlaylistHeader;
    }

    public boolean z() {
        return this.D;
    }
}
