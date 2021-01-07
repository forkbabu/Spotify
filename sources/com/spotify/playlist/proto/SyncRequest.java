package com.spotify.playlist.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class SyncRequest extends GeneratedMessageLite<SyncRequest, b> implements Object {
    private static final SyncRequest b;
    private static volatile x<SyncRequest> c;
    private o.i<String> a = GeneratedMessageLite.emptyProtobufList();

    public static final class b extends GeneratedMessageLite.b<SyncRequest, b> implements Object {
        public b m(Iterable<String> iterable) {
            copyOnWrite();
            SyncRequest.h((SyncRequest) this.instance, iterable);
            return this;
        }

        private b() {
            super(SyncRequest.b);
        }
    }

    static {
        SyncRequest syncRequest = new SyncRequest();
        b = syncRequest;
        syncRequest.makeImmutable();
    }

    private SyncRequest() {
    }

    static void h(SyncRequest syncRequest, Iterable iterable) {
        if (!syncRequest.a.R0()) {
            syncRequest.a = GeneratedMessageLite.mutableCopy(syncRequest.a);
        }
        com.google.protobuf.a.addAll(iterable, syncRequest.a);
    }

    public static b i() {
        return (b) b.toBuilder();
    }

    public static x<SyncRequest> parser() {
        return b.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return b;
            case 1:
                this.a = ((GeneratedMessageLite.h) obj).q(this.a, ((SyncRequest) obj2).a);
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
                                String A = gVar.A();
                                if (!this.a.R0()) {
                                    this.a = GeneratedMessageLite.mutableCopy(this.a);
                                }
                                this.a.add(A);
                            } else if (!gVar.F(B)) {
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
                return new SyncRequest();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (c == null) {
                    synchronized (SyncRequest.class) {
                        if (c == null) {
                            c = new GeneratedMessageLite.c(b);
                        }
                    }
                }
                return c;
            default:
                throw new UnsupportedOperationException();
        }
        return b;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            i2 += CodedOutputStream.q(this.a.get(i3));
        }
        int C0 = je.C0(this.a, 1, 0 + i2);
        this.memoizedSerializedSize = C0;
        return C0;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.a.size(); i++) {
            codedOutputStream.P(1, this.a.get(i));
        }
    }
}
