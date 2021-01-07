package defpackage;

import android.view.View;
import com.spotify.libs.connect.model.Tech;
import com.spotify.libs.connect.picker.view.ConnectView;
import com.spotify.libs.connect.picker.view.e;
import java.util.EnumSet;

/* renamed from: orb  reason: default package */
public class orb implements e {
    private final ConnectView a;
    private final uba b;

    public orb(uba uba, ConnectView connectView) {
        this.a = connectView;
        connectView.setPressable(true);
        connectView.c();
        this.b = uba;
    }

    @Override // com.spotify.libs.connect.picker.view.e
    public void a(EnumSet<Tech> enumSet) {
        this.a.setVisibility(0);
        this.a.e();
        this.a.b();
    }

    @Override // com.spotify.libs.connect.picker.view.e
    public void b(e.a aVar) {
        this.a.setOnClickListener(new irb(this, aVar));
    }

    @Override // com.spotify.libs.connect.picker.view.e
    public void c(Tech tech) {
        this.a.setVisibility(0);
        this.a.setIsConnecting(tech);
        this.a.h();
    }

    @Override // com.spotify.libs.connect.picker.view.e
    public void d() {
        this.a.setVisibility(0);
        this.a.f();
        this.a.b();
    }

    @Override // com.spotify.libs.connect.picker.view.e
    public void e() {
        this.a.setVisibility(8);
    }

    @Override // com.spotify.libs.connect.picker.view.e
    public void f(Tech tech, String str) {
        this.a.setVisibility(0);
        this.a.g(tech, str);
        this.a.h();
    }

    public /* synthetic */ void g(e.a aVar, View view) {
        aVar.a();
        this.b.b();
    }
}
