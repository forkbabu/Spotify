package defpackage;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.spotlets.appprotocol.j4;
import java.util.List;

/* renamed from: pq1  reason: default package */
public class pq1 implements j4 {
    private final ObjectMapper a;

    /* renamed from: pq1$a */
    private class a implements ef2 {
        private final JsonNode a;

        public a(JsonNode jsonNode) {
            this.a = jsonNode;
        }

        @Override // defpackage.ef2
        public boolean a(int i) {
            return i < this.a.size() && this.a.get(i).isObject() && this.a.get(i).size() > 0;
        }

        @Override // defpackage.ef2
        public <T> T b(int i, Class<T> cls) {
            return (T) pq1.this.a.convertValue(this.a.get(i), cls);
        }

        @Override // defpackage.ef2
        public int c(int i) {
            return this.a.get(i).asInt();
        }

        @Override // defpackage.ef2
        public int d() {
            return this.a.get(0).asInt();
        }

        @Override // defpackage.ef2
        public String e(int i) {
            return this.a.get(i).asText();
        }

        @Override // defpackage.ef2
        public int size() {
            return this.a.size();
        }

        public String toString() {
            return this.a.toString();
        }
    }

    public pq1(ObjectMapper objectMapper) {
        this.a = objectMapper;
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.j4
    public byte[] a(List<Object> list) {
        return this.a.writeValueAsBytes(list);
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.j4
    public ef2 b(byte[] bArr) {
        return new a(this.a.readTree(bArr));
    }
}
