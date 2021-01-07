package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.k;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface HttpDataSource extends k {

    public static final class InvalidContentTypeException extends HttpDataSourceException {
        public final String contentType;

        public InvalidContentTypeException(String str, m mVar) {
            super(je.x0("Invalid content type: ", str), mVar, 1);
            this.contentType = str;
        }
    }

    public static final class InvalidResponseCodeException extends HttpDataSourceException {
        public final Map<String, List<String>> headerFields;
        public final int responseCode;
        public final String responseMessage;

        public InvalidResponseCodeException(int i, String str, Map<String, List<String>> map, m mVar) {
            super(je.p0("Response code: ", i), mVar, 1);
            this.responseCode = i;
            this.responseMessage = str;
            this.headerFields = map;
        }
    }

    public static abstract class a implements k.a {
        private final b a = new b();

        @Override // com.google.android.exoplayer2.upstream.k.a
        public k a() {
            return c(this.a);
        }

        public final HttpDataSource b() {
            return c(this.a);
        }

        /* access modifiers changed from: protected */
        public abstract HttpDataSource c(b bVar);
    }

    public static final class b {
        private final Map<String, String> a = new HashMap();
        private Map<String, String> b;

        public synchronized Map<String, String> a() {
            if (this.b == null) {
                this.b = Collections.unmodifiableMap(new HashMap(this.a));
            }
            return this.b;
        }
    }

    public static class HttpDataSourceException extends IOException {
        public final m dataSpec;
        public final int type;

        public HttpDataSourceException(String str, m mVar, int i) {
            super(str);
            this.dataSpec = mVar;
            this.type = i;
        }

        public HttpDataSourceException(IOException iOException, m mVar, int i) {
            super(iOException);
            this.dataSpec = mVar;
            this.type = i;
        }

        public HttpDataSourceException(String str, IOException iOException, m mVar, int i) {
            super(str, iOException);
            this.dataSpec = mVar;
            this.type = i;
        }
    }
}
