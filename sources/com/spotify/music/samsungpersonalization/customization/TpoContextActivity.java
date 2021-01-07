package com.spotify.music.samsungpersonalization.customization;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.C0707R;
import io.reactivex.disposables.c;
import io.reactivex.functions.g;
import io.reactivex.y;
import io.reactivex.z;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

public final class TpoContextActivity extends ss2 {
    public l G;
    public y H;
    public y I;
    private io.reactivex.disposables.b J;
    private final h K = new h();

    static final class a<T> implements g<List<? extends m60>> {
        final /* synthetic */ TpoContextActivity a;

        a(TpoContextActivity tpoContextActivity) {
            this.a = tpoContextActivity;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(List<? extends m60> list) {
            List<? extends m60> list2 = list;
            TpoContextActivity tpoContextActivity = this.a;
            h.d(list2, "tpoContextList");
            TpoContextActivity.U0(tpoContextActivity, list2);
        }
    }

    static final class b<T> implements g<Throwable> {
        final /* synthetic */ TpoContextActivity a;

        b(TpoContextActivity tpoContextActivity) {
            this.a = tpoContextActivity;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            Throwable th2 = th;
            h.e(th2, AppProtocol.LogMessage.SEVERITY_ERROR);
            TpoContextActivity.U0(this.a, EmptyList.a);
            Logger.m(th2, "Failed to fetch tpo events", new Object[0]);
        }
    }

    public TpoContextActivity() {
        io.reactivex.disposables.b a2 = c.a();
        h.d(a2, "Disposables.empty()");
        this.J = a2;
    }

    public static final void U0(TpoContextActivity tpoContextActivity, List list) {
        tpoContextActivity.K.X(list);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        dagger.android.a.a(this);
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_tpo_context);
        RecyclerView recyclerView = (RecyclerView) findViewById(C0707R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setAdapter(this.K);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onDestroy() {
        this.J.dispose();
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStart() {
        super.onStart();
        l lVar = this.G;
        if (lVar != null) {
            z<List<m60>> b2 = ((m) lVar).b();
            y yVar = this.I;
            if (yVar != null) {
                z<List<m60>> H2 = b2.H(yVar);
                y yVar2 = this.H;
                if (yVar2 != null) {
                    io.reactivex.disposables.b subscribe = H2.B(yVar2).subscribe(new a(this), new b(this));
                    h.d(subscribe, "tpoContextFetcher.fetchT…          }\n            )");
                    this.J = subscribe;
                    return;
                }
                h.k("mainScheduler");
                throw null;
            }
            h.k("ioScheduler");
            throw null;
        }
        h.k("tpoContextFetcher");
        throw null;
    }
}
