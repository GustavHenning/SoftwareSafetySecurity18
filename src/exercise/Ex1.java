package exercise;

public class Ex1 {
    public static void main(final String[] args) {
        int aliceAccount = 1000;
        int bobAccount = 800;
        int sharedCost = 100;
        int totalTransaction = 0;
        if (aliceAccount >= sharedCost) {
            aliceAccount -= sharedCost;
            totalTransaction += sharedCost;
        }
        if (bobAccount >= sharedCost) {
            bobAccount -= sharedCost;
            totalTransaction += sharedCost;
        }
        return;
    }
    
    public Ex1 exercise$Ex1$() {
        this.jif$init();
        {  }
        return this;
    }
    
    public static final String jlc$CompilerVersion$jif = "3.5.0";
    public static final long jlc$SourceLastModified$jif = 1523445078000L;
    public static final String jlc$ClassType$jif =
      ("H4sIAAAAAAAAALVZDXAU1R1/d+TbQCDyEQTCGYIYlJyggjZQgQASepJMEqjG" +
       "6rnZe3fZZG932X2XXEAc0FEUbTpFUJgRRmZwRi0F2+LY8XscFRR1qnUq2vFj" +
       "aGe0I9hibS3TWvv/v7dft3tQddqb2be7b9////6fv/d/7/afJKWWSab1K+lm" +
       "NmxQq3mVku6QTIumOnR1uBu6kvLpva+ldl5nfBglZT2kQrHWaJaUpglSKeVY" +
       "n24qbJiRsYl+aVCK55iixhOKxVoS5BxZ1yxmSorGrHXkFhJJkLEK9EgaUyRG" +
       "UytMPcvI+QkDJsqoOovTPIsbkill41yUeEerKlkWcCrjvQ6TCsPUB5UUNRmZ" +
       "ngDB7dGq1EvVeIf9LYFvLXmTxBz2tn5COc5ZaLfjovj2+28c+8tRpKaH1Cha" +
       "F5OYIrfqGgN5ekh1lmZ7qWktSaVoqoeM0yhNdVFTkVRlPQzUtR5SaykZTWI5" +
       "k1qd1NLVQRxYa+UMEBHndDoTpFqYJCcz3XTUKUsrVE05b6VpVcpYjEz0zCLU" +
       "W4H9YIsqMCc105JMHZKSAUVLoS0CFK6OjT+AAUBanqXgL3eqEk2CDlIrPKdK" +
       "WibexUxFy8DQUj3H0MDnnZFpCzpCkgekDE0yUhcc1yE+wahKbggkYWRCcBjn" +
       "BF46L+Aln39Orl44skFbqUW5zCkqqyh/BRDVB4g6aZqaVJOpIKyenbhPmvjM" +
       "nVFCYPCEwGAx5ombTy2+uP75I2LMlCJj2nv7qcyS8r7eMW9ObW26cpQIQd1S" +
       "0PkFmvPg77C/tOQNSKyJLkf82Ox8fL7z5es2PUo/jZKqNlIm62ouC3E0Ttaz" +
       "hqJS82qqURNTpI1UUi3Vyr+3kXJ4TigaFb3t6bRFWRspUXlXmc7fwURpYIEm" +
       "KodnRUvrzrMhsT7+nDcIIeVwkbFwlcCVtu83MNIVl9JWfID1NVs03qdnaTwT" +
       "74tn+qimQWjEMwqLd+lpNiSZtAtQgA13UTmHGDD3irhlynMwIWmemrIC9Mvz" +
       "c5uhw/j/sM2jNmOHIhEw9NRgmquQISt1FaAgKW/PLV1+6kDyaNQNe9sOjFQ7" +
       "TJuBKYlEOLPxmBHCY2DvAchcQLTqpq4bVt10Z8MoCBVjCK2FQxsKkLPVS+82" +
       "jnQyxNhvrzJuGrl8ysIoKe0BBLSW0bSUU1lH61I9pwFSjHe7OimAiMahqyh8" +
       "lhsyp2FkUgj4BOABmekxQbIpENeNwewqJmbNlk/+fvC+jbqXZ4w0htI/TInp" +
       "2xC0vqnLNAWA6LGfHZMeTz6zsTFKSgATQDcGmiHE1AfnKEjjFgcSUZdSUC+t" +
       "m1lJxU+OVapYn6kPeT08LMZgUysiBD0aEJCj6aIuY/exN/50aZREPeCt8S1k" +
       "XZS1+JIdmdXwtB7nBUi3SSmMe39nx707Tm65nkcHjJhRbMJGbFshyWE5Awve" +
       "fmTdux9+sO/tqBdRDNa6XK+qyHmuy7iv4ReB6994YcZiB94Bt1tttIi5cGHg" +
       "zBd4sgFwqABeILrVuEbL6iklrUi9KsVw/lfNzLmPnxgZK9ytQo8wnkku/u8M" +
       "vP7JS8mmozd+Wc/ZRGRcuDz7ecMEGp7rcV5imtIwypHf/Na0XYel3YCrgGWW" +
       "sp5yeCLcHoQ78BJui4t4Gw98m4dNDLI2+BGmm+LlJs8RWPsVURgk5YmfN8SN" +
       "Fcs+4r6vgnBMQ72jyFDJTA2lVqv7FfML19+MM3haaHCb9xkzY1JQBnv+khti" +
       "qc9jDdfzdDgnRS3ZVAwnyACtqywla6hgbpriWQx1AtNXgfncoseUNEsFr4vM" +
       "7+Yfl+cNE5fcQcnkfuJWachjwLpidGAtlZQX3L3F1GdsnR+1DTlGBByYDi/e" +
       "oCEzzh2/nmtgOz4P5V5KIFbMkGOqAzXfw7jnEzmyeRb35EvKuyfc/3Ttz7Yt" +
       "EYvu9EKK0OiFl7TekbzsF6/zLMEoqg+atJNKAPPC5kn58z3v0c7LT38mslof" +
       "0oKFogE1jqwYEhaL9hPWmCbngnosAanqQrFjs5//4wcPnvygYzEPeJ+XsBII" +
       "FaN2GLiAJB6XFa4brjzN3brhipSUb5z4m4umPn3dXX4zBQh8o0ceeaD8zxef" +
       "fpCr7cbKjECsuARnjRdsrxTyckApcJBfSL+fJk14/+0jgys/E+IG46AYxVXz" +
       "xj/7Sd3kDbZnccLl9qx4ayvq7B9CUeA5O9aceOG58s5Xfc7mHgQTDPGBwp/Y" +
       "LvUc0A6MZxaz51KdMT3rs+qiGe/1t3z15iEnS1a4VmkqVDBA6VezbPZTk0d+" +
       "v6nd4bFKqNrhU7VTdF2GTVOeZ9la3rPIQggJVCMrJasPlpxj6js9O96fXS8M" +
       "7luS7O9PLrt9x32/fuIyUbBUY7l31WJCBDoi88ViOmyv90RqKhCpSNdqj+wm" +
       "z2lNrtPCXeJe5yAzvpyPzUwXc/ivzMaaH9n3tT7MKeQAO9YzbRj4Zmffrdv3" +
       "pNofmitMU1tYhC/Xctmf/+6r15p3fvRKkYqwkunGHJUOUtU3ZyS0Sb6G76W8" +
       "+mbB3mWNU19YN/K/q/Js3C9W0E0PaB8U5pFr9r9y9QXytigZ5dZyof1hIVGL" +
       "3w6AbGJWtCj2VHF317v+qkE/1MFVAddx+/6uf40QlRd3NW8bsZnFjRnFxwuh" +
       "1LH4Vjvvco0g1zE2t2P2/WgwCrxCIOL6xrfMckPRlNjfPfTw/gMt1Y88xPGh" +
       "kiMIrH/MNm0FUjjvQsXRrjCTUZgGW4gT9v0PfhVh3vOC8LTEzNgr/MOjXzp6" +
       "sm7FEb7CR2UFi4VQNZ2iZ7J/zoBdsz8OooMKFicBFmslXyGOIxdgswGW6G4c" +
       "mdVNo0+x1+iYno6J8jkmmZlclmoMHyzsF0cDsSwEYuzCXpyWpmJSrz5IY73D" +
       "sQ3Ht+47fse2jU2Gi5wu8rVKmqaz0LJdJiuPn4ynv3JQ7/sCGHh9Y4rowMY6" +
       "g0vxfViowp9vFs/YbuLmv/Xb8QvvENdoAxosGCJOus7Zn7vtmTnHHGlHC/zi" +
       "z1vPUn6OYLOOkRI0HD7fQ0ixUjS0jNmz27EyPn5id/s/jj/mTL9AaGUvipvF" +
       "7aeBTpgVvSdWjsKwnWWH66liYcvIOKd6A/pYrxNj99srDrbXnnG92MkFfMBD" +
       "+Z1h4C/sWu2R7fXWlJ3hZcbrAm8VgG1ClyXVg7fuew6/M3/XJ9s4epeqfmQM" +
       "ngkFKNV96uHEF8NviIUhGBK+ZErK8x7N/i3aUPZSlJQDoHOYljS2VlJzuN/r" +
       "IVWK1Wp3Jsjogu+Fh2riBKnFd3h1S2BT60/8ElYAuWOEYSKEO+/R4oAK28bS" +
       "tKJJKidpcgKjAJ64rHzXJSL+8KV1O7bc++UkQMYeUm7rwrVarWv8pcixnI/+" +
       "L/s//PSt0dMOcHgr6ZUsIXTwPDN8XFlwCskFrvbluT/nvaAeTezIrgRlZ9n3" +
       "KQCHlpKZY5lyPHiEaZ86XSGOmvppKj6kmwNxLIZTsOnkD2ejhSSp85IElI6h" +
       "ht5W51ffKFcOcfWe9CL8UDjoD4VrK0H23LcgmwA7Ml7/oRrNQg3DMGwc9WMn" +
       "Ni8L/MT2NmwO8Oz34utg2B9cZ2xe5Gz5++1nwcVXOS5i8xMrnJRQJmcVpgza" +
       "B7X0zu1bv24e2R71nWbPCB0o+2nEibYfqWGW8882C6dY8fHBjU89vHGLA7P9" +
       "kCmDupIqdnzAA9BbXBYKQy8yPO8CFHuQZ4ZR0AyjoOD1rudGM+xZtwvbtZDZ" +
       "mMuzvpuL8mdx0XHPRdi8/k2MgM0fv1HoC4KPv5uBTnwLA0Gmjlqen4trRl3o" +
       "rx7x94R8YE9NxaQ9a94RWOWgcCUUgOmcqvrB1/dcZpg0rXB5KgUUG/z2V0Yq" +
       "nENjfP+iWAoKzM+T8ManuDNOF9awuL/Iib+/AGnnzV327JELDtsba1dJmmfN" +
       "/I8xZxPgUhzcs2r1hlPzRdVbKqvS+vU4SQWAr6j/bPD150yQm8OrbGXTP8c8" +
       "VjnTPSfCxjlYDWnn26FND52g+P+aS8oDZOPdL26p3cwXoErF6jZzFsM/ySpl" +
       "Zy9XeKaC5+vuv0+iTDL4XjkShelmBQ8cfJP569JI/672RPnX17p1adFAjnD9" +
       "/gPUj6ehHh0AAA==");
    
    public Ex1() { super(); }
    
    public void jif$invokeDefConstructor() { this.exercise$Ex1$(); }
    
    private void jif$init() {  }
    
    public static final String jlc$CompilerVersion$jl = "2.7.1";
    public static final long jlc$SourceLastModified$jl = 1523445078000L;
    public static final String jlc$ClassType$jl =
      ("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" +
       "H2koODOQ9vdH41dI/Z/UMcr/A882aP/YIAAA");
}
