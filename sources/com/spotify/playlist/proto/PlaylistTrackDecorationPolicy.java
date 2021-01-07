package com.spotify.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.cosmos.util.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.proto.TrackDecorationPolicy;
import com.spotify.playlist.proto.PlaylistAlbumDecorationPolicy;
import com.spotify.playlist.proto.UserDecorationPolicy;
import java.io.IOException;

public final class PlaylistTrackDecorationPolicy extends GeneratedMessageLite<PlaylistTrackDecorationPolicy, b> implements Object {
    private static final PlaylistTrackDecorationPolicy x;
    private static volatile x<PlaylistTrackDecorationPolicy> y;
    private TrackDecorationPolicy a;
    private boolean b;
    private boolean c;
    private boolean f;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private UserDecorationPolicy u;
    private PlaylistAlbumDecorationPolicy v;
    private ArtistDecorationPolicy w;

    public static final class b extends GeneratedMessageLite.b<PlaylistTrackDecorationPolicy, b> implements Object {
        private b() {
            super(PlaylistTrackDecorationPolicy.x);
        }
    }

    static {
        PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy = new PlaylistTrackDecorationPolicy();
        x = playlistTrackDecorationPolicy;
        playlistTrackDecorationPolicy.makeImmutable();
    }

    private PlaylistTrackDecorationPolicy() {
    }

    public static x<PlaylistTrackDecorationPolicy> parser() {
        return x.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return x;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy = (PlaylistTrackDecorationPolicy) obj2;
                this.a = (TrackDecorationPolicy) hVar.i(this.a, playlistTrackDecorationPolicy.a);
                boolean z = this.b;
                boolean z2 = playlistTrackDecorationPolicy.b;
                this.b = hVar.f(z, z, z2, z2);
                boolean z3 = this.c;
                boolean z4 = playlistTrackDecorationPolicy.c;
                this.c = hVar.f(z3, z3, z4, z4);
                boolean z5 = this.f;
                boolean z6 = playlistTrackDecorationPolicy.f;
                this.f = hVar.f(z5, z5, z6, z6);
                boolean z7 = this.n;
                boolean z8 = playlistTrackDecorationPolicy.n;
                this.n = hVar.f(z7, z7, z8, z8);
                boolean z9 = this.o;
                boolean z10 = playlistTrackDecorationPolicy.o;
                this.o = hVar.f(z9, z9, z10, z10);
                boolean z11 = this.p;
                boolean z12 = playlistTrackDecorationPolicy.p;
                this.p = hVar.f(z11, z11, z12, z12);
                boolean z13 = this.q;
                boolean z14 = playlistTrackDecorationPolicy.q;
                this.q = hVar.f(z13, z13, z14, z14);
                boolean z15 = this.r;
                boolean z16 = playlistTrackDecorationPolicy.r;
                this.r = hVar.f(z15, z15, z16, z16);
                boolean z17 = this.s;
                boolean z18 = playlistTrackDecorationPolicy.s;
                this.s = hVar.f(z17, z17, z18, z18);
                boolean z19 = this.t;
                boolean z20 = playlistTrackDecorationPolicy.t;
                this.t = hVar.f(z19, z19, z20, z20);
                this.u = (UserDecorationPolicy) hVar.i(this.u, playlistTrackDecorationPolicy.u);
                this.v = (PlaylistAlbumDecorationPolicy) hVar.i(this.v, playlistTrackDecorationPolicy.v);
                this.w = (ArtistDecorationPolicy) hVar.i(this.w, playlistTrackDecorationPolicy.w);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z21 = false;
                while (!z21) {
                    try {
                        int B = gVar.B();
                        switch (B) {
                            case 0:
                                break;
                            case 10:
                                TrackDecorationPolicy trackDecorationPolicy = this.a;
                                TrackDecorationPolicy.Builder builder = trackDecorationPolicy != null ? (TrackDecorationPolicy.Builder) trackDecorationPolicy.toBuilder() : null;
                                TrackDecorationPolicy trackDecorationPolicy2 = (TrackDecorationPolicy) gVar.o(TrackDecorationPolicy.parser(), kVar);
                                this.a = trackDecorationPolicy2;
                                if (builder != null) {
                                    builder.mergeFrom((TrackDecorationPolicy.Builder) trackDecorationPolicy2);
                                    this.a = (TrackDecorationPolicy) builder.buildPartial();
                                } else {
                                    continue;
                                }
                            case 16:
                                this.b = gVar.h();
                                continue;
                            case 24:
                                this.c = gVar.h();
                                continue;
                            case 32:
                                this.f = gVar.h();
                                continue;
                            case 40:
                                this.n = gVar.h();
                                continue;
                            case 48:
                                this.o = gVar.h();
                                continue;
                            case 56:
                                this.p = gVar.h();
                                continue;
                            case 64:
                                this.q = gVar.h();
                                continue;
                            case 72:
                                this.r = gVar.h();
                                continue;
                            case 80:
                                this.s = gVar.h();
                                continue;
                            case 88:
                                this.t = gVar.h();
                                continue;
                            case 98:
                                UserDecorationPolicy userDecorationPolicy = this.u;
                                UserDecorationPolicy.b bVar = userDecorationPolicy != null ? (UserDecorationPolicy.b) userDecorationPolicy.toBuilder() : null;
                                UserDecorationPolicy userDecorationPolicy2 = (UserDecorationPolicy) gVar.o(UserDecorationPolicy.parser(), kVar);
                                this.u = userDecorationPolicy2;
                                if (bVar != null) {
                                    bVar.mergeFrom((UserDecorationPolicy.b) userDecorationPolicy2);
                                    this.u = (UserDecorationPolicy) bVar.buildPartial();
                                } else {
                                    continue;
                                }
                            case 106:
                                PlaylistAlbumDecorationPolicy playlistAlbumDecorationPolicy = this.v;
                                PlaylistAlbumDecorationPolicy.b bVar2 = playlistAlbumDecorationPolicy != null ? (PlaylistAlbumDecorationPolicy.b) playlistAlbumDecorationPolicy.toBuilder() : null;
                                PlaylistAlbumDecorationPolicy playlistAlbumDecorationPolicy2 = (PlaylistAlbumDecorationPolicy) gVar.o(PlaylistAlbumDecorationPolicy.parser(), kVar);
                                this.v = playlistAlbumDecorationPolicy2;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((PlaylistAlbumDecorationPolicy.b) playlistAlbumDecorationPolicy2);
                                    this.v = (PlaylistAlbumDecorationPolicy) bVar2.buildPartial();
                                } else {
                                    continue;
                                }
                            case 114:
                                ArtistDecorationPolicy artistDecorationPolicy = this.w;
                                ArtistDecorationPolicy.Builder builder2 = artistDecorationPolicy != null ? (ArtistDecorationPolicy.Builder) artistDecorationPolicy.toBuilder() : null;
                                ArtistDecorationPolicy artistDecorationPolicy2 = (ArtistDecorationPolicy) gVar.o(ArtistDecorationPolicy.parser(), kVar);
                                this.w = artistDecorationPolicy2;
                                if (builder2 != null) {
                                    builder2.mergeFrom((ArtistDecorationPolicy.Builder) artistDecorationPolicy2);
                                    this.w = (ArtistDecorationPolicy) builder2.buildPartial();
                                } else {
                                    continue;
                                }
                            default:
                                if (gVar.F(B)) {
                                    continue;
                                }
                                break;
                        }
                        z21 = true;
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
                return new PlaylistTrackDecorationPolicy();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (y == null) {
                    synchronized (PlaylistTrackDecorationPolicy.class) {
                        if (y == null) {
                            y = new GeneratedMessageLite.c(x);
                        }
                    }
                }
                return y;
            default:
                throw new UnsupportedOperationException();
        }
        return x;
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
        boolean z = this.b;
        if (z) {
            i2 += CodedOutputStream.d(2, z);
        }
        boolean z2 = this.c;
        if (z2) {
            i2 += CodedOutputStream.d(3, z2);
        }
        boolean z3 = this.f;
        if (z3) {
            i2 += CodedOutputStream.d(4, z3);
        }
        boolean z4 = this.n;
        if (z4) {
            i2 += CodedOutputStream.d(5, z4);
        }
        boolean z5 = this.o;
        if (z5) {
            i2 += CodedOutputStream.d(6, z5);
        }
        boolean z6 = this.p;
        if (z6) {
            i2 += CodedOutputStream.d(7, z6);
        }
        boolean z7 = this.q;
        if (z7) {
            i2 += CodedOutputStream.d(8, z7);
        }
        boolean z8 = this.r;
        if (z8) {
            i2 += CodedOutputStream.d(9, z8);
        }
        boolean z9 = this.s;
        if (z9) {
            i2 += CodedOutputStream.d(10, z9);
        }
        boolean z10 = this.t;
        if (z10) {
            i2 += CodedOutputStream.d(11, z10);
        }
        UserDecorationPolicy userDecorationPolicy = this.u;
        if (userDecorationPolicy != null) {
            i2 += CodedOutputStream.n(12, userDecorationPolicy);
        }
        PlaylistAlbumDecorationPolicy playlistAlbumDecorationPolicy = this.v;
        if (playlistAlbumDecorationPolicy != null) {
            i2 += CodedOutputStream.n(13, playlistAlbumDecorationPolicy);
        }
        ArtistDecorationPolicy artistDecorationPolicy = this.w;
        if (artistDecorationPolicy != null) {
            i2 += CodedOutputStream.n(14, artistDecorationPolicy);
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
        boolean z = this.b;
        if (z) {
            codedOutputStream.A(2, z);
        }
        boolean z2 = this.c;
        if (z2) {
            codedOutputStream.A(3, z2);
        }
        boolean z3 = this.f;
        if (z3) {
            codedOutputStream.A(4, z3);
        }
        boolean z4 = this.n;
        if (z4) {
            codedOutputStream.A(5, z4);
        }
        boolean z5 = this.o;
        if (z5) {
            codedOutputStream.A(6, z5);
        }
        boolean z6 = this.p;
        if (z6) {
            codedOutputStream.A(7, z6);
        }
        boolean z7 = this.q;
        if (z7) {
            codedOutputStream.A(8, z7);
        }
        boolean z8 = this.r;
        if (z8) {
            codedOutputStream.A(9, z8);
        }
        boolean z9 = this.s;
        if (z9) {
            codedOutputStream.A(10, z9);
        }
        boolean z10 = this.t;
        if (z10) {
            codedOutputStream.A(11, z10);
        }
        UserDecorationPolicy userDecorationPolicy = this.u;
        if (userDecorationPolicy != null) {
            codedOutputStream.M(12, userDecorationPolicy);
        }
        PlaylistAlbumDecorationPolicy playlistAlbumDecorationPolicy = this.v;
        if (playlistAlbumDecorationPolicy != null) {
            codedOutputStream.M(13, playlistAlbumDecorationPolicy);
        }
        ArtistDecorationPolicy artistDecorationPolicy = this.w;
        if (artistDecorationPolicy != null) {
            codedOutputStream.M(14, artistDecorationPolicy);
        }
    }
}
