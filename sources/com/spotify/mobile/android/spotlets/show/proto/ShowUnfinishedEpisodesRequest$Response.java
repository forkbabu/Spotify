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

public final class ShowUnfinishedEpisodesRequest$Response extends GeneratedMessageLite<ShowUnfinishedEpisodesRequest$Response, a> implements Object {
    private static final ShowUnfinishedEpisodesRequest$Response c;
    private static volatile x<ShowUnfinishedEpisodesRequest$Response> f;
    private o.i<ShowUnfinishedEpisodesRequest$Show> a = GeneratedMessageLite.emptyProtobufList();
    private o.i<ShowUnfinishedEpisodesRequest$Episode> b = GeneratedMessageLite.emptyProtobufList();

    public static final class a extends GeneratedMessageLite.b<ShowUnfinishedEpisodesRequest$Response, a> implements Object {
        private a() {
            super(ShowUnfinishedEpisodesRequest$Response.c);
        }
    }

    static {
        ShowUnfinishedEpisodesRequest$Response showUnfinishedEpisodesRequest$Response = new ShowUnfinishedEpisodesRequest$Response();
        c = showUnfinishedEpisodesRequest$Response;
        showUnfinishedEpisodesRequest$Response.makeImmutable();
    }

    private ShowUnfinishedEpisodesRequest$Response() {
    }

    public static ShowUnfinishedEpisodesRequest$Response l(byte[] bArr) {
        return (ShowUnfinishedEpisodesRequest$Response) GeneratedMessageLite.parseFrom(c, bArr);
    }

    public static x<ShowUnfinishedEpisodesRequest$Response> parser() {
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
                ShowUnfinishedEpisodesRequest$Response showUnfinishedEpisodesRequest$Response = (ShowUnfinishedEpisodesRequest$Response) obj2;
                this.a = hVar.q(this.a, showUnfinishedEpisodesRequest$Response.a);
                this.b = hVar.q(this.b, showUnfinishedEpisodesRequest$Response.b);
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
                                this.a.add(gVar.o(ShowUnfinishedEpisodesRequest$Show.parser(), kVar));
                            } else if (B == 18) {
                                if (!this.b.R0()) {
                                    this.b = GeneratedMessageLite.mutableCopy(this.b);
                                }
                                this.b.add(gVar.o(ShowUnfinishedEpisodesRequest$Episode.parser(), kVar));
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
                return new ShowUnfinishedEpisodesRequest$Response();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (ShowUnfinishedEpisodesRequest$Response.class) {
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

    public List<ShowUnfinishedEpisodesRequest$Episode> i() {
        return this.b;
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
