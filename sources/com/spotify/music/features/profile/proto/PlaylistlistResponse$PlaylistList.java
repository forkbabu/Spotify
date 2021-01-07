package com.spotify.music.features.profile.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class PlaylistlistResponse$PlaylistList extends GeneratedMessageLite<PlaylistlistResponse$PlaylistList, a> implements Object {
    private static final PlaylistlistResponse$PlaylistList f;
    private static volatile x<PlaylistlistResponse$PlaylistList> n;
    private int a;
    private o.i<PlaylistlistResponse$Playlist> b = GeneratedMessageLite.emptyProtobufList();
    private int c;

    public static final class a extends GeneratedMessageLite.b<PlaylistlistResponse$PlaylistList, a> implements Object {
        private a() {
            super(PlaylistlistResponse$PlaylistList.f);
        }
    }

    static {
        PlaylistlistResponse$PlaylistList playlistlistResponse$PlaylistList = new PlaylistlistResponse$PlaylistList();
        f = playlistlistResponse$PlaylistList;
        playlistlistResponse$PlaylistList.makeImmutable();
    }

    private PlaylistlistResponse$PlaylistList() {
    }

    public static x<PlaylistlistResponse$PlaylistList> parser() {
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
                PlaylistlistResponse$PlaylistList playlistlistResponse$PlaylistList = (PlaylistlistResponse$PlaylistList) obj2;
                this.b = hVar.q(this.b, playlistlistResponse$PlaylistList.b);
                int i = this.c;
                boolean z2 = i != 0;
                int i2 = playlistlistResponse$PlaylistList.c;
                if (i2 != 0) {
                    z = true;
                }
                this.c = hVar.m(z2, i, z, i2);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= playlistlistResponse$PlaylistList.a;
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
                                this.b.add(gVar.o(PlaylistlistResponse$Playlist.parser(), kVar));
                            } else if (B == 16) {
                                this.c = gVar.u();
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
                this.b.C();
                return null;
            case 4:
                return new PlaylistlistResponse$PlaylistList();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (PlaylistlistResponse$PlaylistList.class) {
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
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            i2 += CodedOutputStream.n(1, this.b.get(i3));
        }
        int i4 = this.c;
        if (i4 != 0) {
            i2 += CodedOutputStream.j(2, i4);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public List<PlaylistlistResponse$Playlist> h() {
        return this.b;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.b.size(); i++) {
            codedOutputStream.M(1, this.b.get(i));
        }
        int i2 = this.c;
        if (i2 != 0) {
            codedOutputStream.K(2, i2);
        }
    }
}
