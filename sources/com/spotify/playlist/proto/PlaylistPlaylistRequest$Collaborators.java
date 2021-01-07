package com.spotify.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class PlaylistPlaylistRequest$Collaborators extends GeneratedMessageLite<PlaylistPlaylistRequest$Collaborators, a> implements Object {
    private static final PlaylistPlaylistRequest$Collaborators f;
    private static volatile x<PlaylistPlaylistRequest$Collaborators> n;
    private int a;
    private int b;
    private o.i<PlaylistPlaylistRequest$Collaborator> c = GeneratedMessageLite.emptyProtobufList();

    public static final class a extends GeneratedMessageLite.b<PlaylistPlaylistRequest$Collaborators, a> implements Object {
        private a() {
            super(PlaylistPlaylistRequest$Collaborators.f);
        }
    }

    static {
        PlaylistPlaylistRequest$Collaborators playlistPlaylistRequest$Collaborators = new PlaylistPlaylistRequest$Collaborators();
        f = playlistPlaylistRequest$Collaborators;
        playlistPlaylistRequest$Collaborators.makeImmutable();
    }

    private PlaylistPlaylistRequest$Collaborators() {
    }

    public static PlaylistPlaylistRequest$Collaborators l() {
        return f;
    }

    public static x<PlaylistPlaylistRequest$Collaborators> parser() {
        return f.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return f;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PlaylistPlaylistRequest$Collaborators playlistPlaylistRequest$Collaborators = (PlaylistPlaylistRequest$Collaborators) obj2;
                boolean z2 = (this.a & 1) == 1;
                int i = this.b;
                if ((playlistPlaylistRequest$Collaborators.a & 1) == 1) {
                    z = true;
                }
                this.b = hVar.m(z2, i, z, playlistPlaylistRequest$Collaborators.b);
                this.c = hVar.q(this.c, playlistPlaylistRequest$Collaborators.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= playlistPlaylistRequest$Collaborators.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.a |= 1;
                                this.b = gVar.u();
                            } else if (B == 18) {
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(gVar.o(PlaylistPlaylistRequest$Collaborator.parser(), kVar));
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
                this.c.C();
                return null;
            case 4:
                return new PlaylistPlaylistRequest$Collaborators();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (PlaylistPlaylistRequest$Collaborators.class) {
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
        int s = (this.a & 1) == 1 ? CodedOutputStream.s(1, this.b) + 0 : 0;
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            s += CodedOutputStream.n(2, this.c.get(i2));
        }
        int c2 = this.unknownFields.c() + s;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public List<PlaylistPlaylistRequest$Collaborator> h() {
        return this.c;
    }

    public int i() {
        return this.b;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.S(1, this.b);
        }
        for (int i = 0; i < this.c.size(); i++) {
            codedOutputStream.M(2, this.c.get(i));
        }
        this.unknownFields.l(codedOutputStream);
    }
}
