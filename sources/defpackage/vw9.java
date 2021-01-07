package defpackage;

import com.coremedia.iso.boxes.UserBox;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Map;

/* renamed from: vw9  reason: default package */
public class vw9 {
    public static final ImmutableSet<String> b;
    private final ImmutableMap<String, String> a;

    static {
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        builder.mo53add((ImmutableSet.Builder) "product");
        builder.mo53add((ImmutableSet.Builder) "raw_platform");
        builder.mo53add((ImmutableSet.Builder) "version");
        builder.mo53add((ImmutableSet.Builder) "revision");
        builder.mo53add((ImmutableSet.Builder) "device_id");
        builder.mo53add((ImmutableSet.Builder) UserBox.TYPE);
        builder.mo53add((ImmutableSet.Builder) "hardware_model");
        builder.mo53add((ImmutableSet.Builder) "hardware_vendor");
        builder.mo53add((ImmutableSet.Builder) "os");
        builder.mo53add((ImmutableSet.Builder) "architecture");
        builder.mo53add((ImmutableSet.Builder) "signature");
        builder.mo53add((ImmutableSet.Builder) "missing_splits");
        builder.mo53add((ImmutableSet.Builder) "flash_enabled");
        b = builder.build();
        ImmutableSet.Builder builder2 = new ImmutableSet.Builder();
        builder2.mo53add((ImmutableSet.Builder) "username");
        builder2.build();
        ImmutableSet.Builder builder3 = new ImmutableSet.Builder();
        builder3.mo53add((ImmutableSet.Builder) "uptime");
        builder3.build();
    }

    vw9(ImmutableMap<String, String> immutableMap) {
        this.a = immutableMap;
    }

    public ImmutableSet<Map.Entry<String, String>> a() {
        return this.a.entrySet();
    }

    public String toString() {
        StringBuilder V0 = je.V0("BaseCrashInfoMap{mInfoMap=");
        V0.append(this.a);
        V0.append('}');
        return V0.toString();
    }
}
