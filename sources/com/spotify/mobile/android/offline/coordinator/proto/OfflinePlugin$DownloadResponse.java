package com.spotify.mobile.android.offline.coordinator.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class OfflinePlugin$DownloadResponse extends GeneratedMessageLite<OfflinePlugin$DownloadResponse, a> implements Object {
    private static final OfflinePlugin$DownloadResponse o;
    private static volatile x<OfflinePlugin$DownloadResponse> p;
    private String a = "";
    private boolean b;
    private long c;
    private long f;
    private int n;

    public enum Error implements o.c {
        OK(0),
        TEMPORARY_ERROR(1),
        PERMANENT_ERROR(2),
        DISK_FULL(3),
        UNRECOGNIZED(-1);
        
        private final int value;

        private Error(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public final int getNumber() {
            return this.value;
        }
    }

    public static final class a extends GeneratedMessageLite.b<OfflinePlugin$DownloadResponse, a> implements Object {
        public a m(long j) {
            copyOnWrite();
            OfflinePlugin$DownloadResponse.m((OfflinePlugin$DownloadResponse) this.instance, j);
            return this;
        }

        public a n(boolean z) {
            copyOnWrite();
            OfflinePlugin$DownloadResponse.i((OfflinePlugin$DownloadResponse) this.instance, z);
            return this;
        }

        public a o(Error error) {
            copyOnWrite();
            OfflinePlugin$DownloadResponse.n((OfflinePlugin$DownloadResponse) this.instance, error);
            return this;
        }

        public a p(long j) {
            copyOnWrite();
            OfflinePlugin$DownloadResponse.l((OfflinePlugin$DownloadResponse) this.instance, j);
            return this;
        }

        public a q(String str) {
            copyOnWrite();
            OfflinePlugin$DownloadResponse.h((OfflinePlugin$DownloadResponse) this.instance, str);
            return this;
        }

        private a() {
            super(OfflinePlugin$DownloadResponse.o);
        }
    }

    static {
        OfflinePlugin$DownloadResponse offlinePlugin$DownloadResponse = new OfflinePlugin$DownloadResponse();
        o = offlinePlugin$DownloadResponse;
        offlinePlugin$DownloadResponse.makeImmutable();
    }

    private OfflinePlugin$DownloadResponse() {
    }

    static void h(OfflinePlugin$DownloadResponse offlinePlugin$DownloadResponse, String str) {
        offlinePlugin$DownloadResponse.getClass();
        str.getClass();
        offlinePlugin$DownloadResponse.a = str;
    }

    static void i(OfflinePlugin$DownloadResponse offlinePlugin$DownloadResponse, boolean z) {
        offlinePlugin$DownloadResponse.b = z;
    }

    static void l(OfflinePlugin$DownloadResponse offlinePlugin$DownloadResponse, long j) {
        offlinePlugin$DownloadResponse.c = j;
    }

    static void m(OfflinePlugin$DownloadResponse offlinePlugin$DownloadResponse, long j) {
        offlinePlugin$DownloadResponse.f = j;
    }

    static void n(OfflinePlugin$DownloadResponse offlinePlugin$DownloadResponse, Error error) {
        offlinePlugin$DownloadResponse.getClass();
        error.getClass();
        offlinePlugin$DownloadResponse.n = error.getNumber();
    }

    public static a o() {
        return (a) o.toBuilder();
    }

    public static x<OfflinePlugin$DownloadResponse> parser() {
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
                OfflinePlugin$DownloadResponse offlinePlugin$DownloadResponse = (OfflinePlugin$DownloadResponse) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !offlinePlugin$DownloadResponse.a.isEmpty(), offlinePlugin$DownloadResponse.a);
                boolean z2 = this.b;
                boolean z3 = offlinePlugin$DownloadResponse.b;
                this.b = hVar.f(z2, z2, z3, z3);
                long j = this.c;
                boolean z4 = j != 0;
                long j2 = offlinePlugin$DownloadResponse.c;
                this.c = hVar.s(z4, j, j2 != 0, j2);
                long j3 = this.f;
                boolean z5 = j3 != 0;
                long j4 = offlinePlugin$DownloadResponse.f;
                this.f = hVar.s(z5, j3, j4 != 0, j4);
                int i = this.n;
                boolean z6 = i != 0;
                int i2 = offlinePlugin$DownloadResponse.n;
                if (i2 != 0) {
                    z = true;
                }
                this.n = hVar.m(z6, i, z, i2);
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                this.a = gVar.A();
                            } else if (B == 16) {
                                this.b = gVar.h();
                            } else if (B == 24) {
                                this.c = gVar.w();
                            } else if (B == 32) {
                                this.f = gVar.w();
                            } else if (B == 40) {
                                this.n = gVar.u();
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
                return null;
            case 4:
                return new OfflinePlugin$DownloadResponse();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (OfflinePlugin$DownloadResponse.class) {
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
        if (!this.a.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.a);
        }
        boolean z = this.b;
        if (z) {
            i2 += CodedOutputStream.d(2, z);
        }
        long j = this.c;
        if (j != 0) {
            i2 += CodedOutputStream.l(3, j);
        }
        long j2 = this.f;
        if (j2 != 0) {
            i2 += CodedOutputStream.l(4, j2);
        }
        if (this.n != Error.OK.getNumber()) {
            i2 += CodedOutputStream.h(5, this.n);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        boolean z = this.b;
        if (z) {
            codedOutputStream.A(2, z);
        }
        long j = this.c;
        if (j != 0) {
            codedOutputStream.U(3, j);
        }
        long j2 = this.f;
        if (j2 != 0) {
            codedOutputStream.U(4, j2);
        }
        if (this.n != Error.OK.getNumber()) {
            codedOutputStream.K(5, this.n);
        }
    }
}
