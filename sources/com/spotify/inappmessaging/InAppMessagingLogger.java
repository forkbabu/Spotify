package com.spotify.inappmessaging;

import com.google.protobuf.u;
import com.spotify.messages.InAppMessageBackendRequestErrorEvent;
import com.spotify.messages.InAppMessageDiscardedEvent;
import com.spotify.messages.InAppMessageDismissEvent;
import com.spotify.messages.InAppMessageImpressionEvent;
import com.spotify.messages.InAppMessageInteractionEvent;
import com.spotify.messages.InAppMessagePresentationPerformanceEvent;
import java.util.Set;

public class InAppMessagingLogger {
    private final gl0<u> a;

    public enum DismissType {
        DISMISS_CTA,
        FOOTER_TAP,
        SWIPE
    }

    public InAppMessagingLogger(gl0<u> gl0) {
        this.a = gl0;
    }

    public void a(String str, int i, String str2) {
        InAppMessageBackendRequestErrorEvent.b n = InAppMessageBackendRequestErrorEvent.n();
        n.p("impression_url");
        n.o(i);
        n.n(str);
        n.m(str2);
        this.a.c(n.build());
    }

    public void b(String str, int i, String str2) {
        InAppMessageBackendRequestErrorEvent.b n = InAppMessageBackendRequestErrorEvent.n();
        n.p("interaction_url");
        n.o(i);
        n.n(str);
        n.m(str2);
        this.a.c(n.build());
    }

    public void c(Set<String> set, String str, String str2, FormatType formatType, String str3, TriggerType triggerType) {
        StringBuilder sb = new StringBuilder();
        for (String str4 : set) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(str4);
        }
        String sb2 = sb.toString();
        InAppMessageDiscardedEvent.b p = InAppMessageDiscardedEvent.p();
        p.m(str);
        p.r(str2);
        p.o(sb2);
        p.n(formatType.toString());
        p.p(str3);
        p.q(triggerType.toString());
        this.a.c(p.build());
    }

    public void d(String str, String str2, DismissType dismissType, long j) {
        InAppMessageDismissEvent.b n = InAppMessageDismissEvent.n();
        n.n(str);
        n.p(str2);
        n.o(dismissType.toString());
        n.m(j);
        this.a.c(n.build());
    }

    public void e(String str, FormatType formatType) {
        InAppMessageImpressionEvent.b l = InAppMessageImpressionEvent.l();
        l.n(str);
        l.m(formatType.toString());
        this.a.c(l.build());
    }

    public void f(String str, ActionType actionType) {
        InAppMessageInteractionEvent.b l = InAppMessageInteractionEvent.l();
        l.n(str);
        l.m(actionType.name());
        this.a.c(l.build());
    }

    public void g(String str, long j, FormatType formatType) {
        InAppMessagePresentationPerformanceEvent.b m = InAppMessagePresentationPerformanceEvent.m();
        m.m(str);
        m.n(String.valueOf(j));
        m.o(formatType.toString());
        this.a.c(m.build());
    }
}
