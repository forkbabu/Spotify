package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.c0;
import okhttp3.e0;
import retrofit2.j;
import retrofit2.w;

/* renamed from: dqf  reason: default package */
public final class dqf extends j.a {
    private final ObjectMapper a;

    private dqf(ObjectMapper objectMapper) {
        this.a = objectMapper;
    }

    public static dqf c() {
        return new dqf(new ObjectMapper(null, null, null));
    }

    public static dqf d(ObjectMapper objectMapper) {
        if (objectMapper != null) {
            return new dqf(objectMapper);
        }
        throw new NullPointerException("mapper == null");
    }

    @Override // retrofit2.j.a
    public j<?, c0> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, w wVar) {
        return new eqf(this.a.writerFor(this.a.getTypeFactory().constructType(type)));
    }

    @Override // retrofit2.j.a
    public j<e0, ?> b(Type type, Annotation[] annotationArr, w wVar) {
        return new fqf(this.a.readerFor(this.a.getTypeFactory().constructType(type)));
    }
}
