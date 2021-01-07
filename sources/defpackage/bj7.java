package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.ubi.specification.factories.c3;
import io.reactivex.disposables.b;
import io.reactivex.s;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* renamed from: bj7  reason: default package */
public class bj7 {
    private final s<RecyclerView> a;
    private final y b;
    private final String c;
    private final InteractionLogger d;
    private final c3 e;
    private final ere f;
    private b g;

    public bj7(InteractionLogger interactionLogger, y yVar, String str, s<RecyclerView> sVar, c3 c3Var, ere ere) {
        this.d = interactionLogger;
        this.a = sVar;
        this.e = c3Var;
        this.f = ere;
        this.b = yVar;
        this.c = str;
    }

    public /* synthetic */ void a(RecyclerView recyclerView) {
        String d2 = PageIdentifiers.PREMIUM_DESTINATION.d();
        int round = Math.round((((float) recyclerView.computeVerticalScrollOffset()) * 100.0f) / ((float) (recyclerView.computeVerticalScrollRange() - recyclerView.computeVerticalScrollExtent())));
        this.d.a(null, d2, round, InteractionLogger.InteractionType.SCROLL, this.c);
        this.f.a(this.e.b(Integer.valueOf(round)).a());
    }

    public void b() {
        b bVar = this.g;
        if (bVar != null && !bVar.d()) {
            this.g.dispose();
        }
        this.g = this.a.z(100, TimeUnit.MILLISECONDS, this.b).subscribe(new vi7(this));
    }

    public void c() {
        b bVar = this.g;
        if (bVar != null && !bVar.d()) {
            this.g.dispose();
        }
    }
}
