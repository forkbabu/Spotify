package com.spotify.messages;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class ProcessedSensorData extends GeneratedMessageLite<ProcessedSensorData, b> implements Object {
    private static final ProcessedSensorData q;
    private static volatile x<ProcessedSensorData> r;
    private int a;
    private String b = "";
    private String c = "";
    private double f;
    private double n;
    private double o;
    private double p;

    public static final class b extends GeneratedMessageLite.b<ProcessedSensorData, b> implements Object {
        public b m(String str) {
            copyOnWrite();
            ProcessedSensorData.m((ProcessedSensorData) this.instance, str);
            return this;
        }

        public b n(double d) {
            copyOnWrite();
            ProcessedSensorData.o((ProcessedSensorData) this.instance, d);
            return this;
        }

        public b o(double d) {
            copyOnWrite();
            ProcessedSensorData.i((ProcessedSensorData) this.instance, d);
            return this;
        }

        public b p(double d) {
            copyOnWrite();
            ProcessedSensorData.n((ProcessedSensorData) this.instance, d);
            return this;
        }

        public b q(String str) {
            copyOnWrite();
            ProcessedSensorData.h((ProcessedSensorData) this.instance, str);
            return this;
        }

        public b r(double d) {
            copyOnWrite();
            ProcessedSensorData.l((ProcessedSensorData) this.instance, d);
            return this;
        }

        private b() {
            super(ProcessedSensorData.q);
        }
    }

    static {
        ProcessedSensorData processedSensorData = new ProcessedSensorData();
        q = processedSensorData;
        processedSensorData.makeImmutable();
    }

    private ProcessedSensorData() {
    }

    static void h(ProcessedSensorData processedSensorData, String str) {
        processedSensorData.getClass();
        str.getClass();
        processedSensorData.a |= 1;
        processedSensorData.b = str;
    }

    static void i(ProcessedSensorData processedSensorData, double d) {
        processedSensorData.a |= 16;
        processedSensorData.o = d;
    }

    static void l(ProcessedSensorData processedSensorData, double d) {
        processedSensorData.a |= 32;
        processedSensorData.p = d;
    }

    static void m(ProcessedSensorData processedSensorData, String str) {
        processedSensorData.getClass();
        str.getClass();
        processedSensorData.a |= 2;
        processedSensorData.c = str;
    }

    static void n(ProcessedSensorData processedSensorData, double d) {
        processedSensorData.a |= 4;
        processedSensorData.f = d;
    }

    static void o(ProcessedSensorData processedSensorData, double d) {
        processedSensorData.a |= 8;
        processedSensorData.n = d;
    }

    public static b p() {
        return (b) q.toBuilder();
    }

    public static x<ProcessedSensorData> parser() {
        return q.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return q;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ProcessedSensorData processedSensorData = (ProcessedSensorData) obj2;
                this.b = hVar.n((this.a & 1) == 1, this.b, (processedSensorData.a & 1) == 1, processedSensorData.b);
                this.c = hVar.n((this.a & 2) == 2, this.c, (processedSensorData.a & 2) == 2, processedSensorData.c);
                this.f = hVar.t((this.a & 4) == 4, this.f, (processedSensorData.a & 4) == 4, processedSensorData.f);
                this.n = hVar.t((this.a & 8) == 8, this.n, (processedSensorData.a & 8) == 8, processedSensorData.n);
                this.o = hVar.t((this.a & 16) == 16, this.o, (processedSensorData.a & 16) == 16, processedSensorData.o);
                this.p = hVar.t((this.a & 32) == 32, this.p, (processedSensorData.a & 32) == 32, processedSensorData.p);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= processedSensorData.a;
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
                            } else if (B == 18) {
                                String z3 = gVar.z();
                                this.a |= 2;
                                this.c = z3;
                            } else if (B == 25) {
                                this.a |= 4;
                                this.f = gVar.j();
                            } else if (B == 33) {
                                this.a |= 8;
                                this.n = gVar.j();
                            } else if (B == 41) {
                                this.a |= 16;
                                this.o = gVar.j();
                            } else if (B == 49) {
                                this.a |= 32;
                                this.p = gVar.j();
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
                return new ProcessedSensorData();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (r == null) {
                    synchronized (ProcessedSensorData.class) {
                        if (r == null) {
                            r = new GeneratedMessageLite.c(q);
                        }
                    }
                }
                return r;
            default:
                throw new UnsupportedOperationException();
        }
        return q;
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
            i2 += CodedOutputStream.p(2, this.c);
        }
        if ((this.a & 4) == 4) {
            i2 += CodedOutputStream.g(3, this.f);
        }
        if ((this.a & 8) == 8) {
            i2 += CodedOutputStream.g(4, this.n);
        }
        if ((this.a & 16) == 16) {
            i2 += CodedOutputStream.g(5, this.o);
        }
        if ((this.a & 32) == 32) {
            i2 += CodedOutputStream.g(6, this.p);
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
            codedOutputStream.P(2, this.c);
        }
        if ((this.a & 4) == 4) {
            codedOutputStream.E(3, this.f);
        }
        if ((this.a & 8) == 8) {
            codedOutputStream.E(4, this.n);
        }
        if ((this.a & 16) == 16) {
            codedOutputStream.E(5, this.o);
        }
        if ((this.a & 32) == 32) {
            codedOutputStream.E(6, this.p);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
