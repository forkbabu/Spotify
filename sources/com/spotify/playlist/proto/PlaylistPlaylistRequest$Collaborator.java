package com.spotify.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.playlist.proto.PlaylistUserState$ProtoUser;
import java.io.IOException;

public final class PlaylistPlaylistRequest$Collaborator extends GeneratedMessageLite<PlaylistPlaylistRequest$Collaborator, a> implements Object {
    private static final PlaylistPlaylistRequest$Collaborator p;
    private static volatile x<PlaylistPlaylistRequest$Collaborator> q;
    private int a;
    private PlaylistUserState$ProtoUser b;
    private int c;
    private int f;
    private int n;
    private boolean o;

    public static final class a extends GeneratedMessageLite.b<PlaylistPlaylistRequest$Collaborator, a> implements Object {
        private a() {
            super(PlaylistPlaylistRequest$Collaborator.p);
        }
    }

    static {
        PlaylistPlaylistRequest$Collaborator playlistPlaylistRequest$Collaborator = new PlaylistPlaylistRequest$Collaborator();
        p = playlistPlaylistRequest$Collaborator;
        playlistPlaylistRequest$Collaborator.makeImmutable();
    }

    private PlaylistPlaylistRequest$Collaborator() {
    }

    public static x<PlaylistPlaylistRequest$Collaborator> parser() {
        return p.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return p;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PlaylistPlaylistRequest$Collaborator playlistPlaylistRequest$Collaborator = (PlaylistPlaylistRequest$Collaborator) obj2;
                this.b = (PlaylistUserState$ProtoUser) hVar.i(this.b, playlistPlaylistRequest$Collaborator.b);
                this.c = hVar.m((this.a & 2) == 2, this.c, (playlistPlaylistRequest$Collaborator.a & 2) == 2, playlistPlaylistRequest$Collaborator.c);
                this.f = hVar.m((this.a & 4) == 4, this.f, (playlistPlaylistRequest$Collaborator.a & 4) == 4, playlistPlaylistRequest$Collaborator.f);
                this.n = hVar.m((this.a & 8) == 8, this.n, (playlistPlaylistRequest$Collaborator.a & 8) == 8, playlistPlaylistRequest$Collaborator.n);
                boolean z2 = (this.a & 16) == 16;
                boolean z3 = this.o;
                if ((playlistPlaylistRequest$Collaborator.a & 16) == 16) {
                    z = true;
                }
                this.o = hVar.f(z2, z3, z, playlistPlaylistRequest$Collaborator.o);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= playlistPlaylistRequest$Collaborator.a;
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
                                PlaylistUserState$ProtoUser.a aVar = (this.a & 1) == 1 ? (PlaylistUserState$ProtoUser.a) this.b.toBuilder() : null;
                                PlaylistUserState$ProtoUser playlistUserState$ProtoUser = (PlaylistUserState$ProtoUser) gVar.o(PlaylistUserState$ProtoUser.parser(), kVar);
                                this.b = playlistUserState$ProtoUser;
                                if (aVar != null) {
                                    aVar.mergeFrom((PlaylistUserState$ProtoUser.a) playlistUserState$ProtoUser);
                                    this.b = (PlaylistUserState$ProtoUser) aVar.buildPartial();
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
                                this.n = gVar.u();
                            } else if (B == 40) {
                                this.a |= 16;
                                this.o = gVar.h();
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
                return new PlaylistPlaylistRequest$Collaborator();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (q == null) {
                    synchronized (PlaylistPlaylistRequest$Collaborator.class) {
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

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.n(1, n());
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.s(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.s(3, this.f);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.s(4, this.n);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.d(5, this.o);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public boolean h() {
        return this.o;
    }

    public int i() {
        return this.n;
    }

    public int l() {
        return this.c;
    }

    public int m() {
        return this.f;
    }

    public PlaylistUserState$ProtoUser n() {
        PlaylistUserState$ProtoUser playlistUserState$ProtoUser = this.b;
        return playlistUserState$ProtoUser == null ? PlaylistUserState$ProtoUser.h() : playlistUserState$ProtoUser;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.M(1, n());
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.S(2, this.c);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.S(3, this.f);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.S(4, this.n);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.A(5, this.o);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
