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
    public static final long jlc$SourceLastModified$jif = 1523894074000L;
    public static final String jlc$ClassType$jif =
      ("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" +
       "IL2/v3sP1jWx1Xqr+6O2PStts3/unAP2v0rCPBPnY7ugulbUNN3iHNEiFUjK" +
       "s+fiqc/pZmKqXybQe+lVtbtbrv3Ra1FGAOP5haZOzLQTojijvtW87725U6hW" +
       "D5Gw6z9Zc+e++587di1di0YQ55WtWCngH3o6Zgl54BliYjKPjgZRMRlCxl2c" +
       "HjfWrjmLmTKcuDBFDgCK1AOY49eXWucqLDKwIW2zO1cGOte7l2twQIugILkO" +
       "1Q3AfH5HOWPyOuvg2AeeL//BnlU2fJYjfFZy0yXKYvwU1+mK5o63RbqlJDG3" +
       "tfp4grqzIqy73VWfNXpV8+n9neiSonbibkhYSxjt2THj7GTIgpIOtJQ2dE1m" +
       "yzSkwoSAz5n2hd956Mlzv2tYiaToyT/YUgZONR73lVD3QdngrCwwlmo2lvL3" +
       "Hzr86e29i6NAlvldopqVyTjK3H7rs3Ci2X10X+UVe8/eg/jLi67+HuL8kqxO" +
       "ELercs8b//y9XZvsYMwPCcYwom0KP/WNskj2WLYDLh56R9543Wcf09VU79b4" +
       "E51BDiOSYohwqmPf4DBoohYw+Q00v96hkkqwPIdRyF9Z/Wd+ed9ChjbbHZpj" +
       "pfr6HDnzaKLqWGuRtp8dO7HqXPNofsdopzenwSPZd+TBwj/P/+whnJ1DpjM4" +
       "MnUEBiRUKJcYAO95/lwJjNibM+crlKfePn2e0RGfZWESK64e87MPJkzcgZAg" +
       "m+J8pEEcxFaDbjBa/M2bHd/PA99fx2jc3n18zvs+FVA2jPDv4CwsBAurmYUx" +
       "rC7iLWhBZUjq/djIheF0Mzl0uDiNVSdO/rxw4688OEXwkbB2Y0cPFN3c7HaW" +
       "DQ4jq3XL0tMepCyb8U5HzedvPGOn0zepEiI/xx8zTtK39Mz96cS+d3dtsHXc" +
       "auA8c0wVVNthkanwHVESuiSq7ra86d6X31p44IM9CPZ81Xtq4I/anKR6WH05" +
       "8UnP64xUuc6ePUqLdPXj6f+OTi/4ZVQoJCcgXKpFzboJWIpQS7MwXMnUssaE" +
       "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");
    
    public NodeAlice() { super(); }
    
    private void jif$init() {  }
    
    public static final String jlc$CompilerVersion$jl = "2.7.1";
    public static final long jlc$SourceLastModified$jl = 1523894074000L;
    public static final String jlc$ClassType$jl =
      ("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" +
       "wzv52FaCzejv0t6S27BJjvi5u+wPqgT5");
    public static final String jlc$ClassType$jl$1 =
      ("w3q3d5iju8jVIFxKXEI5DlUSaxmfeofSboJDhfkqhp6yJiVAKlw2hhPjReNi" +
       "xGEzFRnBHK8HBzhV6uA4myFpX4M9LFZhmu/itbTOrJjag/aSq+CDx4E8oHX7" +
       "thgysoNo+bTdiw166HbYPmHPq40I4EENZctgiwtdBBMiyJjeMcsssFu5NVqr" +
       "ZrylKOpLX7r82/xP3P4H/qVrfODBS5E48i8dyvWf7P1bhTSuv2dv3wt86LZ8" +
       "6ZGQxiMxwsklbvOxt3vacY3ZfPvPvvEtV/6b07u3gUa6nryrzosvJF7rJY+A" +
       "enqE9IknIInX5ywPY4bfEb/3G6vPOH/57uSpB+G+N72KeXzSa48H+d5denVT" +
       "Ztpjob4fejwY9FM3lTvb24Z/+2gw6GFw4u0iQZcpv31b/osn2fYw+Hr3SvXd" +
       "yydxyagr6PQdQrTXdx7huKM3LxnuPXjJcO8hUv7jpLw4pvHjzvdvy+/+v5Fy" +
       "mfKd2/JvvD0pd25C6Dcidcnbd6Dimp3qyVO2675lCKjNI/cJWl64zH51TK+M" +
       "0vjl2/KVt6HlyfjZlcWfvmRy/ziJ77+F9Inb8uX/q91630M6/9w70Pkzl+wr" +
       "9eRZuyi8zH3bLXrpPjb3y3ry5Te/qPjiK6fGrqJTk9fejxZl1I6Nr1w49cqo" +
       "0PeiLKp/9LOv/OQrP/bj6itf+eyD5xdvyY879eS5WwgP+TG5v+WPoXLp/QtF" +
       "8Q5U/tw79P2lS/bVevL8fRQv30M/6v8Dyb08Zvjwm17z3bw5c37pWy88/6Fv" +
       "6f/6+tLlwbuwZ4XJ836TJI9G7h+pP1uUnh9d13/2Jo5/w4xvjDtxozeXr28W" +
       "bxEevXlI0P9vBV2W/2UoAAA=");
}
