package defpackage;

import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.spotify.podcast.endpoints.r;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: cyd  reason: default package */
public final class cyd {
    private final Map<String, String> a = new LinkedHashMap();

    public cyd a(String str, Optional<Boolean> optional) {
        if (optional.isPresent() && optional.get().booleanValue()) {
            this.a.put(str, optional.get().toString());
        }
        return this;
    }

    public cyd b(String str, Optional<Double> optional) {
        if (optional.isPresent()) {
            this.a.put(str, String.valueOf(optional.get()));
        }
        return this;
    }

    public cyd c(String str, Optional<Integer> optional) {
        if (optional.isPresent()) {
            this.a.put(str, String.valueOf(optional.get()));
        }
        return this;
    }

    public cyd d(String str, List<String> list) {
        if (!list.isEmpty()) {
            this.a.put(str, Joiner.on(',').join(list));
        }
        return this;
    }

    public cyd e(String str, String str2, Optional<r> optional) {
        if (optional.isPresent() && !str.isEmpty() && !str2.isEmpty()) {
            r rVar = optional.get();
            this.a.put(str, String.valueOf(rVar.c()));
            this.a.put(str2, String.valueOf(rVar.b()));
        }
        return this;
    }

    public cyd f(String str, Optional<ane> optional) {
        if (optional.isPresent()) {
            this.a.put(str, bne.b(optional.get()));
        }
        return this;
    }

    public cyd g(String str, Optional<String> optional) {
        if (optional.isPresent()) {
            this.a.put(str, optional.get());
        }
        return this;
    }

    public Map<String, String> h() {
        return this.a;
    }
}
