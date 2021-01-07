package defpackage;

import android.view.View;
import com.spotify.libs.connect.model.Tech;
import com.spotify.libs.connect.picker.view.ConnectView;
import com.spotify.libs.connect.picker.view.e;
import java.util.EnumSet;

/* renamed from: qw7  reason: default package */
public class qw7 implements e {
    private final ConnectView a;
    private final uba b;

    public qw7(uba uba, ConnectView connectView) {
        this.a = connectView;
        connectView.setPressable(true);
        this.b = uba;
    }

    @Override // com.spotify.libs.connect.picker.view.e
    public void a(EnumSet<Tech> enumSet) {
        this.a.setVisibility(0);
        this.a.e();
    }

    @Override // com.spotify.libs.connect.picker.view.e
    public void b(e.a aVar) {
        this.a.setOnClickListener(new pw7(this, aVar));
    }

    @Override // com.spotify.libs.connect.picker.view.e
    public void c(Tech tech) {
        this.a.setVisibility(0);
        this.a.setIsConnecting(tech);
    }

    @Override // com.spotify.libs.connect.picker.view.e
    public void d() {
        this.a.setVisibility(0);
        this.a.f();
    }

    @Override // com.spotify.libs.connect.picker.view.e
    public void e() {
        this.a.setVisibility(8);
    }

    @Override // com.spotify.libs.connect.picker.view.e
    public void f(Tech tech, String str) {
        this.a.setVisibility(0);
        this.a.g(tech, str);
    }

    public /* synthetic */ void g(e.a aVar, View view) {
        aVar.a();
        this.b.b();
    }
}
