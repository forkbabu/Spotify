package com.spotify.music.podcastinteractivity.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class PollOption extends GeneratedMessageLite<PollOption, b> implements Object {
    private static final PollOption n;
    private static volatile x<PollOption> o;
    private String a = "";
    private int b;
    private int c;
    private int f;

    public static final class b extends GeneratedMessageLite.b<PollOption, b> implements Object {
        private b() {
            super(PollOption.n);
        }
    }

    static {
        PollOption pollOption = new PollOption();
        n = pollOption;
        pollOption.makeImmutable();
    }

    private PollOption() {
    }

    public static x<PollOption> parser() {
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
                PollOption pollOption = (PollOption) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, !pollOption.a.isEmpty(), pollOption.a);
                int i = this.b;
                boolean z2 = i != 0;
                int i2 = pollOption.b;
                this.b = hVar.m(z2, i, i2 != 0, i2);
                int i3 = this.c;
                boolean z3 = i3 != 0;
                int i4 = pollOption.c;
                this.c = hVar.m(z3, i3, i4 != 0, i4);
                int i5 = this.f;
                boolean z4 = i5 != 0;
                int i6 = pollOption.f;
                if (i6 != 0) {
                    z = true;
                }
                this.f = hVar.m(z4, i5, z, i6);
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
                                this.b = gVar.u();
                            } else if (B == 24) {
                                this.c = gVar.u();
                            } else if (B == 32) {
                                this.f = gVar.u();
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
                return new PollOption();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (o == null) {
                    synchronized (PollOption.class) {
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
        int i2 = 0;
        if (!this.a.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.a);
        }
        int i3 = this.b;
        if (i3 != 0) {
            i2 += CodedOutputStream.j(2, i3);
        }
        int i4 = this.c;
        if (i4 != 0) {
            i2 += CodedOutputStream.j(3, i4);
        }
        int i5 = this.f;
        if (i5 != 0) {
            i2 += CodedOutputStream.j(4, i5);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String h() {
        return this.a;
    }

    public int i() {
        return this.f;
    }

    public int l() {
        return this.c;
    }

    public int m() {
        return this.b;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        int i = this.b;
        if (i != 0) {
            codedOutputStream.K(2, i);
        }
        int i2 = this.c;
        if (i2 != 0) {
            codedOutputStream.K(3, i2);
        }
        int i3 = this.f;
        if (i3 != 0) {
            codedOutputStream.K(4, i3);
        }
    }
}
