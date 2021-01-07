package com.spotify.mobile.android.spotlets.collection.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class AlbumState$ProtoAlbumOfflineState extends GeneratedMessageLite<AlbumState$ProtoAlbumOfflineState, a> implements Object {
    private static final AlbumState$ProtoAlbumOfflineState n;
    private static volatile x<AlbumState$ProtoAlbumOfflineState> o;
    private int a;
    private String b = "";
    private String c = "";
    private int f;

    public static final class a extends GeneratedMessageLite.b<AlbumState$ProtoAlbumOfflineState, a> implements Object {
        private a() {
            super(AlbumState$ProtoAlbumOfflineState.n);
        }
    }

    static {
        AlbumState$ProtoAlbumOfflineState albumState$ProtoAlbumOfflineState = new AlbumState$ProtoAlbumOfflineState();
        n = albumState$ProtoAlbumOfflineState;
        albumState$ProtoAlbumOfflineState.makeImmutable();
    }

    private AlbumState$ProtoAlbumOfflineState() {
    }

    public static AlbumState$ProtoAlbumOfflineState h() {
        return n;
    }

    public static x<AlbumState$ProtoAlbumOfflineState> parser() {
        return n.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return n;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                AlbumState$ProtoAlbumOfflineState albumState$ProtoAlbumOfflineState = (AlbumState$ProtoAlbumOfflineState) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (albumState$ProtoAlbumOfflineState.a & 1) == 1, albumState$ProtoAlbumOfflineState.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (albumState$ProtoAlbumOfflineState.a & 2) == 2, albumState$ProtoAlbumOfflineState.c);
                boolean z2 = (this.a & 4) == 4;
                int i = this.f;
                if ((albumState$ProtoAlbumOfflineState.a & 4) == 4) {
                    z = true;
                }
                this.f = hVar.m(z2, i, z, albumState$ProtoAlbumOfflineState.f);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= albumState$ProtoAlbumOfflineState.a;
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
                return new AlbumState$ProtoAlbumOfflineState();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (AlbumState$ProtoAlbumOfflineState.class) {
                        if (o == null) {
                            o = new GeneratedMessageLite.c(n);
                        }
                    }
                }
                return o;
            default:
                throw new UnsupportedOperationException();
        }
        return n;
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
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public String i() {
        return this.c;
    }

    public String l() {
        return this.b;
    }

    public int m() {
        return this.f;
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
        this.unknownFields.l(codedOutputStream);
    }
}
