package com.spotify.mobile.android.spotlets.collection.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class CollectionAlbumsRequest$ProtoCollectionAlbumsResponse extends GeneratedMessageLite<CollectionAlbumsRequest$ProtoCollectionAlbumsResponse, a> implements Object {
    private static final CollectionAlbumsRequest$ProtoCollectionAlbumsResponse o;
    private static volatile x<CollectionAlbumsRequest$ProtoCollectionAlbumsResponse> p;
    private int a;
    private o.i<CollectionAlbumsRequest$ProtoCollectionAlbumsItem> b = GeneratedMessageLite.emptyProtobufList();
    private int c;
    private int f;
    private boolean n;

    public static final class a extends GeneratedMessageLite.b<CollectionAlbumsRequest$ProtoCollectionAlbumsResponse, a> implements Object {
        private a() {
            super(CollectionAlbumsRequest$ProtoCollectionAlbumsResponse.o);
        }
    }

    static {
        CollectionAlbumsRequest$ProtoCollectionAlbumsResponse collectionAlbumsRequest$ProtoCollectionAlbumsResponse = new CollectionAlbumsRequest$ProtoCollectionAlbumsResponse();
        o = collectionAlbumsRequest$ProtoCollectionAlbumsResponse;
        collectionAlbumsRequest$ProtoCollectionAlbumsResponse.makeImmutable();
    }

    private CollectionAlbumsRequest$ProtoCollectionAlbumsResponse() {
    }

    public static CollectionAlbumsRequest$ProtoCollectionAlbumsResponse o(byte[] bArr) {
        return (CollectionAlbumsRequest$ProtoCollectionAlbumsResponse) GeneratedMessageLite.parseFrom(o, bArr);
    }

    public static x<CollectionAlbumsRequest$ProtoCollectionAlbumsResponse> parser() {
        return o.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return o;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                CollectionAlbumsRequest$ProtoCollectionAlbumsResponse collectionAlbumsRequest$ProtoCollectionAlbumsResponse = (CollectionAlbumsRequest$ProtoCollectionAlbumsResponse) obj2;
                this.b = hVar.q(this.b, collectionAlbumsRequest$ProtoCollectionAlbumsResponse.b);
                this.c = hVar.m((this.a & 1) == 1, this.c, (collectionAlbumsRequest$ProtoCollectionAlbumsResponse.a & 1) == 1, collectionAlbumsRequest$ProtoCollectionAlbumsResponse.c);
                this.f = hVar.m((this.a & 2) == 2, this.f, (collectionAlbumsRequest$ProtoCollectionAlbumsResponse.a & 2) == 2, collectionAlbumsRequest$ProtoCollectionAlbumsResponse.f);
                boolean z2 = (this.a & 4) == 4;
                boolean z3 = this.n;
                if ((collectionAlbumsRequest$ProtoCollectionAlbumsResponse.a & 4) == 4) {
                    z = true;
                }
                this.n = hVar.f(z2, z3, z, collectionAlbumsRequest$ProtoCollectionAlbumsResponse.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= collectionAlbumsRequest$ProtoCollectionAlbumsResponse.a;
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
                                this.b.add(gVar.o(CollectionAlbumsRequest$ProtoCollectionAlbumsItem.parser(), kVar));
                            } else if (B == 16) {
                                this.a |= 1;
                                this.c = gVar.u();
                            } else if (B == 24) {
                                this.a |= 2;
                                this.f = gVar.u();
                            } else if (B == 32) {
                                this.a |= 4;
                                this.n = gVar.h();
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
                this.b.C();
                return null;
            case 4:
                return new CollectionAlbumsRequest$ProtoCollectionAlbumsResponse();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (CollectionAlbumsRequest$ProtoCollectionAlbumsResponse.class) {
                        if (p == null) {
                            p = new GeneratedMessageLite.c(o);
                        }
                    }
                }
                return p;
            default:
                throw new UnsupportedOperationException();
        }
        return o;
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
        if ((this.a & 1) == 1) {
            i2 += CodedOutputStream.s(2, this.c);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.s(3, this.f);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.d(4, this.n);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public int h() {
        return this.b.size();
    }

    public List<CollectionAlbumsRequest$ProtoCollectionAlbumsItem> i() {
        return this.b;
    }

    public boolean l() {
        return this.n;
    }

    public int m() {
        return this.c;
    }

    public int n() {
        return this.f;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.b.size(); i++) {
            codedOutputStream.M(1, this.b.get(i));
        }
        if ((this.a & 1) == 1) {
            codedOutputStream.S(2, this.c);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.S(3, this.f);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.A(4, this.n);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
