package tinder;

public class NodeChuck {
    public jif.lang.Principal user;
    public int distance;
    public NodeChuck next;
    
    public NodeChuck tinder$NodeChuck$(final jif.lang.Principal user,
                                       final int distance) {
        this.jif$init();
        {
            this.user = user;
            this.distance = distance;
            this.next = null;
        }
        return this;
    }
    
    public void add(final NodeChuck node) {
        if (this.next == null) {
            this.next = node;
            return;
        }
        NodeChuck n = this.next;
        while (n != null && n.next != null) { n = n.next; }
        if (n == null) { n = node; } else { n.next = node; }
    }
    
    public static NodeChuck append(final NodeChuck a, final NodeChuck b) {
        if (a == null) return b;
        a.add(b);
        return a;
    }
    
    public static final String jlc$CompilerVersion$jif = "3.5.0";
    public static final long jlc$SourceLastModified$jif = 1524054768000L;
    public static final String jlc$ClassType$jif =
      ("H4sIAAAAAAAAAK1aC3QV1bne55AHQSThHSDACUQQkBzxgbWRhxxEgkdJSdAa" +
       "CsfJnH2SIXNmJjNzkhMsrd67WrzVsu7igsBSudWlrQ8q9t5aWVWsq48LQttl" +
       "e22hDx+rj3ttbRRt721dvda7/3/veU9imjZrnb0ne/b/7//x/f+/98wcHSKV" +
       "lknm7lQKzfagQa3mTUqhTTItmm/T1cEONpST33vwu/lDtxqvJUlVJxmvWFs1" +
       "SyrQLKmRSnaPbir2oE3qsjulfildshU1nVUsuyVLLpB1zbJNSdFsq498iiSy" +
       "pE5hI5JmK5JN8xtMvWiTxqzBFupWdTtNy3bakEypmEZR0m0ZVbIsxqkKRx0m" +
       "4w1T71fy1LTJ/CwTXMxWpS6qptvEvSz811I2ScphL/TjyiFnrt2BZen9B3fU" +
       "/ds4UttJahWt3ZZsRc7oms3k6SQTi7TYRU3r2nye5jvJZI3SfDs1FUlVdrGJ" +
       "utZJplhKtybZJZNaW6ilq/0wcYpVMpiIsKYzmCUTuUlKsq2bjjpVBYWqeee/" +
       "yoIqdVs2meGZhau3AcaZLSYwc1KzIMnUIanoVbQ82CJE4erYdAObwEiri5T5" +
       "y12qQpPYAJnCPadKWne63TYVrZtNrdRLNhh49rBMW8ARktwrddOcTerD89r4" +
       "LTarBg0BJDaZHp6GnJiXZoe85PPP0E3X7L1d26glUeY8lVWQfzwjmhci2kIL" +
       "1KSaTDnhxKXZe6UZJ+5KEsImTw9N5nOe+eQ7ay+Z98IpPmdOzJzNXTupbOfk" +
       "h7sm/aAhs+TqcRyCuqWA8wOaI/jbxJ2WssECa4bLEW42Ozdf2PIft97xOH0z" +
       "SSa0kipZV0tFhqPJsl40FJWa11ONmhAiraSGavkM3m8l1ew6q2iUj24uFCxq" +
       "t5IKFYeqdPyfmajAWICJqtm1ohV059qQ7B68LhuEkGr2IzPZbxz7XSz6eps0" +
       "WKa8HKOKgYaa6Zv0PM30lOTeZjZo2OSWtFSw0r12T7NF0z16kaa70z3p7h6q" +
       "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");
    
    public NodeChuck() { super(); }
    
    private void jif$init() {  }
    
    public static final String jlc$CompilerVersion$jl = "2.7.1";
    public static final long jlc$SourceLastModified$jl = 1524054768000L;
    public static final String jlc$ClassType$jl =
      ("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" +
       "s/LaUIaHW5vrlv7/Y+UMsrxuf+L9Wbl1");
    public static final String jlc$ClassType$jl$1 =
      ("lWq9Mqlz3T2Di0tVNqPnLNd9aqqgy0P3CV5ePUPfH8rdQWL/9rr93vvw8mSe" +
       "5SLiz56rzfFxFj98jekfXrff/X/S1odu+Pzzz+Dz58/VO83ojlUUXua+r4pe" +
       "f0DNg7YZ/fh7M+8/erdsrTos27zxPl9UYTcM3j1L6u7g0PfCLGw+/4W7P3P3" +
       "yz+l3H3nCw/T9E+Vx61m9OI1hht5jB6o/DFSzrN/sSieweUvPmPur5yrrzaj" +
       "lx6QeH7uj4P/P7Tcc9L74+/5dOvqAyPn17/16ksf+9b2X1++iHj4EdAdbvSS" +
       "3ybJoxneR/p3isrzw8v+d67yvVfC+MagiSu/OT99s3hKGu0q4Xz8P6t8grFS" + "JgAA");
}
