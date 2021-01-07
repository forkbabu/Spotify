package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.Optional;
import com.spotify.music.C0707R;
import com.spotify.remoteconfig.AndroidFeaturePremiumHubProperties;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: szd  reason: default package */
public class szd implements uzd {
    private final AndroidFeaturePremiumHubProperties a;
    private final tzd b;

    public szd(AndroidFeaturePremiumHubProperties androidFeaturePremiumHubProperties, tzd tzd) {
        this.a = androidFeaturePremiumHubProperties;
        this.b = tzd;
    }

    public Optional<View> a(ViewGroup viewGroup) {
        if (!new HashSet(Arrays.asList("treatment1", "treatment2", "treatment3")).contains(this.a.a().value())) {
            return Optional.absent();
        }
        tzd tzd = this.b;
        tzd.getClass();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0707R.layout.premium_hub_row_in_setting_fragment, viewGroup, false);
        inflate.findViewById(C0707R.id.btn_view_other_plans).setOnClickListener(new rzd(tzd));
        return Optional.of(inflate);
    }
}
