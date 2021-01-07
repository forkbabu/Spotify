package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.music.C0707R;
import com.spotify.music.loggers.ImpressionLogger;
import java.util.List;

/* renamed from: qb4  reason: default package */
public class qb4 extends sb4 implements pb4 {
    private final ImpressionLogger f;
    private final l81 n;

    public qb4(ImpressionLogger impressionLogger, l81 l81, tb4 tb4) {
        super(C0707R.id.browse_impression_logger, tb4);
        this.f = impressionLogger;
        this.n = l81;
    }

    @Override // defpackage.pb4
    public void h(s81 s81) {
        if (s81 != null) {
            o(0, s81);
            List<? extends s81> children = s81.children();
            for (int i = 0; i < children.size(); i++) {
                s81 s812 = (s81) children.get(i);
                o(i, s812);
                if (!s812.children().isEmpty()) {
                    h(s812);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.sb4
    public void o(int i, s81 s81) {
        p81 logging = s81.logging();
        String string = logging.string("ui:group");
        if (!MoreObjects.isNullOrEmpty(string)) {
            String string2 = logging.string("ui:uri");
            int intValue = logging.intValue("ui:index_in_block", -1);
            this.f.b(logging.string("ui:source"), string2, string, intValue, ImpressionLogger.ImpressionType.ITEM, ImpressionLogger.RenderType.LIST);
        }
        this.n.a(s81);
    }
}
