package com.spotify.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.playlist.proto.PlaylistPlaylistMetadata$ProtoPlaylistMetadata;
import com.spotify.playlist.proto.PlaylistPlaylistState$ProtoPlaylistOfflineState;
import java.io.IOException;

public final class PlaylistPlaylistRequest$ProtoPlaylistHeader extends GeneratedMessageLite<PlaylistPlaylistRequest$ProtoPlaylistHeader, a> implements Object {
    private static final PlaylistPlaylistRequest$ProtoPlaylistHeader f;
    private static volatile x<PlaylistPlaylistRequest$ProtoPlaylistHeader> n;
    private int a;
    private PlaylistPlaylistMetadata$ProtoPlaylistMetadata b;
    private PlaylistPlaylistState$ProtoPlaylistOfflineState c;

    public static final class a extends GeneratedMessageLite.b<PlaylistPlaylistRequest$ProtoPlaylistHeader, a> implements Object {
        private a() {
            super(PlaylistPlaylistRequest$ProtoPlaylistHeader.f);
        }
    }

    static {
        PlaylistPlaylistRequest$ProtoPlaylistHeader playlistPlaylistRequest$ProtoPlaylistHeader = new PlaylistPlaylistRequest$ProtoPlaylistHeader();
        f = playlistPlaylistRequest$ProtoPlaylistHeader;
        playlistPlaylistRequest$ProtoPlaylistHeader.makeImmutable();
    }

    private PlaylistPlaylistRequest$ProtoPlaylistHeader() {
    }

    public static PlaylistPlaylistRequest$ProtoPlaylistHeader h() {
        return f;
    }

    public static x<PlaylistPlaylistRequest$ProtoPlaylistHeader> parser() {
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
                PlaylistPlaylistRequest$ProtoPlaylistHeader playlistPlaylistRequest$ProtoPlaylistHeader = (PlaylistPlaylistRequest$ProtoPlaylistHeader) obj2;
                this.b = (PlaylistPlaylistMetadata$ProtoPlaylistMetadata) hVar.i(this.b, playlistPlaylistRequest$ProtoPlaylistHeader.b);
                this.c = (PlaylistPlaylistState$ProtoPlaylistOfflineState) hVar.i(this.c, playlistPlaylistRequest$ProtoPlaylistHeader.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= playlistPlaylistRequest$ProtoPlaylistHeader.a;
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
                                PlaylistPlaylistMetadata$ProtoPlaylistMetadata.a aVar = (this.a & 1) == 1 ? (PlaylistPlaylistMetadata$ProtoPlaylistMetadata.a) this.b.toBuilder() : null;
                                PlaylistPlaylistMetadata$ProtoPlaylistMetadata playlistPlaylistMetadata$ProtoPlaylistMetadata = (PlaylistPlaylistMetadata$ProtoPlaylistMetadata) gVar.o(PlaylistPlaylistMetadata$ProtoPlaylistMetadata.parser(), kVar);
                                this.b = playlistPlaylistMetadata$ProtoPlaylistMetadata;
                                if (aVar != null) {
                                    aVar.mergeFrom((PlaylistPlaylistMetadata$ProtoPlaylistMetadata.a) playlistPlaylistMetadata$ProtoPlaylistMetadata);
                                    this.b = (PlaylistPlaylistMetadata$ProtoPlaylistMetadata) aVar.buildPartial();
                                }
                                this.a |= 1;
                            } else if (B == 18) {
                                PlaylistPlaylistState$ProtoPlaylistOfflineState.a aVar2 = (this.a & 2) == 2 ? (PlaylistPlaylistState$ProtoPlaylistOfflineState.a) this.c.toBuilder() : null;
                                PlaylistPlaylistState$ProtoPlaylistOfflineState playlistPlaylistState$ProtoPlaylistOfflineState = (PlaylistPlaylistState$ProtoPlaylistOfflineState) gVar.o(PlaylistPlaylistState$ProtoPlaylistOfflineState.parser(), kVar);
                                this.c = playlistPlaylistState$ProtoPlaylistOfflineState;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((PlaylistPlaylistState$ProtoPlaylistOfflineState.a) playlistPlaylistState$ProtoPlaylistOfflineState);
                                    this.c = (PlaylistPlaylistState$ProtoPlaylistOfflineState) aVar2.buildPartial();
                                }
                                this.a |= 2;
                            } else if (!parseUnknownField(B, gVar)) {
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
                return new PlaylistPlaylistRequest$ProtoPlaylistHeader();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (PlaylistPlaylistRequest$ProtoPlaylistHeader.class) {
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
        int i2 = 0;
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.n(1, i());
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.n(2, l());
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public PlaylistPlaylistMetadata$ProtoPlaylistMetadata i() {
        PlaylistPlaylistMetadata$ProtoPlaylistMetadata playlistPlaylistMetadata$ProtoPlaylistMetadata = this.b;
        return playlistPlaylistMetadata$ProtoPlaylistMetadata == null ? PlaylistPlaylistMetadata$ProtoPlaylistMetadata.m() : playlistPlaylistMetadata$ProtoPlaylistMetadata;
    }

    public PlaylistPlaylistState$ProtoPlaylistOfflineState l() {
        PlaylistPlaylistState$ProtoPlaylistOfflineState playlistPlaylistState$ProtoPlaylistOfflineState = this.c;
        return playlistPlaylistState$ProtoPlaylistOfflineState == null ? PlaylistPlaylistState$ProtoPlaylistOfflineState.h() : playlistPlaylistState$ProtoPlaylistOfflineState;
    }

    public boolean m() {
        return (this.a & 1) == 1;
    }

    public boolean n() {
        return (this.a & 2) == 2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.M(1, i());
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.M(2, l());
        }
        this.unknownFields.l(codedOutputStream);
    }
}
