package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.music.json.e;
import defpackage.f27;
import java.io.IOException;
import java.nio.charset.Charset;
import okhttp3.e0;
import retrofit2.v;

/* renamed from: g27  reason: default package */
public class g27 {
    private final ObjectMapper a;

    public g27(e eVar) {
        this.a = eVar.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).build();
    }

    public f27 a(v<e0> vVar) {
        try {
            e0 a2 = vVar.a();
            if (vVar.f() && a2 != null) {
                return new f27.c((b91) this.a.readValue(new String(a2.b(), Charset.defaultCharset()), HubsJsonViewModel.class));
            }
            e0 d = vVar.d();
            if (vVar.f() || d == null) {
                return new f27.a("Invalid body");
            }
            return new f27.a(vVar.d().m());
        } catch (IOException e) {
            return new f27.a(e.getMessage());
        }
    }
}
