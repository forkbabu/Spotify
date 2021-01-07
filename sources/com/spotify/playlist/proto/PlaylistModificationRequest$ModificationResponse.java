package com.spotify.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class PlaylistModificationRequest$ModificationResponse extends GeneratedMessageLite<PlaylistModificationRequest$ModificationResponse, a> implements Object {
    private static final PlaylistModificationRequest$ModificationResponse f;
    private static volatile x<PlaylistModificationRequest$ModificationResponse> n;
    private int a;
    private boolean b;
    private String c = "";

    public static final class a extends GeneratedMessageLite.b<PlaylistModificationRequest$ModificationResponse, a> implements Object {
        private a() {
            super(PlaylistModificationRequest$ModificationResponse.f);
        }
    }

    static {
        PlaylistModificationRequest$ModificationResponse playlistModificationRequest$ModificationResponse = new PlaylistModificationRequest$ModificationResponse();
        f = playlistModificationRequest$ModificationResponse;
        playlistModificationRequest$ModificationResponse.makeImmutable();
    }

    private PlaylistModificationRequest$ModificationResponse() {
    }

    public static PlaylistModificationRequest$ModificationResponse h() {
        return f;
    }

    public static x<PlaylistModificationRequest$ModificationResponse> parser() {
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
                PlaylistModificationRequest$ModificationResponse playlistModificationRequest$ModificationResponse = (PlaylistModificationRequest$ModificationResponse) obj2;
                this.b = hVar.f((this.a & 1) == 1, this.b, (playlistModificationRequest$ModificationResponse.a & 1) == 1, playlistModificationRequest$ModificationResponse.b);
                boolean z2 = (this.a & 2) == 2;
                String str = this.c;
                if ((playlistModificationRequest$ModificationResponse.a & 2) == 2) {
                    z = true;
                }
                this.c = hVar.n(z2, str, z, playlistModificationRequest$ModificationResponse.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= playlistModificationRequest$ModificationResponse.a;
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
                                this.b = gVar.h();
                            } else if (B == 18) {
                                String z3 = gVar.z();
                                this.a |= 2;
                                this.c = z3;
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
                return new PlaylistModificationRequest$ModificationResponse();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (PlaylistModificationRequest$ModificationResponse.class) {
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
            i2 = 0 + CodedOutputStream.d(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.p(2, this.c);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public String i() {
        return this.c;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.A(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.P(2, this.c);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
