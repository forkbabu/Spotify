package defpackage;

import com.google.common.collect.Collections2;
import com.spotify.inappmessaging.ActionType;
import com.spotify.inappmessaging.FormatType;
import com.spotify.inappmessaging.TriggerType;
import com.spotify.remoteconfig.lj;
import java.util.ArrayList;
import java.util.List;

/* renamed from: e18  reason: default package */
public abstract class e18 {
    private static final List<TriggerType> a = Collections2.newArrayList(TriggerType.values());
    private static final List<ActionType> b = Collections2.newArrayList(ActionType.values());
    private static final List<FormatType> c = Collections2.newArrayList(FormatType.values());
    private static final List<FormatType> d = Collections2.newArrayList(FormatType.CARDS, FormatType.FULLSCREEN);

    public static e18 c(lj ljVar) {
        ArrayList newArrayList = Collections2.newArrayList(b);
        if (!ljVar.a()) {
            newArrayList.remove(ActionType.EMAIL_VERIFICATION);
        }
        return new m08(c, newArrayList, a);
    }

    public static e18 d(lj ljVar) {
        ArrayList newArrayList = Collections2.newArrayList(b);
        if (!ljVar.a()) {
            newArrayList.remove(ActionType.EMAIL_VERIFICATION);
        }
        return new m08(d, newArrayList, a);
    }

    /* access modifiers changed from: package-private */
    public abstract List<ActionType> a();

    /* access modifiers changed from: package-private */
    public abstract List<FormatType> b();

    /* access modifiers changed from: package-private */
    public abstract List<TriggerType> e();
}
