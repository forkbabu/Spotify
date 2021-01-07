package org.msgpack.jackson.dataformat;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonReadContext;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedList;
import org.msgpack.core.buffer.ArrayBufferInput;
import org.msgpack.core.buffer.InputStreamBufferInput;
import org.msgpack.core.buffer.MessageBufferInput;
import org.msgpack.core.d;
import org.msgpack.value.Variable;
import org.msgpack.value.q;
import org.msgpack.value.v;

public class b extends ParserMinimalBase {
    private static final ThreadLocal<c<Object, d>> r = new ThreadLocal<>();
    private ObjectCodec a;
    private JsonReadContext b;
    private final LinkedList<a> c;
    private v f;
    private Variable n;
    private long o;
    private long p;
    private final IOContext q;

    private static abstract class a {
        private long a;

        protected a(long j) {
            this.a = j;
        }

        public void a() {
            this.a--;
        }

        public boolean b() {
            return this.a == 0;
        }
    }

    /* renamed from: org.msgpack.jackson.dataformat.b$b  reason: collision with other inner class name */
    private static class C0665b extends a {
        C0665b(long j) {
            super(j);
        }
    }

    private static class c extends a {
        c(long j) {
            super(j);
        }
    }

    public b(IOContext iOContext, int i, ObjectCodec objectCodec, InputStream inputStream) {
        this(iOContext, i, new InputStreamBufferInput(inputStream), objectCodec, inputStream);
    }

    private d a() {
        c<Object, d> cVar = r.get();
        if (cVar != null) {
            return cVar.b();
        }
        throw new IllegalStateException("messageUnpacker is null");
    }

    /* access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase
    public void _handleEOF() {
    }

    @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
            a().close();
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigInteger getBigIntegerValue() {
        return this.f.Y().J();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) {
        return this.f.u().i();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ObjectCodec getCodec() {
        return this.a;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation getCurrentLocation() {
        Object sourceReference = this.q.getSourceReference();
        long j = this.p;
        return new JsonLocation(sourceReference, j, -1, -1, (int) j);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String getCurrentName() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) {
            return this.b.mo10getParent().getCurrentName();
        }
        return this.b.getCurrentName();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigDecimal getDecimalValue() {
        if (this.f.M()) {
            q k = this.f.k();
            if (k.j()) {
                return BigDecimal.valueOf(k.A());
            }
            return new BigDecimal(k.J());
        } else if (this.f.x()) {
            return BigDecimal.valueOf(this.f.O().I());
        } else {
            StringBuilder V0 = je.V0("Couldn't parse value as BigDecimal. ");
            V0.append(this.f);
            throw new UnsupportedOperationException(V0.toString());
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public double getDoubleValue() {
        return this.f.Y().I();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getEmbeddedObject() {
        if (this.f.d()) {
            return this.f.Q().i();
        }
        if (this.f.L()) {
            org.msgpack.value.d P = this.f.P();
            return new MessagePackExtensionType(P.getType(), P.c());
        }
        throw new UnsupportedOperationException();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public float getFloatValue() {
        return this.f.Y().H();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getIntValue() {
        return this.f.Y().T();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long getLongValue() {
        return this.f.Y().A();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType getNumberType() {
        if (this.f.M()) {
            q k = this.f.k();
            if (k.l()) {
                return JsonParser.NumberType.INT;
            }
            if (k.j()) {
                return JsonParser.NumberType.LONG;
            }
            return JsonParser.NumberType.BIG_INTEGER;
        }
        this.f.Y();
        return JsonParser.NumberType.DOUBLE;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Number getNumberValue() {
        if (!this.f.M()) {
            return Double.valueOf(this.f.Y().I());
        }
        q k = this.f.k();
        if (k.l()) {
            return Integer.valueOf(k.T());
        }
        if (k.j()) {
            return Long.valueOf(k.A());
        }
        return k.J();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonStreamContext getParsingContext() {
        return this.b;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String getText() {
        if (this.f.f()) {
            return this.f.u().toString();
        }
        return this.f.toString();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public char[] getTextCharacters() {
        return getText().toCharArray();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getTextLength() {
        return getText().length();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getTextOffset() {
        return 0;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation getTokenLocation() {
        Object sourceReference = this.q.getSourceReference();
        long j = this.o;
        return new JsonLocation(sourceReference, j, -1, -1, (int) j);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean hasTextCharacters() {
        return false;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken nextToken() {
        a aVar;
        JsonToken jsonToken;
        JsonToken jsonToken2;
        JsonToken jsonToken3;
        d a2 = a();
        this.o = a2.h();
        if ((this.b.inObject() || this.b.inArray()) && this.c.getFirst().b()) {
            this.c.pop();
            this._currToken = this.b.inObject() ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            this.b = this.b.mo10getParent();
            return this._currToken;
        }
        JsonToken jsonToken4 = null;
        if (!a2.i()) {
            return null;
        }
        switch (a2.g().d().ordinal()) {
            case 0:
                a2.W();
                this.f = rpf.n0();
                jsonToken = JsonToken.VALUE_NULL;
                jsonToken4 = jsonToken;
                aVar = null;
                break;
            case 1:
                boolean J = a2.J();
                this.f = rpf.n0();
                if (this.b.inObject() && this._currToken != (jsonToken2 = JsonToken.FIELD_NAME)) {
                    this.b.setCurrentName(Boolean.toString(J));
                    aVar = null;
                    jsonToken4 = jsonToken2;
                    break;
                } else {
                    jsonToken = J ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE;
                    jsonToken4 = jsonToken;
                    aVar = null;
                    break;
                }
            case 2:
                this.f = a2.d0(this.n);
                if (this.b.inObject() && this._currToken != (jsonToken3 = JsonToken.FIELD_NAME)) {
                    this.b.setCurrentName(this.f.k().toString());
                    aVar = null;
                    jsonToken4 = jsonToken3;
                    break;
                } else {
                    jsonToken = JsonToken.VALUE_NUMBER_INT;
                    jsonToken4 = jsonToken;
                    aVar = null;
                    break;
                }
                break;
            case 3:
                this.f = a2.d0(this.n);
                if (this.b.inObject() && this._currToken != (jsonToken3 = JsonToken.FIELD_NAME)) {
                    this.b.setCurrentName(this.f.O().toString());
                    aVar = null;
                    jsonToken4 = jsonToken3;
                    break;
                } else {
                    jsonToken = JsonToken.VALUE_NUMBER_FLOAT;
                    jsonToken4 = jsonToken;
                    aVar = null;
                    break;
                }
                break;
            case 4:
                this.f = a2.d0(this.n);
                if (this.b.inObject() && this._currToken != (jsonToken3 = JsonToken.FIELD_NAME)) {
                    this.b.setCurrentName(this.f.u().toString());
                    aVar = null;
                    jsonToken4 = jsonToken3;
                    break;
                } else {
                    jsonToken = JsonToken.VALUE_STRING;
                    jsonToken4 = jsonToken;
                    aVar = null;
                    break;
                }
            case 5:
                this.f = a2.d0(this.n);
                if (this.b.inObject() && this._currToken != (jsonToken3 = JsonToken.FIELD_NAME)) {
                    this.b.setCurrentName(this.f.u().toString());
                    aVar = null;
                    jsonToken4 = jsonToken3;
                    break;
                } else {
                    jsonToken = JsonToken.VALUE_EMBEDDED_OBJECT;
                    jsonToken4 = jsonToken;
                    aVar = null;
                    break;
                }
                break;
            case 6:
                this.f = rpf.n0();
                aVar = new C0665b((long) a2.F());
                break;
            case 7:
                this.f = rpf.n0();
                aVar = new c((long) a2.U());
                break;
            case 8:
                this.f = a2.d0(this.n);
                jsonToken = JsonToken.VALUE_EMBEDDED_OBJECT;
                jsonToken4 = jsonToken;
                aVar = null;
                break;
            default:
                throw new IllegalStateException("Shouldn't reach here");
        }
        this.p = a2.h();
        if ((this.b.inObject() && jsonToken4 != JsonToken.FIELD_NAME) || this.b.inArray()) {
            this.c.getFirst().a();
        }
        if (aVar != null) {
            this.c.push(aVar);
            if (aVar instanceof C0665b) {
                jsonToken4 = JsonToken.START_ARRAY;
                this.b = this.b.createChildArrayContext(-1, -1);
            } else if (aVar instanceof c) {
                jsonToken4 = JsonToken.START_OBJECT;
                this.b = this.b.createChildObjectContext(-1, -1);
            }
        }
        this._currToken = jsonToken4;
        return jsonToken4;
    }

    public b(IOContext iOContext, int i, ObjectCodec objectCodec, byte[] bArr) {
        this(iOContext, i, new ArrayBufferInput(bArr), objectCodec, bArr);
    }

    private b(IOContext iOContext, int i, MessageBufferInput messageBufferInput, ObjectCodec objectCodec, Object obj) {
        super(i);
        d dVar;
        this.c = new LinkedList<>();
        this.f = rpf.n0();
        this.n = new Variable();
        this.a = objectCodec;
        this.q = iOContext;
        this.b = new JsonReadContext(null, JsonParser.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i) ? DupDetector.rootDetector(this) : null, 0, 1, 0);
        ThreadLocal<c<Object, d>> threadLocal = r;
        c<Object, d> cVar = threadLocal.get();
        if (cVar == null) {
            dVar = new d(messageBufferInput);
        } else {
            if (isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE) || cVar.a() != obj) {
                cVar.b().B(messageBufferInput);
            }
            dVar = cVar.b();
        }
        threadLocal.set(new c<>(obj, dVar));
    }
}
