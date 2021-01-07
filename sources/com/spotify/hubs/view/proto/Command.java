package com.spotify.hubs.view.proto;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Struct;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.x;
import java.io.IOException;

public final class Command extends GeneratedMessageLite<Command, b> implements Object {
    private static final Command c;
    private static volatile x<Command> f;
    private String a = "";
    private Struct b;

    public static final class b extends GeneratedMessageLite.b<Command, b> implements Object {
        private b() {
            super(Command.c);
        }
    }

    static {
        Command command = new Command();
        c = command;
        command.makeImmutable();
    }

    private Command() {
    }

    public static Command i() {
        return c;
    }

    public static x<Command> parser() {
        return c.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (methodToInvoke.ordinal()) {
            case 0:
                return c;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                Command command = (Command) obj2;
                this.a = hVar.n(!this.a.isEmpty(), this.a, true ^ command.a.isEmpty(), command.a);
                this.b = (Struct) hVar.i(this.b, command.b);
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
                                this.a = gVar.A();
                            } else if (B == 18) {
                                Struct struct = this.b;
                                Struct.b bVar = struct != null ? (Struct.b) struct.toBuilder() : null;
                                Struct struct2 = (Struct) gVar.o(Struct.parser(), kVar);
                                this.b = struct2;
                                if (bVar != null) {
                                    bVar.mergeFrom((Struct.b) struct2);
                                    this.b = (Struct) bVar.buildPartial();
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
                return null;
            case 4:
                return new Command();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (f == null) {
                    synchronized (Command.class) {
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
        if (!this.a.isEmpty()) {
            i2 = 0 + CodedOutputStream.p(1, this.a);
        }
        if (this.b != null) {
            i2 += CodedOutputStream.n(2, h());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public Struct h() {
        Struct struct = this.b;
        return struct == null ? Struct.h() : struct;
    }

    public String l() {
        return this.a;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.a.isEmpty()) {
            codedOutputStream.P(1, this.a);
        }
        if (this.b != null) {
            codedOutputStream.M(2, h());
        }
    }
}
