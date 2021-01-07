package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class ShowState$ProtoShowPlayState extends GeneratedMessageLite<ShowState$ProtoShowPlayState, a> implements Object {
    private static final ShowState$ProtoShowPlayState c;
    private static volatile x<ShowState$ProtoShowPlayState> f;
    private int a;
    private String b = "";

    public static final class a extends GeneratedMessageLite.b<ShowState$ProtoShowPlayState, a> implements Object {
        private a() {
            super(ShowState$ProtoShowPlayState.c);
        }
    }

    static {
        ShowState$ProtoShowPlayState showState$ProtoShowPlayState = new ShowState$ProtoShowPlayState();
        c = showState$ProtoShowPlayState;
        showState$ProtoShowPlayState.makeImmutable();
    }

    private ShowState$ProtoShowPlayState() {
    }

    public static ShowState$ProtoShowPlayState h() {
        return c;
    }

    public static x<ShowState$ProtoShowPlayState> parser() {
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
                ShowState$ProtoShowPlayState showState$ProtoShowPlayState = (ShowState$ProtoShowPlayState) obj2;
                boolean z2 = (this.a & 1) == 1;
                String str = this.b;
                if ((showState$ProtoShowPlayState.a & 1) == 1) {
                    z = true;
                }
                this.b = hVar.n(z2, str, z, showState$ProtoShowPlayState.b);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= showState$ProtoShowPlayState.a;
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
                return new ShowState$ProtoShowPlayState();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (ShowState$ProtoShowPlayState.class) {
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
        if ((this.a & 1) == 1) {
            i2 = 0 + CodedOutputStream.p(1, this.b);
        }
        int c2 = this.unknownFields.c() + i2;
        this.memoizedSerializedSize = c2;
        return c2;
    }

    public String i() {
        return this.b;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.a & 1) == 1) {
            codedOutputStream.P(1, this.b);
        }
        this.unknownFields.l(codedOutputStream);
    }
}
