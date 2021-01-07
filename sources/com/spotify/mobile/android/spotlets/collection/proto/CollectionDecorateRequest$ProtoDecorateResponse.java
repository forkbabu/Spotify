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

public final class CollectionDecorateRequest$ProtoDecorateResponse extends GeneratedMessageLite<CollectionDecorateRequest$ProtoDecorateResponse, a> implements Object {
    private static final CollectionDecorateRequest$ProtoDecorateResponse f;
    private static volatile x<CollectionDecorateRequest$ProtoDecorateResponse> n;
    private o.i<CollectionDecorateRequest$ProtoDecorateAlbumItem> a = GeneratedMessageLite.emptyProtobufList();
    private o.i<CollectionDecorateRequest$ProtoDecorateArtistItem> b = GeneratedMessageLite.emptyProtobufList();
    private o.i<CollectionDecorateRequest$ProtoDecorateTrackItem> c = GeneratedMessageLite.emptyProtobufList();

    public static final class a extends GeneratedMessageLite.b<CollectionDecorateRequest$ProtoDecorateResponse, a> implements Object {
        private a() {
            super(CollectionDecorateRequest$ProtoDecorateResponse.f);
        }
    }

    static {
        CollectionDecorateRequest$ProtoDecorateResponse collectionDecorateRequest$ProtoDecorateResponse = new CollectionDecorateRequest$ProtoDecorateResponse();
        f = collectionDecorateRequest$ProtoDecorateResponse;
        collectionDecorateRequest$ProtoDecorateResponse.makeImmutable();
    }

    private CollectionDecorateRequest$ProtoDecorateResponse() {
    }

    public static CollectionDecorateRequest$ProtoDecorateResponse p(byte[] bArr) {
        return (CollectionDecorateRequest$ProtoDecorateResponse) GeneratedMessageLite.parseFrom(f, bArr);
    }

    public static x<CollectionDecorateRequest$ProtoDecorateResponse> parser() {
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
                CollectionDecorateRequest$ProtoDecorateResponse collectionDecorateRequest$ProtoDecorateResponse = (CollectionDecorateRequest$ProtoDecorateResponse) obj2;
                this.a = hVar.q(this.a, collectionDecorateRequest$ProtoDecorateResponse.a);
                this.b = hVar.q(this.b, collectionDecorateRequest$ProtoDecorateResponse.b);
                this.c = hVar.q(this.c, collectionDecorateRequest$ProtoDecorateResponse.c);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 26) {
                                if (!this.a.R0()) {
                                    this.a = GeneratedMessageLite.mutableCopy(this.a);
                                }
                                this.a.add(gVar.o(CollectionDecorateRequest$ProtoDecorateAlbumItem.parser(), kVar));
                            } else if (B == 34) {
                                if (!this.b.R0()) {
                                    this.b = GeneratedMessageLite.mutableCopy(this.b);
                                }
                                this.b.add(gVar.o(CollectionDecorateRequest$ProtoDecorateArtistItem.parser(), kVar));
                            } else if (B == 42) {
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(gVar.o(CollectionDecorateRequest$ProtoDecorateTrackItem.parser(), kVar));
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
                this.a.C();
                this.b.C();
                this.c.C();
                return null;
            case 4:
                return new CollectionDecorateRequest$ProtoDecorateResponse();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (CollectionDecorateRequest$ProtoDecorateResponse.class) {
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
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            i2 += CodedOutputStream.n(3, this.a.get(i3));
        }
        for (int i4 = 0; i4 < this.b.size(); i4++) {
            i2 += CodedOutputStream.n(4, this.b.get(i4));
        }
        for (int i5 = 0; i5 < this.c.size(); i5++) {
            i2 += CodedOutputStream.n(5, this.c.get(i5));
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public int h() {
        return this.a.size();
    }

    public List<CollectionDecorateRequest$ProtoDecorateAlbumItem> i() {
        return this.a;
    }

    public int l() {
        return this.b.size();
    }

    public List<CollectionDecorateRequest$ProtoDecorateArtistItem> m() {
        return this.b;
    }

    public int n() {
        return this.c.size();
    }

    public List<CollectionDecorateRequest$ProtoDecorateTrackItem> o() {
        return this.c;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.a.size(); i++) {
            codedOutputStream.M(3, this.a.get(i));
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            codedOutputStream.M(4, this.b.get(i2));
        }
        for (int i3 = 0; i3 < this.c.size(); i3++) {
            codedOutputStream.M(5, this.c.get(i3));
        }
        this.unknownFields.l(codedOutputStream);
    }
}
