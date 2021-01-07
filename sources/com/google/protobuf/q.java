package com.google.protobuf;

public class q {
    protected volatile u a;
    private volatile ByteString b;

    static {
        k.a();
    }

    public int a() {
        if (this.b != null) {
            return this.b.size();
        }
        if (this.a != null) {
            return this.a.getSerializedSize();
        }
        return 0;
    }

    public u b(u uVar) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = null;
                        this.b = ByteString.a;
                    } catch (InvalidProtocolBufferException unused) {
                        this.a = null;
                        this.b = ByteString.a;
                    }
                }
            }
        }
        return this.a;
    }

    public u c(u uVar) {
        u uVar2 = this.a;
        this.b = null;
        this.a = uVar;
        return uVar2;
    }
}
