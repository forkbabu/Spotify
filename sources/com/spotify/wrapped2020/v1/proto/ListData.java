package com.spotify.wrapped2020.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.List;

public final class ListData extends GeneratedMessageLite<ListData, b> implements Object {
    private static final ListData f;
    private static volatile x<ListData> n;
    private int a;
    private String b = "";
    private o.i<RankedItem> c = GeneratedMessageLite.emptyProtobufList();

    public static final class b extends GeneratedMessageLite.b<ListData, b> implements Object {
        private b() {
            super(ListData.f);
        }
    }

    static {
        ListData listData = new ListData();
        f = listData;
        listData.makeImmutable();
    }

    private ListData() {
    }

    public static ListData i() {
        return f;
    }

    public static x<ListData> parser() {
        return f.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return f;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                ListData listData = (ListData) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, true ^ listData.b.isEmpty(), listData.b);
                this.c = hVar.q(this.c, listData.c);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= listData.a;
                }
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
                                this.b = gVar.A();
                            } else if (B == 18) {
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(gVar.o(RankedItem.parser(), kVar));
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
                this.c.C();
                return null;
            case 4:
                return new ListData();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (n == null) {
                    synchronized (ListData.class) {
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
        int p = !this.b.isEmpty() ? CodedOutputStream.p(1, this.b) + 0 : 0;
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            p += CodedOutputStream.n(2, this.c.get(i2));
        }
        this.memoizedSerializedSize = p;
        return p;
    }

    public List<RankedItem> h() {
        return this.c;
    }

    public String l() {
        return this.b;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.P(1, this.b);
        }
        for (int i = 0; i < this.c.size(); i++) {
            codedOutputStream.M(2, this.c.get(i));
        }
    }
}