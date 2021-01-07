package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.music.json.e;
import defpackage.re7;
import java.io.IOException;
import okhttp3.e0;
import retrofit2.v;

/* renamed from: se7  reason: default package */
public class se7 {
    private final ObjectMapper a;

    public se7(e eVar) {
        this.a = eVar.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).build();
    }

    public re7 a(v<e0> vVar) {
        try {
            e0 a2 = vVar.a();
            if (vVar.f() && a2 != null) {
                return new re7.b((b91) this.a.readValue(a2.b(), HubsJsonViewModel.class));
            }
            e0 d = vVar.d();
            if (vVar.f() || d == null) {
                return new re7.a("Invalid body");
            }
            return new re7.b((b91) this.a.readValue(d.b(), HubsJsonViewModel.class));
        } catch (IOException e) {
            return new re7.a(e.getMessage());
        }
    }
}
