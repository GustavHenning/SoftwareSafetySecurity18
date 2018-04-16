package tinder;

public class NodeBob {
    public jif.lang.Principal user;
    public int distance;
    public NodeBob next;
    
    public NodeBob tinder$NodeBob$(final jif.lang.Principal user,
                                   final int distance) {
        this.jif$init();
        {
            this.user = user;
            this.distance = distance;
            this.next = null;
        }
        return this;
    }
    
    public void add(final NodeBob node) {
        if (this.next == null) {
            this.next = node;
            return;
        }
        NodeBob n = this.next;
        while (n != null && n.next != null) { n = n.next; }
        if (n == null) { n = node; } else { n.next = node; }
    }
    
    public static NodeBob append(final NodeBob a, final NodeBob b) {
        if (a == null) return b;
        a.add(b);
        return a;
    }
    
    public static final String jlc$CompilerVersion$jif = "3.5.0";
    public static final long jlc$SourceLastModified$jif = 1523889199000L;
    public static final String jlc$ClassType$jif =
      ("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" + "MwAA");
    
    public NodeBob() { super(); }
    
    private void jif$init() {  }
    
    public static final String jlc$CompilerVersion$jl = "2.7.1";
    public static final long jlc$SourceLastModified$jl = 1523889199000L;
    public static final String jlc$ClassType$jl =
      ("H4sIAAAAAAAAALV6Wcw02XVQ//+sXmfG4CWO7Uzs35btjqf2qm4PEGrrruqu" +
       "vauruyskQ+1d1bVvXVXBKBAFO4nkQBgbI2Hz4iCITCIhRTygoPAAcZQoEggR" +
       "eABHCAlQsCAPwAsQqvv7/nX+GeCBlu5S995z7jnnnnPuvX3ud74/ea4qJ6/m" +
       "WdwHcVa/Vve5V72mWGXluXRsVZU+NrzhfG0KvPnXfuLlv/fM5CVz8lKYbmqr" +
       "Dh06S2uvq83JexMvsb2yIl3Xc83JK6nnuRuvDK04HMaBWWpOPlCFQWrVTelV" +
       "mldlcXsZ+IGqyb3yOuf9RmHyXidLq7psnDorq3ryshBZrQU0dRgDQljVrwuT" +
       "5/3Qi92qmPz5yR1h8pwfW8E48EPCfS6AK0ZgcWkfh787HMksfcvx7oM8ewpT" +
       "t5780JMQDzi+tx4HjKAvJF59zB5M9WxqjQ2TD9yQFFtpAGzqMkyDcehzWTPO" +
       "Uk8++rZIx0Ev5pZzsgLvjXrykSfHKTdd46h3XcVyAaknH3xy2BVTV04++sSa" +
       "PbJa35f+xFd/MuXSu1eaXc+JL/Q/NwJ94gkgzfO90ksd7wbwvZ8Xvm596Ne/" +
       "cncyGQd/8InBN2P+/p/7wz/9I5/4je/ejPnBp4yR7chz6jecb9vv/6cfoz83" +
       "f+ZCxot5VoUXVXiM8+uqKrc9r3f5qIsfeoDx0vna/c7f0P7J4ad+2fuDu5N3" +
       "85PnnSxuklGrXnGyJA9jr1x6qVdatefyk3d5qUtf+/nJC2NdCFPvplX2/cqr" +
       "+cmz8bXp+ez6PYrIH1FcRPTsWA9TP7tfz636eK13+WQyeWFMkw+O6Zkxfea2" +
       "/Eg92QKWXwGn+vha5QHHLPGAADgCwdFL01E1gCCsgU3m12er9DaW79X9xnOa" +
       "Mqx7aAZUpfOFKPSBetQ3rwSkzPWozH5tbMr/fyHuLhy973znzijsjz1p+PFo" +
       "JVwWjyBvOG82FPuHv/LGb999oPq3sqgn779B+9ot2smdO1d0f/xiFzfrNkr9" +
       "NFrzaLDv/dzmx1d/9iufHKXV5ednR5ldht57Un0fGj0/1qxRJ99wXvryf/hv" +
       "v/r1L2UPFbme3HuLfb0V8mIfn3yStTJzPHf0Pw/Rf/5V69fe+PUv3bt7Wex3" +
       "jW6ntkbFGG34E0/O8ZidvH7f51zEcVeYvMfPysSKL133HcW762OZnR+2XGX+" +
       "nmv9/X80/u6M6X9d0kWlLg2XcnQs9K06v/pAn/P8Zr0u0n2Co6t/+5Ob/Jv/" +
       "8nf/I3L3Qsl9V/jSIz5z49WvP2J+F2TvvRraKw8XSy89bxz3r7+h/NWvff/L" +
       "P3ZdqXHEp5424b1LfqHTGunLyp/5bvGvvvdvvv3P7z5c3XryfN7YcehcKf/Y" +
       "iOgzD6caLTMevcNISXVvmyaZG/qhZcfeRVP+x0ufhn7tP3315ZvljseWG+GV" +
       "kx/5PyN42P4D1OSnfvsn/vsnrmjuOJed4aE4Hg67cTd/7CFmsiyt/kJH9xf+" +
       "2cf/+m9a3xwd1+gsqnDwrvY/ubI3uXI1va7lZ67555/o+8Il+8Hu2vfBa/vz" +
       "1Vtd7+Kyhz3URRP4zt/4KP2n/uBK9ENdvOD4aPdWQzWsR8wE/uXkv9795PP/" +
       "+O7kBXPy8nX7tNLasOLmsqrmuAFW9G2jMHnfY/2Pb2Y3nvv1B7b2sSft4JFp" +
       "n7SChw5irF9GX+ovPKr4oyBevAjpi2O6SMW9LeFL78v5JX+luzO5VpAryCcu" +
       "2ScfQN+Z3HrhCxR0W04fga4nzzbVeA65fHxgZG30dq9dGBuNP0ydMLfiG1u6" +
       "5MDjRBFjem5M37wt06cQ9cV3JOoCldyWwWNEveiGNzJ7ihqMlCWjYba3O7D3" +
       "lTd/7o9e++qbdx85pnzqLSeFR2FujipXOb/7am/dOMsPv9MsV4jFv//VL/2D" +
       "v/2lL99s4x94fNNl0yb5u//if/7Oa9/4/d96ivd/ZjxQva0gX73o+5j+4W35" +
       "t54iyMU7CvIC9Uu35d98fHXT8bh5nfmR6W+YvjO6neeQ17DXwMv3+maCa/7D" +
       "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" +
       "AEjczNvUSmpC3TGd7tETpPV6BU3ZmUO0");
    public static final String jlc$ClassType$jl$1 =
      ("y3ENuB6Xcpsg8FnIwelu05XgCTtQ2ChhQ1izAbMmqalntD4/eIZRJfaOmzW+" +
       "YLaNv8t4bWcEjZZYe4/iTUSgjtBA+b2Un2xPK0sQQBYSxnS7PjE3+Tw4lObQ" +
       "npkOiqu0RVkAB2kCpecApgcJROqeWTMuut9kXOuqa4YyplZnH6ZViBnT+rQf" +
       "r1QBn8LbwPcBku/2BS2sxTNJXv5C/zO3/8a/co0VPHgvEoX+pUO7/uHePS28" +
       "cf09f/tq4MO35SuPhDceiRdOLjGcj7/dA49r/Obbf/HNb7nyL0F3b4OOdD15" +
       "V53lX4i91osfQfXsiOmHnsAkXh+1PIwf/h3xO7+1/Izzi3cnzzwI/b3lbczj" +
       "QK8/HvB7d+nVTZnqj4X9fuDxwFBxU7kD3TZ899HA0MNAxdtFhS4gv3lb/qMn" +
       "xfYwEHv3yvXdy+fskpFX1Mk7hGuvrz2O9eSlmzcN927fNNx7SJL/OCMvj2n8" +
       "uPOLt+XP/b8xcgH52dvyp9+ekTs3wfQbhbrk7TvwcM2KevKM5bpPDQa1Weg+" +
       "wctLF+jP3kTsnnnXTXn3v7wNL09G0q4C/vQlk7vHWXz/Lab/fFv+2/+rtXrf" +
       "Qz5/+h34/JlL9qV68ryV517qvu0SvXKfmvtlPfnRt76t+OKrRWNVYdFktffZ" +
       "vAzbsfHVi6ReHc35XpiG9Wc/9+pPvvpjP7559Uufe/AQ46nyuFNPXrjF8FAe" +
       "k/tL/hgpl96fzfN34PIX3qHvr1yyL9eTF++TePkeunH6W729PGr4yFve8928" +
       "OnN+5Vsvvfjhb21/7/ri5cHLsOeFyYt+E8ePRvAfqT+fl54fXmd//iaefyOK" +
       "r43rcGMzl6+v508Jk948KOj+NyE97gJnKAAA");
}
