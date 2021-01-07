package com.google.gson;

import com.google.gson.stream.JsonToken;
import com.google.gson.stream.b;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

public abstract class w<T> {

    /* access modifiers changed from: package-private */
    public class a extends w<T> {
        a() {
        }

        @Override // com.google.gson.w
        public T read(com.google.gson.stream.a aVar) {
            if (aVar.J() != JsonToken.NULL) {
                return (T) w.this.read(aVar);
            }
            aVar.D();
            return null;
        }

        @Override // com.google.gson.w
        public void write(b bVar, T t) {
            if (t == null) {
                bVar.r();
            } else {
                w.this.write(bVar, t);
            }
        }
    }

    public final T fromJson(Reader reader) {
        return read(new com.google.gson.stream.a(reader));
    }

    public final T fromJsonTree(p pVar) {
        try {
            return read(new i20(pVar));
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public final w<T> nullSafe() {
        return new a();
    }

    public abstract T read(com.google.gson.stream.a aVar);

    public final void toJson(Writer writer, T t) {
        write(new b(writer), t);
    }

    public final p toJsonTree(T t) {
        try {
            j20 j20 = new j20();
            write(j20, t);
            return j20.W();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public abstract void write(b bVar, T t);

    public final T fromJson(String str) {
        return fromJson(new StringReader(str));
    }

    public final String toJson(T t) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
