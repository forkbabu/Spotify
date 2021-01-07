package com.spotify.ondemandselector.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class OndemandResponse extends GeneratedMessageLite<OndemandResponse, b> implements Object {
    private static final OndemandResponse f;
    private static volatile x<OndemandResponse> n;
    private int a;
    private o.i<String> b = GeneratedMessageLite.emptyProtobufList();
    private long c;

    public static final class b extends GeneratedMessageLite.b<OndemandResponse, b> implements Object {
        private b() {
            super(OndemandResponse.f);
        }
    }

    static {
        OndemandResponse ondemandResponse = new OndemandResponse();
        f = ondemandResponse;
        ondemandResponse.makeImmutable();
    }

    private OndemandResponse() {
    }

    public static x<OndemandResponse> parser() {
        return f.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return f;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                OndemandResponse ondemandResponse = (OndemandResponse) obj2;
                this.b = hVar.q(this.b, ondemandResponse.b);
                long j = this.c;
                boolean z2 = j != 0;
                long j2 = ondemandResponse.c;
                this.c = hVar.s(z2, j, j2 != 0, j2);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= ondemandResponse.a;
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
                                String A = gVar.A();
                                if (!this.b.R0()) {
                                    this.b = GeneratedMessageLite.mutableCopy(this.b);
                                }
                                this.b.add(A);
                            } else if (B == 16) {
                                this.c = gVar.w();
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
                this.b.C();
                return null;
            case 4:
                return new OndemandResponse();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (OndemandResponse.class) {
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
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            i2 += CodedOutputStream.q(this.b.get(i3));
        }
        int C0 = je.C0(this.b, 1, 0 + i2);
        long j = this.c;
        if (j != 0) {
            C0 += CodedOutputStream.l(2, j);
        }
        this.memoizedSerializedSize = C0;
        return C0;
    }

    public List<String> h() {
        return this.b;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.b.size(); i++) {
            codedOutputStream.P(1, this.b.get(i));
        }
        long j = this.c;
        if (j != 0) {
            codedOutputStream.U(2, j);
        }
    }
}
