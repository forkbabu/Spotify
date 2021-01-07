package org.msgpack.jackson.dataformat;

import com.adjust.sdk.Constants;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.GeneratorBase;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.msgpack.core.buffer.OutputStreamBufferOutput;

public class a extends GeneratorBase {
    private static ThreadLocal<org.msgpack.core.c> c = new ThreadLocal<>();
    private static ThreadLocal<OutputStreamBufferOutput> f = new ThreadLocal<>();
    private LinkedList<b> a;
    private b b;

    /* access modifiers changed from: private */
    public static class c extends b {
        private c() {
            super(null);
        }

        /* access modifiers changed from: package-private */
        @Override // org.msgpack.jackson.dataformat.a.b
        public void a(String str) {
            throw new IllegalStateException("This method shouldn't be called");
        }

        c(C0664a aVar) {
            super(null);
        }
    }

    /* access modifiers changed from: private */
    public static class d extends b {
        private d() {
            super(null);
        }

        /* access modifiers changed from: package-private */
        @Override // org.msgpack.jackson.dataformat.a.b
        public void a(String str) {
            this.a.add(str);
        }

        d(C0664a aVar) {
            super(null);
        }
    }

    static {
        Charset.forName(Constants.ENCODING);
    }

    public a(int i, ObjectCodec objectCodec, OutputStream outputStream) {
        super(i, objectCodec);
        org.msgpack.core.c cVar = c.get();
        OutputStreamBufferOutput outputStreamBufferOutput = f.get();
        if (outputStreamBufferOutput == null) {
            outputStreamBufferOutput = new OutputStreamBufferOutput(outputStream);
        } else {
            outputStreamBufferOutput.reset(outputStream);
        }
        f.set(outputStreamBufferOutput);
        if (cVar == null) {
            cVar = new org.msgpack.core.c(outputStreamBufferOutput);
        } else {
            cVar.B(outputStreamBufferOutput);
        }
        c.set(cVar);
        this.a = new LinkedList<>();
    }

    private void a(Object obj) {
        if (this.a.isEmpty()) {
            h(obj);
            b().flush();
            return;
        }
        d().b.add(obj);
    }

    private org.msgpack.core.c b() {
        org.msgpack.core.c cVar = c.get();
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("messagePacker is null");
    }

    private b d() {
        if (!this.a.isEmpty()) {
            return this.a.getFirst();
        }
        throw new IllegalStateException("The stack is empty");
    }

    private void f(c cVar) {
        List<Object> list = cVar.b;
        b().b(list.size());
        for (int i = 0; i < list.size(); i++) {
            h(list.get(i));
        }
    }

    private void g(d dVar) {
        List<String> list = dVar.a;
        List<Object> list2 = dVar.b;
        org.msgpack.core.c b2 = b();
        b2.q(list.size());
        for (int i = 0; i < list.size(); i++) {
            b2.v(list.get(i));
            h(list2.get(i));
        }
    }

    private void h(Object obj) {
        org.msgpack.core.c b2 = b();
        if (obj == null) {
            b2.r();
        } else if (obj instanceof Integer) {
            b2.m(((Integer) obj).intValue());
        } else if (obj instanceof ByteBuffer) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            b2.f(byteBuffer.limit());
            b2.J(byteBuffer);
        } else if (obj instanceof String) {
            b2.v((String) obj);
        } else if (obj instanceof Float) {
            b2.l(((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            b2.p(((Long) obj).longValue());
        } else if (obj instanceof d) {
            g((d) obj);
        } else if (obj instanceof c) {
            f((c) obj);
        } else if (obj instanceof Double) {
            b2.h(((Double) obj).doubleValue());
        } else if (obj instanceof BigInteger) {
            b2.d((BigInteger) obj);
        } else if (obj instanceof BigDecimal) {
            BigDecimal bigDecimal = (BigDecimal) obj;
            org.msgpack.core.c b3 = b();
            boolean z = true;
            try {
                b3.d(bigDecimal.toBigIntegerExact());
                z = false;
            } catch (ArithmeticException | IllegalArgumentException unused) {
            }
            if (z) {
                double doubleValue = bigDecimal.doubleValue();
                if (bigDecimal.stripTrailingZeros().toEngineeringString().equals(BigDecimal.valueOf(doubleValue).toEngineeringString())) {
                    b3.h(doubleValue);
                    return;
                }
                throw new IllegalArgumentException("MessagePack cannot serialize a BigDecimal that can't be represented as double. " + bigDecimal);
            }
        } else if (obj instanceof Boolean) {
            b2.g(((Boolean) obj).booleanValue());
        } else if (obj instanceof MessagePackExtensionType) {
            MessagePackExtensionType messagePackExtensionType = (MessagePackExtensionType) obj;
            byte[] a2 = messagePackExtensionType.a();
            b2.i(messagePackExtensionType.b(), a2.length);
            b2.M(a2);
        } else {
            throw new IllegalArgumentException(obj.toString());
        }
    }

    private void i() {
        b pop = this.a.pop();
        if (this.a.size() > 0) {
            a(pop);
        } else if (this.b == null) {
            this.b = pop;
        } else {
            throw new IllegalStateException("rootStackItem is not null");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.core.base.GeneratorBase
    public void _verifyValueWrite(String str) {
        if (this._writeContext.writeValue() == 5) {
            throw new JsonGenerationException(je.y0("Can not ", str, ", expecting field name"), this);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            flush();
        } finally {
            if (isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                b().close();
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() {
        b bVar = this.b;
        if (bVar != null) {
            if (bVar instanceof d) {
                g((d) bVar);
            } else if (bVar instanceof c) {
                f((c) bVar);
            } else {
                StringBuilder V0 = je.V0("Unexpected rootStackItem: ");
                V0.append(this.b);
                throw new IllegalStateException(V0.toString());
            }
            this.b = null;
            b().flush();
        }
    }

    public void l(MessagePackExtensionType messagePackExtensionType) {
        a(messagePackExtensionType);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i, int i2) {
        a(ByteBuffer.wrap(bArr, i, i2));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBoolean(boolean z) {
        a(Boolean.valueOf(z));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeEndArray() {
        if (this._writeContext.inArray()) {
            b d2 = d();
            if (d2 instanceof c) {
                c cVar = (c) d2;
                this._writeContext = this._writeContext.mo11getParent();
                i();
                return;
            }
            throw new IllegalStateException("The stack top should be Array: " + d2);
        }
        StringBuilder V0 = je.V0("Current context not an array but ");
        V0.append(this._writeContext.getTypeDesc());
        throw new JsonGenerationException(V0.toString(), this);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeEndObject() {
        if (this._writeContext.inObject()) {
            b d2 = d();
            if (d2 instanceof d) {
                d dVar = (d) d2;
                if (dVar.a.size() == dVar.b.size()) {
                    this._writeContext = this._writeContext.mo11getParent();
                    i();
                    return;
                }
                throw new IllegalStateException(String.format("objectKeys.size() and objectValues.size() is not same: depth=%d, key=%d, value=%d", Integer.valueOf(this.a.size()), Integer.valueOf(dVar.a.size()), Integer.valueOf(dVar.b.size())));
            }
            throw new IllegalStateException("The stack top should be Object: " + d2);
        }
        StringBuilder V0 = je.V0("Current context not an object but ");
        V0.append(this._writeContext.getTypeDesc());
        throw new JsonGenerationException(V0.toString(), this);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(String str) {
        d().a(str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNull() {
        a(null);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(int i) {
        a(Integer.valueOf(i));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str) {
        a(str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray() {
        this._writeContext = this._writeContext.createChildArrayContext();
        this.a.push(new c(null));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject() {
        this._writeContext = this._writeContext.createChildObjectContext();
        this.a.push(new d(null));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(String str) {
        a(str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(long j) {
        a(Long.valueOf(j));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char[] cArr, int i, int i2) {
        a(new String(cArr, i, i2));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(char[] cArr, int i, int i2) {
        a(new String(cArr, i, i2));
    }

    /* access modifiers changed from: private */
    public static abstract class b {
        protected List<String> a = new ArrayList();
        protected List<Object> b = new ArrayList();

        private b() {
        }

        /* access modifiers changed from: package-private */
        public abstract void a(String str);

        b(C0664a aVar) {
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigInteger bigInteger) {
        a(bigInteger);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char c2) {
        a(String.valueOf(c2));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(double d2) {
        a(Double.valueOf(d2));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(float f2) {
        a(Float.valueOf(f2));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigDecimal bigDecimal) {
        a(bigDecimal);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(String str) {
        throw new UnsupportedOperationException("writeNumber(String encodedValue) isn't supported yet");
    }
}
