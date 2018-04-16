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
    public static final long jlc$SourceLastModified$jif = 1523891133000L;
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
    public static final long jlc$SourceLastModified$jl = 1523891133000L;
    public static final String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALV6WdD02HVQ//+sXmcBL3Ece2L/NrFlj9TaWspgjFrqbqm1" +
       "dWtptRSSQa1dra21t8KQABVsSJXDMjahivgFU4WNSQpXpXigUpUXIKmkUmwF" +
       "hCpIHqgCKvghD8ALIaj7+/51FuCB/uouusu555x7zrnnfud+9/uTZ6py8kqR" +
       "J+cgyetX63PhVa9u7LLyXDqxq0obG153vg6Ab/6Nn3jxe09NXrAmL0SZWtt1" +
       "5NB5Vnt9bU3en3rpwSsrynU915q8lHmeq3plZCfRMA7MM2vychUFmV03pVcp" +
       "XpUn7WXgy1VTeOV1zfuNwuT9Tp5Vddk4dV5W9eRFIbZbG2zqKAGFqKpfEybP" +
       "+pGXuNVp8mcnd4TJM35iB+PADwv3qQCvEMHlpX0c/t5oRLP0bce7P+XpY5S5" +
       "9eSTT854QPE9fhwwTn0u9eowf7DU05k9NkxevkEpsbMAVOsyyoJx6DN5M65S" +
       "Tz72jkDHQc8XtnO0A+/1evLRJ8dtbrrGUe+5suUypZ586MlhV0h9OfnYE3v2" +
       "yG59X/rjX/vJjM3uXnF2PSe54P/MOOkTT0xSPN8rvczxbia+//PCN+wP/8pX" +
       "704m4+APPTH4Zsw//DO//ye/8Ilf/bWbMT/4NmPkQ+w59evOtw4f/Ocfpz9H" +
       "PnVB4/kir6KLKDxG+XVXN7c9r/XFKIsffgDx0vnq/c5fVf6J+dPf8X7v7uS9" +
       "3ORZJ0+adJSql5w8LaLEK1de5pV27bnc5D1e5tLXfm7y3FgXosy7aZV9v/Jq" +
       "bvJ0cm16Nr9+jyzyRxAXFj091qPMz+/XC7sOr/W+mEwmz41p8uExPTWmP3Zb" +
       "frSeGKDtV+CxDl+tPDDMUw8MwBAMQi/LRtEAg6gG1dyvO7v0VNv36rPqOU0Z" +
       "1ecpAVal88U48sF6lDevBKXc9agkcrxXx8bi/x/o/kLVB7o7d0aGf/xJ5U9G" +
       "TWHzZJz0uvNmM1/8/i++/ht3H4j/LT9GxbwB/OoDwJM7d64A/+hFO252b+T9" +
       "cdTpUW3f/zn1x9d/+qufGnnWF93TI+cuQ+89KcQPVZ8ba/Yoma87L3zlP//3" +
       "X/rGG/lDca4n996iZW+dedGSTz1JXJk7njtaoYfgP/+K/cuv/8ob9+5etvw9" +
       "o/Gp7VE8Rk3+xJNrPKYtr923PBeG3BUm7/PzMrWTS9d9c/HeOizz7mHLlevv" +
       "u9Y/+Ifj786Y/tclXQTr0nApR/NC3wr1Kw+kuihuduzC3Scoulq5L6nFL/zb" +
       "3/ovyN0LJvcN4guPWE7Vq197RAkvwN5/VbeXHm6WVnreOO7f//zmr3/9+1/5" +
       "setOjSM+/XYL3rvkFzztEb+8/JlfO/327/yHb/2ruw93t548WzSHUS6umH98" +
       "BPTZh0uN+pmMNmLEpLqnZ2nuRn5kHxLvIin/84XPTH/5v37txZvtTsaWG+aV" +
       "ky/8nwE8bP+B+eSnf+Mn/scnrmDuOJfz4SE7Hg67MTp/5CFkqizt8wWP/s/9" +
       "ix/6m//U/oXRfI0mo4oG72oFJlfyJleqgOtefvaaf/6Jvi9esh/sr30furY/" +
       "W73VAC8vJ9lDWbTA7/6tj9F/4veuSD+UxQuMj/VvVdWd/YiawN9J/9vdTz37" +
       "j+9OnrMmL14PUTurd3bSXHbVGo/Bir5tFCYfeKz/8SPtxn6/9kDXPv6kHjyy" +
       "7JNa8NBEjPXL6Ev9uUcFf2TE8xcmfXlMF67EtyVy6X2xuOQv9Xcm1wpynfKJ" +
       "S/apB7PvTG5t8WUWfFt+4ZHZ9eTpphq9kcvHyyNpo7179ULYqPxR5kSFndzo" +
       "0iUHH0fqS2N6Zkzfvi3rt0HqR98Vqcus6rZMH0PqeTe64dnbiMGIWToqZnt7" +
       "DntfffMv/+GrX3vz7iPOyqff4i88OufGYbny+b1XfevHVX743Va5zlj+p196" +
       "4x/93Te+cnOYv/z40bvImvTv/+s/+M1Xf/53f/1t7P9To1v1joz87EXex/TP" +
       "bsvvvQ0jl+/KyMusf3Bb/r3Hdzcbnc7ryo8sf0P0ndHsPIO8ir0KXb75mwWu" +
       "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" +
       "4Z18bCvBZvR3aW/JbdgkR/zcXfYHVYL8");
    public static final String jlc$ClassType$jl$1 =
      ("Yb3bO8zRXeRqEC4lLqEchyqJtYxPvUNpN8GhwnwVQ09ZkxIgFS4bw4nxonEx" +
       "4rCZioxgjteDA5wqdXCczZC0r8EeFqswzXfxWlpnVkztQXvJVfDB40Ae0Lp9" +
       "WwwZ2UG0fNruxQY9dDtsn7Dn1UYE8KCGsmWwxYUuggkRZEzvmGUW2K3cGq1V" +
       "M95SFPWlL13+bf6nbv8D/9I1PvDgpUgc+ZcO5fpP9v7tQhrX37O37wU+clu+" +
       "9EhI45EY4eQSt/mhd3racY3ZfOvPv/lNV/4707u3gUa6nrynzosvJl7rJY+A" +
       "enqE9MknIInX5ywPY4bfFr/766vPOn/t7uSpB+G+t7yKeXzSa48H+d5benVT" +
       "Ztpjob4feDwY9FM3lTvb24Z/92gw6GFw4p0iQZcpv31b/ssn2fYw+Hr3SvXd" +
       "yydxyagr6PRdQrTXdx7huKM3LxnuPXjJcO8hUv7jpLw4pvHjzvduy+/8v5Fy" +
       "mfLt2/JvvzMpd25C6Dcidcnbd6Himp3qyVO2675tCKjNI/cJWl64zH51TK+M" +
       "0vjl2/KVd6DlyfjZlcWfuWRy/ziJH7yF9Mnb8uX/q936wEM6/8K70Pkzl+yN" +
       "evKsXRRe5r7jFr10H5v7ZT358ltfVPzoK6fGrqJTk9fejxRl1I6Nr1w49cqo" +
       "0PeiLKp/5HOv/OQrP/bj6itvfO7B84u35cedevLcLYSH/Jjc3/LHULn0/qWi" +
       "eBcqf+5d+v7qJftKPXn+PoqX76Ef9f+B5F4eM3z0La/5bt6cOb/4zRee/8g3" +
       "9X9zfeny4F3Ys8Lkeb9Jkkcj94/Uny1Kz4+u6z97E8e/YcbXx5240ZvL1zeK" +
       "twmP3jwk6P83z6922WUoAAA=");
}
