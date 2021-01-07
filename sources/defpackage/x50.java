package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.protobuf.u;
import com.spotify.messages.HomeCardImpressionSizeEvent;
import com.spotify.remoteconfig.j8;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: x50  reason: default package */
public final class x50 implements w50 {
    private final j8 a;
    private final gl0<u> b;
    private final b60 c;

    public x50(j8 j8Var, gl0<u> gl0, b60 b60) {
        h.e(j8Var, "properties");
        h.e(gl0, "gabitoEventPublisher");
        h.e(b60, "itemOffsetCalculator");
        this.a = j8Var;
        this.b = gl0;
        this.c = b60;
    }

    @Override // defpackage.w50
    public void a(s81 s81, View view, i60 i60) {
        sqe sqe;
        h.e(s81, "model");
        h.e(view, "view");
        h.e(i60, "mode");
        if (this.a.a()) {
            String str = "";
            rqe d = n81.b(s81.logging(), str).d();
            h.d(d, "HubsUserBehaviourLogging…el.logging(), \"\").build()");
            List<sqe> l = d.l();
            if (l.isEmpty()) {
                sqe = sqe.f;
            } else {
                h.d(l, "it");
                sqe = (sqe) d.q(l);
            }
            h.d(sqe, "ubiLogging.path().let {\n… else it.last()\n        }");
            String string = s81.logging().string("ui:uri");
            if (string == null) {
                string = s81.metadata().string("uri");
            }
            if (string == null) {
                string = sqe.h();
            }
            if (string == null) {
                string = str;
            }
            String string2 = s81.logging().string("ui:source");
            if (string2 == null) {
                string2 = d.j();
            }
            if (string2 != null) {
                str = string2;
            }
            int i = -1;
            int intValue = s81.custom().intValue("rowIndex", -1);
            Integer intValue2 = s81.logging().intValue("ui:index_in_block");
            if (intValue2 == null) {
                intValue2 = sqe.f();
            }
            if (intValue2 != null) {
                i = intValue2.intValue();
            }
            HomeCardImpressionSizeEvent.b t = HomeCardImpressionSizeEvent.t();
            t.o(view.getWidth());
            t.m(view.getHeight());
            t.n(string);
            t.t(intValue);
            t.p(i);
            t.s(str);
            Resources resources = view.getResources();
            h.d(resources, "view.resources");
            t.v(resources.getDisplayMetrics().widthPixels);
            Resources resources2 = view.getResources();
            h.d(resources2, "view.resources");
            t.u(resources2.getDisplayMetrics().heightPixels);
            t.q(this.c.c(s81, i60));
            t.r(this.c.b(s81, i60));
            this.b.c((HomeCardImpressionSizeEvent) t.build());
        }
    }
}
