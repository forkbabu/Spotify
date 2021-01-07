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

public final class PlaylistRootlistRequest$ProtoPlaylistRootPlaylist extends GeneratedMessageLite<PlaylistRootlistRequest$ProtoPlaylistRootPlaylist, a> implements Object {
    private static final PlaylistRootlistRequest$ProtoPlaylistRootPlaylist q;
    private static volatile x<PlaylistRootlistRequest$ProtoPlaylistRootPlaylist> r;
    private int a;
    private String b = "";
    private PlaylistPlaylistMetadata$ProtoPlaylistMetadata c;
    private PlaylistPlaylistState$ProtoPlaylistOfflineState f;
    private int n;
    private boolean o;
    private String p = "";

    public static final class a extends GeneratedMessageLite.b<PlaylistRootlistRequest$ProtoPlaylistRootPlaylist, a> implements Object {
        private a() {
            super(PlaylistRootlistRequest$ProtoPlaylistRootPlaylist.q);
        }
    }

    static {
        PlaylistRootlistRequest$ProtoPlaylistRootPlaylist playlistRootlistRequest$ProtoPlaylistRootPlaylist = new PlaylistRootlistRequest$ProtoPlaylistRootPlaylist();
        q = playlistRootlistRequest$ProtoPlaylistRootPlaylist;
        playlistRootlistRequest$ProtoPlaylistRootPlaylist.makeImmutable();
    }

    private PlaylistRootlistRequest$ProtoPlaylistRootPlaylist() {
    }

    public static PlaylistRootlistRequest$ProtoPlaylistRootPlaylist i() {
        return q;
    }

    public static x<PlaylistRootlistRequest$ProtoPlaylistRootPlaylist> parser() {
        return q.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return q;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PlaylistRootlistRequest$ProtoPlaylistRootPlaylist playlistRootlistRequest$ProtoPlaylistRootPlaylist = (PlaylistRootlistRequest$ProtoPlaylistRootPlaylist) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (playlistRootlistRequest$ProtoPlaylistRootPlaylist.a & 1) == 1, playlistRootlistRequest$ProtoPlaylistRootPlaylist.b);
                this.c = (PlaylistPlaylistMetadata$ProtoPlaylistMetadata) hVar.i(this.c, playlistRootlistRequest$ProtoPlaylistRootPlaylist.c);
                this.f = (PlaylistPlaylistState$ProtoPlaylistOfflineState) hVar.i(this.f, playlistRootlistRequest$ProtoPlaylistRootPlaylist.f);
                this.n = hVar.m((this.a & 8) == 8, this.n, (playlistRootlistRequest$ProtoPlaylistRootPlaylist.a & 8) == 8, playlistRootlistRequest$ProtoPlaylistRootPlaylist.n);
                this.o = hVar.f(q(), this.o, playlistRootlistRequest$ProtoPlaylistRootPlaylist.q(), playlistRootlistRequest$ProtoPlaylistRootPlaylist.o);
                boolean z2 = (this.a & 32) == 32;
                String str = this.p;
                if ((playlistRootlistRequest$ProtoPlaylistRootPlaylist.a & 32) == 32) {
                    z = true;
                }
                this.p = hVar.n(z2, str, z, playlistRootlistRequest$ProtoPlaylistRootPlaylist.p);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= playlistRootlistRequest$ProtoPlaylistRootPlaylist.a;
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
                                String z3 = gVar.z();
                                this.a |= 1;
                                this.b = z3;
                            } else if (B == 18) {
                                PlaylistPlaylistMetadata$ProtoPlaylistMetadata.a aVar = (this.a & 2) == 2 ? (PlaylistPlaylistMetadata$ProtoPlaylistMetadata.a) this.c.toBuilder() : null;
                                PlaylistPlaylistMetadata$ProtoPlaylistMetadata playlistPlaylistMetadata$ProtoPlaylistMetadata = (PlaylistPlaylistMetadata$ProtoPlaylistMetadata) gVar.o(PlaylistPlaylistMetadata$ProtoPlaylistMetadata.parser(), kVar);
                                this.c = playlistPlaylistMetadata$ProtoPlaylistMetadata;
                                if (aVar != null) {
                                    aVar.mergeFrom((PlaylistPlaylistMetadata$ProtoPlaylistMetadata.a) playlistPlaylistMetadata$ProtoPlaylistMetadata);
                                    this.c = (PlaylistPlaylistMetadata$ProtoPlaylistMetadata) aVar.buildPartial();
                                }
                                this.a |= 2;
                            } else if (B == 26) {
                                PlaylistPlaylistState$ProtoPlaylistOfflineState.a aVar2 = (this.a & 4) == 4 ? (PlaylistPlaylistState$ProtoPlaylistOfflineState.a) this.f.toBuilder() : null;
                                PlaylistPlaylistState$ProtoPlaylistOfflineState playlistPlaylistState$ProtoPlaylistOfflineState = (PlaylistPlaylistState$ProtoPlaylistOfflineState) gVar.o(PlaylistPlaylistState$ProtoPlaylistOfflineState.parser(), kVar);
                                this.f = playlistPlaylistState$ProtoPlaylistOfflineState;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((PlaylistPlaylistState$ProtoPlaylistOfflineState.a) playlistPlaylistState$ProtoPlaylistOfflineState);
                                    this.f = (PlaylistPlaylistState$ProtoPlaylistOfflineState) aVar2.buildPartial();
                                }
                                this.a |= 4;
                            } else if (B == 32) {
                                this.a |= 8;
                                this.n = gVar.u();
                            } else if (B == 40) {
                                this.a |= 16;
                                this.o = gVar.h();
                            } else if (B == 50) {
                                String z4 = gVar.z();
                                this.a |= 32;
                                this.p = z4;
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
                return new PlaylistRootlistRequest$ProtoPlaylistRootPlaylist();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (r == null) {
                    synchronized (PlaylistRootlistRequest$ProtoPlaylistRootPlaylist.class) {
                        if (r == null) {
                            r = new GeneratedMessageLite.c(q);
                        }
                    }
                }
                return r;
            default:
                throw new UnsupportedOperationException();
        }
        return q;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.p(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.n(2, n());
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.n(3, o());
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.s(4, this.n);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.d(5, this.o);
        }
        if ((this.a & 32) == 32) {
            i2 += CodedOutputStream.p(6, this.p);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public int h() {
        return this.n;
    }

    public String l() {
        return this.p;
    }

    public boolean m() {
        return this.o;
    }

    public PlaylistPlaylistMetadata$ProtoPlaylistMetadata n() {
        PlaylistPlaylistMetadata$ProtoPlaylistMetadata playlistPlaylistMetadata$ProtoPlaylistMetadata = this.c;
        return playlistPlaylistMetadata$ProtoPlaylistMetadata == null ? PlaylistPlaylistMetadata$ProtoPlaylistMetadata.m() : playlistPlaylistMetadata$ProtoPlaylistMetadata;
    }

    public PlaylistPlaylistState$ProtoPlaylistOfflineState o() {
        PlaylistPlaylistState$ProtoPlaylistOfflineState playlistPlaylistState$ProtoPlaylistOfflineState = this.f;
        return playlistPlaylistState$ProtoPlaylistOfflineState == null ? PlaylistPlaylistState$ProtoPlaylistOfflineState.h() : playlistPlaylistState$ProtoPlaylistOfflineState;
    }

    public String p() {
        return this.b;
    }

    public boolean q() {
        return (this.a & 16) == 16;
    }

    public boolean r() {
        return (this.a & 2) == 2;
    }

    public boolean s() {
        return (this.a & 4) == 4;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.P(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.M(2, n());
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.M(3, o());
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.S(4, this.n);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.A(5, this.o);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.P(6, this.p);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
