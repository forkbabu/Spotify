package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.msgpack.jackson.dataformat.MessagePackFactory;

/* renamed from: qq1  reason: default package */
public class qq1 {
    private final ObjectMapper a;

    public qq1() {
        ObjectMapper objectMapper = new ObjectMapper(new MessagePackFactory(), null, null);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        this.a = objectMapper;
    }

    public ObjectMapper a() {
        return this.a;
    }
}
