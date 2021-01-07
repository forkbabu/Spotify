package com.spotify.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import com.spotify.playlist.proto.PlaylistDecorationPolicy;
import java.io.IOException;

public final class RootlistPlaylistDecorationPolicy extends GeneratedMessageLite<RootlistPlaylistDecorationPolicy, b> implements Object {
    private static final RootlistPlaylistDecorationPolicy f;
    private static volatile x<RootlistPlaylistDecorationPolicy> n;
    private boolean a;
    private PlaylistDecorationPolicy b;
    private boolean c;

    public static final class b extends GeneratedMessageLite.b<RootlistPlaylistDecorationPolicy, b> implements Object {
        private b() {
            super(RootlistPlaylistDecorationPolicy.f);
        }
    }

    static {
        RootlistPlaylistDecorationPolicy rootlistPlaylistDecorationPolicy = new RootlistPlaylistDecorationPolicy();
        f = rootlistPlaylistDecorationPolicy;
        rootlistPlaylistDecorationPolicy.makeImmutable();
    }

    private RootlistPlaylistDecorationPolicy() {
    }

    public static x<RootlistPlaylistDecorationPolicy> parser() {
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
                RootlistPlaylistDecorationPolicy rootlistPlaylistDecorationPolicy = (RootlistPlaylistDecorationPolicy) obj2;
                boolean z = this.a;
                boolean z2 = rootlistPlaylistDecorationPolicy.a;
                this.a = hVar.f(z, z, z2, z2);
                this.b = (PlaylistDecorationPolicy) hVar.i(this.b, rootlistPlaylistDecorationPolicy.b);
                boolean z3 = this.c;
                boolean z4 = rootlistPlaylistDecorationPolicy.c;
                this.c = hVar.f(z3, z3, z4, z4);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z5 = false;
                while (!z5) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 8) {
                                this.a = gVar.h();
                            } else if (B == 18) {
                                PlaylistDecorationPolicy playlistDecorationPolicy = this.b;
                                PlaylistDecorationPolicy.b bVar = playlistDecorationPolicy != null ? (PlaylistDecorationPolicy.b) playlistDecorationPolicy.toBuilder() : null;
                                PlaylistDecorationPolicy playlistDecorationPolicy2 = (PlaylistDecorationPolicy) gVar.o(PlaylistDecorationPolicy.parser(), kVar);
                                this.b = playlistDecorationPolicy2;
                                if (bVar != null) {
                                    bVar.mergeFrom((PlaylistDecorationPolicy.b) playlistDecorationPolicy2);
                                    this.b = (PlaylistDecorationPolicy) bVar.buildPartial();
                                }
                            } else if (B == 24) {
                                this.c = gVar.h();
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z5 = true;
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
                return new RootlistPlaylistDecorationPolicy();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (RootlistPlaylistDecorationPolicy.class) {
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
        boolean z = this.a;
        if (z) {
            i2 = 0 + CodedOutputStream.d(1, z);
        }
        PlaylistDecorationPolicy playlistDecorationPolicy = this.b;
        if (playlistDecorationPolicy != null) {
            i2 += CodedOutputStream.n(2, playlistDecorationPolicy);
        }
        boolean z2 = this.c;
        if (z2) {
            i2 += CodedOutputStream.d(3, z2);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        boolean z = this.a;
        if (z) {
            codedOutputStream.A(1, z);
        }
        PlaylistDecorationPolicy playlistDecorationPolicy = this.b;
        if (playlistDecorationPolicy != null) {
            codedOutputStream.M(2, playlistDecorationPolicy);
        }
        boolean z2 = this.c;
        if (z2) {
            codedOutputStream.A(3, z2);
        }
    }
}
