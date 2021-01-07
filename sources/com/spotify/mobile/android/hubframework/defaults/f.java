package com.spotify.mobile.android.hubframework.defaults;

import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueSectionHeader;
import defpackage.s81;

@Deprecated
public class f implements a61 {
    private static boolean b(s81 s81) {
        return (s81.text().title() == null && s81.text().subtitle() == null && s81.text().description() == null) ? false : true;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x00a0: APUT  
      (r3v4 s81[])
      (0 ??[int, short, byte, char])
      (wrap: s81 : 0x009c: INVOKE  (r4v7 s81) = 
      (wrap: s81$a : 0x0098: INVOKE  (r4v6 s81$a) = 
      (wrap: s81$a : 0x0078: INVOKE  (r4v5 s81$a) = (r7v1 s81$a), (r4v4 java.lang.String) type: VIRTUAL call: s81.a.s(java.lang.String):s81$a)
      (wrap: w81$a : 0x0094: INVOKE  (r6v2 w81$a) = 
      (wrap: w81$a : 0x008c: INVOKE  (r7v4 w81$a) = 
      (wrap: w81$a : 0x0084: INVOKE  (r7v3 w81$a) = 
      (wrap: w81$a : 0x007c: INVOKE  (r7v2 w81$a) =  type: STATIC call: z81.h():w81$a)
      (wrap: java.lang.String : 0x0080: INVOKE  (r8v1 java.lang.String) = (r6v0 w81) type: INTERFACE call: w81.title():java.lang.String)
     type: INTERFACE call: w81.a.a(java.lang.String):w81$a)
      (wrap: java.lang.String : 0x0088: INVOKE  (r8v2 java.lang.String) = (r6v0 w81) type: INTERFACE call: w81.subtitle():java.lang.String)
     type: INTERFACE call: w81.a.d(java.lang.String):w81$a)
      (wrap: java.lang.String : 0x0090: INVOKE  (r6v1 java.lang.String) = (r6v0 w81) type: INTERFACE call: w81.description():java.lang.String)
     type: INTERFACE call: w81.a.c(java.lang.String):w81$a)
     type: VIRTUAL call: s81.a.y(w81$a):s81$a)
     type: VIRTUAL call: s81.a.l():s81)
     */
    @Override // defpackage.a61
    public s81 a(s81 s81) {
        String str;
        String str2;
        if (!je.B(s81, HubsGlueComponent.CAROUSEL.id())) {
            return s81;
        }
        if (!(s81.images().background() != null) && !b(s81)) {
            return s81;
        }
        String id = s81.id();
        x81 background = s81.images().background();
        s81.a n = z81.c().n(HubsGlueComponent.BACKGROUND);
        if (id == null) {
            str = null;
        } else {
            str = je.x0(id, "-container");
        }
        s81.a t = n.s(str).t(z81.f().a(background));
        if (b(s81)) {
            s81[] s81Arr = new s81[1];
            String id2 = s81.id();
            w81 text = s81.text();
            s81.a n2 = z81.c().n(HubsGlueSectionHeader.SECTION_HEADER);
            if (id2 == null) {
                str2 = null;
            } else {
                str2 = je.x0(id2, "-header");
            }
            s81Arr[0] = n2.s(str2).y(z81.h().a(text.title()).d(text.subtitle()).c(text.description())).l();
            t = t.b(s81Arr);
        }
        return t.b(s81.toBuilder().z(null).u(null).l()).l();
    }
}
