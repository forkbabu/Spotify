package com.spotify.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.playlist.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.proto.PlaylistEpisodeDecorationPolicy;
import com.spotify.playlist.proto.PlaylistTrackDecorationPolicy;
import java.io.IOException;

public final class PlaylistRequestDecorationPolicy extends GeneratedMessageLite<PlaylistRequestDecorationPolicy, b> implements Object {
    private static final PlaylistRequestDecorationPolicy f;
    private static volatile x<PlaylistRequestDecorationPolicy> n;
    private PlaylistDecorationPolicy a;
    private PlaylistTrackDecorationPolicy b;
    private PlaylistEpisodeDecorationPolicy c;

    public static final class b extends GeneratedMessageLite.b<PlaylistRequestDecorationPolicy, b> implements Object {
        private b() {
            super(PlaylistRequestDecorationPolicy.f);
        }
    }

    static {
        PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = new PlaylistRequestDecorationPolicy();
        f = playlistRequestDecorationPolicy;
        playlistRequestDecorationPolicy.makeImmutable();
    }

    private PlaylistRequestDecorationPolicy() {
    }

    public static PlaylistRequestDecorationPolicy h() {
        return f;
    }

    public static x<PlaylistRequestDecorationPolicy> parser() {
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
                PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = (PlaylistRequestDecorationPolicy) obj2;
                this.a = (PlaylistDecorationPolicy) hVar.i(this.a, playlistRequestDecorationPolicy.a);
                this.b = (PlaylistTrackDecorationPolicy) hVar.i(this.b, playlistRequestDecorationPolicy.b);
                this.c = (PlaylistEpisodeDecorationPolicy) hVar.i(this.c, playlistRequestDecorationPolicy.c);
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
                                PlaylistDecorationPolicy playlistDecorationPolicy = this.a;
                                PlaylistDecorationPolicy.b bVar = playlistDecorationPolicy != null ? (PlaylistDecorationPolicy.b) playlistDecorationPolicy.toBuilder() : null;
                                PlaylistDecorationPolicy playlistDecorationPolicy2 = (PlaylistDecorationPolicy) gVar.o(PlaylistDecorationPolicy.parser(), kVar);
                                this.a = playlistDecorationPolicy2;
                                if (bVar != null) {
                                    bVar.mergeFrom((PlaylistDecorationPolicy.b) playlistDecorationPolicy2);
                                    this.a = (PlaylistDecorationPolicy) bVar.buildPartial();
                                }
                            } else if (B == 18) {
                                PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy = this.b;
                                PlaylistTrackDecorationPolicy.b bVar2 = playlistTrackDecorationPolicy != null ? (PlaylistTrackDecorationPolicy.b) playlistTrackDecorationPolicy.toBuilder() : null;
                                PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy2 = (PlaylistTrackDecorationPolicy) gVar.o(PlaylistTrackDecorationPolicy.parser(), kVar);
                                this.b = playlistTrackDecorationPolicy2;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((PlaylistTrackDecorationPolicy.b) playlistTrackDecorationPolicy2);
                                    this.b = (PlaylistTrackDecorationPolicy) bVar2.buildPartial();
                                }
                            } else if (B == 26) {
                                PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy = this.c;
                                PlaylistEpisodeDecorationPolicy.b bVar3 = playlistEpisodeDecorationPolicy != null ? (PlaylistEpisodeDecorationPolicy.b) playlistEpisodeDecorationPolicy.toBuilder() : null;
                                PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy2 = (PlaylistEpisodeDecorationPolicy) gVar.o(PlaylistEpisodeDecorationPolicy.parser(), kVar);
                                this.c = playlistEpisodeDecorationPolicy2;
                                if (bVar3 != null) {
                                    bVar3.mergeFrom((PlaylistEpisodeDecorationPolicy.b) playlistEpisodeDecorationPolicy2);
                                    this.c = (PlaylistEpisodeDecorationPolicy) bVar3.buildPartial();
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
                return new PlaylistRequestDecorationPolicy();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (PlaylistRequestDecorationPolicy.class) {
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
        PlaylistDecorationPolicy playlistDecorationPolicy = this.a;
        if (playlistDecorationPolicy != null) {
            i2 = 0 + CodedOutputStream.n(1, playlistDecorationPolicy);
        }
        PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy = this.b;
        if (playlistTrackDecorationPolicy != null) {
            i2 += CodedOutputStream.n(2, playlistTrackDecorationPolicy);
        }
        PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy = this.c;
        if (playlistEpisodeDecorationPolicy != null) {
            i2 += CodedOutputStream.n(3, playlistEpisodeDecorationPolicy);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        PlaylistDecorationPolicy playlistDecorationPolicy = this.a;
        if (playlistDecorationPolicy != null) {
            codedOutputStream.M(1, playlistDecorationPolicy);
        }
        PlaylistTrackDecorationPolicy playlistTrackDecorationPolicy = this.b;
        if (playlistTrackDecorationPolicy != null) {
            codedOutputStream.M(2, playlistTrackDecorationPolicy);
        }
        PlaylistEpisodeDecorationPolicy playlistEpisodeDecorationPolicy = this.c;
        if (playlistEpisodeDecorationPolicy != null) {
            codedOutputStream.M(3, playlistEpisodeDecorationPolicy);
        }
    }
}
