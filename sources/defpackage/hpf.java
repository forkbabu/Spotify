package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import org.msgpack.core.MessageStringCodingException;
import org.msgpack.core.MessageTypeCastException;
import org.msgpack.core.b;
import org.msgpack.value.f;
import org.msgpack.value.g;
import org.msgpack.value.h;
import org.msgpack.value.i;
import org.msgpack.value.j;
import org.msgpack.value.k;
import org.msgpack.value.m;
import org.msgpack.value.n;
import org.msgpack.value.o;
import org.msgpack.value.t;

/* renamed from: hpf  reason: default package */
public abstract class hpf extends ipf implements n {
    private static final char[] c = "0123456789ABCDEF".toCharArray();
    protected final byte[] a;
    private volatile String b;

    public hpf(byte[] bArr) {
        this.a = bArr;
    }

    static void n0(StringBuilder sb, String str) {
        sb.append("\"");
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < ' ') {
                switch (charAt) {
                    case '\b':
                        sb.append("\\b");
                        continue;
                    case '\t':
                        sb.append("\\t");
                        continue;
                    case '\n':
                        sb.append("\\n");
                        continue;
                    case 11:
                    default:
                        o0(sb, charAt);
                        continue;
                    case '\f':
                        sb.append("\\f");
                        continue;
                    case '\r':
                        sb.append("\\r");
                        continue;
                }
            } else if (charAt <= 127) {
                if (charAt == '\"') {
                    sb.append("\\\"");
                } else if (charAt != '\\') {
                    sb.append(charAt);
                } else {
                    sb.append("\\\\");
                }
            } else if (charAt < 55296 || charAt > 57343) {
                sb.append(charAt);
            } else {
                o0(sb, charAt);
            }
        }
        sb.append("\"");
    }

    private static void o0(StringBuilder sb, int i) {
        sb.append("\\u");
        char[] cArr = c;
        sb.append(cArr[(i >> 12) & 15]);
        sb.append(cArr[(i >> 8) & 15]);
        sb.append(cArr[(i >> 4) & 15]);
        sb.append(cArr[i & 15]);
    }

    @Override // defpackage.ipf
    public f Z() {
        throw new MessageTypeCastException();
    }

    @Override // defpackage.ipf
    public g a0() {
        throw new MessageTypeCastException();
    }

    @Override // defpackage.ipf
    public h d0() {
        throw new MessageTypeCastException();
    }

    @Override // defpackage.ipf
    public i e0() {
        throw new MessageTypeCastException();
    }

    @Override // defpackage.ipf
    public npf g0() {
        throw new MessageTypeCastException();
    }

    @Override // defpackage.ipf
    public j h0() {
        throw new MessageTypeCastException();
    }

    @Override // org.msgpack.value.t
    public byte[] i() {
        byte[] bArr = this.a;
        return Arrays.copyOf(bArr, bArr.length);
    }

    @Override // defpackage.ipf
    public k i0() {
        throw new MessageTypeCastException();
    }

    @Override // defpackage.ipf
    public m k0() {
        throw new MessageTypeCastException();
    }

    @Override // defpackage.ipf
    public n l0() {
        return this;
    }

    @Override // defpackage.ipf
    public o m0() {
        throw new MessageTypeCastException();
    }

    @Override // org.msgpack.value.t
    public String toString() {
        if (this.b == null) {
            synchronized (this.a) {
                if (this.b == null) {
                    try {
                        this.b = b.a.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(this.a).asReadOnlyBuffer()).toString();
                    } catch (CharacterCodingException unused) {
                        try {
                            this.b = b.a.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).decode(ByteBuffer.wrap(this.a).asReadOnlyBuffer()).toString();
                        } catch (CharacterCodingException e) {
                            throw new MessageStringCodingException(e);
                        }
                    }
                }
            }
        }
        return this.b;
    }

    @Override // defpackage.ipf, org.msgpack.value.v
    public t u() {
        return this;
    }

    @Override // org.msgpack.value.v
    public String z() {
        StringBuilder sb = new StringBuilder();
        n0(sb, toString());
        return sb.toString();
    }
}
