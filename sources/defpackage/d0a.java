package defpackage;

import com.spotify.music.libs.assistedcuration.model.e;
import defpackage.d1a;
import defpackage.z0a;
import io.reactivex.functions.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: d0a  reason: default package */
public final /* synthetic */ class d0a implements l {
    public final /* synthetic */ String a;
    public final /* synthetic */ z0a.b b;
    public final /* synthetic */ List c;

    public /* synthetic */ d0a(String str, z0a.b bVar, List list) {
        this.a = str;
        this.b = bVar;
        this.c = list;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        String str = this.a;
        z0a.b bVar = this.b;
        List<String> list = this.c;
        Map map = (Map) obj;
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            arrayList.add(map.get(str2));
        }
        d1a.b bVar2 = new d1a.b();
        bVar2.d(str);
        bVar2.b(bVar.a());
        bVar2.c(e.e(arrayList));
        return bVar2.a();
    }
}
