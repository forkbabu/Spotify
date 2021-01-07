package com.spotify.music.libs.podcast.presentationcommons.description.step.html;

import android.text.Editable;
import java.util.Stack;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.text.Regex;
import org.xml.sax.XMLReader;

public final class PodcastHtmlDescriptionCustomTagHandler implements d {
    private String a = "";
    private final Stack<a> b = new Stack<>();

    public static abstract class a {

        /* renamed from: com.spotify.music.libs.podcast.presentationcommons.description.step.html.PodcastHtmlDescriptionCustomTagHandler$a$a  reason: collision with other inner class name */
        public static final class C0298a extends a {
            public static final C0298a a = new C0298a();

            private C0298a() {
                super(null);
            }
        }

        public static final class b extends a {
            private final int a;

            public b(int i) {
                super(null);
                this.a = i;
            }

            public final int a() {
                return this.a;
            }
        }

        public static final class c extends a {
            public static final c a = new c();

            private c() {
                super(null);
            }
        }

        public static final class d extends a {
            public d() {
                super(null);
            }
        }

        private a() {
        }

        public a(f fVar) {
        }
    }

    private final void b(boolean z, a aVar, Editable editable) {
        if (z) {
            this.a = this.b.isEmpty() ? this.a : je.I0(new StringBuilder(), this.a, "\t");
            this.b.push(aVar);
            return;
        }
        if (this.a.length() > 0) {
            String str = this.a;
            CharSequence subSequence = str.subSequence(0, str.length() - 1);
            if (subSequence != null) {
                this.a = (String) subSequence;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        while (true) {
            a peek = this.b.peek();
            if (!(!this.b.empty() && ((peek instanceof a.b) || (peek instanceof a.d)))) {
                break;
            }
            this.b.pop();
        }
        this.b.pop();
        if (this.b.empty()) {
            editable.append('\n');
        }
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: [(r1v1 int), ('.' char)] */
    private final void c(boolean z, Editable editable) {
        if (z) {
            if (e(editable)) {
                editable.append('\n');
            }
            editable.append((CharSequence) this.a);
            a peek = this.b.peek();
            int i = 1;
            if (peek instanceof a.b) {
                this.b.pop();
                i = 1 + ((a.b) peek).a();
            }
            this.b.push(new a.b(i));
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append('.');
            editable.append((CharSequence) sb.toString());
            editable.append(" ");
        }
    }

    private final void d(boolean z, Editable editable) {
        if (z) {
            if (e(editable)) {
                editable.append('\n');
                if (this.b.peek() instanceof a.d) {
                    this.b.pop();
                }
            }
            editable.append((CharSequence) this.a);
            editable.append("•");
            editable.append(" ");
            this.b.push(new a.d());
        }
    }

    private final boolean e(CharSequence charSequence) {
        a peek = this.b.peek();
        if (!(charSequence.length() > 0 && charSequence.charAt(charSequence.length() - 1) != '\n')) {
            return false;
        }
        if (this.b.size() > 1 || ((!h.a(peek, a.C0298a.a)) && (!h.a(peek, a.c.a)))) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.music.libs.podcast.presentationcommons.description.step.html.d
    public String a(CharSequence charSequence) {
        h.e(charSequence, "original");
        return new Regex("<(/)*(ul|li|ol)>").b(charSequence, PodcastHtmlDescriptionCustomTagHandler$replaceTagsWithCustomTags$1.a);
    }

    @Override // android.text.Html.TagHandler
    public void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        if (editable != null && str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 1611508057) {
                if (hashCode != 1611508153) {
                    if (hashCode == 1611508339 && str.equals("custom-ul")) {
                        b(z, a.c.a, editable);
                    }
                } else if (str.equals("custom-ol")) {
                    b(z, a.C0298a.a, editable);
                }
            } else if (str.equals("custom-li")) {
                a peek = this.b.peek();
                if (peek instanceof a.d) {
                    d(z, editable);
                } else if (peek instanceof a.c) {
                    d(z, editable);
                } else if (peek instanceof a.C0298a) {
                    c(z, editable);
                } else if (peek instanceof a.b) {
                    c(z, editable);
                }
            }
        }
    }
}
