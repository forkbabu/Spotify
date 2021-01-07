package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.pageloader.s0;
import io.reactivex.s;

/* renamed from: d34  reason: default package */
public class d34 implements s0 {
    private final p34 a;
    private final j34 b;
    private final s<b91> c;
    private View f;

    public d34(p34 p34, j34 j34, s<b91> sVar) {
        this.a = p34;
        this.b = j34;
        this.c = sVar;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.f;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        this.f = this.a.a();
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        this.b.d(this.c, this.a);
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        this.b.e();
    }
}
