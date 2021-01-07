package defpackage;

import com.spotify.music.features.listeninghistory.datasource.ListeningHistoryDataSource;
import com.spotify.music.features.listeninghistory.datasource.d;
import com.spotify.pageloader.resource.LoadableResource;
import com.spotify.rxjava2.p;
import io.reactivex.functions.g;
import java.util.HashMap;
import kotlin.jvm.internal.h;

/* renamed from: rm5  reason: default package */
public final class rm5 extends LoadableResource implements qm5 {
    private HashMap<ListeningHistoryDataSource.HistoryType, b91> c = new HashMap<>();
    private final p d = new p();
    private final ListeningHistoryDataSource e;
    private final d f;

    /* renamed from: rm5$a */
    static final class a<T> implements g<b91> {
        final /* synthetic */ rm5 a;

        a(rm5 rm5) {
            this.a = rm5;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(b91 b91) {
            b91 b912 = b91;
            HashMap hashMap = this.a.c;
            ListeningHistoryDataSource.HistoryType filter = this.a.f.getFilter();
            h.d(b912, "it");
            hashMap.put(filter, b912);
            this.a.e();
        }
    }

    /* renamed from: rm5$b */
    static final class b<T> implements g<Throwable> {
        final /* synthetic */ rm5 a;

        b(rm5 rm5) {
            this.a = rm5;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            Throwable th2 = th;
            rm5 rm5 = this.a;
            h.d(th2, "it");
            rm5.d(th2);
        }
    }

    public rm5(ListeningHistoryDataSource listeningHistoryDataSource, d dVar) {
        h.e(listeningHistoryDataSource, "dataSource");
        h.e(dVar, "properties");
        this.e = listeningHistoryDataSource;
        this.f = dVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.pageloader.resource.LoadableResource
    public void a() {
        this.d.b(this.e.a(null, this.f.getFilter()).subscribe(new a(this), new b(this)));
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.pageloader.resource.LoadableResource
    public void b() {
        this.d.a();
    }

    @Override // defpackage.qm5
    public b91 c() {
        return this.c.get(this.f.getFilter());
    }
}
