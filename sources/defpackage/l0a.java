package defpackage;

import com.spotify.music.libs.assistedcuration.model.e;
import defpackage.b1a;
import defpackage.f1a;
import io.reactivex.functions.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: l0a  reason: default package */
public final /* synthetic */ class l0a implements l {
    public final /* synthetic */ String a;
    public final /* synthetic */ b1a.b b;
    public final /* synthetic */ List c;

    public /* synthetic */ l0a(String str, b1a.b bVar, List list) {
        this.a = str;
        this.b = bVar;
        this.c = list;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        String str = this.a;
        b1a.b bVar = this.b;
        List<String> list = this.c;
        Map map = (Map) obj;
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            arrayList.add(map.get(str2));
        }
        f1a.b bVar2 = new f1a.b();
        bVar2.d(str);
        bVar2.b(bVar.a());
        bVar2.c(e.e(arrayList));
        return bVar2.a();
    }
}
