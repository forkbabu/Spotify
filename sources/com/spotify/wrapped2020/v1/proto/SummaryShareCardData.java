package com.spotify.wrapped2020.v1.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.wrapped2020.v1.proto.ListData;
import com.spotify.wrapped2020.v1.proto.SingleData;
import java.io.IOException;
import java.util.List;

public final class SummaryShareCardData extends GeneratedMessageLite<SummaryShareCardData, b> implements Object {
    private static final SummaryShareCardData t;
    private static volatile x<SummaryShareCardData> u;
    private int a;
    private String b = "";
    private String c = "";
    private ListData f;
    private ListData n;
    private SingleData o;
    private SingleData p;
    private int q;
    private int r;
    private o.i<SummaryShareCardColorScheme> s = GeneratedMessageLite.emptyProtobufList();

    public static final class b extends GeneratedMessageLite.b<SummaryShareCardData, b> implements Object {
        private b() {
            super(SummaryShareCardData.t);
        }
    }

    static {
        SummaryShareCardData summaryShareCardData = new SummaryShareCardData();
        t = summaryShareCardData;
        summaryShareCardData.makeImmutable();
    }

    private SummaryShareCardData() {
    }

    public static SummaryShareCardData o() {
        return t;
    }

    public static x<SummaryShareCardData> parser() {
        return t.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return t;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                SummaryShareCardData summaryShareCardData = (SummaryShareCardData) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, !summaryShareCardData.b.isEmpty(), summaryShareCardData.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !summaryShareCardData.c.isEmpty(), summaryShareCardData.c);
                this.f = (ListData) hVar.i(this.f, summaryShareCardData.f);
                this.n = (ListData) hVar.i(this.n, summaryShareCardData.n);
                this.o = (SingleData) hVar.i(this.o, summaryShareCardData.o);
                this.p = (SingleData) hVar.i(this.p, summaryShareCardData.p);
                int i = this.q;
                boolean z2 = i != 0;
                int i2 = summaryShareCardData.q;
                this.q = hVar.m(z2, i, i2 != 0, i2);
                int i3 = this.r;
                boolean z3 = i3 != 0;
                int i4 = summaryShareCardData.r;
                if (i4 != 0) {
                    z = true;
                }
                this.r = hVar.m(z3, i3, z, i4);
                this.s = hVar.q(this.s, summaryShareCardData.s);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= summaryShareCardData.a;
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
                                this.b = gVar.A();
                            } else if (B == 18) {
                                this.c = gVar.A();
                            } else if (B == 26) {
                                ListData listData = this.f;
                                ListData.b bVar = listData != null ? (ListData.b) listData.toBuilder() : null;
                                ListData listData2 = (ListData) gVar.o(ListData.parser(), kVar);
                                this.f = listData2;
                                if (bVar != null) {
                                    bVar.mergeFrom((ListData.b) listData2);
                                    this.f = (ListData) bVar.buildPartial();
                                }
                            } else if (B == 34) {
                                ListData listData3 = this.n;
                                ListData.b bVar2 = listData3 != null ? (ListData.b) listData3.toBuilder() : null;
                                ListData listData4 = (ListData) gVar.o(ListData.parser(), kVar);
                                this.n = listData4;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((ListData.b) listData4);
                                    this.n = (ListData) bVar2.buildPartial();
                                }
                            } else if (B == 42) {
                                SingleData singleData = this.o;
                                SingleData.b bVar3 = singleData != null ? (SingleData.b) singleData.toBuilder() : null;
                                SingleData singleData2 = (SingleData) gVar.o(SingleData.parser(), kVar);
                                this.o = singleData2;
                                if (bVar3 != null) {
                                    bVar3.mergeFrom((SingleData.b) singleData2);
                                    this.o = (SingleData) bVar3.buildPartial();
                                }
                            } else if (B == 50) {
                                SingleData singleData3 = this.p;
                                SingleData.b bVar4 = singleData3 != null ? (SingleData.b) singleData3.toBuilder() : null;
                                SingleData singleData4 = (SingleData) gVar.o(SingleData.parser(), kVar);
                                this.p = singleData4;
                                if (bVar4 != null) {
                                    bVar4.mergeFrom((SingleData.b) singleData4);
                                    this.p = (SingleData) bVar4.buildPartial();
                                }
                            } else if (B == 56) {
                                this.q = gVar.u();
                            } else if (B == 64) {
                                this.r = gVar.u();
                            } else if (B == 74) {
                                if (!this.s.R0()) {
                                    this.s = GeneratedMessageLite.mutableCopy(this.s);
                                }
                                this.s.add(gVar.o(SummaryShareCardColorScheme.parser(), kVar));
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
                this.s.C();
                return null;
            case 4:
                return new SummaryShareCardData();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (u == null) {
                    synchronized (SummaryShareCardData.class) {
                        if (u == null) {
                            u = new GeneratedMessageLite.c(t);
                        }
                    }
                }
                return u;
            default:
                throw new UnsupportedOperationException();
        }
        return t;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int p2 = !this.b.isEmpty() ? CodedOutputStream.p(1, this.b) + 0 : 0;
        if (!this.c.isEmpty()) {
            p2 += CodedOutputStream.p(2, this.c);
        }
        if (this.f != null) {
            p2 += CodedOutputStream.n(3, r());
        }
        if (this.n != null) {
            p2 += CodedOutputStream.n(4, s());
        }
        if (this.o != null) {
            p2 += CodedOutputStream.n(5, l());
        }
        if (this.p != null) {
            p2 += CodedOutputStream.n(6, m());
        }
        int i2 = this.q;
        Gradient gradient = Gradient.VERSION_1;
        if (i2 != gradient.getNumber()) {
            p2 += CodedOutputStream.h(7, this.q);
        }
        if (this.r != gradient.getNumber()) {
            p2 += CodedOutputStream.h(8, this.r);
        }
        for (int i3 = 0; i3 < this.s.size(); i3++) {
            p2 += CodedOutputStream.n(9, this.s.get(i3));
        }
        this.memoizedSerializedSize = p2;
        return p2;
    }

    public String h() {
        return this.b;
    }

    public Gradient i() {
        Gradient d = Gradient.d(this.q);
        return d == null ? Gradient.UNRECOGNIZED : d;
    }

    public SingleData l() {
        SingleData singleData = this.o;
        return singleData == null ? SingleData.i() : singleData;
    }

    public SingleData m() {
        SingleData singleData = this.p;
        return singleData == null ? SingleData.i() : singleData;
    }

    public List<SummaryShareCardColorScheme> n() {
        return this.s;
    }

    public Gradient p() {
        Gradient d = Gradient.d(this.r);
        return d == null ? Gradient.UNRECOGNIZED : d;
    }

    public String q() {
        return this.c;
    }

    public ListData r() {
        ListData listData = this.f;
        return listData == null ? ListData.i() : listData;
    }

    public ListData s() {
        ListData listData = this.n;
        return listData == null ? ListData.i() : listData;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.P(1, this.b);
        }
        if (!this.c.isEmpty()) {
            codedOutputStream.P(2, this.c);
        }
        if (this.f != null) {
            codedOutputStream.M(3, r());
        }
        if (this.n != null) {
            codedOutputStream.M(4, s());
        }
        if (this.o != null) {
            codedOutputStream.M(5, l());
        }
        if (this.p != null) {
            codedOutputStream.M(6, m());
        }
        int i = this.q;
        Gradient gradient = Gradient.VERSION_1;
        if (i != gradient.getNumber()) {
            codedOutputStream.K(7, this.q);
        }
        if (this.r != gradient.getNumber()) {
            codedOutputStream.K(8, this.r);
        }
        for (int i2 = 0; i2 < this.s.size(); i2++) {
            codedOutputStream.M(9, this.s.get(i2));
        }
    }
}
