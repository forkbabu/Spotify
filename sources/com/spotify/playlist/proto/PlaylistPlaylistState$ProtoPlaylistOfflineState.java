package com.spotify.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class PlaylistPlaylistState$ProtoPlaylistOfflineState extends GeneratedMessageLite<PlaylistPlaylistState$ProtoPlaylistOfflineState, a> implements Object {
    private static final PlaylistPlaylistState$ProtoPlaylistOfflineState f;
    private static volatile x<PlaylistPlaylistState$ProtoPlaylistOfflineState> n;
    private int a;
    private String b = "";
    private int c;

    public static final class a extends GeneratedMessageLite.b<PlaylistPlaylistState$ProtoPlaylistOfflineState, a> implements Object {
        private a() {
            super(PlaylistPlaylistState$ProtoPlaylistOfflineState.f);
        }
    }

    static {
        PlaylistPlaylistState$ProtoPlaylistOfflineState playlistPlaylistState$ProtoPlaylistOfflineState = new PlaylistPlaylistState$ProtoPlaylistOfflineState();
        f = playlistPlaylistState$ProtoPlaylistOfflineState;
        playlistPlaylistState$ProtoPlaylistOfflineState.makeImmutable();
    }

    private PlaylistPlaylistState$ProtoPlaylistOfflineState() {
    }

    public static PlaylistPlaylistState$ProtoPlaylistOfflineState h() {
        return f;
    }

    public static x<PlaylistPlaylistState$ProtoPlaylistOfflineState> parser() {
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
                PlaylistPlaylistState$ProtoPlaylistOfflineState playlistPlaylistState$ProtoPlaylistOfflineState = (PlaylistPlaylistState$ProtoPlaylistOfflineState) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (playlistPlaylistState$ProtoPlaylistOfflineState.a & 1) == 1, playlistPlaylistState$ProtoPlaylistOfflineState.b);
                boolean z2 = (this.a & 2) == 2;
                int i = this.c;
                if ((playlistPlaylistState$ProtoPlaylistOfflineState.a & 2) == 2) {
                    z = true;
                }
                this.c = hVar.m(z2, i, z, playlistPlaylistState$ProtoPlaylistOfflineState.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= playlistPlaylistState$ProtoPlaylistOfflineState.a;
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
                            } else if (B == 16) {
                                this.a |= 2;
                                this.c = gVar.u();
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
                return new PlaylistPlaylistState$ProtoPlaylistOfflineState();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (PlaylistPlaylistState$ProtoPlaylistOfflineState.class) {
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
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.p(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.s(2, this.c);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public String i() {
        return this.b;
    }

    public int l() {
        return this.c;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.P(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.S(2, this.c);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
