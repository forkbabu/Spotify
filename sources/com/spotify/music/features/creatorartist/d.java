package com.spotify.music.features.creatorartist;

import com.spotify.base.java.logging.Logger;
import com.spotify.ubi.specification.factories.r;

public class d {
    private final jz1 a;
    private final r b;
    private final ere c;

    public d(jz1 jz1, ere ere, String str) {
        this.a = jz1;
        this.c = ere;
        this.b = new r(str);
    }

    public void a() {
        this.c.a(this.b.a().a());
    }

    public void b() {
        this.c.a(this.b.a().a());
    }

    public void c() {
        this.c.a(this.b.d().b());
    }

    public void d(String str, int i) {
        this.a.a(new r91(str, (long) i, "gallery", null, "swipe"));
        this.c.a(this.b.c().b(Integer.valueOf(i)).a());
    }

    public void e() {
        this.c.a(this.b.c().c());
    }

    public void f(String str, String str2) {
        this.a.a(new q91(str, str2));
    }

    public void g() {
        this.c.a(this.b.e().b());
    }

    public void h(String str) {
        this.a.a(new r91(str, 0, "about", null, "screenshot"));
    }

    public void i(String str, String str2, String str3) {
        this.a.a(new r91(str, 0, str2, str3, "click"));
        str2.hashCode();
        char c2 = 65535;
        switch (str2.hashCode()) {
            case -950564799:
                if (str2.equals("social-facebook-link")) {
                    c2 = 0;
                    break;
                }
                break;
            case 340981653:
                if (str2.equals("social-instagram-link")) {
                    c2 = 1;
                    break;
                }
                break;
            case 783287728:
                if (str2.equals("social-wikipedia-link")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1645149556:
                if (str2.equals("social-twitter-link")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.c.a(this.b.d().a(str3));
                return;
            case 1:
                this.c.a(this.b.e().a(str3));
                return;
            case 2:
                this.c.a(this.b.g().a(str3));
                return;
            case 3:
                this.c.a(this.b.f().a(str3));
                return;
            default:
                Logger.n("No UBI interaction event defined for Click on sectionId: %s", str2);
                return;
        }
    }

    public void j() {
        this.c.a(this.b.f().b());
    }

    public void k() {
        this.c.a(this.b.g().b());
    }
}
