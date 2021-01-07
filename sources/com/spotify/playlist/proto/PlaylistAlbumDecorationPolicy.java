package com.spotify.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.cosmos.util.proto.AlbumDecorationPolicy;
import com.spotify.cosmos.util.proto.ArtistDecorationPolicy;
import java.io.IOException;

public final class PlaylistAlbumDecorationPolicy extends GeneratedMessageLite<PlaylistAlbumDecorationPolicy, b> implements Object {
    private static final PlaylistAlbumDecorationPolicy c;
    private static volatile x<PlaylistAlbumDecorationPolicy> f;
    private AlbumDecorationPolicy a;
    private ArtistDecorationPolicy b;

    public static final class b extends GeneratedMessageLite.b<PlaylistAlbumDecorationPolicy, b> implements Object {
        private b() {
            super(PlaylistAlbumDecorationPolicy.c);
        }
    }

    static {
        PlaylistAlbumDecorationPolicy playlistAlbumDecorationPolicy = new PlaylistAlbumDecorationPolicy();
        c = playlistAlbumDecorationPolicy;
        playlistAlbumDecorationPolicy.makeImmutable();
    }

    private PlaylistAlbumDecorationPolicy() {
    }

    public static x<PlaylistAlbumDecorationPolicy> parser() {
        return c.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return c;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PlaylistAlbumDecorationPolicy playlistAlbumDecorationPolicy = (PlaylistAlbumDecorationPolicy) obj2;
                this.a = (AlbumDecorationPolicy) hVar.i(this.a, playlistAlbumDecorationPolicy.a);
                this.b = (ArtistDecorationPolicy) hVar.i(this.b, playlistAlbumDecorationPolicy.b);
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
                                AlbumDecorationPolicy albumDecorationPolicy = this.a;
                                AlbumDecorationPolicy.Builder builder = albumDecorationPolicy != null ? (AlbumDecorationPolicy.Builder) albumDecorationPolicy.toBuilder() : null;
                                AlbumDecorationPolicy albumDecorationPolicy2 = (AlbumDecorationPolicy) gVar.o(AlbumDecorationPolicy.parser(), kVar);
                                this.a = albumDecorationPolicy2;
                                if (builder != null) {
                                    builder.mergeFrom((AlbumDecorationPolicy.Builder) albumDecorationPolicy2);
                                    this.a = (AlbumDecorationPolicy) builder.buildPartial();
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
                return new PlaylistAlbumDecorationPolicy();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (PlaylistAlbumDecorationPolicy.class) {
                        if (f == null) {
                            f = new GeneratedMessageLite.c(c);
                        }
                    }
                }
                return f;
            default:
                throw new UnsupportedOperationException();
        }
        return c;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        AlbumDecorationPolicy albumDecorationPolicy = this.a;
        if (albumDecorationPolicy != null) {
            i2 = 0 + CodedOutputStream.n(1, albumDecorationPolicy);
        }
        ArtistDecorationPolicy artistDecorationPolicy = this.b;
        if (artistDecorationPolicy != null) {
            i2 += CodedOutputStream.n(2, artistDecorationPolicy);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        AlbumDecorationPolicy albumDecorationPolicy = this.a;
        if (albumDecorationPolicy != null) {
            codedOutputStream.M(1, albumDecorationPolicy);
        }
        ArtistDecorationPolicy artistDecorationPolicy = this.b;
        if (artistDecorationPolicy != null) {
            codedOutputStream.M(2, artistDecorationPolicy);
        }
    }
}
