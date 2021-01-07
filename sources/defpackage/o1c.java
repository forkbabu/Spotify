package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.position.i;
import defpackage.j1c;
import io.reactivex.g;
import kotlin.jvm.internal.h;

/* renamed from: o1c  reason: default package */
public final class o1c implements n1c {
    private Integer a;
    private float b;
    private final y1c<j1c.a.b.C0627b> c;
    private final g<j1c.a.b.C0627b> d;
    private final y1c<j1c.b.C0628b> e;
    private final g<j1c.b.C0628b> f;
    private final Context g;
    private final i h;

    public o1c(Context context, i iVar) {
        h.e(context, "context");
        h.e(iVar, "positionState");
        this.g = context;
        this.h = iVar;
        y1c<j1c.a.b.C0627b> y1c = new y1c<>(false, 1);
        this.c = y1c;
        this.d = y1c.a();
        y1c<j1c.b.C0628b> y1c2 = new y1c<>(false, 1);
        this.e = y1c2;
        this.f = y1c2.a();
    }

    @Override // defpackage.n1c
    public g<j1c.b.C0628b> a() {
        return this.f;
    }

    @Override // defpackage.n1c
    public g<j1c.a.b.C0627b> b() {
        return this.d;
    }

    @Override // defpackage.n1c
    public boolean c(MotionEvent motionEvent, boolean z) {
        h.e(motionEvent, "event");
        int action = motionEvent.getAction();
        int i = 0;
        if (action == 0) {
            this.b = motionEvent.getX(motionEvent.getActionIndex());
            this.a = Integer.valueOf(motionEvent.getPointerId(0));
            i iVar = this.h;
            iVar.i(Long.valueOf((long) iVar.b().a()));
        } else if (action == 2) {
            Integer num = this.a;
            if (num != null) {
                try {
                    float x = motionEvent.getX(motionEvent.findPointerIndex(num.intValue()));
                    float f2 = x - this.b;
                    if (z) {
                        f2 = -f2;
                    }
                    if (f2 == 0.0f) {
                        return true;
                    }
                    this.b = x;
                    float b2 = ((float) this.h.a().b()) + f2;
                    j1c.a.b.C0626a c2 = this.h.c();
                    int i2 = -(c2 != null ? c2.b() : 0);
                    int b3 = anf.b(b2);
                    if (b3 < 0) {
                        i = b3;
                    }
                    if (i2 < i) {
                        i2 = i;
                    }
                    this.c.onNext(new j1c.a.b.C0627b(this.g, -i2));
                } catch (IllegalArgumentException unused) {
                    return true;
                }
            }
        } else if (action == 1 || action == 3) {
            this.a = null;
            this.e.onNext(this.h.b());
        }
        return true;
    }

    @Override // defpackage.n1c
    public void reset() {
        this.b = 0.0f;
    }
}
