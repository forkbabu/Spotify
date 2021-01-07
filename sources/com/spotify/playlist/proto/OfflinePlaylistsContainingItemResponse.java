package com.spotify.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class OfflinePlaylistsContainingItemResponse extends GeneratedMessageLite<OfflinePlaylistsContainingItemResponse, b> implements Object {
    private static final OfflinePlaylistsContainingItemResponse c;
    private static volatile x<OfflinePlaylistsContainingItemResponse> f;
    private o.i<OfflinePlaylistContainingItem> a = GeneratedMessageLite.emptyProtobufList();
    private byte b = -1;

    public static final class b extends GeneratedMessageLite.b<OfflinePlaylistsContainingItemResponse, b> implements Object {
        private b() {
            super(OfflinePlaylistsContainingItemResponse.c);
        }
    }

    static {
        OfflinePlaylistsContainingItemResponse offlinePlaylistsContainingItemResponse = new OfflinePlaylistsContainingItemResponse();
        c = offlinePlaylistsContainingItemResponse;
        offlinePlaylistsContainingItemResponse.makeImmutable();
    }

    private OfflinePlaylistsContainingItemResponse() {
    }

    public static OfflinePlaylistsContainingItemResponse h() {
        return c;
    }

    public static x<OfflinePlaylistsContainingItemResponse> parser() {
        return c.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                byte b2 = this.b;
                if (b2 == 1) {
                    return c;
                }
                if (b2 == 0) {
                    return null;
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                for (int i = 0; i < this.a.size(); i++) {
                    if (!this.a.get(i).isInitialized()) {
                        if (booleanValue) {
                            this.b = 0;
                        }
                        return null;
                    }
                }
                if (booleanValue) {
                    this.b = 1;
                }
                return c;
            case 1:
                this.a = ((GeneratedMessageLite.h) obj).q(this.a, ((OfflinePlaylistsContainingItemResponse) obj2).a);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                if (!this.a.R0()) {
                                    this.a = GeneratedMessageLite.mutableCopy(this.a);
                                }
                                this.a.add(gVar.o(OfflinePlaylistContainingItem.parser(), kVar));
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
                return null;
            case 4:
                return new OfflinePlaylistsContainingItemResponse();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (OfflinePlaylistsContainingItemResponse.class) {
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
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public List<OfflinePlaylistContainingItem> i() {
        return this.a;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.a.size(); i++) {
            codedOutputStream.M(1, this.a.get(i));
        }
        this.unknownFields.l(codedOutputStream);
    }
}
