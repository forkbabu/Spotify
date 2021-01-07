package com.spotify.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.playlist.proto.PlaylistRootlistRequest$ProtoPlaylistRootFolder;
import java.io.IOException;

public final class PlaylistRootlistRequest$ProtoPlaylistRootResponse extends GeneratedMessageLite<PlaylistRootlistRequest$ProtoPlaylistRootResponse, a> implements Object {
    private static final PlaylistRootlistRequest$ProtoPlaylistRootResponse o;
    private static volatile x<PlaylistRootlistRequest$ProtoPlaylistRootResponse> p;
    private int a;
    private PlaylistRootlistRequest$ProtoPlaylistRootFolder b;
    private int c;
    private int f;
    private boolean n;

    public static final class a extends GeneratedMessageLite.b<PlaylistRootlistRequest$ProtoPlaylistRootResponse, a> implements Object {
        private a() {
            super(PlaylistRootlistRequest$ProtoPlaylistRootResponse.o);
        }
    }

    static {
        PlaylistRootlistRequest$ProtoPlaylistRootResponse playlistRootlistRequest$ProtoPlaylistRootResponse = new PlaylistRootlistRequest$ProtoPlaylistRootResponse();
        o = playlistRootlistRequest$ProtoPlaylistRootResponse;
        playlistRootlistRequest$ProtoPlaylistRootResponse.makeImmutable();
    }

    private PlaylistRootlistRequest$ProtoPlaylistRootResponse() {
    }

    public static PlaylistRootlistRequest$ProtoPlaylistRootResponse h() {
        return o;
    }

    public static x<PlaylistRootlistRequest$ProtoPlaylistRootResponse> parser() {
        return o.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return o;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PlaylistRootlistRequest$ProtoPlaylistRootResponse playlistRootlistRequest$ProtoPlaylistRootResponse = (PlaylistRootlistRequest$ProtoPlaylistRootResponse) obj2;
                this.b = (PlaylistRootlistRequest$ProtoPlaylistRootFolder) hVar.i(this.b, playlistRootlistRequest$ProtoPlaylistRootResponse.b);
                this.c = hVar.m((this.a & 2) == 2, this.c, (playlistRootlistRequest$ProtoPlaylistRootResponse.a & 2) == 2, playlistRootlistRequest$ProtoPlaylistRootResponse.c);
                this.f = hVar.m((this.a & 4) == 4, this.f, (playlistRootlistRequest$ProtoPlaylistRootResponse.a & 4) == 4, playlistRootlistRequest$ProtoPlaylistRootResponse.f);
                boolean z2 = (this.a & 8) == 8;
                boolean z3 = this.n;
                if ((playlistRootlistRequest$ProtoPlaylistRootResponse.a & 8) == 8) {
                    z = true;
                }
                this.n = hVar.f(z2, z3, z, playlistRootlistRequest$ProtoPlaylistRootResponse.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= playlistRootlistRequest$ProtoPlaylistRootResponse.a;
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
                                PlaylistRootlistRequest$ProtoPlaylistRootFolder.a aVar = (this.a & 1) == 1 ? (PlaylistRootlistRequest$ProtoPlaylistRootFolder.a) this.b.toBuilder() : null;
                                PlaylistRootlistRequest$ProtoPlaylistRootFolder playlistRootlistRequest$ProtoPlaylistRootFolder = (PlaylistRootlistRequest$ProtoPlaylistRootFolder) gVar.o(PlaylistRootlistRequest$ProtoPlaylistRootFolder.parser(), kVar);
                                this.b = playlistRootlistRequest$ProtoPlaylistRootFolder;
                                if (aVar != null) {
                                    aVar.mergeFrom((PlaylistRootlistRequest$ProtoPlaylistRootFolder.a) playlistRootlistRequest$ProtoPlaylistRootFolder);
                                    this.b = (PlaylistRootlistRequest$ProtoPlaylistRootFolder) aVar.buildPartial();
                                }
                                this.a |= 1;
                            } else if (B == 16) {
                                this.a |= 2;
                                this.c = gVar.u();
                            } else if (B == 24) {
                                this.a |= 4;
                                this.f = gVar.u();
                            } else if (B == 32) {
                                this.a |= 8;
                                this.n = gVar.h();
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
                return new PlaylistRootlistRequest$ProtoPlaylistRootResponse();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (PlaylistRootlistRequest$ProtoPlaylistRootResponse.class) {
                        if (p == null) {
                            p = new GeneratedMessageLite.c(o);
                        }
                    }
                }
                return p;
            default:
                throw new UnsupportedOperationException();
        }
        return o;
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
            i2 += CodedOutputStream.j(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.j(3, this.f);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.d(4, this.n);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public PlaylistRootlistRequest$ProtoPlaylistRootFolder i() {
        PlaylistRootlistRequest$ProtoPlaylistRootFolder playlistRootlistRequest$ProtoPlaylistRootFolder = this.b;
        return playlistRootlistRequest$ProtoPlaylistRootFolder == null ? PlaylistRootlistRequest$ProtoPlaylistRootFolder.i() : playlistRootlistRequest$ProtoPlaylistRootFolder;
    }

    public int l() {
        return this.c;
    }

    public int m() {
        return this.f;
    }

    public boolean n() {
        return (this.a & 1) == 1;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.M(1, i());
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.K(2, this.c);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.K(3, this.f);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.A(4, this.n);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
