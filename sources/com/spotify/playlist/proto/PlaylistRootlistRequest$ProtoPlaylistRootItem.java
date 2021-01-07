package com.spotify.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.playlist.proto.PlaylistRootlistRequest$ProtoPlaylistRootFolder;
import com.spotify.playlist.proto.PlaylistRootlistRequest$ProtoPlaylistRootPlaylist;
import java.io.IOException;

public final class PlaylistRootlistRequest$ProtoPlaylistRootItem extends GeneratedMessageLite<PlaylistRootlistRequest$ProtoPlaylistRootItem, a> implements Object {
    private static final PlaylistRootlistRequest$ProtoPlaylistRootItem n;
    private static volatile x<PlaylistRootlistRequest$ProtoPlaylistRootItem> o;
    private int a;
    private String b = "";
    private PlaylistRootlistRequest$ProtoPlaylistRootFolder c;
    private PlaylistRootlistRequest$ProtoPlaylistRootPlaylist f;

    public static final class a extends GeneratedMessageLite.b<PlaylistRootlistRequest$ProtoPlaylistRootItem, a> implements Object {
        private a() {
            super(PlaylistRootlistRequest$ProtoPlaylistRootItem.n);
        }
    }

    static {
        PlaylistRootlistRequest$ProtoPlaylistRootItem playlistRootlistRequest$ProtoPlaylistRootItem = new PlaylistRootlistRequest$ProtoPlaylistRootItem();
        n = playlistRootlistRequest$ProtoPlaylistRootItem;
        playlistRootlistRequest$ProtoPlaylistRootItem.makeImmutable();
    }

    private PlaylistRootlistRequest$ProtoPlaylistRootItem() {
    }

    public static x<PlaylistRootlistRequest$ProtoPlaylistRootItem> parser() {
        return n.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return n;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PlaylistRootlistRequest$ProtoPlaylistRootItem playlistRootlistRequest$ProtoPlaylistRootItem = (PlaylistRootlistRequest$ProtoPlaylistRootItem) obj2;
                boolean z2 = (this.a & 1) == 1;
                String str = this.b;
                if ((playlistRootlistRequest$ProtoPlaylistRootItem.a & 1) == 1) {
                    z = true;
                }
                this.b = hVar.n(z2, str, z, playlistRootlistRequest$ProtoPlaylistRootItem.b);
                this.c = (PlaylistRootlistRequest$ProtoPlaylistRootFolder) hVar.i(this.c, playlistRootlistRequest$ProtoPlaylistRootItem.c);
                this.f = (PlaylistRootlistRequest$ProtoPlaylistRootPlaylist) hVar.i(this.f, playlistRootlistRequest$ProtoPlaylistRootItem.f);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= playlistRootlistRequest$ProtoPlaylistRootItem.a;
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
                                PlaylistRootlistRequest$ProtoPlaylistRootFolder.a aVar = (this.a & 2) == 2 ? (PlaylistRootlistRequest$ProtoPlaylistRootFolder.a) this.c.toBuilder() : null;
                                PlaylistRootlistRequest$ProtoPlaylistRootFolder playlistRootlistRequest$ProtoPlaylistRootFolder = (PlaylistRootlistRequest$ProtoPlaylistRootFolder) gVar.o(PlaylistRootlistRequest$ProtoPlaylistRootFolder.parser(), kVar);
                                this.c = playlistRootlistRequest$ProtoPlaylistRootFolder;
                                if (aVar != null) {
                                    aVar.mergeFrom((PlaylistRootlistRequest$ProtoPlaylistRootFolder.a) playlistRootlistRequest$ProtoPlaylistRootFolder);
                                    this.c = (PlaylistRootlistRequest$ProtoPlaylistRootFolder) aVar.buildPartial();
                                }
                                this.a |= 2;
                            } else if (B == 26) {
                                PlaylistRootlistRequest$ProtoPlaylistRootPlaylist.a aVar2 = (this.a & 4) == 4 ? (PlaylistRootlistRequest$ProtoPlaylistRootPlaylist.a) this.f.toBuilder() : null;
                                PlaylistRootlistRequest$ProtoPlaylistRootPlaylist playlistRootlistRequest$ProtoPlaylistRootPlaylist = (PlaylistRootlistRequest$ProtoPlaylistRootPlaylist) gVar.o(PlaylistRootlistRequest$ProtoPlaylistRootPlaylist.parser(), kVar);
                                this.f = playlistRootlistRequest$ProtoPlaylistRootPlaylist;
                                if (aVar2 != null) {
                                    aVar2.mergeFrom((PlaylistRootlistRequest$ProtoPlaylistRootPlaylist.a) playlistRootlistRequest$ProtoPlaylistRootPlaylist);
                                    this.f = (PlaylistRootlistRequest$ProtoPlaylistRootPlaylist) aVar2.buildPartial();
                                }
                                this.a |= 4;
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
                return new PlaylistRootlistRequest$ProtoPlaylistRootItem();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (PlaylistRootlistRequest$ProtoPlaylistRootItem.class) {
                        if (o == null) {
                            o = new GeneratedMessageLite.c(n);
                        }
                    }
                }
                return o;
            default:
                throw new UnsupportedOperationException();
        }
        return n;
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
            i2 += CodedOutputStream.n(2, h());
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.n(3, l());
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public PlaylistRootlistRequest$ProtoPlaylistRootFolder h() {
        PlaylistRootlistRequest$ProtoPlaylistRootFolder playlistRootlistRequest$ProtoPlaylistRootFolder = this.c;
        return playlistRootlistRequest$ProtoPlaylistRootFolder == null ? PlaylistRootlistRequest$ProtoPlaylistRootFolder.i() : playlistRootlistRequest$ProtoPlaylistRootFolder;
    }

    public String i() {
        return this.b;
    }

    public PlaylistRootlistRequest$ProtoPlaylistRootPlaylist l() {
        PlaylistRootlistRequest$ProtoPlaylistRootPlaylist playlistRootlistRequest$ProtoPlaylistRootPlaylist = this.f;
        return playlistRootlistRequest$ProtoPlaylistRootPlaylist == null ? PlaylistRootlistRequest$ProtoPlaylistRootPlaylist.i() : playlistRootlistRequest$ProtoPlaylistRootPlaylist;
    }

    public boolean m() {
        return (this.a & 2) == 2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.P(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.M(2, h());
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.M(3, l());
        }
        this.unknownFields.l(codedOutputStream);
    }
}
