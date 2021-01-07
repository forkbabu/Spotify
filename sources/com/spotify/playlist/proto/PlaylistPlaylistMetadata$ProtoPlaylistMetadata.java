package com.spotify.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.mobile.android.spotlets.show.proto.ImageGroup$ProtoImageGroup;
import com.spotify.playlist.proto.PlaylistUserState$ProtoUser;
import java.io.IOException;
import java.util.List;

public final class PlaylistPlaylistMetadata$ProtoPlaylistMetadata extends GeneratedMessageLite<PlaylistPlaylistMetadata$ProtoPlaylistMetadata, a> implements Object {
    private static final PlaylistPlaylistMetadata$ProtoPlaylistMetadata C;
    private static volatile x<PlaylistPlaylistMetadata$ProtoPlaylistMetadata> D;
    private boolean A;
    private PlaylistUserState$ProtoUser B;
    private int a;
    private String b = "";
    private String c = "";
    private PlaylistUserState$ProtoUser f;
    private boolean n;
    private boolean o;
    private int p;
    private String q = "";
    private ImageGroup$ProtoImageGroup r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private String x = "";
    private o.i<PlaylistPlaylistMetadata$ProtoPlaylistFormatListAttribute> y = GeneratedMessageLite.emptyProtobufList();
    private boolean z;

    public static final class a extends GeneratedMessageLite.b<PlaylistPlaylistMetadata$ProtoPlaylistMetadata, a> implements Object {
        private a() {
            super(PlaylistPlaylistMetadata$ProtoPlaylistMetadata.C);
        }
    }

    static {
        PlaylistPlaylistMetadata$ProtoPlaylistMetadata playlistPlaylistMetadata$ProtoPlaylistMetadata = new PlaylistPlaylistMetadata$ProtoPlaylistMetadata();
        C = playlistPlaylistMetadata$ProtoPlaylistMetadata;
        playlistPlaylistMetadata$ProtoPlaylistMetadata.makeImmutable();
    }

    private PlaylistPlaylistMetadata$ProtoPlaylistMetadata() {
    }

    public static PlaylistPlaylistMetadata$ProtoPlaylistMetadata m() {
        return C;
    }

    public static x<PlaylistPlaylistMetadata$ProtoPlaylistMetadata> parser() {
        return C.getParserForType();
    }

    public ImageGroup$ProtoImageGroup A() {
        ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroup = this.r;
        return imageGroup$ProtoImageGroup == null ? ImageGroup$ProtoImageGroup.h() : imageGroup$ProtoImageGroup;
    }

    public boolean B() {
        return this.t;
    }

    public int C() {
        return this.p;
    }

    public boolean D() {
        return (this.a & 65536) == 65536;
    }

    public boolean E() {
        return (this.a & 4) == 4;
    }

    public boolean F() {
        return (this.a & 128) == 128;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return C;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PlaylistPlaylistMetadata$ProtoPlaylistMetadata playlistPlaylistMetadata$ProtoPlaylistMetadata = (PlaylistPlaylistMetadata$ProtoPlaylistMetadata) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (playlistPlaylistMetadata$ProtoPlaylistMetadata.a & 1) == 1, playlistPlaylistMetadata$ProtoPlaylistMetadata.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (playlistPlaylistMetadata$ProtoPlaylistMetadata.a & 2) == 2, playlistPlaylistMetadata$ProtoPlaylistMetadata.c);
                this.f = (PlaylistUserState$ProtoUser) hVar.i(this.f, playlistPlaylistMetadata$ProtoPlaylistMetadata.f);
                this.n = hVar.f((this.a & 8) == 8, this.n, (playlistPlaylistMetadata$ProtoPlaylistMetadata.a & 8) == 8, playlistPlaylistMetadata$ProtoPlaylistMetadata.n);
                this.o = hVar.f((this.a & 16) == 16, this.o, (playlistPlaylistMetadata$ProtoPlaylistMetadata.a & 16) == 16, playlistPlaylistMetadata$ProtoPlaylistMetadata.o);
                this.p = hVar.m((this.a & 32) == 32, this.p, (playlistPlaylistMetadata$ProtoPlaylistMetadata.a & 32) == 32, playlistPlaylistMetadata$ProtoPlaylistMetadata.p);
                this.q = hVar.n((this.a & 64) == 64, this.q, (playlistPlaylistMetadata$ProtoPlaylistMetadata.a & 64) == 64, playlistPlaylistMetadata$ProtoPlaylistMetadata.q);
                this.r = (ImageGroup$ProtoImageGroup) hVar.i(this.r, playlistPlaylistMetadata$ProtoPlaylistMetadata.r);
                this.s = hVar.f((this.a & 256) == 256, this.s, (playlistPlaylistMetadata$ProtoPlaylistMetadata.a & 256) == 256, playlistPlaylistMetadata$ProtoPlaylistMetadata.s);
                this.t = hVar.f((this.a & 512) == 512, this.t, (playlistPlaylistMetadata$ProtoPlaylistMetadata.a & 512) == 512, playlistPlaylistMetadata$ProtoPlaylistMetadata.t);
                this.u = hVar.f((this.a & 1024) == 1024, this.u, (playlistPlaylistMetadata$ProtoPlaylistMetadata.a & 1024) == 1024, playlistPlaylistMetadata$ProtoPlaylistMetadata.u);
                this.v = hVar.f((this.a & 2048) == 2048, this.v, (playlistPlaylistMetadata$ProtoPlaylistMetadata.a & 2048) == 2048, playlistPlaylistMetadata$ProtoPlaylistMetadata.v);
                this.w = hVar.f((this.a & 4096) == 4096, this.w, (playlistPlaylistMetadata$ProtoPlaylistMetadata.a & 4096) == 4096, playlistPlaylistMetadata$ProtoPlaylistMetadata.w);
                this.x = hVar.n((this.a & 8192) == 8192, this.x, (playlistPlaylistMetadata$ProtoPlaylistMetadata.a & 8192) == 8192, playlistPlaylistMetadata$ProtoPlaylistMetadata.x);
                this.y = hVar.q(this.y, playlistPlaylistMetadata$ProtoPlaylistMetadata.y);
                this.z = hVar.f((this.a & 16384) == 16384, this.z, (playlistPlaylistMetadata$ProtoPlaylistMetadata.a & 16384) == 16384, playlistPlaylistMetadata$ProtoPlaylistMetadata.z);
                this.A = hVar.f((this.a & 32768) == 32768, this.A, (playlistPlaylistMetadata$ProtoPlaylistMetadata.a & 32768) == 32768, playlistPlaylistMetadata$ProtoPlaylistMetadata.A);
                this.B = (PlaylistUserState$ProtoUser) hVar.i(this.B, playlistPlaylistMetadata$ProtoPlaylistMetadata.B);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= playlistPlaylistMetadata$ProtoPlaylistMetadata.a;
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
                                break;
                            case 10:
                                String z3 = gVar.z();
                                this.a |= 1;
                                this.b = z3;
                                continue;
                            case 18:
                                String z4 = gVar.z();
                                this.a |= 2;
                                this.c = z4;
                                continue;
                            case 26:
                                PlaylistUserState$ProtoUser.a aVar = (this.a & 4) == 4 ? (PlaylistUserState$ProtoUser.a) this.f.toBuilder() : null;
                                PlaylistUserState$ProtoUser playlistUserState$ProtoUser = (PlaylistUserState$ProtoUser) gVar.o(PlaylistUserState$ProtoUser.parser(), kVar);
                                this.f = playlistUserState$ProtoUser;
                                if (aVar != null) {
                                    aVar.mergeFrom((PlaylistUserState$ProtoUser.a) playlistUserState$ProtoUser);
                                    this.f = (PlaylistUserState$ProtoUser) aVar.buildPartial();
                                }
                                this.a |= 4;
                                continue;
                            case 32:
                                this.a |= 8;
                                this.n = gVar.h();
                                continue;
                            case 40:
                                this.a |= 16;
                                this.o = gVar.h();
                                continue;
                            case 48:
                                this.a |= 32;
                                this.p = gVar.u();
                                continue;
                            case 58:
                                String z5 = gVar.z();
                                this.a |= 64;
                                this.q = z5;
                                continue;
                            case 66:
                                ImageGroup$ProtoImageGroup.a aVar2 = (this.a & 128) == 128 ? (ImageGroup$ProtoImageGroup.a) this.r.toBuilder() : null;
                                ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroup = (ImageGroup$ProtoImageGroup) gVar.o(ImageGroup$ProtoImageGroup.parser(), kVar);
                                this.r = imageGroup$ProtoImageGroup;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((ImageGroup$ProtoImageGroup.a) imageGroup$ProtoImageGroup);
                                    this.r = (ImageGroup$ProtoImageGroup) aVar2.buildPartial();
                                }
                                this.a |= 128;
                                continue;
                            case 72:
                                this.a |= 256;
                                this.s = gVar.h();
                                continue;
                            case 80:
                                this.a |= 512;
                                this.t = gVar.h();
                                continue;
                            case 88:
                                this.a |= 1024;
                                this.u = gVar.h();
                                continue;
                            case 96:
                                this.a |= 2048;
                                this.v = gVar.h();
                                continue;
                            case 104:
                                this.a |= 4096;
                                this.w = gVar.h();
                                continue;
                            case 114:
                                String z6 = gVar.z();
                                this.a |= 8192;
                                this.x = z6;
                                continue;
                            case 122:
                                if (!this.y.R0()) {
                                    this.y = GeneratedMessageLite.mutableCopy(this.y);
                                }
                                this.y.add(gVar.o(PlaylistPlaylistMetadata$ProtoPlaylistFormatListAttribute.parser(), kVar));
                                continue;
                            case 128:
                                this.a |= 16384;
                                this.z = gVar.h();
                                continue;
                            case 136:
                                this.a |= 32768;
                                this.A = gVar.h();
                                continue;
                            case 162:
                                PlaylistUserState$ProtoUser.a aVar3 = (this.a & 65536) == 65536 ? (PlaylistUserState$ProtoUser.a) this.B.toBuilder() : null;
                                PlaylistUserState$ProtoUser playlistUserState$ProtoUser2 = (PlaylistUserState$ProtoUser) gVar.o(PlaylistUserState$ProtoUser.parser(), kVar);
                                this.B = playlistUserState$ProtoUser2;
                                if (aVar3 != null) {
                                    aVar3.mergeFrom((PlaylistUserState$ProtoUser.a) playlistUserState$ProtoUser2);
                                    this.B = (PlaylistUserState$ProtoUser) aVar3.buildPartial();
                                }
                                this.a |= 65536;
                                continue;
                            default:
                                if (parseUnknownField(B2, gVar)) {
                                    continue;
                                }
                                break;
                        }
                        z2 = true;
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
                this.y.C();
                return null;
            case 4:
                return new PlaylistPlaylistMetadata$ProtoPlaylistMetadata();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (D == null) {
                    synchronized (PlaylistPlaylistMetadata$ProtoPlaylistMetadata.class) {
                        if (D == null) {
                            D = new GeneratedMessageLite.c(C);
                        }
                    }
                }
                return D;
            default:
                throw new UnsupportedOperationException();
        }
        return C;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int p2 = (this.a & 1) == 1 ? CodedOutputStream.p(1, this.b) + 0 : 0;
        if ((this.a & 2) == 2) {
            p2 += CodedOutputStream.p(2, this.c);
        }
        if ((this.a & 4) == 4) {
            p2 += CodedOutputStream.n(3, y());
        }
        if ((this.a & 8) == 8) {
            p2 += CodedOutputStream.d(4, this.n);
        }
        if ((this.a & 16) == 16) {
            p2 += CodedOutputStream.d(5, this.o);
        }
        if ((this.a & 32) == 32) {
            p2 += CodedOutputStream.s(6, this.p);
        }
        if ((this.a & 64) == 64) {
            p2 += CodedOutputStream.p(7, this.q);
        }
        if ((this.a & 128) == 128) {
            p2 += CodedOutputStream.n(8, A());
        }
        if ((this.a & 256) == 256) {
            p2 += CodedOutputStream.d(9, this.s);
        }
        if ((this.a & 512) == 512) {
            p2 += CodedOutputStream.d(10, this.t);
        }
        if ((this.a & 1024) == 1024) {
            p2 += CodedOutputStream.d(11, this.u);
        }
        if ((this.a & 2048) == 2048) {
            p2 += CodedOutputStream.d(12, this.v);
        }
        if ((this.a & 4096) == 4096) {
            p2 += CodedOutputStream.d(13, this.w);
        }
        if ((this.a & 8192) == 8192) {
            p2 += CodedOutputStream.p(14, this.x);
        }
        for (int i2 = 0; i2 < this.y.size(); i2++) {
            p2 += CodedOutputStream.n(15, this.y.get(i2));
        }
        if ((this.a & 16384) == 16384) {
            p2 += CodedOutputStream.d(16, this.z);
        }
        if ((this.a & 32768) == 32768) {
            p2 += CodedOutputStream.d(17, this.A);
        }
        if ((this.a & 65536) == 65536) {
            p2 += CodedOutputStream.n(20, v());
        }
        int c2 = this.unknownFields.c() + p2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public boolean h() {
        return this.u;
    }

    public boolean i() {
        return this.z;
    }

    public boolean l() {
        return this.o;
    }

    public String n() {
        return this.q;
    }

    public boolean o() {
        return this.v;
    }

    public boolean p() {
        return this.s;
    }

    public int q() {
        return this.y.size();
    }

    public List<PlaylistPlaylistMetadata$ProtoPlaylistFormatListAttribute> r() {
        return this.y;
    }

    public String s() {
        return this.x;
    }

    public boolean t() {
        return this.A;
    }

    public String u() {
        return this.b;
    }

    public PlaylistUserState$ProtoUser v() {
        PlaylistUserState$ProtoUser playlistUserState$ProtoUser = this.B;
        return playlistUserState$ProtoUser == null ? PlaylistUserState$ProtoUser.h() : playlistUserState$ProtoUser;
    }

    public String w() {
        return this.c;
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
            codedOutputStream.M(3, y());
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.A(4, this.n);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.A(5, this.o);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.S(6, this.p);
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.P(7, this.q);
        }
        if ((this.a & 128) == 128) {
            codedOutputStream.M(8, A());
        }
        if ((this.a & 256) == 256) {
            codedOutputStream.A(9, this.s);
        }
        if ((this.a & 512) == 512) {
            codedOutputStream.A(10, this.t);
        }
        if ((this.a & 1024) == 1024) {
            codedOutputStream.A(11, this.u);
        }
        if ((this.a & 2048) == 2048) {
            codedOutputStream.A(12, this.v);
        }
        if ((this.a & 4096) == 4096) {
            codedOutputStream.A(13, this.w);
        }
        if ((this.a & 8192) == 8192) {
            codedOutputStream.P(14, this.x);
        }
        for (int i = 0; i < this.y.size(); i++) {
            codedOutputStream.M(15, this.y.get(i));
        }
        if ((this.a & 16384) == 16384) {
            codedOutputStream.A(16, this.z);
        }
        if ((this.a & 32768) == 32768) {
            codedOutputStream.A(17, this.A);
        }
        if ((this.a & 65536) == 65536) {
            codedOutputStream.M(20, v());
        }
        this.unknownFields.l(codedOutputStream);
    }

    public boolean x() {
        return this.n;
    }

    public PlaylistUserState$ProtoUser y() {
        PlaylistUserState$ProtoUser playlistUserState$ProtoUser = this.f;
        return playlistUserState$ProtoUser == null ? PlaylistUserState$ProtoUser.h() : playlistUserState$ProtoUser;
    }

    public boolean z() {
        return this.w;
    }
}
