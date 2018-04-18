package tinder;

public class NodeAlice {
    public jif.lang.Principal user;
    public int distance;
    public NodeAlice next;
    
    public NodeAlice tinder$NodeAlice$(final jif.lang.Principal user,
                                       final int distance) {
        this.jif$init();
        {
            this.user = user;
            this.distance = distance;
            this.next = null;
        }
        return this;
    }
    
    public void add(final NodeAlice node) {
        if (this.next == null) {
            this.next = node;
            return;
        }
        NodeAlice n = this.next;
        while (n != null && n.next != null) { n = n.next; }
        if (n == null) { n = node; } else { n.next = node; }
    }
    
    public static NodeAlice append(final NodeAlice a, final NodeAlice b) {
        if (a == null) return b;
        a.add(b);
        return a;
    }
    
    public static final String jlc$CompilerVersion$jif = "3.5.0";
    public static final long jlc$SourceLastModified$jif = 1524054143000L;
    public static final String jlc$ClassType$jif =
      ("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");
    
    public NodeAlice() { super(); }
    
    private void jif$init() {  }
    
    public static final String jlc$CompilerVersion$jl = "2.7.1";
    public static final long jlc$SourceLastModified$jl = 1524054143000L;
    public static final String jlc$ClassType$jl =
      ("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" +
       "IOU+TsprQxn+3OKuW/L/j5TzltV1++X3");
    public static final String jlc$ClassType$jl$1 =
      ("J+XWVar1SqXOdf0MKi7VqRw9Z9j2U1MFg1naT9Dy6nn3/aHcHTj2767bf/w+" +
       "tDyZZ7mw+LPnim8fJ/HD15B+9br93v+TtD50Q+dffAadP3Wu3ilHd4wscxL7" +
       "fUX0+gNsHrTl6Mvvzbz/6N0hGB+eB6u0dH4ky/16GLx75tTdwaDv+Ylf/sjn" +
       "7/7E3a/8mHz3nc8/TNM/lR+3ytGL1xBu+DF6IPLHUDnP/uUsewaVP/uMub9y" +
       "rr5Wjl56gOL5f98O9v9Qc89J74+/59Otqw+MrO99+9WXPvZt5d9cvoh4+BHQ" +
       "HXb0kltF0aMZ3kf6d7Lccf3L+Xeu8r1XzPjmIIkruzn/+1b2lDTaVcK5/T/d" +
       "j3W6UiYAAA==");
}
