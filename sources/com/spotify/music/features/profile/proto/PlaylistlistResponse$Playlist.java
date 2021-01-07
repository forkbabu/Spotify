package com.spotify.music.features.profile.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class PlaylistlistResponse$Playlist extends GeneratedMessageLite<PlaylistlistResponse$Playlist, a> implements Object {
    private static final PlaylistlistResponse$Playlist q;
    private static volatile x<PlaylistlistResponse$Playlist> r;
    private String a = "";
    private String b = "";
    private String c = "";
    private int f;
    private String n = "";
    private String o = "";
    private boolean p;

    public static final class a extends GeneratedMessageLite.b<PlaylistlistResponse$Playlist, a> implements Object {
        private a() {
            super(PlaylistlistResponse$Playlist.q);
        }
    }

    static {
        PlaylistlistResponse$Playlist playlistlistResponse$Playlist = new PlaylistlistResponse$Playlist();
        q = playlistlistResponse$Playlist;
        playlistlistResponse$Playlist.makeImmutable();
    }

    private PlaylistlistResponse$Playlist() {
    }

    public static x<PlaylistlistResponse$Playlist> parser() {
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
                PlaylistlistResponse$Playlist playlistlistResponse$Playlist = (PlaylistlistResponse$Playlist) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !playlistlistResponse$Playlist.a.isEmpty(), playlistlistResponse$Playlist.a);
                this.b = hVar.n(!this.b.isEmpty(), this.b, !playlistlistResponse$Playlist.b.isEmpty(), playlistlistResponse$Playlist.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !playlistlistResponse$Playlist.c.isEmpty(), playlistlistResponse$Playlist.c);
                int i = this.f;
                boolean z2 = i != 0;
                int i2 = playlistlistResponse$Playlist.f;
                if (i2 != 0) {
                    z = true;
                }
                this.f = hVar.m(z2, i, z, i2);
                this.n = hVar.n(!this.n.isEmpty(), this.n, !playlistlistResponse$Playlist.n.isEmpty(), playlistlistResponse$Playlist.n);
                this.o = hVar.n(!this.o.isEmpty(), this.o, true ^ playlistlistResponse$Playlist.o.isEmpty(), playlistlistResponse$Playlist.o);
                boolean z3 = this.p;
                boolean z4 = playlistlistResponse$Playlist.p;
                this.p = hVar.f(z3, z3, z4, z4);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                this.a = gVar.A();
                            } else if (B == 18) {
                                this.b = gVar.A();
                            } else if (B == 26) {
                                this.c = gVar.A();
                            } else if (B == 32) {
                                this.f = gVar.u();
                            } else if (B == 42) {
                                this.n = gVar.A();
                            } else if (B == 50) {
                                this.o = gVar.A();
                            } else if (B == 56) {
                                this.p = gVar.h();
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
                return new PlaylistlistResponse$Playlist();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (r == null) {
                    synchronized (PlaylistlistResponse$Playlist.class) {
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
        if (!this.a.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.a);
        }
        if (!this.b.isEmpty()) {
            i2 += CodedOutputStream.p(2, this.b);
        }
        if (!this.c.isEmpty()) {
            i2 += CodedOutputStream.p(3, this.c);
        }
        int i3 = this.f;
        if (i3 != 0) {
            i2 += CodedOutputStream.j(4, i3);
        }
        if (!this.n.isEmpty()) {
            i2 += CodedOutputStream.p(5, this.n);
        }
        if (!this.o.isEmpty()) {
            i2 += CodedOutputStream.p(6, this.o);
        }
        boolean z = this.p;
        if (z) {
            i2 += CodedOutputStream.d(7, z);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public int h() {
        return this.f;
    }

    public String i() {
        return this.c;
    }

    public String l() {
        return this.b;
    }

    public String m() {
        return this.a;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        if (!this.b.isEmpty()) {
            codedOutputStream.P(2, this.b);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(3, this.c);
        }
        int i = this.f;
        if (i != 0) {
            codedOutputStream.K(4, i);
        }
        if (!this.n.isEmpty()) {
            codedOutputStream.P(5, this.n);
        }
        if (!this.o.isEmpty()) {
            codedOutputStream.P(6, this.o);
        }
        boolean z = this.p;
        if (z) {
            codedOutputStream.A(7, z);
        }
    }
}
