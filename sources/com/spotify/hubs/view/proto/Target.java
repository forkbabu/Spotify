package com.spotify.hubs.view.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Struct;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.hubs.view.proto.View;
import java.io.IOException;

public final class Target extends GeneratedMessageLite<Target, b> implements Object {
    private static final Target o;
    private static volatile x<Target> p;
    private int a;
    private String b = "";
    private o.i<String> c = GeneratedMessageLite.emptyProtobufList();
    private View f;
    private Struct n;

    public static final class b extends GeneratedMessageLite.b<Target, b> implements Object {
        private b() {
            super(Target.o);
        }
    }

    static {
        Target target = new Target();
        o = target;
        target.makeImmutable();
    }

    private Target() {
    }

    public static x<Target> parser() {
        return o.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return o;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Target target = (Target) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, true ^ target.b.isEmpty(), target.b);
                this.c = hVar.q(this.c, target.c);
                this.f = (View) hVar.i(this.f, target.f);
                this.n = (Struct) hVar.i(this.n, target.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= target.a;
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
                                String A = gVar.A();
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(A);
                            } else if (B == 26) {
                                View view = this.f;
                                View.b bVar = view != null ? (View.b) view.toBuilder() : null;
                                View view2 = (View) gVar.o(View.parser(), kVar);
                                this.f = view2;
                                if (bVar != null) {
                                    bVar.mergeFrom((View.b) view2);
                                    this.f = (View) bVar.buildPartial();
                                }
                            } else if (B == 34) {
                                Struct struct = this.n;
                                Struct.b bVar2 = struct != null ? (Struct.b) struct.toBuilder() : null;
                                Struct struct2 = (Struct) gVar.o(Struct.parser(), kVar);
                                this.n = struct2;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((Struct.b) struct2);
                                    this.n = (Struct) bVar2.buildPartial();
                                }
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
                return new Target();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (Target.class) {
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
        int p2 = !this.b.isEmpty() ? CodedOutputStream.p(1, this.b) + 0 : 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.c.size(); i3++) {
            i2 += CodedOutputStream.q(this.c.get(i3));
        }
        int C0 = je.C0(this.c, 1, p2 + i2);
        View view = this.f;
        if (view != null) {
            C0 += CodedOutputStream.n(3, view);
        }
        Struct struct = this.n;
        if (struct != null) {
            C0 += CodedOutputStream.n(4, struct);
        }
        this.memoizedSerializedSize = C0;
        return C0;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.P(1, this.b);
        }
        for (int i = 0; i < this.c.size(); i++) {
            codedOutputStream.P(2, this.c.get(i));
        }
        View view = this.f;
        if (view != null) {
            codedOutputStream.M(3, view);
        }
        Struct struct = this.n;
        if (struct != null) {
            codedOutputStream.M(4, struct);
        }
    }
}
