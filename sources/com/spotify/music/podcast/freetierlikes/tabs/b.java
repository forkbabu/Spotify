package com.spotify.music.podcast.freetierlikes.tabs;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.podcast.freetierlikes.tabs.c;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;

/* access modifiers changed from: package-private */
public final class b extends c {
    private final YourLibraryPageId a;
    private final String b;
    private final String c;
    private final CharSequence d;
    private final String e;
    private final ImmutableList<LinkType> f;

    /* access modifiers changed from: package-private */
    /* renamed from: com.spotify.music.podcast.freetierlikes.tabs.b$b  reason: collision with other inner class name */
    public static final class C0325b implements c.a {
        private YourLibraryPageId a;
        private String b;
        private String c;
        private CharSequence d;
        private String e;
        private ImmutableList<LinkType> f;

        C0325b() {
        }

        public c.a a(ImmutableList<LinkType> immutableList) {
            if (immutableList != null) {
                this.f = immutableList;
                return this;
            }
            throw new NullPointerException("Null acceptLinkTypes");
        }

        public c b() {
            String str = this.a == null ? " id" : "";
            if (this.b == null) {
                str = je.x0(str, " title");
            }
            if (this.c == null) {
                str = je.x0(str, " emptyTitle");
            }
            if (this.d == null) {
                str = je.x0(str, " emptySubtitle");
            }
            if (this.e == null) {
                str = je.x0(str, " emptyActionText");
            }
            if (this.f == null) {
                str = je.x0(str, " acceptLinkTypes");
            }
            if (str.isEmpty()) {
                return new b(this.a, this.b, this.c, this.d, this.e, this.f, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public c.a c(String str) {
            if (str != null) {
                this.e = str;
                return this;
            }
            throw new NullPointerException("Null emptyActionText");
        }

        public c.a d(CharSequence charSequence) {
            if (charSequence != null) {
                this.d = charSequence;
                return this;
            }
            throw new NullPointerException("Null emptySubtitle");
        }

        public c.a e(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null emptyTitle");
        }

        public c.a f(YourLibraryPageId yourLibraryPageId) {
            this.a = yourLibraryPageId;
            return this;
        }

        public c.a g(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }
    }

    b(YourLibraryPageId yourLibraryPageId, String str, String str2, CharSequence charSequence, String str3, ImmutableList immutableList, a aVar) {
        this.a = yourLibraryPageId;
        this.b = str;
        this.c = str2;
        this.d = charSequence;
        this.e = str3;
        this.f = immutableList;
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.c
    public ImmutableList<LinkType> a() {
        return this.f;
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.c
    public String c() {
        return this.e;
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.c
    public CharSequence d() {
        return this.d;
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.c
    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.a.equals(cVar.f()) || !this.b.equals(cVar.g()) || !this.c.equals(cVar.e()) || !this.d.equals(cVar.d()) || !this.e.equals(cVar.c()) || !this.f.equals(cVar.a())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.c
    public YourLibraryPageId f() {
        return this.a;
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.c
    public String g() {
        return this.b;
    }

    public int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("PodcastPage{id=");
        V0.append(this.a);
        V0.append(", title=");
        V0.append(this.b);
        V0.append(", emptyTitle=");
        V0.append(this.c);
        V0.append(", emptySubtitle=");
        V0.append((Object) this.d);
        V0.append(", emptyActionText=");
        V0.append(this.e);
        V0.append(", acceptLinkTypes=");
        V0.append(this.f);
        V0.append("}");
        return V0.toString();
    }
}
