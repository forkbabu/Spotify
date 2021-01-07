package com.spotify.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class PlaylistFolderMetadata$ProtoFolderMetadata extends GeneratedMessageLite<PlaylistFolderMetadata$ProtoFolderMetadata, a> implements Object {
    private static final PlaylistFolderMetadata$ProtoFolderMetadata r;
    private static volatile x<PlaylistFolderMetadata$ProtoFolderMetadata> s;
    private int a;
    private String b = "";
    private String c = "";
    private int f;
    private int n;
    private int o;
    private int p;
    private String q = "";

    public static final class a extends GeneratedMessageLite.b<PlaylistFolderMetadata$ProtoFolderMetadata, a> implements Object {
        private a() {
            super(PlaylistFolderMetadata$ProtoFolderMetadata.r);
        }
    }

    static {
        PlaylistFolderMetadata$ProtoFolderMetadata playlistFolderMetadata$ProtoFolderMetadata = new PlaylistFolderMetadata$ProtoFolderMetadata();
        r = playlistFolderMetadata$ProtoFolderMetadata;
        playlistFolderMetadata$ProtoFolderMetadata.makeImmutable();
    }

    private PlaylistFolderMetadata$ProtoFolderMetadata() {
    }

    public static PlaylistFolderMetadata$ProtoFolderMetadata h() {
        return r;
    }

    public static x<PlaylistFolderMetadata$ProtoFolderMetadata> parser() {
        return r.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return r;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                PlaylistFolderMetadata$ProtoFolderMetadata playlistFolderMetadata$ProtoFolderMetadata = (PlaylistFolderMetadata$ProtoFolderMetadata) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (playlistFolderMetadata$ProtoFolderMetadata.a & 1) == 1, playlistFolderMetadata$ProtoFolderMetadata.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (playlistFolderMetadata$ProtoFolderMetadata.a & 2) == 2, playlistFolderMetadata$ProtoFolderMetadata.c);
                this.f = hVar.m((this.a & 4) == 4, this.f, (playlistFolderMetadata$ProtoFolderMetadata.a & 4) == 4, playlistFolderMetadata$ProtoFolderMetadata.f);
                this.n = hVar.m((this.a & 8) == 8, this.n, (playlistFolderMetadata$ProtoFolderMetadata.a & 8) == 8, playlistFolderMetadata$ProtoFolderMetadata.n);
                this.o = hVar.m((this.a & 16) == 16, this.o, (playlistFolderMetadata$ProtoFolderMetadata.a & 16) == 16, playlistFolderMetadata$ProtoFolderMetadata.o);
                this.p = hVar.m((this.a & 32) == 32, this.p, (playlistFolderMetadata$ProtoFolderMetadata.a & 32) == 32, playlistFolderMetadata$ProtoFolderMetadata.p);
                boolean z2 = (this.a & 64) == 64;
                String str = this.q;
                if ((playlistFolderMetadata$ProtoFolderMetadata.a & 64) == 64) {
                    z = true;
                }
                this.q = hVar.n(z2, str, z, playlistFolderMetadata$ProtoFolderMetadata.q);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= playlistFolderMetadata$ProtoFolderMetadata.a;
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
                            } else if (B == 24) {
                                this.a |= 4;
                                this.f = gVar.u();
                            } else if (B == 32) {
                                this.a |= 8;
                                this.n = gVar.u();
                            } else if (B == 40) {
                                this.a |= 16;
                                this.o = gVar.u();
                            } else if (B == 48) {
                                this.a |= 32;
                                this.p = gVar.u();
                            } else if (B == 58) {
                                String z5 = gVar.z();
                                this.a |= 64;
                                this.q = z5;
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
                return new PlaylistFolderMetadata$ProtoFolderMetadata();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (s == null) {
                    synchronized (PlaylistFolderMetadata$ProtoFolderMetadata.class) {
                        if (s == null) {
                            s = new GeneratedMessageLite.c(r);
                        }
                    }
                }
                return s;
            default:
                throw new UnsupportedOperationException();
        }
        return r;
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
            i2 += CodedOutputStream.s(3, this.f);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.s(4, this.n);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.s(5, this.o);
        }
        if ((this.a & 32) == 32) {
            i2 += CodedOutputStream.s(6, this.p);
        }
        if ((this.a & 64) == 64) {
            i2 += CodedOutputStream.p(7, this.q);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public String i() {
        return this.q;
    }

    public String l() {
        return this.c;
    }

    public int m() {
        return this.f;
    }

    public int n() {
        return this.n;
    }

    public int o() {
        return this.o;
    }

    public int p() {
        return this.p;
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
            codedOutputStream.S(3, this.f);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.S(4, this.n);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.S(5, this.o);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.S(6, this.p);
        }
        if ((this.a & 64) == 64) {
            codedOutputStream.P(7, this.q);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
