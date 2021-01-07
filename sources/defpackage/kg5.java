package defpackage;

import com.google.common.collect.Collections2;
import com.spotify.playlist.models.j;
import defpackage.mg5;
import io.reactivex.functions.c;
import io.reactivex.functions.h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: kg5  reason: default package */
public class kg5 implements c<b91, ng5, b91> {
    private final ig5 a;
    private final h<List<com.spotify.playlist.models.a>, List<j>, Boolean, List<mg5>> b = new a(this);

    /* renamed from: kg5$a */
    class a implements h<List<com.spotify.playlist.models.a>, List<j>, Boolean, List<mg5>> {
        private int a;
        private int b;

        a(kg5 kg5) {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // io.reactivex.functions.h
        public List<mg5> a(List<com.spotify.playlist.models.a> list, List<j> list2, Boolean bool) {
            List<com.spotify.playlist.models.a> list3 = list;
            List<j> list4 = list2;
            this.a = 0;
            this.b = 0;
            ArrayList newArrayListWithCapacity = Collections2.newArrayListWithCapacity(20);
            if (bool.booleanValue()) {
                newArrayListWithCapacity.add(new mg5.b());
            }
            while (true) {
                if ((b(list3) || d(list4)) && c(newArrayListWithCapacity)) {
                    if (b(list3) && d(list4)) {
                        j jVar = list4.get(this.b);
                        com.spotify.playlist.models.a aVar = list3.get(this.a);
                        if (jVar.b() >= aVar.b()) {
                            newArrayListWithCapacity.add(new mg5.c(jVar));
                            this.b++;
                        } else {
                            newArrayListWithCapacity.add(new mg5.a(aVar));
                            this.a++;
                        }
                    } else if (d(list4)) {
                        while (d(list4) && c(newArrayListWithCapacity)) {
                            int i = this.b;
                            this.b = i + 1;
                            newArrayListWithCapacity.add(new mg5.c(list4.get(i)));
                        }
                    } else {
                        while (b(list3) && c(newArrayListWithCapacity)) {
                            int i2 = this.a;
                            this.a = i2 + 1;
                            newArrayListWithCapacity.add(new mg5.a(list3.get(i2)));
                        }
                    }
                }
            }
            return newArrayListWithCapacity;
        }

        /* access modifiers changed from: package-private */
        public boolean b(List<com.spotify.playlist.models.a> list) {
            return this.a < list.size();
        }

        /* access modifiers changed from: package-private */
        public boolean c(List<mg5> list) {
            return list.size() < 20;
        }

        /* access modifiers changed from: package-private */
        public boolean d(List<j> list) {
            return this.b < list.size();
        }
    }

    public kg5(ig5 ig5) {
        this.a = ig5;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b8  */
    @Override // io.reactivex.functions.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.b91 a(defpackage.b91 r10, defpackage.ng5 r11) {
        /*
            r9 = this;
            b91 r10 = (defpackage.b91) r10
            ng5 r11 = (defpackage.ng5) r11
            boolean r0 = r11.d()
            io.reactivex.functions.h<java.util.List<com.spotify.playlist.models.a>, java.util.List<com.spotify.playlist.models.j>, java.lang.Boolean, java.util.List<mg5>> r1 = r9.b
            com.spotify.music.libs.collection.model.d r2 = r11.a()
            java.util.List r2 = r2.getItems()
            com.spotify.playlist.models.f r3 = r11.e()
            java.util.List r3 = r3.getItems()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object r0 = r1.a(r2, r3, r0)
            java.util.List r0 = (java.util.List) r0
            com.spotify.playlist.models.i r11 = r11.c()
            java.util.List r11 = r11.getItems()
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 4
            r1.<init>(r2)
            java.util.List r2 = r10.body()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x003d
            goto L_0x0062
        L_0x003d:
            java.util.List r10 = r10.body()
            java.util.Iterator r10 = r10.iterator()
        L_0x0045:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x0062
            java.lang.Object r2 = r10.next()
            s81 r2 = (defpackage.s81) r2
            p81 r2 = r2.logging()
            java.lang.String r3 = "ubi:pageReason"
            java.lang.String r2 = r2.string(r3)
            boolean r3 = com.google.common.base.MoreObjects.isNullOrEmpty(r2)
            if (r3 != 0) goto L_0x0045
            goto L_0x0064
        L_0x0062:
            java.lang.String r2 = "homeview|static"
        L_0x0064:
            boolean r10 = r0.isEmpty()
            r3 = 0
            if (r10 != 0) goto L_0x00b2
            java.util.ArrayList r10 = new java.util.ArrayList
            int r4 = r0.size()
            r10.<init>(r4)
            r4 = 0
        L_0x0075:
            int r5 = r0.size()
            if (r4 >= r5) goto L_0x0096
            java.lang.Object r5 = r0.get(r4)
            mg5 r5 = (defpackage.mg5) r5
            gg5 r6 = new gg5
            r6.<init>(r9, r10, r4, r2)
            eg5 r7 = new eg5
            r7.<init>(r9, r10, r4, r2)
            fg5 r8 = new fg5
            r8.<init>(r9, r10, r4, r2)
            r5.a(r6, r7, r8)
            int r4 = r4 + 1
            goto L_0x0075
        L_0x0096:
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x00b2
            ig5 r0 = r9.a
            r4 = 2132018587(0x7f14059b, float:1.9675485E38)
            s81 r0 = r0.d(r4, r2)
            r1.add(r0)
            ig5 r0 = r9.a
            r4 = 1
            s81 r10 = r0.c(r4, r10, r2)
            r1.add(r10)
        L_0x00b2:
            boolean r10 = r11.isEmpty()
            if (r10 != 0) goto L_0x00f7
            java.util.ArrayList r10 = new java.util.ArrayList
            r0 = 20
            r10.<init>(r0)
            int r4 = r11.size()
            int r0 = java.lang.Math.min(r4, r0)
            r4 = 0
        L_0x00c8:
            if (r4 >= r0) goto L_0x00dc
            ig5 r5 = r9.a
            java.lang.Object r6 = r11.get(r4)
            com.spotify.playlist.models.Episode r6 = (com.spotify.playlist.models.Episode) r6
            s81 r5 = r5.e(r6, r4, r2)
            r10.add(r5)
            int r4 = r4 + 1
            goto L_0x00c8
        L_0x00dc:
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L_0x00f7
            ig5 r11 = r9.a
            r0 = 2132018539(0x7f14056b, float:1.9675388E38)
            s81 r11 = r11.d(r0, r2)
            r1.add(r11)
            ig5 r11 = r9.a
            s81 r10 = r11.c(r3, r10, r2)
            r1.add(r10)
        L_0x00f7:
            b91$a r10 = defpackage.z81.i()
            b91$a r10 = r10.e(r1)
            b91 r10 = r10.g()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kg5.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ Boolean b(List list, int i, String str, mg5.c cVar) {
        return Boolean.valueOf(list.add(this.a.g(cVar.b(), i, str)));
    }

    public /* synthetic */ Boolean c(List list, int i, String str, mg5.a aVar) {
        return Boolean.valueOf(list.add(this.a.b(aVar.b(), i, str)));
    }

    public /* synthetic */ Boolean d(List list, int i, String str, mg5.b bVar) {
        return Boolean.valueOf(list.add(this.a.f(i, str)));
    }
}
