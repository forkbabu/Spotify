package com.spotify.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.playlist.proto.PlaylistFolderMetadata$ProtoFolderMetadata;
import java.io.IOException;
import java.util.List;

public final class PlaylistRootlistRequest$ProtoPlaylistRootFolder extends GeneratedMessageLite<PlaylistRootlistRequest$ProtoPlaylistRootFolder, a> implements Object {
    private static final PlaylistRootlistRequest$ProtoPlaylistRootFolder p;
    private static volatile x<PlaylistRootlistRequest$ProtoPlaylistRootFolder> q;
    private int a;
    private o.i<PlaylistRootlistRequest$ProtoPlaylistRootItem> b = GeneratedMessageLite.emptyProtobufList();
    private PlaylistFolderMetadata$ProtoFolderMetadata c;
    private String f = "";
    private int n;
    private String o = "";

    public static final class a extends GeneratedMessageLite.b<PlaylistRootlistRequest$ProtoPlaylistRootFolder, a> implements Object {
        private a() {
            super(PlaylistRootlistRequest$ProtoPlaylistRootFolder.p);
        }
    }

    static {
        PlaylistRootlistRequest$ProtoPlaylistRootFolder playlistRootlistRequest$ProtoPlaylistRootFolder = new PlaylistRootlistRequest$ProtoPlaylistRootFolder();
        p = playlistRootlistRequest$ProtoPlaylistRootFolder;
        playlistRootlistRequest$ProtoPlaylistRootFolder.makeImmutable();
    }

    private PlaylistRootlistRequest$ProtoPlaylistRootFolder() {
    }

    public static PlaylistRootlistRequest$ProtoPlaylistRootFolder i() {
        return p;
    }

    public static x<PlaylistRootlistRequest$ProtoPlaylistRootFolder> parser() {
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
                PlaylistRootlistRequest$ProtoPlaylistRootFolder playlistRootlistRequest$ProtoPlaylistRootFolder = (PlaylistRootlistRequest$ProtoPlaylistRootFolder) obj2;
                this.b = hVar.q(this.b, playlistRootlistRequest$ProtoPlaylistRootFolder.b);
                this.c = (PlaylistFolderMetadata$ProtoFolderMetadata) hVar.i(this.c, playlistRootlistRequest$ProtoPlaylistRootFolder.c);
                this.f = hVar.n((this.a & 2) == 2, this.f, (playlistRootlistRequest$ProtoPlaylistRootFolder.a & 2) == 2, playlistRootlistRequest$ProtoPlaylistRootFolder.f);
                this.n = hVar.m((this.a & 4) == 4, this.n, (playlistRootlistRequest$ProtoPlaylistRootFolder.a & 4) == 4, playlistRootlistRequest$ProtoPlaylistRootFolder.n);
                boolean z2 = (this.a & 8) == 8;
                String str = this.o;
                if ((playlistRootlistRequest$ProtoPlaylistRootFolder.a & 8) == 8) {
                    z = true;
                }
                this.o = hVar.n(z2, str, z, playlistRootlistRequest$ProtoPlaylistRootFolder.o);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= playlistRootlistRequest$ProtoPlaylistRootFolder.a;
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
                                if (!this.b.R0()) {
                                    this.b = GeneratedMessageLite.mutableCopy(this.b);
                                }
                                this.b.add(gVar.o(PlaylistRootlistRequest$ProtoPlaylistRootItem.parser(), kVar));
                            } else if (B == 18) {
                                PlaylistFolderMetadata$ProtoFolderMetadata.a aVar = (this.a & 1) == 1 ? (PlaylistFolderMetadata$ProtoFolderMetadata.a) this.c.toBuilder() : null;
                                PlaylistFolderMetadata$ProtoFolderMetadata playlistFolderMetadata$ProtoFolderMetadata = (PlaylistFolderMetadata$ProtoFolderMetadata) gVar.o(PlaylistFolderMetadata$ProtoFolderMetadata.parser(), kVar);
                                this.c = playlistFolderMetadata$ProtoFolderMetadata;
                                if (aVar != null) {
                                    aVar.mergeFrom((PlaylistFolderMetadata$ProtoFolderMetadata.a) playlistFolderMetadata$ProtoFolderMetadata);
                                    this.c = (PlaylistFolderMetadata$ProtoFolderMetadata) aVar.buildPartial();
                                }
                                this.a |= 1;
                            } else if (B == 26) {
                                String z3 = gVar.z();
                                this.a |= 2;
                                this.f = z3;
                            } else if (B == 32) {
                                this.a |= 4;
                                this.n = gVar.u();
                            } else if (B == 42) {
                                String z4 = gVar.z();
                                this.a |= 8;
                                this.o = z4;
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
                this.b.C();
                return null;
            case 4:
                return new PlaylistRootlistRequest$ProtoPlaylistRootFolder();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (q == null) {
                    synchronized (PlaylistRootlistRequest$ProtoPlaylistRootFolder.class) {
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
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            i2 += CodedOutputStream.n(1, this.b.get(i3));
        }
        if ((this.a & 1) == 1) {
            i2 += CodedOutputStream.n(2, l());
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.p(3, this.f);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.s(4, this.n);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.p(5, this.o);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public int h() {
        return this.n;
    }

    public PlaylistFolderMetadata$ProtoFolderMetadata l() {
        PlaylistFolderMetadata$ProtoFolderMetadata playlistFolderMetadata$ProtoFolderMetadata = this.c;
        return playlistFolderMetadata$ProtoFolderMetadata == null ? PlaylistFolderMetadata$ProtoFolderMetadata.h() : playlistFolderMetadata$ProtoFolderMetadata;
    }

    public String m() {
        return this.o;
    }

    public List<PlaylistRootlistRequest$ProtoPlaylistRootItem> n() {
        return this.b;
    }

    public String o() {
        return this.f;
    }

    public boolean p() {
        return (this.a & 1) == 1;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.b.size(); i++) {
            codedOutputStream.M(1, this.b.get(i));
        }
        if ((this.a & 1) == 1) {
            codedOutputStream.M(2, l());
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.P(3, this.f);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.S(4, this.n);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.P(5, this.o);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
