package com.spotify.mobile.android.offline.coordinator.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.t;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.Map;

public final class OfflinePlugin$IdentifyResponse extends GeneratedMessageLite<OfflinePlugin$IdentifyResponse, a> implements Object {
    private static final OfflinePlugin$IdentifyResponse b;
    private static volatile x<OfflinePlugin$IdentifyResponse> c;
    private MapFieldLite<String, Result> a = MapFieldLite.d();

    public static final class Result extends GeneratedMessageLite<Result, a> implements Object {
        private static final Result c;
        private static volatile x<Result> f;
        private int a;
        private long b;

        public enum Status implements o.c {
            UNKNOWN(0),
            MISSING(1),
            COMPLETE(2),
            NOT_APPLICABLE(3),
            UNRECOGNIZED(-1);
            
            private final int value;

            private Status(int i) {
                this.value = i;
            }

            @Override // com.google.protobuf.o.c
            public final int getNumber() {
                return this.value;
            }
        }

        public static final class a extends GeneratedMessageLite.b<Result, a> implements Object {
            public a m(long j) {
                copyOnWrite();
                Result.i((Result) this.instance, j);
                return this;
            }

            public a n(Status status) {
                copyOnWrite();
                Result.h((Result) this.instance, status);
                return this;
            }

            private a() {
                super(Result.c);
            }
        }

        static {
            Result result = new Result();
            c = result;
            result.makeImmutable();
        }

        private Result() {
        }

        static void h(Result result, Status status) {
            result.getClass();
            status.getClass();
            result.a = status.getNumber();
        }

        static void i(Result result, long j) {
            result.b = j;
        }

        public static Result l() {
            return c;
        }

        public static a m() {
            return (a) c.toBuilder();
        }

        public static x<Result> parser() {
            return c.getParserForType();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return c;
                case 1:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    Result result = (Result) obj2;
                    int i = this.a;
                    boolean z2 = i != 0;
                    int i2 = result.a;
                    this.a = hVar.m(z2, i, i2 != 0, i2);
                    long j = this.b;
                    boolean z3 = j != 0;
                    long j2 = result.b;
                    this.b = hVar.s(z3, j, j2 != 0, j2);
                    return this;
                case 2:
                    g gVar = (g) obj;
                    k kVar = (k) obj2;
                    while (!z) {
                        try {
                            int B = gVar.B();
                            if (B != 0) {
                                if (B == 8) {
                                    this.a = gVar.u();
                                } else if (B == 16) {
                                    this.b = gVar.w();
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
                    return new Result();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (f == null) {
                        synchronized (Result.class) {
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
            if (this.a != Status.UNKNOWN.getNumber()) {
                i2 = 0 + CodedOutputStream.h(1, this.a);
            }
            long j = this.b;
            if (j != 0) {
                i2 += CodedOutputStream.l(2, j);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (this.a != Status.UNKNOWN.getNumber()) {
                codedOutputStream.K(1, this.a);
            }
            long j = this.b;
            if (j != 0) {
                codedOutputStream.U(2, j);
            }
        }
    }

    public static final class a extends GeneratedMessageLite.b<OfflinePlugin$IdentifyResponse, a> implements Object {
        public a m(String str, Result result) {
            str.getClass();
            result.getClass();
            copyOnWrite();
            ((MapFieldLite) OfflinePlugin$IdentifyResponse.h((OfflinePlugin$IdentifyResponse) this.instance)).put(str, result);
            return this;
        }

        private a() {
            super(OfflinePlugin$IdentifyResponse.b);
        }
    }

    private static final class b {
        static final t<String, Result> a = t.b(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Result.l());
    }

    static {
        OfflinePlugin$IdentifyResponse offlinePlugin$IdentifyResponse = new OfflinePlugin$IdentifyResponse();
        b = offlinePlugin$IdentifyResponse;
        offlinePlugin$IdentifyResponse.makeImmutable();
    }

    private OfflinePlugin$IdentifyResponse() {
    }

    static Map h(OfflinePlugin$IdentifyResponse offlinePlugin$IdentifyResponse) {
        if (!offlinePlugin$IdentifyResponse.a.f()) {
            offlinePlugin$IdentifyResponse.a = offlinePlugin$IdentifyResponse.a.k();
        }
        return offlinePlugin$IdentifyResponse.a;
    }

    public static a i() {
        return (a) b.toBuilder();
    }

    public static x<OfflinePlugin$IdentifyResponse> parser() {
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
                this.a = ((GeneratedMessageLite.h) obj).c(this.a, ((OfflinePlugin$IdentifyResponse) obj2).a);
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
                                if (!this.a.f()) {
                                    this.a = this.a.k();
                                }
                                b.a.d(this.a, gVar, kVar);
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
                this.a.g();
                return null;
            case 4:
                return new OfflinePlugin$IdentifyResponse();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (c == null) {
                    synchronized (OfflinePlugin$IdentifyResponse.class) {
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
        for (Map.Entry<String, Result> entry : this.a.entrySet()) {
            i2 = je.j1(entry, b.a, 1, entry.getKey(), i2);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (Map.Entry<String, Result> entry : this.a.entrySet()) {
            b.a.e(codedOutputStream, 1, entry.getKey(), entry.getValue());
        }
    }
}
