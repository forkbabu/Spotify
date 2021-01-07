package com.spotify.contexts;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class ApplicationAndroid extends GeneratedMessageLite<ApplicationAndroid, b> implements Object {
    private static final ApplicationAndroid f;
    private static volatile x<ApplicationAndroid> n;
    private int a;
    private String b = "";
    private long c;

    public static final class b extends GeneratedMessageLite.b<ApplicationAndroid, b> implements Object {
        public b m(long j) {
            copyOnWrite();
            ApplicationAndroid.i((ApplicationAndroid) this.instance, j);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            ApplicationAndroid.h((ApplicationAndroid) this.instance, str);
            return this;
        }

        private b() {
            super(ApplicationAndroid.f);
        }
    }

    static {
        ApplicationAndroid applicationAndroid = new ApplicationAndroid();
        f = applicationAndroid;
        applicationAndroid.makeImmutable();
    }

    private ApplicationAndroid() {
    }

    static void h(ApplicationAndroid applicationAndroid, String str) {
        applicationAndroid.getClass();
        str.getClass();
        applicationAndroid.a |= 1;
        applicationAndroid.b = str;
    }

    static void i(ApplicationAndroid applicationAndroid, long j) {
        applicationAndroid.a |= 2;
        applicationAndroid.c = j;
    }

    public static b l() {
        return (b) f.toBuilder();
    }

    public static x<ApplicationAndroid> parser() {
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
                ApplicationAndroid applicationAndroid = (ApplicationAndroid) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (applicationAndroid.a & 1) == 1, applicationAndroid.b);
                this.c = hVar.s((this.a & 2) == 2, this.c, (applicationAndroid.a & 2) == 2, applicationAndroid.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= applicationAndroid.a;
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
                                String z2 = gVar.z();
                                this.a |= 1;
                                this.b = z2;
                            } else if (B == 16) {
                                this.a |= 2;
                                this.c = gVar.w();
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
                return new ApplicationAndroid();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (ApplicationAndroid.class) {
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
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.p(1, this.b);
        }
        if ((this.a & 2) == 2) {
            i2 += CodedOutputStream.l(2, this.c);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.P(1, this.b);
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.U(2, this.c);
        }
        this.unknownFields.l(codedOutputStream);
    }
}