package com.spotify.mobile.android.spotlets.collection.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class AlbumState$ProtoAlbumCollectionState extends GeneratedMessageLite<AlbumState$ProtoAlbumCollectionState, a> implements Object {
    private static final AlbumState$ProtoAlbumCollectionState n;
    private static volatile x<AlbumState$ProtoAlbumCollectionState> o;
    private int a;
    private String b = "";
    private int c;
    private boolean f;

    public static final class a extends GeneratedMessageLite.b<AlbumState$ProtoAlbumCollectionState, a> implements Object {
        private a() {
            super(AlbumState$ProtoAlbumCollectionState.n);
        }
    }

    static {
        AlbumState$ProtoAlbumCollectionState albumState$ProtoAlbumCollectionState = new AlbumState$ProtoAlbumCollectionState();
        n = albumState$ProtoAlbumCollectionState;
        albumState$ProtoAlbumCollectionState.makeImmutable();
    }

    private AlbumState$ProtoAlbumCollectionState() {
    }

    public static AlbumState$ProtoAlbumCollectionState l() {
        return n;
    }

    public static x<AlbumState$ProtoAlbumCollectionState> parser() {
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
                AlbumState$ProtoAlbumCollectionState albumState$ProtoAlbumCollectionState = (AlbumState$ProtoAlbumCollectionState) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (albumState$ProtoAlbumCollectionState.a & 1) == 1, albumState$ProtoAlbumCollectionState.b);
                this.c = hVar.m((this.a & 2) == 2, this.c, (albumState$ProtoAlbumCollectionState.a & 2) == 2, albumState$ProtoAlbumCollectionState.c);
                boolean z2 = (this.a & 4) == 4;
                boolean z3 = this.f;
                if ((albumState$ProtoAlbumCollectionState.a & 4) == 4) {
                    z = true;
                }
                this.f = hVar.f(z2, z3, z, albumState$ProtoAlbumCollectionState.f);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= albumState$ProtoAlbumCollectionState.a;
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
                                String z4 = gVar.z();
                                this.a |= 1;
                                this.b = z4;
                            } else if (B == 16) {
                                this.a |= 2;
                                this.c = gVar.u();
                            } else if (B == 24) {
                                this.a |= 4;
                                this.f = gVar.h();
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
                return new AlbumState$ProtoAlbumCollectionState();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (AlbumState$ProtoAlbumCollectionState.class) {
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
            i2 += CodedOutputStream.s(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.d(3, this.f);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public String h() {
        return this.b;
    }

    public boolean i() {
        return this.f;
    }

    public int m() {
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
        if ((this.a & 4) == 4) {
            codedOutputStream.A(3, this.f);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
