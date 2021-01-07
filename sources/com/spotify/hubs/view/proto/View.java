package com.spotify.hubs.view.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Struct;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.x;
import com.spotify.hubs.view.proto.Component;
import java.io.IOException;
import java.util.List;

public final class View extends GeneratedMessageLite<View, b> implements Object {
    private static final View r;
    private static volatile x<View> s;
    private int a;
    private String b = "";
    private String c = "";
    private Component f;
    private o.i<Component> n = GeneratedMessageLite.emptyProtobufList();
    private o.i<Component> o = GeneratedMessageLite.emptyProtobufList();
    private String p = "";
    private Struct q;

    public static final class b extends GeneratedMessageLite.b<View, b> implements Object {
        private b() {
            super(View.r);
        }
    }

    static {
        View view = new View();
        r = view;
        view.makeImmutable();
    }

    private View() {
    }

    public static View p(byte[] bArr) {
        return (View) GeneratedMessageLite.parseFrom(r, bArr);
    }

    public static x<View> parser() {
        return r.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return r;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                View view = (View) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, !view.b.isEmpty(), view.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, !view.c.isEmpty(), view.c);
                this.f = (Component) hVar.i(this.f, view.f);
                this.n = hVar.q(this.n, view.n);
                this.o = hVar.q(this.o, view.o);
                this.p = hVar.n(!this.p.isEmpty(), this.p, true ^ view.p.isEmpty(), view.p);
                this.q = (Struct) hVar.i(this.q, view.q);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= view.a;
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
                                this.c = gVar.A();
                            } else if (B == 26) {
                                Component component = this.f;
                                Component.b bVar = component != null ? (Component.b) component.toBuilder() : null;
                                Component component2 = (Component) gVar.o(Component.parser(), kVar);
                                this.f = component2;
                                if (bVar != null) {
                                    bVar.mergeFrom((Component.b) component2);
                                    this.f = (Component) bVar.buildPartial();
                                }
                            } else if (B == 34) {
                                if (!this.n.R0()) {
                                    this.n = GeneratedMessageLite.mutableCopy(this.n);
                                }
                                this.n.add(gVar.o(Component.parser(), kVar));
                            } else if (B == 42) {
                                if (!this.o.R0()) {
                                    this.o = GeneratedMessageLite.mutableCopy(this.o);
                                }
                                this.o.add(gVar.o(Component.parser(), kVar));
                            } else if (B == 50) {
                                this.p = gVar.A();
                            } else if (B == 58) {
                                Struct struct = this.q;
                                Struct.b bVar2 = struct != null ? (Struct.b) struct.toBuilder() : null;
                                Struct struct2 = (Struct) gVar.o(Struct.parser(), kVar);
                                this.q = struct2;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((Struct.b) struct2);
                                    this.q = (Struct) bVar2.buildPartial();
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
                this.n.C();
                this.o.C();
                return null;
            case 4:
                return new View();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (s == null) {
                    synchronized (View.class) {
                        if (s == null) {
                            s = new GeneratedMessageLite.c(r);
                        }
                    }
                }
                return s;
            default:
                throw new UnsupportedOperationException();
        }
        return r;
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
            p2 += CodedOutputStream.n(3, m());
        }
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            p2 += CodedOutputStream.n(4, this.n.get(i2));
        }
        for (int i3 = 0; i3 < this.o.size(); i3++) {
            p2 += CodedOutputStream.n(5, this.o.get(i3));
        }
        if (!this.p.isEmpty()) {
            p2 += CodedOutputStream.p(6, this.p);
        }
        if (this.q != null) {
            p2 += CodedOutputStream.n(7, i());
        }
        this.memoizedSerializedSize = p2;
        return p2;
    }

    public List<Component> h() {
        return this.n;
    }

    public Struct i() {
        Struct struct = this.q;
        return struct == null ? Struct.h() : struct;
    }

    public String l() {
        return this.p;
    }

    public Component m() {
        Component component = this.f;
        return component == null ? Component.m() : component;
    }

    public String n() {
        return this.b;
    }

    public String o() {
        return this.c;
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
            codedOutputStream.M(3, m());
        }
        for (int i = 0; i < this.n.size(); i++) {
            codedOutputStream.M(4, this.n.get(i));
        }
        for (int i2 = 0; i2 < this.o.size(); i2++) {
            codedOutputStream.M(5, this.o.get(i2));
        }
        if (!this.p.isEmpty()) {
            codedOutputStream.P(6, this.p);
        }
        if (this.q != null) {
            codedOutputStream.M(7, i());
        }
    }
}
