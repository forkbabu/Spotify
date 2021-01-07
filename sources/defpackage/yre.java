package defpackage;

import com.google.common.base.Optional;
import com.spotify.voice.api.model.j;
import io.netty.handler.codec.http.f0;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: yre  reason: default package */
public final class yre {
    private final String a;

    public yre(boolean z, boolean z2, j jVar, String str, Map<String, String> map, Optional<Integer> optional) {
        f0 f0Var = new f0(jVar.d());
        f0Var.a("uid", str);
        if (z) {
            f0Var.a("save_audio", "true");
        }
        if (z2) {
            f0Var.a("nft", "true");
        }
        f0Var.a("this_is_override", "true");
        f0Var.a("tts_encoding", "mp3");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            f0Var.a(entry.getKey(), entry.getValue());
        }
        if (optional.isPresent() && optional.get().intValue() > 0) {
            f0Var.a("activity_timeout_ms", String.valueOf(TimeUnit.SECONDS.toMillis((long) optional.get().intValue())));
        }
        this.a = f0Var.toString();
    }

    public String a() {
        return this.a;
    }
}
