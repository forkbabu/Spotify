package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class ShowDecorateRequest$ProtoDecorateResponse extends GeneratedMessageLite<ShowDecorateRequest$ProtoDecorateResponse, a> implements Object {
    private static final ShowDecorateRequest$ProtoDecorateResponse c;
    private static volatile x<ShowDecorateRequest$ProtoDecorateResponse> f;
    private o.i<ShowDecorateRequest$ProtoDecorateShowItem> a = GeneratedMessageLite.emptyProtobufList();
    private o.i<ShowDecorateRequest$ProtoDecorateEpisodeItem> b = GeneratedMessageLite.emptyProtobufList();

    public static final class a extends GeneratedMessageLite.b<ShowDecorateRequest$ProtoDecorateResponse, a> implements Object {
        private a() {
            super(ShowDecorateRequest$ProtoDecorateResponse.c);
        }
    }

    static {
        ShowDecorateRequest$ProtoDecorateResponse showDecorateRequest$ProtoDecorateResponse = new ShowDecorateRequest$ProtoDecorateResponse();
        c = showDecorateRequest$ProtoDecorateResponse;
        showDecorateRequest$ProtoDecorateResponse.makeImmutable();
    }

    private ShowDecorateRequest$ProtoDecorateResponse() {
    }

    public static ShowDecorateRequest$ProtoDecorateResponse n(byte[] bArr) {
        return (ShowDecorateRequest$ProtoDecorateResponse) GeneratedMessageLite.parseFrom(c, bArr);
    }

    public static x<ShowDecorateRequest$ProtoDecorateResponse> parser() {
        return c.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return c;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ShowDecorateRequest$ProtoDecorateResponse showDecorateRequest$ProtoDecorateResponse = (ShowDecorateRequest$ProtoDecorateResponse) obj2;
                this.a = hVar.q(this.a, showDecorateRequest$ProtoDecorateResponse.a);
                this.b = hVar.q(this.b, showDecorateRequest$ProtoDecorateResponse.b);
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
                                if (!this.a.R0()) {
                                    this.a = GeneratedMessageLite.mutableCopy(this.a);
                                }
                                this.a.add(gVar.o(ShowDecorateRequest$ProtoDecorateShowItem.parser(), kVar));
                            } else if (B == 18) {
                                if (!this.b.R0()) {
                                    this.b = GeneratedMessageLite.mutableCopy(this.b);
                                }
                                this.b.add(gVar.o(ShowDecorateRequest$ProtoDecorateEpisodeItem.parser(), kVar));
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
                return null;
            case 4:
                return new ShowDecorateRequest$ProtoDecorateResponse();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (ShowDecorateRequest$ProtoDecorateResponse.class) {
                        if (f == null) {
                            f = new GeneratedMessageLite.c(c);
                        }
                    }
                }
                return f;
            default:
                throw new UnsupportedOperationException();
        }
        return c;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            i2 += CodedOutputStream.n(1, this.a.get(i3));
        }
        for (int i4 = 0; i4 < this.b.size(); i4++) {
            i2 += CodedOutputStream.n(2, this.b.get(i4));
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public int h() {
        return this.b.size();
    }

    public List<ShowDecorateRequest$ProtoDecorateEpisodeItem> i() {
        return this.b;
    }

    public int l() {
        return this.a.size();
    }

    public List<ShowDecorateRequest$ProtoDecorateShowItem> m() {
        return this.a;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.a.size(); i++) {
            codedOutputStream.M(1, this.a.get(i));
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            codedOutputStream.M(2, this.b.get(i2));
        }
        this.unknownFields.l(codedOutputStream);
    }
}
