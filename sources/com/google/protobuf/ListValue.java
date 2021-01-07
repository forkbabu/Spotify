package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.o;
import java.io.IOException;
import java.util.List;

public final class ListValue extends GeneratedMessageLite<ListValue, b> implements Object {
    private static final ListValue b;
    private static volatile x<ListValue> c;
    private o.i<Value> a = GeneratedMessageLite.emptyProtobufList();

    public static final class b extends GeneratedMessageLite.b<ListValue, b> implements Object {
        private b() {
            super(ListValue.b);
        }

        b(a aVar) {
            super(ListValue.b);
        }
    }

    static {
        ListValue listValue = new ListValue();
        b = listValue;
        listValue.makeImmutable();
    }

    private ListValue() {
    }

    public static ListValue h() {
        return b;
    }

    public static x<ListValue> parser() {
        return b.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return b;
            case 1:
                this.a = ((GeneratedMessageLite.h) obj).q(this.a, ((ListValue) obj2).a);
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
                                if (!((c) this.a).R0()) {
                                    this.a = GeneratedMessageLite.mutableCopy(this.a);
                                }
                                ((c) this.a).add(gVar.o(Value.parser(), kVar));
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
                ((c) this.a).C();
                return null;
            case 4:
                return new ListValue();
            case 5:
                return new b(null);
            case 6:
                break;
            case 7:
                if (c == null) {
                    synchronized (ListValue.class) {
                        if (c == null) {
                            c = new GeneratedMessageLite.c(b);
                        }
                    }
                }
                return c;
            default:
                throw new UnsupportedOperationException();
        }
        return b;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            i2 += CodedOutputStream.n(1, this.a.get(i3));
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public List<Value> i() {
        return this.a;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.a.size(); i++) {
            codedOutputStream.M(1, this.a.get(i));
        }
    }
}
