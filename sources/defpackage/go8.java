package defpackage;

import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import java.util.List;

/* renamed from: go8  reason: default package */
public final class go8 {
    public static int a(List<TasteOnboardingItem> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            if (str.equals(list.get(i).id())) {
                return i;
            }
        }
        throw new IllegalStateException(String.format("Position not found %s", str));
    }
}
