package com.spotify.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class PlaylistUserState$ProtoUser extends GeneratedMessageLite<PlaylistUserState$ProtoUser, a> implements Object {
    private static final PlaylistUserState$ProtoUser p;
    private static volatile x<PlaylistUserState$ProtoUser> q;
    private int a;
    private String b = "";
    private String c = "";
    private String f = "";
    private String n = "";
    private String o = "";

    public static final class a extends GeneratedMessageLite.b<PlaylistUserState$ProtoUser, a> implements Object {
        private a() {
            super(PlaylistUserState$ProtoUser.p);
        }
    }

    static {
        PlaylistUserState$ProtoUser playlistUserState$ProtoUser = new PlaylistUserState$ProtoUser();
        p = playlistUserState$ProtoUser;
        playlistUserState$ProtoUser.makeImmutable();
    }

    private PlaylistUserState$ProtoUser() {
    }

    public static PlaylistUserState$ProtoUser h() {
        return p;
    }

    public static x<PlaylistUserState$ProtoUser> parser() {
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
                PlaylistUserState$ProtoUser playlistUserState$ProtoUser = (PlaylistUserState$ProtoUser) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (playlistUserState$ProtoUser.a & 1) == 1, playlistUserState$ProtoUser.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (playlistUserState$ProtoUser.a & 2) == 2, playlistUserState$ProtoUser.c);
                this.f = hVar.n((this.a & 4) == 4, this.f, (playlistUserState$ProtoUser.a & 4) == 4, playlistUserState$ProtoUser.f);
                this.n = hVar.n((this.a & 8) == 8, this.n, (playlistUserState$ProtoUser.a & 8) == 8, playlistUserState$ProtoUser.n);
                boolean z2 = (this.a & 16) == 16;
                String str = this.o;
                if ((playlistUserState$ProtoUser.a & 16) == 16) {
                    z = true;
                }
                this.o = hVar.n(z2, str, z, playlistUserState$ProtoUser.o);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= playlistUserState$ProtoUser.a;
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
                                String z4 = gVar.z();
                                this.a |= 2;
                                this.c = z4;
                            } else if (B == 26) {
                                String z5 = gVar.z();
                                this.a |= 4;
                                this.f = z5;
                            } else if (B == 34) {
                                String z6 = gVar.z();
                                this.a |= 8;
                                this.n = z6;
                            } else if (B == 42) {
                                String z7 = gVar.z();
                                this.a |= 16;
                                this.o = z7;
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
                return new PlaylistUserState$ProtoUser();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (q == null) {
                    synchronized (PlaylistUserState$ProtoUser.class) {
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
            i2 = 0 + CodedOutputStream.p(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.p(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.p(3, this.f);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.p(4, this.n);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.p(5, this.o);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public String i() {
        return this.f;
    }

    public String l() {
        return this.n;
    }

    public String m() {
        return this.b;
    }

    public String n() {
        return this.o;
    }

    public String o() {
        return this.c;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.P(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.P(2, this.c);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.P(3, this.f);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.P(4, this.n);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.P(5, this.o);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
