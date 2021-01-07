package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;

public final class AndroidClientReport extends GeneratedMessageLite<AndroidClientReport, b> implements Object {
    private static final AndroidClientReport n;
    private static volatile x<AndroidClientReport> o;
    private int a;
    private String b = "";
    private o.i<String> c = GeneratedMessageLite.emptyProtobufList();
    private String f = "";

    public static final class b extends GeneratedMessageLite.b<AndroidClientReport, b> implements Object {
        public b m(Iterable<String> iterable) {
            copyOnWrite();
            AndroidClientReport.i((AndroidClientReport) this.instance, iterable);
            return this;
        }

        public b n(String str) {
            copyOnWrite();
            AndroidClientReport.l((AndroidClientReport) this.instance, str);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            AndroidClientReport.h((AndroidClientReport) this.instance, str);
            return this;
        }

        private b() {
            super(AndroidClientReport.n);
        }
    }

    static {
        AndroidClientReport androidClientReport = new AndroidClientReport();
        n = androidClientReport;
        androidClientReport.makeImmutable();
    }

    private AndroidClientReport() {
    }

    static void h(AndroidClientReport androidClientReport, String str) {
        androidClientReport.getClass();
        str.getClass();
        androidClientReport.a |= 1;
        androidClientReport.b = str;
    }

    static void i(AndroidClientReport androidClientReport, Iterable iterable) {
        if (!androidClientReport.c.R0()) {
            androidClientReport.c = GeneratedMessageLite.mutableCopy(androidClientReport.c);
        }
        com.google.protobuf.a.addAll(iterable, androidClientReport.c);
    }

    static void l(AndroidClientReport androidClientReport, String str) {
        androidClientReport.getClass();
        str.getClass();
        androidClientReport.a |= 2;
        androidClientReport.f = str;
    }

    public static b m() {
        return (b) n.toBuilder();
    }

    public static x<AndroidClientReport> parser() {
        return n.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return n;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                AndroidClientReport androidClientReport = (AndroidClientReport) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (androidClientReport.a & 1) == 1, androidClientReport.b);
                this.c = hVar.q(this.c, androidClientReport.c);
                boolean z2 = (this.a & 2) == 2;
                String str = this.f;
                if ((androidClientReport.a & 2) == 2) {
                    z = true;
                }
                this.f = hVar.n(z2, str, z, androidClientReport.f);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= androidClientReport.a;
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
                                String z3 = gVar.z();
                                this.a |= 1;
                                this.b = z3;
                            } else if (B == 18) {
                                String z4 = gVar.z();
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(z4);
                            } else if (B == 26) {
                                String z5 = gVar.z();
                                this.a |= 2;
                                this.f = z5;
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
                this.c.C();
                return null;
            case 4:
                return new AndroidClientReport();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (AndroidClientReport.class) {
                        if (o == null) {
                            o = new GeneratedMessageLite.c(n);
                        }
                    }
                }
                return o;
            default:
                throw new UnsupportedOperationException();
        }
        return n;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int p = (this.a & 1) == 1 ? CodedOutputStream.p(1, this.b) + 0 : 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.c.size(); i3++) {
            i2 += CodedOutputStream.q(this.c.get(i3));
        }
        int C0 = je.C0(this.c, 1, p + i2);
        if ((this.a & 2) == 2) {
            C0 += CodedOutputStream.p(3, this.f);
        }
        int c2 = this.unknownFields.c() + C0;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.P(1, this.b);
        }
        for (int i = 0; i < this.c.size(); i++) {
            codedOutputStream.P(2, this.c.get(i));
        }
        if ((this.a & 2) == 2) {
            codedOutputStream.P(3, this.f);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
