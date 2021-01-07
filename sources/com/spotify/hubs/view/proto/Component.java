package com.spotify.hubs.view.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Struct;
import com.google.protobuf.WireFormat;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.t;
import com.google.protobuf.x;
import com.spotify.hubs.view.proto.Images;
import com.spotify.hubs.view.proto.Target;
import com.spotify.hubs.view.proto.Text;
import com.spotify.hubs.view.proto.UIComponent;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class Component extends GeneratedMessageLite<Component, b> implements Object {
    private static final Component v;
    private static volatile x<Component> w;
    private int a;
    private String b = "";
    private String c = "";
    private UIComponent f;
    private Text n;
    private Images o;
    private Target p;
    private o.i<Component> q = GeneratedMessageLite.emptyProtobufList();
    private Struct r;
    private Struct s;
    private Struct t;
    private MapFieldLite<String, Command> u = MapFieldLite.d();

    public static final class b extends GeneratedMessageLite.b<Component, b> implements Object {
        private b() {
            super(Component.v);
        }
    }

    private static final class c {
        static final t<String, Command> a = t.b(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Command.i());
    }

    static {
        Component component = new Component();
        v = component;
        component.makeImmutable();
    }

    private Component() {
    }

    public static Component m() {
        return v;
    }

    public static x<Component> parser() {
        return v.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return v;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Component component = (Component) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, !component.b.isEmpty(), component.b);
                this.c = hVar.n(!this.c.isEmpty(), this.c, true ^ component.c.isEmpty(), component.c);
                this.f = (UIComponent) hVar.i(this.f, component.f);
                this.n = (Text) hVar.i(this.n, component.n);
                this.o = (Images) hVar.i(this.o, component.o);
                this.p = (Target) hVar.i(this.p, component.p);
                this.q = hVar.q(this.q, component.q);
                this.r = (Struct) hVar.i(this.r, component.r);
                this.s = (Struct) hVar.i(this.s, component.s);
                this.t = (Struct) hVar.i(this.t, component.t);
                this.u = hVar.c(this.u, component.u);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= component.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int B = gVar.B();
                        switch (B) {
                            case 0:
                                break;
                            case 10:
                                this.b = gVar.A();
                                continue;
                            case 18:
                                this.c = gVar.A();
                                continue;
                            case 26:
                                UIComponent uIComponent = this.f;
                                UIComponent.b bVar = uIComponent != null ? (UIComponent.b) uIComponent.toBuilder() : null;
                                UIComponent uIComponent2 = (UIComponent) gVar.o(UIComponent.parser(), kVar);
                                this.f = uIComponent2;
                                if (bVar != null) {
                                    bVar.mergeFrom((UIComponent.b) uIComponent2);
                                    this.f = (UIComponent) bVar.buildPartial();
                                } else {
                                    continue;
                                }
                            case 34:
                                Text text = this.n;
                                Text.b bVar2 = text != null ? (Text.b) text.toBuilder() : null;
                                Text text2 = (Text) gVar.o(Text.parser(), kVar);
                                this.n = text2;
                                if (bVar2 != null) {
                                    bVar2.mergeFrom((Text.b) text2);
                                    this.n = (Text) bVar2.buildPartial();
                                } else {
                                    continue;
                                }
                            case 42:
                                Images images = this.o;
                                Images.b bVar3 = images != null ? (Images.b) images.toBuilder() : null;
                                Images images2 = (Images) gVar.o(Images.parser(), kVar);
                                this.o = images2;
                                if (bVar3 != null) {
                                    bVar3.mergeFrom((Images.b) images2);
                                    this.o = (Images) bVar3.buildPartial();
                                } else {
                                    continue;
                                }
                            case 50:
                                Target target = this.p;
                                Target.b bVar4 = target != null ? (Target.b) target.toBuilder() : null;
                                Target target2 = (Target) gVar.o(Target.parser(), kVar);
                                this.p = target2;
                                if (bVar4 != null) {
                                    bVar4.mergeFrom((Target.b) target2);
                                    this.p = (Target) bVar4.buildPartial();
                                } else {
                                    continue;
                                }
                            case 58:
                                if (!this.q.R0()) {
                                    this.q = GeneratedMessageLite.mutableCopy(this.q);
                                }
                                this.q.add(gVar.o(parser(), kVar));
                                continue;
                            case 66:
                                Struct struct = this.r;
                                Struct.b bVar5 = struct != null ? (Struct.b) struct.toBuilder() : null;
                                Struct struct2 = (Struct) gVar.o(Struct.parser(), kVar);
                                this.r = struct2;
                                if (bVar5 != null) {
                                    bVar5.mergeFrom((Struct.b) struct2);
                                    this.r = (Struct) bVar5.buildPartial();
                                } else {
                                    continue;
                                }
                            case 74:
                                Struct struct3 = this.s;
                                Struct.b bVar6 = struct3 != null ? (Struct.b) struct3.toBuilder() : null;
                                Struct struct4 = (Struct) gVar.o(Struct.parser(), kVar);
                                this.s = struct4;
                                if (bVar6 != null) {
                                    bVar6.mergeFrom((Struct.b) struct4);
                                    this.s = (Struct) bVar6.buildPartial();
                                } else {
                                    continue;
                                }
                            case 82:
                                Struct struct5 = this.t;
                                Struct.b bVar7 = struct5 != null ? (Struct.b) struct5.toBuilder() : null;
                                Struct struct6 = (Struct) gVar.o(Struct.parser(), kVar);
                                this.t = struct6;
                                if (bVar7 != null) {
                                    bVar7.mergeFrom((Struct.b) struct6);
                                    this.t = (Struct) bVar7.buildPartial();
                                } else {
                                    continue;
                                }
                            case 90:
                                if (!this.u.f()) {
                                    this.u = this.u.k();
                                }
                                c.a.d(this.u, gVar, kVar);
                                continue;
                            default:
                                if (gVar.F(B)) {
                                    continue;
                                }
                                break;
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
                this.q.C();
                this.u.g();
                return null;
            case 4:
                return new Component();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (w == null) {
                    synchronized (Component.class) {
                        if (w == null) {
                            w = new GeneratedMessageLite.c(v);
                        }
                    }
                }
                return w;
            default:
                throw new UnsupportedOperationException();
        }
        return v;
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
            p2 += CodedOutputStream.n(3, i());
        }
        if (this.n != null) {
            p2 += CodedOutputStream.n(4, t());
        }
        if (this.o != null) {
            p2 += CodedOutputStream.n(5, q());
        }
        Target target = this.p;
        if (target != null) {
            p2 += CodedOutputStream.n(6, target);
        }
        for (int i2 = 0; i2 < this.q.size(); i2++) {
            p2 += CodedOutputStream.n(7, this.q.get(i2));
        }
        if (this.r != null) {
            p2 += CodedOutputStream.n(8, l());
        }
        if (this.s != null) {
            p2 += CodedOutputStream.n(9, r());
        }
        if (this.t != null) {
            p2 += CodedOutputStream.n(10, s());
        }
        for (Map.Entry<String, Command> entry : this.u.entrySet()) {
            p2 = je.j1(entry, c.a, 11, entry.getKey(), p2);
        }
        this.memoizedSerializedSize = p2;
        return p2;
    }

    public List<Component> h() {
        return this.q;
    }

    public UIComponent i() {
        UIComponent uIComponent = this.f;
        return uIComponent == null ? UIComponent.i() : uIComponent;
    }

    public Struct l() {
        Struct struct = this.r;
        return struct == null ? Struct.h() : struct;
    }

    public Map<String, Command> n() {
        return Collections.unmodifiableMap(this.u);
    }

    public String o() {
        return this.c;
    }

    public String p() {
        return this.b;
    }

    public Images q() {
        Images images = this.o;
        return images == null ? Images.l() : images;
    }

    public Struct r() {
        Struct struct = this.s;
        return struct == null ? Struct.h() : struct;
    }

    public Struct s() {
        Struct struct = this.t;
        return struct == null ? Struct.h() : struct;
    }

    public Text t() {
        Text text = this.n;
        return text == null ? Text.i() : text;
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
            codedOutputStream.M(3, i());
        }
        if (this.n != null) {
            codedOutputStream.M(4, t());
        }
        if (this.o != null) {
            codedOutputStream.M(5, q());
        }
        Target target = this.p;
        if (target != null) {
            codedOutputStream.M(6, target);
        }
        for (int i = 0; i < this.q.size(); i++) {
            codedOutputStream.M(7, this.q.get(i));
        }
        if (this.r != null) {
            codedOutputStream.M(8, l());
        }
        if (this.s != null) {
            codedOutputStream.M(9, r());
        }
        if (this.t != null) {
            codedOutputStream.M(10, s());
        }
        for (Map.Entry<String, Command> entry : this.u.entrySet()) {
            c.a.e(codedOutputStream, 11, entry.getKey(), entry.getValue());
        }
    }
}
